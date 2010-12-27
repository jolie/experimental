/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Foreach#getVar1 <em>Var1</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Foreach#getVar2 <em>Var2</em>}</li>
 *   <li>{@link jolie.xtext.jolie.Foreach#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getForeach()
 * @model
 * @generated
 */
public interface Foreach extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' containment reference.
   * @see #setVar1(VariablePath)
   * @see jolie.xtext.jolie.JoliePackage#getForeach_Var1()
   * @model containment="true"
   * @generated
   */
  VariablePath getVar1();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Foreach#getVar1 <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' containment reference.
   * @see #getVar1()
   * @generated
   */
  void setVar1(VariablePath value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' containment reference.
   * @see #setVar2(VariablePath)
   * @see jolie.xtext.jolie.JoliePackage#getForeach_Var2()
   * @model containment="true"
   * @generated
   */
  VariablePath getVar2();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Foreach#getVar2 <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' containment reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(VariablePath value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Body)
   * @see jolie.xtext.jolie.JoliePackage#getForeach_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.Foreach#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

} // Foreach
