/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Response Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.RequestResponseOperation#getExpression <em>Expression</em>}</li>
 *   <li>{@link jolie.xtext.jolie.RequestResponseOperation#getMainProcess <em>Main Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getRequestResponseOperation()
 * @model
 * @generated
 */
public interface RequestResponseOperation extends InputOperation
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
   * @see jolie.xtext.jolie.JoliePackage#getRequestResponseOperation_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.RequestResponseOperation#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Main Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Process</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Process</em>' containment reference.
   * @see #setMainProcess(MainProcess)
   * @see jolie.xtext.jolie.JoliePackage#getRequestResponseOperation_MainProcess()
   * @model containment="true"
   * @generated
   */
  MainProcess getMainProcess();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.RequestResponseOperation#getMainProcess <em>Main Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Process</em>' containment reference.
   * @see #getMainProcess()
   * @generated
   */
  void setMainProcess(MainProcess value);

} // RequestResponseOperation
