/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Install Funciton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.InstallFunciton#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InstallFunciton#getProcess <em>Process</em>}</li>
 *   <li>{@link jolie.xtext.jolie.InstallFunciton#getParallelStatement <em>Parallel Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getInstallFunciton()
 * @model
 * @generated
 */
public interface InstallFunciton extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see jolie.xtext.jolie.JoliePackage#getInstallFunciton_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Process}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInstallFunciton_Process()
   * @model containment="true"
   * @generated
   */
  EList<jolie.xtext.jolie.Process> getProcess();

  /**
   * Returns the value of the '<em><b>Parallel Statement</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.ParallelStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parallel Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parallel Statement</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getInstallFunciton_ParallelStatement()
   * @model containment="true"
   * @generated
   */
  EList<ParallelStatement> getParallelStatement();

} // InstallFunciton
