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
package org.polarsys.reqcycle.repository.connector.local;

import java.util.concurrent.Callable;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.polarsys.reqcycle.repository.connector.local.ui.LocalSettingPage;
import org.polarsys.reqcycle.repository.connector.ui.wizard.IConnectorWizard;
import org.polarsys.reqcycle.repository.data.IDataManager;
import org.polarsys.reqcycle.repository.data.RequirementSourceConf.RequirementSource;
import org.polarsys.reqcycle.repository.data.RequirementSourceData.RequirementsContainer;
import org.polarsys.reqcycle.repository.data.ScopeConf.Scope;
import org.polarsys.reqcycle.repository.data.types.IDataModel;
import org.polarsys.reqcycle.repository.data.util.IRequirementSourceProperties;

public class LocalConnector extends Wizard implements IConnectorWizard {

	public final static String LOCAL_CONNECTOR_ID = "org.polarsys.reqcycle.repository.connector.local.connectorCore";

	@Inject
	IDataManager manager;

	private LocalSettingPage localSettingPage;

	private IDataModel dataModel;

	private Scope scope;

	private String destination;

	public LocalConnector() {
	}

	@Override
	public void initializeWithRequirementSource(
			RequirementSource requirementSource) {
	}

	@Override
	public Callable<RequirementSource> createRequirementSource() {
		return new Callable<RequirementSource>() {

			@Override
			public RequirementSource call() throws Exception {
				RequirementSource source = manager.createRequirementSource();
				RequirementsContainer rc = manager
						.createRequirementsContainer(URI
								.createPlatformResourceURI(destination, true));
				source.setContents(rc);
				source.setDataModelURI(dataModel.getDataModelURI());
				source.setDefaultScope(scope);
				source.setProperty(IRequirementSourceProperties.IS_LOCAL,
						"true");
				return source;
			}
		};
	}

	@Override
	public void init(ISelection selection) {
		// Don't need to init
	}

	@Override
	public boolean performFinish() {
		if (localSettingPage == null) {
			return false;
		}
		dataModel = localSettingPage.bean.getDataModel();
		scope = localSettingPage.bean.getScope();
		destination = localSettingPage.bean.getDestination();
		return true;
	}

	@Override
	public void addPages() {
		localSettingPage = new LocalSettingPage("Setting Page");
		addPage(localSettingPage);
	}

}
