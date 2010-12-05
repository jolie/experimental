/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.jolie;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Increment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.jolie.PostIncrementStatement#getPostIncrementStatement <em>Post Increment Statement</em>}</li>
 *   <li>{@link org.xtext.jolie.PostIncrementStatement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.jolie.JoliePackage#getPostIncrementStatement()
 * @model
 * @generated
 */
public interface PostIncrementStatement extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Post Increment Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Increment Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Increment Statement</em>' containment reference.
   * @see #setPostIncrementStatement(PostIncrementStatement)
   * @see org.xtext.jolie.JoliePackage#getPostIncrementStatement_PostIncrementStatement()
   * @model containment="true"
   * @generated
   */
  PostIncrementStatement getPostIncrementStatement();

  /**
   * Sets the value of the '{@link org.xtext.jolie.PostIncrementStatement#getPostIncrementStatement <em>Post Increment Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Increment Statement</em>' containment reference.
   * @see #getPostIncrementStatement()
   * @generated
   */
  void setPostIncrementStatement(PostIncrementStatement value);

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
   * @see org.xtext.jolie.JoliePackage#getPostIncrementStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.jolie.PostIncrementStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PostIncrementStatement
