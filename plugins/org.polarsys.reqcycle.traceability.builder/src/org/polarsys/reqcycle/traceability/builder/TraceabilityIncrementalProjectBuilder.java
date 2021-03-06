/*******************************************************************************
 *  Copyright (c) 2013 AtoS
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html *
 *  Contributors:
 *    Tristan Faure (AtoS) - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.polarsys.reqcycle.traceability.builder;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.reqcycle.traceability.builder.exceptions.BuilderException;
import org.polarsys.reqcycle.traceability.builder.impl.ResourceDeltaBuilderVisitor;
import org.polarsys.reqcycle.utils.inject.ZigguratInject;

public class TraceabilityIncrementalProjectBuilder extends
		IncrementalProjectBuilder {

	private boolean clean = false;

	@Override
	protected IProject[] build(int kind, Map<String, String> args,
			IProgressMonitor monitor) throws CoreException {
		try {
			IResourceDelta delta = getDelta(getProject());
			ResourceDeltaBuilderVisitor visitor = new ResourceDeltaBuilderVisitor(
					monitor, clean);
			ZigguratInject.inject(visitor);
			if (delta != null) {
				delta.accept(visitor);
			} else if (kind == FULL_BUILD) {
				getProject().accept(visitor);
			}
			visitor.build();
			monitor.done();
		} catch (BuilderException e) {
			e.printStackTrace();
		} catch (RuntimeException e2) {
			e2.printStackTrace();
		} finally {
			clean = false;
		}
		return null;
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		clean = true;
	}

}
