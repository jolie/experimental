/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.WithImpl#getName <em>Name</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.WithImpl#getMainrocess <em>Mainrocess</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WithImpl extends BasicStatementImpl implements With
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected VariablePath name;

  /**
   * The cached value of the '{@link #getMainrocess() <em>Mainrocess</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainrocess()
   * @generated
   * @ordered
   */
  protected MainProcess mainrocess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithImpl()
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
    return JoliePackage.Literals.WITH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablePath getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(VariablePath newName, NotificationChain msgs)
  {
    VariablePath oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.WITH__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(VariablePath newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.WITH__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.WITH__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.WITH__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainProcess getMainrocess()
  {
    return mainrocess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainrocess(MainProcess newMainrocess, NotificationChain msgs)
  {
    MainProcess oldMainrocess = mainrocess;
    mainrocess = newMainrocess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.WITH__MAINROCESS, oldMainrocess, newMainrocess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainrocess(MainProcess newMainrocess)
  {
    if (newMainrocess != mainrocess)
    {
      NotificationChain msgs = null;
      if (mainrocess != null)
        msgs = ((InternalEObject)mainrocess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.WITH__MAINROCESS, null, msgs);
      if (newMainrocess != null)
        msgs = ((InternalEObject)newMainrocess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.WITH__MAINROCESS, null, msgs);
      msgs = basicSetMainrocess(newMainrocess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.WITH__MAINROCESS, newMainrocess, newMainrocess));
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
      case JoliePackage.WITH__NAME:
        return basicSetName(null, msgs);
      case JoliePackage.WITH__MAINROCESS:
        return basicSetMainrocess(null, msgs);
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
      case JoliePackage.WITH__NAME:
        return getName();
      case JoliePackage.WITH__MAINROCESS:
        return getMainrocess();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JoliePackage.WITH__NAME:
        setName((VariablePath)newValue);
        return;
      case JoliePackage.WITH__MAINROCESS:
        setMainrocess((MainProcess)newValue);
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
      case JoliePackage.WITH__NAME:
        setName((VariablePath)null);
        return;
      case JoliePackage.WITH__MAINROCESS:
        setMainrocess((MainProcess)null);
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
      case JoliePackage.WITH__NAME:
        return name != null;
      case JoliePackage.WITH__MAINROCESS:
        return mainrocess != null;
    }
    return super.eIsSet(featureID);
  }

} //WithImpl
