/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Port#getInputPortStatement <em>Input Port Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Port#getOutputPortStatement <em>Output Port Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Input Port Statement</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.InputPortStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Port Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Port Statement</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getPort_InputPortStatement()
   * @model containment="true"
   * @generated
   */
  EList<InputPortStatement> getInputPortStatement();

  /**
   * Returns the value of the '<em><b>Output Port Statement</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.OutputPortStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Port Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Port Statement</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getPort_OutputPortStatement()
   * @model containment="true"
   * @generated
   */
  EList<OutputPortStatement> getOutputPortStatement();

} // Port
