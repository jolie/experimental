/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import java.util.Collection;

import jolie.xtext.jolie.Define;
import jolie.xtext.jolie.Include;
import jolie.xtext.jolie.Init;
import jolie.xtext.jolie.Interface;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.Port;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getInit <em>Init</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ProgramImpl#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected EList<Include> include;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected EList<Interface> interface_;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected EList<Init> init;

  /**
   * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution()
   * @generated
   * @ordered
   */
  protected EList<String> execution;

  /**
   * The cached value of the '{@link #getDefine() <em>Define</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefine()
   * @generated
   * @ordered
   */
  protected EList<Define> define;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected Main main;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return JoliePackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Include> getInclude()
  {
    if (include == null)
    {
      include = new EObjectContainmentEList<Include>(Include.class, this, JoliePackage.PROGRAM__INCLUDE);
    }
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<Port>(Port.class, this, JoliePackage.PROGRAM__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterface()
  {
    if (interface_ == null)
    {
      interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, JoliePackage.PROGRAM__INTERFACE);
    }
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, JoliePackage.PROGRAM__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Init> getInit()
  {
    if (init == null)
    {
      init = new EObjectContainmentEList<Init>(Init.class, this, JoliePackage.PROGRAM__INIT);
    }
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExecution()
  {
    if (execution == null)
    {
      execution = new EDataTypeEList<String>(String.class, this, JoliePackage.PROGRAM__EXECUTION);
    }
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Define> getDefine()
  {
    if (define == null)
    {
      define = new EObjectContainmentEList<Define>(Define.class, this, JoliePackage.PROGRAM__DEFINE);
    }
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMain(Main newMain, NotificationChain msgs)
  {
    Main oldMain = main;
    main = newMain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.PROGRAM__MAIN, oldMain, newMain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMain(Main newMain)
  {
    if (newMain != main)
    {
      NotificationChain msgs = null;
      if (main != null)
        msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.PROGRAM__MAIN, null, msgs);
      if (newMain != null)
        msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.PROGRAM__MAIN, null, msgs);
      msgs = basicSetMain(newMain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.PROGRAM__MAIN, newMain, newMain));
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
      case JoliePackage.PROGRAM__INCLUDE:
        return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROGRAM__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROGRAM__INTERFACE:
        return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROGRAM__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROGRAM__INIT:
        return ((InternalEList<?>)getInit()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROGRAM__DEFINE:
        return ((InternalEList<?>)getDefine()).basicRemove(otherEnd, msgs);
      case JoliePackage.PROGRAM__MAIN:
        return basicSetMain(null, msgs);
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
      case JoliePackage.PROGRAM__INCLUDE:
        return getInclude();
      case JoliePackage.PROGRAM__PORTS:
        return getPorts();
      case JoliePackage.PROGRAM__INTERFACE:
        return getInterface();
      case JoliePackage.PROGRAM__TYPES:
        return getTypes();
      case JoliePackage.PROGRAM__INIT:
        return getInit();
      case JoliePackage.PROGRAM__EXECUTION:
        return getExecution();
      case JoliePackage.PROGRAM__DEFINE:
        return getDefine();
      case JoliePackage.PROGRAM__MAIN:
        return getMain();
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
      case JoliePackage.PROGRAM__INCLUDE:
        getInclude().clear();
        getInclude().addAll((Collection<? extends Include>)newValue);
        return;
      case JoliePackage.PROGRAM__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case JoliePackage.PROGRAM__INTERFACE:
        getInterface().clear();
        getInterface().addAll((Collection<? extends Interface>)newValue);
        return;
      case JoliePackage.PROGRAM__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case JoliePackage.PROGRAM__INIT:
        getInit().clear();
        getInit().addAll((Collection<? extends Init>)newValue);
        return;
      case JoliePackage.PROGRAM__EXECUTION:
        getExecution().clear();
        getExecution().addAll((Collection<? extends String>)newValue);
        return;
      case JoliePackage.PROGRAM__DEFINE:
        getDefine().clear();
        getDefine().addAll((Collection<? extends Define>)newValue);
        return;
      case JoliePackage.PROGRAM__MAIN:
        setMain((Main)newValue);
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
      case JoliePackage.PROGRAM__INCLUDE:
        getInclude().clear();
        return;
      case JoliePackage.PROGRAM__PORTS:
        getPorts().clear();
        return;
      case JoliePackage.PROGRAM__INTERFACE:
        getInterface().clear();
        return;
      case JoliePackage.PROGRAM__TYPES:
        getTypes().clear();
        return;
      case JoliePackage.PROGRAM__INIT:
        getInit().clear();
        return;
      case JoliePackage.PROGRAM__EXECUTION:
        getExecution().clear();
        return;
      case JoliePackage.PROGRAM__DEFINE:
        getDefine().clear();
        return;
      case JoliePackage.PROGRAM__MAIN:
        setMain((Main)null);
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
      case JoliePackage.PROGRAM__INCLUDE:
        return include != null && !include.isEmpty();
      case JoliePackage.PROGRAM__PORTS:
        return ports != null && !ports.isEmpty();
      case JoliePackage.PROGRAM__INTERFACE:
        return interface_ != null && !interface_.isEmpty();
      case JoliePackage.PROGRAM__TYPES:
        return types != null && !types.isEmpty();
      case JoliePackage.PROGRAM__INIT:
        return init != null && !init.isEmpty();
      case JoliePackage.PROGRAM__EXECUTION:
        return execution != null && !execution.isEmpty();
      case JoliePackage.PROGRAM__DEFINE:
        return define != null && !define.isEmpty();
      case JoliePackage.PROGRAM__MAIN:
        return main != null;
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
    result.append(" (execution: ");
    result.append(execution);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
