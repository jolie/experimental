/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.RightSide#getExpression <em>Expression</em>}</li>
 *   <li>{@link jolie.xtext.jolie.RightSide#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.RightSide#getInputOperation <em>Input Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.RightSide#getOutputOperation <em>Output Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getRightSide()
 * @model
 * @generated
 */
public interface RightSide extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see jolie.xtext.jolie.JoliePackage#getRightSide_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.RightSide#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Path</em>' containment reference.
   * @see #setVariablePath(VariablePath)
   * @see jolie.xtext.jolie.JoliePackage#getRightSide_VariablePath()
   * @model containment="true"
   * @generated
   */
  VariablePath getVariablePath();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.RightSide#getVariablePath <em>Variable Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Path</em>' containment reference.
   * @see #getVariablePath()
   * @generated
   */
  void setVariablePath(VariablePath value);

  /**
   * Returns the value of the '<em><b>Input Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Operation</em>' containment reference.
   * @see #setInputOperation(InputOperation)
   * @see jolie.xtext.jolie.JoliePackage#getRightSide_InputOperation()
   * @model containment="true"
   * @generated
   */
  InputOperation getInputOperation();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.RightSide#getInputOperation <em>Input Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Operation</em>' containment reference.
   * @see #getInputOperation()
   * @generated
   */
  void setInputOperation(InputOperation value);

  /**
   * Returns the value of the '<em><b>Output Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Operation</em>' containment reference.
   * @see #setOutputOperation(OutputOperation)
   * @see jolie.xtext.jolie.JoliePackage#getRightSide_OutputOperation()
   * @model containment="true"
   * @generated
   */
  OutputOperation getOutputOperation();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.RightSide#getOutputOperation <em>Output Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Operation</em>' containment reference.
   * @see #getOutputOperation()
   * @generated
   */
  void setOutputOperation(OutputOperation value);

} // RightSide
