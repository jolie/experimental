/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import java.lang.String;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.PostIncrementStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Increment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.PostIncrementStatementImpl#getPostIncrementStatement <em>Post Increment Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.PostIncrementStatementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostIncrementStatementImpl extends BasicStatementImpl implements PostIncrementStatement
{
  /**
   * The cached value of the '{@link #getPostIncrementStatement() <em>Post Increment Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostIncrementStatement()
   * @generated
   * @ordered
   */
  protected PostIncrementStatement postIncrementStatement;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostIncrementStatementImpl()
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
    return JoliePackage.Literals.POST_INCREMENT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostIncrementStatement getPostIncrementStatement()
  {
    return postIncrementStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostIncrementStatement(PostIncrementStatement newPostIncrementStatement, NotificationChain msgs)
  {
    PostIncrementStatement oldPostIncrementStatement = postIncrementStatement;
    postIncrementStatement = newPostIncrementStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT, oldPostIncrementStatement, newPostIncrementStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostIncrementStatement(PostIncrementStatement newPostIncrementStatement)
  {
    if (newPostIncrementStatement != postIncrementStatement)
    {
      NotificationChain msgs = null;
      if (postIncrementStatement != null)
        msgs = ((InternalEObject)postIncrementStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT, null, msgs);
      if (newPostIncrementStatement != null)
        msgs = ((InternalEObject)newPostIncrementStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT, null, msgs);
      msgs = basicSetPostIncrementStatement(newPostIncrementStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT, newPostIncrementStatement, newPostIncrementStatement));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.POST_INCREMENT_STATEMENT__NAME, oldName, name));
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
      case JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT:
        return basicSetPostIncrementStatement(null, msgs);
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
      case JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT:
        return getPostIncrementStatement();
      case JoliePackage.POST_INCREMENT_STATEMENT__NAME:
        return getName();
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
      case JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT:
        setPostIncrementStatement((PostIncrementStatement)newValue);
        return;
      case JoliePackage.POST_INCREMENT_STATEMENT__NAME:
        setName((String)newValue);
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
      case JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT:
        setPostIncrementStatement((PostIncrementStatement)null);
        return;
      case JoliePackage.POST_INCREMENT_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
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
      case JoliePackage.POST_INCREMENT_STATEMENT__POST_INCREMENT_STATEMENT:
        return postIncrementStatement != null;
      case JoliePackage.POST_INCREMENT_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //PostIncrementStatementImpl
