/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Statement Or Post Increment Decrement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getAssignStatementOrPostIncrementDecrement()
 * @model
 * @generated
 */
public interface AssignStatementOrPostIncrementDecrement extends AssignStatementOrPostIncrementDecrementOrInputOperation
{
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
   * @see jolie.xtext.jolie.JoliePackage#getAssignStatementOrPostIncrementDecrement_VariablePath()
   * @model containment="true"
   * @generated
   */
  VariablePath getVariablePath();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getVariablePath <em>Variable Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Path</em>' containment reference.
   * @see #getVariablePath()
   * @generated
   */
  void setVariablePath(VariablePath value);

  /**
   * Returns the value of the '<em><b>Right Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Side</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Side</em>' containment reference.
   * @see #setRightSide(RightSide)
   * @see jolie.xtext.jolie.JoliePackage#getAssignStatementOrPostIncrementDecrement_RightSide()
   * @model containment="true"
   * @generated
   */
  RightSide getRightSide();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getRightSide <em>Right Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Side</em>' containment reference.
   * @see #getRightSide()
   * @generated
   */
  void setRightSide(RightSide value);

} // AssignStatementOrPostIncrementDecrement
