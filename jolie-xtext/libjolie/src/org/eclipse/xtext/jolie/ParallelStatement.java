/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.jolie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.jolie.ParallelStatement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.jolie.JoliePackage#getParallelStatement()
 * @model
 * @generated
 */
public interface ParallelStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jolie.SequenceStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.xtext.jolie.JoliePackage#getParallelStatement_Children()
   * @model containment="true"
   * @generated
   */
  EList<SequenceStatement> getChildren();

} // ParallelStatement
