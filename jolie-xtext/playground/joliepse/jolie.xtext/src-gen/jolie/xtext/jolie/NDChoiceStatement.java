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
 * A representation of the model object '<em><b>ND Choice Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.NDChoiceStatement#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.NDChoiceStatement#getInputOperation <em>Input Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.NDChoiceStatement#getMainProcess <em>Main Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getNDChoiceStatement()
 * @model
 * @generated
 */
public interface NDChoiceStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Path</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.VariablePath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Path</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getNDChoiceStatement_VariablePath()
   * @model containment="true"
   * @generated
   */
  EList<VariablePath> getVariablePath();

  /**
   * Returns the value of the '<em><b>Input Operation</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.InputOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Operation</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getNDChoiceStatement_InputOperation()
   * @model containment="true"
   * @generated
   */
  EList<InputOperation> getInputOperation();

  /**
   * Returns the value of the '<em><b>Main Process</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.MainProcess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Process</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getNDChoiceStatement_MainProcess()
   * @model containment="true"
   * @generated
   */
  EList<MainProcess> getMainProcess();

} // NDChoiceStatement
