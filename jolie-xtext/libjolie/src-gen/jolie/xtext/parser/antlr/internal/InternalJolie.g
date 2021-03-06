/*
* generated by Xtext
*/
grammar InternalJolie;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package jolie.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import jolie.xtext.services.JolieGrammarAccess;

}

@parser::members {

 	private JolieGrammarAccess grammarAccess;
 	
    public InternalJolieParser(TokenStream input, IAstFactory factory, JolieGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("jolie/xtext/parser/antlr/internal/InternalJolie.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Program";	
   	}
   	
   	@Override
   	protected JolieGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'main' 
    {
        createLeafNode(grammarAccess.getProgramAccess().getMainKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0(), currentNode); 
	    }
		lv_main_1_0=ruleMain		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"main",
	        		lv_main_1_0, 
	        		"Main", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleMain
entryRuleMain returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); }
	 iv_ruleMain=ruleMain 
	 { $current=$iv_ruleMain.current; } 
	 EOF 
;

// Rule Main
ruleMain returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0(), currentNode); 
	    }
		lv_mainrocess_0_0=ruleMainProcess		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMainRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"mainrocess",
	        		lv_mainrocess_0_0, 
	        		"MainProcess", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
;





// Entry rule entryRuleMainProcess
entryRuleMainProcess returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMainProcessRule(), currentNode); }
	 iv_ruleMainProcess=ruleMainProcess 
	 { $current=$iv_ruleMainProcess.current; } 
	 EOF 
;

// Rule MainProcess
ruleMainProcess returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)RULE_LCURLY
    { 
    createLeafNode(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0(), currentNode); 
	    }
		lv_parallelStatement_2_0=ruleParallelStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMainProcessRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"parallelStatement",
	        		lv_parallelStatement_2_0, 
	        		"ParallelStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)RULE_RCURLY
    { 
    createLeafNode(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3(), null); 
    }
)
;





// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); }
	 iv_ruleProcess=ruleProcess 
	 { $current=$iv_ruleProcess.current; } 
	 EOF 
;

// Rule Process
ruleProcess returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(((
    { 
        temp=factory.create(grammarAccess.getProcessAccess().getProcessAction_0_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getProcessAccess().getProcessAction_0_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)RULE_LCURLY
    { 
    createLeafNode(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0(), currentNode); 
	    }
		lv_children_2_0=ruleParallelStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"children",
	        		lv_children_2_0, 
	        		"ParallelStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)RULE_RCURLY
    { 
    createLeafNode(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3(), null); 
    }
)
    |(RULE_LPAREN
    { 
    createLeafNode(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0(), currentNode); 
	    }
		lv_children_5_0=ruleParallelStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"children",
	        		lv_children_5_0, 
	        		"ParallelStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)RULE_RPAREN
    { 
    createLeafNode(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2(), null); 
    }
))
;





// Entry rule entryRuleParallelStatement
entryRuleParallelStatement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getParallelStatementRule(), currentNode); }
	 iv_ruleParallelStatement=ruleParallelStatement 
	 { $current=$iv_ruleParallelStatement.current; } 
	 EOF 
;

// Rule ParallelStatement
ruleParallelStatement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0(), currentNode); 
	    }
		lv_children_1_0=ruleSequenceStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getParallelStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"children",
	        		lv_children_1_0, 
	        		"SequenceStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(RULE_VERT
    { 
    createLeafNode(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0(), currentNode); 
	    }
		lv_children_3_0=ruleSequenceStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getParallelStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"children",
	        		lv_children_3_0, 
	        		"SequenceStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*))
;





// Entry rule entryRuleSequenceStatement
entryRuleSequenceStatement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSequenceStatementRule(), currentNode); }
	 iv_ruleSequenceStatement=ruleSequenceStatement 
	 { $current=$iv_ruleSequenceStatement.current; } 
	 EOF 
;

// Rule SequenceStatement
ruleSequenceStatement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0(), currentNode); 
	    }
		lv_children_1_0=ruleBasicStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSequenceStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"children",
	        		lv_children_1_0, 
	        		"BasicStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(RULE_SEMICOLON
    { 
    createLeafNode(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0(), currentNode); 
	    }
		lv_children_3_0=ruleBasicStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSequenceStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"children",
	        		lv_children_3_0, 
	        		"BasicStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*))
;





// Entry rule entryRuleBasicStatement
entryRuleBasicStatement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getBasicStatementRule(), currentNode); }
	 iv_ruleBasicStatement=ruleBasicStatement 
	 { $current=$iv_ruleBasicStatement.current; } 
	 EOF 
;

// Rule BasicStatement
ruleBasicStatement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(((
    { 
        temp=factory.create(grammarAccess.getBasicStatementAccess().getProcessAction_0_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getProcessAction_0_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0(), currentNode); 
	    }
		lv_process_1_0=ruleProcess		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"process",
	        		lv_process_1_0, 
	        		"Process", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
    |((
    { 
        temp=factory.create(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0(), currentNode); 
	    }
		lv_assignStatement_3_0=ruleAssignStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"assignStatement",
	        		lv_assignStatement_3_0, 
	        		"AssignStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
    |((
    { 
        temp=factory.create(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getPostIncrementStatementPostIncrementStatementParserRuleCall_2_1_0(), currentNode); 
	    }
		lv_postIncrementStatement_5_0=rulePostIncrementStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"postIncrementStatement",
	        		lv_postIncrementStatement_5_0, 
	        		"PostIncrementStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
    |((
    { 
        temp=factory.create(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getPostDecrementStatementPostDecrementStatementParserRuleCall_3_1_0(), currentNode); 
	    }
		lv_PostDecrementStatement_7_0=rulePostDecrementStatement		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"PostDecrementStatement",
	        		lv_PostDecrementStatement_7_0, 
	        		"PostDecrementStatement", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)))
;





// Entry rule entryRuleAssignStatement
entryRuleAssignStatement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getAssignStatementRule(), currentNode); }
	 iv_ruleAssignStatement=ruleAssignStatement 
	 { $current=$iv_ruleAssignStatement.current; } 
	 EOF 
;

// Rule AssignStatement
ruleAssignStatement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getAssignStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAssignStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)RULE_ASSIGN
    { 
    createLeafNode(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2(), null); 
    }
(
    { 
        temp=factory.create(grammarAccess.getAssignStatementAccess().getExpressionAction_3().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getAssignStatementAccess().getExpressionAction_3(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getAssignStatementAccess().getExpressionExpressionParserRuleCall_4_0(), currentNode); 
	    }
		lv_expression_4_0=ruleExpression		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAssignStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"expression",
	        		lv_expression_4_0, 
	        		"Expression", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRulePostIncrementStatement
entryRulePostIncrementStatement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPostIncrementStatementRule(), currentNode); }
	 iv_rulePostIncrementStatement=rulePostIncrementStatement 
	 { $current=$iv_rulePostIncrementStatement.current; } 
	 EOF 
;

// Rule PostIncrementStatement
rulePostIncrementStatement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getPostIncrementStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPostIncrementStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)RULE_CHOICE
    { 
    createLeafNode(grammarAccess.getPostIncrementStatementAccess().getCHOICETerminalRuleCall_2(), null); 
    }
)
;





// Entry rule entryRulePostDecrementStatement
entryRulePostDecrementStatement returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPostDecrementStatementRule(), currentNode); }
	 iv_rulePostDecrementStatement=rulePostDecrementStatement 
	 { $current=$iv_rulePostDecrementStatement.current; } 
	 EOF 
;

// Rule PostDecrementStatement
rulePostDecrementStatement returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		lv_naem_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getPostDecrementStatementAccess().getNaemIDTerminalRuleCall_1_0(), "naem"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPostDecrementStatementRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"naem",
	        		lv_naem_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)RULE_DECREMENT
    { 
    createLeafNode(grammarAccess.getPostDecrementStatementAccess().getDECREMENTTerminalRuleCall_2(), null); 
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
    }
    this_TerminalExpression_0=ruleTerminalExpression
    { 
        $current = $this_TerminalExpression_0.current; 
        currentNode = currentNode.getParent();
    }
((
    { 
        temp=factory.create(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0().getType().getClassifier());
        try {
        	factory.set(temp, "left", $current, null /*ParserRule*/, currentNode);
        } catch(ValueConverterException vce) {
        	handleValueConverterException(vce);
        }
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
(
		lv_op_2_1=RULE_PLUS
		{
			createLeafNode(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0(), "op"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"op",
	        		lv_op_2_1, 
	        		"PLUS", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_op_2_2=RULE_MINUS
		{
			createLeafNode(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1(), "op"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"op",
	        		lv_op_2_2, 
	        		"MINUS", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_op_2_3=RULE_ASTERISK
		{
			createLeafNode(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2(), "op"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"op",
	        		lv_op_2_3, 
	        		"ASTERISK", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

    |		lv_op_2_4=RULE_DIVIDE
		{
			createLeafNode(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3(), "op"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"op",
	        		lv_op_2_4, 
	        		"DIVIDE", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
	    }
		lv_right_3_0=ruleExpression		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"right",
	        		lv_right_3_0, 
	        		"Expression", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))?)
;





// Entry rule entryRuleTerminalExpression
entryRuleTerminalExpression returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); }
	 iv_ruleTerminalExpression=ruleTerminalExpression 
	 { $current=$iv_ruleTerminalExpression.current; } 
	 EOF 
;

// Rule TerminalExpression
ruleTerminalExpression returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((RULE_LPAREN
    { 
    createLeafNode(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        currentNode = currentNode.getParent();
    }
RULE_RPAREN
    { 
    createLeafNode(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2(), null); 
    }
)
    |((
    { 
        temp=factory.create(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		lv_value_4_0=RULE_INT
		{
			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_4_0, 
	        		"INT", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
    |((
    { 
        temp=factory.create(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		lv_value_6_0=RULE_REAL
		{
			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_6_0, 
	        		"REAL", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
    |((
    { 
        temp=factory.create(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		lv_value_8_0=RULE_ID
		{
			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueIDTerminalRuleCall_3_1_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_8_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)))
;





RULE_LCURLY : '{';

RULE_RCURLY : '}';

RULE_LSQUARE : '[';

RULE_RSQUARE : ']';

RULE_ARROW : '->';

RULE_SEMICOLON : ';';

RULE_COLON : ':';

RULE_PLUS : '+';

RULE_VERT : '|';

RULE_ASSIGN : '=';

RULE_DOT : '.';

RULE_LPAREN : '(';

RULE_RPAREN : ')';

RULE_COMMA : ',';

RULE_LINKIN : 'linkIn';

RULE_WHILE : 'while';

RULE_CHOICE : '++';

RULE_DECREMENT : '--';

RULE_ASTERISK : '*';

RULE_DIVIDE : '/';

RULE_MINUS : '-';

RULE_PERCENT_SIGN : '%';

RULE_REAL : ('0'..'9')* '.' ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


