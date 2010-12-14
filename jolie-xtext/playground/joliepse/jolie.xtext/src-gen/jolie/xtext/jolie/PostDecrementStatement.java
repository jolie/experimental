/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Decrement Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.PostDecrementStatement#getPostDecrementStatement <em>Post Decrement Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.PostDecrementStatement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getPostDecrementStatement()
 * @model
 * @generated
 */
public interface PostDecrementStatement extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Post Decrement Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Decrement Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Decrement Statement</em>' containment reference.
   * @see #setPostDecrementStatement(PostDecrementStatement)
   * @see jolie.xtext.jolie.JoliePackage#getPostDecrementStatement_PostDecrementStatement()
   * @model containment="true"
   * @generated
   */
  PostDecrementStatement getPostDecrementStatement();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.PostDecrementStatement#getPostDecrementStatement <em>Post Decrement Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Decrement Statement</em>' containment reference.
   * @see #getPostDecrementStatement()
   * @generated
   */
  void setPostDecrementStatement(PostDecrementStatement value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jolie.xtext.jolie.JoliePackage#getPostDecrementStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.PostDecrementStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PostDecrementStatement
