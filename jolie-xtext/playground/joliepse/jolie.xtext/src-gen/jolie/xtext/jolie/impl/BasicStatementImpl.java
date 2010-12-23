/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.NDChoiceStatement;
import jolie.xtext.jolie.PreIncrementDecrement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jolie.xtext.jolie.impl.BasicStatementImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.BasicStatementImpl#getAssignStatementOrPostIncrementDecrement <em>Assign Statement Or Post Increment Decrement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.BasicStatementImpl#getNDChoiceStatement <em>ND Choice Statement</em>}</li>
 *   <li>{@link jolie.xtext.jolie.impl.BasicStatementImpl#getPreIncrementDecrement <em>Pre Increment Decrement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicStatementImpl extends MinimalEObjectImpl.Container implements BasicStatement
{
  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected jolie.xtext.jolie.Process process;

  /**
   * The cached value of the '{@link #getAssignStatementOrPostIncrementDecrement() <em>Assign Statement Or Post Increment Decrement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignStatementOrPostIncrementDecrement()
   * @generated
   * @ordered
   */
  protected AssignStatementOrPostIncrementDecrementOrInputOperation assignStatementOrPostIncrementDecrement;

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
   * The cached value of the '{@link #getPreIncrementDecrement() <em>Pre Increment Decrement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreIncrementDecrement()
   * @generated
   * @ordered
   */
  protected PreIncrementDecrement preIncrementDecrement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicStatementImpl()
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
    return JoliePackage.Literals.BASIC_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jolie.xtext.jolie.Process getProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcess(jolie.xtext.jolie.Process newProcess, NotificationChain msgs)
  {
    jolie.xtext.jolie.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__PROCESS, oldProcess, newProcess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess(jolie.xtext.jolie.Process newProcess)
  {
    if (newProcess != process)
    {
      NotificationChain msgs = null;
      if (process != null)
        msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__PROCESS, null, msgs);
      if (newProcess != null)
        msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__PROCESS, null, msgs);
      msgs = basicSetProcess(newProcess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__PROCESS, newProcess, newProcess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignStatementOrPostIncrementDecrementOrInputOperation getAssignStatementOrPostIncrementDecrement()
  {
    return assignStatementOrPostIncrementDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignStatementOrPostIncrementDecrement(AssignStatementOrPostIncrementDecrementOrInputOperation newAssignStatementOrPostIncrementDecrement, NotificationChain msgs)
  {
    AssignStatementOrPostIncrementDecrementOrInputOperation oldAssignStatementOrPostIncrementDecrement = assignStatementOrPostIncrementDecrement;
    assignStatementOrPostIncrementDecrement = newAssignStatementOrPostIncrementDecrement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT, oldAssignStatementOrPostIncrementDecrement, newAssignStatementOrPostIncrementDecrement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignStatementOrPostIncrementDecrement(AssignStatementOrPostIncrementDecrementOrInputOperation newAssignStatementOrPostIncrementDecrement)
  {
    if (newAssignStatementOrPostIncrementDecrement != assignStatementOrPostIncrementDecrement)
    {
      NotificationChain msgs = null;
      if (assignStatementOrPostIncrementDecrement != null)
        msgs = ((InternalEObject)assignStatementOrPostIncrementDecrement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT, null, msgs);
      if (newAssignStatementOrPostIncrementDecrement != null)
        msgs = ((InternalEObject)newAssignStatementOrPostIncrementDecrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT, null, msgs);
      msgs = basicSetAssignStatementOrPostIncrementDecrement(newAssignStatementOrPostIncrementDecrement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT, newAssignStatementOrPostIncrementDecrement, newAssignStatementOrPostIncrementDecrement));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT, oldNDChoiceStatement, newNDChoiceStatement);
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
        msgs = ((InternalEObject)ndChoiceStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT, null, msgs);
      if (newNDChoiceStatement != null)
        msgs = ((InternalEObject)newNDChoiceStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT, null, msgs);
      msgs = basicSetNDChoiceStatement(newNDChoiceStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT, newNDChoiceStatement, newNDChoiceStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreIncrementDecrement getPreIncrementDecrement()
  {
    return preIncrementDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreIncrementDecrement(PreIncrementDecrement newPreIncrementDecrement, NotificationChain msgs)
  {
    PreIncrementDecrement oldPreIncrementDecrement = preIncrementDecrement;
    preIncrementDecrement = newPreIncrementDecrement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT, oldPreIncrementDecrement, newPreIncrementDecrement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreIncrementDecrement(PreIncrementDecrement newPreIncrementDecrement)
  {
    if (newPreIncrementDecrement != preIncrementDecrement)
    {
      NotificationChain msgs = null;
      if (preIncrementDecrement != null)
        msgs = ((InternalEObject)preIncrementDecrement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT, null, msgs);
      if (newPreIncrementDecrement != null)
        msgs = ((InternalEObject)newPreIncrementDecrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT, null, msgs);
      msgs = basicSetPreIncrementDecrement(newPreIncrementDecrement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT, newPreIncrementDecrement, newPreIncrementDecrement));
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
      case JoliePackage.BASIC_STATEMENT__PROCESS:
        return basicSetProcess(null, msgs);
      case JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT:
        return basicSetAssignStatementOrPostIncrementDecrement(null, msgs);
      case JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT:
        return basicSetNDChoiceStatement(null, msgs);
      case JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT:
        return basicSetPreIncrementDecrement(null, msgs);
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
      case JoliePackage.BASIC_STATEMENT__PROCESS:
        return getProcess();
      case JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT:
        return getAssignStatementOrPostIncrementDecrement();
      case JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT:
        return getNDChoiceStatement();
      case JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT:
        return getPreIncrementDecrement();
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
      case JoliePackage.BASIC_STATEMENT__PROCESS:
        setProcess((jolie.xtext.jolie.Process)newValue);
        return;
      case JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT:
        setAssignStatementOrPostIncrementDecrement((AssignStatementOrPostIncrementDecrementOrInputOperation)newValue);
        return;
      case JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT:
        setNDChoiceStatement((NDChoiceStatement)newValue);
        return;
      case JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT:
        setPreIncrementDecrement((PreIncrementDecrement)newValue);
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
      case JoliePackage.BASIC_STATEMENT__PROCESS:
        setProcess((jolie.xtext.jolie.Process)null);
        return;
      case JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT:
        setAssignStatementOrPostIncrementDecrement((AssignStatementOrPostIncrementDecrementOrInputOperation)null);
        return;
      case JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT:
        setNDChoiceStatement((NDChoiceStatement)null);
        return;
      case JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT:
        setPreIncrementDecrement((PreIncrementDecrement)null);
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
      case JoliePackage.BASIC_STATEMENT__PROCESS:
        return process != null;
      case JoliePackage.BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT:
        return assignStatementOrPostIncrementDecrement != null;
      case JoliePackage.BASIC_STATEMENT__ND_CHOICE_STATEMENT:
        return ndChoiceStatement != null;
      case JoliePackage.BASIC_STATEMENT__PRE_INCREMENT_DECREMENT:
        return preIncrementDecrement != null;
    }
    return super.eIsSet(featureID);
  }

} //BasicStatementImpl
