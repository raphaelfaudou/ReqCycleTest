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
 * A representation of the model object '<em><b>Composite Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.reqcycle.predicates.core.api.CompositePredicate#getPredicates <em>Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.reqcycle.predicates.core.PredicatesPackage#getCompositePredicate()
 * @model abstract="true"
 * @generated
 */
public interface CompositePredicate extends IPredicate {

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.reqcycle.predicates.core.api.IPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see org.polarsys.reqcycle.predicates.core.PredicatesPackage#getCompositePredicate_Predicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPredicate> getPredicates();

} // CompositePredicate
