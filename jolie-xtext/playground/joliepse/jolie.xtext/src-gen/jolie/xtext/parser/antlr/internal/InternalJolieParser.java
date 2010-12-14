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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERISK", "RULE_DIVIDE", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_GLOBAL", "RULE_ID", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_DOT", "RULE_CHOICE", "RULE_DECREMENT", "RULE_LINKIN", "RULE_ARROW", "RULE_COLON", "RULE_COMMA", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'"
    };
    public static final int RULE_RCURLY=5;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_CHOICE=23;
    public static final int RULE_COLON=27;
    public static final int RULE_ID=19;
    public static final int RULE_LINKIN=25;
    public static final int RULE_WHILE=29;
    public static final int RULE_LPAREN=6;
    public static final int RULE_STRING=17;
    public static final int RULE_LSQUARE=20;
    public static final int RULE_SEMICOLON=9;
    public static final int RULE_REAL=16;
    public static final int RULE_PERCENT_SIGN=30;
    public static final int RULE_COMMA=28;
    public static final int RULE_RPAREN=7;
    public static final int RULE_ASSIGN=10;
    public static final int RULE_ASTERISK=13;
    public static final int RULE_DOT=22;
    public static final int RULE_MINUS=12;
    public static final int RULE_ARROW=26;
    public static final int RULE_VERT=8;
    public static final int RULE_WS=33;
    public static final int EOF=-1;
    public static final int RULE_INT=15;
    public static final int RULE_RSQUARE=21;
    public static final int RULE_DIVIDE=14;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_DECREMENT=24;
    public static final int RULE_GLOBAL=18;
    public static final int RULE_PLUS=11;
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:521:1: ruleBasicStatement returns [EObject current=null] : ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) ) ;
    public final EObject ruleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_process_1_0 = null;

        EObject lv_assignStatement_3_0 = null;

        EObject lv_NDChoiceStatement_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:526:6: ( ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_LCURLY:
            case RULE_LPAREN:
                {
                alt4=1;
                }
                break;
            case RULE_GLOBAL:
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case EOF:
            case RULE_RCURLY:
            case RULE_RPAREN:
            case RULE_VERT:
            case RULE_SEMICOLON:
            case RULE_LSQUARE:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("527:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatement_3_0= ruleAssignStatement ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) )", 4, 0, input);

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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:6: ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:6: ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:7: () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:600:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:610:2: ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:611:1: (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:611:1: (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:612:3: lv_NDChoiceStatement_5_0= ruleNDChoiceStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement960);
                    lv_NDChoiceStatement_5_0=ruleNDChoiceStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"NDChoiceStatement",
                    	        		lv_NDChoiceStatement_5_0, 
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:642:1: entryRuleAssignStatement returns [EObject current=null] : iv_ruleAssignStatement= ruleAssignStatement EOF ;
    public final EObject entryRuleAssignStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:643:2: (iv_ruleAssignStatement= ruleAssignStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:644:2: iv_ruleAssignStatement= ruleAssignStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignStatement_in_entryRuleAssignStatement997);
            iv_ruleAssignStatement=ruleAssignStatement();
            _fsp--;

             current =iv_ruleAssignStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignStatement1007); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:651:1: ruleAssignStatement returns [EObject current=null] : ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) RULE_ASSIGN ( (lv_rightSideAssign_3_0= ruleRightSideAssignament ) ) ) ;
    public final EObject ruleAssignStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_1_0 = null;

        EObject lv_rightSideAssign_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:656:6: ( ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) RULE_ASSIGN ( (lv_rightSideAssign_3_0= ruleRightSideAssignament ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:657:1: ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) RULE_ASSIGN ( (lv_rightSideAssign_3_0= ruleRightSideAssignament ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:657:1: ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) RULE_ASSIGN ( (lv_rightSideAssign_3_0= ruleRightSideAssignament ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:657:2: () ( (lv_variablePath_1_0= ruleVariablePath ) ) RULE_ASSIGN ( (lv_rightSideAssign_3_0= ruleRightSideAssignament ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:657:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:658:5: 
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:668:2: ( (lv_variablePath_1_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:669:1: (lv_variablePath_1_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:669:1: (lv_variablePath_1_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:670:3: lv_variablePath_1_0= ruleVariablePath
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignStatementAccess().getVariablePathVariablePathParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariablePath_in_ruleAssignStatement1062);
            lv_variablePath_1_0=ruleVariablePath();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"variablePath",
            	        		lv_variablePath_1_0, 
            	        		"VariablePath", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleAssignStatement1071); 
             
                createLeafNode(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:696:1: ( (lv_rightSideAssign_3_0= ruleRightSideAssignament ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:697:1: (lv_rightSideAssign_3_0= ruleRightSideAssignament )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:697:1: (lv_rightSideAssign_3_0= ruleRightSideAssignament )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:698:3: lv_rightSideAssign_3_0= ruleRightSideAssignament
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignStatementAccess().getRightSideAssignRightSideAssignamentParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRightSideAssignament_in_ruleAssignStatement1091);
            lv_rightSideAssign_3_0=ruleRightSideAssignament();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"rightSideAssign",
            	        		lv_rightSideAssign_3_0, 
            	        		"RightSideAssignament", 
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


    // $ANTLR start entryRuleRightSideAssignament
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:728:1: entryRuleRightSideAssignament returns [EObject current=null] : iv_ruleRightSideAssignament= ruleRightSideAssignament EOF ;
    public final EObject entryRuleRightSideAssignament() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSideAssignament = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:729:2: (iv_ruleRightSideAssignament= ruleRightSideAssignament EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:730:2: iv_ruleRightSideAssignament= ruleRightSideAssignament EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRightSideAssignamentRule(), currentNode); 
            pushFollow(FOLLOW_ruleRightSideAssignament_in_entryRuleRightSideAssignament1127);
            iv_ruleRightSideAssignament=ruleRightSideAssignament();
            _fsp--;

             current =iv_ruleRightSideAssignament; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSideAssignament1137); 

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
    // $ANTLR end entryRuleRightSideAssignament


    // $ANTLR start ruleRightSideAssignament
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:737:1: ruleRightSideAssignament returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleRightSideAssignament() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:742:6: ( ( () ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:1: ( () ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:1: ( () ( (lv_expression_1_0= ruleExpression ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:2: () ( (lv_expression_1_0= ruleExpression ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:744:5: 
            {
             
                    temp=factory.create(grammarAccess.getRightSideAssignamentAccess().getExpressionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAssignamentAccess().getExpressionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:754:2: ( (lv_expression_1_0= ruleExpression ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:755:1: (lv_expression_1_0= ruleExpression )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:755:1: (lv_expression_1_0= ruleExpression )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:756:3: lv_expression_1_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRightSideAssignamentAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleRightSideAssignament1192);
            lv_expression_1_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRightSideAssignamentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_1_0, 
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
    // $ANTLR end ruleRightSideAssignament


    // $ANTLR start entryRuleExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:786:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:787:2: (iv_ruleExpression= ruleExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:788:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1228);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1238); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:795:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:800:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:801:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:801:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression1285);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:810:1: ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_PLUS && LA6_0<=RULE_DIVIDE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:810:2: () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:810:2: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:811:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:826:2: ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:827:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:827:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:828:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:828:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
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
                            new NoViableAltException("828:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:829:3: lv_op_2_1= RULE_PLUS
                            {
                            lv_op_2_1=(Token)input.LT(1);
                            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExpression1313); 

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
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:850:8: lv_op_2_2= RULE_MINUS
                            {
                            lv_op_2_2=(Token)input.LT(1);
                            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExpression1333); 

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
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:871:8: lv_op_2_3= RULE_ASTERISK
                            {
                            lv_op_2_3=(Token)input.LT(1);
                            match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleExpression1353); 

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
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:892:8: lv_op_2_4= RULE_DIVIDE
                            {
                            lv_op_2_4=(Token)input.LT(1);
                            match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleExpression1373); 

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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:916:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:917:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:917:1: (lv_right_3_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:918:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression1402);
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:948:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:949:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:950:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1440);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1450); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:957:1: ruleTerminalExpression returns [EObject current=null] : ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_prefix_9_0 = null;

        EObject lv_variablePath_10_0 = null;

        AntlrDatatypeRuleToken lv_prefix_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:962:6: ( ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:963:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:963:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) ) )
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
            case RULE_STRING:
                {
                alt7=4;
                }
                break;
            case RULE_GLOBAL:
            case RULE_ID:
            case RULE_CHOICE:
            case RULE_DECREMENT:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("963:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) ) )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:963:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:963:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:963:3: RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleTerminalExpression1485); 
                     
                        createLeafNode(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression1506);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleTerminalExpression1514); 
                     
                        createLeafNode(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:981:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:981:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:981:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:981:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:982:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:992:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:993:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:993:1: (lv_value_4_0= RULE_INT )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:994:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression1547); 

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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1017:6: ( () ( (lv_value_6_0= RULE_REAL ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1017:6: ( () ( (lv_value_6_0= RULE_REAL ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1017:7: () ( (lv_value_6_0= RULE_REAL ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1017:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1018:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1028:2: ( (lv_value_6_0= RULE_REAL ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1029:1: (lv_value_6_0= RULE_REAL )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1029:1: (lv_value_6_0= RULE_REAL )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1030:3: lv_value_6_0= RULE_REAL
                    {
                    lv_value_6_0=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTerminalExpression1586); 

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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1053:6: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1053:6: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1053:7: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1053:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1054:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1064:2: ( (lv_value_8_0= RULE_STRING ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1065:1: (lv_value_8_0= RULE_STRING )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1065:1: (lv_value_8_0= RULE_STRING )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1066:3: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression1625); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_8_0, 
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
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1089:6: ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1089:6: ( ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1089:7: ( (lv_prefix_9_0= rulePrefix ) ) ( (lv_variablePath_10_0= ruleVariablePath ) ) ( (lv_prefix_11_0= rulePrefix ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1089:7: ( (lv_prefix_9_0= rulePrefix ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1090:1: (lv_prefix_9_0= rulePrefix )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1090:1: (lv_prefix_9_0= rulePrefix )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1091:3: lv_prefix_9_0= rulePrefix
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getPrefixPrefixParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrefix_in_ruleTerminalExpression1659);
                    lv_prefix_9_0=rulePrefix();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"prefix",
                    	        		lv_prefix_9_0, 
                    	        		"Prefix", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1113:2: ( (lv_variablePath_10_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1114:1: (lv_variablePath_10_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1114:1: (lv_variablePath_10_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1115:3: lv_variablePath_10_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleTerminalExpression1680);
                    lv_variablePath_10_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"variablePath",
                    	        		lv_variablePath_10_0, 
                    	        		"VariablePath", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1137:2: ( (lv_prefix_11_0= rulePrefix ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1138:1: (lv_prefix_11_0= rulePrefix )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1138:1: (lv_prefix_11_0= rulePrefix )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1139:3: lv_prefix_11_0= rulePrefix
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getPrefixPrefixParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrefix_in_ruleTerminalExpression1701);
                    lv_prefix_11_0=rulePrefix();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"prefix",
                    	        		lv_prefix_11_0, 
                    	        		"Prefix", 
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
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1169:1: entryRuleVariablePath returns [EObject current=null] : iv_ruleVariablePath= ruleVariablePath EOF ;
    public final EObject entryRuleVariablePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablePath = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1170:2: (iv_ruleVariablePath= ruleVariablePath EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1171:2: iv_ruleVariablePath= ruleVariablePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariablePathRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath1738);
            iv_ruleVariablePath=ruleVariablePath();
            _fsp--;

             current =iv_ruleVariablePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath1748); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1178:1: ruleVariablePath returns [EObject current=null] : ( () ( ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )* ) ) ;
    public final EObject ruleVariablePath() throws RecognitionException {
        EObject current = null;

        EObject lv_children_4_0 = null;

        EObject lv_children_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1183:6: ( ( () ( ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1184:1: ( () ( ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1184:1: ( () ( ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1184:2: () ( ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1184:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1185:5: 
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1195:2: ( ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1195:3: ( RULE_GLOBAL | RULE_ID ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1195:3: ( RULE_GLOBAL | RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_GLOBAL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1195:3: ( RULE_GLOBAL | RULE_ID )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1195:4: RULE_GLOBAL
                    {
                    match(input,RULE_GLOBAL,FOLLOW_RULE_GLOBAL_in_ruleVariablePath1793); 
                     
                        createLeafNode(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1200:6: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath1807); 
                     
                        createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_0_1(), null); 
                        

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1204:2: ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LSQUARE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1204:3: RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE
                    {
                    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath1817); 
                     
                        createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_1_1_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1208:1: ( (lv_children_4_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1209:1: (lv_children_4_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1209:1: (lv_children_4_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1210:3: lv_children_4_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath1837);
                    lv_children_4_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"children",
                    	        		lv_children_4_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath1846); 
                     
                        createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_1_1_2(), null); 
                        

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1236:3: ( RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1236:4: RULE_DOT ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) )
            	    {
            	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath1857); 
            	     
            	        createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1240:1: ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_ID) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==RULE_LPAREN) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1240:1: ( RULE_ID | ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN ) )", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1240:2: RULE_ID
            	            {
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath1866); 
            	             
            	                createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_2_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1245:6: ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1245:6: ( RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1245:7: RULE_LPAREN ( (lv_children_9_0= ruleExpression ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleVariablePath1881); 
            	             
            	                createLeafNode(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_1_2_1_1_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1249:1: ( (lv_children_9_0= ruleExpression ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1250:1: (lv_children_9_0= ruleExpression )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1250:1: (lv_children_9_0= ruleExpression )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1251:3: lv_children_9_0= ruleExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_1_1_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath1901);
            	            lv_children_9_0=ruleExpression();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"children",
            	            	        		lv_children_9_0, 
            	            	        		"Expression", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleVariablePath1910); 
            	             
            	                createLeafNode(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_1_2_1_1_2(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end ruleVariablePath


    // $ANTLR start entryRulePrefix
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1285:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1286:2: (iv_rulePrefix= rulePrefix EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1287:2: iv_rulePrefix= rulePrefix EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrefixRule(), currentNode); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix1951);
            iv_rulePrefix=rulePrefix();
            _fsp--;

             current =iv_rulePrefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix1962); 

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
    // $ANTLR end entryRulePrefix


    // $ANTLR start rulePrefix
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1294:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHOICE_0= RULE_CHOICE | this_DECREMENT_1= RULE_DECREMENT )? ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHOICE_0=null;
        Token this_DECREMENT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1299:6: ( (this_CHOICE_0= RULE_CHOICE | this_DECREMENT_1= RULE_DECREMENT )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1300:1: (this_CHOICE_0= RULE_CHOICE | this_DECREMENT_1= RULE_DECREMENT )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1300:1: (this_CHOICE_0= RULE_CHOICE | this_DECREMENT_1= RULE_DECREMENT )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CHOICE) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DECREMENT) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1300:6: this_CHOICE_0= RULE_CHOICE
                    {
                    this_CHOICE_0=(Token)input.LT(1);
                    match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rulePrefix2002); 

                    		current.merge(this_CHOICE_0);
                        
                     
                        createLeafNode(grammarAccess.getPrefixAccess().getCHOICETerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1308:10: this_DECREMENT_1= RULE_DECREMENT
                    {
                    this_DECREMENT_1=(Token)input.LT(1);
                    match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rulePrefix2028); 

                    		current.merge(this_DECREMENT_1);
                        
                     
                        createLeafNode(grammarAccess.getPrefixAccess().getDECREMENTTerminalRuleCall_1(), null); 
                        

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
    // $ANTLR end rulePrefix


    // $ANTLR start entryRuleNDChoiceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1323:1: entryRuleNDChoiceStatement returns [EObject current=null] : iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF ;
    public final EObject entryRuleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNDChoiceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1324:2: (iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1325:2: iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNDChoiceStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement2074);
            iv_ruleNDChoiceStatement=ruleNDChoiceStatement();
            _fsp--;

             current =iv_ruleNDChoiceStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDChoiceStatement2084); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1332:1: ruleNDChoiceStatement returns [EObject current=null] : ( () ( RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) ) )* ) ;
    public final EObject ruleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_InputOperation_2_0 = null;

        EObject lv_mainProcess_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1337:6: ( ( () ( RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1338:1: ( () ( RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1338:1: ( () ( RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1338:2: () ( RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1338:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1339:5: 
            {
             
                    temp=factory.create(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1349:2: ( RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_LSQUARE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1349:3: RULE_LSQUARE ( (lv_InputOperation_2_0= ruleInputOperation ) ) RULE_RSQUARE ( (lv_mainProcess_4_0= ruleMainProcess ) )
            	    {
            	    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement2128); 
            	     
            	        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1353:1: ( (lv_InputOperation_2_0= ruleInputOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1354:1: (lv_InputOperation_2_0= ruleInputOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1354:1: (lv_InputOperation_2_0= ruleInputOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1355:3: lv_InputOperation_2_0= ruleInputOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getInputOperationInputOperationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInputOperation_in_ruleNDChoiceStatement2148);
            	    lv_InputOperation_2_0=ruleInputOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"InputOperation",
            	    	        		lv_InputOperation_2_0, 
            	    	        		"InputOperation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement2157); 
            	     
            	        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_2(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:1: ( (lv_mainProcess_4_0= ruleMainProcess ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1382:1: (lv_mainProcess_4_0= ruleMainProcess )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1382:1: (lv_mainProcess_4_0= ruleMainProcess )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1383:3: lv_mainProcess_4_0= ruleMainProcess
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement2177);
            	    lv_mainProcess_4_0=ruleMainProcess();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mainProcess",
            	    	        		lv_mainProcess_4_0, 
            	    	        		"MainProcess", 
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
            	    break loop13;
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
    // $ANTLR end ruleNDChoiceStatement


    // $ANTLR start entryRuleInputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1413:1: entryRuleInputOperation returns [EObject current=null] : iv_ruleInputOperation= ruleInputOperation EOF ;
    public final EObject entryRuleInputOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1414:2: (iv_ruleInputOperation= ruleInputOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1415:2: iv_ruleInputOperation= ruleInputOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputOperation_in_entryRuleInputOperation2215);
            iv_ruleInputOperation=ruleInputOperation();
            _fsp--;

             current =iv_ruleInputOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperation2225); 

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
    // $ANTLR end entryRuleInputOperation


    // $ANTLR start ruleInputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1422:1: ruleInputOperation returns [EObject current=null] : ( ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN ) | ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? ) ) ;
    public final EObject ruleInputOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_9_0 = null;

        EObject this_RequestResponseOperation_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1427:6: ( ( ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN ) | ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1428:1: ( ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN ) | ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1428:1: ( ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN ) | ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LINKIN) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1428:1: ( ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN ) | ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1428:2: ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1428:2: ( () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1428:3: () RULE_LINKIN RULE_LPAREN RULE_ID RULE_RPAREN
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1428:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1429:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getInputOperationAccess().getInputOperationAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getInputOperationAccess().getInputOperationAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_LINKIN,FOLLOW_RULE_LINKIN_in_ruleInputOperation2269); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getLINKINTerminalRuleCall_0_1(), null); 
                        
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleInputOperation2277); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_0_2(), null); 
                        
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputOperation2285); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_0_3(), null); 
                        
                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleInputOperation2293); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1456:6: ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1456:6: ( () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )? )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1456:7: () RULE_ID RULE_LPAREN () ( (lv_variablePath_9_0= ruleVariablePath ) ) RULE_RPAREN (this_RequestResponseOperation_11= ruleRequestResponseOperation )?
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1456:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1457:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getInputOperationAccess().getInputOperationAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getInputOperationAccess().getInputOperationAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputOperation2318); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_1_1(), null); 
                        
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleInputOperation2326); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_1_2(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1475:1: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1476:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getInputOperationAccess().getVariablePathAction_1_3().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getInputOperationAccess().getVariablePathAction_1_3(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1486:2: ( (lv_variablePath_9_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1487:1: (lv_variablePath_9_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1487:1: (lv_variablePath_9_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1488:3: lv_variablePath_9_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInputOperationAccess().getVariablePathVariablePathParserRuleCall_1_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleInputOperation2355);
                    lv_variablePath_9_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInputOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"variablePath",
                    	        		lv_variablePath_9_0, 
                    	        		"VariablePath", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleInputOperation2364); 
                     
                        createLeafNode(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_1_5(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1514:1: (this_RequestResponseOperation_11= ruleRequestResponseOperation )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_LPAREN) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1515:5: this_RequestResponseOperation_11= ruleRequestResponseOperation
                            {
                             
                                    currentNode=createCompositeNode(grammarAccess.getInputOperationAccess().getRequestResponseOperationParserRuleCall_1_6(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleInputOperation2386);
                            this_RequestResponseOperation_11=ruleRequestResponseOperation();
                            _fsp--;

                             
                                    current = this_RequestResponseOperation_11; 
                                    currentNode = currentNode.getParent();
                                

                            }
                            break;

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
    // $ANTLR end ruleInputOperation


    // $ANTLR start entryRuleRequestResponseOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1531:1: entryRuleRequestResponseOperation returns [EObject current=null] : iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF ;
    public final EObject entryRuleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestResponseOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1532:2: (iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1533:2: iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequestResponseOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation2424);
            iv_ruleRequestResponseOperation=ruleRequestResponseOperation();
            _fsp--;

             current =iv_ruleRequestResponseOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation2434); 

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
    // $ANTLR end entryRuleRequestResponseOperation


    // $ANTLR start ruleRequestResponseOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1540:1: ruleRequestResponseOperation returns [EObject current=null] : ( RULE_LPAREN ( (lv_expression_1_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_3_0= ruleMainProcess ) ) ) ;
    public final EObject ruleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_mainProcess_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1545:6: ( ( RULE_LPAREN ( (lv_expression_1_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_3_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1546:1: ( RULE_LPAREN ( (lv_expression_1_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_3_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1546:1: ( RULE_LPAREN ( (lv_expression_1_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_3_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1546:2: RULE_LPAREN ( (lv_expression_1_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_3_0= ruleMainProcess ) )
            {
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation2468); 
             
                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_0(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1550:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1551:1: (lv_expression_1_0= ruleExpression )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1551:1: (lv_expression_1_0= ruleExpression )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1552:3: lv_expression_1_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleRequestResponseOperation2488);
            lv_expression_1_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_1_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation2497); 
             
                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1578:1: ( (lv_mainProcess_3_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1579:1: (lv_mainProcess_3_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1579:1: (lv_mainProcess_3_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1580:3: lv_mainProcess_3_0= ruleMainProcess
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getMainProcessMainProcessParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMainProcess_in_ruleRequestResponseOperation2517);
            lv_mainProcess_3_0=ruleMainProcess();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mainProcess",
            	        		lv_mainProcess_3_0, 
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
    // $ANTLR end ruleRequestResponseOperation


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProgram120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleMain232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_entryRuleMainProcess267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainProcess277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleMainProcess320 = new BitSet(new long[]{0x00000000001C0370L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleMainProcess340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleMainProcess349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProcess438 = new BitSet(new long[]{0x00000000001C0370L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProcess467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProcess483 = new BitSet(new long[]{0x00000000001C03D0L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess503 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProcess512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelStatement558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement614 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_VERT_in_ruleParallelStatement624 = new BitSet(new long[]{0x00000000001C0352L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement644 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceStatement693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement749 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement759 = new BitSet(new long[]{0x00000000001C0252L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement779 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStatement828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleBasicStatement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_ruleBasicStatement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_entryRuleAssignStatement997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignStatement1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleAssignStatement1062 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleAssignStatement1071 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_ruleRightSideAssignament_in_ruleAssignStatement1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSideAssignament_in_entryRuleRightSideAssignament1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSideAssignament1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRightSideAssignament1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression1285 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExpression1313 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExpression1333 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleExpression1353 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleExpression1373 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleTerminalExpression1485 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression1506 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleTerminalExpression1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTerminalExpression1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleTerminalExpression1659 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleTerminalExpression1680 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleTerminalExpression1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath1738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GLOBAL_in_ruleVariablePath1793 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath1807 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath1817 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath1837 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath1846 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath1857 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath1866 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleVariablePath1881 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath1901 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleVariablePath1910 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rulePrefix2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rulePrefix2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement2074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDChoiceStatement2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement2128 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_ruleInputOperation_in_ruleNDChoiceStatement2148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement2157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement2177 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_entryRuleInputOperation2215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperation2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINKIN_in_ruleInputOperation2269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleInputOperation2277 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputOperation2285 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleInputOperation2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputOperation2318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleInputOperation2326 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleInputOperation2355 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleInputOperation2364 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleInputOperation2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation2468 = new BitSet(new long[]{0x00000000018F8040L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRequestResponseOperation2488 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation2497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleRequestResponseOperation2517 = new BitSet(new long[]{0x0000000000000002L});

}