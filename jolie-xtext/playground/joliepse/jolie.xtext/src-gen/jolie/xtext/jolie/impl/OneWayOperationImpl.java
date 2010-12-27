/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.OneWayOperation;
import jolie.xtext.jolie.TypeDefinition;

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
 * An implementation of the model object '<em><b>One Way Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.OneWayOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OneWayOperationImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OneWayOperationImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneWayOperationImpl extends MinimalEObjectImpl.Container implements OneWayOperation
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
   * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinition()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> typeDefinition;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<String> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OneWayOperationImpl()
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
    return JoliePackage.Literals.ONE_WAY_OPERATION;
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
      name = new EDataTypeEList<String>(String.class, this, JoliePackage.ONE_WAY_OPERATION__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDefinition> getTypeDefinition()
  {
    if (typeDefinition == null)
    {
      typeDefinition = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, JoliePackage.ONE_WAY_OPERATION__TYPE_DEFINITION);
    }
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getChildren()
  {
    if (children == null)
    {
      children = new EDataTypeEList<String>(String.class, this, JoliePackage.ONE_WAY_OPERATION__CHILDREN);
    }
    return children;
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
      case JoliePackage.ONE_WAY_OPERATION__TYPE_DEFINITION:
        return ((InternalEList<?>)getTypeDefinition()).basicRemove(otherEnd, msgs);
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
      case JoliePackage.ONE_WAY_OPERATION__NAME:
        return getName();
      case JoliePackage.ONE_WAY_OPERATION__TYPE_DEFINITION:
        return getTypeDefinition();
      case JoliePackage.ONE_WAY_OPERATION__CHILDREN:
        return getChildren();
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
      case JoliePackage.ONE_WAY_OPERATION__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.ONE_WAY_OPERATION__TYPE_DEFINITION:
        getTypeDefinition().clear();
        getTypeDefinition().addAll((Collection<? extends TypeDefinition>)newValue);
        return;
      case JoliePackage.ONE_WAY_OPERATION__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends String>)newValue);
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
      case JoliePackage.ONE_WAY_OPERATION__NAME:
        getName().clear();
        return;
      case JoliePackage.ONE_WAY_OPERATION__TYPE_DEFINITION:
        getTypeDefinition().clear();
        return;
      case JoliePackage.ONE_WAY_OPERATION__CHILDREN:
        getChildren().clear();
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
      case JoliePackage.ONE_WAY_OPERATION__NAME:
        return name != null && !name.isEmpty();
      case JoliePackage.ONE_WAY_OPERATION__TYPE_DEFINITION:
        return typeDefinition != null && !typeDefinition.isEmpty();
      case JoliePackage.ONE_WAY_OPERATION__CHILDREN:
        return children != null && !children.isEmpty();
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
    result.append(", children: ");
    result.append(children);
    result.append(')');
    return result.toString();
  }

} //OneWayOperationImpl
