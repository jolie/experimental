/**
 * <copyright>
 * </copyright>
 *
 */
package jolie.xtext.jolie;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jolie.xtext.jolie.JolieFactory
 * @model kind="package"
 * @generated
 */
public interface JoliePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jolie";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Jolie";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jolie";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JoliePackage eINSTANCE = jolie.xtext.jolie.impl.JoliePackageImpl.init();

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ProgramImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PORTS = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__TYPES = 1;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.TypeImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPEDEF = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.TYPEDEFImpl <em>TYPEDEF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.TYPEDEFImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getTYPEDEF()
   * @generated
   */
  int TYPEDEF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__TYPEDEF = 1;

  /**
   * The number of structural features of the '<em>TYPEDEF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.MainImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMain()
   * @generated
   */
  int MAIN = 3;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__MAINROCESS = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.MainProcessImpl <em>Main Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.MainProcessImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMainProcess()
   * @generated
   */
  int MAIN_PROCESS = 4;

  /**
   * The number of structural features of the '<em>Main Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_PROCESS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ProcessImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 5;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ParallelStatementImpl <em>Parallel Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ParallelStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getParallelStatement()
   * @generated
   */
  int PARALLEL_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_STATEMENT__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Parallel Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALLEL_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.SequenceStatementImpl <em>Sequence Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.SequenceStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSequenceStatement()
   * @generated
   */
  int SEQUENCE_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_STATEMENT__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Sequence Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.BasicStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBasicStatement()
   * @generated
   */
  int BASIC_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__PROCESS = 0;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = 1;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__ND_CHOICE_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__PRE_INCREMENT_DECREMENT = 3;

  /**
   * The number of structural features of the '<em>Basic Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl <em>Assign Statement Or Post Increment Decrement Or Input Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatementOrPostIncrementDecrementOrInputOperation()
   * @generated
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION = 9;

  /**
   * The number of structural features of the '<em>Assign Statement Or Post Increment Decrement Or Input Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RightSideImpl <em>Right Side</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RightSideImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRightSide()
   * @generated
   */
  int RIGHT_SIDE = 10;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE__VARIABLE_PATH = 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE__OPERATION = 2;

  /**
   * The number of structural features of the '<em>Right Side</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ExpressionImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VARIABLE_PATH = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 11;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Main Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__MAIN_PROCESS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.PreIncrementDecrementImpl <em>Pre Increment Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.PreIncrementDecrementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getPreIncrementDecrement()
   * @generated
   */
  int PRE_INCREMENT_DECREMENT = 12;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INCREMENT_DECREMENT__VARIABLE_PATH = 0;

  /**
   * The number of structural features of the '<em>Pre Increment Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INCREMENT_DECREMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.VariablePathImpl <em>Variable Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.VariablePathImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getVariablePath()
   * @generated
   */
  int VARIABLE_PATH = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__NAME = 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__CHILDREN = 1;

  /**
   * The number of structural features of the '<em>Variable Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.WithImpl <em>With</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.WithImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getWith()
   * @generated
   */
  int WITH = 15;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__PROCESS = BASIC_STATEMENT__PROCESS;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__ND_CHOICE_STATEMENT = BASIC_STATEMENT__ND_CHOICE_STATEMENT;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__PRE_INCREMENT_DECREMENT = BASIC_STATEMENT__PRE_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__NAME = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__MAINROCESS = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>With</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl <em>ND Choice Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.NDChoiceStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getNDChoiceStatement()
   * @generated
   */
  int ND_CHOICE_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__VARIABLE_PATH = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__OPERATION = 1;

  /**
   * The feature id for the '<em><b>Main Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__MAIN_PROCESS = 2;

  /**
   * The number of structural features of the '<em>ND Choice Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.PortImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getPort()
   * @generated
   */
  int PORT = 17;

  /**
   * The feature id for the '<em><b>Input Port Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__INPUT_PORT_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Output Port Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__OUTPUT_PORT_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InputPortStatementImpl <em>Input Port Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InputPortStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInputPortStatement()
   * @generated
   */
  int INPUT_PORT_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__PROTOCOL = 2;

  /**
   * The feature id for the '<em><b>One Way Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__ONE_WAY_OPERATION = 3;

  /**
   * The feature id for the '<em><b>Request Response Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION = 4;

  /**
   * The feature id for the '<em><b>Redirects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__REDIRECTS = 5;

  /**
   * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__AGGREGATES = 6;

  /**
   * The feature id for the '<em><b>Intefaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT__INTEFACES = 7;

  /**
   * The number of structural features of the '<em>Input Port Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PORT_STATEMENT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OutputPortStatementImpl <em>Output Port Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OutputPortStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOutputPortStatement()
   * @generated
   */
  int OUTPUT_PORT_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT__PROTOCOL = 2;

  /**
   * The feature id for the '<em><b>One Way Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION = 3;

  /**
   * The feature id for the '<em><b>Request Response Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION = 4;

  /**
   * The feature id for the '<em><b>Intefaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT__INTEFACES = 5;

  /**
   * The number of structural features of the '<em>Output Port Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PORT_STATEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OneWayOperationImpl <em>One Way Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OneWayOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOneWayOperation()
   * @generated
   */
  int ONE_WAY_OPERATION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION__TYPE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION__CHILDREN = 2;

  /**
   * The number of structural features of the '<em>One Way Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_OPERATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RequestResponseOperationImpl <em>Request Response Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RequestResponseOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRequestResponseOperation()
   * @generated
   */
  int REQUEST_RESPONSE_OPERATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION__TYPE_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Request Response Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_RESPONSE_OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.TypeDefinitionImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.LocationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 23;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__URI = 0;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.UriImpl <em>Uri</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.UriImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getUri()
   * @generated
   */
  int URI = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__NAME = 0;

  /**
   * The number of structural features of the '<em>Uri</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InterfacesImpl <em>Interfaces</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InterfacesImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInterfaces()
   * @generated
   */
  int INTERFACES = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACES__NAME = 0;

  /**
   * The number of structural features of the '<em>Interfaces</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ProtocolImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = 0;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RedirectsImpl <em>Redirects</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RedirectsImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRedirects()
   * @generated
   */
  int REDIRECTS = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Output Port Identifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTS__OUTPUT_PORT_IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>Redirects</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDIRECTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.AggregatesImpl <em>Aggregates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.AggregatesImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAggregates()
   * @generated
   */
  int AGGREGATES = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATES__NAME = 0;

  /**
   * The number of structural features of the '<em>Aggregates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OLSyntaxNodeImpl <em>OL Syntax Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OLSyntaxNodeImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOLSyntaxNode()
   * @generated
   */
  int OL_SYNTAX_NODE = 29;

  /**
   * The feature id for the '<em><b>Parallel Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OL_SYNTAX_NODE__PARALLEL_STATEMENT = MAIN_PROCESS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>OL Syntax Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OL_SYNTAX_NODE_FEATURE_COUNT = MAIN_PROCESS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementImpl <em>Assign Statement Or Post Increment Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatementOrPostIncrementDecrement()
   * @generated
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = 30;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH = ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE = ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Statement Or Post Increment Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_FEATURE_COUNT = ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.IntLiteralImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RealLiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RealLiteralImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRealLiteral()
   * @generated
   */
  int REAL_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.StringImpl <em>String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.StringImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getString()
   * @generated
   */
  int STRING = 33;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see jolie.xtext.jolie.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Program#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see jolie.xtext.jolie.Program#getPorts()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Program#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see jolie.xtext.jolie.Program#getTypes()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Types();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Program#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see jolie.xtext.jolie.Program#getMain()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Main();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see jolie.xtext.jolie.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Type#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedef</em>'.
   * @see jolie.xtext.jolie.Type#getTypedef()
   * @see #getType()
   * @generated
   */
  EReference getType_Typedef();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.TYPEDEF <em>TYPEDEF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TYPEDEF</em>'.
   * @see jolie.xtext.jolie.TYPEDEF
   * @generated
   */
  EClass getTYPEDEF();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.TYPEDEF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.TYPEDEF#getName()
   * @see #getTYPEDEF()
   * @generated
   */
  EAttribute getTYPEDEF_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.TYPEDEF#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedef</em>'.
   * @see jolie.xtext.jolie.TYPEDEF#getTypedef()
   * @see #getTYPEDEF()
   * @generated
   */
  EReference getTYPEDEF_Typedef();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see jolie.xtext.jolie.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Main#getMainrocess <em>Mainrocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainrocess</em>'.
   * @see jolie.xtext.jolie.Main#getMainrocess()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Mainrocess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.MainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.MainProcess
   * @generated
   */
  EClass getMainProcess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see jolie.xtext.jolie.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Process#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.Process#getChildren()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.ParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parallel Statement</em>'.
   * @see jolie.xtext.jolie.ParallelStatement
   * @generated
   */
  EClass getParallelStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.ParallelStatement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.ParallelStatement#getChildren()
   * @see #getParallelStatement()
   * @generated
   */
  EReference getParallelStatement_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.SequenceStatement <em>Sequence Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Statement</em>'.
   * @see jolie.xtext.jolie.SequenceStatement
   * @generated
   */
  EClass getSequenceStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.SequenceStatement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.SequenceStatement#getChildren()
   * @see #getSequenceStatement()
   * @generated
   */
  EReference getSequenceStatement_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.BasicStatement <em>Basic Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Statement</em>'.
   * @see jolie.xtext.jolie.BasicStatement
   * @generated
   */
  EClass getBasicStatement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.BasicStatement#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Process</em>'.
   * @see jolie.xtext.jolie.BasicStatement#getProcess()
   * @see #getBasicStatement()
   * @generated
   */
  EReference getBasicStatement_Process();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.BasicStatement#getAssignStatementOrPostIncrementDecrement <em>Assign Statement Or Post Increment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign Statement Or Post Increment Decrement</em>'.
   * @see jolie.xtext.jolie.BasicStatement#getAssignStatementOrPostIncrementDecrement()
   * @see #getBasicStatement()
   * @generated
   */
  EReference getBasicStatement_AssignStatementOrPostIncrementDecrement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.BasicStatement#getNDChoiceStatement <em>ND Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ND Choice Statement</em>'.
   * @see jolie.xtext.jolie.BasicStatement#getNDChoiceStatement()
   * @see #getBasicStatement()
   * @generated
   */
  EReference getBasicStatement_NDChoiceStatement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.BasicStatement#getPreIncrementDecrement <em>Pre Increment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Increment Decrement</em>'.
   * @see jolie.xtext.jolie.BasicStatement#getPreIncrementDecrement()
   * @see #getBasicStatement()
   * @generated
   */
  EReference getBasicStatement_PreIncrementDecrement();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation <em>Assign Statement Or Post Increment Decrement Or Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Statement Or Post Increment Decrement Or Input Operation</em>'.
   * @see jolie.xtext.jolie.AssignStatementOrPostIncrementDecrementOrInputOperation
   * @generated
   */
  EClass getAssignStatementOrPostIncrementDecrementOrInputOperation();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RightSide <em>Right Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Side</em>'.
   * @see jolie.xtext.jolie.RightSide
   * @generated
   */
  EClass getRightSide();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RightSide#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.RightSide#getExpression()
   * @see #getRightSide()
   * @generated
   */
  EReference getRightSide_Expression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RightSide#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.RightSide#getVariablePath()
   * @see #getRightSide()
   * @generated
   */
  EReference getRightSide_VariablePath();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RightSide#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see jolie.xtext.jolie.RightSide#getOperation()
   * @see #getRightSide()
   * @generated
   */
  EReference getRightSide_Operation();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see jolie.xtext.jolie.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Operation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.Operation#getExpression()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Expression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Operation#getMainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.Operation#getMainProcess()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_MainProcess();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see jolie.xtext.jolie.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see jolie.xtext.jolie.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see jolie.xtext.jolie.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.PreIncrementDecrement <em>Pre Increment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Increment Decrement</em>'.
   * @see jolie.xtext.jolie.PreIncrementDecrement
   * @generated
   */
  EClass getPreIncrementDecrement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.PreIncrementDecrement#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.PreIncrementDecrement#getVariablePath()
   * @see #getPreIncrementDecrement()
   * @generated
   */
  EReference getPreIncrementDecrement_VariablePath();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see jolie.xtext.jolie.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Expression#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.Expression#getVariablePath()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_VariablePath();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.VariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.VariablePath
   * @generated
   */
  EClass getVariablePath();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.VariablePath#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.VariablePath#getName()
   * @see #getVariablePath()
   * @generated
   */
  EAttribute getVariablePath_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.VariablePath#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see jolie.xtext.jolie.VariablePath#getChildren()
   * @see #getVariablePath()
   * @generated
   */
  EReference getVariablePath_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.With <em>With</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With</em>'.
   * @see jolie.xtext.jolie.With
   * @generated
   */
  EClass getWith();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.With#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.With#getName()
   * @see #getWith()
   * @generated
   */
  EAttribute getWith_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.With#getMainrocess <em>Mainrocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mainrocess</em>'.
   * @see jolie.xtext.jolie.With#getMainrocess()
   * @see #getWith()
   * @generated
   */
  EReference getWith_Mainrocess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.NDChoiceStatement <em>ND Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ND Choice Statement</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement
   * @generated
   */
  EClass getNDChoiceStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getVariablePath()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_VariablePath();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getOperation()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_Operation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getMainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getMainProcess()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_MainProcess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see jolie.xtext.jolie.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Port#getInputPortStatement <em>Input Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Port Statement</em>'.
   * @see jolie.xtext.jolie.Port#getInputPortStatement()
   * @see #getPort()
   * @generated
   */
  EReference getPort_InputPortStatement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Port#getOutputPortStatement <em>Output Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output Port Statement</em>'.
   * @see jolie.xtext.jolie.Port#getOutputPortStatement()
   * @see #getPort()
   * @generated
   */
  EReference getPort_OutputPortStatement();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.InputPortStatement <em>Input Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Port Statement</em>'.
   * @see jolie.xtext.jolie.InputPortStatement
   * @generated
   */
  EClass getInputPortStatement();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.InputPortStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getName()
   * @see #getInputPortStatement()
   * @generated
   */
  EAttribute getInputPortStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Location</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getLocation()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_Location();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocol</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getProtocol()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_Protocol();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getOneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>One Way Operation</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getOneWayOperation()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_OneWayOperation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getRequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Request Response Operation</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getRequestResponseOperation()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_RequestResponseOperation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getRedirects <em>Redirects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Redirects</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getRedirects()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_Redirects();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getAggregates <em>Aggregates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aggregates</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getAggregates()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_Aggregates();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InputPortStatement#getIntefaces <em>Intefaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intefaces</em>'.
   * @see jolie.xtext.jolie.InputPortStatement#getIntefaces()
   * @see #getInputPortStatement()
   * @generated
   */
  EReference getInputPortStatement_Intefaces();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.OutputPortStatement <em>Output Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Port Statement</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement
   * @generated
   */
  EClass getOutputPortStatement();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.OutputPortStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement#getName()
   * @see #getOutputPortStatement()
   * @generated
   */
  EAttribute getOutputPortStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.OutputPortStatement#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Location</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement#getLocation()
   * @see #getOutputPortStatement()
   * @generated
   */
  EReference getOutputPortStatement_Location();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.OutputPortStatement#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocol</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement#getProtocol()
   * @see #getOutputPortStatement()
   * @generated
   */
  EReference getOutputPortStatement_Protocol();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.OutputPortStatement#getOneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>One Way Operation</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement#getOneWayOperation()
   * @see #getOutputPortStatement()
   * @generated
   */
  EReference getOutputPortStatement_OneWayOperation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.OutputPortStatement#getRequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Request Response Operation</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement#getRequestResponseOperation()
   * @see #getOutputPortStatement()
   * @generated
   */
  EReference getOutputPortStatement_RequestResponseOperation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.OutputPortStatement#getIntefaces <em>Intefaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intefaces</em>'.
   * @see jolie.xtext.jolie.OutputPortStatement#getIntefaces()
   * @see #getOutputPortStatement()
   * @generated
   */
  EReference getOutputPortStatement_Intefaces();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.OneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Way Operation</em>'.
   * @see jolie.xtext.jolie.OneWayOperation
   * @generated
   */
  EClass getOneWayOperation();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.OneWayOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.OneWayOperation#getName()
   * @see #getOneWayOperation()
   * @generated
   */
  EAttribute getOneWayOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.OneWayOperation#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Definition</em>'.
   * @see jolie.xtext.jolie.OneWayOperation#getTypeDefinition()
   * @see #getOneWayOperation()
   * @generated
   */
  EReference getOneWayOperation_TypeDefinition();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.OneWayOperation#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Children</em>'.
   * @see jolie.xtext.jolie.OneWayOperation#getChildren()
   * @see #getOneWayOperation()
   * @generated
   */
  EAttribute getOneWayOperation_Children();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request Response Operation</em>'.
   * @see jolie.xtext.jolie.RequestResponseOperation
   * @generated
   */
  EClass getRequestResponseOperation();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.RequestResponseOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.RequestResponseOperation#getName()
   * @see #getRequestResponseOperation()
   * @generated
   */
  EAttribute getRequestResponseOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.RequestResponseOperation#getTypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Definition</em>'.
   * @see jolie.xtext.jolie.RequestResponseOperation#getTypeDefinition()
   * @see #getRequestResponseOperation()
   * @generated
   */
  EReference getRequestResponseOperation_TypeDefinition();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see jolie.xtext.jolie.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the reference list '{@link jolie.xtext.jolie.TypeDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type</em>'.
   * @see jolie.xtext.jolie.TypeDefinition#getType()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Type();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see jolie.xtext.jolie.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Location#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uri</em>'.
   * @see jolie.xtext.jolie.Location#getUri()
   * @see #getLocation()
   * @generated
   */
  EReference getLocation_Uri();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Uri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uri</em>'.
   * @see jolie.xtext.jolie.Uri
   * @generated
   */
  EClass getUri();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Uri#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Uri#getName()
   * @see #getUri()
   * @generated
   */
  EAttribute getUri_Name();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Interfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interfaces</em>'.
   * @see jolie.xtext.jolie.Interfaces
   * @generated
   */
  EClass getInterfaces();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Interfaces#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Interfaces#getName()
   * @see #getInterfaces()
   * @generated
   */
  EAttribute getInterfaces_Name();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see jolie.xtext.jolie.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Protocol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Protocol#getName()
   * @see #getProtocol()
   * @generated
   */
  EAttribute getProtocol_Name();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Redirects <em>Redirects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Redirects</em>'.
   * @see jolie.xtext.jolie.Redirects
   * @generated
   */
  EClass getRedirects();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Redirects#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Redirects#getName()
   * @see #getRedirects()
   * @generated
   */
  EAttribute getRedirects_Name();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Redirects#getOutputPortIdentifier <em>Output Port Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Output Port Identifier</em>'.
   * @see jolie.xtext.jolie.Redirects#getOutputPortIdentifier()
   * @see #getRedirects()
   * @generated
   */
  EAttribute getRedirects_OutputPortIdentifier();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Aggregates <em>Aggregates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregates</em>'.
   * @see jolie.xtext.jolie.Aggregates
   * @generated
   */
  EClass getAggregates();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Aggregates#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Aggregates#getName()
   * @see #getAggregates()
   * @generated
   */
  EAttribute getAggregates_Name();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.OLSyntaxNode <em>OL Syntax Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OL Syntax Node</em>'.
   * @see jolie.xtext.jolie.OLSyntaxNode
   * @generated
   */
  EClass getOLSyntaxNode();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.OLSyntaxNode#getParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parallel Statement</em>'.
   * @see jolie.xtext.jolie.OLSyntaxNode#getParallelStatement()
   * @see #getOLSyntaxNode()
   * @generated
   */
  EReference getOLSyntaxNode_ParallelStatement();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement <em>Assign Statement Or Post Increment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Statement Or Post Increment Decrement</em>'.
   * @see jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement
   * @generated
   */
  EClass getAssignStatementOrPostIncrementDecrement();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getVariablePath()
   * @see #getAssignStatementOrPostIncrementDecrement()
   * @generated
   */
  EReference getAssignStatementOrPostIncrementDecrement_VariablePath();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getRightSide <em>Right Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Side</em>'.
   * @see jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getRightSide()
   * @see #getAssignStatementOrPostIncrementDecrement()
   * @generated
   */
  EReference getAssignStatementOrPostIncrementDecrement_RightSide();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see jolie.xtext.jolie.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jolie.xtext.jolie.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see jolie.xtext.jolie.RealLiteral
   * @generated
   */
  EClass getRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.RealLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jolie.xtext.jolie.RealLiteral#getValue()
   * @see #getRealLiteral()
   * @generated
   */
  EAttribute getRealLiteral_Value();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String</em>'.
   * @see jolie.xtext.jolie.String
   * @generated
   */
  EClass getString();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.String#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jolie.xtext.jolie.String#getValue()
   * @see #getString()
   * @generated
   */
  EAttribute getString_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JolieFactory getJolieFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ProgramImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PORTS = eINSTANCE.getProgram_Ports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__TYPES = eINSTANCE.getProgram_Types();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MAIN = eINSTANCE.getProgram_Main();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.TypeImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPEDEF = eINSTANCE.getType_Typedef();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.TYPEDEFImpl <em>TYPEDEF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.TYPEDEFImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getTYPEDEF()
     * @generated
     */
    EClass TYPEDEF = eINSTANCE.getTYPEDEF();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF__NAME = eINSTANCE.getTYPEDEF_Name();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__TYPEDEF = eINSTANCE.getTYPEDEF_Typedef();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.MainImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>Mainrocess</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__MAINROCESS = eINSTANCE.getMain_Mainrocess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.MainProcessImpl <em>Main Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.MainProcessImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMainProcess()
     * @generated
     */
    EClass MAIN_PROCESS = eINSTANCE.getMainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ProcessImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__CHILDREN = eINSTANCE.getProcess_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ParallelStatementImpl <em>Parallel Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ParallelStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getParallelStatement()
     * @generated
     */
    EClass PARALLEL_STATEMENT = eINSTANCE.getParallelStatement();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARALLEL_STATEMENT__CHILDREN = eINSTANCE.getParallelStatement_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.SequenceStatementImpl <em>Sequence Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.SequenceStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSequenceStatement()
     * @generated
     */
    EClass SEQUENCE_STATEMENT = eINSTANCE.getSequenceStatement();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_STATEMENT__CHILDREN = eINSTANCE.getSequenceStatement_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.BasicStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBasicStatement()
     * @generated
     */
    EClass BASIC_STATEMENT = eINSTANCE.getBasicStatement();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_STATEMENT__PROCESS = eINSTANCE.getBasicStatement_Process();

    /**
     * The meta object literal for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = eINSTANCE.getBasicStatement_AssignStatementOrPostIncrementDecrement();

    /**
     * The meta object literal for the '<em><b>ND Choice Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_STATEMENT__ND_CHOICE_STATEMENT = eINSTANCE.getBasicStatement_NDChoiceStatement();

    /**
     * The meta object literal for the '<em><b>Pre Increment Decrement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_STATEMENT__PRE_INCREMENT_DECREMENT = eINSTANCE.getBasicStatement_PreIncrementDecrement();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl <em>Assign Statement Or Post Increment Decrement Or Input Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatementOrPostIncrementDecrementOrInputOperation()
     * @generated
     */
    EClass ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION = eINSTANCE.getAssignStatementOrPostIncrementDecrementOrInputOperation();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RightSideImpl <em>Right Side</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RightSideImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRightSide()
     * @generated
     */
    EClass RIGHT_SIDE = eINSTANCE.getRightSide();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_SIDE__EXPRESSION = eINSTANCE.getRightSide_Expression();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_SIDE__VARIABLE_PATH = eINSTANCE.getRightSide_VariablePath();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_SIDE__OPERATION = eINSTANCE.getRightSide_Operation();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__EXPRESSION = eINSTANCE.getOperation_Expression();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__MAIN_PROCESS = eINSTANCE.getOperation_MainProcess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.PreIncrementDecrementImpl <em>Pre Increment Decrement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.PreIncrementDecrementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getPreIncrementDecrement()
     * @generated
     */
    EClass PRE_INCREMENT_DECREMENT = eINSTANCE.getPreIncrementDecrement();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_INCREMENT_DECREMENT__VARIABLE_PATH = eINSTANCE.getPreIncrementDecrement_VariablePath();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ExpressionImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VARIABLE_PATH = eINSTANCE.getExpression_VariablePath();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.VariablePathImpl <em>Variable Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.VariablePathImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getVariablePath()
     * @generated
     */
    EClass VARIABLE_PATH = eINSTANCE.getVariablePath();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_PATH__NAME = eINSTANCE.getVariablePath_Name();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_PATH__CHILDREN = eINSTANCE.getVariablePath_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.WithImpl <em>With</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.WithImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getWith()
     * @generated
     */
    EClass WITH = eINSTANCE.getWith();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WITH__NAME = eINSTANCE.getWith_Name();

    /**
     * The meta object literal for the '<em><b>Mainrocess</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH__MAINROCESS = eINSTANCE.getWith_Mainrocess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.NDChoiceStatementImpl <em>ND Choice Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.NDChoiceStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getNDChoiceStatement()
     * @generated
     */
    EClass ND_CHOICE_STATEMENT = eINSTANCE.getNDChoiceStatement();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__VARIABLE_PATH = eINSTANCE.getNDChoiceStatement_VariablePath();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__OPERATION = eINSTANCE.getNDChoiceStatement_Operation();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__MAIN_PROCESS = eINSTANCE.getNDChoiceStatement_MainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.PortImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Input Port Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__INPUT_PORT_STATEMENT = eINSTANCE.getPort_InputPortStatement();

    /**
     * The meta object literal for the '<em><b>Output Port Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__OUTPUT_PORT_STATEMENT = eINSTANCE.getPort_OutputPortStatement();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InputPortStatementImpl <em>Input Port Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InputPortStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInputPortStatement()
     * @generated
     */
    EClass INPUT_PORT_STATEMENT = eINSTANCE.getInputPortStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_PORT_STATEMENT__NAME = eINSTANCE.getInputPortStatement_Name();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__LOCATION = eINSTANCE.getInputPortStatement_Location();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__PROTOCOL = eINSTANCE.getInputPortStatement_Protocol();

    /**
     * The meta object literal for the '<em><b>One Way Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__ONE_WAY_OPERATION = eINSTANCE.getInputPortStatement_OneWayOperation();

    /**
     * The meta object literal for the '<em><b>Request Response Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION = eINSTANCE.getInputPortStatement_RequestResponseOperation();

    /**
     * The meta object literal for the '<em><b>Redirects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__REDIRECTS = eINSTANCE.getInputPortStatement_Redirects();

    /**
     * The meta object literal for the '<em><b>Aggregates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__AGGREGATES = eINSTANCE.getInputPortStatement_Aggregates();

    /**
     * The meta object literal for the '<em><b>Intefaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_PORT_STATEMENT__INTEFACES = eINSTANCE.getInputPortStatement_Intefaces();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OutputPortStatementImpl <em>Output Port Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OutputPortStatementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOutputPortStatement()
     * @generated
     */
    EClass OUTPUT_PORT_STATEMENT = eINSTANCE.getOutputPortStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_PORT_STATEMENT__NAME = eINSTANCE.getOutputPortStatement_Name();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_PORT_STATEMENT__LOCATION = eINSTANCE.getOutputPortStatement_Location();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_PORT_STATEMENT__PROTOCOL = eINSTANCE.getOutputPortStatement_Protocol();

    /**
     * The meta object literal for the '<em><b>One Way Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION = eINSTANCE.getOutputPortStatement_OneWayOperation();

    /**
     * The meta object literal for the '<em><b>Request Response Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION = eINSTANCE.getOutputPortStatement_RequestResponseOperation();

    /**
     * The meta object literal for the '<em><b>Intefaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_PORT_STATEMENT__INTEFACES = eINSTANCE.getOutputPortStatement_Intefaces();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OneWayOperationImpl <em>One Way Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OneWayOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOneWayOperation()
     * @generated
     */
    EClass ONE_WAY_OPERATION = eINSTANCE.getOneWayOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_WAY_OPERATION__NAME = eINSTANCE.getOneWayOperation_Name();

    /**
     * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_WAY_OPERATION__TYPE_DEFINITION = eINSTANCE.getOneWayOperation_TypeDefinition();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_WAY_OPERATION__CHILDREN = eINSTANCE.getOneWayOperation_Children();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RequestResponseOperationImpl <em>Request Response Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RequestResponseOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRequestResponseOperation()
     * @generated
     */
    EClass REQUEST_RESPONSE_OPERATION = eINSTANCE.getRequestResponseOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST_RESPONSE_OPERATION__NAME = eINSTANCE.getRequestResponseOperation_Name();

    /**
     * The meta object literal for the '<em><b>Type Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_RESPONSE_OPERATION__TYPE_DEFINITION = eINSTANCE.getRequestResponseOperation_TypeDefinition();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.TypeDefinitionImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__TYPE = eINSTANCE.getTypeDefinition_Type();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.LocationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION__URI = eINSTANCE.getLocation_Uri();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.UriImpl <em>Uri</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.UriImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getUri()
     * @generated
     */
    EClass URI = eINSTANCE.getUri();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__NAME = eINSTANCE.getUri_Name();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InterfacesImpl <em>Interfaces</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InterfacesImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInterfaces()
     * @generated
     */
    EClass INTERFACES = eINSTANCE.getInterfaces();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACES__NAME = eINSTANCE.getInterfaces_Name();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ProtocolImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RedirectsImpl <em>Redirects</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RedirectsImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRedirects()
     * @generated
     */
    EClass REDIRECTS = eINSTANCE.getRedirects();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDIRECTS__NAME = eINSTANCE.getRedirects_Name();

    /**
     * The meta object literal for the '<em><b>Output Port Identifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDIRECTS__OUTPUT_PORT_IDENTIFIER = eINSTANCE.getRedirects_OutputPortIdentifier();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.AggregatesImpl <em>Aggregates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.AggregatesImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAggregates()
     * @generated
     */
    EClass AGGREGATES = eINSTANCE.getAggregates();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATES__NAME = eINSTANCE.getAggregates_Name();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OLSyntaxNodeImpl <em>OL Syntax Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OLSyntaxNodeImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOLSyntaxNode()
     * @generated
     */
    EClass OL_SYNTAX_NODE = eINSTANCE.getOLSyntaxNode();

    /**
     * The meta object literal for the '<em><b>Parallel Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OL_SYNTAX_NODE__PARALLEL_STATEMENT = eINSTANCE.getOLSyntaxNode_ParallelStatement();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementImpl <em>Assign Statement Or Post Increment Decrement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatementOrPostIncrementDecrement()
     * @generated
     */
    EClass ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = eINSTANCE.getAssignStatementOrPostIncrementDecrement();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH = eINSTANCE.getAssignStatementOrPostIncrementDecrement_VariablePath();

    /**
     * The meta object literal for the '<em><b>Right Side</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE = eINSTANCE.getAssignStatementOrPostIncrementDecrement_RightSide();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.IntLiteralImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RealLiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RealLiteralImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRealLiteral()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.StringImpl <em>String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.StringImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getString()
     * @generated
     */
    EClass STRING = eINSTANCE.getString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING__VALUE = eINSTANCE.getString_Value();

  }

} //JoliePackage
