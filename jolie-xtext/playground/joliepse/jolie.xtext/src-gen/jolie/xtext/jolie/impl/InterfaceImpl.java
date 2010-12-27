/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.Interface;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.OneWayOperation;
import jolie.xtext.jolie.RequestResponseOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.InterfaceImpl#getRequestResponseOperation <em>Request Response Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.InterfaceImpl#getOneWayOperation <em>One Way Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface
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
   * The cached value of the '{@link #getRequestResponseOperation() <em>Request Response Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestResponseOperation()
   * @generated
   * @ordered
   */
  protected RequestResponseOperation requestResponseOperation;

  /**
   * The cached value of the '{@link #getOneWayOperation() <em>One Way Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOneWayOperation()
   * @generated
   * @ordered
   */
  protected OneWayOperation oneWayOperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceImpl()
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
    return JoliePackage.Literals.INTERFACE;
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
      name = new EDataTypeEList<String>(String.class, this, JoliePackage.INTERFACE__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestResponseOperation getRequestResponseOperation()
  {
    return requestResponseOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequestResponseOperation(RequestResponseOperation newRequestResponseOperation, NotificationChain msgs)
  {
    RequestResponseOperation oldRequestResponseOperation = requestResponseOperation;
    requestResponseOperation = newRequestResponseOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION, oldRequestResponseOperation, newRequestResponseOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestResponseOperation(RequestResponseOperation newRequestResponseOperation)
  {
    if (newRequestResponseOperation != requestResponseOperation)
    {
      NotificationChain msgs = null;
      if (requestResponseOperation != null)
        msgs = ((InternalEObject)requestResponseOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION, null, msgs);
      if (newRequestResponseOperation != null)
        msgs = ((InternalEObject)newRequestResponseOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION, null, msgs);
      msgs = basicSetRequestResponseOperation(newRequestResponseOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION, newRequestResponseOperation, newRequestResponseOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayOperation getOneWayOperation()
  {
    return oneWayOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOneWayOperation(OneWayOperation newOneWayOperation, NotificationChain msgs)
  {
    OneWayOperation oldOneWayOperation = oneWayOperation;
    oneWayOperation = newOneWayOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.INTERFACE__ONE_WAY_OPERATION, oldOneWayOperation, newOneWayOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOneWayOperation(OneWayOperation newOneWayOperation)
  {
    if (newOneWayOperation != oneWayOperation)
    {
      NotificationChain msgs = null;
      if (oneWayOperation != null)
        msgs = ((InternalEObject)oneWayOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INTERFACE__ONE_WAY_OPERATION, null, msgs);
      if (newOneWayOperation != null)
        msgs = ((InternalEObject)newOneWayOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.INTERFACE__ONE_WAY_OPERATION, null, msgs);
      msgs = basicSetOneWayOperation(newOneWayOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.INTERFACE__ONE_WAY_OPERATION, newOneWayOperation, newOneWayOperation));
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
      case JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION:
        return basicSetRequestResponseOperation(null, msgs);
      case JoliePackage.INTERFACE__ONE_WAY_OPERATION:
        return basicSetOneWayOperation(null, msgs);
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
      case JoliePackage.INTERFACE__NAME:
        return getName();
      case JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION:
        return getRequestResponseOperation();
      case JoliePackage.INTERFACE__ONE_WAY_OPERATION:
        return getOneWayOperation();
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
      case JoliePackage.INTERFACE__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION:
        setRequestResponseOperation((RequestResponseOperation)newValue);
        return;
      case JoliePackage.INTERFACE__ONE_WAY_OPERATION:
        setOneWayOperation((OneWayOperation)newValue);
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
      case JoliePackage.INTERFACE__NAME:
        getName().clear();
        return;
      case JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION:
        setRequestResponseOperation((RequestResponseOperation)null);
        return;
      case JoliePackage.INTERFACE__ONE_WAY_OPERATION:
        setOneWayOperation((OneWayOperation)null);
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
      case JoliePackage.INTERFACE__NAME:
        return name != null && !name.isEmpty();
      case JoliePackage.INTERFACE__REQUEST_RESPONSE_OPERATION:
        return requestResponseOperation != null;
      case JoliePackage.INTERFACE__ONE_WAY_OPERATION:
        return oneWayOperation != null;
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

} //InterfaceImpl
