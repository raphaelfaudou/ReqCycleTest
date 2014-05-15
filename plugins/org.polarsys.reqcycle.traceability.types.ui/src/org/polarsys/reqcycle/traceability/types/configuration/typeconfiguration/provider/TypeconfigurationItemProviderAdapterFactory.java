/*******************************************************************************
 *  Copyright (c) 2013 AtoS
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html *
 *  Contributors:
 *    Tristan Faure (AtoS) - initial API and implementation and/or initial documentation
 *******************************************************************************/
/**
 */
package org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.util.TypeconfigurationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeconfigurationItemProviderAdapterFactory extends TypeconfigurationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeconfigurationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.TypeConfigContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConfigContainerItemProvider typeConfigContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.TypeConfigContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeConfigContainerAdapter() {
		if (typeConfigContainerItemProvider == null) {
			typeConfigContainerItemProvider = new TypeConfigContainerItemProvider(this);
		}

		return typeConfigContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Relation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationItemProvider relationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationAdapter() {
		if (relationItemProvider == null) {
			relationItemProvider = new RelationItemProvider(this);
		}

		return relationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Configuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemProvider configurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationAdapter() {
		if (configurationItemProvider == null) {
			configurationItemProvider = new ConfigurationItemProvider(this);
		}

		return configurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.CustomType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTypeItemProvider customTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.CustomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomTypeAdapter() {
		if (customTypeItemProvider == null) {
			customTypeItemProvider = new CustomTypeItemProvider(this);
		}

		return customTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryItemProvider entryItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryAdapter() {
		if (entryItemProvider == null) {
			entryItemProvider = new EntryItemProvider(this);
		}

		return entryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.RegisteredAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredAttributeItemProvider registeredAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.RegisteredAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisteredAttributeAdapter() {
		if (registeredAttributeItemProvider == null) {
			registeredAttributeItemProvider = new RegisteredAttributeItemProvider(this);
		}

		return registeredAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.StdAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdAttributeItemProvider stdAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.StdAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStdAttributeAdapter() {
		if (stdAttributeItemProvider == null) {
			stdAttributeItemProvider = new StdAttributeItemProvider(this);
		}

		return stdAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.RelationsPredicatesMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationsPredicatesMappingItemProvider relationsPredicatesMappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.RelationsPredicatesMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationsPredicatesMappingAdapter() {
		if (relationsPredicatesMappingItemProvider == null) {
			relationsPredicatesMappingItemProvider = new RelationsPredicatesMappingItemProvider(this);
		}

		return relationsPredicatesMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.DecorationPredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecorationPredicateItemProvider decorationPredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.reqcycle.traceability.types.configuration.typeconfiguration.DecorationPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecorationPredicateAdapter() {
		if (decorationPredicateItemProvider == null) {
			decorationPredicateItemProvider = new DecorationPredicateItemProvider(this);
		}

		return decorationPredicateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (typeConfigContainerItemProvider != null) typeConfigContainerItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (relationItemProvider != null) relationItemProvider.dispose();
		if (configurationItemProvider != null) configurationItemProvider.dispose();
		if (customTypeItemProvider != null) customTypeItemProvider.dispose();
		if (entryItemProvider != null) entryItemProvider.dispose();
		if (registeredAttributeItemProvider != null) registeredAttributeItemProvider.dispose();
		if (stdAttributeItemProvider != null) stdAttributeItemProvider.dispose();
		if (relationsPredicatesMappingItemProvider != null) relationsPredicatesMappingItemProvider.dispose();
		if (decorationPredicateItemProvider != null) decorationPredicateItemProvider.dispose();
	}

}
