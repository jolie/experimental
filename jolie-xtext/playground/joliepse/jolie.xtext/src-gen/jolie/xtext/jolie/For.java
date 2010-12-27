/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.For#getParallelStatement <em>Parallel Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.For#getCondition <em>Condition</em>}</li>
 *   <li>{@link jolie.xtext.jolie.For#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getFor()
 * @model
 * @generated
 */
public interface For extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Parallel Statement</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.ParallelStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parallel Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parallel Statement</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getFor_ParallelStatement()
   * @model containment="true"
   * @generated
   */
  EList<ParallelStatement> getParallelStatement();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see jolie.xtext.jolie.JoliePackage#getFor_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.For#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

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
   * @see jolie.xtext.jolie.JoliePackage#getFor_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.For#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

} // For
