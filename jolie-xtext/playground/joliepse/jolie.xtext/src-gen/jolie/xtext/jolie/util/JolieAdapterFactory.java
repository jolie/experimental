/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.util;

import jolie.xtext.jolie.Aggregates;
import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement;
import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Body;
import jolie.xtext.jolie.Condition;
import jolie.xtext.jolie.Define;
import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.For;
import jolie.xtext.jolie.Foreach;
import jolie.xtext.jolie.Include;
import jolie.xtext.jolie.Init;
import jolie.xtext.jolie.InputOperation;
import jolie.xtext.jolie.InputPortStatement;
import jolie.xtext.jolie.InstallFunciton;
import jolie.xtext.jolie.IntLiteral;
import jolie.xtext.jolie.Interface;
import jolie.xtext.jolie.Interfaces;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Location;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.NDChoiceStatement;
import jolie.xtext.jolie.Native_type_sub;
import jolie.xtext.jolie.OLSyntaxNode;
import jolie.xtext.jolie.OneWayOperation;
import jolie.xtext.jolie.Operation;
import jolie.xtext.jolie.OutputOperation;
import jolie.xtext.jolie.OutputPortStatement;
import jolie.xtext.jolie.ParallelStatement;
import jolie.xtext.jolie.Port;
import jolie.xtext.jolie.PreIncrementDecrement;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.Protocol;
import jolie.xtext.jolie.RealLiteral;
import jolie.xtext.jolie.Redirects;
import jolie.xtext.jolie.RequestResponseOperation;
import jolie.xtext.jolie.RightCondition;
import jolie.xtext.jolie.RightSide;
import jolie.xtext.jolie.SequenceStatement;
import jolie.xtext.jolie.Subtypes;
import jolie.xtext.jolie.Synchronized;
import jolie.xtext.jolie.Type;
import jolie.xtext.jolie.TypeDefinition;
import jolie.xtext.jolie.Typedef;
import jolie.xtext.jolie.Undef;
import jolie.xtext.jolie.Uri;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;
import jolie.xtext.jolie.linkIn;

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
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTypedef(Typedef object)
      {
        return createTypedefAdapter();
      }
      @Override
      public Adapter caseSubtypes(Subtypes object)
      {
        return createSubtypesAdapter();
      }
      @Override
      public Adapter caseNative_type_sub(Native_type_sub object)
      {
        return createNative_type_subAdapter();
      }
      @Override
      public Adapter caseDefine(Define object)
      {
        return createDefineAdapter();
      }
      @Override
      public Adapter caseInit(Init object)
      {
        return createInitAdapter();
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
      public Adapter caselinkIn(linkIn object)
      {
        return createlinkInAdapter();
      }
      @Override
      public Adapter caseAssignStatementOrPostIncrementDecrementOrInputOperation(AssignStatementOrPostIncrementDecrementOrInputOperation object)
      {
        return createAssignStatementOrPostIncrementDecrementOrInputOperationAdapter();
      }
      @Override
      public Adapter caseRightSide(RightSide object)
      {
        return createRightSideAdapter();
      }
      @Override
      public Adapter caseSynchronized(Synchronized object)
      {
        return createSynchronizedAdapter();
      }
      @Override
      public Adapter caseUndef(Undef object)
      {
        return createUndefAdapter();
      }
      @Override
      public Adapter caseOutputOperation(OutputOperation object)
      {
        return createOutputOperationAdapter();
      }
      @Override
      public Adapter caseInstallFunciton(InstallFunciton object)
      {
        return createInstallFuncitonAdapter();
      }
      @Override
      public Adapter caseInputOperation(InputOperation object)
      {
        return createInputOperationAdapter();
      }
      @Override
      public Adapter casePreIncrementDecrement(PreIncrementDecrement object)
      {
        return createPreIncrementDecrementAdapter();
      }
      @Override
      public Adapter caseFor(For object)
      {
        return createForAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseRightCondition(RightCondition object)
      {
        return createRightConditionAdapter();
      }
      @Override
      public Adapter caseForeach(Foreach object)
      {
        return createForeachAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseVariablePath(VariablePath object)
      {
        return createVariablePathAdapter();
      }
      @Override
      public Adapter caseWith(With object)
      {
        return createWithAdapter();
      }
      @Override
      public Adapter caseNDChoiceStatement(NDChoiceStatement object)
      {
        return createNDChoiceStatementAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseInputPortStatement(InputPortStatement object)
      {
        return createInputPortStatementAdapter();
      }
      @Override
      public Adapter caseOutputPortStatement(OutputPortStatement object)
      {
        return createOutputPortStatementAdapter();
      }
      @Override
      public Adapter caseOneWayOperation(OneWayOperation object)
      {
        return createOneWayOperationAdapter();
      }
      @Override
      public Adapter caseRequestResponseOperation(RequestResponseOperation object)
      {
        return createRequestResponseOperationAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseUri(Uri object)
      {
        return createUriAdapter();
      }
      @Override
      public Adapter caseInterfaces(Interfaces object)
      {
        return createInterfacesAdapter();
      }
      @Override
      public Adapter caseProtocol(Protocol object)
      {
        return createProtocolAdapter();
      }
      @Override
      public Adapter caseRedirects(Redirects object)
      {
        return createRedirectsAdapter();
      }
      @Override
      public Adapter caseAggregates(Aggregates object)
      {
        return createAggregatesAdapter();
      }
      @Override
      public Adapter caseOLSyntaxNode(OLSyntaxNode object)
      {
        return createOLSyntaxNodeAdapter();
      }
      @Override
      public Adapter caseAssignStatementOrPostIncrementDecrement(AssignStatementOrPostIncrementDecrement object)
      {
        return createAssignStatementOrPostIncrementDecrementAdapter();
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
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Typedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Typedef
   * @generated
   */
  public Adapter createTypedefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Subtypes <em>Subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Subtypes
   * @generated
   */
  public Adapter createSubtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Native_type_sub <em>Native type sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Native_type_sub
   * @generated
   */
  public Adapter createNative_type_subAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Define
   * @generated
   */
  public Adapter createDefineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Init
   * @generated
   */
  public Adapter createInitAdapter()
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
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.linkIn <em>link In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.linkIn
   * @generated
   */
  public Adapter createlinkInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation <em>Assign Statement Or Post Increment Decrement Or Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation
   * @generated
   */
  public Adapter createAssignStatementOrPostIncrementDecrementOrInputOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.RightSide <em>Right Side</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.RightSide
   * @generated
   */
  public Adapter createRightSideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Synchronized <em>Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Synchronized
   * @generated
   */
  public Adapter createSynchronizedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Undef <em>Undef</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Undef
   * @generated
   */
  public Adapter createUndefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.OutputOperation <em>Output Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.OutputOperation
   * @generated
   */
  public Adapter createOutputOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.InstallFunciton <em>Install Funciton</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.InstallFunciton
   * @generated
   */
  public Adapter createInstallFuncitonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.InputOperation <em>Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.InputOperation
   * @generated
   */
  public Adapter createInputOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.PreIncrementDecrement <em>Pre Increment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.PreIncrementDecrement
   * @generated
   */
  public Adapter createPreIncrementDecrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.For
   * @generated
   */
  public Adapter createForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.RightCondition <em>Right Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.RightCondition
   * @generated
   */
  public Adapter createRightConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Foreach <em>Foreach</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Foreach
   * @generated
   */
  public Adapter createForeachAdapter()
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
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.With <em>With</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.With
   * @generated
   */
  public Adapter createWithAdapter()
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
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.InputPortStatement <em>Input Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.InputPortStatement
   * @generated
   */
  public Adapter createInputPortStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.OutputPortStatement <em>Output Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.OutputPortStatement
   * @generated
   */
  public Adapter createOutputPortStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.OneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.OneWayOperation
   * @generated
   */
  public Adapter createOneWayOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.RequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.RequestResponseOperation
   * @generated
   */
  public Adapter createRequestResponseOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Uri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Uri
   * @generated
   */
  public Adapter createUriAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Interfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Interfaces
   * @generated
   */
  public Adapter createInterfacesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Protocol
   * @generated
   */
  public Adapter createProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Redirects <em>Redirects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Redirects
   * @generated
   */
  public Adapter createRedirectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.Aggregates <em>Aggregates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.Aggregates
   * @generated
   */
  public Adapter createAggregatesAdapter()
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
   * Creates a new adapter for an object of class '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement <em>Assign Statement Or Post Increment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement
   * @generated
   */
  public Adapter createAssignStatementOrPostIncrementDecrementAdapter()
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
