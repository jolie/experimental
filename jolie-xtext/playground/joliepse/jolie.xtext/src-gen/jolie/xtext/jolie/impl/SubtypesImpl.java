/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Native_type_sub;
import jolie.xtext.jolie.Subtypes;
import jolie.xtext.jolie.Typedef;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.SubtypesImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.SubtypesImpl#getNative_type_sub <em>Native type sub</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.SubtypesImpl#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtypesImpl extends MinimalEObjectImpl.Container implements Subtypes
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * The cached value of the '{@link #getNative_type_sub() <em>Native type sub</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNative_type_sub()
   * @generated
   * @ordered
   */
  protected EList<Native_type_sub> native_type_sub;

  /**
   * The cached value of the '{@link #getTypedef() <em>Typedef</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedef()
   * @generated
   * @ordered
   */
  protected EList<Typedef> typedef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubtypesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JoliePackage.Literals.SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, JoliePackage.SUBTYPES__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Native_type_sub> getNative_type_sub()
  {
    if (native_type_sub == null)
    {
      native_type_sub = new EObjectContainmentEList<Native_type_sub>(Native_type_sub.class, this, JoliePackage.SUBTYPES__NATIVE_TYPE_SUB);
    }
    return native_type_sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Typedef> getTypedef()
  {
    if (typedef == null)
    {
      typedef = new EObjectContainmentEList<Typedef>(Typedef.class, this, JoliePackage.SUBTYPES__TYPEDEF);
    }
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JoliePackage.SUBTYPES__NATIVE_TYPE_SUB:
        return ((InternalEList<?>)getNative_type_sub()).basicRemove(otherEnd, msgs);
      case JoliePackage.SUBTYPES__TYPEDEF:
        return ((InternalEList<?>)getTypedef()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JoliePackage.SUBTYPES__NAME:
        return getName();
      case JoliePackage.SUBTYPES__NATIVE_TYPE_SUB:
        return getNative_type_sub();
      case JoliePackage.SUBTYPES__TYPEDEF:
        return getTypedef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoliePackage.SUBTYPES__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.SUBTYPES__NATIVE_TYPE_SUB:
        getNative_type_sub().clear();
        getNative_type_sub().addAll((Collection<? extends Native_type_sub>)newValue);
        return;
      case JoliePackage.SUBTYPES__TYPEDEF:
        getTypedef().clear();
        getTypedef().addAll((Collection<? extends Typedef>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JoliePackage.SUBTYPES__NAME:
        getName().clear();
        return;
      case JoliePackage.SUBTYPES__NATIVE_TYPE_SUB:
        getNative_type_sub().clear();
        return;
      case JoliePackage.SUBTYPES__TYPEDEF:
        getTypedef().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JoliePackage.SUBTYPES__NAME:
        return name != null && !name.isEmpty();
      case JoliePackage.SUBTYPES__NATIVE_TYPE_SUB:
        return native_type_sub != null && !native_type_sub.isEmpty();
      case JoliePackage.SUBTYPES__TYPEDEF:
        return typedef != null && !typedef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SubtypesImpl
