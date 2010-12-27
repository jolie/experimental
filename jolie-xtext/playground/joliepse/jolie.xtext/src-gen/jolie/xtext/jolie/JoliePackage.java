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
   * The feature id for the '<em><b>Include</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INCLUDE = 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PORTS = 1;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INTERFACE = 2;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__TYPES = 3;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INIT = 4;

  /**
   * The feature id for the '<em><b>Execution</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EXECUTION = 5;

  /**
   * The feature id for the '<em><b>Define</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__DEFINE = 6;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 7;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.IncludeImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__PATH = 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.TypeImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

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
   * The meta object id for the '{@link jolie.xtext.jolie.impl.TypedefImpl <em>Typedef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.TypedefImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getTypedef()
   * @generated
   */
  int TYPEDEF = 3;

  /**
   * The feature id for the '<em><b>Subtypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__SUBTYPES = 0;

  /**
   * The number of structural features of the '<em>Typedef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.SubtypesImpl <em>Subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.SubtypesImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSubtypes()
   * @generated
   */
  int SUBTYPES = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPES__NAME = 0;

  /**
   * The feature id for the '<em><b>Native type sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPES__NATIVE_TYPE_SUB = 1;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPES__TYPEDEF = 2;

  /**
   * The number of structural features of the '<em>Subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.Native_type_subImpl <em>Native type sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.Native_type_subImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getNative_type_sub()
   * @generated
   */
  int NATIVE_TYPE_SUB = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_TYPE_SUB__TYPE = 0;

  /**
   * The number of structural features of the '<em>Native type sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_TYPE_SUB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.DefineImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__MAINROCESS = 1;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InitImpl <em>Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InitImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInit()
   * @generated
   */
  int INIT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__NAME = 0;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT__MAINROCESS = 1;

  /**
   * The number of structural features of the '<em>Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.MainImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMain()
   * @generated
   */
  int MAIN = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__MAINROCESS = 1;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.MainProcessImpl <em>Main Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.MainProcessImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getMainProcess()
   * @generated
   */
  int MAIN_PROCESS = 9;

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
  int PROCESS = 10;

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
  int PARALLEL_STATEMENT = 11;

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
  int SEQUENCE_STATEMENT = 12;

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
   * The meta object id for the '{@link jolie.xtext.jolie.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.BodyImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBody()
   * @generated
   */
  int BODY = 24;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.BasicStatementImpl <em>Basic Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.BasicStatementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBasicStatement()
   * @generated
   */
  int BASIC_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__PROCESS = BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BODY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__ND_CHOICE_STATEMENT = BODY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__PRE_INCREMENT_DECREMENT = BODY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT__CALL = BODY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Basic Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT_FEATURE_COUNT = BODY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.linkInImpl <em>link In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.linkInImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getlinkIn()
   * @generated
   */
  int LINK_IN = 14;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN__PROCESS = BASIC_STATEMENT__PROCESS;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN__ND_CHOICE_STATEMENT = BASIC_STATEMENT__ND_CHOICE_STATEMENT;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN__PRE_INCREMENT_DECREMENT = BASIC_STATEMENT__PRE_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN__CALL = BASIC_STATEMENT__CALL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN__NAME = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>link In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_IN_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl <em>Assign Statement Or Post Increment Decrement Or Input Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getAssignStatementOrPostIncrementDecrementOrInputOperation()
   * @generated
   */
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION = 15;

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
  int RIGHT_SIDE = 16;

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
   * The feature id for the '<em><b>Input Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE__INPUT_OPERATION = 2;

  /**
   * The feature id for the '<em><b>Output Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE__OUTPUT_OPERATION = 3;

  /**
   * The number of structural features of the '<em>Right Side</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SIDE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.SynchronizedImpl <em>Synchronized</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.SynchronizedImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSynchronized()
   * @generated
   */
  int SYNCHRONIZED = 17;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__PROCESS = BASIC_STATEMENT__PROCESS;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__ND_CHOICE_STATEMENT = BASIC_STATEMENT__ND_CHOICE_STATEMENT;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__PRE_INCREMENT_DECREMENT = BASIC_STATEMENT__PRE_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__CALL = BASIC_STATEMENT__CALL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__NAME = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Main Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__MAIN_PROCESS = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Synchronized</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.UndefImpl <em>Undef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.UndefImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getUndef()
   * @generated
   */
  int UNDEF = 18;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__PROCESS = BASIC_STATEMENT__PROCESS;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__ND_CHOICE_STATEMENT = BASIC_STATEMENT__ND_CHOICE_STATEMENT;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__PRE_INCREMENT_DECREMENT = BASIC_STATEMENT__PRE_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__CALL = BASIC_STATEMENT__CALL;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__VARIABLE_PATH = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Undef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OutputOperationImpl <em>Output Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OutputOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOutputOperation()
   * @generated
   */
  int OUTPUT_OPERATION = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATION__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATION__VARIABLE_PATH = 2;

  /**
   * The feature id for the '<em><b>Install Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATION__INSTALL_FUNCTION = 3;

  /**
   * The number of structural features of the '<em>Output Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InstallFuncitonImpl <em>Install Funciton</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InstallFuncitonImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInstallFunciton()
   * @generated
   */
  int INSTALL_FUNCITON = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL_FUNCITON__NAME = 0;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL_FUNCITON__PROCESS = 1;

  /**
   * The feature id for the '<em><b>Parallel Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL_FUNCITON__PARALLEL_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Install Funciton</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALL_FUNCITON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InputOperationImpl <em>Input Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InputOperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInputOperation()
   * @generated
   */
  int INPUT_OPERATION = 21;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATION__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Main Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATION__MAIN_PROCESS = 1;

  /**
   * The number of structural features of the '<em>Input Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.PreIncrementDecrementImpl <em>Pre Increment Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.PreIncrementDecrementImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getPreIncrementDecrement()
   * @generated
   */
  int PRE_INCREMENT_DECREMENT = 22;

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
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ForImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getFor()
   * @generated
   */
  int FOR = 23;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__PROCESS = BASIC_STATEMENT__PROCESS;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__ND_CHOICE_STATEMENT = BASIC_STATEMENT__ND_CHOICE_STATEMENT;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__PRE_INCREMENT_DECREMENT = BASIC_STATEMENT__PRE_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__CALL = BASIC_STATEMENT__CALL;

  /**
   * The feature id for the '<em><b>Parallel Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__PARALLEL_STATEMENT = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__CONDITION = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__BODY = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ConditionImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 25;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VARIABLE_PATH = 1;

  /**
   * The feature id for the '<em><b>Right Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__RIGHT_CONDITION = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.RightConditionImpl <em>Right Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.RightConditionImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRightCondition()
   * @generated
   */
  int RIGHT_CONDITION = 26;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_CONDITION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Right Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ForeachImpl <em>Foreach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ForeachImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getForeach()
   * @generated
   */
  int FOREACH = 27;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__PROCESS = BASIC_STATEMENT__PROCESS;

  /**
   * The feature id for the '<em><b>Assign Statement Or Post Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>ND Choice Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__ND_CHOICE_STATEMENT = BASIC_STATEMENT__ND_CHOICE_STATEMENT;

  /**
   * The feature id for the '<em><b>Pre Increment Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__PRE_INCREMENT_DECREMENT = BASIC_STATEMENT__PRE_INCREMENT_DECREMENT;

  /**
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__CALL = BASIC_STATEMENT__CALL;

  /**
   * The feature id for the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__VAR1 = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__VAR2 = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__BODY = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Foreach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.ExpressionImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 28;

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
   * The meta object id for the '{@link jolie.xtext.jolie.impl.VariablePathImpl <em>Variable Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.VariablePathImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getVariablePath()
   * @generated
   */
  int VARIABLE_PATH = 29;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__DOT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__NAME = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH__CHILDREN = 2;

  /**
   * The number of structural features of the '<em>Variable Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_PATH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.WithImpl <em>With</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.WithImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getWith()
   * @generated
   */
  int WITH = 30;

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
   * The feature id for the '<em><b>Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__CALL = BASIC_STATEMENT__CALL;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH__NAME = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mainrocess</b></em>' containment reference.
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
  int ND_CHOICE_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__VARIABLE_PATH = 0;

  /**
   * The feature id for the '<em><b>Input Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CHOICE_STATEMENT__INPUT_OPERATION = 1;

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
   * The meta object id for the '{@link jolie.xtext.jolie.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.InterfaceImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Request Response Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__REQUEST_RESPONSE_OPERATION = 1;

  /**
   * The feature id for the '<em><b>One Way Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__ONE_WAY_OPERATION = 2;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.PortImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getPort()
   * @generated
   */
  int PORT = 33;

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
  int INPUT_PORT_STATEMENT = 34;

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
  int OUTPUT_PORT_STATEMENT = 35;

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
  int ONE_WAY_OPERATION = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
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
  int REQUEST_RESPONSE_OPERATION = 37;

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
  int TYPE_DEFINITION = 38;

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
  int LOCATION = 39;

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
  int URI = 40;

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
  int INTERFACES = 41;

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
  int PROTOCOL = 42;

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
  int REDIRECTS = 43;

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
  int AGGREGATES = 44;

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
  int OL_SYNTAX_NODE = 45;

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
  int ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT = 46;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
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
   * The meta object id for the '{@link jolie.xtext.jolie.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.OperationImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 47;

  /**
   * The feature id for the '<em><b>Variable Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VARIABLE_PATH = EXPRESSION__VARIABLE_PATH;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jolie.xtext.jolie.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jolie.xtext.jolie.impl.IntLiteralImpl
   * @see jolie.xtext.jolie.impl.JoliePackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 48;

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
  int REAL_LITERAL = 49;

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
  int STRING = 50;

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
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Program#getInclude <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Include</em>'.
   * @see jolie.xtext.jolie.Program#getInclude()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Include();

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
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Program#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface</em>'.
   * @see jolie.xtext.jolie.Program#getInterface()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Interface();

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
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Program#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init</em>'.
   * @see jolie.xtext.jolie.Program#getInit()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Init();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Program#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Execution</em>'.
   * @see jolie.xtext.jolie.Program#getExecution()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Execution();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Program#getDefine <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Define</em>'.
   * @see jolie.xtext.jolie.Program#getDefine()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Define();

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
   * Returns the meta object for class '{@link jolie.xtext.jolie.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see jolie.xtext.jolie.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Include#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Path</em>'.
   * @see jolie.xtext.jolie.Include#getPath()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_Path();

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
   * Returns the meta object for class '{@link jolie.xtext.jolie.Typedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef</em>'.
   * @see jolie.xtext.jolie.Typedef
   * @generated
   */
  EClass getTypedef();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Typedef#getSubtypes <em>Subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subtypes</em>'.
   * @see jolie.xtext.jolie.Typedef#getSubtypes()
   * @see #getTypedef()
   * @generated
   */
  EReference getTypedef_Subtypes();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Subtypes <em>Subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtypes</em>'.
   * @see jolie.xtext.jolie.Subtypes
   * @generated
   */
  EClass getSubtypes();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Subtypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Subtypes#getName()
   * @see #getSubtypes()
   * @generated
   */
  EAttribute getSubtypes_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Subtypes#getNative_type_sub <em>Native type sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Native type sub</em>'.
   * @see jolie.xtext.jolie.Subtypes#getNative_type_sub()
   * @see #getSubtypes()
   * @generated
   */
  EReference getSubtypes_Native_type_sub();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Subtypes#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedef</em>'.
   * @see jolie.xtext.jolie.Subtypes#getTypedef()
   * @see #getSubtypes()
   * @generated
   */
  EReference getSubtypes_Typedef();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Native_type_sub <em>Native type sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native type sub</em>'.
   * @see jolie.xtext.jolie.Native_type_sub
   * @generated
   */
  EClass getNative_type_sub();

  /**
   * Returns the meta object for the reference '{@link jolie.xtext.jolie.Native_type_sub#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see jolie.xtext.jolie.Native_type_sub#getType()
   * @see #getNative_type_sub()
   * @generated
   */
  EReference getNative_type_sub_Type();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see jolie.xtext.jolie.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.Define#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.Define#getName()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Name();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Define#getMainrocess <em>Mainrocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainrocess</em>'.
   * @see jolie.xtext.jolie.Define#getMainrocess()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_Mainrocess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init</em>'.
   * @see jolie.xtext.jolie.Init
   * @generated
   */
  EClass getInit();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Init#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Init#getName()
   * @see #getInit()
   * @generated
   */
  EAttribute getInit_Name();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Init#getMainrocess <em>Mainrocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainrocess</em>'.
   * @see jolie.xtext.jolie.Init#getMainrocess()
   * @see #getInit()
   * @generated
   */
  EReference getInit_Mainrocess();

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
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.Main#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.Main#getName()
   * @see #getMain()
   * @generated
   */
  EAttribute getMain_Name();

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
   * Returns the meta object for the reference '{@link jolie.xtext.jolie.BasicStatement#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Call</em>'.
   * @see jolie.xtext.jolie.BasicStatement#getCall()
   * @see #getBasicStatement()
   * @generated
   */
  EReference getBasicStatement_Call();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.linkIn <em>link In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>link In</em>'.
   * @see jolie.xtext.jolie.linkIn
   * @generated
   */
  EClass getlinkIn();

  /**
   * Returns the meta object for the attribute '{@link jolie.xtext.jolie.linkIn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jolie.xtext.jolie.linkIn#getName()
   * @see #getlinkIn()
   * @generated
   */
  EAttribute getlinkIn_Name();

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
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RightSide#getInputOperation <em>Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Operation</em>'.
   * @see jolie.xtext.jolie.RightSide#getInputOperation()
   * @see #getRightSide()
   * @generated
   */
  EReference getRightSide_InputOperation();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RightSide#getOutputOperation <em>Output Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Operation</em>'.
   * @see jolie.xtext.jolie.RightSide#getOutputOperation()
   * @see #getRightSide()
   * @generated
   */
  EReference getRightSide_OutputOperation();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Synchronized <em>Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronized</em>'.
   * @see jolie.xtext.jolie.Synchronized
   * @generated
   */
  EClass getSynchronized();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Synchronized#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Synchronized#getName()
   * @see #getSynchronized()
   * @generated
   */
  EAttribute getSynchronized_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Synchronized#getMainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.Synchronized#getMainProcess()
   * @see #getSynchronized()
   * @generated
   */
  EReference getSynchronized_MainProcess();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Undef <em>Undef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Undef</em>'.
   * @see jolie.xtext.jolie.Undef
   * @generated
   */
  EClass getUndef();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.Undef#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.Undef#getVariablePath()
   * @see #getUndef()
   * @generated
   */
  EReference getUndef_VariablePath();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.OutputOperation <em>Output Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Operation</em>'.
   * @see jolie.xtext.jolie.OutputOperation
   * @generated
   */
  EClass getOutputOperation();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.OutputOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.OutputOperation#getName()
   * @see #getOutputOperation()
   * @generated
   */
  EAttribute getOutputOperation_Name();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.OutputOperation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.OutputOperation#getExpression()
   * @see #getOutputOperation()
   * @generated
   */
  EReference getOutputOperation_Expression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.OutputOperation#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.OutputOperation#getVariablePath()
   * @see #getOutputOperation()
   * @generated
   */
  EReference getOutputOperation_VariablePath();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.OutputOperation#getInstallFunction <em>Install Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Install Function</em>'.
   * @see jolie.xtext.jolie.OutputOperation#getInstallFunction()
   * @see #getOutputOperation()
   * @generated
   */
  EReference getOutputOperation_InstallFunction();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.InstallFunciton <em>Install Funciton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Install Funciton</em>'.
   * @see jolie.xtext.jolie.InstallFunciton
   * @generated
   */
  EClass getInstallFunciton();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.InstallFunciton#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.InstallFunciton#getName()
   * @see #getInstallFunciton()
   * @generated
   */
  EAttribute getInstallFunciton_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InstallFunciton#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process</em>'.
   * @see jolie.xtext.jolie.InstallFunciton#getProcess()
   * @see #getInstallFunciton()
   * @generated
   */
  EReference getInstallFunciton_Process();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.InstallFunciton#getParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parallel Statement</em>'.
   * @see jolie.xtext.jolie.InstallFunciton#getParallelStatement()
   * @see #getInstallFunciton()
   * @generated
   */
  EReference getInstallFunciton_ParallelStatement();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.InputOperation <em>Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Operation</em>'.
   * @see jolie.xtext.jolie.InputOperation
   * @generated
   */
  EClass getInputOperation();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.InputOperation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.InputOperation#getExpression()
   * @see #getInputOperation()
   * @generated
   */
  EReference getInputOperation_Expression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.InputOperation#getMainProcess <em>Main Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Process</em>'.
   * @see jolie.xtext.jolie.InputOperation#getMainProcess()
   * @see #getInputOperation()
   * @generated
   */
  EReference getInputOperation_MainProcess();

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
   * Returns the meta object for class '{@link jolie.xtext.jolie.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see jolie.xtext.jolie.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.For#getParallelStatement <em>Parallel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parallel Statement</em>'.
   * @see jolie.xtext.jolie.For#getParallelStatement()
   * @see #getFor()
   * @generated
   */
  EReference getFor_ParallelStatement();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.For#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see jolie.xtext.jolie.For#getCondition()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Condition();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.For#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see jolie.xtext.jolie.For#getBody()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Body();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see jolie.xtext.jolie.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see jolie.xtext.jolie.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Condition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.Condition#getExpression()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Expression();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Condition#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
   * @see jolie.xtext.jolie.Condition#getVariablePath()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_VariablePath();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Condition#getRightCondition <em>Right Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Condition</em>'.
   * @see jolie.xtext.jolie.Condition#getRightCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_RightCondition();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.RightCondition <em>Right Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Condition</em>'.
   * @see jolie.xtext.jolie.RightCondition
   * @generated
   */
  EClass getRightCondition();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.RightCondition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jolie.xtext.jolie.RightCondition#getExpression()
   * @see #getRightCondition()
   * @generated
   */
  EReference getRightCondition_Expression();

  /**
   * Returns the meta object for class '{@link jolie.xtext.jolie.Foreach <em>Foreach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach</em>'.
   * @see jolie.xtext.jolie.Foreach
   * @generated
   */
  EClass getForeach();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Foreach#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var1</em>'.
   * @see jolie.xtext.jolie.Foreach#getVar1()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Var1();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Foreach#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var2</em>'.
   * @see jolie.xtext.jolie.Foreach#getVar2()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Var2();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Foreach#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see jolie.xtext.jolie.Foreach#getBody()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Body();

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
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.VariablePath#getDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dot</em>'.
   * @see jolie.xtext.jolie.VariablePath#getDot()
   * @see #getVariablePath()
   * @generated
   */
  EAttribute getVariablePath_Dot();

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
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.With#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see jolie.xtext.jolie.With#getName()
   * @see #getWith()
   * @generated
   */
  EReference getWith_Name();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.With#getMainrocess <em>Mainrocess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainrocess</em>'.
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
   * Returns the meta object for the containment reference list '{@link jolie.xtext.jolie.NDChoiceStatement#getInputOperation <em>Input Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Operation</em>'.
   * @see jolie.xtext.jolie.NDChoiceStatement#getInputOperation()
   * @see #getNDChoiceStatement()
   * @generated
   */
  EReference getNDChoiceStatement_InputOperation();

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
   * Returns the meta object for class '{@link jolie.xtext.jolie.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see jolie.xtext.jolie.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jolie.xtext.jolie.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Interface#getRequestResponseOperation <em>Request Response Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request Response Operation</em>'.
   * @see jolie.xtext.jolie.Interface#getRequestResponseOperation()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_RequestResponseOperation();

  /**
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.Interface#getOneWayOperation <em>One Way Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>One Way Operation</em>'.
   * @see jolie.xtext.jolie.Interface#getOneWayOperation()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_OneWayOperation();

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
   * Returns the meta object for the attribute list '{@link jolie.xtext.jolie.OneWayOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
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
   * Returns the meta object for the containment reference '{@link jolie.xtext.jolie.AssignStatementOrPostIncrementDecrement#getVariablePath <em>Variable Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Path</em>'.
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
   * Returns the meta object for class '{@link jolie.xtext.jolie.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see jolie.xtext.jolie.Operation
   * @generated
   */
  EClass getOperation();

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
     * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INCLUDE = eINSTANCE.getProgram_Include();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PORTS = eINSTANCE.getProgram_Ports();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INTERFACE = eINSTANCE.getProgram_Interface();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__TYPES = eINSTANCE.getProgram_Types();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INIT = eINSTANCE.getProgram_Init();

    /**
     * The meta object literal for the '<em><b>Execution</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__EXECUTION = eINSTANCE.getProgram_Execution();

    /**
     * The meta object literal for the '<em><b>Define</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__DEFINE = eINSTANCE.getProgram_Define();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MAIN = eINSTANCE.getProgram_Main();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.IncludeImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE__PATH = eINSTANCE.getInclude_Path();

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
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.TypedefImpl <em>Typedef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.TypedefImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getTypedef()
     * @generated
     */
    EClass TYPEDEF = eINSTANCE.getTypedef();

    /**
     * The meta object literal for the '<em><b>Subtypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF__SUBTYPES = eINSTANCE.getTypedef_Subtypes();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.SubtypesImpl <em>Subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.SubtypesImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSubtypes()
     * @generated
     */
    EClass SUBTYPES = eINSTANCE.getSubtypes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBTYPES__NAME = eINSTANCE.getSubtypes_Name();

    /**
     * The meta object literal for the '<em><b>Native type sub</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTYPES__NATIVE_TYPE_SUB = eINSTANCE.getSubtypes_Native_type_sub();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTYPES__TYPEDEF = eINSTANCE.getSubtypes_Typedef();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.Native_type_subImpl <em>Native type sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.Native_type_subImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getNative_type_sub()
     * @generated
     */
    EClass NATIVE_TYPE_SUB = eINSTANCE.getNative_type_sub();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATIVE_TYPE_SUB__TYPE = eINSTANCE.getNative_type_sub_Type();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.DefineImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE__NAME = eINSTANCE.getDefine_Name();

    /**
     * The meta object literal for the '<em><b>Mainrocess</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__MAINROCESS = eINSTANCE.getDefine_Mainrocess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InitImpl <em>Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InitImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInit()
     * @generated
     */
    EClass INIT = eINSTANCE.getInit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT__NAME = eINSTANCE.getInit_Name();

    /**
     * The meta object literal for the '<em><b>Mainrocess</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT__MAINROCESS = eINSTANCE.getInit_Mainrocess();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN__NAME = eINSTANCE.getMain_Name();

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
     * The meta object literal for the '<em><b>Call</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_STATEMENT__CALL = eINSTANCE.getBasicStatement_Call();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.linkInImpl <em>link In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.linkInImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getlinkIn()
     * @generated
     */
    EClass LINK_IN = eINSTANCE.getlinkIn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_IN__NAME = eINSTANCE.getlinkIn_Name();

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
     * The meta object literal for the '<em><b>Input Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_SIDE__INPUT_OPERATION = eINSTANCE.getRightSide_InputOperation();

    /**
     * The meta object literal for the '<em><b>Output Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_SIDE__OUTPUT_OPERATION = eINSTANCE.getRightSide_OutputOperation();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.SynchronizedImpl <em>Synchronized</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.SynchronizedImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getSynchronized()
     * @generated
     */
    EClass SYNCHRONIZED = eINSTANCE.getSynchronized();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYNCHRONIZED__NAME = eINSTANCE.getSynchronized_Name();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNCHRONIZED__MAIN_PROCESS = eINSTANCE.getSynchronized_MainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.UndefImpl <em>Undef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.UndefImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getUndef()
     * @generated
     */
    EClass UNDEF = eINSTANCE.getUndef();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNDEF__VARIABLE_PATH = eINSTANCE.getUndef_VariablePath();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OutputOperationImpl <em>Output Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OutputOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOutputOperation()
     * @generated
     */
    EClass OUTPUT_OPERATION = eINSTANCE.getOutputOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPERATION__NAME = eINSTANCE.getOutputOperation_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATION__EXPRESSION = eINSTANCE.getOutputOperation_Expression();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATION__VARIABLE_PATH = eINSTANCE.getOutputOperation_VariablePath();

    /**
     * The meta object literal for the '<em><b>Install Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATION__INSTALL_FUNCTION = eINSTANCE.getOutputOperation_InstallFunction();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InstallFuncitonImpl <em>Install Funciton</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InstallFuncitonImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInstallFunciton()
     * @generated
     */
    EClass INSTALL_FUNCITON = eINSTANCE.getInstallFunciton();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALL_FUNCITON__NAME = eINSTANCE.getInstallFunciton_Name();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALL_FUNCITON__PROCESS = eINSTANCE.getInstallFunciton_Process();

    /**
     * The meta object literal for the '<em><b>Parallel Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALL_FUNCITON__PARALLEL_STATEMENT = eINSTANCE.getInstallFunciton_ParallelStatement();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InputOperationImpl <em>Input Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InputOperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInputOperation()
     * @generated
     */
    EClass INPUT_OPERATION = eINSTANCE.getInputOperation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPERATION__EXPRESSION = eINSTANCE.getInputOperation_Expression();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_OPERATION__MAIN_PROCESS = eINSTANCE.getInputOperation_MainProcess();

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
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ForImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Parallel Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__PARALLEL_STATEMENT = eINSTANCE.getFor_ParallelStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__CONDITION = eINSTANCE.getFor_Condition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__BODY = eINSTANCE.getFor_Body();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.BodyImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ConditionImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

    /**
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__VARIABLE_PATH = eINSTANCE.getCondition_VariablePath();

    /**
     * The meta object literal for the '<em><b>Right Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__RIGHT_CONDITION = eINSTANCE.getCondition_RightCondition();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.RightConditionImpl <em>Right Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.RightConditionImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getRightCondition()
     * @generated
     */
    EClass RIGHT_CONDITION = eINSTANCE.getRightCondition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_CONDITION__EXPRESSION = eINSTANCE.getRightCondition_Expression();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.ForeachImpl <em>Foreach</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.ForeachImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getForeach()
     * @generated
     */
    EClass FOREACH = eINSTANCE.getForeach();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__VAR1 = eINSTANCE.getForeach_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__VAR2 = eINSTANCE.getForeach_Var2();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__BODY = eINSTANCE.getForeach_Body();

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
     * The meta object literal for the '<em><b>Dot</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_PATH__DOT = eINSTANCE.getVariablePath_Dot();

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
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH__NAME = eINSTANCE.getWith_Name();

    /**
     * The meta object literal for the '<em><b>Mainrocess</b></em>' containment reference feature.
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
     * The meta object literal for the '<em><b>Input Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__INPUT_OPERATION = eINSTANCE.getNDChoiceStatement_InputOperation();

    /**
     * The meta object literal for the '<em><b>Main Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CHOICE_STATEMENT__MAIN_PROCESS = eINSTANCE.getNDChoiceStatement_MainProcess();

    /**
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.InterfaceImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Request Response Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__REQUEST_RESPONSE_OPERATION = eINSTANCE.getInterface_RequestResponseOperation();

    /**
     * The meta object literal for the '<em><b>One Way Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__ONE_WAY_OPERATION = eINSTANCE.getInterface_OneWayOperation();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
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
     * The meta object literal for the '<em><b>Variable Path</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link jolie.xtext.jolie.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jolie.xtext.jolie.impl.OperationImpl
     * @see jolie.xtext.jolie.impl.JoliePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

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
