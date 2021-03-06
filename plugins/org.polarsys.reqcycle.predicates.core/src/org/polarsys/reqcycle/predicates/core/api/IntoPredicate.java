/*******************************************************************************
 *  Copyright (c) 2013 AtoS
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html *
 *  Contributors:
 *    Papa Issa Diakhate (AtoS) - initial API and implementation and/or initial documentation
 *   
 *******************************************************************************/
/**
 */
package org.polarsys.reqcycle.predicates.core.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Into Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.reqcycle.predicates.core.api.IntoPredicate#getInput <em>Input</em>}</li>
 *   <li>{@link org.polarsys.reqcycle.predicates.core.api.IntoPredicate#getAllowedEntries <em>Allowed Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.reqcycle.predicates.core.PredicatesPackage#getIntoPredicate()
 * @model abstract="true"
 * @generated
 */
public interface IntoPredicate<T> extends IPredicate {

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(Object)
	 * @see org.polarsys.reqcycle.predicates.core.PredicatesPackage#getIntoPredicate_Input()
	 * @model
	 * @generated
	 */
	T getInput();

	/**
	 * Sets the value of the '{@link org.polarsys.reqcycle.predicates.core.api.IntoPredicate#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(T value);

	/**
	 * Returns the value of the '<em><b>Allowed Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Entries</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Entries</em>' attribute list.
	 * @see org.polarsys.reqcycle.predicates.core.PredicatesPackage#getIntoPredicate_AllowedEntries()
	 * @model
	 * @generated
	 */
	EList<T> getAllowedEntries();

} // IntoPredicate
