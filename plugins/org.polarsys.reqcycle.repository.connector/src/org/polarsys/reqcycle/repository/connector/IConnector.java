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
package org.polarsys.reqcycle.repository.connector;

import java.util.concurrent.Callable;

import org.polarsys.reqcycle.repository.data.RequirementSourceConf.RequirementSource;

/**
 *
 */
public interface IConnector {

	/**
	 * Initializes the connector with an already existing requirement source.
	 */
	public void initializeWithRequirementSource(
			RequirementSource requirementSource);

	/**
	 * Callable that will create the new requirement source repository
	 * 
	 * @return new requirement source repository (not null)
	 */
	public Callable<RequirementSource> createRequirementSource();

}
