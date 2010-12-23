/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.Location#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see jolie.xtext.jolie.JoliePackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject
{
  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
   * The list contents are of type {@link jolie.xtext.jolie.Uri}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference list.
   * @see jolie.xtext.jolie.JoliePackage#getLocation_Uri()
   * @model containment="true"
   * @generated
   */
  EList<Uri> getUri();

} // Location
