/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.AssignStatement#getAssignStatement <em>Assign Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.AssignStatement#getVariablePath <em>Variable Path</em>}</li>
 *   <li>{@link jolie.xtext.jolie.AssignStatement#getRightSideAssign <em>Right Side Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getAssignStatement()
 * @model
 * @generated
 */
public interface AssignStatement extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Assign Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign Statement</em>' containment reference.
   * @see #setAssignStatement(AssignStatement)
   * @see jolie.xtext.jolie.JoliePackage#getAssignStatement_AssignStatement()
   * @model containment="true"
   * @generated
   */
  AssignStatement getAssignStatement();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.AssignStatement#getAssignStatement <em>Assign Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign Statement</em>' containment reference.
   * @see #getAssignStatement()
   * @generated
   */
  void setAssignStatement(AssignStatement value);

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
   * @see jolie.xtext.jolie.JoliePackage#getAssignStatement_VariablePath()
   * @model containment="true"
   * @generated
   */
  VariablePath getVariablePath();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.AssignStatement#getVariablePath <em>Variable Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Path</em>' containment reference.
   * @see #getVariablePath()
   * @generated
   */
  void setVariablePath(VariablePath value);

  /**
   * Returns the value of the '<em><b>Right Side Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Side Assign</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Side Assign</em>' containment reference.
   * @see #setRightSideAssign(RightSideAssignament)
   * @see jolie.xtext.jolie.JoliePackage#getAssignStatement_RightSideAssign()
   * @model containment="true"
   * @generated
   */
  RightSideAssignament getRightSideAssign();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.AssignStatement#getRightSideAssign <em>Right Side Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Side Assign</em>' containment reference.
   * @see #getRightSideAssign()
   * @generated
   */
  void setRightSideAssign(RightSideAssignament value);

} // AssignStatement
