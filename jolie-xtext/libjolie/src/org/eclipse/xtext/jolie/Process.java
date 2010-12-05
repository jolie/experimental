/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.jolie;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.jolie.Process#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xtext.jolie.Process#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.jolie.JoliePackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jolie.ParallelStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.xtext.jolie.JoliePackage#getProcess_Children()
   * @model containment="true"
   * @generated
   */
  EList<ParallelStatement> getChildren();

  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference.
   * @see #setProcess(Process)
   * @see org.xtext.jolie.JoliePackage#getProcess_Process()
   * @model containment="true"
   * @generated
   */
  Process getProcess();

  /**
   * Sets the value of the '{@link org.xtext.jolie.Process#getProcess <em>Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' containment reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(Process value);

} // Process
