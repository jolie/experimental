/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.With#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.With#getMainrocess <em>Mainrocess</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getWith()
 * @model
 * @generated
 */
public interface With extends BasicStatement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(VariablePath)
   * @see jolie.xtext.jolie.JoliePackage#getWith_Name()
   * @model containment="true"
   * @generated
   */
  VariablePath getName();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.With#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(VariablePath value);

  /**
   * Returns the value of the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mainrocess</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mainrocess</em>' containment reference.
   * @see #setMainrocess(MainProcess)
   * @see jolie.xtext.jolie.JoliePackage#getWith_Mainrocess()
   * @model containment="true"
   * @generated
   */
  MainProcess getMainrocess();

  /**
   * Sets the value of the '{@link jolie.xtext.jolie.With#getMainrocess <em>Mainrocess</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mainrocess</em>' containment reference.
   * @see #getMainrocess()
   * @generated
   */
  void setMainrocess(MainProcess value);

} // With
