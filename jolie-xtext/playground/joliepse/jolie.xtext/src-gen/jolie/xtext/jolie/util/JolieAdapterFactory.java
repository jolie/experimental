/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.util;

import jolie.xtext.jolie.AssignStatement;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.IntLiteral;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.MainProcess2;
import jolie.xtext.jolie.NDChoiceStatement;
import jolie.xtext.jolie.OLSyntaxNode;
import jolie.xtext.jolie.Operation;
import jolie.xtext.jolie.ParallelStatement;
import jolie.xtext.jolie.PostDecrementStatement;
import jolie.xtext.jolie.PostIncrementStatement;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.RealLiteral;
import jolie.xtext.jolie.SequenceStatement;
import jolie.xtext.jolie.VariablePath;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jolie.xtext.jolie.JoliePackage
 * @generated
 */
public class JolieAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JoliePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JolieAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JoliePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JolieSwitch<Adapter> modelSwitch =
    new JolieSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter caseMainProcess(MainProcess object)
      {
        return createMainProcessAdapter();
      }
      @Override
      public Adapter caseProcess(jolie.xtext.jolie.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseParallelStatement(ParallelStatement object)
      {
        return createParallelStatementAdapter();
      }
      @Override
      public Adapter caseSequenceStatement(SequenceStatement object)
      {
        return createSequenceStatementAdapter();
      }
      @Override
      public Adapter caseBasicStatement(BasicStatement object)
      {
        return createBasicStatementAdapter();
      }
      @Override
      public Adapter caseAssignStatement(AssignStatement object)
      {
        return createAssignStatementAdapter();
      }
      @Override
      public Adapter casePostIncrementStatement(PostIncrementStatement object)
      {
        return createPostIncrementStatementAdapter();
      }
      @Override
      public Adapter casePostDecrementStatement(PostDecrementStatement object)
      {
        return createPostDecrementStatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseNDChoiceStatement(NDChoiceStatement object)
      {
        return createNDChoiceStatementAdapter();
      }
      @Override
      public Adapter caseVariablePath(VariablePath object)
      {
        return createVariablePathAdapter();
      }
      @Override
      public Adapter caseOLSyntaxNode(OLSyntaxNode object)
      {
        return createOLSyntaxNodeAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseRealLiteral(RealLiteral object)
      {
        return createRealLiteralAdapter();
      }
      @Override
      public Adapter caseString(jolie.xtext.jolie.String object)
      {
        return createStringAdapter();
      }
      @Override
      public Adapter caseMainProcess2(MainProcess2 object)
      {
        return createMainProcess2Adapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.MainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.MainProcess
   * @generated
   */
  public Adapter createMainProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.ParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.ParallelStatement
   * @generated
   */
  public Adapter createParallelStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.SequenceStatement <em>Sequence Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.SequenceStatement
   * @generated
   */
  public Adapter createSequenceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.BasicStatement <em>Basic Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.BasicStatement
   * @generated
   */
  public Adapter createBasicStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.AssignStatement <em>Assign Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.AssignStatement
   * @generated
   */
  public Adapter createAssignStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.PostIncrementStatement <em>Post Increment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.PostIncrementStatement
   * @generated
   */
  public Adapter createPostIncrementStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.PostDecrementStatement <em>Post Decrement Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.PostDecrementStatement
   * @generated
   */
  public Adapter createPostDecrementStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.NDChoiceStatement <em>ND Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.NDChoiceStatement
   * @generated
   */
  public Adapter createNDChoiceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.VariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.VariablePath
   * @generated
   */
  public Adapter createVariablePathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.OLSyntaxNode <em>OL Syntax Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.OLSyntaxNode
   * @generated
   */
  public Adapter createOLSyntaxNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.RealLiteral
   * @generated
   */
  public Adapter createRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.String
   * @generated
   */
  public Adapter createStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.MainProcess2 <em>Main Process2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.MainProcess2
   * @generated
   */
  public Adapter createMainProcess2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JolieAdapterFactory
