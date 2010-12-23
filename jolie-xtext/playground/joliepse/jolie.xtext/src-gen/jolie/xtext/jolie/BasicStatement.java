/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.BasicStatement#getProcess <em>Process</em>}</li>
 *   <li>{@link jolie.xtext.jolie.BasicStatement#getAssignStatementOrPostIncrementDecrement <em>Assign Statement Or Post Increment Decrement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.BasicStatement#getNDChoiceStatement <em>ND Choice Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.BasicStatement#getPreIncrementDecrement <em>Pre Increment Decrement</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getBasicStatement()
 * @model
 * @generated
 */
public interface BasicStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference.
   * @see #setProcess(jolie.xtext.jolie.Process)
   * @see jolie.xtext.jolie.JoliePackage#getBasicStatement_Process()
   * @model containment="true"
   * @generated
   */
  jolie.xtext.jolie.Process getProcess();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.BasicStatement#getProcess <em>Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' containment reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(jolie.xtext.jolie.Process value);

  /**
   * Returns the value of the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign Statement Or Post Increment Decrement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign Statement Or Post Increment Decrement</em>' containment reference.
   * @see #setAssignStatementOrPostIncrementDecrement(AssignStatementOrPostIncrementDecrementOrInputOperation)
   * @see jolie.xtext.jolie.JoliePackage#getBasicStatement_AssignStatementOrPostIncrementDecrement()
   * @model containment="true"
   * @generated
   */
  AssignStatementOrPostIncrementDecrementOrInputOperation getAssignStatementOrPostIncrementDecrement();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.BasicStatement#getAssignStatementOrPostIncrementDecrement <em>Assign Statement Or Post Increment Decrement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign Statement Or Post Increment Decrement</em>' containment reference.
   * @see #getAssignStatementOrPostIncrementDecrement()
   * @generated
   */
  void setAssignStatementOrPostIncrementDecrement(AssignStatementOrPostIncrementDecrementOrInputOperation value);

  /**
   * Returns the value of the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ND Choice Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ND Choice Statement</em>' containment reference.
   * @see #setNDChoiceStatement(NDChoiceStatement)
   * @see jolie.xtext.jolie.JoliePackage#getBasicStatement_NDChoiceStatement()
   * @model containment="true"
   * @generated
   */
  NDChoiceStatement getNDChoiceStatement();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.BasicStatement#getNDChoiceStatement <em>ND Choice Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ND Choice Statement</em>' containment reference.
   * @see #getNDChoiceStatement()
   * @generated
   */
  void setNDChoiceStatement(NDChoiceStatement value);

  /**
   * Returns the value of the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Increment Decrement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Increment Decrement</em>' containment reference.
   * @see #setPreIncrementDecrement(PreIncrementDecrement)
   * @see jolie.xtext.jolie.JoliePackage#getBasicStatement_PreIncrementDecrement()
   * @model containment="true"
   * @generated
   */
  PreIncrementDecrement getPreIncrementDecrement();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.BasicStatement#getPreIncrementDecrement <em>Pre Increment Decrement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Increment Decrement</em>' containment reference.
   * @see #getPreIncrementDecrement()
   * @generated
   */
  void setPreIncrementDecrement(PreIncrementDecrement value);

} // BasicStatement
