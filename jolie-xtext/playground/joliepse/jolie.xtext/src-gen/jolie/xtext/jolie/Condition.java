/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Condition#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Condition#getRightCondition <em>Right Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
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
   * @see jolie.xtext.jolie.JoliePackage#getCondition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Condition#getExpression <em>Expression</em>}' containment reference.
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
   * @see jolie.xtext.jolie.JoliePackage#getCondition_VariablePath()
   * @model containment="true"
   * @generated
   */
  VariablePath getVariablePath();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Condition#getVariablePath <em>Variable Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Path</em>' containment reference.
   * @see #getVariablePath()
   * @generated
   */
  void setVariablePath(VariablePath value);

  /**
   * Returns the value of the '<em><b>Right Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Condition</em>' containment reference.
   * @see #setRightCondition(RightCondition)
   * @see jolie.xtext.jolie.JoliePackage#getCondition_RightCondition()
   * @model containment="true"
   * @generated
   */
  RightCondition getRightCondition();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Condition#getRightCondition <em>Right Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Condition</em>' containment reference.
   * @see #getRightCondition()
   * @generated
   */
  void setRightCondition(RightCondition value);

} // Condition
