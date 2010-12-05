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
 * A representation of the model object '<em><b>Sequence Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.jolie.SequenceStatement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.jolie.JoliePackage#getSequenceStatement()
 * @model
 * @generated
 */
public interface SequenceStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jolie.BasicStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.xtext.jolie.JoliePackage#getSequenceStatement_Children()
   * @model containment="true"
   * @generated
   */
  EList<BasicStatement> getChildren();

} // SequenceStatement
