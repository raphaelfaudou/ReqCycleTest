/*******************************************************************************
 *  Copyright (c) 2013 AtoS
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html *
 *  Contributors:
 *    Anass Radouani (AtoS) - initial API and implementation and/or initial documentation
 *   
 *******************************************************************************/
package org.polarsys.reqcycle.repository.ui.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.inject.Inject;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.polarsys.reqcycle.core.ILogger;
import org.polarsys.reqcycle.repository.data.RequirementSourceConf.RequirementSource;
import org.polarsys.reqcycle.repository.data.util.DataUtil;
import org.polarsys.reqcycle.repository.ui.views.RequirementView;
import org.polarsys.reqcycle.utils.inject.ZigguratInject;

public class OpenRequirementViewAction extends Action {

	@Inject
	ILogger logger = ZigguratInject.make(ILogger.class);

	private TreeViewer viewer;

	public OpenRequirementViewAction(TreeViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void run() {
		ISelection selection = viewer.getSelection();
		if(selection instanceof IStructuredSelection) {

			Collection<Object> selectedObj = new ArrayList<Object>();
			for(Iterator<?> iterator = ((IStructuredSelection)selection).iterator(); iterator.hasNext();) {
				selectedObj.add(iterator.next());
			}

			Collection<RequirementSource> input = new ArrayList<RequirementSource>();
			for(Iterator<Object> iterator = selectedObj.iterator(); iterator.hasNext();) {
				Object obj = iterator.next();
				input.addAll(DataUtil.getRepositories(obj));
			}

			if(!input.isEmpty()) {
				try {
					//					Collection<IPredicate> selectedPredicates = PredicatesUIHelper.openPredicatesChooser(null, "Requirement filtering", "Select a predicate to apply or press OK to continue without filtering.", true);
					//					if(selectedPredicates != null) {
					RequirementView.openNewRequirementView(input, null);
					//					}
				} catch (Exception e) {
					e.printStackTrace();
					logger.error("Unable to open the View of filtered requirements : " + e.getMessage());
					logger.error(e.toString());
				}
			}
		}
	}

}
