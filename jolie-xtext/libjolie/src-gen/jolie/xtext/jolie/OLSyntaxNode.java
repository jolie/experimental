/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OL Syntax Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.OLSyntaxNode#getParallelStatement <em>Parallel Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getOLSyntaxNode()
 * @model
 * @generated
 */
public interface OLSyntaxNode extends MainProcess
{
  /**
   * Returns the value of the '<em><b>Parallel Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parallel Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parallel Statement</em>' containment reference.
   * @see #setParallelStatement(ParallelStatement)
   * @see jolie.xtext.jolie.JoliePackage#getOLSyntaxNode_ParallelStatement()
   * @model containment="true"
   * @generated
   */
  ParallelStatement getParallelStatement();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.OLSyntaxNode#getParallelStatement <em>Parallel Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parallel Statement</em>' containment reference.
   * @see #getParallelStatement()
   * @generated
   */
  void setParallelStatement(ParallelStatement value);

} // OLSyntaxNode
