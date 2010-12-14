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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJolieParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ID", "RULE_ASSIGN", "RULE_CHOICE", "RULE_DECREMENT", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERISK", "RULE_DIVIDE", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_LSQUARE", "RULE_LINKIN", "RULE_RSQUARE", "RULE_GLOBAL", "RULE_DOT", "RULE_ARROW", "RULE_COLON", "RULE_COMMA", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'"
    };
    public static final int RULE_RCURLY=5;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_CHOICE=12;
    public static final int RULE_COLON=27;
    public static final int RULE_ID=10;
    public static final int RULE_LINKIN=22;
    public static final int RULE_WHILE=29;
    public static final int RULE_STRING=20;
    public static final int RULE_LPAREN=6;
    public static final int RULE_LSQUARE=21;
    public static final int RULE_SEMICOLON=9;
    public static final int RULE_REAL=19;
    public static final int RULE_PERCENT_SIGN=30;
    public static final int RULE_COMMA=28;
    public static final int RULE_RPAREN=7;
    public static final int RULE_ASSIGN=11;
    public static final int RULE_ASTERISK=16;
    public static final int RULE_DOT=25;
    public static final int RULE_MINUS=15;
    public static final int RULE_ARROW=26;
    public static final int RULE_VERT=8;
    public static final int RULE_WS=33;
    public static final int EOF=-1;
    public static final int RULE_INT=18;
    public static final int RULE_RSQUARE=23;
    public static final int RULE_DIVIDE=17;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_GLOBAL=24;
    public static final int RULE_DECREMENT=13;
    public static final int RULE_PLUS=14;
    public static final int RULE_LCURLY=4;

        public InternalJolieParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g"; }



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



    // $ANTLR start entryRuleProgram
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:77:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:78:2: (iv_ruleProgram= ruleProgram EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:79:2: iv_ruleProgram= ruleProgram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();
            _fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:86:1: ruleProgram returns [EObject current=null] : ( 'main' ( (lv_main_1_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_main_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:91:6: ( ( 'main' ( (lv_main_1_0= ruleMain ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:1: ( 'main' ( (lv_main_1_0= ruleMain ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:1: ( 'main' ( (lv_main_1_0= ruleMain ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:3: 'main' ( (lv_main_1_0= ruleMain ) )
            {
            match(input,35,FOLLOW_35_in_ruleProgram120); 

                    createLeafNode(grammarAccess.getProgramAccess().getMainKeyword_0(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:96:1: ( (lv_main_1_0= ruleMain ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:97:1: (lv_main_1_0= ruleMain )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:97:1: (lv_main_1_0= ruleMain )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:98:3: lv_main_1_0= ruleMain
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram141);
            lv_main_1_0=ruleMain();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"main",
            	        		lv_main_1_0, 
            	        		"Main", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleMain
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:128:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:129:2: (iv_ruleMain= ruleMain EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:130:2: iv_ruleMain= ruleMain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain177);
            iv_ruleMain=ruleMain();
            _fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMain


    // $ANTLR start ruleMain
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:137:1: ruleMain returns [EObject current=null] : ( (lv_mainrocess_0_0= ruleMainProcess ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_mainrocess_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:142:6: ( ( (lv_mainrocess_0_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:143:1: ( (lv_mainrocess_0_0= ruleMainProcess ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:143:1: ( (lv_mainrocess_0_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:144:1: (lv_mainrocess_0_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:144:1: (lv_mainrocess_0_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:145:3: lv_mainrocess_0_0= ruleMainProcess
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMainProcess_in_ruleMain232);
            lv_mainrocess_0_0=ruleMainProcess();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mainrocess",
            	        		lv_mainrocess_0_0, 
            	        		"MainProcess", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleMainProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:175:1: entryRuleMainProcess returns [EObject current=null] : iv_ruleMainProcess= ruleMainProcess EOF ;
    public final EObject entryRuleMainProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProcess = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:176:2: (iv_ruleMainProcess= ruleMainProcess EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:177:2: iv_ruleMainProcess= ruleMainProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleMainProcess_in_entryRuleMainProcess267);
            iv_ruleMainProcess=ruleMainProcess();
            _fsp--;

             current =iv_ruleMainProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainProcess277); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMainProcess


    // $ANTLR start ruleMainProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:184:1: ruleMainProcess returns [EObject current=null] : ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY ) ;
    public final EObject ruleMainProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_parallelStatement_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:189:6: ( ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:190:1: ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:190:1: ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:190:2: () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:190:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:191:5: 
            {
             
                    temp=factory.create(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleMainProcess320); 
             
                createLeafNode(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:205:1: ( (lv_parallelStatement_2_0= ruleParallelStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:206:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:206:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:207:3: lv_parallelStatement_2_0= ruleParallelStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParallelStatement_in_ruleMainProcess340);
            lv_parallelStatement_2_0=ruleParallelStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMainProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parallelStatement",
            	        		lv_parallelStatement_2_0, 
            	        		"ParallelStatement", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleMainProcess349); 
             
                createLeafNode(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMainProcess


    // $ANTLR start entryRuleProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:241:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:242:2: (iv_ruleProcess= ruleProcess EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:243:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess384);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess394); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProcess


    // $ANTLR start ruleProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:250:1: ruleProcess returns [EObject current=null] : ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_children_2_0 = null;

        EObject lv_children_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:255:6: ( ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:256:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:256:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LCURLY) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_LPAREN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("256:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:256:2: ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:256:2: ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:256:3: () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:256:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:257:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getProcessAccess().getProcessAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getProcessAccess().getProcessAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProcess438); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:271:1: ( (lv_children_2_0= ruleParallelStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:272:1: (lv_children_2_0= ruleParallelStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:272:1: (lv_children_2_0= ruleParallelStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:273:3: lv_children_2_0= ruleParallelStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParallelStatement_in_ruleProcess458);
                    lv_children_2_0=ruleParallelStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"children",
                    	        		lv_children_2_0, 
                    	        		"ParallelStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProcess467); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:300:6: ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:300:6: ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:300:7: RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleProcess483); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:304:1: ( (lv_children_5_0= ruleParallelStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:305:1: (lv_children_5_0= ruleParallelStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:305:1: (lv_children_5_0= ruleParallelStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:306:3: lv_children_5_0= ruleParallelStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParallelStatement_in_ruleProcess503);
                    lv_children_5_0=ruleParallelStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"children",
                    	        		lv_children_5_0, 
                    	        		"ParallelStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleProcess512); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleParallelStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:340:1: entryRuleParallelStatement returns [EObject current=null] : iv_ruleParallelStatement= ruleParallelStatement EOF ;
    public final EObject entryRuleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:341:2: (iv_ruleParallelStatement= ruleParallelStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:342:2: iv_ruleParallelStatement= ruleParallelStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParallelStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement548);
            iv_ruleParallelStatement=ruleParallelStatement();
            _fsp--;

             current =iv_ruleParallelStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStatement558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParallelStatement


    // $ANTLR start ruleParallelStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:349:1: ruleParallelStatement returns [EObject current=null] : ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) ) ;
    public final EObject ruleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_children_1_0 = null;

        EObject lv_children_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:354:6: ( ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:355:1: ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:355:1: ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:355:2: () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:355:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:356:5: 
            {
             
                    temp=factory.create(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:366:2: ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:366:3: ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:366:3: ( (lv_children_1_0= ruleSequenceStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:367:1: (lv_children_1_0= ruleSequenceStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:367:1: (lv_children_1_0= ruleSequenceStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:368:3: lv_children_1_0= ruleSequenceStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSequenceStatement_in_ruleParallelStatement614);
            lv_children_1_0=ruleSequenceStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParallelStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"children",
            	        		lv_children_1_0, 
            	        		"SequenceStatement", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:390:2: ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_VERT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:390:3: RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) )
            	    {
            	    match(input,RULE_VERT,FOLLOW_RULE_VERT_in_ruleParallelStatement624); 
            	     
            	        createLeafNode(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:394:1: ( (lv_children_3_0= ruleSequenceStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:395:1: (lv_children_3_0= ruleSequenceStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:395:1: (lv_children_3_0= ruleSequenceStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:396:3: lv_children_3_0= ruleSequenceStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequenceStatement_in_ruleParallelStatement644);
            	    lv_children_3_0=ruleSequenceStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getParallelStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"children",
            	    	        		lv_children_3_0, 
            	    	        		"SequenceStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParallelStatement


    // $ANTLR start entryRuleSequenceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:426:1: entryRuleSequenceStatement returns [EObject current=null] : iv_ruleSequenceStatement= ruleSequenceStatement EOF ;
    public final EObject entryRuleSequenceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:427:2: (iv_ruleSequenceStatement= ruleSequenceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:428:2: iv_ruleSequenceStatement= ruleSequenceStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSequenceStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement683);
            iv_ruleSequenceStatement=ruleSequenceStatement();
            _fsp--;

             current =iv_ruleSequenceStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceStatement693); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSequenceStatement


    // $ANTLR start ruleSequenceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:435:1: ruleSequenceStatement returns [EObject current=null] : ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) ) ;
    public final EObject ruleSequenceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_children_1_0 = null;

        EObject lv_children_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:440:6: ( ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:441:1: ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:441:1: ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:441:2: () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:441:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:442:5: 
            {
             
                    temp=factory.create(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:452:2: ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:452:3: ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:452:3: ( (lv_children_1_0= ruleBasicStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:453:1: (lv_children_1_0= ruleBasicStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:453:1: (lv_children_1_0= ruleBasicStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:454:3: lv_children_1_0= ruleBasicStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBasicStatement_in_ruleSequenceStatement749);
            lv_children_1_0=ruleBasicStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSequenceStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"children",
            	        		lv_children_1_0, 
            	        		"BasicStatement", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:476:2: ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SEMICOLON) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:476:3: RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) )
            	    {
            	    match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement759); 
            	     
            	        createLeafNode(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:480:1: ( (lv_children_3_0= ruleBasicStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:481:1: (lv_children_3_0= ruleBasicStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:481:1: (lv_children_3_0= ruleBasicStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:482:3: lv_children_3_0= ruleBasicStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicStatement_in_ruleSequenceStatement779);
            	    lv_children_3_0=ruleBasicStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSequenceStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"children",
            	    	        		lv_children_3_0, 
            	    	        		"BasicStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSequenceStatement


    // $ANTLR start entryRuleBasicStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:512:1: entryRuleBasicStatement returns [EObject current=null] : iv_ruleBasicStatement= ruleBasicStatement EOF ;
    public final EObject entryRuleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:513:2: (iv_ruleBasicStatement= ruleBasicStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:514:2: iv_ruleBasicStatement= ruleBasicStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement818);
            iv_ruleBasicStatement=ruleBasicStatement();
            _fsp--;

             current =iv_ruleBasicStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStatement828); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBasicStatement


    // $ANTLR start ruleBasicStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:521:1: ruleBasicStatement returns [EObject current=null] : ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) ) | ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) ) | ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) ) ) ;
    public final EObject ruleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_process_1_0 = null;

        EObject lv_assignStatement_3_0 = null;

        EObject lv_postIncrementStatement_5_0 = null;

        EObject lv_PostDecrementStatement_7_0 = null;

        EObject lv_NDChoiceStatement_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:526:6: ( ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) ) | ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) ) | ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) ) | ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) ) | ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) ) | ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) ) | ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_LCURLY:
            case RULE_LPAREN:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_DECREMENT:
                    {
                    alt4=4;
                    }
                    break;
                case RULE_ASSIGN:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_CHOICE:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) ) | ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) ) | ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) ) )", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LSQUARE:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) ) | ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) ) | ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) ) )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:2: ( () ( (lv_process_1_0= ruleProcess ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:2: ( () ( (lv_process_1_0= ruleProcess ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:3: () ( (lv_process_1_0= ruleProcess ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:528:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getProcessAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getProcessAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:538:2: ( (lv_process_1_0= ruleProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:539:1: (lv_process_1_0= ruleProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:539:1: (lv_process_1_0= ruleProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:540:3: lv_process_1_0= ruleProcess
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcess_in_ruleBasicStatement884);
                    lv_process_1_0=ruleProcess();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"process",
                    	        		lv_process_1_0, 
                    	        		"Process", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:563:6: ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:563:6: ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:563:7: () ( (lv_assignStatement_3_0= ruleAssignStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:563:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:564:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:574:2: ( (lv_assignStatement_3_0= ruleAssignStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:575:1: (lv_assignStatement_3_0= ruleAssignStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:575:1: (lv_assignStatement_3_0= ruleAssignStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:576:3: lv_assignStatement_3_0= ruleAssignStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssignStatement_in_ruleBasicStatement922);
                    lv_assignStatement_3_0=ruleAssignStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assignStatement",
                    	        		lv_assignStatement_3_0, 
                    	        		"AssignStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:6: ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:6: ( () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:7: () ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:600:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:610:2: ( (lv_postIncrementStatement_5_0= rulePostIncrementStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:611:1: (lv_postIncrementStatement_5_0= rulePostIncrementStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:611:1: (lv_postIncrementStatement_5_0= rulePostIncrementStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:612:3: lv_postIncrementStatement_5_0= rulePostIncrementStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getPostIncrementStatementPostIncrementStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePostIncrementStatement_in_ruleBasicStatement960);
                    lv_postIncrementStatement_5_0=rulePostIncrementStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"postIncrementStatement",
                    	        		lv_postIncrementStatement_5_0, 
                    	        		"PostIncrementStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:635:6: ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:635:6: ( () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:635:7: () ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:635:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:636:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:646:2: ( (lv_PostDecrementStatement_7_0= rulePostDecrementStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:647:1: (lv_PostDecrementStatement_7_0= rulePostDecrementStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:647:1: (lv_PostDecrementStatement_7_0= rulePostDecrementStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:648:3: lv_PostDecrementStatement_7_0= rulePostDecrementStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getPostDecrementStatementPostDecrementStatementParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePostDecrementStatement_in_ruleBasicStatement998);
                    lv_PostDecrementStatement_7_0=rulePostDecrementStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"PostDecrementStatement",
                    	        		lv_PostDecrementStatement_7_0, 
                    	        		"PostDecrementStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:671:6: ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:671:6: ( () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:671:7: () ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:671:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:672:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:682:2: ( (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:683:1: (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:683:1: (lv_NDChoiceStatement_9_0= ruleNDChoiceStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:684:3: lv_NDChoiceStatement_9_0= ruleNDChoiceStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement1036);
                    lv_NDChoiceStatement_9_0=ruleNDChoiceStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"NDChoiceStatement",
                    	        		lv_NDChoiceStatement_9_0, 
                    	        		"NDChoiceStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBasicStatement


    // $ANTLR start entryRuleAssignStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:714:1: entryRuleAssignStatement returns [EObject current=null] : iv_ruleAssignStatement= ruleAssignStatement EOF ;
    public final EObject entryRuleAssignStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:715:2: (iv_ruleAssignStatement= ruleAssignStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:716:2: iv_ruleAssignStatement= ruleAssignStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignStatement_in_entryRuleAssignStatement1073);
            iv_ruleAssignStatement=ruleAssignStatement();
            _fsp--;

             current =iv_ruleAssignStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignStatement1083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignStatement


    // $ANTLR start ruleAssignStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:723:1: ruleAssignStatement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) RULE_ASSIGN () ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_expression_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:728:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) RULE_ASSIGN () ( (lv_expression_4_0= ruleExpression ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:729:1: ( () ( (lv_name_1_0= RULE_ID ) ) RULE_ASSIGN () ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:729:1: ( () ( (lv_name_1_0= RULE_ID ) ) RULE_ASSIGN () ( (lv_expression_4_0= ruleExpression ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:729:2: () ( (lv_name_1_0= RULE_ID ) ) RULE_ASSIGN () ( (lv_expression_4_0= ruleExpression ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:729:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:730:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:740:2: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:741:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:741:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:742:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignStatement1134); 

            			createLeafNode(grammarAccess.getAssignStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleAssignStatement1148); 
             
                createLeafNode(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:768:1: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:769:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssignStatementAccess().getExpressionAction_3().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignStatementAccess().getExpressionAction_3(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:779:2: ( (lv_expression_4_0= ruleExpression ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:780:1: (lv_expression_4_0= ruleExpression )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:780:1: (lv_expression_4_0= ruleExpression )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:781:3: lv_expression_4_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignStatementAccess().getExpressionExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignStatement1177);
            lv_expression_4_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_4_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignStatement


    // $ANTLR start entryRulePostIncrementStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:811:1: entryRulePostIncrementStatement returns [EObject current=null] : iv_rulePostIncrementStatement= rulePostIncrementStatement EOF ;
    public final EObject entryRulePostIncrementStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostIncrementStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:812:2: (iv_rulePostIncrementStatement= rulePostIncrementStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:813:2: iv_rulePostIncrementStatement= rulePostIncrementStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPostIncrementStatementRule(), currentNode); 
            pushFollow(FOLLOW_rulePostIncrementStatement_in_entryRulePostIncrementStatement1213);
            iv_rulePostIncrementStatement=rulePostIncrementStatement();
            _fsp--;

             current =iv_rulePostIncrementStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostIncrementStatement1223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePostIncrementStatement


    // $ANTLR start rulePostIncrementStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:820:1: rulePostIncrementStatement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) RULE_CHOICE ) ;
    public final EObject rulePostIncrementStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:825:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) RULE_CHOICE ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:826:1: ( () ( (lv_name_1_0= RULE_ID ) ) RULE_CHOICE )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:826:1: ( () ( (lv_name_1_0= RULE_ID ) ) RULE_CHOICE )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:826:2: () ( (lv_name_1_0= RULE_ID ) ) RULE_CHOICE
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:826:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:827:5: 
            {
             
                    temp=factory.create(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:837:2: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:839:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePostIncrementStatement1274); 

            			createLeafNode(grammarAccess.getPostIncrementStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPostIncrementStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rulePostIncrementStatement1288); 
             
                createLeafNode(grammarAccess.getPostIncrementStatementAccess().getCHOICETerminalRuleCall_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePostIncrementStatement


    // $ANTLR start entryRulePostDecrementStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:873:1: entryRulePostDecrementStatement returns [EObject current=null] : iv_rulePostDecrementStatement= rulePostDecrementStatement EOF ;
    public final EObject entryRulePostDecrementStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostDecrementStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:874:2: (iv_rulePostDecrementStatement= rulePostDecrementStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:875:2: iv_rulePostDecrementStatement= rulePostDecrementStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPostDecrementStatementRule(), currentNode); 
            pushFollow(FOLLOW_rulePostDecrementStatement_in_entryRulePostDecrementStatement1323);
            iv_rulePostDecrementStatement=rulePostDecrementStatement();
            _fsp--;

             current =iv_rulePostDecrementStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostDecrementStatement1333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePostDecrementStatement


    // $ANTLR start rulePostDecrementStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:882:1: rulePostDecrementStatement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) RULE_DECREMENT ) ;
    public final EObject rulePostDecrementStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:887:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) RULE_DECREMENT ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:888:1: ( () ( (lv_name_1_0= RULE_ID ) ) RULE_DECREMENT )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:888:1: ( () ( (lv_name_1_0= RULE_ID ) ) RULE_DECREMENT )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:888:2: () ( (lv_name_1_0= RULE_ID ) ) RULE_DECREMENT
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:888:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:889:5: 
            {
             
                    temp=factory.create(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:899:2: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:900:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:900:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:901:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePostDecrementStatement1384); 

            			createLeafNode(grammarAccess.getPostDecrementStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPostDecrementStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rulePostDecrementStatement1398); 
             
                createLeafNode(grammarAccess.getPostDecrementStatementAccess().getDECREMENTTerminalRuleCall_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePostDecrementStatement


    // $ANTLR start entryRuleExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:935:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:936:2: (iv_ruleExpression= ruleExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:937:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1433);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1443); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:944:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:949:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:950:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:950:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:951:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression1490);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:959:1: ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_PLUS && LA6_0<=RULE_DIVIDE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:959:2: () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:959:2: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:960:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:975:2: ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:976:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:976:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:977:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:977:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    int alt5=4;
                    switch ( input.LA(1) ) {
                    case RULE_PLUS:
                        {
                        alt5=1;
                        }
                        break;
                    case RULE_MINUS:
                        {
                        alt5=2;
                        }
                        break;
                    case RULE_ASTERISK:
                        {
                        alt5=3;
                        }
                        break;
                    case RULE_DIVIDE:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("977:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:978:3: lv_op_2_1= RULE_PLUS
                            {
                            lv_op_2_1=(Token)input.LT(1);
                            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExpression1518); 

                            			createLeafNode(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0(), "op"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"op",
                            	        		lv_op_2_1, 
                            	        		"PLUS", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:999:8: lv_op_2_2= RULE_MINUS
                            {
                            lv_op_2_2=(Token)input.LT(1);
                            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExpression1538); 

                            			createLeafNode(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1(), "op"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"op",
                            	        		lv_op_2_2, 
                            	        		"MINUS", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 3 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1020:8: lv_op_2_3= RULE_ASTERISK
                            {
                            lv_op_2_3=(Token)input.LT(1);
                            match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleExpression1558); 

                            			createLeafNode(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2(), "op"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"op",
                            	        		lv_op_2_3, 
                            	        		"ASTERISK", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 4 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1041:8: lv_op_2_4= RULE_DIVIDE
                            {
                            lv_op_2_4=(Token)input.LT(1);
                            match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleExpression1578); 

                            			createLeafNode(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3(), "op"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"op",
                            	        		lv_op_2_4, 
                            	        		"DIVIDE", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1065:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1066:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1066:1: (lv_right_3_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1067:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression1607);
                    lv_right_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1097:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1098:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1099:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1645);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1106:1: ruleTerminalExpression returns [EObject current=null] : ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        EObject this_Expression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1111:6: ( ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1112:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1112:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_LPAREN:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_REAL:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            case RULE_STRING:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1112:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1112:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1112:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1112:3: RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleTerminalExpression1690); 
                     
                        createLeafNode(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression1711);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleTerminalExpression1719); 
                     
                        createLeafNode(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1130:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1130:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1130:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1130:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1131:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1141:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1142:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1142:1: (lv_value_4_0= RULE_INT )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1143:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression1752); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1166:6: ( () ( (lv_value_6_0= RULE_REAL ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1166:6: ( () ( (lv_value_6_0= RULE_REAL ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1166:7: () ( (lv_value_6_0= RULE_REAL ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1166:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1167:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1177:2: ( (lv_value_6_0= RULE_REAL ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1178:1: (lv_value_6_0= RULE_REAL )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1178:1: (lv_value_6_0= RULE_REAL )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1179:3: lv_value_6_0= RULE_REAL
                    {
                    lv_value_6_0=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTerminalExpression1791); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"REAL", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1202:6: ( () ( (lv_value_8_0= RULE_ID ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1202:6: ( () ( (lv_value_8_0= RULE_ID ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1202:7: () ( (lv_value_8_0= RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1202:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1203:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1213:2: ( (lv_value_8_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1214:1: (lv_value_8_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1214:1: (lv_value_8_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1215:3: lv_value_8_0= RULE_ID
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression1830); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueIDTerminalRuleCall_3_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_8_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1238:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1238:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1238:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1238:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1239:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getStringAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1249:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1250:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1250:1: (lv_value_10_0= RULE_STRING )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1251:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression1869); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_4_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_10_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleNDChoiceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1281:1: entryRuleNDChoiceStatement returns [EObject current=null] : iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF ;
    public final EObject entryRuleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNDChoiceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1282:2: (iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1283:2: iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNDChoiceStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement1911);
            iv_ruleNDChoiceStatement=ruleNDChoiceStatement();
            _fsp--;

             current =iv_ruleNDChoiceStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDChoiceStatement1921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNDChoiceStatement


    // $ANTLR start ruleNDChoiceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1290:1: ruleNDChoiceStatement returns [EObject current=null] : ( ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) ) | ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) ) ) ;
    public final EObject ruleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_mainProcess_7_0 = null;

        EObject lv_variablePath_12_0 = null;

        EObject lv_MainProcess_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1295:6: ( ( ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) ) | ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1296:1: ( ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) ) | ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1296:1: ( ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) ) | ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LSQUARE) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else if ( (LA8_1==RULE_LINKIN) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1296:1: ( ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) ) | ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) ) )", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1296:1: ( ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) ) | ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1296:2: ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1296:2: ( RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1296:3: RULE_LSQUARE RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN RULE_RSQUARE () ( (lv_mainProcess_7_0= ruleMainProcess ) )
                    {
                    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement1956); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_0_0(), null); 
                        
                    match(input,RULE_LINKIN,FOLLOW_RULE_LINKIN_in_ruleNDChoiceStatement1964); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLINKINTerminalRuleCall_0_1(), null); 
                        
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement1972); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_0_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNDChoiceStatement1980); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_0_3(), null); 
                        
                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement1988); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_0_4(), null); 
                        
                    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement1996); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_0_5(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1320:1: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1321:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getNDChoiceStatementAccess().getMainProcessAction_0_6().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcessAction_0_6(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1331:2: ( (lv_mainProcess_7_0= ruleMainProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1332:1: (lv_mainProcess_7_0= ruleMainProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1332:1: (lv_mainProcess_7_0= ruleMainProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1333:3: lv_mainProcess_7_0= ruleMainProcess
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_0_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement2025);
                    lv_mainProcess_7_0=ruleMainProcess();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"mainProcess",
                    	        		lv_mainProcess_7_0, 
                    	        		"MainProcess", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1356:6: ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1356:6: ( RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1356:7: RULE_LSQUARE RULE_ID RULE_LPAREN () ( (lv_variablePath_12_0= ruleVariablePath ) ) RULE_RPAREN RULE_RSQUARE () ( (lv_MainProcess_16_0= ruleMainProcess ) )
                    {
                    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement2042); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNDChoiceStatement2050); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_1_1(), null); 
                        
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement2058); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_2(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1368:1: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1369:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getNDChoiceStatementAccess().getVariablePathAction_1_3().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getVariablePathAction_1_3(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1379:2: ( (lv_variablePath_12_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1380:1: (lv_variablePath_12_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1380:1: (lv_variablePath_12_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:3: lv_variablePath_12_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement2087);
                    lv_variablePath_12_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"variablePath",
                    	        		lv_variablePath_12_0, 
                    	        		"VariablePath", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement2096); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_5(), null); 
                        
                    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement2104); 
                     
                        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_6(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1411:1: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1412:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getNDChoiceStatementAccess().getMainProcess2Action_1_7().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcess2Action_1_7(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1422:2: ( (lv_MainProcess_16_0= ruleMainProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1423:1: (lv_MainProcess_16_0= ruleMainProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1423:1: (lv_MainProcess_16_0= ruleMainProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1424:3: lv_MainProcess_16_0= ruleMainProcess
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_8_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement2133);
                    lv_MainProcess_16_0=ruleMainProcess();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"MainProcess",
                    	        		lv_MainProcess_16_0, 
                    	        		"MainProcess", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNDChoiceStatement


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1454:1: entryRuleVariablePath returns [EObject current=null] : iv_ruleVariablePath= ruleVariablePath EOF ;
    public final EObject entryRuleVariablePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablePath = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1455:2: (iv_ruleVariablePath= ruleVariablePath EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1456:2: iv_ruleVariablePath= ruleVariablePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariablePathRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath2170);
            iv_ruleVariablePath=ruleVariablePath();
            _fsp--;

             current =iv_ruleVariablePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath2180); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariablePath


    // $ANTLR start ruleVariablePath
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1463:1: ruleVariablePath returns [EObject current=null] : ( () RULE_GLOBAL ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) ) )* ) ;
    public final EObject ruleVariablePath() throws RecognitionException {
        EObject current = null;

        EObject lv_children_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1468:6: ( ( () RULE_GLOBAL ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1469:1: ( () RULE_GLOBAL ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1469:1: ( () RULE_GLOBAL ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1469:2: () RULE_GLOBAL ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1469:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1470:5: 
            {
             
                    temp=factory.create(grammarAccess.getVariablePathAccess().getVariablePathAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getVariablePathAccess().getVariablePathAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,RULE_GLOBAL,FOLLOW_RULE_GLOBAL_in_ruleVariablePath2223); 
             
                createLeafNode(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1484:1: ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1484:2: RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) )
            	    {
            	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath2232); 
            	     
            	        createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_2_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1488:1: ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==RULE_LPAREN) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1488:1: ( RULE_ID | ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN ) )", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1488:2: RULE_ID
            	            {
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath2241); 
            	             
            	                createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_2_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1493:6: ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1493:6: ( RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1493:7: RULE_LPAREN ( (lv_children_5_0= ruleExpression ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleVariablePath2256); 
            	             
            	                createLeafNode(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_2_1_1_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1497:1: ( (lv_children_5_0= ruleExpression ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1498:1: (lv_children_5_0= ruleExpression )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1498:1: (lv_children_5_0= ruleExpression )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1499:3: lv_children_5_0= ruleExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_2_1_1_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath2276);
            	            lv_children_5_0=ruleExpression();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"children",
            	            	        		lv_children_5_0, 
            	            	        		"Expression", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleVariablePath2285); 
            	             
            	                createLeafNode(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_2_1_1_2(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariablePath


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProgram120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleMain232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_entryRuleMainProcess267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainProcess277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleMainProcess320 = new BitSet(new long[]{0x0000000000200450L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleMainProcess340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleMainProcess349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProcess438 = new BitSet(new long[]{0x0000000000200450L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProcess467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProcess483 = new BitSet(new long[]{0x0000000000200450L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess503 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProcess512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelStatement558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement614 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_VERT_in_ruleParallelStatement624 = new BitSet(new long[]{0x0000000000200450L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement644 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceStatement693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement749 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement759 = new BitSet(new long[]{0x0000000000200450L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement779 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStatement828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleBasicStatement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_ruleBasicStatement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementStatement_in_ruleBasicStatement960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDecrementStatement_in_ruleBasicStatement998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_entryRuleAssignStatement1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignStatement1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignStatement1134 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleAssignStatement1148 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignStatement1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementStatement_in_entryRulePostIncrementStatement1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostIncrementStatement1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePostIncrementStatement1274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rulePostIncrementStatement1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDecrementStatement_in_entryRulePostDecrementStatement1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostDecrementStatement1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePostDecrementStatement1384 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rulePostDecrementStatement1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression1490 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExpression1518 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExpression1538 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleExpression1558 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleExpression1578 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleTerminalExpression1690 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression1711 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleTerminalExpression1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTerminalExpression1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement1911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDChoiceStatement1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement1956 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_LINKIN_in_ruleNDChoiceStatement1964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement1972 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNDChoiceStatement1980 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement1988 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement1996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement2042 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNDChoiceStatement2050 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement2058 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement2087 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement2096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement2104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath2170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GLOBAL_in_ruleVariablePath2223 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath2232 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath2241 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleVariablePath2256 = new BitSet(new long[]{0x00000000001C0440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath2276 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleVariablePath2285 = new BitSet(new long[]{0x0000000002000002L});

}