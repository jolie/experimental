/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.Interfaces;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Location;
import jolie.xtext.jolie.OneWayOperation;
import jolie.xtext.jolie.OutputPortStatement;
import jolie.xtext.jolie.Protocol;
import jolie.xtext.jolie.RequestResponseOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Port Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.OutputPortStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputPortStatementImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputPortStatementImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputPortStatementImpl#getOneWayOperation <em>One Way Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputPortStatementImpl#getRequestResponseOperation <em>Request Response Operation</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.OutputPortStatementImpl#getIntefaces <em>Intefaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPortStatementImpl extends MinimalEObjectImpl.Container implements OutputPortStatement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected EList<Location> location;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected EList<Protocol> protocol;

  /**
   * The cached value of the '{@link #getOneWayOperation() <em>One Way Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOneWayOperation()
   * @generated
   * @ordered
   */
  protected EList<OneWayOperation> oneWayOperation;

  /**
   * The cached value of the '{@link #getRequestResponseOperation() <em>Request Response Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestResponseOperation()
   * @generated
   * @ordered
   */
  protected EList<RequestResponseOperation> requestResponseOperation;

  /**
   * The cached value of the '{@link #getIntefaces() <em>Intefaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntefaces()
   * @generated
   * @ordered
   */
  protected EList<Interfaces> intefaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputPortStatementImpl()
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
    return JoliePackage.Literals.OUTPUT_PORT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.OUTPUT_PORT_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Location> getLocation()
  {
    if (location == null)
    {
      location = new EObjectContainmentEList<Location>(Location.class, this, JoliePackage.OUTPUT_PORT_STATEMENT__LOCATION);
    }
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Protocol> getProtocol()
  {
    if (protocol == null)
    {
      protocol = new EObjectContainmentEList<Protocol>(Protocol.class, this, JoliePackage.OUTPUT_PORT_STATEMENT__PROTOCOL);
    }
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OneWayOperation> getOneWayOperation()
  {
    if (oneWayOperation == null)
    {
      oneWayOperation = new EObjectContainmentEList<OneWayOperation>(OneWayOperation.class, this, JoliePackage.OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION);
    }
    return oneWayOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequestResponseOperation> getRequestResponseOperation()
  {
    if (requestResponseOperation == null)
    {
      requestResponseOperation = new EObjectContainmentEList<RequestResponseOperation>(RequestResponseOperation.class, this, JoliePackage.OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION);
    }
    return requestResponseOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interfaces> getIntefaces()
  {
    if (intefaces == null)
    {
      intefaces = new EObjectContainmentEList<Interfaces>(Interfaces.class, this, JoliePackage.OUTPUT_PORT_STATEMENT__INTEFACES);
    }
    return intefaces;
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
      case JoliePackage.OUTPUT_PORT_STATEMENT__LOCATION:
        return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
      case JoliePackage.OUTPUT_PORT_STATEMENT__PROTOCOL:
        return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
      case JoliePackage.OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION:
        return ((InternalEList<?>)getOneWayOperation()).basicRemove(otherEnd, msgs);
      case JoliePackage.OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION:
        return ((InternalEList<?>)getRequestResponseOperation()).basicRemove(otherEnd, msgs);
      case JoliePackage.OUTPUT_PORT_STATEMENT__INTEFACES:
        return ((InternalEList<?>)getIntefaces()).basicRemove(otherEnd, msgs);
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
      case JoliePackage.OUTPUT_PORT_STATEMENT__NAME:
        return getName();
      case JoliePackage.OUTPUT_PORT_STATEMENT__LOCATION:
        return getLocation();
      case JoliePackage.OUTPUT_PORT_STATEMENT__PROTOCOL:
        return getProtocol();
      case JoliePackage.OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION:
        return getOneWayOperation();
      case JoliePackage.OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION:
        return getRequestResponseOperation();
      case JoliePackage.OUTPUT_PORT_STATEMENT__INTEFACES:
        return getIntefaces();
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
      case JoliePackage.OUTPUT_PORT_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__LOCATION:
        getLocation().clear();
        getLocation().addAll((Collection<? extends Location>)newValue);
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__PROTOCOL:
        getProtocol().clear();
        getProtocol().addAll((Collection<? extends Protocol>)newValue);
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION:
        getOneWayOperation().clear();
        getOneWayOperation().addAll((Collection<? extends OneWayOperation>)newValue);
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION:
        getRequestResponseOperation().clear();
        getRequestResponseOperation().addAll((Collection<? extends RequestResponseOperation>)newValue);
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__INTEFACES:
        getIntefaces().clear();
        getIntefaces().addAll((Collection<? extends Interfaces>)newValue);
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
      case JoliePackage.OUTPUT_PORT_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__LOCATION:
        getLocation().clear();
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__PROTOCOL:
        getProtocol().clear();
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION:
        getOneWayOperation().clear();
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION:
        getRequestResponseOperation().clear();
        return;
      case JoliePackage.OUTPUT_PORT_STATEMENT__INTEFACES:
        getIntefaces().clear();
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
      case JoliePackage.OUTPUT_PORT_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JoliePackage.OUTPUT_PORT_STATEMENT__LOCATION:
        return location != null && !location.isEmpty();
      case JoliePackage.OUTPUT_PORT_STATEMENT__PROTOCOL:
        return protocol != null && !protocol.isEmpty();
      case JoliePackage.OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION:
        return oneWayOperation != null && !oneWayOperation.isEmpty();
      case JoliePackage.OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION:
        return requestResponseOperation != null && !requestResponseOperation.isEmpty();
      case JoliePackage.OUTPUT_PORT_STATEMENT__INTEFACES:
        return intefaces != null && !intefaces.isEmpty();
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

} //OutputPortStatementImpl
