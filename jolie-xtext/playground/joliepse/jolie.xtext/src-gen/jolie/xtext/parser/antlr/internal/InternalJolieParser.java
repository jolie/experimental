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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_QUESTION", "RULE_ASTERISK", "RULE_ID", "RULE_COLON", "RULE_NATIVE_TYPE", "RULE_LCURLY", "RULE_ID_PRE", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_CHOICE", "RULE_DECREMENT", "RULE_POINTSTO", "RULE_DEEPCOPYLEFT", "RULE_PLUS", "RULE_MINUS", "RULE_DIVIDE", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_DOT", "RULE_COMMA", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'main'", "'global'", "'with'", "'linkIn'", "'inputPort'", "'outputPort'", "'OneWay'", "'RequestResponse'", "'throws'", "'Location'", "'Interfaces'", "'Protocol'", "'TODO'", "'Redirects'", "'=>'", "'Aggregates'"
    };
    public static final int RULE_RCURLY=11;
    public static final int RULE_ML_COMMENT=33;
    public static final int RULE_CHOICE=17;
    public static final int RULE_COLON=7;
    public static final int RULE_ID=6;
    public static final int RULE_WHILE=31;
    public static final int RULE_STRING=26;
    public static final int RULE_LPAREN=12;
    public static final int RULE_LSQUARE=27;
    public static final int RULE_REAL=25;
    public static final int RULE_SEMICOLON=15;
    public static final int RULE_PERCENT_SIGN=32;
    public static final int RULE_COMMA=30;
    public static final int RULE_RPAREN=13;
    public static final int RULE_ID_PRE=10;
    public static final int RULE_ASSIGN=16;
    public static final int RULE_ASTERISK=5;
    public static final int RULE_NATIVE_TYPE=8;
    public static final int RULE_DOT=29;
    public static final int RULE_MINUS=22;
    public static final int RULE_VERT=14;
    public static final int RULE_QUESTION=4;
    public static final int RULE_WS=35;
    public static final int RULE_DEEPCOPYLEFT=20;
    public static final int RULE_INT=24;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=28;
    public static final int RULE_DIVIDE=23;
    public static final int RULE_ANY_OTHER=36;
    public static final int RULE_SL_COMMENT=34;
    public static final int RULE_DECREMENT=18;
    public static final int RULE_POINTSTO=19;
    public static final int RULE_PLUS=21;
    public static final int RULE_LCURLY=9;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:86:1: ruleProgram returns [EObject current=null] : ( ( (lv_ports_0_0= rulePort ) )* ( (lv_types_1_0= ruleType ) )* ( (lv_main_2_0= ruleMain ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_ports_0_0 = null;

        EObject lv_types_1_0 = null;

        EObject lv_main_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:91:6: ( ( ( (lv_ports_0_0= rulePort ) )* ( (lv_types_1_0= ruleType ) )* ( (lv_main_2_0= ruleMain ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:1: ( ( (lv_ports_0_0= rulePort ) )* ( (lv_types_1_0= ruleType ) )* ( (lv_main_2_0= ruleMain ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:1: ( ( (lv_ports_0_0= rulePort ) )* ( (lv_types_1_0= ruleType ) )* ( (lv_main_2_0= ruleMain ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:2: ( (lv_ports_0_0= rulePort ) )* ( (lv_types_1_0= ruleType ) )* ( (lv_main_2_0= ruleMain ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:92:2: ( (lv_ports_0_0= rulePort ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=42 && LA1_0<=43)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:93:1: (lv_ports_0_0= rulePort )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:93:1: (lv_ports_0_0= rulePort )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:94:3: lv_ports_0_0= rulePort
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getPortsPortParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleProgram131);
            	    lv_ports_0_0=rulePort();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ports",
            	    	        		lv_ports_0_0, 
            	    	        		"Port", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:116:3: ( (lv_types_1_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:117:1: (lv_types_1_0= ruleType )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:117:1: (lv_types_1_0= ruleType )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:118:3: lv_types_1_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getTypesTypeParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleProgram153);
            	    lv_types_1_0=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"types",
            	    	        		lv_types_1_0, 
            	    	        		"Type", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:140:3: ( (lv_main_2_0= ruleMain ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:141:1: (lv_main_2_0= ruleMain )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:141:1: (lv_main_2_0= ruleMain )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:142:3: lv_main_2_0= ruleMain
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram175);
            lv_main_2_0=ruleMain();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"main",
            	        		lv_main_2_0, 
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


    // $ANTLR start entryRuleCardinality
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:172:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:173:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:174:2: iv_ruleCardinality= ruleCardinality EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCardinalityRule(), currentNode); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality212);
            iv_ruleCardinality=ruleCardinality();
            _fsp--;

             current =iv_ruleCardinality.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality223); 

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
    // $ANTLR end entryRuleCardinality


    // $ANTLR start ruleCardinality
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:181:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUESTION_0=null;
        Token this_ASTERISK_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:186:6: ( (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:187:1: (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:187:1: (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_QUESTION) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ASTERISK) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("187:1: (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:187:6: this_QUESTION_0= RULE_QUESTION
                    {
                    this_QUESTION_0=(Token)input.LT(1);
                    match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleCardinality263); 

                    		current.merge(this_QUESTION_0);
                        
                     
                        createLeafNode(grammarAccess.getCardinalityAccess().getQUESTIONTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:195:10: this_ASTERISK_1= RULE_ASTERISK
                    {
                    this_ASTERISK_1=(Token)input.LT(1);
                    match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleCardinality289); 

                    		current.merge(this_ASTERISK_1);
                        
                     
                        createLeafNode(grammarAccess.getCardinalityAccess().getASTERISKTerminalRuleCall_1(), null); 
                        

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
    // $ANTLR end ruleCardinality


    // $ANTLR start entryRuleType
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:210:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:211:2: (iv_ruleType= ruleType EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:212:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType334);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType344); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:219:1: ruleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_4_0= ruleTYPEDEF ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typedef_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:224:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_4_0= ruleTYPEDEF ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:225:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_4_0= ruleTYPEDEF ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:225:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_4_0= ruleTYPEDEF ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:225:3: 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_4_0= ruleTYPEDEF ) )?
            {
            match(input,37,FOLLOW_37_in_ruleType379); 

                    createLeafNode(grammarAccess.getTypeAccess().getTypeKeyword_0(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:229:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:230:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:230:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:231:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType396); 

            			createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
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

            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleType410); 
             
                createLeafNode(grammarAccess.getTypeAccess().getCOLONTerminalRuleCall_2(), null); 
                
            match(input,RULE_NATIVE_TYPE,FOLLOW_RULE_NATIVE_TYPE_in_ruleType418); 
             
                createLeafNode(grammarAccess.getTypeAccess().getNATIVE_TYPETerminalRuleCall_3(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:261:1: ( (lv_typedef_4_0= ruleTYPEDEF ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LCURLY) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:262:1: (lv_typedef_4_0= ruleTYPEDEF )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:262:1: (lv_typedef_4_0= ruleTYPEDEF )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:263:3: lv_typedef_4_0= ruleTYPEDEF
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTypeAccess().getTypedefTYPEDEFParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTYPEDEF_in_ruleType438);
                    lv_typedef_4_0=ruleTYPEDEF();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"typedef",
                    	        		lv_typedef_4_0, 
                    	        		"TYPEDEF", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleTYPEDEF
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:293:1: entryRuleTYPEDEF returns [EObject current=null] : iv_ruleTYPEDEF= ruleTYPEDEF EOF ;
    public final EObject entryRuleTYPEDEF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPEDEF = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:294:2: (iv_ruleTYPEDEF= ruleTYPEDEF EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:295:2: iv_ruleTYPEDEF= ruleTYPEDEF EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTYPEDEFRule(), currentNode); 
            pushFollow(FOLLOW_ruleTYPEDEF_in_entryRuleTYPEDEF475);
            iv_ruleTYPEDEF=ruleTYPEDEF();
            _fsp--;

             current =iv_ruleTYPEDEF; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPEDEF485); 

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
    // $ANTLR end entryRuleTYPEDEF


    // $ANTLR start ruleTYPEDEF
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:302:1: ruleTYPEDEF returns [EObject current=null] : ( () RULE_LCURLY ( ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )* )* RULE_RCURLY ) ;
    public final EObject ruleTYPEDEF() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_typedef_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:307:6: ( ( () RULE_LCURLY ( ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )* )* RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:308:1: ( () RULE_LCURLY ( ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )* )* RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:308:1: ( () RULE_LCURLY ( ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )* )* RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:308:2: () RULE_LCURLY ( ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )* )* RULE_RCURLY
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:308:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:309:5: 
            {
             
                    temp=factory.create(grammarAccess.getTYPEDEFAccess().getTYPEDEFAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTYPEDEFAccess().getTYPEDEFAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleTYPEDEF528); 
             
                createLeafNode(grammarAccess.getTYPEDEFAccess().getLCURLYTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:323:1: ( ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID_PRE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:323:2: ( (lv_name_2_0= RULE_ID_PRE ) ) ruleCardinality RULE_COLON RULE_NATIVE_TYPE ( (lv_typedef_6_0= ruleTYPEDEF ) )*
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:323:2: ( (lv_name_2_0= RULE_ID_PRE ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:324:1: (lv_name_2_0= RULE_ID_PRE )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:324:1: (lv_name_2_0= RULE_ID_PRE )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:325:3: lv_name_2_0= RULE_ID_PRE
            	    {
            	    lv_name_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID_PRE,FOLLOW_RULE_ID_PRE_in_ruleTYPEDEF545); 

            	    			createLeafNode(grammarAccess.getTYPEDEFAccess().getNameID_PRETerminalRuleCall_2_0_0(), "name"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTYPEDEFRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_2_0, 
            	    	        		"ID_PRE", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	     
            	            currentNode=createCompositeNode(grammarAccess.getTYPEDEFAccess().getCardinalityParserRuleCall_2_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleCardinality_in_ruleTYPEDEF566);
            	    ruleCardinality();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        
            	    match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleTYPEDEF574); 
            	     
            	        createLeafNode(grammarAccess.getTYPEDEFAccess().getCOLONTerminalRuleCall_2_2(), null); 
            	        
            	    match(input,RULE_NATIVE_TYPE,FOLLOW_RULE_NATIVE_TYPE_in_ruleTYPEDEF582); 
            	     
            	        createLeafNode(grammarAccess.getTYPEDEFAccess().getNATIVE_TYPETerminalRuleCall_2_3(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:363:1: ( (lv_typedef_6_0= ruleTYPEDEF ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_LCURLY) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:364:1: (lv_typedef_6_0= ruleTYPEDEF )
            	    	    {
            	    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:364:1: (lv_typedef_6_0= ruleTYPEDEF )
            	    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:365:3: lv_typedef_6_0= ruleTYPEDEF
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getTYPEDEFAccess().getTypedefTYPEDEFParserRuleCall_2_4_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleTYPEDEF_in_ruleTYPEDEF602);
            	    	    lv_typedef_6_0=ruleTYPEDEF();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getTYPEDEFRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"typedef",
            	    	    	        		lv_typedef_6_0, 
            	    	    	        		"TYPEDEF", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleTYPEDEF614); 
             
                createLeafNode(grammarAccess.getTYPEDEFAccess().getRCURLYTerminalRuleCall_3(), null); 
                

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
    // $ANTLR end ruleTYPEDEF


    // $ANTLR start entryRuleMain
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:399:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:400:2: (iv_ruleMain= ruleMain EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:401:2: iv_ruleMain= ruleMain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain649);
            iv_ruleMain=ruleMain();
            _fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain659); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:408:1: ruleMain returns [EObject current=null] : ( 'main' ( (lv_mainrocess_1_0= ruleMainProcess ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_mainrocess_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:413:6: ( ( 'main' ( (lv_mainrocess_1_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:414:1: ( 'main' ( (lv_mainrocess_1_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:414:1: ( 'main' ( (lv_mainrocess_1_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:414:3: 'main' ( (lv_mainrocess_1_0= ruleMainProcess ) )
            {
            match(input,38,FOLLOW_38_in_ruleMain694); 

                    createLeafNode(grammarAccess.getMainAccess().getMainKeyword_0(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:418:1: ( (lv_mainrocess_1_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:419:1: (lv_mainrocess_1_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:419:1: (lv_mainrocess_1_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:420:3: lv_mainrocess_1_0= ruleMainProcess
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMainProcess_in_ruleMain715);
            lv_mainrocess_1_0=ruleMainProcess();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mainrocess",
            	        		lv_mainrocess_1_0, 
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
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleMainProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:450:1: entryRuleMainProcess returns [EObject current=null] : iv_ruleMainProcess= ruleMainProcess EOF ;
    public final EObject entryRuleMainProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProcess = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:451:2: (iv_ruleMainProcess= ruleMainProcess EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:452:2: iv_ruleMainProcess= ruleMainProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleMainProcess_in_entryRuleMainProcess751);
            iv_ruleMainProcess=ruleMainProcess();
            _fsp--;

             current =iv_ruleMainProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainProcess761); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:459:1: ruleMainProcess returns [EObject current=null] : ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY ) ;
    public final EObject ruleMainProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_parallelStatement_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:464:6: ( ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:465:1: ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:465:1: ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:465:2: () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:465:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:466:5: 
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

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleMainProcess804); 
             
                createLeafNode(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:480:1: ( (lv_parallelStatement_2_0= ruleParallelStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:481:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:481:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:482:3: lv_parallelStatement_2_0= ruleParallelStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParallelStatement_in_ruleMainProcess824);
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

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleMainProcess833); 
             
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:516:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:517:2: (iv_ruleProcess= ruleProcess EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:518:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess868);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess878); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:525:1: ruleProcess returns [EObject current=null] : ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_children_2_0 = null;

        EObject lv_children_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:530:6: ( ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LCURLY) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_LPAREN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("531:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:2: ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:2: ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:3: () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:532:5: 
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

                    match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProcess922); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:546:1: ( (lv_children_2_0= ruleParallelStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:547:1: (lv_children_2_0= ruleParallelStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:547:1: (lv_children_2_0= ruleParallelStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:548:3: lv_children_2_0= ruleParallelStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParallelStatement_in_ruleProcess942);
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

                    match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProcess951); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:575:6: ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:575:6: ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:575:7: RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleProcess967); 
                     
                        createLeafNode(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:579:1: ( (lv_children_5_0= ruleParallelStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:1: (lv_children_5_0= ruleParallelStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:1: (lv_children_5_0= ruleParallelStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:581:3: lv_children_5_0= ruleParallelStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParallelStatement_in_ruleProcess987);
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

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleProcess996); 
                     
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:615:1: entryRuleParallelStatement returns [EObject current=null] : iv_ruleParallelStatement= ruleParallelStatement EOF ;
    public final EObject entryRuleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:616:2: (iv_ruleParallelStatement= ruleParallelStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:617:2: iv_ruleParallelStatement= ruleParallelStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParallelStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement1032);
            iv_ruleParallelStatement=ruleParallelStatement();
            _fsp--;

             current =iv_ruleParallelStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStatement1042); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:624:1: ruleParallelStatement returns [EObject current=null] : ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) ) ;
    public final EObject ruleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_children_1_0 = null;

        EObject lv_children_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:629:6: ( ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:630:1: ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:630:1: ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:630:2: () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:630:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:631:5: 
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:641:2: ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:641:3: ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:641:3: ( (lv_children_1_0= ruleSequenceStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:642:1: (lv_children_1_0= ruleSequenceStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:642:1: (lv_children_1_0= ruleSequenceStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:643:3: lv_children_1_0= ruleSequenceStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSequenceStatement_in_ruleParallelStatement1098);
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:665:2: ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_VERT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:665:3: RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) )
            	    {
            	    match(input,RULE_VERT,FOLLOW_RULE_VERT_in_ruleParallelStatement1108); 
            	     
            	        createLeafNode(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:669:1: ( (lv_children_3_0= ruleSequenceStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:670:1: (lv_children_3_0= ruleSequenceStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:670:1: (lv_children_3_0= ruleSequenceStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:671:3: lv_children_3_0= ruleSequenceStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequenceStatement_in_ruleParallelStatement1128);
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
            	    break loop8;
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:701:1: entryRuleSequenceStatement returns [EObject current=null] : iv_ruleSequenceStatement= ruleSequenceStatement EOF ;
    public final EObject entryRuleSequenceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:702:2: (iv_ruleSequenceStatement= ruleSequenceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:703:2: iv_ruleSequenceStatement= ruleSequenceStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSequenceStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement1167);
            iv_ruleSequenceStatement=ruleSequenceStatement();
            _fsp--;

             current =iv_ruleSequenceStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceStatement1177); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:710:1: ruleSequenceStatement returns [EObject current=null] : ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) ) ;
    public final EObject ruleSequenceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_children_1_0 = null;

        EObject lv_children_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:715:6: ( ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:716:1: ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:716:1: ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:716:2: () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:716:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:717:5: 
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:727:2: ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:727:3: ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:727:3: ( (lv_children_1_0= ruleBasicStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:728:1: (lv_children_1_0= ruleBasicStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:728:1: (lv_children_1_0= ruleBasicStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:729:3: lv_children_1_0= ruleBasicStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBasicStatement_in_ruleSequenceStatement1233);
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:751:2: ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SEMICOLON) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:751:3: RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) )
            	    {
            	    match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement1243); 
            	     
            	        createLeafNode(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:755:1: ( (lv_children_3_0= ruleBasicStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:756:1: (lv_children_3_0= ruleBasicStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:756:1: (lv_children_3_0= ruleBasicStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:757:3: lv_children_3_0= ruleBasicStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicStatement_in_ruleSequenceStatement1263);
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
            	    break loop9;
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:787:1: entryRuleBasicStatement returns [EObject current=null] : iv_ruleBasicStatement= ruleBasicStatement EOF ;
    public final EObject entryRuleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:788:2: (iv_ruleBasicStatement= ruleBasicStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:789:2: iv_ruleBasicStatement= ruleBasicStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBasicStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement1302);
            iv_ruleBasicStatement=ruleBasicStatement();
            _fsp--;

             current =iv_ruleBasicStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStatement1312); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:796:1: ruleBasicStatement returns [EObject current=null] : ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) | ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) ) | this_With_8= ruleWith ) ;
    public final EObject ruleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_process_1_0 = null;

        EObject lv_assignStatementOrPostIncrementDecrement_3_0 = null;

        EObject lv_NDChoiceStatement_5_0 = null;

        EObject lv_preIncrementDecrement_7_0 = null;

        EObject this_With_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:801:6: ( ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) | ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) ) | this_With_8= ruleWith ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) | ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) ) | this_With_8= ruleWith )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) | ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) ) | this_With_8= ruleWith )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_LCURLY:
            case RULE_LPAREN:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
            case RULE_ID_PRE:
            case 39:
                {
                alt10=2;
                }
                break;
            case RULE_LSQUARE:
                {
                alt10=3;
                }
                break;
            case RULE_CHOICE:
            case RULE_DECREMENT:
                {
                alt10=4;
                }
                break;
            case 40:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("802:1: ( ( () ( (lv_process_1_0= ruleProcess ) ) ) | ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) ) | ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) ) | ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) ) | this_With_8= ruleWith )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:2: ( () ( (lv_process_1_0= ruleProcess ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:2: ( () ( (lv_process_1_0= ruleProcess ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:3: () ( (lv_process_1_0= ruleProcess ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:802:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:803:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getBasicStatementAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getBasicStatementAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:813:2: ( (lv_process_1_0= ruleProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:814:1: (lv_process_1_0= ruleProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:814:1: (lv_process_1_0= ruleProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:815:3: lv_process_1_0= ruleProcess
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcess_in_ruleBasicStatement1368);
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:6: ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:6: ( () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:7: () ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:839:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getBasicStatementAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getBasicStatementAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:849:2: ( (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:850:1: (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:850:1: (lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:851:3: lv_assignStatementOrPostIncrementDecrement_3_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getAssignStatementOrPostIncrementDecrementAssignStatementOrPostIncrementDecrementOrInputOperationParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_ruleBasicStatement1406);
                    lv_assignStatementOrPostIncrementDecrement_3_0=ruleAssignStatementOrPostIncrementDecrementOrInputOperation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assignStatementOrPostIncrementDecrement",
                    	        		lv_assignStatementOrPostIncrementDecrement_3_0, 
                    	        		"AssignStatementOrPostIncrementDecrementOrInputOperation", 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:874:6: ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:874:6: ( () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:874:7: () ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:874:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:875:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getBasicStatementAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getBasicStatementAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:885:2: ( (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:886:1: (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:886:1: (lv_NDChoiceStatement_5_0= ruleNDChoiceStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:887:3: lv_NDChoiceStatement_5_0= ruleNDChoiceStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement1444);
                    lv_NDChoiceStatement_5_0=ruleNDChoiceStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
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
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:910:6: ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:910:6: ( () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:910:7: () ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:910:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:911:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBasicStatementAccess().getBasicStatementAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getBasicStatementAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:921:2: ( (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:922:1: (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:922:1: (lv_preIncrementDecrement_7_0= rulePreIncrementDecrement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:923:3: lv_preIncrementDecrement_7_0= rulePreIncrementDecrement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getPreIncrementDecrementPreIncrementDecrementParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePreIncrementDecrement_in_ruleBasicStatement1482);
                    lv_preIncrementDecrement_7_0=rulePreIncrementDecrement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"preIncrementDecrement",
                    	        		lv_preIncrementDecrement_7_0, 
                    	        		"PreIncrementDecrement", 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:947:5: this_With_8= ruleWith
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getWithParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWith_in_ruleBasicStatement1511);
                    this_With_8=ruleWith();
                    _fsp--;

                     
                            current = this_With_8; 
                            currentNode = currentNode.getParent();
                        

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


    // $ANTLR start entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:963:1: entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation returns [EObject current=null] : iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation= ruleAssignStatementOrPostIncrementDecrementOrInputOperation EOF ;
    public final EObject entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:964:2: (iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation= ruleAssignStatementOrPostIncrementDecrementOrInputOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:965:2: iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation= ruleAssignStatementOrPostIncrementDecrementOrInputOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation1546);
            iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation=ruleAssignStatementOrPostIncrementDecrementOrInputOperation();
            _fsp--;

             current =iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation1556); 

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
    // $ANTLR end entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation


    // $ANTLR start ruleAssignStatementOrPostIncrementDecrementOrInputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:972:1: ruleAssignStatementOrPostIncrementDecrementOrInputOperation returns [EObject current=null] : ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) ) ;
    public final EObject ruleAssignStatementOrPostIncrementDecrementOrInputOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_1_0 = null;

        EObject lv_rightSide_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:977:6: ( ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:978:1: ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:978:1: ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:978:2: () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:978:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:979:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getAssignStatementOrPostIncrementDecrementAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getAssignStatementOrPostIncrementDecrementAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:989:2: ( (lv_variablePath_1_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:990:1: (lv_variablePath_1_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:990:1: (lv_variablePath_1_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:991:3: lv_variablePath_1_0= ruleVariablePath
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getVariablePathVariablePathParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariablePath_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation1611);
            lv_variablePath_1_0=ruleVariablePath();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1013:2: ( (lv_rightSide_2_0= ruleRightSide ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1014:1: (lv_rightSide_2_0= ruleRightSide )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1014:1: (lv_rightSide_2_0= ruleRightSide )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1015:3: lv_rightSide_2_0= ruleRightSide
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getRightSideRightSideParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRightSide_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation1632);
            lv_rightSide_2_0=ruleRightSide();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"rightSide",
            	        		lv_rightSide_2_0, 
            	        		"RightSide", 
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
    // $ANTLR end ruleAssignStatementOrPostIncrementDecrementOrInputOperation


    // $ANTLR start entryRuleRightSide
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1045:1: entryRuleRightSide returns [EObject current=null] : iv_ruleRightSide= ruleRightSide EOF ;
    public final EObject entryRuleRightSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSide = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1046:2: (iv_ruleRightSide= ruleRightSide EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1047:2: iv_ruleRightSide= ruleRightSide EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRightSideRule(), currentNode); 
            pushFollow(FOLLOW_ruleRightSide_in_entryRuleRightSide1668);
            iv_ruleRightSide=ruleRightSide();
            _fsp--;

             current =iv_ruleRightSide; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSide1678); 

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
    // $ANTLR end entryRuleRightSide


    // $ANTLR start ruleRightSide
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1054:1: ruleRightSide returns [EObject current=null] : ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) ) ) ;
    public final EObject ruleRightSide() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_variablePath_9_0 = null;

        EObject lv_variablePath_12_0 = null;

        EObject lv_variablePath_14_0 = null;

        EObject lv_operation_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1059:6: ( ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1060:1: ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1060:1: ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_ASSIGN:
                {
                alt11=1;
                }
                break;
            case RULE_CHOICE:
                {
                alt11=2;
                }
                break;
            case RULE_DECREMENT:
                {
                alt11=3;
                }
                break;
            case RULE_POINTSTO:
                {
                alt11=4;
                }
                break;
            case RULE_DEEPCOPYLEFT:
                {
                alt11=5;
                }
                break;
            case RULE_LPAREN:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1060:1: ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1060:2: ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1060:2: ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1060:3: () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1060:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1061:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleRightSide1722); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getASSIGNTerminalRuleCall_0_1(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1075:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1076:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1076:1: (lv_expression_2_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1077:3: lv_expression_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getExpressionExpressionParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleRightSide1742);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_2_0, 
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
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1100:6: ( () RULE_CHOICE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1100:6: ( () RULE_CHOICE )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1100:7: () RULE_CHOICE
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1100:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1101:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_ruleRightSide1768); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getCHOICETerminalRuleCall_1_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1116:6: ( () RULE_DECREMENT )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1116:6: ( () RULE_DECREMENT )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1116:7: () RULE_DECREMENT
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1116:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1117:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleRightSide1793); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getDECREMENTTerminalRuleCall_2_1(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1132:6: ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1132:6: ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1132:7: () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1132:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1133:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_POINTSTO,FOLLOW_RULE_POINTSTO_in_ruleRightSide1818); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getPOINTSTOTerminalRuleCall_3_1(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1147:1: ( (lv_variablePath_9_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1148:1: (lv_variablePath_9_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1148:1: (lv_variablePath_9_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1149:3: lv_variablePath_9_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getVariablePathVariablePathParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleRightSide1838);
                    lv_variablePath_9_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
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


                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1172:6: ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1172:6: ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1172:7: () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1172:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1173:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,RULE_DEEPCOPYLEFT,FOLLOW_RULE_DEEPCOPYLEFT_in_ruleRightSide1864); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getDEEPCOPYLEFTTerminalRuleCall_4_1(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1187:1: ( (lv_variablePath_12_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1188:1: (lv_variablePath_12_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1188:1: (lv_variablePath_12_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1189:3: lv_variablePath_12_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getVariablePathVariablePathParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleRightSide1884);
                    lv_variablePath_12_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
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


                    }


                    }
                    break;
                case 6 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1212:6: ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1212:6: ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1212:7: RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_16_0= ruleOperation ) )
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRightSide1901); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getLPARENTerminalRuleCall_5_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1216:1: ( (lv_variablePath_14_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1217:1: (lv_variablePath_14_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1217:1: (lv_variablePath_14_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1218:3: lv_variablePath_14_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getVariablePathVariablePathParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleRightSide1921);
                    lv_variablePath_14_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"variablePath",
                    	        		lv_variablePath_14_0, 
                    	        		"VariablePath", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRightSide1930); 
                     
                        createLeafNode(grammarAccess.getRightSideAccess().getRPARENTerminalRuleCall_5_2(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1244:1: ( (lv_operation_16_0= ruleOperation ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1245:1: (lv_operation_16_0= ruleOperation )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1245:1: (lv_operation_16_0= ruleOperation )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1246:3: lv_operation_16_0= ruleOperation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getOperationOperationParserRuleCall_5_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperation_in_ruleRightSide1950);
                    lv_operation_16_0=ruleOperation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"operation",
                    	        		lv_operation_16_0, 
                    	        		"Operation", 
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
    // $ANTLR end ruleRightSide


    // $ANTLR start entryRuleOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1276:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1277:2: (iv_ruleOperation= ruleOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1278:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1987);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1997); 

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
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1285:1: ruleOperation returns [EObject current=null] : ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_mainProcess_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1290:6: ( ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1291:1: ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1291:1: ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1291:2: () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1291:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1292:5: 
            {
             
                    temp=factory.create(grammarAccess.getOperationAccess().getOperationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getOperationAccess().getOperationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1302:2: ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LPAREN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1302:3: RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) )
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOperation2041); 
                     
                        createLeafNode(grammarAccess.getOperationAccess().getLPARENTerminalRuleCall_1_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1306:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1307:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1307:1: (lv_expression_2_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1308:3: lv_expression_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleOperation2061);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOperation2070); 
                     
                        createLeafNode(grammarAccess.getOperationAccess().getRPARENTerminalRuleCall_1_2(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1334:1: ( (lv_mainProcess_4_0= ruleMainProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1335:1: (lv_mainProcess_4_0= ruleMainProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1335:1: (lv_mainProcess_4_0= ruleMainProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1336:3: lv_mainProcess_4_0= ruleMainProcess
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getMainProcessMainProcessParserRuleCall_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMainProcess_in_ruleOperation2090);
                    lv_mainProcess_4_0=ruleMainProcess();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
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
    // $ANTLR end ruleOperation


    // $ANTLR start entryRulePreIncrementDecrement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1366:1: entryRulePreIncrementDecrement returns [EObject current=null] : iv_rulePreIncrementDecrement= rulePreIncrementDecrement EOF ;
    public final EObject entryRulePreIncrementDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreIncrementDecrement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1367:2: (iv_rulePreIncrementDecrement= rulePreIncrementDecrement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1368:2: iv_rulePreIncrementDecrement= rulePreIncrementDecrement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPreIncrementDecrementRule(), currentNode); 
            pushFollow(FOLLOW_rulePreIncrementDecrement_in_entryRulePreIncrementDecrement2128);
            iv_rulePreIncrementDecrement=rulePreIncrementDecrement();
            _fsp--;

             current =iv_rulePreIncrementDecrement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreIncrementDecrement2138); 

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
    // $ANTLR end entryRulePreIncrementDecrement


    // $ANTLR start rulePreIncrementDecrement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1375:1: rulePreIncrementDecrement returns [EObject current=null] : ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) ) ;
    public final EObject rulePreIncrementDecrement() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1380:6: ( ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:1: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:1: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:2: ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:2: ( RULE_CHOICE | RULE_DECREMENT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_CHOICE) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_DECREMENT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1381:2: ( RULE_CHOICE | RULE_DECREMENT )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1381:3: RULE_CHOICE
                    {
                    match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rulePreIncrementDecrement2173); 
                     
                        createLeafNode(grammarAccess.getPreIncrementDecrementAccess().getCHOICETerminalRuleCall_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1386:6: RULE_DECREMENT
                    {
                    match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rulePreIncrementDecrement2187); 
                     
                        createLeafNode(grammarAccess.getPreIncrementDecrementAccess().getDECREMENTTerminalRuleCall_0_1(), null); 
                        

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1390:2: ( (lv_variablePath_2_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1391:1: (lv_variablePath_2_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1391:1: (lv_variablePath_2_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1392:3: lv_variablePath_2_0= ruleVariablePath
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPreIncrementDecrementAccess().getVariablePathVariablePathParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariablePath_in_rulePreIncrementDecrement2208);
            lv_variablePath_2_0=ruleVariablePath();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPreIncrementDecrementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"variablePath",
            	        		lv_variablePath_2_0, 
            	        		"VariablePath", 
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
    // $ANTLR end rulePreIncrementDecrement


    // $ANTLR start entryRuleExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1422:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1423:2: (iv_ruleExpression= ruleExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1424:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2244);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2254); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1431:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1436:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1437:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1437:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1438:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression2301);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1446:1: ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ASTERISK||(LA15_0>=RULE_PLUS && LA15_0<=RULE_DIVIDE)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1446:2: () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1446:2: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1447:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1462:2: ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1463:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1463:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1464:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1464:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    int alt14=4;
                    switch ( input.LA(1) ) {
                    case RULE_PLUS:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_MINUS:
                        {
                        alt14=2;
                        }
                        break;
                    case RULE_ASTERISK:
                        {
                        alt14=3;
                        }
                        break;
                    case RULE_DIVIDE:
                        {
                        alt14=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1464:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1465:3: lv_op_2_1= RULE_PLUS
                            {
                            lv_op_2_1=(Token)input.LT(1);
                            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExpression2329); 

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
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1486:8: lv_op_2_2= RULE_MINUS
                            {
                            lv_op_2_2=(Token)input.LT(1);
                            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExpression2349); 

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
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1507:8: lv_op_2_3= RULE_ASTERISK
                            {
                            lv_op_2_3=(Token)input.LT(1);
                            match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleExpression2369); 

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
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1528:8: lv_op_2_4= RULE_DIVIDE
                            {
                            lv_op_2_4=(Token)input.LT(1);
                            match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleExpression2389); 

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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1552:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1553:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1553:1: (lv_right_3_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1554:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2418);
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1584:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1585:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1586:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2456);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression2466); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1593:1: ruleTerminalExpression returns [EObject current=null] : ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        EObject this_Expression_1 = null;

        EObject lv_variablePath_11_0 = null;

        EObject lv_variablePath_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1598:6: ( ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1599:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1599:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_LPAREN:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case RULE_REAL:
                {
                alt18=3;
                }
                break;
            case RULE_STRING:
                {
                alt18=4;
                }
                break;
            case RULE_CHOICE:
            case RULE_DECREMENT:
                {
                alt18=5;
                }
                break;
            case RULE_ID:
            case RULE_ID_PRE:
            case 39:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1599:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_REAL ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1599:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1599:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1599:3: RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleTerminalExpression2501); 
                     
                        createLeafNode(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2522);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleTerminalExpression2530); 
                     
                        createLeafNode(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1617:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1617:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1617:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1617:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1618:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1628:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1629:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1629:1: (lv_value_4_0= RULE_INT )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1630:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression2563); 

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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1653:6: ( () ( (lv_value_6_0= RULE_REAL ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1653:6: ( () ( (lv_value_6_0= RULE_REAL ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1653:7: () ( (lv_value_6_0= RULE_REAL ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1653:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1654:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1664:2: ( (lv_value_6_0= RULE_REAL ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1665:1: (lv_value_6_0= RULE_REAL )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1665:1: (lv_value_6_0= RULE_REAL )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1666:3: lv_value_6_0= RULE_REAL
                    {
                    lv_value_6_0=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTerminalExpression2602); 

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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1689:6: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1689:6: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1689:7: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1689:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1690:5: 
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1700:2: ( (lv_value_8_0= RULE_STRING ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1701:1: (lv_value_8_0= RULE_STRING )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1701:1: (lv_value_8_0= RULE_STRING )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1702:3: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression2641); 

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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1725:6: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1725:6: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1725:7: ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_11_0= ruleVariablePath ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1725:7: ( RULE_CHOICE | RULE_DECREMENT )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_CHOICE) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_DECREMENT) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1725:7: ( RULE_CHOICE | RULE_DECREMENT )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1725:8: RULE_CHOICE
                            {
                            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_ruleTerminalExpression2664); 
                             
                                createLeafNode(grammarAccess.getTerminalExpressionAccess().getCHOICETerminalRuleCall_4_0_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1730:6: RULE_DECREMENT
                            {
                            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression2678); 
                             
                                createLeafNode(grammarAccess.getTerminalExpressionAccess().getDECREMENTTerminalRuleCall_4_0_1(), null); 
                                

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1734:2: ( (lv_variablePath_11_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1735:1: (lv_variablePath_11_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1735:1: (lv_variablePath_11_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1736:3: lv_variablePath_11_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleTerminalExpression2699);
                    lv_variablePath_11_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"variablePath",
                    	        		lv_variablePath_11_0, 
                    	        		"VariablePath", 
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
                case 6 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1759:6: ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1759:6: ( ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1759:7: ( (lv_variablePath_12_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )?
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1759:7: ( (lv_variablePath_12_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1760:1: (lv_variablePath_12_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1760:1: (lv_variablePath_12_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1761:3: lv_variablePath_12_0= ruleVariablePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_5_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleTerminalExpression2728);
                    lv_variablePath_12_0=ruleVariablePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
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

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1783:2: ( RULE_CHOICE | RULE_DECREMENT )?
                    int alt17=3;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_CHOICE) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_DECREMENT) ) {
                        alt17=2;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1783:3: RULE_CHOICE
                            {
                            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_ruleTerminalExpression2738); 
                             
                                createLeafNode(grammarAccess.getTerminalExpressionAccess().getCHOICETerminalRuleCall_5_1_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1788:6: RULE_DECREMENT
                            {
                            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression2752); 
                             
                                createLeafNode(grammarAccess.getTerminalExpressionAccess().getDECREMENTTerminalRuleCall_5_1_1(), null); 
                                

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
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1800:1: entryRuleVariablePath returns [EObject current=null] : iv_ruleVariablePath= ruleVariablePath EOF ;
    public final EObject entryRuleVariablePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablePath = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1801:2: (iv_ruleVariablePath= ruleVariablePath EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1802:2: iv_ruleVariablePath= ruleVariablePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariablePathRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath2790);
            iv_ruleVariablePath=ruleVariablePath();
            _fsp--;

             current =iv_ruleVariablePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath2800); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1809:1: ruleVariablePath returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID_PRE ) ) ) | ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) ) ;
    public final EObject ruleVariablePath() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_children_4_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_14_0 = null;

        EObject lv_children_22_0 = null;

        EObject lv_children_26_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1814:6: ( ( ( () ( (lv_name_1_0= RULE_ID_PRE ) ) ) | ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1815:1: ( ( () ( (lv_name_1_0= RULE_ID_PRE ) ) ) | ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1815:1: ( ( () ( (lv_name_1_0= RULE_ID_PRE ) ) ) | ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_ID_PRE:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 39:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1815:1: ( ( () ( (lv_name_1_0= RULE_ID_PRE ) ) ) | ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1815:2: ( () ( (lv_name_1_0= RULE_ID_PRE ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1815:2: ( () ( (lv_name_1_0= RULE_ID_PRE ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1815:3: () ( (lv_name_1_0= RULE_ID_PRE ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1815:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1816:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getVariablePathAccess().getVariablePathAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getVariablePathAccess().getVariablePathAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1826:2: ( (lv_name_1_0= RULE_ID_PRE ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1827:1: (lv_name_1_0= RULE_ID_PRE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1827:1: (lv_name_1_0= RULE_ID_PRE )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1828:3: lv_name_1_0= RULE_ID_PRE
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID_PRE,FOLLOW_RULE_ID_PRE_in_ruleVariablePath2852); 

                    			createLeafNode(grammarAccess.getVariablePathAccess().getNameID_PRETerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID_PRE", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1851:6: ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1851:6: ( ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1851:7: ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )*
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1851:7: ( (lv_name_2_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1852:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1852:1: (lv_name_2_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1853:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath2882); 

                    			createLeafNode(grammarAccess.getVariablePathAccess().getNameIDTerminalRuleCall_1_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1875:2: ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_LSQUARE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1875:3: RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE
                            {
                            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath2897); 
                             
                                createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_1_1_0(), null); 
                                
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1879:1: ( (lv_children_4_0= ruleExpression ) )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1880:1: (lv_children_4_0= ruleExpression )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1880:1: (lv_children_4_0= ruleExpression )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1881:3: lv_children_4_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath2917);
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

                            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath2926); 
                             
                                createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_1_1_2(), null); 
                                

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1907:3: ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )*
                    loop22:
                    do {
                        int alt22=3;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_DOT) ) {
                            int LA22_2 = input.LA(2);

                            if ( (LA22_2==RULE_LPAREN) ) {
                                alt22=2;
                            }
                            else if ( (LA22_2==RULE_ID||LA22_2==39) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1907:4: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1907:4: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1907:5: RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath2938); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_0_0(), null); 
                    	        
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1911:1: ( RULE_ID | 'global' )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==RULE_ID) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==39) ) {
                    	        alt20=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1911:1: ( RULE_ID | 'global' )", 20, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1911:2: RULE_ID
                    	            {
                    	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath2947); 
                    	             
                    	                createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_2_0_1_0(), null); 
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1916:7: 'global'
                    	            {
                    	            match(input,39,FOLLOW_39_in_ruleVariablePath2962); 

                    	                    createLeafNode(grammarAccess.getVariablePathAccess().getGlobalKeyword_1_2_0_1_1(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1920:2: ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==RULE_LSQUARE) ) {
                    	        alt21=1;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1920:3: RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE
                    	            {
                    	            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath2973); 
                    	             
                    	                createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_1_2_0_2_0(), null); 
                    	                
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1924:1: ( (lv_children_10_0= ruleExpression ) )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1925:1: (lv_children_10_0= ruleExpression )
                    	            {
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1925:1: (lv_children_10_0= ruleExpression )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1926:3: lv_children_10_0= ruleExpression
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_0_2_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath2993);
                    	            lv_children_10_0=ruleExpression();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"children",
                    	            	        		lv_children_10_0, 
                    	            	        		"Expression", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }

                    	            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath3002); 
                    	             
                    	                createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_1_2_0_2_2(), null); 
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1953:6: ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1953:6: ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1953:7: RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath3020); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_1_0(), null); 
                    	        
                    	    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleVariablePath3028); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_1_2_1_1(), null); 
                    	        
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1961:1: ( (lv_children_14_0= ruleExpression ) )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1962:1: (lv_children_14_0= ruleExpression )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1962:1: (lv_children_14_0= ruleExpression )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1963:3: lv_children_14_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_1_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath3048);
                    	    lv_children_14_0=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"children",
                    	    	        		lv_children_14_0, 
                    	    	        		"Expression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleVariablePath3057); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_1_2_1_3(), null); 
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1990:6: ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1990:6: ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1990:7: () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )*
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1990:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1991:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getVariablePathAccess().getVariablePathAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getVariablePathAccess().getVariablePathAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,39,FOLLOW_39_in_ruleVariablePath3086); 

                            createLeafNode(grammarAccess.getVariablePathAccess().getGlobalKeyword_2_1(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2005:1: ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_DOT) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==RULE_LPAREN) ) {
                                alt25=2;
                            }
                            else if ( (LA25_2==RULE_ID||LA25_2==39) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2005:2: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2005:2: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2005:3: RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath3097); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_2_2_0_0(), null); 
                    	        
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2009:1: ( RULE_ID | 'global' )
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==RULE_ID) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==39) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("2009:1: ( RULE_ID | 'global' )", 23, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2009:2: RULE_ID
                    	            {
                    	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath3106); 
                    	             
                    	                createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_2_2_0_1_0(), null); 
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2014:7: 'global'
                    	            {
                    	            match(input,39,FOLLOW_39_in_ruleVariablePath3121); 

                    	                    createLeafNode(grammarAccess.getVariablePathAccess().getGlobalKeyword_2_2_0_1_1(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2018:2: ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==RULE_LSQUARE) ) {
                    	        alt24=1;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2018:3: RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE
                    	            {
                    	            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath3132); 
                    	             
                    	                createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_2_2_0_2_0(), null); 
                    	                
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2022:1: ( (lv_children_22_0= ruleExpression ) )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2023:1: (lv_children_22_0= ruleExpression )
                    	            {
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2023:1: (lv_children_22_0= ruleExpression )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2024:3: lv_children_22_0= ruleExpression
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_2_2_0_2_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath3152);
                    	            lv_children_22_0=ruleExpression();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"children",
                    	            	        		lv_children_22_0, 
                    	            	        		"Expression", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }

                    	            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath3161); 
                    	             
                    	                createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_2_2_0_2_2(), null); 
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2051:6: ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2051:6: ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2051:7: RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath3179); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_2_2_1_0(), null); 
                    	        
                    	    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleVariablePath3187); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_2_2_1_1(), null); 
                    	        
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2059:1: ( (lv_children_26_0= ruleExpression ) )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2060:1: (lv_children_26_0= ruleExpression )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2060:1: (lv_children_26_0= ruleExpression )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2061:3: lv_children_26_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_2_2_1_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath3207);
                    	    lv_children_26_0=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"children",
                    	    	        		lv_children_26_0, 
                    	    	        		"Expression", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleVariablePath3216); 
                    	     
                    	        createLeafNode(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_2_2_1_3(), null); 
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


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
    // $ANTLR end ruleVariablePath


    // $ANTLR start entryRuleWith
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2095:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2096:2: (iv_ruleWith= ruleWith EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2097:2: iv_ruleWith= ruleWith EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWithRule(), currentNode); 
            pushFollow(FOLLOW_ruleWith_in_entryRuleWith3255);
            iv_ruleWith=ruleWith();
            _fsp--;

             current =iv_ruleWith; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWith3265); 

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
    // $ANTLR end entryRuleWith


    // $ANTLR start ruleWith
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2104:1: ruleWith returns [EObject current=null] : ( () 'with' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_mainrocess_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2109:6: ( ( () 'with' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2110:1: ( () 'with' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2110:1: ( () 'with' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2110:2: () 'with' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2110:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2111:5: 
            {
             
                    temp=factory.create(grammarAccess.getWithAccess().getWithAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getWithAccess().getWithAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,40,FOLLOW_40_in_ruleWith3309); 

                    createLeafNode(grammarAccess.getWithAccess().getWithKeyword_1(), null); 
                
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleWith3318); 
             
                createLeafNode(grammarAccess.getWithAccess().getLPARENTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2129:1: ( (lv_name_3_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2130:1: (lv_name_3_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2130:1: (lv_name_3_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2131:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWith3334); 

            			createLeafNode(grammarAccess.getWithAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWithRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleWith3348); 
             
                createLeafNode(grammarAccess.getWithAccess().getRPARENTerminalRuleCall_4(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2157:1: ( (lv_mainrocess_5_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2158:1: (lv_mainrocess_5_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2158:1: (lv_mainrocess_5_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2159:3: lv_mainrocess_5_0= ruleMainProcess
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWithAccess().getMainrocessMainProcessParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMainProcess_in_ruleWith3368);
            lv_mainrocess_5_0=ruleMainProcess();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWithRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"mainrocess",
            	        		lv_mainrocess_5_0, 
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
    // $ANTLR end ruleWith


    // $ANTLR start entryRuleNDChoiceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2189:1: entryRuleNDChoiceStatement returns [EObject current=null] : iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF ;
    public final EObject entryRuleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNDChoiceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2190:2: (iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2191:2: iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNDChoiceStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement3404);
            iv_ruleNDChoiceStatement=ruleNDChoiceStatement();
            _fsp--;

             current =iv_ruleNDChoiceStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDChoiceStatement3414); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2198:1: ruleNDChoiceStatement returns [EObject current=null] : ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ ) ;
    public final EObject ruleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_6_0 = null;

        EObject lv_variablePath_8_0 = null;

        EObject lv_operation_10_0 = null;

        EObject lv_mainProcess_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2203:6: ( ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2204:1: ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2204:1: ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2204:2: () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2204:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2205:5: 
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2215:2: ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_LSQUARE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2215:3: RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) )
            	    {
            	    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement3458); 
            	     
            	        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2219:1: ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==41) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==RULE_ID||LA27_0==RULE_ID_PRE||LA27_0==39) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2219:1: ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) ) )", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2219:2: ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2219:2: ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2219:4: 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN
            	            {
            	            match(input,41,FOLLOW_41_in_ruleNDChoiceStatement3469); 

            	                    createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLinkInKeyword_1_1_0_0(), null); 
            	                
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement3478); 
            	             
            	                createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_1_0_1(), null); 
            	                
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNDChoiceStatement3486); 
            	             
            	                createLeafNode(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_1_1_0_2(), null); 
            	                
            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement3494); 
            	             
            	                createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_1_0_3(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2236:6: ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2236:6: ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2236:7: ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_operation_10_0= ruleOperation ) )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2236:7: ( (lv_variablePath_6_0= ruleVariablePath ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2237:1: (lv_variablePath_6_0= ruleVariablePath )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2237:1: (lv_variablePath_6_0= ruleVariablePath )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2238:3: lv_variablePath_6_0= ruleVariablePath
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_1_1_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement3522);
            	            lv_variablePath_6_0=ruleVariablePath();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"variablePath",
            	            	        		lv_variablePath_6_0, 
            	            	        		"VariablePath", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement3531); 
            	             
            	                createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_1_1_1(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2264:1: ( (lv_variablePath_8_0= ruleVariablePath ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2265:1: (lv_variablePath_8_0= ruleVariablePath )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2265:1: (lv_variablePath_8_0= ruleVariablePath )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2266:3: lv_variablePath_8_0= ruleVariablePath
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_1_1_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement3551);
            	            lv_variablePath_8_0=ruleVariablePath();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"variablePath",
            	            	        		lv_variablePath_8_0, 
            	            	        		"VariablePath", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement3560); 
            	             
            	                createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_1_1_3(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2292:1: ( (lv_operation_10_0= ruleOperation ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2293:1: (lv_operation_10_0= ruleOperation )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2293:1: (lv_operation_10_0= ruleOperation )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2294:3: lv_operation_10_0= ruleOperation
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getOperationOperationParserRuleCall_1_1_1_4_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleOperation_in_ruleNDChoiceStatement3580);
            	            lv_operation_10_0=ruleOperation();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"operation",
            	            	        		lv_operation_10_0, 
            	            	        		"Operation", 
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

            	    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement3591); 
            	     
            	        createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_2(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2320:1: ( (lv_mainProcess_12_0= ruleMainProcess ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2321:1: (lv_mainProcess_12_0= ruleMainProcess )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2321:1: (lv_mainProcess_12_0= ruleMainProcess )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2322:3: lv_mainProcess_12_0= ruleMainProcess
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement3611);
            	    lv_mainProcess_12_0=ruleMainProcess();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mainProcess",
            	    	        		lv_mainProcess_12_0, 
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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


    // $ANTLR start entryRulePort
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2352:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2353:2: (iv_rulePort= rulePort EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2354:2: iv_rulePort= rulePort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPortRule(), currentNode); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort3649);
            iv_rulePort=rulePort();
            _fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort3659); 

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
    // $ANTLR end entryRulePort


    // $ANTLR start rulePort
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2361:1: rulePort returns [EObject current=null] : ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject lv_inputPortStatement_0_0 = null;

        EObject lv_outputPortStatement_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2366:6: ( ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2367:1: ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2367:1: ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            else if ( (LA29_0==43) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2367:1: ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2367:2: ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2367:2: ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2368:1: (lv_inputPortStatement_0_0= ruleInputPortStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2368:1: (lv_inputPortStatement_0_0= ruleInputPortStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2369:3: lv_inputPortStatement_0_0= ruleInputPortStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPortAccess().getInputPortStatementInputPortStatementParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInputPortStatement_in_rulePort3705);
                    lv_inputPortStatement_0_0=ruleInputPortStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"inputPortStatement",
                    	        		lv_inputPortStatement_0_0, 
                    	        		"InputPortStatement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2392:6: ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2392:6: ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2393:1: (lv_outputPortStatement_1_0= ruleOutputPortStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2393:1: (lv_outputPortStatement_1_0= ruleOutputPortStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2394:3: lv_outputPortStatement_1_0= ruleOutputPortStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPortAccess().getOutputPortStatementOutputPortStatementParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOutputPortStatement_in_rulePort3732);
                    lv_outputPortStatement_1_0=ruleOutputPortStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"outputPortStatement",
                    	        		lv_outputPortStatement_1_0, 
                    	        		"OutputPortStatement", 
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
    // $ANTLR end rulePort


    // $ANTLR start entryRuleInputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2424:1: entryRuleInputPortStatement returns [EObject current=null] : iv_ruleInputPortStatement= ruleInputPortStatement EOF ;
    public final EObject entryRuleInputPortStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPortStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2425:2: (iv_ruleInputPortStatement= ruleInputPortStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2426:2: iv_ruleInputPortStatement= ruleInputPortStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputPortStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputPortStatement_in_entryRuleInputPortStatement3768);
            iv_ruleInputPortStatement=ruleInputPortStatement();
            _fsp--;

             current =iv_ruleInputPortStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputPortStatement3778); 

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
    // $ANTLR end entryRuleInputPortStatement


    // $ANTLR start ruleInputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2433:1: ruleInputPortStatement returns [EObject current=null] : ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) ;
    public final EObject ruleInputPortStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_location_4_0 = null;

        EObject lv_protocol_5_0 = null;

        EObject lv_oneWayOperation_6_0 = null;

        EObject lv_RequestResponseOperation_7_0 = null;

        EObject lv_redirects_8_0 = null;

        EObject lv_aggregates_9_0 = null;

        EObject lv_intefaces_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2438:6: ( ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2439:1: ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2439:1: ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2439:3: 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY
            {
            match(input,42,FOLLOW_42_in_ruleInputPortStatement3813); 

                    createLeafNode(grammarAccess.getInputPortStatementAccess().getInputPortKeyword_0(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2443:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2444:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2444:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2445:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputPortStatement3830); 

            			createLeafNode(grammarAccess.getInputPortStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
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

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleInputPortStatement3844); 
             
                createLeafNode(grammarAccess.getInputPortStatementAccess().getLCURLYTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2471:1: ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2473:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2473:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2474:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2477:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2478:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2478:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )*
            loop30:
            do {
                int alt30=8;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
                    alt30=4;
                }
                else if ( LA30_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
                    alt30=5;
                }
                else if ( LA30_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5) ) {
                    alt30=6;
                }
                else if ( LA30_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6) ) {
                    alt30=7;
                }


                switch (alt30) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2480:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2480:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2481:5: {...}? => ( ( (lv_location_4_0= ruleLocation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2481:115: ( ( (lv_location_4_0= ruleLocation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2482:6: ( (lv_location_4_0= ruleLocation ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2485:6: ( (lv_location_4_0= ruleLocation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2486:1: (lv_location_4_0= ruleLocation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2486:1: (lv_location_4_0= ruleLocation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2487:3: lv_location_4_0= ruleLocation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getLocationLocationParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocation_in_ruleInputPortStatement3906);
            	    lv_location_4_0=ruleLocation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"location",
            	    	        		lv_location_4_0, 
            	    	        		"Location", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2516:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2516:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2517:5: {...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2517:115: ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2518:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2521:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2522:1: (lv_protocol_5_0= ruleProtocol )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2522:1: (lv_protocol_5_0= ruleProtocol )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2523:3: lv_protocol_5_0= ruleProtocol
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getProtocolProtocolParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtocol_in_ruleInputPortStatement3977);
            	    lv_protocol_5_0=ruleProtocol();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"protocol",
            	    	        		lv_protocol_5_0, 
            	    	        		"Protocol", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2552:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2552:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2553:5: {...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2553:115: ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2554:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2557:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2558:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2558:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2559:3: lv_oneWayOperation_6_0= ruleOneWayOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getOneWayOperationOneWayOperationParserRuleCall_3_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOneWayOperation_in_ruleInputPortStatement4048);
            	    lv_oneWayOperation_6_0=ruleOneWayOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"oneWayOperation",
            	    	        		lv_oneWayOperation_6_0, 
            	    	        		"OneWayOperation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2588:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2588:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2589:5: {...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2589:115: ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2590:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2593:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2594:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2594:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2595:3: lv_RequestResponseOperation_7_0= ruleRequestResponseOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleInputPortStatement4119);
            	    lv_RequestResponseOperation_7_0=ruleRequestResponseOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"RequestResponseOperation",
            	    	        		lv_RequestResponseOperation_7_0, 
            	    	        		"RequestResponseOperation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2624:4: ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2624:4: ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2625:5: {...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2625:115: ( ( (lv_redirects_8_0= ruleRedirects ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2626:6: ( (lv_redirects_8_0= ruleRedirects ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2629:6: ( (lv_redirects_8_0= ruleRedirects ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2630:1: (lv_redirects_8_0= ruleRedirects )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2630:1: (lv_redirects_8_0= ruleRedirects )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2631:3: lv_redirects_8_0= ruleRedirects
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getRedirectsRedirectsParserRuleCall_3_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRedirects_in_ruleInputPortStatement4190);
            	    lv_redirects_8_0=ruleRedirects();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"redirects",
            	    	        		lv_redirects_8_0, 
            	    	        		"Redirects", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2660:4: ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2660:4: ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2661:5: {...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2661:115: ( ( (lv_aggregates_9_0= ruleAggregates ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2662:6: ( (lv_aggregates_9_0= ruleAggregates ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2665:6: ( (lv_aggregates_9_0= ruleAggregates ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2666:1: (lv_aggregates_9_0= ruleAggregates )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2666:1: (lv_aggregates_9_0= ruleAggregates )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2667:3: lv_aggregates_9_0= ruleAggregates
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getAggregatesAggregatesParserRuleCall_3_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAggregates_in_ruleInputPortStatement4261);
            	    lv_aggregates_9_0=ruleAggregates();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"aggregates",
            	    	        		lv_aggregates_9_0, 
            	    	        		"Aggregates", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2696:4: ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2696:4: ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2697:5: {...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2697:115: ( ( (lv_intefaces_10_0= ruleInterfaces ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2698:6: ( (lv_intefaces_10_0= ruleInterfaces ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2701:6: ( (lv_intefaces_10_0= ruleInterfaces ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2702:1: (lv_intefaces_10_0= ruleInterfaces )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2702:1: (lv_intefaces_10_0= ruleInterfaces )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2703:3: lv_intefaces_10_0= ruleInterfaces
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getIntefacesInterfacesParserRuleCall_3_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaces_in_ruleInputPortStatement4332);
            	    lv_intefaces_10_0=ruleInterfaces();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"intefaces",
            	    	        		lv_intefaces_10_0, 
            	    	        		"Interfaces", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            	

            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleInputPortStatement4380); 
             
                createLeafNode(grammarAccess.getInputPortStatementAccess().getRCURLYTerminalRuleCall_4(), null); 
                

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
    // $ANTLR end ruleInputPortStatement


    // $ANTLR start entryRuleOutputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2751:1: entryRuleOutputPortStatement returns [EObject current=null] : iv_ruleOutputPortStatement= ruleOutputPortStatement EOF ;
    public final EObject entryRuleOutputPortStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPortStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2752:2: (iv_ruleOutputPortStatement= ruleOutputPortStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2753:2: iv_ruleOutputPortStatement= ruleOutputPortStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputPortStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputPortStatement_in_entryRuleOutputPortStatement4415);
            iv_ruleOutputPortStatement=ruleOutputPortStatement();
            _fsp--;

             current =iv_ruleOutputPortStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputPortStatement4425); 

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
    // $ANTLR end entryRuleOutputPortStatement


    // $ANTLR start ruleOutputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2760:1: ruleOutputPortStatement returns [EObject current=null] : ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) ;
    public final EObject ruleOutputPortStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_location_4_0 = null;

        EObject lv_protocol_5_0 = null;

        EObject lv_oneWayOperation_6_0 = null;

        EObject lv_RequestResponseOperation_7_0 = null;

        EObject lv_intefaces_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2765:6: ( ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2766:1: ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2766:1: ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2766:3: 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY
            {
            match(input,43,FOLLOW_43_in_ruleOutputPortStatement4460); 

                    createLeafNode(grammarAccess.getOutputPortStatementAccess().getOutputPortKeyword_0(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2770:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2771:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2771:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2772:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputPortStatement4477); 

            			createLeafNode(grammarAccess.getOutputPortStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOutputPortStatementRule().getType().getClassifier());
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

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleOutputPortStatement4491); 
             
                createLeafNode(grammarAccess.getOutputPortStatementAccess().getLCURLYTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2798:1: ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2800:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2800:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2801:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2804:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2805:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2805:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )*
            loop31:
            do {
                int alt31=6;
                int LA31_0 = input.LA(1);

                if ( LA31_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
                    alt31=3;
                }
                else if ( LA31_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
                    alt31=4;
                }
                else if ( LA31_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
                    alt31=5;
                }


                switch (alt31) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2807:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2807:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2808:5: {...}? => ( ( (lv_location_4_0= ruleLocation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2808:116: ( ( (lv_location_4_0= ruleLocation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2809:6: ( (lv_location_4_0= ruleLocation ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2812:6: ( (lv_location_4_0= ruleLocation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2813:1: (lv_location_4_0= ruleLocation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2813:1: (lv_location_4_0= ruleLocation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2814:3: lv_location_4_0= ruleLocation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getLocationLocationParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocation_in_ruleOutputPortStatement4553);
            	    lv_location_4_0=ruleLocation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOutputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"location",
            	    	        		lv_location_4_0, 
            	    	        		"Location", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2843:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2843:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2844:5: {...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2844:116: ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2845:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2848:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2849:1: (lv_protocol_5_0= ruleProtocol )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2849:1: (lv_protocol_5_0= ruleProtocol )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2850:3: lv_protocol_5_0= ruleProtocol
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getProtocolProtocolParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtocol_in_ruleOutputPortStatement4624);
            	    lv_protocol_5_0=ruleProtocol();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOutputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"protocol",
            	    	        		lv_protocol_5_0, 
            	    	        		"Protocol", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2879:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2879:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2880:5: {...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2880:116: ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2881:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2884:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2885:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2885:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2886:3: lv_oneWayOperation_6_0= ruleOneWayOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getOneWayOperationOneWayOperationParserRuleCall_3_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOneWayOperation_in_ruleOutputPortStatement4695);
            	    lv_oneWayOperation_6_0=ruleOneWayOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOutputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"oneWayOperation",
            	    	        		lv_oneWayOperation_6_0, 
            	    	        		"OneWayOperation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2915:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2915:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2916:5: {...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2916:116: ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2917:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2920:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2921:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2921:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2922:3: lv_RequestResponseOperation_7_0= ruleRequestResponseOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleOutputPortStatement4766);
            	    lv_RequestResponseOperation_7_0=ruleRequestResponseOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOutputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"RequestResponseOperation",
            	    	        		lv_RequestResponseOperation_7_0, 
            	    	        		"RequestResponseOperation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2951:4: ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2951:4: ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2952:5: {...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2952:116: ( ( (lv_intefaces_8_0= ruleInterfaces ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2953:6: ( (lv_intefaces_8_0= ruleInterfaces ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2956:6: ( (lv_intefaces_8_0= ruleInterfaces ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2957:1: (lv_intefaces_8_0= ruleInterfaces )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2957:1: (lv_intefaces_8_0= ruleInterfaces )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2958:3: lv_intefaces_8_0= ruleInterfaces
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getIntefacesInterfacesParserRuleCall_3_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaces_in_ruleOutputPortStatement4837);
            	    lv_intefaces_8_0=ruleInterfaces();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOutputPortStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"intefaces",
            	    	        		lv_intefaces_8_0, 
            	    	        		"Interfaces", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            	

            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleOutputPortStatement4885); 
             
                createLeafNode(grammarAccess.getOutputPortStatementAccess().getRCURLYTerminalRuleCall_4(), null); 
                

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
    // $ANTLR end ruleOutputPortStatement


    // $ANTLR start entryRuleOneWayOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3006:1: entryRuleOneWayOperation returns [EObject current=null] : iv_ruleOneWayOperation= ruleOneWayOperation EOF ;
    public final EObject entryRuleOneWayOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneWayOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3007:2: (iv_ruleOneWayOperation= ruleOneWayOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3008:2: iv_ruleOneWayOperation= ruleOneWayOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOneWayOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation4920);
            iv_ruleOneWayOperation=ruleOneWayOperation();
            _fsp--;

             current =iv_ruleOneWayOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayOperation4930); 

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
    // $ANTLR end entryRuleOneWayOperation


    // $ANTLR start ruleOneWayOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3015:1: ruleOneWayOperation returns [EObject current=null] : ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* ) ;
    public final EObject ruleOneWayOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_children_8_0=null;
        EObject lv_typeDefinition_5_0 = null;

        EObject lv_typeDefinition_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3020:6: ( ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3021:1: ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3021:1: ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3021:2: () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3021:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3022:5: 
            {
             
                    temp=factory.create(grammarAccess.getOneWayOperationAccess().getOneWayOperationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getOneWayOperationAccess().getOneWayOperationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,44,FOLLOW_44_in_ruleOneWayOperation4974); 

                    createLeafNode(grammarAccess.getOneWayOperationAccess().getOneWayKeyword_1(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOneWayOperation4983); 
             
                createLeafNode(grammarAccess.getOneWayOperationAccess().getCOLONTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3040:1: ( (lv_name_3_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3041:1: (lv_name_3_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3041:1: (lv_name_3_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3042:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneWayOperation4999); 

            			createLeafNode(grammarAccess.getOneWayOperationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3064:2: ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LPAREN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3064:3: RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOneWayOperation5014); 
                     
                        createLeafNode(grammarAccess.getOneWayOperationAccess().getLPARENTerminalRuleCall_4_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3068:1: ( (lv_typeDefinition_5_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3069:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3069:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3070:3: lv_typeDefinition_5_0= ruleTypeDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOneWayOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation5034);
                    lv_typeDefinition_5_0=ruleTypeDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"typeDefinition",
                    	        		lv_typeDefinition_5_0, 
                    	        		"TypeDefinition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOneWayOperation5043); 
                     
                        createLeafNode(grammarAccess.getOneWayOperationAccess().getRPARENTerminalRuleCall_4_2(), null); 
                        

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3096:3: ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3096:4: RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )?
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOneWayOperation5054); 
            	     
            	        createLeafNode(grammarAccess.getOneWayOperationAccess().getCOMMATerminalRuleCall_5_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3100:1: ( (lv_children_8_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3101:1: (lv_children_8_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3101:1: (lv_children_8_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3102:3: lv_children_8_0= RULE_ID
            	    {
            	    lv_children_8_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneWayOperation5070); 

            	    			createLeafNode(grammarAccess.getOneWayOperationAccess().getChildrenIDTerminalRuleCall_5_1_0(), "children"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"children",
            	    	        		lv_children_8_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3124:2: ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_LPAREN) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3124:3: RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOneWayOperation5085); 
            	             
            	                createLeafNode(grammarAccess.getOneWayOperationAccess().getLPARENTerminalRuleCall_5_2_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3128:1: ( (lv_typeDefinition_10_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3129:1: (lv_typeDefinition_10_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3129:1: (lv_typeDefinition_10_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3130:3: lv_typeDefinition_10_0= ruleTypeDefinition
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getOneWayOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_5_2_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation5105);
            	            lv_typeDefinition_10_0=ruleTypeDefinition();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"typeDefinition",
            	            	        		lv_typeDefinition_10_0, 
            	            	        		"TypeDefinition", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOneWayOperation5114); 
            	             
            	                createLeafNode(grammarAccess.getOneWayOperationAccess().getRPARENTerminalRuleCall_5_2_2(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end ruleOneWayOperation


    // $ANTLR start entryRuleRequestResponseOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3164:1: entryRuleRequestResponseOperation returns [EObject current=null] : iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF ;
    public final EObject entryRuleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestResponseOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3165:2: (iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3166:2: iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequestResponseOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation5153);
            iv_ruleRequestResponseOperation=ruleRequestResponseOperation();
            _fsp--;

             current =iv_ruleRequestResponseOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation5163); 

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3173:1: ruleRequestResponseOperation returns [EObject current=null] : ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* ) ;
    public final EObject ruleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_name_11_0=null;
        Token lv_name_16_0=null;
        Token lv_name_24_0=null;
        EObject lv_typeDefinition_5_0 = null;

        EObject lv_typeDefinition_8_0 = null;

        EObject lv_typeDefinition_13_0 = null;

        EObject lv_typeDefinition_18_0 = null;

        EObject lv_typeDefinition_21_0 = null;

        EObject lv_typeDefinition_26_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3178:6: ( ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3179:1: ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3179:1: ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3179:2: () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3179:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3180:5: 
            {
             
                    temp=factory.create(grammarAccess.getRequestResponseOperationAccess().getRequestResponseOperationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getRequestResponseOperationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,45,FOLLOW_45_in_ruleRequestResponseOperation5207); 

                    createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRequestResponseKeyword_1(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleRequestResponseOperation5216); 
             
                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getCOLONTerminalRuleCall_2(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3198:1: ( (lv_name_3_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3199:1: (lv_name_3_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3199:1: (lv_name_3_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3200:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation5232); 

            			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3222:2: ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LPAREN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3222:3: ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3222:3: ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3222:4: RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5248); 
                     
                        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_4_0_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3226:1: ( (lv_typeDefinition_5_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3227:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3227:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3228:3: lv_typeDefinition_5_0= ruleTypeDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_4_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5268);
                    lv_typeDefinition_5_0=ruleTypeDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"typeDefinition",
                    	        		lv_typeDefinition_5_0, 
                    	        		"TypeDefinition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5277); 
                     
                        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_4_0_2(), null); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3254:2: ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3254:3: RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5287); 
                     
                        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_4_1_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3258:1: ( (lv_typeDefinition_8_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3259:1: (lv_typeDefinition_8_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3259:1: (lv_typeDefinition_8_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3260:3: lv_typeDefinition_8_0= ruleTypeDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_4_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5307);
                    lv_typeDefinition_8_0=ruleTypeDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"typeDefinition",
                    	        		lv_typeDefinition_8_0, 
                    	        		"TypeDefinition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5316); 
                     
                        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_4_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3286:4: ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3286:6: 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    {
                    match(input,46,FOLLOW_46_in_ruleRequestResponseOperation5329); 

                            createLeafNode(grammarAccess.getRequestResponseOperationAccess().getThrowsKeyword_5_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3290:1: ( (lv_name_11_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3291:1: (lv_name_11_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3291:1: (lv_name_11_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3292:3: lv_name_11_0= RULE_ID
                    {
                    lv_name_11_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation5346); 

                    			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_5_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_11_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3314:2: ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3314:3: RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5361); 
                     
                        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_5_2_0(), null); 
                        
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3318:1: ( (lv_typeDefinition_13_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3319:1: (lv_typeDefinition_13_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3319:1: (lv_typeDefinition_13_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3320:3: lv_typeDefinition_13_0= ruleTypeDefinition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_5_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5381);
                    lv_typeDefinition_13_0=ruleTypeDefinition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"typeDefinition",
                    	        		lv_typeDefinition_13_0, 
                    	        		"TypeDefinition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5390); 
                     
                        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_5_2_2(), null); 
                        

                    }


                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3346:4: ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3346:5: RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRequestResponseOperation5402); 
            	     
            	        createLeafNode(grammarAccess.getRequestResponseOperationAccess().getCOMMATerminalRuleCall_6_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3350:1: ( (lv_name_16_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3351:1: (lv_name_16_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3351:1: (lv_name_16_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3352:3: lv_name_16_0= RULE_ID
            	    {
            	    lv_name_16_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation5418); 

            	    			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_6_1_0(), "name"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_16_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3374:2: ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==RULE_LPAREN) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3374:3: ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3374:3: ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3374:4: RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5434); 
            	             
            	                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_6_2_0_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3378:1: ( (lv_typeDefinition_18_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3379:1: (lv_typeDefinition_18_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3379:1: (lv_typeDefinition_18_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3380:3: lv_typeDefinition_18_0= ruleTypeDefinition
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_6_2_0_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5454);
            	            lv_typeDefinition_18_0=ruleTypeDefinition();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"typeDefinition",
            	            	        		lv_typeDefinition_18_0, 
            	            	        		"TypeDefinition", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5463); 
            	             
            	                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_6_2_0_2(), null); 
            	                

            	            }

            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3406:2: ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3406:3: RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5473); 
            	             
            	                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_6_2_1_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3410:1: ( (lv_typeDefinition_21_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3411:1: (lv_typeDefinition_21_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3411:1: (lv_typeDefinition_21_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3412:3: lv_typeDefinition_21_0= ruleTypeDefinition
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_6_2_1_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5493);
            	            lv_typeDefinition_21_0=ruleTypeDefinition();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"typeDefinition",
            	            	        		lv_typeDefinition_21_0, 
            	            	        		"TypeDefinition", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5502); 
            	             
            	                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_6_2_1_2(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3438:4: ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==46) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3438:6: 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            {
            	            match(input,46,FOLLOW_46_in_ruleRequestResponseOperation5515); 

            	                    createLeafNode(grammarAccess.getRequestResponseOperationAccess().getThrowsKeyword_6_3_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3442:1: ( (lv_name_24_0= RULE_ID ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3443:1: (lv_name_24_0= RULE_ID )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3443:1: (lv_name_24_0= RULE_ID )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3444:3: lv_name_24_0= RULE_ID
            	            {
            	            lv_name_24_0=(Token)input.LT(1);
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation5532); 

            	            			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_6_3_1_0(), "name"); 
            	            		

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"name",
            	            	        		lv_name_24_0, 
            	            	        		"ID", 
            	            	        		lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }

            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3466:2: ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3466:3: RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5547); 
            	             
            	                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_6_3_2_0(), null); 
            	                
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3470:1: ( (lv_typeDefinition_26_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3471:1: (lv_typeDefinition_26_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3471:1: (lv_typeDefinition_26_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3472:3: lv_typeDefinition_26_0= ruleTypeDefinition
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_6_3_2_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5567);
            	            lv_typeDefinition_26_0=ruleTypeDefinition();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getRequestResponseOperationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"typeDefinition",
            	            	        		lv_typeDefinition_26_0, 
            	            	        		"TypeDefinition", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5576); 
            	             
            	                createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_6_3_2_2(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end ruleRequestResponseOperation


    // $ANTLR start entryRuleTypeDefinition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3506:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3507:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3508:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition5616);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition5626); 

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
    // $ANTLR end entryRuleTypeDefinition


    // $ANTLR start ruleTypeDefinition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3515:1: ruleTypeDefinition returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3520:6: ( ( ( RULE_ID ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3521:1: ( ( RULE_ID ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3521:1: ( ( RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3522:1: ( RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3522:1: ( RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3523:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDefinition5668); 

            		createLeafNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeCrossReference_0(), "type"); 
            	

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
    // $ANTLR end ruleTypeDefinition


    // $ANTLR start entryRuleLocation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3543:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3544:2: (iv_ruleLocation= ruleLocation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3545:2: iv_ruleLocation= ruleLocation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocationRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation5703);
            iv_ruleLocation=ruleLocation();
            _fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation5713); 

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
    // $ANTLR end entryRuleLocation


    // $ANTLR start ruleLocation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3552:1: ruleLocation returns [EObject current=null] : ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        EObject lv_uri_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3557:6: ( ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3558:1: ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3558:1: ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3558:3: 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) )
            {
            match(input,47,FOLLOW_47_in_ruleLocation5748); 

                    createLeafNode(grammarAccess.getLocationAccess().getLocationKeyword_0(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleLocation5757); 
             
                createLeafNode(grammarAccess.getLocationAccess().getCOLONTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3566:1: ( (lv_uri_2_0= ruleUri ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3567:1: (lv_uri_2_0= ruleUri )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3567:1: (lv_uri_2_0= ruleUri )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3568:3: lv_uri_2_0= ruleUri
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocationAccess().getUriUriParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUri_in_ruleLocation5777);
            lv_uri_2_0=ruleUri();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"uri",
            	        		lv_uri_2_0, 
            	        		"Uri", 
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
    // $ANTLR end ruleLocation


    // $ANTLR start entryRuleUri
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3598:1: entryRuleUri returns [EObject current=null] : iv_ruleUri= ruleUri EOF ;
    public final EObject entryRuleUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUri = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3599:2: (iv_ruleUri= ruleUri EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3600:2: iv_ruleUri= ruleUri EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUriRule(), currentNode); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri5813);
            iv_ruleUri=ruleUri();
            _fsp--;

             current =iv_ruleUri; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri5823); 

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
    // $ANTLR end entryRuleUri


    // $ANTLR start ruleUri
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3607:1: ruleUri returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | RULE_STRING ) ;
    public final EObject ruleUri() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3612:6: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | RULE_STRING ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3613:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | RULE_STRING )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3613:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | RULE_STRING )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_STRING) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3613:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | RULE_STRING )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3613:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3613:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3613:3: () ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3613:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3614:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getUriAccess().getUriAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getUriAccess().getUriAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3624:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3625:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3625:1: (lv_name_1_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3626:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUri5875); 

                    			createLeafNode(grammarAccess.getUriAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUriRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
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


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3649:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUri5896); 
                     
                        createLeafNode(grammarAccess.getUriAccess().getSTRINGTerminalRuleCall_1(), null); 
                        

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
    // $ANTLR end ruleUri


    // $ANTLR start entryRuleInterfaces
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3661:1: entryRuleInterfaces returns [EObject current=null] : iv_ruleInterfaces= ruleInterfaces EOF ;
    public final EObject entryRuleInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaces = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3662:2: (iv_ruleInterfaces= ruleInterfaces EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3663:2: iv_ruleInterfaces= ruleInterfaces EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfacesRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaces_in_entryRuleInterfaces5931);
            iv_ruleInterfaces=ruleInterfaces();
            _fsp--;

             current =iv_ruleInterfaces; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaces5941); 

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
    // $ANTLR end entryRuleInterfaces


    // $ANTLR start ruleInterfaces
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3670:1: ruleInterfaces returns [EObject current=null] : ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInterfaces() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_name_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3675:6: ( ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3676:1: ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3676:1: ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3676:3: 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            {
            match(input,48,FOLLOW_48_in_ruleInterfaces5976); 

                    createLeafNode(grammarAccess.getInterfacesAccess().getInterfacesKeyword_0(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleInterfaces5985); 
             
                createLeafNode(grammarAccess.getInterfacesAccess().getCOLONTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3684:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3685:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3685:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3686:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaces6001); 

            			createLeafNode(grammarAccess.getInterfacesAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInterfacesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3708:2: ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3708:3: RULE_COMMA ( (lv_name_4_0= RULE_ID ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterfaces6016); 
            	     
            	        createLeafNode(grammarAccess.getInterfacesAccess().getCOMMATerminalRuleCall_3_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3712:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3713:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3713:1: (lv_name_4_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3714:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaces6032); 

            	    			createLeafNode(grammarAccess.getInterfacesAccess().getNameIDTerminalRuleCall_3_1_0(), "name"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInterfacesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_4_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end ruleInterfaces


    // $ANTLR start entryRuleProtocol
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3744:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3745:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3746:2: iv_ruleProtocol= ruleProtocol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProtocolRule(), currentNode); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol6075);
            iv_ruleProtocol=ruleProtocol();
            _fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol6085); 

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
    // $ANTLR end entryRuleProtocol


    // $ANTLR start ruleProtocol
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3753:1: ruleProtocol returns [EObject current=null] : ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3758:6: ( ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3759:1: ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3759:1: ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3759:3: 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )?
            {
            match(input,49,FOLLOW_49_in_ruleProtocol6120); 

                    createLeafNode(grammarAccess.getProtocolAccess().getProtocolKeyword_0(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleProtocol6129); 
             
                createLeafNode(grammarAccess.getProtocolAccess().getCOLONTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3767:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3768:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3768:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3769:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProtocol6145); 

            			createLeafNode(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3791:2: ( ruleProtocolConfiguration )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_LCURLY) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3792:5: ruleProtocolConfiguration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getProtocolConfigurationParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProtocolConfiguration_in_ruleProtocol6167);
                    ruleProtocolConfiguration();
                    _fsp--;

                     
                            currentNode = currentNode.getParent();
                        

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
    // $ANTLR end ruleProtocol


    // $ANTLR start entryRuleProtocolConfiguration
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3807:1: entryRuleProtocolConfiguration returns [String current=null] : iv_ruleProtocolConfiguration= ruleProtocolConfiguration EOF ;
    public final String entryRuleProtocolConfiguration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtocolConfiguration = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3808:2: (iv_ruleProtocolConfiguration= ruleProtocolConfiguration EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3809:2: iv_ruleProtocolConfiguration= ruleProtocolConfiguration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProtocolConfigurationRule(), currentNode); 
            pushFollow(FOLLOW_ruleProtocolConfiguration_in_entryRuleProtocolConfiguration6205);
            iv_ruleProtocolConfiguration=ruleProtocolConfiguration();
            _fsp--;

             current =iv_ruleProtocolConfiguration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolConfiguration6216); 

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
    // $ANTLR end entryRuleProtocolConfiguration


    // $ANTLR start ruleProtocolConfiguration
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3816:1: ruleProtocolConfiguration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY ) ;
    public final AntlrDatatypeRuleToken ruleProtocolConfiguration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LCURLY_0=null;
        Token kw=null;
        Token this_RCURLY_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3821:6: ( (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3822:1: (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3822:1: (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3822:6: this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY
            {
            this_LCURLY_0=(Token)input.LT(1);
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProtocolConfiguration6256); 

            		current.merge(this_LCURLY_0);
                
             
                createLeafNode(grammarAccess.getProtocolConfigurationAccess().getLCURLYTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,50,FOLLOW_50_in_ruleProtocolConfiguration6274); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getProtocolConfigurationAccess().getTODOKeyword_1(), null); 
                
            this_RCURLY_2=(Token)input.LT(1);
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProtocolConfiguration6289); 

            		current.merge(this_RCURLY_2);
                
             
                createLeafNode(grammarAccess.getProtocolConfigurationAccess().getRCURLYTerminalRuleCall_2(), null); 
                

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
    // $ANTLR end ruleProtocolConfiguration


    // $ANTLR start entryRuleRedirects
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3850:1: entryRuleRedirects returns [EObject current=null] : iv_ruleRedirects= ruleRedirects EOF ;
    public final EObject entryRuleRedirects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirects = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3851:2: (iv_ruleRedirects= ruleRedirects EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3852:2: iv_ruleRedirects= ruleRedirects EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRedirectsRule(), currentNode); 
            pushFollow(FOLLOW_ruleRedirects_in_entryRuleRedirects6334);
            iv_ruleRedirects=ruleRedirects();
            _fsp--;

             current =iv_ruleRedirects; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRedirects6344); 

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
    // $ANTLR end entryRuleRedirects


    // $ANTLR start ruleRedirects
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3859:1: ruleRedirects returns [EObject current=null] : ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRedirects() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_outputPortIdentifier_4_0=null;
        Token lv_name_6_0=null;
        Token lv_outputPortIdentifier_8_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3864:6: ( ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3865:1: ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3865:1: ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3865:3: 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )*
            {
            match(input,51,FOLLOW_51_in_ruleRedirects6379); 

                    createLeafNode(grammarAccess.getRedirectsAccess().getRedirectsKeyword_0(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleRedirects6388); 
             
                createLeafNode(grammarAccess.getRedirectsAccess().getCOLONTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3873:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3874:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3874:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3875:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects6404); 

            			createLeafNode(grammarAccess.getRedirectsAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRedirectsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,52,FOLLOW_52_in_ruleRedirects6419); 

                    createLeafNode(grammarAccess.getRedirectsAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3901:1: ( (lv_outputPortIdentifier_4_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3902:1: (lv_outputPortIdentifier_4_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3902:1: (lv_outputPortIdentifier_4_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3903:3: lv_outputPortIdentifier_4_0= RULE_ID
            {
            lv_outputPortIdentifier_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects6436); 

            			createLeafNode(grammarAccess.getRedirectsAccess().getOutputPortIdentifierIDTerminalRuleCall_4_0(), "outputPortIdentifier"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRedirectsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"outputPortIdentifier",
            	        		lv_outputPortIdentifier_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3925:2: ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3925:3: RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRedirects6451); 
            	     
            	        createLeafNode(grammarAccess.getRedirectsAccess().getCOMMATerminalRuleCall_5_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3929:1: ( (lv_name_6_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3930:1: (lv_name_6_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3930:1: (lv_name_6_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3931:3: lv_name_6_0= RULE_ID
            	    {
            	    lv_name_6_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects6467); 

            	    			createLeafNode(grammarAccess.getRedirectsAccess().getNameIDTerminalRuleCall_5_1_0(), "name"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRedirectsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_6_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    match(input,52,FOLLOW_52_in_ruleRedirects6482); 

            	            createLeafNode(grammarAccess.getRedirectsAccess().getEqualsSignGreaterThanSignKeyword_5_2(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3957:1: ( (lv_outputPortIdentifier_8_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3958:1: (lv_outputPortIdentifier_8_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3958:1: (lv_outputPortIdentifier_8_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3959:3: lv_outputPortIdentifier_8_0= RULE_ID
            	    {
            	    lv_outputPortIdentifier_8_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects6499); 

            	    			createLeafNode(grammarAccess.getRedirectsAccess().getOutputPortIdentifierIDTerminalRuleCall_5_3_0(), "outputPortIdentifier"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRedirectsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"outputPortIdentifier",
            	    	        		lv_outputPortIdentifier_8_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end ruleRedirects


    // $ANTLR start entryRuleAggregates
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3989:1: entryRuleAggregates returns [EObject current=null] : iv_ruleAggregates= ruleAggregates EOF ;
    public final EObject entryRuleAggregates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregates = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3990:2: (iv_ruleAggregates= ruleAggregates EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3991:2: iv_ruleAggregates= ruleAggregates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAggregatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleAggregates_in_entryRuleAggregates6542);
            iv_ruleAggregates=ruleAggregates();
            _fsp--;

             current =iv_ruleAggregates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregates6552); 

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
    // $ANTLR end entryRuleAggregates


    // $ANTLR start ruleAggregates
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3998:1: ruleAggregates returns [EObject current=null] : ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAggregates() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_name_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4003:6: ( ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4004:1: ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4004:1: ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4004:3: 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            {
            match(input,53,FOLLOW_53_in_ruleAggregates6587); 

                    createLeafNode(grammarAccess.getAggregatesAccess().getAggregatesKeyword_0(), null); 
                
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleAggregates6596); 
             
                createLeafNode(grammarAccess.getAggregatesAccess().getCOLONTerminalRuleCall_1(), null); 
                
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4012:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4013:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4013:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4014:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregates6612); 

            			createLeafNode(grammarAccess.getAggregatesAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAggregatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4036:2: ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4036:3: RULE_COMMA ( (lv_name_4_0= RULE_ID ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleAggregates6627); 
            	     
            	        createLeafNode(grammarAccess.getAggregatesAccess().getCOMMATerminalRuleCall_3_0(), null); 
            	        
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4040:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4041:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4041:1: (lv_name_4_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4042:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregates6643); 

            	    			createLeafNode(grammarAccess.getAggregatesAccess().getNameIDTerminalRuleCall_3_1_0(), "name"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAggregatesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_4_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end ruleAggregates


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_ruleProgram131 = new BitSet(new long[]{0x00000C6000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleProgram153 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleCardinality263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleCardinality289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType396 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleType410 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATIVE_TYPE_in_ruleType418 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleTYPEDEF_in_ruleType438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPEDEF_in_entryRuleTYPEDEF475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPEDEF485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleTYPEDEF528 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_RULE_ID_PRE_in_ruleTYPEDEF545 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleTYPEDEF566 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleTYPEDEF574 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATIVE_TYPE_in_ruleTYPEDEF582 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleTYPEDEF_in_ruleTYPEDEF602 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleTYPEDEF614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMain694 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleMain715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_entryRuleMainProcess751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainProcess761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleMainProcess804 = new BitSet(new long[]{0x0000018008061640L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleMainProcess824 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleMainProcess833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProcess922 = new BitSet(new long[]{0x0000018008061640L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess942 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProcess951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProcess967 = new BitSet(new long[]{0x0000018008061640L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess987 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProcess996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelStatement1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement1098 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_VERT_in_ruleParallelStatement1108 = new BitSet(new long[]{0x0000018008061640L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement1128 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceStatement1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement1233 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement1243 = new BitSet(new long[]{0x0000018008061640L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement1263 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStatement1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleBasicStatement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_ruleBasicStatement1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementDecrement_in_ruleBasicStatement1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWith_in_ruleBasicStatement1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation1611 = new BitSet(new long[]{0x00000000001F1000L});
    public static final BitSet FOLLOW_ruleRightSide_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSide_in_entryRuleRightSide1668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSide1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleRightSide1722 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRightSide1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_ruleRightSide1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleRightSide1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTSTO_in_ruleRightSide1818 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleRightSide1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEEPCOPYLEFT_in_ruleRightSide1864 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleRightSide1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRightSide1901 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleRightSide1921 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRightSide1930 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleRightSide1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOperation2041 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOperation2061 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOperation2070 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleOperation2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementDecrement_in_entryRulePreIncrementDecrement2128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreIncrementDecrement2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rulePreIncrementDecrement2173 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rulePreIncrementDecrement2187 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rulePreIncrementDecrement2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression2301 = new BitSet(new long[]{0x0000000000E00022L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExpression2329 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExpression2349 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleExpression2369 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleExpression2389 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleTerminalExpression2501 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleTerminalExpression2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTerminalExpression2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_ruleTerminalExpression2664 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression2678 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleTerminalExpression2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleTerminalExpression2728 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_ruleTerminalExpression2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath2790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_PRE_in_ruleVariablePath2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath2882 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath2897 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath2917 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath2926 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath2938 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath2947 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_39_in_ruleVariablePath2962 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath2973 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath2993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath3002 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath3020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleVariablePath3028 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath3048 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleVariablePath3057 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_39_in_ruleVariablePath3086 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath3097 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath3106 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_39_in_ruleVariablePath3121 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath3132 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath3152 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath3161 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath3179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleVariablePath3187 = new BitSet(new long[]{0x0000008007061440L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath3207 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleVariablePath3216 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWith_in_entryRuleWith3255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWith3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleWith3309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleWith3318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWith3334 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleWith3348 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleWith3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement3404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDChoiceStatement3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement3458 = new BitSet(new long[]{0x0000028000000440L});
    public static final BitSet FOLLOW_41_in_ruleNDChoiceStatement3469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement3478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNDChoiceStatement3486 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement3494 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement3522 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement3531 = new BitSet(new long[]{0x0000008000000440L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement3551 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement3560 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleNDChoiceStatement3580 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement3591 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement3611 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort3649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPortStatement_in_rulePort3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPortStatement_in_rulePort3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPortStatement_in_entryRuleInputPortStatement3768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputPortStatement3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInputPortStatement3813 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputPortStatement3830 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleInputPortStatement3844 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleInputPortStatement3906 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleInputPortStatement3977 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_ruleInputPortStatement4048 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleInputPortStatement4119 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleRedirects_in_ruleInputPortStatement4190 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleAggregates_in_ruleInputPortStatement4261 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_ruleInterfaces_in_ruleInputPortStatement4332 = new BitSet(new long[]{0x002BB00000000800L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleInputPortStatement4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPortStatement_in_entryRuleOutputPortStatement4415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputPortStatement4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOutputPortStatement4460 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputPortStatement4477 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleOutputPortStatement4491 = new BitSet(new long[]{0x0003B00000000800L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleOutputPortStatement4553 = new BitSet(new long[]{0x0003B00000000800L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleOutputPortStatement4624 = new BitSet(new long[]{0x0003B00000000800L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_ruleOutputPortStatement4695 = new BitSet(new long[]{0x0003B00000000800L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleOutputPortStatement4766 = new BitSet(new long[]{0x0003B00000000800L});
    public static final BitSet FOLLOW_ruleInterfaces_in_ruleOutputPortStatement4837 = new BitSet(new long[]{0x0003B00000000800L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleOutputPortStatement4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation4920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayOperation4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOneWayOperation4974 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOneWayOperation4983 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneWayOperation4999 = new BitSet(new long[]{0x0000000040001002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOneWayOperation5014 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation5034 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOneWayOperation5043 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOneWayOperation5054 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneWayOperation5070 = new BitSet(new long[]{0x0000000040001002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOneWayOperation5085 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation5105 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOneWayOperation5114 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation5153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRequestResponseOperation5207 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleRequestResponseOperation5216 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation5232 = new BitSet(new long[]{0x0000400040001002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5277 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5287 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5316 = new BitSet(new long[]{0x0000400040000002L});
    public static final BitSet FOLLOW_46_in_ruleRequestResponseOperation5329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation5346 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5361 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5381 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5390 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRequestResponseOperation5402 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation5418 = new BitSet(new long[]{0x0000400040001002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5434 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5454 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5463 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5473 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5502 = new BitSet(new long[]{0x0000400040000002L});
    public static final BitSet FOLLOW_46_in_ruleRequestResponseOperation5515 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation5532 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation5547 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation5567 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation5576 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition5616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDefinition5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation5703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLocation5748 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleLocation5757 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_ruleUri_in_ruleLocation5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri5813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUri5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUri5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaces_in_entryRuleInterfaces5931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaces5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInterfaces5976 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleInterfaces5985 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaces6001 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterfaces6016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaces6032 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleProtocol6120 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleProtocol6129 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProtocol6145 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleProtocolConfiguration_in_ruleProtocol6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolConfiguration_in_entryRuleProtocolConfiguration6205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolConfiguration6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProtocolConfiguration6256 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleProtocolConfiguration6274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProtocolConfiguration6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirects_in_entryRuleRedirects6334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRedirects6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleRedirects6379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleRedirects6388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects6404 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRedirects6419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects6436 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRedirects6451 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects6467 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRedirects6482 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects6499 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleAggregates_in_entryRuleAggregates6542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregates6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAggregates6587 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleAggregates6596 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregates6612 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleAggregates6627 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregates6643 = new BitSet(new long[]{0x0000000040000002L});

}
