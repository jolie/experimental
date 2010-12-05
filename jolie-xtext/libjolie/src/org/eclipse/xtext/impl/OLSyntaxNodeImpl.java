/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.jolie.JoliePackage;
import org.eclipse.xtext.jolie.OLSyntaxNode;
import org.eclipse.xtext.jolie.ParallelStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OL Syntax Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.jolie.impl.OLSyntaxNodeImpl#getParallelStatement <em>Parallel Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OLSyntaxNodeImpl extends MainProcessImpl implements OLSyntaxNode
{
  /**
   * The cached value of the '{@link #getParallelStatement() <em>Parallel Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParallelStatement()
   * @generated
   * @ordered
   */
  protected ParallelStatement parallelStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OLSyntaxNodeImpl()
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
    return JoliePackage.Literals.OL_SYNTAX_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParallelStatement getParallelStatement()
  {
    return parallelStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParallelStatement(ParallelStatement newParallelStatement, NotificationChain msgs)
  {
    ParallelStatement oldParallelStatement = parallelStatement;
    parallelStatement = newParallelStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT, oldParallelStatement, newParallelStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParallelStatement(ParallelStatement newParallelStatement)
  {
    if (newParallelStatement != parallelStatement)
    {
      NotificationChain msgs = null;
      if (parallelStatement != null)
        msgs = ((InternalEObject)parallelStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT, null, msgs);
      if (newParallelStatement != null)
        msgs = ((InternalEObject)newParallelStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT, null, msgs);
      msgs = basicSetParallelStatement(newParallelStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT, newParallelStatement, newParallelStatement));
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
      case JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT:
        return basicSetParallelStatement(null, msgs);
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
      case JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT:
        return getParallelStatement();
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
      case JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT:
        setParallelStatement((ParallelStatement)newValue);
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
      case JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT:
        setParallelStatement((ParallelStatement)null);
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
      case JoliePackage.OL_SYNTAX_NODE__PARALLEL_STATEMENT:
        return parallelStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //OLSyntaxNodeImpl
