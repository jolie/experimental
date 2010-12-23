/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie.impl;

import jolie.xtext.jolie.Aggregates;
import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement;
import jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation;
import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.Expression;
import jolie.xtext.jolie.InputPortStatement;
import jolie.xtext.jolie.IntLiteral;
import jolie.xtext.jolie.Interfaces;
import jolie.xtext.jolie.JolieFactory;
import jolie.xtext.jolie.JoliePackage;
import jolie.xtext.jolie.Location;
import jolie.xtext.jolie.Main;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.NDChoiceStatement;
import jolie.xtext.jolie.OLSyntaxNode;
import jolie.xtext.jolie.OneWayOperation;
import jolie.xtext.jolie.Operation;
import jolie.xtext.jolie.OutputPortStatement;
import jolie.xtext.jolie.ParallelStatement;
import jolie.xtext.jolie.Port;
import jolie.xtext.jolie.PreIncrementDecrement;
import jolie.xtext.jolie.Program;
import jolie.xtext.jolie.Protocol;
import jolie.xtext.jolie.RealLiteral;
import jolie.xtext.jolie.Redirects;
import jolie.xtext.jolie.RequestResponseOperation;
import jolie.xtext.jolie.RightSide;
import jolie.xtext.jolie.SequenceStatement;
import jolie.xtext.jolie.TYPEDEF;
import jolie.xtext.jolie.Type;
import jolie.xtext.jolie.TypeDefinition;
import jolie.xtext.jolie.Uri;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JolieFactoryImpl extends EFactoryImpl implements JolieFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JolieFactory init()
  {
    try
    {
      JolieFactory theJolieFactory = (JolieFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/Jolie"); 
      if (theJolieFactory != null)
      {
        return theJolieFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JolieFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JolieFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JoliePackage.PROGRAM: return createProgram();
      case JoliePackage.TYPE: return createType();
      case JoliePackage.TYPEDEF: return createTYPEDEF();
      case JoliePackage.MAIN: return createMain();
      case JoliePackage.MAIN_PROCESS: return createMainProcess();
      case JoliePackage.PROCESS: return createProcess();
      case JoliePackage.PARALLEL_STATEMENT: return createParallelStatement();
      case JoliePackage.SEQUENCE_STATEMENT: return createSequenceStatement();
      case JoliePackage.BASIC_STATEMENT: return createBasicStatement();
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION: return createAssignStatementOrPostIncrementDecrementOrInputOperation();
      case JoliePackage.RIGHT_SIDE: return createRightSide();
      case JoliePackage.OPERATION: return createOperation();
      case JoliePackage.PRE_INCREMENT_DECREMENT: return createPreIncrementDecrement();
      case JoliePackage.EXPRESSION: return createExpression();
      case JoliePackage.VARIABLE_PATH: return createVariablePath();
      case JoliePackage.WITH: return createWith();
      case JoliePackage.ND_CHOICE_STATEMENT: return createNDChoiceStatement();
      case JoliePackage.PORT: return createPort();
      case JoliePackage.INPUT_PORT_STATEMENT: return createInputPortStatement();
      case JoliePackage.OUTPUT_PORT_STATEMENT: return createOutputPortStatement();
      case JoliePackage.ONE_WAY_OPERATION: return createOneWayOperation();
      case JoliePackage.REQUEST_RESPONSE_OPERATION: return createRequestResponseOperation();
      case JoliePackage.TYPE_DEFINITION: return createTypeDefinition();
      case JoliePackage.LOCATION: return createLocation();
      case JoliePackage.URI: return createUri();
      case JoliePackage.INTERFACES: return createInterfaces();
      case JoliePackage.PROTOCOL: return createProtocol();
      case JoliePackage.REDIRECTS: return createRedirects();
      case JoliePackage.AGGREGATES: return createAggregates();
      case JoliePackage.OL_SYNTAX_NODE: return createOLSyntaxNode();
      case JoliePackage.ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT: return createAssignStatementOrPostIncrementDecrement();
      case JoliePackage.INT_LITERAL: return createIntLiteral();
      case JoliePackage.REAL_LITERAL: return createRealLiteral();
      case JoliePackage.STRING: return createString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPEDEF createTYPEDEF()
  {
    TYPEDEFImpl typedef = new TYPEDEFImpl();
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainProcess createMainProcess()
  {
    MainProcessImpl mainProcess = new MainProcessImpl();
    return mainProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jolie.xtext.jolie.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParallelStatement createParallelStatement()
  {
    ParallelStatementImpl parallelStatement = new ParallelStatementImpl();
    return parallelStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceStatement createSequenceStatement()
  {
    SequenceStatementImpl sequenceStatement = new SequenceStatementImpl();
    return sequenceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicStatement createBasicStatement()
  {
    BasicStatementImpl basicStatement = new BasicStatementImpl();
    return basicStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignStatementOrPostIncrementDecrementOrInputOperation createAssignStatementOrPostIncrementDecrementOrInputOperation()
  {
    AssignStatementOrPostIncrementDecrementOrInputOperationImpl assignStatementOrPostIncrementDecrementOrInputOperation = new AssignStatementOrPostIncrementDecrementOrInputOperationImpl();
    return assignStatementOrPostIncrementDecrementOrInputOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightSide createRightSide()
  {
    RightSideImpl rightSide = new RightSideImpl();
    return rightSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreIncrementDecrement createPreIncrementDecrement()
  {
    PreIncrementDecrementImpl preIncrementDecrement = new PreIncrementDecrementImpl();
    return preIncrementDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablePath createVariablePath()
  {
    VariablePathImpl variablePath = new VariablePathImpl();
    return variablePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public With createWith()
  {
    WithImpl with = new WithImpl();
    return with;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NDChoiceStatement createNDChoiceStatement()
  {
    NDChoiceStatementImpl ndChoiceStatement = new NDChoiceStatementImpl();
    return ndChoiceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputPortStatement createInputPortStatement()
  {
    InputPortStatementImpl inputPortStatement = new InputPortStatementImpl();
    return inputPortStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputPortStatement createOutputPortStatement()
  {
    OutputPortStatementImpl outputPortStatement = new OutputPortStatementImpl();
    return outputPortStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayOperation createOneWayOperation()
  {
    OneWayOperationImpl oneWayOperation = new OneWayOperationImpl();
    return oneWayOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestResponseOperation createRequestResponseOperation()
  {
    RequestResponseOperationImpl requestResponseOperation = new RequestResponseOperationImpl();
    return requestResponseOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uri createUri()
  {
    UriImpl uri = new UriImpl();
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interfaces createInterfaces()
  {
    InterfacesImpl interfaces = new InterfacesImpl();
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Redirects createRedirects()
  {
    RedirectsImpl redirects = new RedirectsImpl();
    return redirects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregates createAggregates()
  {
    AggregatesImpl aggregates = new AggregatesImpl();
    return aggregates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OLSyntaxNode createOLSyntaxNode()
  {
    OLSyntaxNodeImpl olSyntaxNode = new OLSyntaxNodeImpl();
    return olSyntaxNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignStatementOrPostIncrementDecrement createAssignStatementOrPostIncrementDecrement()
  {
    AssignStatementOrPostIncrementDecrementImpl assignStatementOrPostIncrementDecrement = new AssignStatementOrPostIncrementDecrementImpl();
    return assignStatementOrPostIncrementDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jolie.xtext.jolie.String createString()
  {
    StringImpl string = new StringImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoliePackage getJoliePackage()
  {
    return (JoliePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JoliePackage getPackage()
  {
    return JoliePackage.eINSTANCE;
  }

} //JolieFactoryImpl
