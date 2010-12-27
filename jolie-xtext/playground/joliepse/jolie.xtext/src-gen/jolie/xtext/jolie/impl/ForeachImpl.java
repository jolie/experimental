/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.Body;
import jolie.xtext.jolie.Foreach;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.ForeachImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ForeachImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.ForeachImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeachImpl extends BasicStatementImpl implements Foreach
{
  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected VariablePath var1;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected VariablePath var2;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Body body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeachImpl()
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
    return JoliePackage.Literals.FOREACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablePath getVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar1(VariablePath newVar1, NotificationChain msgs)
  {
    VariablePath oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.FOREACH__VAR1, oldVar1, newVar1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(VariablePath newVar1)
  {
    if (newVar1 != var1)
    {
      NotificationChain msgs = null;
      if (var1 != null)
        msgs = ((InternalEObject)var1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.FOREACH__VAR1, null, msgs);
      if (newVar1 != null)
        msgs = ((InternalEObject)newVar1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.FOREACH__VAR1, null, msgs);
      msgs = basicSetVar1(newVar1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.FOREACH__VAR1, newVar1, newVar1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablePath getVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar2(VariablePath newVar2, NotificationChain msgs)
  {
    VariablePath oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.FOREACH__VAR2, oldVar2, newVar2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(VariablePath newVar2)
  {
    if (newVar2 != var2)
    {
      NotificationChain msgs = null;
      if (var2 != null)
        msgs = ((InternalEObject)var2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.FOREACH__VAR2, null, msgs);
      if (newVar2 != null)
        msgs = ((InternalEObject)newVar2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.FOREACH__VAR2, null, msgs);
      msgs = basicSetVar2(newVar2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.FOREACH__VAR2, newVar2, newVar2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Body newBody, NotificationChain msgs)
  {
    Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.FOREACH__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Body newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.FOREACH__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.FOREACH__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.FOREACH__BODY, newBody, newBody));
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
      case JoliePackage.FOREACH__VAR1:
        return basicSetVar1(null, msgs);
      case JoliePackage.FOREACH__VAR2:
        return basicSetVar2(null, msgs);
      case JoliePackage.FOREACH__BODY:
        return basicSetBody(null, msgs);
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
      case JoliePackage.FOREACH__VAR1:
        return getVar1();
      case JoliePackage.FOREACH__VAR2:
        return getVar2();
      case JoliePackage.FOREACH__BODY:
        return getBody();
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
      case JoliePackage.FOREACH__VAR1:
        setVar1((VariablePath)newValue);
        return;
      case JoliePackage.FOREACH__VAR2:
        setVar2((VariablePath)newValue);
        return;
      case JoliePackage.FOREACH__BODY:
        setBody((Body)newValue);
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
      case JoliePackage.FOREACH__VAR1:
        setVar1((VariablePath)null);
        return;
      case JoliePackage.FOREACH__VAR2:
        setVar2((VariablePath)null);
        return;
      case JoliePackage.FOREACH__BODY:
        setBody((Body)null);
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
      case JoliePackage.FOREACH__VAR1:
        return var1 != null;
      case JoliePackage.FOREACH__VAR2:
        return var2 != null;
      case JoliePackage.FOREACH__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
