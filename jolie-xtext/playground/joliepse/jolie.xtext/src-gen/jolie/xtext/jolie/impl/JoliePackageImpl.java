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
import jolie.xtext.jolie.Type;
import jolie.xtext.jolie.TypeDefinition;
import jolie.xtext.jolie.Uri;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoliePackageImpl extends EPackageImpl implements JoliePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainProcessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parallelStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignStatementOrPostIncrementDecrementOrInputOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightSideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preIncrementDecrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablePathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ndChoiceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputPortStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputPortStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneWayOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestResponseOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfacesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass redirectsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass olSyntaxNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignStatementOrPostIncrementDecrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jolie.xtext.jolie.JoliePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JoliePackageImpl()
  {
    super(eNS_URI, JolieFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JoliePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JoliePackage init()
  {
    if (isInited) return (JoliePackage)EPackage.Registry.INSTANCE.getEPackage(JoliePackage.eNS_URI);

    // Obtain or create and register package
    JoliePackageImpl theJoliePackage = (JoliePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JoliePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JoliePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJoliePackage.createPackageContents();

    // Initialize created meta-data
    theJoliePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJoliePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JoliePackage.eNS_URI, theJoliePackage);
    return theJoliePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Ports()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Types()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Main()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Typedef()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTYPEDEF()
  {
    return typedefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTYPEDEF_Name()
  {
    return (EAttribute)typedefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTYPEDEF_Typedef()
  {
    return (EReference)typedefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMain()
  {
    return mainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMain_Mainrocess()
  {
    return (EReference)mainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainProcess()
  {
    return mainProcessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Children()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParallelStatement()
  {
    return parallelStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallelStatement_Children()
  {
    return (EReference)parallelStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceStatement()
  {
    return sequenceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceStatement_Children()
  {
    return (EReference)sequenceStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicStatement()
  {
    return basicStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicStatement_Process()
  {
    return (EReference)basicStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicStatement_AssignStatementOrPostIncrementDecrement()
  {
    return (EReference)basicStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicStatement_NDChoiceStatement()
  {
    return (EReference)basicStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicStatement_PreIncrementDecrement()
  {
    return (EReference)basicStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignStatementOrPostIncrementDecrementOrInputOperation()
  {
    return assignStatementOrPostIncrementDecrementOrInputOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRightSide()
  {
    return rightSideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightSide_Expression()
  {
    return (EReference)rightSideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightSide_VariablePath()
  {
    return (EReference)rightSideEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightSide_Operation()
  {
    return (EReference)rightSideEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Expression()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_MainProcess()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Left()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Op()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Right()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreIncrementDecrement()
  {
    return preIncrementDecrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreIncrementDecrement_VariablePath()
  {
    return (EReference)preIncrementDecrementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_VariablePath()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablePath()
  {
    return variablePathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariablePath_Name()
  {
    return (EAttribute)variablePathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablePath_Children()
  {
    return (EReference)variablePathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWith()
  {
    return withEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWith_Name()
  {
    return (EAttribute)withEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWith_Mainrocess()
  {
    return (EReference)withEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNDChoiceStatement()
  {
    return ndChoiceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNDChoiceStatement_VariablePath()
  {
    return (EReference)ndChoiceStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNDChoiceStatement_Operation()
  {
    return (EReference)ndChoiceStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNDChoiceStatement_MainProcess()
  {
    return (EReference)ndChoiceStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_InputPortStatement()
  {
    return (EReference)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_OutputPortStatement()
  {
    return (EReference)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputPortStatement()
  {
    return inputPortStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputPortStatement_Name()
  {
    return (EAttribute)inputPortStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_Location()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_Protocol()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_OneWayOperation()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_RequestResponseOperation()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_Redirects()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_Aggregates()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputPortStatement_Intefaces()
  {
    return (EReference)inputPortStatementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputPortStatement()
  {
    return outputPortStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputPortStatement_Name()
  {
    return (EAttribute)outputPortStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputPortStatement_Location()
  {
    return (EReference)outputPortStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputPortStatement_Protocol()
  {
    return (EReference)outputPortStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputPortStatement_OneWayOperation()
  {
    return (EReference)outputPortStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputPortStatement_RequestResponseOperation()
  {
    return (EReference)outputPortStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputPortStatement_Intefaces()
  {
    return (EReference)outputPortStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneWayOperation()
  {
    return oneWayOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneWayOperation_Name()
  {
    return (EAttribute)oneWayOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneWayOperation_TypeDefinition()
  {
    return (EReference)oneWayOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneWayOperation_Children()
  {
    return (EAttribute)oneWayOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequestResponseOperation()
  {
    return requestResponseOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequestResponseOperation_Name()
  {
    return (EAttribute)requestResponseOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequestResponseOperation_TypeDefinition()
  {
    return (EReference)requestResponseOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDefinition_Type()
  {
    return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocation()
  {
    return locationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocation_Uri()
  {
    return (EReference)locationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUri()
  {
    return uriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUri_Name()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaces()
  {
    return interfacesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaces_Name()
  {
    return (EAttribute)interfacesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtocol_Name()
  {
    return (EAttribute)protocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRedirects()
  {
    return redirectsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRedirects_Name()
  {
    return (EAttribute)redirectsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRedirects_OutputPortIdentifier()
  {
    return (EAttribute)redirectsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregates()
  {
    return aggregatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAggregates_Name()
  {
    return (EAttribute)aggregatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOLSyntaxNode()
  {
    return olSyntaxNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOLSyntaxNode_ParallelStatement()
  {
    return (EReference)olSyntaxNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignStatementOrPostIncrementDecrement()
  {
    return assignStatementOrPostIncrementDecrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignStatementOrPostIncrementDecrement_VariablePath()
  {
    return (EReference)assignStatementOrPostIncrementDecrementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignStatementOrPostIncrementDecrement_RightSide()
  {
    return (EReference)assignStatementOrPostIncrementDecrementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLiteral()
  {
    return intLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLiteral_Value()
  {
    return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealLiteral()
  {
    return realLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealLiteral_Value()
  {
    return (EAttribute)realLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getString()
  {
    return stringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getString_Value()
  {
    return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JolieFactory getJolieFactory()
  {
    return (JolieFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__PORTS);
    createEReference(programEClass, PROGRAM__TYPES);
    createEReference(programEClass, PROGRAM__MAIN);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);
    createEReference(typeEClass, TYPE__TYPEDEF);

    typedefEClass = createEClass(TYPEDEF);
    createEAttribute(typedefEClass, TYPEDEF__NAME);
    createEReference(typedefEClass, TYPEDEF__TYPEDEF);

    mainEClass = createEClass(MAIN);
    createEReference(mainEClass, MAIN__MAINROCESS);

    mainProcessEClass = createEClass(MAIN_PROCESS);

    processEClass = createEClass(PROCESS);
    createEReference(processEClass, PROCESS__CHILDREN);

    parallelStatementEClass = createEClass(PARALLEL_STATEMENT);
    createEReference(parallelStatementEClass, PARALLEL_STATEMENT__CHILDREN);

    sequenceStatementEClass = createEClass(SEQUENCE_STATEMENT);
    createEReference(sequenceStatementEClass, SEQUENCE_STATEMENT__CHILDREN);

    basicStatementEClass = createEClass(BASIC_STATEMENT);
    createEReference(basicStatementEClass, BASIC_STATEMENT__PROCESS);
    createEReference(basicStatementEClass, BASIC_STATEMENT__ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT);
    createEReference(basicStatementEClass, BASIC_STATEMENT__ND_CHOICE_STATEMENT);
    createEReference(basicStatementEClass, BASIC_STATEMENT__PRE_INCREMENT_DECREMENT);

    assignStatementOrPostIncrementDecrementOrInputOperationEClass = createEClass(ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT_OR_INPUT_OPERATION);

    rightSideEClass = createEClass(RIGHT_SIDE);
    createEReference(rightSideEClass, RIGHT_SIDE__EXPRESSION);
    createEReference(rightSideEClass, RIGHT_SIDE__VARIABLE_PATH);
    createEReference(rightSideEClass, RIGHT_SIDE__OPERATION);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__EXPRESSION);
    createEReference(operationEClass, OPERATION__MAIN_PROCESS);
    createEReference(operationEClass, OPERATION__LEFT);
    createEAttribute(operationEClass, OPERATION__OP);
    createEReference(operationEClass, OPERATION__RIGHT);

    preIncrementDecrementEClass = createEClass(PRE_INCREMENT_DECREMENT);
    createEReference(preIncrementDecrementEClass, PRE_INCREMENT_DECREMENT__VARIABLE_PATH);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__VARIABLE_PATH);

    variablePathEClass = createEClass(VARIABLE_PATH);
    createEAttribute(variablePathEClass, VARIABLE_PATH__NAME);
    createEReference(variablePathEClass, VARIABLE_PATH__CHILDREN);

    withEClass = createEClass(WITH);
    createEAttribute(withEClass, WITH__NAME);
    createEReference(withEClass, WITH__MAINROCESS);

    ndChoiceStatementEClass = createEClass(ND_CHOICE_STATEMENT);
    createEReference(ndChoiceStatementEClass, ND_CHOICE_STATEMENT__VARIABLE_PATH);
    createEReference(ndChoiceStatementEClass, ND_CHOICE_STATEMENT__OPERATION);
    createEReference(ndChoiceStatementEClass, ND_CHOICE_STATEMENT__MAIN_PROCESS);

    portEClass = createEClass(PORT);
    createEReference(portEClass, PORT__INPUT_PORT_STATEMENT);
    createEReference(portEClass, PORT__OUTPUT_PORT_STATEMENT);

    inputPortStatementEClass = createEClass(INPUT_PORT_STATEMENT);
    createEAttribute(inputPortStatementEClass, INPUT_PORT_STATEMENT__NAME);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__LOCATION);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__PROTOCOL);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__ONE_WAY_OPERATION);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__REDIRECTS);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__AGGREGATES);
    createEReference(inputPortStatementEClass, INPUT_PORT_STATEMENT__INTEFACES);

    outputPortStatementEClass = createEClass(OUTPUT_PORT_STATEMENT);
    createEAttribute(outputPortStatementEClass, OUTPUT_PORT_STATEMENT__NAME);
    createEReference(outputPortStatementEClass, OUTPUT_PORT_STATEMENT__LOCATION);
    createEReference(outputPortStatementEClass, OUTPUT_PORT_STATEMENT__PROTOCOL);
    createEReference(outputPortStatementEClass, OUTPUT_PORT_STATEMENT__ONE_WAY_OPERATION);
    createEReference(outputPortStatementEClass, OUTPUT_PORT_STATEMENT__REQUEST_RESPONSE_OPERATION);
    createEReference(outputPortStatementEClass, OUTPUT_PORT_STATEMENT__INTEFACES);

    oneWayOperationEClass = createEClass(ONE_WAY_OPERATION);
    createEAttribute(oneWayOperationEClass, ONE_WAY_OPERATION__NAME);
    createEReference(oneWayOperationEClass, ONE_WAY_OPERATION__TYPE_DEFINITION);
    createEAttribute(oneWayOperationEClass, ONE_WAY_OPERATION__CHILDREN);

    requestResponseOperationEClass = createEClass(REQUEST_RESPONSE_OPERATION);
    createEAttribute(requestResponseOperationEClass, REQUEST_RESPONSE_OPERATION__NAME);
    createEReference(requestResponseOperationEClass, REQUEST_RESPONSE_OPERATION__TYPE_DEFINITION);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__TYPE);

    locationEClass = createEClass(LOCATION);
    createEReference(locationEClass, LOCATION__URI);

    uriEClass = createEClass(URI);
    createEAttribute(uriEClass, URI__NAME);

    interfacesEClass = createEClass(INTERFACES);
    createEAttribute(interfacesEClass, INTERFACES__NAME);

    protocolEClass = createEClass(PROTOCOL);
    createEAttribute(protocolEClass, PROTOCOL__NAME);

    redirectsEClass = createEClass(REDIRECTS);
    createEAttribute(redirectsEClass, REDIRECTS__NAME);
    createEAttribute(redirectsEClass, REDIRECTS__OUTPUT_PORT_IDENTIFIER);

    aggregatesEClass = createEClass(AGGREGATES);
    createEAttribute(aggregatesEClass, AGGREGATES__NAME);

    olSyntaxNodeEClass = createEClass(OL_SYNTAX_NODE);
    createEReference(olSyntaxNodeEClass, OL_SYNTAX_NODE__PARALLEL_STATEMENT);

    assignStatementOrPostIncrementDecrementEClass = createEClass(ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT);
    createEReference(assignStatementOrPostIncrementDecrementEClass, ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__VARIABLE_PATH);
    createEReference(assignStatementOrPostIncrementDecrementEClass, ASSIGN_STATEMENT_OR_POST_INCREMENT_DECREMENT__RIGHT_SIDE);

    intLiteralEClass = createEClass(INT_LITERAL);
    createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

    realLiteralEClass = createEClass(REAL_LITERAL);
    createEAttribute(realLiteralEClass, REAL_LITERAL__VALUE);

    stringEClass = createEClass(STRING);
    createEAttribute(stringEClass, STRING__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    operationEClass.getESuperTypes().add(this.getExpression());
    withEClass.getESuperTypes().add(this.getBasicStatement());
    olSyntaxNodeEClass.getESuperTypes().add(this.getMainProcess());
    assignStatementOrPostIncrementDecrementEClass.getESuperTypes().add(this.getAssignStatementOrPostIncrementDecrementOrInputOperation());
    intLiteralEClass.getESuperTypes().add(this.getExpression());
    realLiteralEClass.getESuperTypes().add(this.getExpression());
    stringEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Ports(), this.getPort(), null, "ports", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Types(), this.getType(), null, "types", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Main(), this.getMain(), null, "main", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Typedef(), this.getTYPEDEF(), null, "typedef", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedefEClass, jolie.xtext.jolie.TYPEDEF.class, "TYPEDEF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTYPEDEF_Name(), ecorePackage.getEString(), "name", null, 0, -1, jolie.xtext.jolie.TYPEDEF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTYPEDEF_Typedef(), this.getTYPEDEF(), null, "typedef", null, 0, -1, jolie.xtext.jolie.TYPEDEF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMain_Mainrocess(), this.getMainProcess(), null, "mainrocess", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainProcessEClass, MainProcess.class, "MainProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processEClass, jolie.xtext.jolie.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcess_Children(), this.getParallelStatement(), null, "children", null, 0, -1, jolie.xtext.jolie.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parallelStatementEClass, ParallelStatement.class, "ParallelStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParallelStatement_Children(), this.getSequenceStatement(), null, "children", null, 0, -1, ParallelStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceStatementEClass, SequenceStatement.class, "SequenceStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequenceStatement_Children(), this.getBasicStatement(), null, "children", null, 0, -1, SequenceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicStatementEClass, BasicStatement.class, "BasicStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicStatement_Process(), this.getProcess(), null, "process", null, 0, 1, BasicStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicStatement_AssignStatementOrPostIncrementDecrement(), this.getAssignStatementOrPostIncrementDecrementOrInputOperation(), null, "assignStatementOrPostIncrementDecrement", null, 0, 1, BasicStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicStatement_NDChoiceStatement(), this.getNDChoiceStatement(), null, "NDChoiceStatement", null, 0, 1, BasicStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicStatement_PreIncrementDecrement(), this.getPreIncrementDecrement(), null, "preIncrementDecrement", null, 0, 1, BasicStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignStatementOrPostIncrementDecrementOrInputOperationEClass, AssignStatementOrPostIncrementDecrementOrInputOperation.class, "AssignStatementOrPostIncrementDecrementOrInputOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rightSideEClass, RightSide.class, "RightSide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRightSide_Expression(), this.getExpression(), null, "expression", null, 0, 1, RightSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRightSide_VariablePath(), this.getVariablePath(), null, "variablePath", null, 0, 1, RightSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRightSide_Operation(), this.getOperation(), null, "operation", null, 0, 1, RightSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Expression(), this.getExpression(), null, "expression", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_MainProcess(), this.getMainProcess(), null, "mainProcess", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Left(), this.getExpression(), null, "left", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Right(), this.getExpression(), null, "right", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preIncrementDecrementEClass, PreIncrementDecrement.class, "PreIncrementDecrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreIncrementDecrement_VariablePath(), this.getVariablePath(), null, "variablePath", null, 0, 1, PreIncrementDecrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_VariablePath(), this.getVariablePath(), null, "variablePath", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablePathEClass, VariablePath.class, "VariablePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariablePath_Name(), ecorePackage.getEString(), "name", null, 0, -1, VariablePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariablePath_Children(), this.getExpression(), null, "children", null, 0, -1, VariablePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withEClass, With.class, "With", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWith_Name(), ecorePackage.getEString(), "name", null, 0, -1, With.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWith_Mainrocess(), this.getMainProcess(), null, "mainrocess", null, 0, -1, With.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ndChoiceStatementEClass, NDChoiceStatement.class, "NDChoiceStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNDChoiceStatement_VariablePath(), this.getVariablePath(), null, "variablePath", null, 0, -1, NDChoiceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNDChoiceStatement_Operation(), this.getOperation(), null, "operation", null, 0, -1, NDChoiceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNDChoiceStatement_MainProcess(), this.getMainProcess(), null, "mainProcess", null, 0, -1, NDChoiceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPort_InputPortStatement(), this.getInputPortStatement(), null, "inputPortStatement", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPort_OutputPortStatement(), this.getOutputPortStatement(), null, "outputPortStatement", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputPortStatementEClass, InputPortStatement.class, "InputPortStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputPortStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_Location(), this.getLocation(), null, "location", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_Protocol(), this.getProtocol(), null, "protocol", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_OneWayOperation(), this.getOneWayOperation(), null, "oneWayOperation", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_RequestResponseOperation(), this.getRequestResponseOperation(), null, "RequestResponseOperation", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_Redirects(), this.getRedirects(), null, "redirects", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_Aggregates(), this.getAggregates(), null, "aggregates", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputPortStatement_Intefaces(), this.getInterfaces(), null, "intefaces", null, 0, -1, InputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputPortStatementEClass, OutputPortStatement.class, "OutputPortStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputPortStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputPortStatement_Location(), this.getLocation(), null, "location", null, 0, -1, OutputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputPortStatement_Protocol(), this.getProtocol(), null, "protocol", null, 0, -1, OutputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputPortStatement_OneWayOperation(), this.getOneWayOperation(), null, "oneWayOperation", null, 0, -1, OutputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputPortStatement_RequestResponseOperation(), this.getRequestResponseOperation(), null, "RequestResponseOperation", null, 0, -1, OutputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputPortStatement_Intefaces(), this.getInterfaces(), null, "intefaces", null, 0, -1, OutputPortStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneWayOperationEClass, OneWayOperation.class, "OneWayOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOneWayOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, OneWayOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneWayOperation_TypeDefinition(), this.getTypeDefinition(), null, "typeDefinition", null, 0, -1, OneWayOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneWayOperation_Children(), ecorePackage.getEString(), "children", null, 0, -1, OneWayOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requestResponseOperationEClass, RequestResponseOperation.class, "RequestResponseOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequestResponseOperation_Name(), ecorePackage.getEString(), "name", null, 0, -1, RequestResponseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequestResponseOperation_TypeDefinition(), this.getTypeDefinition(), null, "typeDefinition", null, 0, -1, RequestResponseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDefinition_Type(), this.getType(), null, "type", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocation_Uri(), this.getUri(), null, "uri", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriEClass, Uri.class, "Uri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUri_Name(), ecorePackage.getEString(), "name", null, 0, -1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfacesEClass, Interfaces.class, "Interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaces_Name(), ecorePackage.getEString(), "name", null, 0, -1, Interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProtocol_Name(), ecorePackage.getEString(), "name", null, 0, -1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(redirectsEClass, Redirects.class, "Redirects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRedirects_Name(), ecorePackage.getEString(), "name", null, 0, -1, Redirects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRedirects_OutputPortIdentifier(), ecorePackage.getEString(), "outputPortIdentifier", null, 0, -1, Redirects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aggregatesEClass, Aggregates.class, "Aggregates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAggregates_Name(), ecorePackage.getEString(), "name", null, 0, -1, Aggregates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(olSyntaxNodeEClass, OLSyntaxNode.class, "OLSyntaxNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOLSyntaxNode_ParallelStatement(), this.getParallelStatement(), null, "parallelStatement", null, 0, 1, OLSyntaxNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignStatementOrPostIncrementDecrementEClass, AssignStatementOrPostIncrementDecrement.class, "AssignStatementOrPostIncrementDecrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignStatementOrPostIncrementDecrement_VariablePath(), this.getVariablePath(), null, "variablePath", null, 0, -1, AssignStatementOrPostIncrementDecrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignStatementOrPostIncrementDecrement_RightSide(), this.getRightSide(), null, "rightSide", null, 0, 1, AssignStatementOrPostIncrementDecrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realLiteralEClass, RealLiteral.class, "RealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, RealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringEClass, jolie.xtext.jolie.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getString_Value(), ecorePackage.getEString(), "value", null, 0, 1, jolie.xtext.jolie.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JoliePackageImpl
