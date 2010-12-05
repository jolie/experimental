/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.jolie.JoliePackage;
import org.eclipse.xtext.jolie.PostDecrementStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Decrement Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.jolie.impl.PostDecrementStatementImpl#getPostDecrementStatement <em>Post Decrement Statement</em>}</li>
 *   <li>{@link org.xtext.jolie.impl.PostDecrementStatementImpl#getNaem <em>Naem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostDecrementStatementImpl extends BasicStatementImpl implements PostDecrementStatement
{
  /**
   * The cached value of the '{@link #getPostDecrementStatement() <em>Post Decrement Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostDecrementStatement()
   * @generated
   * @ordered
   */
  protected PostDecrementStatement postDecrementStatement;

  /**
   * The default value of the '{@link #getNaem() <em>Naem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaem()
   * @generated
   * @ordered
   */
  protected static final String NAEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNaem() <em>Naem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaem()
   * @generated
   * @ordered
   */
  protected String naem = NAEM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostDecrementStatementImpl()
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
    return JoliePackage.Literals.POST_DECREMENT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostDecrementStatement getPostDecrementStatement()
  {
    return postDecrementStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostDecrementStatement(PostDecrementStatement newPostDecrementStatement, NotificationChain msgs)
  {
    PostDecrementStatement oldPostDecrementStatement = postDecrementStatement;
    postDecrementStatement = newPostDecrementStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT, oldPostDecrementStatement, newPostDecrementStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostDecrementStatement(PostDecrementStatement newPostDecrementStatement)
  {
    if (newPostDecrementStatement != postDecrementStatement)
    {
      NotificationChain msgs = null;
      if (postDecrementStatement != null)
        msgs = ((InternalEObject)postDecrementStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT, null, msgs);
      if (newPostDecrementStatement != null)
        msgs = ((InternalEObject)newPostDecrementStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT, null, msgs);
      msgs = basicSetPostDecrementStatement(newPostDecrementStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT, newPostDecrementStatement, newPostDecrementStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNaem()
  {
    return naem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaem(String newNaem)
  {
    String oldNaem = naem;
    naem = newNaem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.POST_DECREMENT_STATEMENT__NAEM, oldNaem, naem));
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
      case JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT:
        return basicSetPostDecrementStatement(null, msgs);
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
      case JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT:
        return getPostDecrementStatement();
      case JoliePackage.POST_DECREMENT_STATEMENT__NAEM:
        return getNaem();
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
      case JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT:
        setPostDecrementStatement((PostDecrementStatement)newValue);
        return;
      case JoliePackage.POST_DECREMENT_STATEMENT__NAEM:
        setNaem((String)newValue);
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
      case JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT:
        setPostDecrementStatement((PostDecrementStatement)null);
        return;
      case JoliePackage.POST_DECREMENT_STATEMENT__NAEM:
        setNaem(NAEM_EDEFAULT);
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
      case JoliePackage.POST_DECREMENT_STATEMENT__POST_DECREMENT_STATEMENT:
        return postDecrementStatement != null;
      case JoliePackage.POST_DECREMENT_STATEMENT__NAEM:
        return NAEM_EDEFAULT == null ? naem != null : !NAEM_EDEFAULT.equals(naem);
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
    result.append(" (naem: ");
    result.append(naem);
    result.append(')');
    return result.toString();
  }

} //PostDecrementStatementImpl
