/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.NDChoiceStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ND Choice Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl#getNDChoiceStatement <em>ND Choice Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NDChoiceStatementImpl extends BasicStatementImpl implements NDChoiceStatement
{
  /**
   * The cached value of the '{@link #getNDChoiceStatement() <em>ND Choice Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNDChoiceStatement()
   * @generated
   * @ordered
   */
  protected NDChoiceStatement ndChoiceStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NDChoiceStatementImpl()
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
    return JoliePackage.Literals.ND_CHOICE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NDChoiceStatement getNDChoiceStatement()
  {
    return ndChoiceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNDChoiceStatement(NDChoiceStatement newNDChoiceStatement, NotificationChain msgs)
  {
    NDChoiceStatement oldNDChoiceStatement = ndChoiceStatement;
    ndChoiceStatement = newNDChoiceStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT, oldNDChoiceStatement, newNDChoiceStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNDChoiceStatement(NDChoiceStatement newNDChoiceStatement)
  {
    if (newNDChoiceStatement != ndChoiceStatement)
    {
      NotificationChain msgs = null;
      if (ndChoiceStatement != null)
        msgs = ((InternalEObject)ndChoiceStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT, null, msgs);
      if (newNDChoiceStatement != null)
        msgs = ((InternalEObject)newNDChoiceStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT, null, msgs);
      msgs = basicSetNDChoiceStatement(newNDChoiceStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT, newNDChoiceStatement, newNDChoiceStatement));
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        return basicSetNDChoiceStatement(null, msgs);
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        return getNDChoiceStatement();
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        setNDChoiceStatement((NDChoiceStatement)newValue);
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        setNDChoiceStatement((NDChoiceStatement)null);
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
      case JoliePackage.ND_CHOICE_STATEMENT__ND_CHOICE_STATEMENT:
        return ndChoiceStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //NDChoiceStatementImpl
