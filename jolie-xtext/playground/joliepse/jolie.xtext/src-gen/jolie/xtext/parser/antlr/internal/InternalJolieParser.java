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
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import jolie.xtext.services.JolieGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJolieParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LCURLY", "RULE_CONCURRENT", "RULE_RCURLY", "RULE_STRING", "RULE_ID", "RULE_COLON", "RULE_DOT", "RULE_QUESTION", "RULE_ASTERISK", "RULE_LSQUARE", "RULE_INT", "RULE_COMMA", "RULE_RSQUARE", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_CHOICE", "RULE_DECREMENT", "RULE_POINTSTO", "RULE_DEEPCOPYLEFT", "RULE_AT", "RULE_NOT", "RULE_EQUAL", "RULE_LANGLE", "RULE_RANGLE", "RULE_MAJOR_OR_EQUAL", "RULE_MINOR_OR_EQUAL", "RULE_NOT_EQUAL", "RULE_PLUS", "RULE_MINUS", "RULE_DIVIDE", "RULE_REAL", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'execution'", "'include'", "'type'", "'any'", "'int'", "'raw'", "'string'", "'void'", "'real'", "'define'", "'init'", "'main'", "'linkIn'", "'nullProcess'", "'synchronized'", "'undef'", "'this'", "'=>'", "'for'", "'foreach'", "'global'", "'with'", "'interface'", "'inputPort'", "'outputPort'", "'OneWay'", "'RequestResponse'", "'throws'", "'Location'", "'Interfaces'", "'Protocol'", "'TODO'", "'Redirects'", "'Aggregates'"
    };
    public static final int RULE_PERCENT_SIGN=39;
    public static final int RULE_ID=8;
    public static final int RULE_SEMICOLON=20;
    public static final int RULE_LANGLE=29;
    public static final int RULE_PLUS=34;
    public static final int RULE_NOT_EQUAL=33;
    public static final int RULE_COMMA=15;
    public static final int RULE_EQUAL=28;
    public static final int RULE_DIVIDE=36;
    public static final int RULE_SL_COMMENT=41;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=16;
    public static final int RULE_NOT=27;
    public static final int RULE_ML_COMMENT=40;
    public static final int RULE_ASSIGN=21;
    public static final int RULE_CHOICE=22;
    public static final int RULE_CONCURRENT=5;
    public static final int RULE_MINUS=35;
    public static final int RULE_RANGLE=30;
    public static final int RULE_COLON=9;
    public static final int RULE_WHILE=38;
    public static final int RULE_STRING=7;
    public static final int RULE_DOT=10;
    public static final int RULE_LPAREN=17;
    public static final int RULE_POINTSTO=24;
    public static final int RULE_DECREMENT=23;
    public static final int RULE_INT=14;
    public static final int RULE_VERT=19;
    public static final int RULE_REAL=37;
    public static final int RULE_RPAREN=18;
    public static final int RULE_ASTERISK=12;
    public static final int RULE_LSQUARE=13;
    public static final int RULE_WS=42;
    public static final int RULE_DEEPCOPYLEFT=25;
    public static final int RULE_MINOR_OR_EQUAL=32;
    public static final int RULE_MAJOR_OR_EQUAL=31;
    public static final int RULE_RCURLY=6;
    public static final int RULE_AT=26;
    public static final int RULE_LCURLY=4;
    public static final int RULE_QUESTION=11;

        public InternalJolieParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[221+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:84:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:85:2: (iv_ruleProgram= ruleProgram EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:86:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram81);
            iv_ruleProgram=ruleProgram();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram91); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:93:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_include_0_0= ruleInclude ) ) | ( (lv_ports_1_0= rulePort ) ) | ( (lv_interface_2_0= ruleInterface ) ) | ( (lv_types_3_0= ruleType ) ) | ( (lv_init_4_0= ruleInit ) ) | ( (lv_execution_5_0= ruleExecution ) ) | ( (lv_define_6_0= ruleDefine ) ) )* ( (lv_main_7_0= ruleMain ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_include_0_0 = null;

        EObject lv_ports_1_0 = null;

        EObject lv_interface_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_init_4_0 = null;

        AntlrDatatypeRuleToken lv_execution_5_0 = null;

        EObject lv_define_6_0 = null;

        EObject lv_main_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:98:6: ( ( ( ( (lv_include_0_0= ruleInclude ) ) | ( (lv_ports_1_0= rulePort ) ) | ( (lv_interface_2_0= ruleInterface ) ) | ( (lv_types_3_0= ruleType ) ) | ( (lv_init_4_0= ruleInit ) ) | ( (lv_execution_5_0= ruleExecution ) ) | ( (lv_define_6_0= ruleDefine ) ) )* ( (lv_main_7_0= ruleMain ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:99:1: ( ( ( (lv_include_0_0= ruleInclude ) ) | ( (lv_ports_1_0= rulePort ) ) | ( (lv_interface_2_0= ruleInterface ) ) | ( (lv_types_3_0= ruleType ) ) | ( (lv_init_4_0= ruleInit ) ) | ( (lv_execution_5_0= ruleExecution ) ) | ( (lv_define_6_0= ruleDefine ) ) )* ( (lv_main_7_0= ruleMain ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:99:1: ( ( ( (lv_include_0_0= ruleInclude ) ) | ( (lv_ports_1_0= rulePort ) ) | ( (lv_interface_2_0= ruleInterface ) ) | ( (lv_types_3_0= ruleType ) ) | ( (lv_init_4_0= ruleInit ) ) | ( (lv_execution_5_0= ruleExecution ) ) | ( (lv_define_6_0= ruleDefine ) ) )* ( (lv_main_7_0= ruleMain ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:99:2: ( ( (lv_include_0_0= ruleInclude ) ) | ( (lv_ports_1_0= rulePort ) ) | ( (lv_interface_2_0= ruleInterface ) ) | ( (lv_types_3_0= ruleType ) ) | ( (lv_init_4_0= ruleInit ) ) | ( (lv_execution_5_0= ruleExecution ) ) | ( (lv_define_6_0= ruleDefine ) ) )* ( (lv_main_7_0= ruleMain ) )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:99:2: ( ( (lv_include_0_0= ruleInclude ) ) | ( (lv_ports_1_0= rulePort ) ) | ( (lv_interface_2_0= ruleInterface ) ) | ( (lv_types_3_0= ruleType ) ) | ( (lv_init_4_0= ruleInit ) ) | ( (lv_execution_5_0= ruleExecution ) ) | ( (lv_define_6_0= ruleDefine ) ) )*
            loop1:
            do {
                int alt1=8;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt1=1;
                    }
                    break;
                case 66:
                case 67:
                    {
                    alt1=2;
                    }
                    break;
                case 65:
                    {
                    alt1=3;
                    }
                    break;
                case 45:
                    {
                    alt1=4;
                    }
                    break;
                case 53:
                    {
                    alt1=5;
                    }
                    break;
                case 43:
                    {
                    alt1=6;
                    }
                    break;
                case 52:
                    {
                    alt1=7;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:99:3: ( (lv_include_0_0= ruleInclude ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:99:3: ( (lv_include_0_0= ruleInclude ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:100:1: (lv_include_0_0= ruleInclude )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:100:1: (lv_include_0_0= ruleInclude )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:101:3: lv_include_0_0= ruleInclude
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getIncludeIncludeParserRuleCall_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInclude_in_ruleProgram138);
            	    lv_include_0_0=ruleInclude();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"include",
            	      	        		lv_include_0_0, 
            	      	        		"Include", 
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:124:6: ( (lv_ports_1_0= rulePort ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:124:6: ( (lv_ports_1_0= rulePort ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:125:1: (lv_ports_1_0= rulePort )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:125:1: (lv_ports_1_0= rulePort )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:126:3: lv_ports_1_0= rulePort
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getPortsPortParserRuleCall_0_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePort_in_ruleProgram165);
            	    lv_ports_1_0=rulePort();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"ports",
            	      	        		lv_ports_1_0, 
            	      	        		"Port", 
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:149:6: ( (lv_interface_2_0= ruleInterface ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:149:6: ( (lv_interface_2_0= ruleInterface ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:150:1: (lv_interface_2_0= ruleInterface )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:150:1: (lv_interface_2_0= ruleInterface )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:151:3: lv_interface_2_0= ruleInterface
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getInterfaceInterfaceParserRuleCall_0_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterface_in_ruleProgram192);
            	    lv_interface_2_0=ruleInterface();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"interface",
            	      	        		lv_interface_2_0, 
            	      	        		"Interface", 
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:174:6: ( (lv_types_3_0= ruleType ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:174:6: ( (lv_types_3_0= ruleType ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:175:1: (lv_types_3_0= ruleType )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:175:1: (lv_types_3_0= ruleType )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:176:3: lv_types_3_0= ruleType
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getTypesTypeParserRuleCall_0_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleProgram219);
            	    lv_types_3_0=ruleType();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"types",
            	      	        		lv_types_3_0, 
            	      	        		"Type", 
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:199:6: ( (lv_init_4_0= ruleInit ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:199:6: ( (lv_init_4_0= ruleInit ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:200:1: (lv_init_4_0= ruleInit )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:200:1: (lv_init_4_0= ruleInit )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:201:3: lv_init_4_0= ruleInit
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getInitInitParserRuleCall_0_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInit_in_ruleProgram246);
            	    lv_init_4_0=ruleInit();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"init",
            	      	        		lv_init_4_0, 
            	      	        		"Init", 
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:224:6: ( (lv_execution_5_0= ruleExecution ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:224:6: ( (lv_execution_5_0= ruleExecution ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:225:1: (lv_execution_5_0= ruleExecution )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:225:1: (lv_execution_5_0= ruleExecution )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:226:3: lv_execution_5_0= ruleExecution
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getExecutionExecutionParserRuleCall_0_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExecution_in_ruleProgram273);
            	    lv_execution_5_0=ruleExecution();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"execution",
            	      	        		lv_execution_5_0, 
            	      	        		"Execution", 
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
            	case 7 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:249:6: ( (lv_define_6_0= ruleDefine ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:249:6: ( (lv_define_6_0= ruleDefine ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:250:1: (lv_define_6_0= ruleDefine )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:250:1: (lv_define_6_0= ruleDefine )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:251:3: lv_define_6_0= ruleDefine
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getDefineDefineParserRuleCall_0_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDefine_in_ruleProgram300);
            	    lv_define_6_0=ruleDefine();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"define",
            	      	        		lv_define_6_0, 
            	      	        		"Define", 
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

            	default :
            	    break loop1;
                }
            } while (true);

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:273:4: ( (lv_main_7_0= ruleMain ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==54) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:274:1: (lv_main_7_0= ruleMain )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:274:1: (lv_main_7_0= ruleMain )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:275:3: lv_main_7_0= ruleMain
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMain_in_ruleProgram323);
                    lv_main_7_0=ruleMain();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"main",
                      	        		lv_main_7_0, 
                      	        		"Main", 
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleExecution
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:305:1: entryRuleExecution returns [String current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final String entryRuleExecution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExecution = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:306:2: (iv_ruleExecution= ruleExecution EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:307:2: iv_ruleExecution= ruleExecution EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExecutionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExecution_in_entryRuleExecution361);
            iv_ruleExecution=ruleExecution();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExecution.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecution372); if (failed) return current;

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
    // $ANTLR end entryRuleExecution


    // $ANTLR start ruleExecution
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:314:1: ruleExecution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'execution' this_LCURLY_1= RULE_LCURLY this_CONCURRENT_2= RULE_CONCURRENT this_RCURLY_3= RULE_RCURLY ) ;
    public final AntlrDatatypeRuleToken ruleExecution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LCURLY_1=null;
        Token this_CONCURRENT_2=null;
        Token this_RCURLY_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:319:6: ( (kw= 'execution' this_LCURLY_1= RULE_LCURLY this_CONCURRENT_2= RULE_CONCURRENT this_RCURLY_3= RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:320:1: (kw= 'execution' this_LCURLY_1= RULE_LCURLY this_CONCURRENT_2= RULE_CONCURRENT this_RCURLY_3= RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:320:1: (kw= 'execution' this_LCURLY_1= RULE_LCURLY this_CONCURRENT_2= RULE_CONCURRENT this_RCURLY_3= RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:321:2: kw= 'execution' this_LCURLY_1= RULE_LCURLY this_CONCURRENT_2= RULE_CONCURRENT this_RCURLY_3= RULE_RCURLY
            {
            kw=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ruleExecution410); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getExecutionAccess().getExecutionKeyword_0(), null); 
                  
            }
            this_LCURLY_1=(Token)input.LT(1);
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleExecution425); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_LCURLY_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getExecutionAccess().getLCURLYTerminalRuleCall_1(), null); 
                  
            }
            this_CONCURRENT_2=(Token)input.LT(1);
            match(input,RULE_CONCURRENT,FOLLOW_RULE_CONCURRENT_in_ruleExecution445); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_CONCURRENT_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getExecutionAccess().getCONCURRENTTerminalRuleCall_2(), null); 
                  
            }
            this_RCURLY_3=(Token)input.LT(1);
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleExecution465); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_RCURLY_3);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getExecutionAccess().getRCURLYTerminalRuleCall_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExecution


    // $ANTLR start entryRuleInclude
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:355:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:356:2: (iv_ruleInclude= ruleInclude EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:357:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIncludeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude510);
            iv_ruleInclude=ruleInclude();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude520); if (failed) return current;

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
    // $ANTLR end entryRuleInclude


    // $ANTLR start ruleInclude
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:364:1: ruleInclude returns [EObject current=null] : ( 'include' ( (lv_path_1_0= RULE_STRING ) ) )+ ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_path_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:369:6: ( ( 'include' ( (lv_path_1_0= RULE_STRING ) ) )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:370:1: ( 'include' ( (lv_path_1_0= RULE_STRING ) ) )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:370:1: ( 'include' ( (lv_path_1_0= RULE_STRING ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==44) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:370:3: 'include' ( (lv_path_1_0= RULE_STRING ) )
            	    {
            	    match(input,44,FOLLOW_44_in_ruleInclude555); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getIncludeAccess().getIncludeKeyword_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:374:1: ( (lv_path_1_0= RULE_STRING ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:375:1: (lv_path_1_0= RULE_STRING )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:375:1: (lv_path_1_0= RULE_STRING )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:376:3: lv_path_1_0= RULE_STRING
            	    {
            	    lv_path_1_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude572); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getIncludeAccess().getPathSTRINGTerminalRuleCall_1_0(), "path"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getIncludeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"path",
            	      	        		lv_path_1_0, 
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

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInclude


    // $ANTLR start entryRuleType
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:406:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:407:2: (iv_ruleType= ruleType EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:408:2: iv_ruleType= ruleType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType614);
            iv_ruleType=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType624); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:415:1: ruleType returns [EObject current=null] : ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON ruleNative_type ( (lv_typedef_4_0= ruleTypedef ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typedef_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:420:6: ( ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON ruleNative_type ( (lv_typedef_4_0= ruleTypedef ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:421:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON ruleNative_type ( (lv_typedef_4_0= ruleTypedef ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:421:1: ( 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON ruleNative_type ( (lv_typedef_4_0= ruleTypedef ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:421:3: 'type' ( (lv_name_1_0= RULE_ID ) ) RULE_COLON ruleNative_type ( (lv_typedef_4_0= ruleTypedef ) )?
            {
            match(input,45,FOLLOW_45_in_ruleType659); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeAccess().getTypeKeyword_0(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:425:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:426:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:426:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:427:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType676); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleType690); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypeAccess().getCOLONTerminalRuleCall_2(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getTypeAccess().getNative_typeParserRuleCall_3(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNative_type_in_ruleType708);
            ruleNative_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:464:1: ( (lv_typedef_4_0= ruleTypedef ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LCURLY) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:465:1: (lv_typedef_4_0= ruleTypedef )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:465:1: (lv_typedef_4_0= ruleTypedef )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:466:3: lv_typedef_4_0= ruleTypedef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeAccess().getTypedefTypedefParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypedef_in_ruleType728);
                    lv_typedef_4_0=ruleTypedef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"typedef",
                      	        		lv_typedef_4_0, 
                      	        		"Typedef", 
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleTypedef
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:496:1: entryRuleTypedef returns [EObject current=null] : iv_ruleTypedef= ruleTypedef EOF ;
    public final EObject entryRuleTypedef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedef = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:497:2: (iv_ruleTypedef= ruleTypedef EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:498:2: iv_ruleTypedef= ruleTypedef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypedef_in_entryRuleTypedef765);
            iv_ruleTypedef=ruleTypedef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedef775); if (failed) return current;

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
    // $ANTLR end entryRuleTypedef


    // $ANTLR start ruleTypedef
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:505:1: ruleTypedef returns [EObject current=null] : ( () RULE_LCURLY ( (lv_subtypes_2_0= ruleSubtypes ) ) RULE_RCURLY ) ;
    public final EObject ruleTypedef() throws RecognitionException {
        EObject current = null;

        EObject lv_subtypes_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:510:6: ( ( () RULE_LCURLY ( (lv_subtypes_2_0= ruleSubtypes ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:511:1: ( () RULE_LCURLY ( (lv_subtypes_2_0= ruleSubtypes ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:511:1: ( () RULE_LCURLY ( (lv_subtypes_2_0= ruleSubtypes ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:511:2: () RULE_LCURLY ( (lv_subtypes_2_0= ruleSubtypes ) ) RULE_RCURLY
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:511:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:512:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTypedefAccess().getTypedefAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTypedefAccess().getTypedefAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleTypedef821); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypedefAccess().getLCURLYTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:529:1: ( (lv_subtypes_2_0= ruleSubtypes ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:530:1: (lv_subtypes_2_0= ruleSubtypes )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:530:1: (lv_subtypes_2_0= ruleSubtypes )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:531:3: lv_subtypes_2_0= ruleSubtypes
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedefAccess().getSubtypesSubtypesParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSubtypes_in_ruleTypedef841);
            lv_subtypes_2_0=ruleSubtypes();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypedefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subtypes",
              	        		lv_subtypes_2_0, 
              	        		"Subtypes", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleTypedef850); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypedefAccess().getRCURLYTerminalRuleCall_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypedef


    // $ANTLR start entryRuleSubtypes
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:565:1: entryRuleSubtypes returns [EObject current=null] : iv_ruleSubtypes= ruleSubtypes EOF ;
    public final EObject entryRuleSubtypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtypes = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:566:2: (iv_ruleSubtypes= ruleSubtypes EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:567:2: iv_ruleSubtypes= ruleSubtypes EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubtypesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubtypes_in_entryRuleSubtypes885);
            iv_ruleSubtypes=ruleSubtypes();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubtypes; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtypes895); if (failed) return current;

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
    // $ANTLR end entryRuleSubtypes


    // $ANTLR start ruleSubtypes
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:574:1: ruleSubtypes returns [EObject current=null] : ( ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* ) | ( () RULE_QUESTION ) ) ;
    public final EObject ruleSubtypes() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_native_type_sub_5_0 = null;

        EObject lv_typedef_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:579:6: ( ( ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* ) | ( () RULE_QUESTION ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:1: ( ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* ) | ( () RULE_QUESTION ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:1: ( ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* ) | ( () RULE_QUESTION ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==RULE_RCURLY||LA8_0==RULE_DOT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_QUESTION) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("580:1: ( ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* ) | ( () RULE_QUESTION ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:2: ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:2: ( () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )* )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:3: () ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )*
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:580:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:581:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getSubtypesAccess().getSubtypesAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getSubtypesAccess().getSubtypesAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:594:2: ( RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )* )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_DOT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:594:3: RULE_DOT ( (lv_name_2_0= RULE_ID ) ) ( ruleCardinality )? RULE_COLON ( (lv_native_type_sub_5_0= ruleNative_type_sub ) ) ( (lv_typedef_6_0= ruleTypedef ) )*
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleSubtypes943); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getSubtypesAccess().getDOTTerminalRuleCall_0_1_0(), null); 
                    	          
                    	    }
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:598:1: ( (lv_name_2_0= RULE_ID ) )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:1: (lv_name_2_0= RULE_ID )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:599:1: (lv_name_2_0= RULE_ID )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:600:3: lv_name_2_0= RULE_ID
                    	    {
                    	    lv_name_2_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubtypes959); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      			createLeafNode(grammarAccess.getSubtypesAccess().getNameIDTerminalRuleCall_0_1_1_0(), "name"); 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSubtypesRule().getType().getClassifier());
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


                    	    }

                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:622:2: ( ruleCardinality )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( ((LA5_0>=RULE_QUESTION && LA5_0<=RULE_LSQUARE)) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:623:2: ruleCardinality
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	  /* */ 
                    	              	
                    	            }
                    	            if ( backtracking==0 ) {
                    	               
                    	                      currentNode=createCompositeNode(grammarAccess.getSubtypesAccess().getCardinalityParserRuleCall_0_1_2(), currentNode); 
                    	                  
                    	            }
                    	            pushFollow(FOLLOW_ruleCardinality_in_ruleSubtypes984);
                    	            ruleCardinality();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                      currentNode = currentNode.getParent();
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSubtypes994); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getSubtypesAccess().getCOLONTerminalRuleCall_0_1_3(), null); 
                    	          
                    	    }
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:637:1: ( (lv_native_type_sub_5_0= ruleNative_type_sub ) )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:638:1: (lv_native_type_sub_5_0= ruleNative_type_sub )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:638:1: (lv_native_type_sub_5_0= ruleNative_type_sub )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:639:3: lv_native_type_sub_5_0= ruleNative_type_sub
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSubtypesAccess().getNative_type_subNative_type_subParserRuleCall_0_1_4_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNative_type_sub_in_ruleSubtypes1014);
                    	    lv_native_type_sub_5_0=ruleNative_type_sub();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSubtypesRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"native_type_sub",
                    	      	        		lv_native_type_sub_5_0, 
                    	      	        		"Native_type_sub", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:661:2: ( (lv_typedef_6_0= ruleTypedef ) )*
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        int LA6_0 = input.LA(1);

                    	        if ( (LA6_0==RULE_LCURLY) ) {
                    	            alt6=1;
                    	        }


                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:662:1: (lv_typedef_6_0= ruleTypedef )
                    	    	    {
                    	    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:662:1: (lv_typedef_6_0= ruleTypedef )
                    	    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:663:3: lv_typedef_6_0= ruleTypedef
                    	    	    {
                    	    	    if ( backtracking==0 ) {
                    	    	       
                    	    	      	        currentNode=createCompositeNode(grammarAccess.getSubtypesAccess().getTypedefTypedefParserRuleCall_0_1_5_0(), currentNode); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleTypedef_in_ruleSubtypes1035);
                    	    	    lv_typedef_6_0=ruleTypedef();
                    	    	    _fsp--;
                    	    	    if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = factory.create(grammarAccess.getSubtypesRule().getType().getClassifier());
                    	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	      	        }
                    	    	      	        try {
                    	    	      	       		add(
                    	    	      	       			current, 
                    	    	      	       			"typedef",
                    	    	      	        		lv_typedef_6_0, 
                    	    	      	        		"Typedef", 
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
                    	    	    break loop6;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:686:6: ( () RULE_QUESTION )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:686:6: ( () RULE_QUESTION )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:686:7: () RULE_QUESTION
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:686:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:687:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getSubtypesAccess().getSubtypesAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getSubtypesAccess().getSubtypesAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleSubtypes1067); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getSubtypesAccess().getQUESTIONTerminalRuleCall_1_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSubtypes


    // $ANTLR start entryRuleCardinality
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:712:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:713:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:714:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCardinalityRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1104);
            iv_ruleCardinality=ruleCardinality();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCardinality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1115); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:721:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK | (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE ) ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUESTION_0=null;
        Token this_ASTERISK_1=null;
        Token this_LSQUARE_2=null;
        Token this_INT_3=null;
        Token this_COMMA_4=null;
        Token this_INT_5=null;
        Token this_ASTERISK_6=null;
        Token this_RSQUARE_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:726:6: ( (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK | (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:727:1: (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK | (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:727:1: (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK | (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_QUESTION:
                {
                alt10=1;
                }
                break;
            case RULE_ASTERISK:
                {
                alt10=2;
                }
                break;
            case RULE_LSQUARE:
                {
                alt10=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("727:1: (this_QUESTION_0= RULE_QUESTION | this_ASTERISK_1= RULE_ASTERISK | (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:727:6: this_QUESTION_0= RULE_QUESTION
                    {
                    this_QUESTION_0=(Token)input.LT(1);
                    match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleCardinality1155); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_QUESTION_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getCardinalityAccess().getQUESTIONTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:735:10: this_ASTERISK_1= RULE_ASTERISK
                    {
                    this_ASTERISK_1=(Token)input.LT(1);
                    match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleCardinality1181); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ASTERISK_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getCardinalityAccess().getASTERISKTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:6: (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:6: (this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:743:11: this_LSQUARE_2= RULE_LSQUARE this_INT_3= RULE_INT this_COMMA_4= RULE_COMMA (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK ) this_RSQUARE_7= RULE_RSQUARE
                    {
                    this_LSQUARE_2=(Token)input.LT(1);
                    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleCardinality1208); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_LSQUARE_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getCardinalityAccess().getLSQUARETerminalRuleCall_2_0(), null); 
                          
                    }
                    this_INT_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinality1228); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_2_1(), null); 
                          
                    }
                    this_COMMA_4=(Token)input.LT(1);
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCardinality1248); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_COMMA_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getCardinalityAccess().getCOMMATerminalRuleCall_2_2(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:764:1: (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_ASTERISK) ) {
                        alt9=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("764:1: (this_INT_5= RULE_INT | this_ASTERISK_6= RULE_ASTERISK )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:764:6: this_INT_5= RULE_INT
                            {
                            this_INT_5=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinality1269); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_INT_5);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_2_3_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:772:10: this_ASTERISK_6= RULE_ASTERISK
                            {
                            this_ASTERISK_6=(Token)input.LT(1);
                            match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleCardinality1295); if (failed) return current;
                            if ( backtracking==0 ) {

                              		current.merge(this_ASTERISK_6);
                                  
                            }
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getCardinalityAccess().getASTERISKTerminalRuleCall_2_3_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    this_RSQUARE_7=(Token)input.LT(1);
                    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleCardinality1316); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_RSQUARE_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getCardinalityAccess().getRSQUARETerminalRuleCall_2_4(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCardinality


    // $ANTLR start entryRuleNative_type
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:794:1: entryRuleNative_type returns [String current=null] : iv_ruleNative_type= ruleNative_type EOF ;
    public final String entryRuleNative_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNative_type = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:795:2: (iv_ruleNative_type= ruleNative_type EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:796:2: iv_ruleNative_type= ruleNative_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNative_typeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNative_type_in_entryRuleNative_type1363);
            iv_ruleNative_type=ruleNative_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNative_type.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNative_type1374); if (failed) return current;

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
    // $ANTLR end entryRuleNative_type


    // $ANTLR start ruleNative_type
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:803:1: ruleNative_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'int' | kw= 'raw' | kw= 'string' | kw= 'void' )? ;
    public final AntlrDatatypeRuleToken ruleNative_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:808:6: ( (kw= 'any' | kw= 'int' | kw= 'raw' | kw= 'string' | kw= 'void' )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:809:1: (kw= 'any' | kw= 'int' | kw= 'raw' | kw= 'string' | kw= 'void' )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:809:1: (kw= 'any' | kw= 'int' | kw= 'raw' | kw= 'string' | kw= 'void' )?
            int alt11=6;
            switch ( input.LA(1) ) {
                case 46:
                    {
                    alt11=1;
                    }
                    break;
                case 47:
                    {
                    alt11=2;
                    }
                    break;
                case 48:
                    {
                    alt11=3;
                    }
                    break;
                case 49:
                    {
                    alt11=4;
                    }
                    break;
                case 50:
                    {
                    alt11=5;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:810:2: kw= 'any'
                    {
                    kw=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleNative_type1412); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNative_typeAccess().getAnyKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:817:2: kw= 'int'
                    {
                    kw=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleNative_type1431); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNative_typeAccess().getIntKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:824:2: kw= 'raw'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleNative_type1450); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNative_typeAccess().getRawKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:831:2: kw= 'string'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleNative_type1469); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNative_typeAccess().getStringKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:838:2: kw= 'void'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleNative_type1488); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNative_typeAccess().getVoidKeyword_4(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNative_type


    // $ANTLR start entryRuleNative_type_sub
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:851:1: entryRuleNative_type_sub returns [EObject current=null] : iv_ruleNative_type_sub= ruleNative_type_sub EOF ;
    public final EObject entryRuleNative_type_sub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNative_type_sub = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:852:2: (iv_ruleNative_type_sub= ruleNative_type_sub EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:853:2: iv_ruleNative_type_sub= ruleNative_type_sub EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNative_type_subRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNative_type_sub_in_entryRuleNative_type_sub1529);
            iv_ruleNative_type_sub=ruleNative_type_sub();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNative_type_sub; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNative_type_sub1539); if (failed) return current;

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
    // $ANTLR end entryRuleNative_type_sub


    // $ANTLR start ruleNative_type_sub
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:860:1: ruleNative_type_sub returns [EObject current=null] : ( () ( 'int' | 'real' | 'string' | 'void' | ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleNative_type_sub() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:865:6: ( ( () ( 'int' | 'real' | 'string' | 'void' | ( ( RULE_ID ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:866:1: ( () ( 'int' | 'real' | 'string' | 'void' | ( ( RULE_ID ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:866:1: ( () ( 'int' | 'real' | 'string' | 'void' | ( ( RULE_ID ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:866:2: () ( 'int' | 'real' | 'string' | 'void' | ( ( RULE_ID ) ) )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:866:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:867:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNative_type_subAccess().getNative_type_subAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNative_type_subAccess().getNative_type_subAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:880:2: ( 'int' | 'real' | 'string' | 'void' | ( ( RULE_ID ) ) )?
            int alt12=6;
            switch ( input.LA(1) ) {
                case 47:
                    {
                    alt12=1;
                    }
                    break;
                case 51:
                    {
                    alt12=2;
                    }
                    break;
                case 49:
                    {
                    alt12=3;
                    }
                    break;
                case 50:
                    {
                    alt12=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt12=5;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:880:4: 'int'
                    {
                    match(input,47,FOLLOW_47_in_ruleNative_type_sub1587); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNative_type_subAccess().getIntKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:885:7: 'real'
                    {
                    match(input,51,FOLLOW_51_in_ruleNative_type_sub1603); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNative_type_subAccess().getRealKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:890:7: 'string'
                    {
                    match(input,49,FOLLOW_49_in_ruleNative_type_sub1619); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNative_type_subAccess().getStringKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:895:7: 'void'
                    {
                    match(input,50,FOLLOW_50_in_ruleNative_type_sub1635); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNative_type_subAccess().getVoidKeyword_1_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:900:6: ( ( RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:900:6: ( ( RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:901:1: ( RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:901:1: ( RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:902:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getNative_type_subRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNative_type_sub1663); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getNative_type_subAccess().getTypeTypeCrossReference_1_4_0(), "type"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNative_type_sub


    // $ANTLR start entryRuleDefine
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:925:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:926:2: (iv_ruleDefine= ruleDefine EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:927:2: iv_ruleDefine= ruleDefine EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefineRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine1701);
            iv_ruleDefine=ruleDefine();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine1711); if (failed) return current;

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
    // $ANTLR end entryRuleDefine


    // $ANTLR start ruleDefine
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:934:1: ruleDefine returns [EObject current=null] : ( 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mainrocess_2_0= ruleMainProcess ) ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_mainrocess_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:939:6: ( ( 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mainrocess_2_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:940:1: ( 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mainrocess_2_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:940:1: ( 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mainrocess_2_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:940:3: 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_mainrocess_2_0= ruleMainProcess ) )
            {
            match(input,52,FOLLOW_52_in_ruleDefine1746); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDefineAccess().getDefineKeyword_0(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:944:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:945:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:945:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:946:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefine1763); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDefineRule().getType().getClassifier());
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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:968:2: ( (lv_mainrocess_2_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:969:1: (lv_mainrocess_2_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:969:1: (lv_mainrocess_2_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:970:3: lv_mainrocess_2_0= ruleMainProcess
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDefineAccess().getMainrocessMainProcessParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMainProcess_in_ruleDefine1789);
            lv_mainrocess_2_0=ruleMainProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDefineRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"mainrocess",
              	        		lv_mainrocess_2_0, 
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDefine


    // $ANTLR start entryRuleInit
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1000:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1001:2: (iv_ruleInit= ruleInit EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1002:2: iv_ruleInit= ruleInit EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInitRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit1825);
            iv_ruleInit=ruleInit();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit1835); if (failed) return current;

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
    // $ANTLR end entryRuleInit


    // $ANTLR start ruleInit
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1009:1: ruleInit returns [EObject current=null] : ( ( (lv_name_0_0= 'init' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_mainrocess_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1014:6: ( ( ( (lv_name_0_0= 'init' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1015:1: ( ( (lv_name_0_0= 'init' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1015:1: ( ( (lv_name_0_0= 'init' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1015:2: ( (lv_name_0_0= 'init' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1015:2: ( (lv_name_0_0= 'init' ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1016:1: (lv_name_0_0= 'init' )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1016:1: (lv_name_0_0= 'init' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1017:3: lv_name_0_0= 'init'
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,53,FOLLOW_53_in_ruleInit1878); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInitAccess().getNameInitKeyword_0_0(), "name"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInitRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		add(current, "name", lv_name_0_0, "init", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1036:2: ( (lv_mainrocess_1_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1037:1: (lv_mainrocess_1_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1037:1: (lv_mainrocess_1_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1038:3: lv_mainrocess_1_0= ruleMainProcess
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInitAccess().getMainrocessMainProcessParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMainProcess_in_ruleInit1912);
            lv_mainrocess_1_0=ruleMainProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInitRule().getType().getClassifier());
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInit


    // $ANTLR start entryRuleMain
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1068:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1069:2: (iv_ruleMain= ruleMain EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1070:2: iv_ruleMain= ruleMain EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMainRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1948);
            iv_ruleMain=ruleMain();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMain; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1958); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1077:1: ruleMain returns [EObject current=null] : ( ( (lv_name_0_0= 'main' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_mainrocess_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1082:6: ( ( ( (lv_name_0_0= 'main' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1083:1: ( ( (lv_name_0_0= 'main' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1083:1: ( ( (lv_name_0_0= 'main' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1083:2: ( (lv_name_0_0= 'main' ) ) ( (lv_mainrocess_1_0= ruleMainProcess ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1083:2: ( (lv_name_0_0= 'main' ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1084:1: (lv_name_0_0= 'main' )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1084:1: (lv_name_0_0= 'main' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1085:3: lv_name_0_0= 'main'
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,54,FOLLOW_54_in_ruleMain2001); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainAccess().getNameMainKeyword_0_0(), "name"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMainRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_0_0, "main", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1104:2: ( (lv_mainrocess_1_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1105:1: (lv_mainrocess_1_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1105:1: (lv_mainrocess_1_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1106:3: lv_mainrocess_1_0= ruleMainProcess
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMainProcess_in_ruleMain2035);
            lv_mainrocess_1_0=ruleMainProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleMainProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1136:1: entryRuleMainProcess returns [EObject current=null] : iv_ruleMainProcess= ruleMainProcess EOF ;
    public final EObject entryRuleMainProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProcess = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1137:2: (iv_ruleMainProcess= ruleMainProcess EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1138:2: iv_ruleMainProcess= ruleMainProcess EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMainProcessRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMainProcess_in_entryRuleMainProcess2071);
            iv_ruleMainProcess=ruleMainProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMainProcess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainProcess2081); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1145:1: ruleMainProcess returns [EObject current=null] : ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY ) ;
    public final EObject ruleMainProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_parallelStatement_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1150:6: ( ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1151:1: ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1151:1: ( () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1151:2: () RULE_LCURLY ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_RCURLY
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1151:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1152:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleMainProcess2127); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1169:1: ( (lv_parallelStatement_2_0= ruleParallelStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1170:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1170:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1171:3: lv_parallelStatement_2_0= ruleParallelStatement
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParallelStatement_in_ruleMainProcess2147);
            lv_parallelStatement_2_0=ruleParallelStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleMainProcess2156); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMainProcess


    // $ANTLR start entryRuleProcess
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1205:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1206:2: (iv_ruleProcess= ruleProcess EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1207:2: iv_ruleProcess= ruleProcess EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2191);
            iv_ruleProcess=ruleProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProcess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2201); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1214:1: ruleProcess returns [EObject current=null] : ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject lv_children_2_0 = null;

        EObject lv_children_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1219:6: ( ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1220:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1220:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LCURLY) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_LPAREN) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1220:1: ( ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY ) | ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1220:2: ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1220:2: ( () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1220:3: () RULE_LCURLY ( (lv_children_2_0= ruleParallelStatement ) ) RULE_RCURLY
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1220:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1221:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getProcessAccess().getProcessAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getProcessAccess().getProcessAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProcess2248); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1238:1: ( (lv_children_2_0= ruleParallelStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1239:1: (lv_children_2_0= ruleParallelStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1239:1: (lv_children_2_0= ruleParallelStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1240:3: lv_children_2_0= ruleParallelStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParallelStatement_in_ruleProcess2268);
                    lv_children_2_0=ruleParallelStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProcess2277); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1267:6: ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1267:6: ( RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1267:7: RULE_LPAREN ( (lv_children_5_0= ruleParallelStatement ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleProcess2293); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1271:1: ( (lv_children_5_0= ruleParallelStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1272:1: (lv_children_5_0= ruleParallelStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1272:1: (lv_children_5_0= ruleParallelStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1273:3: lv_children_5_0= ruleParallelStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParallelStatement_in_ruleProcess2313);
                    lv_children_5_0=ruleParallelStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleProcess2322); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleParallelStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1307:1: entryRuleParallelStatement returns [EObject current=null] : iv_ruleParallelStatement= ruleParallelStatement EOF ;
    public final EObject entryRuleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1308:2: (iv_ruleParallelStatement= ruleParallelStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1309:2: iv_ruleParallelStatement= ruleParallelStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParallelStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement2358);
            iv_ruleParallelStatement=ruleParallelStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParallelStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStatement2368); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1316:1: ruleParallelStatement returns [EObject current=null] : ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) ) ;
    public final EObject ruleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_children_1_0 = null;

        EObject lv_children_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1321:6: ( ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1322:1: ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1322:1: ( () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1322:2: () ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1322:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1323:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1336:2: ( ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1336:3: ( (lv_children_1_0= ruleSequenceStatement ) ) ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1336:3: ( (lv_children_1_0= ruleSequenceStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1337:1: (lv_children_1_0= ruleSequenceStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1337:1: (lv_children_1_0= ruleSequenceStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1338:3: lv_children_1_0= ruleSequenceStatement
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSequenceStatement_in_ruleParallelStatement2427);
            lv_children_1_0=ruleSequenceStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1360:2: ( RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_VERT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1360:3: RULE_VERT ( (lv_children_3_0= ruleSequenceStatement ) )
            	    {
            	    match(input,RULE_VERT,FOLLOW_RULE_VERT_in_ruleParallelStatement2437); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1364:1: ( (lv_children_3_0= ruleSequenceStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1365:1: (lv_children_3_0= ruleSequenceStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1365:1: (lv_children_3_0= ruleSequenceStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1366:3: lv_children_3_0= ruleSequenceStatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSequenceStatement_in_ruleParallelStatement2457);
            	    lv_children_3_0=ruleSequenceStatement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleParallelStatement


    // $ANTLR start entryRuleSequenceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1396:1: entryRuleSequenceStatement returns [EObject current=null] : iv_ruleSequenceStatement= ruleSequenceStatement EOF ;
    public final EObject entryRuleSequenceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1397:2: (iv_ruleSequenceStatement= ruleSequenceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1398:2: iv_ruleSequenceStatement= ruleSequenceStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSequenceStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement2496);
            iv_ruleSequenceStatement=ruleSequenceStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSequenceStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceStatement2506); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1405:1: ruleSequenceStatement returns [EObject current=null] : ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) ) ;
    public final EObject ruleSequenceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_children_1_0 = null;

        EObject lv_children_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1410:6: ( ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1411:1: ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1411:1: ( () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1411:2: () ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1411:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1412:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1425:2: ( ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1425:3: ( (lv_children_1_0= ruleBasicStatement ) ) ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1425:3: ( (lv_children_1_0= ruleBasicStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1426:1: (lv_children_1_0= ruleBasicStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1426:1: (lv_children_1_0= ruleBasicStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1427:3: lv_children_1_0= ruleBasicStatement
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBasicStatement_in_ruleSequenceStatement2565);
            lv_children_1_0=ruleBasicStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1449:2: ( RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SEMICOLON) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1449:3: RULE_SEMICOLON ( (lv_children_3_0= ruleBasicStatement ) )
            	    {
            	    match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement2575); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1453:1: ( (lv_children_3_0= ruleBasicStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1454:1: (lv_children_3_0= ruleBasicStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1454:1: (lv_children_3_0= ruleBasicStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1455:3: lv_children_3_0= ruleBasicStatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicStatement_in_ruleSequenceStatement2595);
            	    lv_children_3_0=ruleBasicStatement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSequenceStatement


    // $ANTLR start entryRuleBasicStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1485:1: entryRuleBasicStatement returns [EObject current=null] : iv_ruleBasicStatement= ruleBasicStatement EOF ;
    public final EObject entryRuleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1486:2: (iv_ruleBasicStatement= ruleBasicStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1487:2: iv_ruleBasicStatement= ruleBasicStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBasicStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement2634);
            iv_ruleBasicStatement=ruleBasicStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBasicStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStatement2644); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1494:1: ruleBasicStatement returns [EObject current=null] : ( ( (lv_process_0_0= ruleProcess ) ) | ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) | ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) ) | ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) ) | this_With_4= ruleWith | this_Synchronized_5= ruleSynchronized | this_Undef_6= ruleUndef | this_For_7= ruleFor | this_Foreach_8= ruleForeach | ( () ruleNullProcces ) | this_linkIn_11= rulelinkIn | ( ( RULE_ID ) ) ) ;
    public final EObject ruleBasicStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_process_0_0 = null;

        EObject lv_assignStatementOrPostIncrementDecrement_1_0 = null;

        EObject lv_NDChoiceStatement_2_0 = null;

        EObject lv_preIncrementDecrement_3_0 = null;

        EObject this_With_4 = null;

        EObject this_Synchronized_5 = null;

        EObject this_Undef_6 = null;

        EObject this_For_7 = null;

        EObject this_Foreach_8 = null;

        EObject this_linkIn_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1499:6: ( ( ( (lv_process_0_0= ruleProcess ) ) | ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) | ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) ) | ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) ) | this_With_4= ruleWith | this_Synchronized_5= ruleSynchronized | this_Undef_6= ruleUndef | this_For_7= ruleFor | this_Foreach_8= ruleForeach | ( () ruleNullProcces ) | this_linkIn_11= rulelinkIn | ( ( RULE_ID ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1500:1: ( ( (lv_process_0_0= ruleProcess ) ) | ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) | ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) ) | ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) ) | this_With_4= ruleWith | this_Synchronized_5= ruleSynchronized | this_Undef_6= ruleUndef | this_For_7= ruleFor | this_Foreach_8= ruleForeach | ( () ruleNullProcces ) | this_linkIn_11= rulelinkIn | ( ( RULE_ID ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1500:1: ( ( (lv_process_0_0= ruleProcess ) ) | ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) | ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) ) | ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) ) | this_With_4= ruleWith | this_Synchronized_5= ruleSynchronized | this_Undef_6= ruleUndef | this_For_7= ruleFor | this_Foreach_8= ruleForeach | ( () ruleNullProcces ) | this_linkIn_11= rulelinkIn | ( ( RULE_ID ) ) )
            int alt16=12;
            switch ( input.LA(1) ) {
            case RULE_LCURLY:
            case RULE_LPAREN:
                {
                alt16=1;
                }
                break;
            case RULE_DOT:
            case 63:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==RULE_DOT||LA16_3==RULE_LSQUARE||LA16_3==RULE_LPAREN||(LA16_3>=RULE_ASSIGN && LA16_3<=RULE_AT)) ) {
                    alt16=2;
                }
                else if ( (LA16_3==EOF||LA16_3==RULE_RCURLY||(LA16_3>=RULE_COMMA && LA16_3<=RULE_RSQUARE)||(LA16_3>=RULE_RPAREN && LA16_3<=RULE_SEMICOLON)) ) {
                    alt16=12;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1500:1: ( ( (lv_process_0_0= ruleProcess ) ) | ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) | ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) ) | ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) ) | this_With_4= ruleWith | this_Synchronized_5= ruleSynchronized | this_Undef_6= ruleUndef | this_For_7= ruleFor | this_Foreach_8= ruleForeach | ( () ruleNullProcces ) | this_linkIn_11= rulelinkIn | ( ( RULE_ID ) ) )", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LSQUARE:
                {
                alt16=3;
                }
                break;
            case RULE_CHOICE:
            case RULE_DECREMENT:
                {
                alt16=4;
                }
                break;
            case 64:
                {
                alt16=5;
                }
                break;
            case 57:
                {
                alt16=6;
                }
                break;
            case 58:
                {
                alt16=7;
                }
                break;
            case 61:
                {
                alt16=8;
                }
                break;
            case 62:
                {
                alt16=9;
                }
                break;
            case 56:
                {
                alt16=10;
                }
                break;
            case 55:
                {
                alt16=11;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1500:1: ( ( (lv_process_0_0= ruleProcess ) ) | ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) ) | ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) ) | ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) ) | this_With_4= ruleWith | this_Synchronized_5= ruleSynchronized | this_Undef_6= ruleUndef | this_For_7= ruleFor | this_Foreach_8= ruleForeach | ( () ruleNullProcces ) | this_linkIn_11= rulelinkIn | ( ( RULE_ID ) ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1500:2: ( (lv_process_0_0= ruleProcess ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1500:2: ( (lv_process_0_0= ruleProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1501:1: (lv_process_0_0= ruleProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1501:1: (lv_process_0_0= ruleProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1502:3: lv_process_0_0= ruleProcess
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProcess_in_ruleBasicStatement2690);
                    lv_process_0_0=ruleProcess();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"process",
                      	        		lv_process_0_0, 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1525:6: ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1525:6: ( (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1526:1: (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1526:1: (lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1527:3: lv_assignStatementOrPostIncrementDecrement_1_0= ruleAssignStatementOrPostIncrementDecrementOrInputOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getAssignStatementOrPostIncrementDecrementAssignStatementOrPostIncrementDecrementOrInputOperationParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_ruleBasicStatement2717);
                    lv_assignStatementOrPostIncrementDecrement_1_0=ruleAssignStatementOrPostIncrementDecrementOrInputOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"assignStatementOrPostIncrementDecrement",
                      	        		lv_assignStatementOrPostIncrementDecrement_1_0, 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1550:6: ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1550:6: ( (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1551:1: (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1551:1: (lv_NDChoiceStatement_2_0= ruleNDChoiceStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1552:3: lv_NDChoiceStatement_2_0= ruleNDChoiceStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement2744);
                    lv_NDChoiceStatement_2_0=ruleNDChoiceStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"NDChoiceStatement",
                      	        		lv_NDChoiceStatement_2_0, 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1575:6: ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1575:6: ( (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1576:1: (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1576:1: (lv_preIncrementDecrement_3_0= rulePreIncrementDecrement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1577:3: lv_preIncrementDecrement_3_0= rulePreIncrementDecrement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getPreIncrementDecrementPreIncrementDecrementParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreIncrementDecrement_in_ruleBasicStatement2771);
                    lv_preIncrementDecrement_3_0=rulePreIncrementDecrement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"preIncrementDecrement",
                      	        		lv_preIncrementDecrement_3_0, 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1601:2: this_With_4= ruleWith
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getWithParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleWith_in_ruleBasicStatement2802);
                    this_With_4=ruleWith();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_With_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1614:2: this_Synchronized_5= ruleSynchronized
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getSynchronizedParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSynchronized_in_ruleBasicStatement2832);
                    this_Synchronized_5=ruleSynchronized();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Synchronized_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1627:2: this_Undef_6= ruleUndef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getUndefParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUndef_in_ruleBasicStatement2862);
                    this_Undef_6=ruleUndef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Undef_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1640:2: this_For_7= ruleFor
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getForParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleBasicStatement2892);
                    this_For_7=ruleFor();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_For_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1653:2: this_Foreach_8= ruleForeach
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getForeachParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleForeach_in_ruleBasicStatement2922);
                    this_Foreach_8=ruleForeach();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Foreach_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1665:6: ( () ruleNullProcces )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1665:6: ( () ruleNullProcces )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1665:7: () ruleNullProcces
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1665:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1666:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getBasicStatementAccess().getBasicStatementAction_9_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getBasicStatementAccess().getBasicStatementAction_9_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getNullProccesParserRuleCall_9_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullProcces_in_ruleBasicStatement2959);
                    ruleNullProcces();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1692:2: this_linkIn_11= rulelinkIn
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBasicStatementAccess().getLinkInParserRuleCall_10(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulelinkIn_in_ruleBasicStatement2990);
                    this_linkIn_11=rulelinkIn();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_linkIn_11; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1704:6: ( ( RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1704:6: ( ( RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1705:1: ( RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1705:1: ( RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1706:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getBasicStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicStatement3017); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getBasicStatementAccess().getCallDefineCrossReference_11_0(), "call"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBasicStatement


    // $ANTLR start entryRulelinkIn
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1729:1: entryRulelinkIn returns [EObject current=null] : iv_rulelinkIn= rulelinkIn EOF ;
    public final EObject entryRulelinkIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelinkIn = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1730:2: (iv_rulelinkIn= rulelinkIn EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1731:2: iv_rulelinkIn= rulelinkIn EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLinkInRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulelinkIn_in_entryRulelinkIn3053);
            iv_rulelinkIn=rulelinkIn();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulelinkIn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelinkIn3063); if (failed) return current;

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
    // $ANTLR end entryRulelinkIn


    // $ANTLR start rulelinkIn
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1738:1: rulelinkIn returns [EObject current=null] : ( () 'linkIn' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ) ;
    public final EObject rulelinkIn() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1743:6: ( ( () 'linkIn' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1744:1: ( () 'linkIn' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1744:1: ( () 'linkIn' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1744:2: () 'linkIn' RULE_LPAREN ( (lv_name_3_0= RULE_ID ) ) RULE_RPAREN
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1744:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1745:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getLinkInAccess().getLinkInAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getLinkInAccess().getLinkInAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,55,FOLLOW_55_in_rulelinkIn3110); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLinkInAccess().getLinkInKeyword_1(), null); 
                  
            }
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulelinkIn3119); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getLinkInAccess().getLPARENTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1766:1: ( (lv_name_3_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1767:1: (lv_name_3_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1767:1: (lv_name_3_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1768:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelinkIn3135); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getLinkInAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLinkInRule().getType().getClassifier());
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


            }

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulelinkIn3149); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getLinkInAccess().getRPARENTerminalRuleCall_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulelinkIn


    // $ANTLR start entryRuleNullProcces
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1802:1: entryRuleNullProcces returns [String current=null] : iv_ruleNullProcces= ruleNullProcces EOF ;
    public final String entryRuleNullProcces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullProcces = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1803:2: (iv_ruleNullProcces= ruleNullProcces EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1804:2: iv_ruleNullProcces= ruleNullProcces EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNullProccesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNullProcces_in_entryRuleNullProcces3185);
            iv_ruleNullProcces=ruleNullProcces();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNullProcces.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullProcces3196); if (failed) return current;

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
    // $ANTLR end entryRuleNullProcces


    // $ANTLR start ruleNullProcces
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1811:1: ruleNullProcces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'nullProcess' ;
    public final AntlrDatatypeRuleToken ruleNullProcces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1816:6: (kw= 'nullProcess' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1818:2: kw= 'nullProcess'
            {
            kw=(Token)input.LT(1);
            match(input,56,FOLLOW_56_in_ruleNullProcces3233); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getNullProccesAccess().getNullProcessKeyword(), null); 
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNullProcces


    // $ANTLR start entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1831:1: entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation returns [EObject current=null] : iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation= ruleAssignStatementOrPostIncrementDecrementOrInputOperation EOF ;
    public final EObject entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1832:2: (iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation= ruleAssignStatementOrPostIncrementDecrementOrInputOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1833:2: iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation= ruleAssignStatementOrPostIncrementDecrementOrInputOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation3272);
            iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation=ruleAssignStatementOrPostIncrementDecrementOrInputOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignStatementOrPostIncrementDecrementOrInputOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation3282); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1840:1: ruleAssignStatementOrPostIncrementDecrementOrInputOperation returns [EObject current=null] : ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) ) ;
    public final EObject ruleAssignStatementOrPostIncrementDecrementOrInputOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_1_0 = null;

        EObject lv_rightSide_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1845:6: ( ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1846:1: ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1846:1: ( () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1846:2: () ( (lv_variablePath_1_0= ruleVariablePath ) ) ( (lv_rightSide_2_0= ruleRightSide ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1846:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1847:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getAssignStatementOrPostIncrementDecrementAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getAssignStatementOrPostIncrementDecrementAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1860:2: ( (lv_variablePath_1_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1861:1: (lv_variablePath_1_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1861:1: (lv_variablePath_1_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1862:3: lv_variablePath_1_0= ruleVariablePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getVariablePathVariablePathParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariablePath_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation3340);
            lv_variablePath_1_0=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationRule().getType().getClassifier());
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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1884:2: ( (lv_rightSide_2_0= ruleRightSide ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1885:1: (lv_rightSide_2_0= ruleRightSide )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1885:1: (lv_rightSide_2_0= ruleRightSide )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1886:3: lv_rightSide_2_0= ruleRightSide
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignStatementOrPostIncrementDecrementOrInputOperationAccess().getRightSideRightSideParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightSide_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation3361);
            lv_rightSide_2_0=ruleRightSide();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAssignStatementOrPostIncrementDecrementOrInputOperation


    // $ANTLR start entryRuleRightSide
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1916:1: entryRuleRightSide returns [EObject current=null] : iv_ruleRightSide= ruleRightSide EOF ;
    public final EObject entryRuleRightSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSide = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1917:2: (iv_ruleRightSide= ruleRightSide EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1918:2: iv_ruleRightSide= ruleRightSide EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightSideRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightSide_in_entryRuleRightSide3397);
            iv_ruleRightSide=ruleRightSide();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightSide; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSide3407); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1925:1: ruleRightSide returns [EObject current=null] : ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) ) | ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) ) ) ;
    public final EObject ruleRightSide() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_variablePath_9_0 = null;

        EObject lv_variablePath_12_0 = null;

        EObject lv_variablePath_14_0 = null;

        EObject lv_inputOperation_16_0 = null;

        EObject lv_outputOperation_18_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1930:6: ( ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) ) | ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1931:1: ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) ) | ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1931:1: ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) ) | ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case RULE_ASSIGN:
                {
                alt17=1;
                }
                break;
            case RULE_CHOICE:
                {
                alt17=2;
                }
                break;
            case RULE_DECREMENT:
                {
                alt17=3;
                }
                break;
            case RULE_POINTSTO:
                {
                alt17=4;
                }
                break;
            case RULE_DEEPCOPYLEFT:
                {
                alt17=5;
                }
                break;
            case RULE_LPAREN:
                {
                alt17=6;
                }
                break;
            case RULE_AT:
                {
                alt17=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1931:1: ( ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) ) | ( () RULE_CHOICE ) | ( () RULE_DECREMENT ) | ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) ) | ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) ) | ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) ) | ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1931:2: ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1931:2: ( () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1931:3: () RULE_ASSIGN ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1931:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1932:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleRightSide3454); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getASSIGNTerminalRuleCall_0_1(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1949:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1950:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1950:1: (lv_expression_2_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1951:3: lv_expression_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getExpressionExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleRightSide3474);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1974:6: ( () RULE_CHOICE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1974:6: ( () RULE_CHOICE )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1974:7: () RULE_CHOICE
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1974:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1975:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_ruleRightSide3503); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getCHOICETerminalRuleCall_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1993:6: ( () RULE_DECREMENT )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1993:6: ( () RULE_DECREMENT )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1993:7: () RULE_DECREMENT
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1993:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1994:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleRightSide3531); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getDECREMENTTerminalRuleCall_2_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2012:6: ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2012:6: ( () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2012:7: () RULE_POINTSTO ( (lv_variablePath_9_0= ruleVariablePath ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2012:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2013:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_POINTSTO,FOLLOW_RULE_POINTSTO_in_ruleRightSide3559); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getPOINTSTOTerminalRuleCall_3_1(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2030:1: ( (lv_variablePath_9_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2031:1: (lv_variablePath_9_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2031:1: (lv_variablePath_9_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2032:3: lv_variablePath_9_0= ruleVariablePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getVariablePathVariablePathParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleRightSide3579);
                    lv_variablePath_9_0=ruleVariablePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2055:6: ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2055:6: ( () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2055:7: () RULE_DEEPCOPYLEFT ( (lv_variablePath_12_0= ruleVariablePath ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2055:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2056:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getRightSideAccess().getRightSideAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getRightSideAccess().getRightSideAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_DEEPCOPYLEFT,FOLLOW_RULE_DEEPCOPYLEFT_in_ruleRightSide3608); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getDEEPCOPYLEFTTerminalRuleCall_4_1(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2073:1: ( (lv_variablePath_12_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2074:1: (lv_variablePath_12_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2074:1: (lv_variablePath_12_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2075:3: lv_variablePath_12_0= ruleVariablePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getVariablePathVariablePathParserRuleCall_4_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleRightSide3628);
                    lv_variablePath_12_0=ruleVariablePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }
                    break;
                case 6 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2098:6: ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2098:6: ( RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2098:7: RULE_LPAREN ( (lv_variablePath_14_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_16_0= ruleInputOperation ) )
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRightSide3645); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getLPARENTerminalRuleCall_5_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2102:1: ( (lv_variablePath_14_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2103:1: (lv_variablePath_14_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2103:1: (lv_variablePath_14_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2104:3: lv_variablePath_14_0= ruleVariablePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getVariablePathVariablePathParserRuleCall_5_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleRightSide3665);
                    lv_variablePath_14_0=ruleVariablePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRightSide3674); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getRPARENTerminalRuleCall_5_2(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2130:1: ( (lv_inputOperation_16_0= ruleInputOperation ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2131:1: (lv_inputOperation_16_0= ruleInputOperation )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2131:1: (lv_inputOperation_16_0= ruleInputOperation )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2132:3: lv_inputOperation_16_0= ruleInputOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getInputOperationInputOperationParserRuleCall_5_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputOperation_in_ruleRightSide3694);
                    lv_inputOperation_16_0=ruleInputOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"inputOperation",
                      	        		lv_inputOperation_16_0, 
                      	        		"InputOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2155:6: ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2155:6: ( RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2155:7: RULE_AT ( (lv_outputOperation_18_0= ruleOutputOperation ) )
                    {
                    match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleRightSide3711); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightSideAccess().getATTerminalRuleCall_6_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2159:1: ( (lv_outputOperation_18_0= ruleOutputOperation ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2160:1: (lv_outputOperation_18_0= ruleOutputOperation )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2160:1: (lv_outputOperation_18_0= ruleOutputOperation )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2161:3: lv_outputOperation_18_0= ruleOutputOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRightSideAccess().getOutputOperationOutputOperationParserRuleCall_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputOperation_in_ruleRightSide3731);
                    lv_outputOperation_18_0=ruleOutputOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRightSideRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"outputOperation",
                      	        		lv_outputOperation_18_0, 
                      	        		"OutputOperation", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleRightSide


    // $ANTLR start entryRuleSynchronized
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2191:1: entryRuleSynchronized returns [EObject current=null] : iv_ruleSynchronized= ruleSynchronized EOF ;
    public final EObject entryRuleSynchronized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronized = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2192:2: (iv_ruleSynchronized= ruleSynchronized EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2193:2: iv_ruleSynchronized= ruleSynchronized EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSynchronizedRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSynchronized_in_entryRuleSynchronized3768);
            iv_ruleSynchronized=ruleSynchronized();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSynchronized; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSynchronized3778); if (failed) return current;

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
    // $ANTLR end entryRuleSynchronized


    // $ANTLR start ruleSynchronized
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2200:1: ruleSynchronized returns [EObject current=null] : ( 'synchronized' RULE_LPAREN ( (lv_name_2_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) ) ;
    public final EObject ruleSynchronized() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_mainProcess_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2205:6: ( ( 'synchronized' RULE_LPAREN ( (lv_name_2_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2206:1: ( 'synchronized' RULE_LPAREN ( (lv_name_2_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2206:1: ( 'synchronized' RULE_LPAREN ( (lv_name_2_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2206:3: 'synchronized' RULE_LPAREN ( (lv_name_2_0= RULE_ID ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) )
            {
            match(input,57,FOLLOW_57_in_ruleSynchronized3813); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSynchronizedAccess().getSynchronizedKeyword_0(), null); 
                  
            }
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSynchronized3822); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSynchronizedAccess().getLPARENTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2214:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2215:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2215:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2216:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSynchronized3838); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSynchronizedAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSynchronizedRule().getType().getClassifier());
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


            }

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSynchronized3852); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getSynchronizedAccess().getRPARENTerminalRuleCall_3(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2242:1: ( (lv_mainProcess_4_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2243:1: (lv_mainProcess_4_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2243:1: (lv_mainProcess_4_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2244:3: lv_mainProcess_4_0= ruleMainProcess
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSynchronizedAccess().getMainProcessMainProcessParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMainProcess_in_ruleSynchronized3872);
            lv_mainProcess_4_0=ruleMainProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSynchronizedRule().getType().getClassifier());
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


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSynchronized


    // $ANTLR start entryRuleUndef
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2274:1: entryRuleUndef returns [EObject current=null] : iv_ruleUndef= ruleUndef EOF ;
    public final EObject entryRuleUndef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndef = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2275:2: (iv_ruleUndef= ruleUndef EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2276:2: iv_ruleUndef= ruleUndef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUndefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUndef_in_entryRuleUndef3908);
            iv_ruleUndef=ruleUndef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUndef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUndef3918); if (failed) return current;

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
    // $ANTLR end entryRuleUndef


    // $ANTLR start ruleUndef
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2283:1: ruleUndef returns [EObject current=null] : ( 'undef' RULE_LPAREN ( (lv_variablePath_2_0= ruleVariablePath ) ) RULE_RPAREN ) ;
    public final EObject ruleUndef() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2288:6: ( ( 'undef' RULE_LPAREN ( (lv_variablePath_2_0= ruleVariablePath ) ) RULE_RPAREN ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2289:1: ( 'undef' RULE_LPAREN ( (lv_variablePath_2_0= ruleVariablePath ) ) RULE_RPAREN )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2289:1: ( 'undef' RULE_LPAREN ( (lv_variablePath_2_0= ruleVariablePath ) ) RULE_RPAREN )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2289:3: 'undef' RULE_LPAREN ( (lv_variablePath_2_0= ruleVariablePath ) ) RULE_RPAREN
            {
            match(input,58,FOLLOW_58_in_ruleUndef3953); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUndefAccess().getUndefKeyword_0(), null); 
                  
            }
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleUndef3962); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getUndefAccess().getLPARENTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2297:1: ( (lv_variablePath_2_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2298:1: (lv_variablePath_2_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2298:1: (lv_variablePath_2_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2299:3: lv_variablePath_2_0= ruleVariablePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUndefAccess().getVariablePathVariablePathParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariablePath_in_ruleUndef3982);
            lv_variablePath_2_0=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUndefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
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

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleUndef3991); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getUndefAccess().getRPARENTerminalRuleCall_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUndef


    // $ANTLR start entryRuleOutputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2333:1: entryRuleOutputOperation returns [EObject current=null] : iv_ruleOutputOperation= ruleOutputOperation EOF ;
    public final EObject entryRuleOutputOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2334:2: (iv_ruleOutputOperation= ruleOutputOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2335:2: iv_ruleOutputOperation= ruleOutputOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputOperation_in_entryRuleOutputOperation4026);
            iv_ruleOutputOperation=ruleOutputOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperation4036); if (failed) return current;

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
    // $ANTLR end entryRuleOutputOperation


    // $ANTLR start ruleOutputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2342:1: ruleOutputOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )? )? ) ;
    public final EObject ruleOutputOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_2_0 = null;

        EObject lv_variablePath_5_0 = null;

        EObject lv_installFunction_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2347:6: ( ( ( (lv_name_0_0= RULE_ID ) ) RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )? )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2348:1: ( ( (lv_name_0_0= RULE_ID ) ) RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )? )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2348:1: ( ( (lv_name_0_0= RULE_ID ) ) RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )? )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2348:2: ( (lv_name_0_0= RULE_ID ) ) RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )? )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2348:2: ( (lv_name_0_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2349:1: (lv_name_0_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2349:1: (lv_name_0_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2350:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputOperation4078); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOutputOperationAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOutputOperation4092); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getOutputOperationAccess().getLPARENTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2376:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2377:1: (lv_expression_2_0= ruleExpression )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2377:1: (lv_expression_2_0= ruleExpression )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2378:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputOperationAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleOutputOperation4112);
            lv_expression_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputOperationRule().getType().getClassifier());
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

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOutputOperation4121); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getOutputOperationAccess().getRPARENTerminalRuleCall_3(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2404:1: ( RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )? )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LPAREN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2404:2: RULE_LPAREN ( (lv_variablePath_5_0= ruleVariablePath ) )? RULE_RPAREN ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )?
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOutputOperation4130); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getOutputOperationAccess().getLPARENTerminalRuleCall_4_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2408:1: ( (lv_variablePath_5_0= ruleVariablePath ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==RULE_DOT||LA18_0==63) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2409:1: (lv_variablePath_5_0= ruleVariablePath )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2409:1: (lv_variablePath_5_0= ruleVariablePath )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2410:3: lv_variablePath_5_0= ruleVariablePath
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getOutputOperationAccess().getVariablePathVariablePathParserRuleCall_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariablePath_in_ruleOutputOperation4150);
                            lv_variablePath_5_0=ruleVariablePath();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getOutputOperationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"variablePath",
                              	        		lv_variablePath_5_0, 
                              	        		"VariablePath", 
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

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOutputOperation4160); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getOutputOperationAccess().getRPARENTerminalRuleCall_4_2(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2436:1: ( RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_LSQUARE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2436:2: RULE_LSQUARE ( (lv_installFunction_8_0= ruleInstallFunciton ) ) RULE_RSQUARE
                            {
                            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleOutputOperation4169); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getOutputOperationAccess().getLSQUARETerminalRuleCall_4_3_0(), null); 
                                  
                            }
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2440:1: ( (lv_installFunction_8_0= ruleInstallFunciton ) )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2441:1: (lv_installFunction_8_0= ruleInstallFunciton )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2441:1: (lv_installFunction_8_0= ruleInstallFunciton )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2442:3: lv_installFunction_8_0= ruleInstallFunciton
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getOutputOperationAccess().getInstallFunctionInstallFuncitonParserRuleCall_4_3_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInstallFunciton_in_ruleOutputOperation4189);
                            lv_installFunction_8_0=ruleInstallFunciton();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getOutputOperationRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"installFunction",
                              	        		lv_installFunction_8_0, 
                              	        		"InstallFunciton", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleOutputOperation4198); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getOutputOperationAccess().getRSQUARETerminalRuleCall_4_3_2(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOutputOperation


    // $ANTLR start entryRuleInstallFunciton
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2476:1: entryRuleInstallFunciton returns [EObject current=null] : iv_ruleInstallFunciton= ruleInstallFunciton EOF ;
    public final EObject entryRuleInstallFunciton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstallFunciton = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2477:2: (iv_ruleInstallFunciton= ruleInstallFunciton EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2478:2: iv_ruleInstallFunciton= ruleInstallFunciton EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInstallFuncitonRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInstallFunciton_in_entryRuleInstallFunciton4237);
            iv_ruleInstallFunciton=ruleInstallFunciton();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInstallFunciton; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstallFunciton4247); if (failed) return current;

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
    // $ANTLR end entryRuleInstallFunciton


    // $ANTLR start ruleInstallFunciton
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2485:1: ruleInstallFunciton returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_process_3_0= ruleProcess ) ) ( RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) ) )* ) ;
    public final EObject ruleInstallFunciton() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_5_0=null;
        EObject lv_process_3_0 = null;

        EObject lv_parallelStatement_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2490:6: ( ( ( ( (lv_name_0_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_process_3_0= ruleProcess ) ) ( RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2491:1: ( ( ( (lv_name_0_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_process_3_0= ruleProcess ) ) ( RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2491:1: ( ( ( (lv_name_0_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_process_3_0= ruleProcess ) ) ( RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2491:2: ( ( (lv_name_0_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_process_3_0= ruleProcess ) ) ( RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2491:2: ( ( (lv_name_0_0= RULE_ID ) ) | 'this' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==59) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2491:2: ( ( (lv_name_0_0= RULE_ID ) ) | 'this' )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2491:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2491:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2492:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2492:1: (lv_name_0_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2493:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstallFunciton4290); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getInstallFuncitonAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInstallFuncitonRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_0_0, 
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2516:7: 'this'
                    {
                    match(input,59,FOLLOW_59_in_ruleInstallFunciton4311); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInstallFuncitonAccess().getThisKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,60,FOLLOW_60_in_ruleInstallFunciton4322); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInstallFuncitonAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2524:1: ( (lv_process_3_0= ruleProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2525:1: (lv_process_3_0= ruleProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2525:1: (lv_process_3_0= ruleProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2526:3: lv_process_3_0= ruleProcess
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInstallFuncitonAccess().getProcessProcessParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleProcess_in_ruleInstallFunciton4343);
            lv_process_3_0=ruleProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInstallFuncitonRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"process",
              	        		lv_process_3_0, 
              	        		"Process", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2548:2: ( RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2548:3: RULE_COMMA ( ( (lv_name_5_0= RULE_ID ) ) | 'this' ) '=>' ( (lv_parallelStatement_8_0= ruleParallelStatement ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInstallFunciton4353); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getInstallFuncitonAccess().getCOMMATerminalRuleCall_3_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2552:1: ( ( (lv_name_5_0= RULE_ID ) ) | 'this' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_ID) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==59) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("2552:1: ( ( (lv_name_5_0= RULE_ID ) ) | 'this' )", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2552:2: ( (lv_name_5_0= RULE_ID ) )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2552:2: ( (lv_name_5_0= RULE_ID ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2553:1: (lv_name_5_0= RULE_ID )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2553:1: (lv_name_5_0= RULE_ID )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2554:3: lv_name_5_0= RULE_ID
            	            {
            	            lv_name_5_0=(Token)input.LT(1);
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstallFunciton4370); if (failed) return current;
            	            if ( backtracking==0 ) {

            	              			createLeafNode(grammarAccess.getInstallFuncitonAccess().getNameIDTerminalRuleCall_3_1_0_0(), "name"); 
            	              		
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getInstallFuncitonRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"name",
            	              	        		lv_name_5_0, 
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
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2577:7: 'this'
            	            {
            	            match(input,59,FOLLOW_59_in_ruleInstallFunciton4391); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getInstallFuncitonAccess().getThisKeyword_3_1_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    match(input,60,FOLLOW_60_in_ruleInstallFunciton4402); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInstallFuncitonAccess().getEqualsSignGreaterThanSignKeyword_3_2(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2585:1: ( (lv_parallelStatement_8_0= ruleParallelStatement ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2586:1: (lv_parallelStatement_8_0= ruleParallelStatement )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2586:1: (lv_parallelStatement_8_0= ruleParallelStatement )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2587:3: lv_parallelStatement_8_0= ruleParallelStatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInstallFuncitonAccess().getParallelStatementParallelStatementParserRuleCall_3_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParallelStatement_in_ruleInstallFunciton4423);
            	    lv_parallelStatement_8_0=ruleParallelStatement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInstallFuncitonRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"parallelStatement",
            	      	        		lv_parallelStatement_8_0, 
            	      	        		"ParallelStatement", 
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

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInstallFunciton


    // $ANTLR start entryRuleInputOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2617:1: entryRuleInputOperation returns [EObject current=null] : iv_ruleInputOperation= ruleInputOperation EOF ;
    public final EObject entryRuleInputOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2618:2: (iv_ruleInputOperation= ruleInputOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2619:2: iv_ruleInputOperation= ruleInputOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInputOperation_in_entryRuleInputOperation4461);
            iv_ruleInputOperation=ruleInputOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInputOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperation4471); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2626:1: ruleInputOperation returns [EObject current=null] : ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? ) ;
    public final EObject ruleInputOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_mainProcess_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2631:6: ( ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2632:1: ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2632:1: ( () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2632:2: () ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2632:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2633:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getInputOperationAccess().getInputOperationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getInputOperationAccess().getInputOperationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2646:2: ( RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LPAREN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2646:3: RULE_LPAREN ( (lv_expression_2_0= ruleExpression ) ) RULE_RPAREN ( (lv_mainProcess_4_0= ruleMainProcess ) )
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleInputOperation4518); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_1_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2650:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2651:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2651:1: (lv_expression_2_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2652:3: lv_expression_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInputOperationAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInputOperation4538);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInputOperationRule().getType().getClassifier());
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

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleInputOperation4547); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_1_2(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2678:1: ( (lv_mainProcess_4_0= ruleMainProcess ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2679:1: (lv_mainProcess_4_0= ruleMainProcess )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2679:1: (lv_mainProcess_4_0= ruleMainProcess )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2680:3: lv_mainProcess_4_0= ruleMainProcess
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInputOperationAccess().getMainProcessMainProcessParserRuleCall_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMainProcess_in_ruleInputOperation4567);
                    lv_mainProcess_4_0=ruleMainProcess();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInputOperationRule().getType().getClassifier());
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


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInputOperation


    // $ANTLR start entryRulePreIncrementDecrement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2710:1: entryRulePreIncrementDecrement returns [EObject current=null] : iv_rulePreIncrementDecrement= rulePreIncrementDecrement EOF ;
    public final EObject entryRulePreIncrementDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreIncrementDecrement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2711:2: (iv_rulePreIncrementDecrement= rulePreIncrementDecrement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2712:2: iv_rulePreIncrementDecrement= rulePreIncrementDecrement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreIncrementDecrementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreIncrementDecrement_in_entryRulePreIncrementDecrement4605);
            iv_rulePreIncrementDecrement=rulePreIncrementDecrement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreIncrementDecrement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreIncrementDecrement4615); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2719:1: rulePreIncrementDecrement returns [EObject current=null] : ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) ) ;
    public final EObject rulePreIncrementDecrement() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2724:6: ( ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2725:1: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2725:1: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2725:2: ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_2_0= ruleVariablePath ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2725:2: ( RULE_CHOICE | RULE_DECREMENT )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_CHOICE) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_DECREMENT) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2725:2: ( RULE_CHOICE | RULE_DECREMENT )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2725:3: RULE_CHOICE
                    {
                    match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rulePreIncrementDecrement4650); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getPreIncrementDecrementAccess().getCHOICETerminalRuleCall_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2730:6: RULE_DECREMENT
                    {
                    match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rulePreIncrementDecrement4664); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getPreIncrementDecrementAccess().getDECREMENTTerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2734:2: ( (lv_variablePath_2_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2735:1: (lv_variablePath_2_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2735:1: (lv_variablePath_2_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2736:3: lv_variablePath_2_0= ruleVariablePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreIncrementDecrementAccess().getVariablePathVariablePathParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariablePath_in_rulePreIncrementDecrement4685);
            lv_variablePath_2_0=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePreIncrementDecrement


    // $ANTLR start entryRuleFor
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2766:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2767:2: (iv_ruleFor= ruleFor EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2768:2: iv_ruleFor= ruleFor EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getForRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor4721);
            iv_ruleFor=ruleFor();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor4731); if (failed) return current;

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
    // $ANTLR end entryRuleFor


    // $ANTLR start ruleFor
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2775:1: ruleFor returns [EObject current=null] : ( 'for' RULE_LPAREN ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_COMMA ( (lv_condition_4_0= ruleCondition ) ) RULE_COMMA ( (lv_parallelStatement_6_0= ruleParallelStatement ) ) ( (lv_body_7_0= ruleBody ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        EObject lv_parallelStatement_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_parallelStatement_6_0 = null;

        EObject lv_body_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2780:6: ( ( 'for' RULE_LPAREN ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_COMMA ( (lv_condition_4_0= ruleCondition ) ) RULE_COMMA ( (lv_parallelStatement_6_0= ruleParallelStatement ) ) ( (lv_body_7_0= ruleBody ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2781:1: ( 'for' RULE_LPAREN ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_COMMA ( (lv_condition_4_0= ruleCondition ) ) RULE_COMMA ( (lv_parallelStatement_6_0= ruleParallelStatement ) ) ( (lv_body_7_0= ruleBody ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2781:1: ( 'for' RULE_LPAREN ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_COMMA ( (lv_condition_4_0= ruleCondition ) ) RULE_COMMA ( (lv_parallelStatement_6_0= ruleParallelStatement ) ) ( (lv_body_7_0= ruleBody ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2781:3: 'for' RULE_LPAREN ( (lv_parallelStatement_2_0= ruleParallelStatement ) ) RULE_COMMA ( (lv_condition_4_0= ruleCondition ) ) RULE_COMMA ( (lv_parallelStatement_6_0= ruleParallelStatement ) ) ( (lv_body_7_0= ruleBody ) )
            {
            match(input,61,FOLLOW_61_in_ruleFor4766); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getForAccess().getForKeyword_0(), null); 
                  
            }
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFor4775); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getForAccess().getLPARENTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2789:1: ( (lv_parallelStatement_2_0= ruleParallelStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2790:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2790:1: (lv_parallelStatement_2_0= ruleParallelStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2791:3: lv_parallelStatement_2_0= ruleParallelStatement
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForAccess().getParallelStatementParallelStatementParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParallelStatement_in_ruleFor4795);
            lv_parallelStatement_2_0=ruleParallelStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
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


            }

            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFor4804); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getForAccess().getCOMMATerminalRuleCall_3(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2817:1: ( (lv_condition_4_0= ruleCondition ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2818:1: (lv_condition_4_0= ruleCondition )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2818:1: (lv_condition_4_0= ruleCondition )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2819:3: lv_condition_4_0= ruleCondition
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForAccess().getConditionConditionParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCondition_in_ruleFor4824);
            lv_condition_4_0=ruleCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"condition",
              	        		lv_condition_4_0, 
              	        		"Condition", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFor4833); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getForAccess().getCOMMATerminalRuleCall_5(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2845:1: ( (lv_parallelStatement_6_0= ruleParallelStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2846:1: (lv_parallelStatement_6_0= ruleParallelStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2846:1: (lv_parallelStatement_6_0= ruleParallelStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2847:3: lv_parallelStatement_6_0= ruleParallelStatement
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForAccess().getParallelStatementParallelStatementParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParallelStatement_in_ruleFor4853);
            lv_parallelStatement_6_0=ruleParallelStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"parallelStatement",
              	        		lv_parallelStatement_6_0, 
              	        		"ParallelStatement", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2869:2: ( (lv_body_7_0= ruleBody ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2870:1: (lv_body_7_0= ruleBody )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2870:1: (lv_body_7_0= ruleBody )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2871:3: lv_body_7_0= ruleBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForAccess().getBodyBodyParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBody_in_ruleFor4874);
            lv_body_7_0=ruleBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"body",
              	        		lv_body_7_0, 
              	        		"Body", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleFor


    // $ANTLR start entryRuleBody
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2901:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2902:2: (iv_ruleBody= ruleBody EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2903:2: iv_ruleBody= ruleBody EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBodyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody4910);
            iv_ruleBody=ruleBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody4920); if (failed) return current;

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
    // $ANTLR end entryRuleBody


    // $ANTLR start ruleBody
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2910:1: ruleBody returns [EObject current=null] : ( RULE_RPAREN this_BasicStatement_1= ruleBasicStatement ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject this_BasicStatement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2915:6: ( ( RULE_RPAREN this_BasicStatement_1= ruleBasicStatement ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2916:1: ( RULE_RPAREN this_BasicStatement_1= ruleBasicStatement )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2916:1: ( RULE_RPAREN this_BasicStatement_1= ruleBasicStatement )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2916:2: RULE_RPAREN this_BasicStatement_1= ruleBasicStatement
            {
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBody4954); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getBodyAccess().getRPARENTerminalRuleCall_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBodyAccess().getBasicStatementParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleBasicStatement_in_ruleBody4978);
            this_BasicStatement_1=ruleBasicStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_BasicStatement_1; 
                      currentNode = currentNode.getParent();
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBody


    // $ANTLR start entryRuleCondition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2940:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2941:2: (iv_ruleCondition= ruleCondition EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2942:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition5013);
            iv_ruleCondition=ruleCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition5023); if (failed) return current;

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
    // $ANTLR end entryRuleCondition


    // $ANTLR start ruleCondition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2949:1: ruleCondition returns [EObject current=null] : ( ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) | ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_variablePath_2_0 = null;

        EObject lv_rightCondition_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2954:6: ( ( ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) | ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2955:1: ( ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) | ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2955:1: ( ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) | ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NOT) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==RULE_DOT||LA27_0==RULE_INT||LA27_0==63) ) {
                alt27=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2955:1: ( ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) | ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) ) )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2955:2: ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2955:2: ( RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2955:3: RULE_NOT ( (lv_expression_1_0= ruleExpression ) )
                    {
                    match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleCondition5058); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConditionAccess().getNOTTerminalRuleCall_0_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2959:1: ( (lv_expression_1_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2960:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2960:1: (lv_expression_1_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2961:3: lv_expression_1_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition5078);
                    lv_expression_1_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
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


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2984:6: ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2984:6: ( ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2984:7: ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING ) ( (lv_rightCondition_5_0= ruleRightCondition ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2984:7: ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                    case RULE_DOT:
                    case 63:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt26=2;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2984:7: ( ( (lv_variablePath_2_0= ruleVariablePath ) ) | RULE_INT | RULE_STRING )", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2984:8: ( (lv_variablePath_2_0= ruleVariablePath ) )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2984:8: ( (lv_variablePath_2_0= ruleVariablePath ) )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2985:1: (lv_variablePath_2_0= ruleVariablePath )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2985:1: (lv_variablePath_2_0= ruleVariablePath )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:2986:3: lv_variablePath_2_0= ruleVariablePath
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getVariablePathVariablePathParserRuleCall_1_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariablePath_in_ruleCondition5108);
                            lv_variablePath_2_0=ruleVariablePath();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
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
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3009:6: RULE_INT
                            {
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCondition5123); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getConditionAccess().getINTTerminalRuleCall_1_0_1(), null); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3014:6: RULE_STRING
                            {
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition5137); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getConditionAccess().getSTRINGTerminalRuleCall_1_0_2(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3018:2: ( (lv_rightCondition_5_0= ruleRightCondition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3019:1: (lv_rightCondition_5_0= ruleRightCondition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3019:1: (lv_rightCondition_5_0= ruleRightCondition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3020:3: lv_rightCondition_5_0= ruleRightCondition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getRightConditionRightConditionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightCondition_in_ruleCondition5158);
                    lv_rightCondition_5_0=ruleRightCondition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightCondition",
                      	        		lv_rightCondition_5_0, 
                      	        		"RightCondition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCondition


    // $ANTLR start entryRuleRightCondition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3050:1: entryRuleRightCondition returns [EObject current=null] : iv_ruleRightCondition= ruleRightCondition EOF ;
    public final EObject entryRuleRightCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightCondition = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3051:2: (iv_ruleRightCondition= ruleRightCondition EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3052:2: iv_ruleRightCondition= ruleRightCondition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightConditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightCondition_in_entryRuleRightCondition5195);
            iv_ruleRightCondition=ruleRightCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightCondition5205); if (failed) return current;

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
    // $ANTLR end entryRuleRightCondition


    // $ANTLR start ruleRightCondition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3059:1: ruleRightCondition returns [EObject current=null] : ( ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleRightCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3064:6: ( ( ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3065:1: ( ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3065:1: ( ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL ) ( (lv_expression_6_0= ruleExpression ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3065:2: ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3065:2: ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL )
            int alt28=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt28=1;
                }
                break;
            case RULE_LANGLE:
                {
                alt28=2;
                }
                break;
            case RULE_RANGLE:
                {
                alt28=3;
                }
                break;
            case RULE_MAJOR_OR_EQUAL:
                {
                alt28=4;
                }
                break;
            case RULE_MINOR_OR_EQUAL:
                {
                alt28=5;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt28=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3065:2: ( RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3065:3: RULE_EQUAL
                    {
                    match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleRightCondition5240); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightConditionAccess().getEQUALTerminalRuleCall_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3070:6: RULE_LANGLE
                    {
                    match(input,RULE_LANGLE,FOLLOW_RULE_LANGLE_in_ruleRightCondition5254); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightConditionAccess().getLANGLETerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3075:6: RULE_RANGLE
                    {
                    match(input,RULE_RANGLE,FOLLOW_RULE_RANGLE_in_ruleRightCondition5268); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightConditionAccess().getRANGLETerminalRuleCall_0_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3080:6: RULE_MAJOR_OR_EQUAL
                    {
                    match(input,RULE_MAJOR_OR_EQUAL,FOLLOW_RULE_MAJOR_OR_EQUAL_in_ruleRightCondition5282); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightConditionAccess().getMAJOR_OR_EQUALTerminalRuleCall_0_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3085:6: RULE_MINOR_OR_EQUAL
                    {
                    match(input,RULE_MINOR_OR_EQUAL,FOLLOW_RULE_MINOR_OR_EQUAL_in_ruleRightCondition5296); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightConditionAccess().getMINOR_OR_EQUALTerminalRuleCall_0_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3090:6: RULE_NOT_EQUAL
                    {
                    match(input,RULE_NOT_EQUAL,FOLLOW_RULE_NOT_EQUAL_in_ruleRightCondition5310); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRightConditionAccess().getNOT_EQUALTerminalRuleCall_0_5(), null); 
                          
                    }

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3094:2: ( (lv_expression_6_0= ruleExpression ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3095:1: (lv_expression_6_0= ruleExpression )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3095:1: (lv_expression_6_0= ruleExpression )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3096:3: lv_expression_6_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRightConditionAccess().getExpressionExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRightCondition5331);
            lv_expression_6_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRightConditionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_6_0, 
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleRightCondition


    // $ANTLR start entryRuleForeach
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3126:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3127:2: (iv_ruleForeach= ruleForeach EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3128:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getForeachRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach5367);
            iv_ruleForeach=ruleForeach();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleForeach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach5377); if (failed) return current;

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
    // $ANTLR end entryRuleForeach


    // $ANTLR start ruleForeach
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3135:1: ruleForeach returns [EObject current=null] : ( () 'foreach' RULE_LPAREN ( (lv_var1_3_0= ruleVariablePath ) ) RULE_COLON ( (lv_var2_5_0= ruleVariablePath ) ) ( (lv_body_6_0= ruleBody ) ) ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        EObject lv_var1_3_0 = null;

        EObject lv_var2_5_0 = null;

        EObject lv_body_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3140:6: ( ( () 'foreach' RULE_LPAREN ( (lv_var1_3_0= ruleVariablePath ) ) RULE_COLON ( (lv_var2_5_0= ruleVariablePath ) ) ( (lv_body_6_0= ruleBody ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3141:1: ( () 'foreach' RULE_LPAREN ( (lv_var1_3_0= ruleVariablePath ) ) RULE_COLON ( (lv_var2_5_0= ruleVariablePath ) ) ( (lv_body_6_0= ruleBody ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3141:1: ( () 'foreach' RULE_LPAREN ( (lv_var1_3_0= ruleVariablePath ) ) RULE_COLON ( (lv_var2_5_0= ruleVariablePath ) ) ( (lv_body_6_0= ruleBody ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3141:2: () 'foreach' RULE_LPAREN ( (lv_var1_3_0= ruleVariablePath ) ) RULE_COLON ( (lv_var2_5_0= ruleVariablePath ) ) ( (lv_body_6_0= ruleBody ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3141:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3142:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getForeachAccess().getForeachAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getForeachAccess().getForeachAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,62,FOLLOW_62_in_ruleForeach5424); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getForeachAccess().getForeachKeyword_1(), null); 
                  
            }
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleForeach5433); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getForeachAccess().getLPARENTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3163:1: ( (lv_var1_3_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3164:1: (lv_var1_3_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3164:1: (lv_var1_3_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3165:3: lv_var1_3_0= ruleVariablePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForeachAccess().getVar1VariablePathParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariablePath_in_ruleForeach5453);
            lv_var1_3_0=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForeachRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"var1",
              	        		lv_var1_3_0, 
              	        		"VariablePath", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleForeach5462); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getForeachAccess().getCOLONTerminalRuleCall_4(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3191:1: ( (lv_var2_5_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3192:1: (lv_var2_5_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3192:1: (lv_var2_5_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3193:3: lv_var2_5_0= ruleVariablePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForeachAccess().getVar2VariablePathParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariablePath_in_ruleForeach5482);
            lv_var2_5_0=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForeachRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"var2",
              	        		lv_var2_5_0, 
              	        		"VariablePath", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3215:2: ( (lv_body_6_0= ruleBody ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3216:1: (lv_body_6_0= ruleBody )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3216:1: (lv_body_6_0= ruleBody )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3217:3: lv_body_6_0= ruleBody
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getForeachAccess().getBodyBodyParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBody_in_ruleForeach5503);
            lv_body_6_0=ruleBody();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getForeachRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"body",
              	        		lv_body_6_0, 
              	        		"Body", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleForeach


    // $ANTLR start entryRuleExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3247:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3248:2: (iv_ruleExpression= ruleExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3249:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5539);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5549); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3256:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3261:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3262:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3262:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3263:2: this_TerminalExpression_0= ruleTerminalExpression ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression5599);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3274:1: ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ASTERISK||(LA30_0>=RULE_PLUS && LA30_0<=RULE_DIVIDE)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3274:2: () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3274:2: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3275:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
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

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3293:2: ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3294:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3294:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3295:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3295:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )
                    int alt29=4;
                    switch ( input.LA(1) ) {
                    case RULE_PLUS:
                        {
                        alt29=1;
                        }
                        break;
                    case RULE_MINUS:
                        {
                        alt29=2;
                        }
                        break;
                    case RULE_ASTERISK:
                        {
                        alt29=3;
                        }
                        break;
                    case RULE_DIVIDE:
                        {
                        alt29=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3295:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS | lv_op_2_3= RULE_ASTERISK | lv_op_2_4= RULE_DIVIDE )", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3296:3: lv_op_2_1= RULE_PLUS
                            {
                            lv_op_2_1=(Token)input.LT(1);
                            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleExpression5630); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0(), "op"); 
                              		
                            }
                            if ( backtracking==0 ) {

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

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3317:8: lv_op_2_2= RULE_MINUS
                            {
                            lv_op_2_2=(Token)input.LT(1);
                            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleExpression5650); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1(), "op"); 
                              		
                            }
                            if ( backtracking==0 ) {

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

                            }
                            break;
                        case 3 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3338:8: lv_op_2_3= RULE_ASTERISK
                            {
                            lv_op_2_3=(Token)input.LT(1);
                            match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_ruleExpression5670); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2(), "op"); 
                              		
                            }
                            if ( backtracking==0 ) {

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

                            }
                            break;
                        case 4 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3359:8: lv_op_2_4= RULE_DIVIDE
                            {
                            lv_op_2_4=(Token)input.LT(1);
                            match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleExpression5690); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3(), "op"); 
                              		
                            }
                            if ( backtracking==0 ) {

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

                            }
                            break;

                    }


                    }


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3383:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3384:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3384:1: (lv_right_3_0= ruleExpression )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3385:3: lv_right_3_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression5719);
                    lv_right_3_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpression
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3415:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3416:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3417:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression5757);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression5767); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3424:1: ruleTerminalExpression returns [EObject current=null] : ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_5_0=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        EObject this_Expression_1 = null;

        EObject lv_variablePath_13_0 = null;

        EObject lv_variablePath_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3429:6: ( ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3430:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3430:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case RULE_LPAREN:
                {
                alt35=1;
                }
                break;
            case RULE_MINUS:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==RULE_REAL) ) {
                    alt35=3;
                }
                else if ( (LA35_2==RULE_INT) ) {
                    alt35=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3430:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt35=2;
                }
                break;
            case RULE_REAL:
                {
                alt35=3;
                }
                break;
            case RULE_STRING:
                {
                alt35=4;
                }
                break;
            case RULE_CHOICE:
            case RULE_DECREMENT:
                {
                alt35=5;
                }
                break;
            case RULE_ID:
            case RULE_DOT:
            case 63:
                {
                alt35=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3430:1: ( ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN ) | ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) ) | ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? ) )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3430:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3430:2: ( RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3430:3: RULE_LPAREN this_Expression_1= ruleExpression RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleTerminalExpression5802); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5826);
                    this_Expression_1=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleTerminalExpression5834); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3451:6: ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3451:6: ( () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3451:7: () ( RULE_MINUS )? ( (lv_value_5_0= RULE_INT ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3451:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3452:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3465:2: ( RULE_MINUS )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_MINUS) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3465:3: RULE_MINUS
                            {
                            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleTerminalExpression5863); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getTerminalExpressionAccess().getMINUSTerminalRuleCall_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3469:3: ( (lv_value_5_0= RULE_INT ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3470:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3470:1: (lv_value_5_0= RULE_INT )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3471:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5881); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_2_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_5_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3494:6: ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3494:6: ( () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3494:7: () ( RULE_MINUS )? ( (lv_value_8_0= RULE_REAL ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3494:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3495:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3508:2: ( RULE_MINUS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_MINUS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3508:3: RULE_MINUS
                            {
                            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleTerminalExpression5916); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getTerminalExpressionAccess().getMINUSTerminalRuleCall_2_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3512:3: ( (lv_value_8_0= RULE_REAL ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3513:1: (lv_value_8_0= RULE_REAL )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3513:1: (lv_value_8_0= RULE_REAL )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3514:3: lv_value_8_0= RULE_REAL
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTerminalExpression5934); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_2_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_8_0, 
                      	        		"REAL", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3537:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3537:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3537:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3537:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3538:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3551:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3552:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3552:1: (lv_value_10_0= RULE_STRING )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3553:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression5976); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

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


                    }
                    break;
                case 5 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3576:6: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3576:6: ( ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3576:7: ( RULE_CHOICE | RULE_DECREMENT ) ( (lv_variablePath_13_0= ruleVariablePath ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3576:7: ( RULE_CHOICE | RULE_DECREMENT )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_CHOICE) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==RULE_DECREMENT) ) {
                        alt33=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3576:7: ( RULE_CHOICE | RULE_DECREMENT )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3576:8: RULE_CHOICE
                            {
                            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_ruleTerminalExpression5999); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getTerminalExpressionAccess().getCHOICETerminalRuleCall_4_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3581:6: RULE_DECREMENT
                            {
                            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression6013); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getTerminalExpressionAccess().getDECREMENTTerminalRuleCall_4_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3585:2: ( (lv_variablePath_13_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3586:1: (lv_variablePath_13_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3586:1: (lv_variablePath_13_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3587:3: lv_variablePath_13_0= ruleVariablePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleTerminalExpression6034);
                    lv_variablePath_13_0=ruleVariablePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"variablePath",
                      	        		lv_variablePath_13_0, 
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


                    }
                    break;
                case 6 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3610:6: ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3610:6: ( ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )? )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3610:7: ( (lv_variablePath_14_0= ruleVariablePath ) ) ( RULE_CHOICE | RULE_DECREMENT )?
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3610:7: ( (lv_variablePath_14_0= ruleVariablePath ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3611:1: (lv_variablePath_14_0= ruleVariablePath )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3611:1: (lv_variablePath_14_0= ruleVariablePath )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3612:3: lv_variablePath_14_0= ruleVariablePath
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_5_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablePath_in_ruleTerminalExpression6063);
                    lv_variablePath_14_0=ruleVariablePath();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
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


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3634:2: ( RULE_CHOICE | RULE_DECREMENT )?
                    int alt34=3;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_CHOICE) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_DECREMENT) ) {
                        alt34=2;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3634:3: RULE_CHOICE
                            {
                            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_ruleTerminalExpression6073); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getTerminalExpressionAccess().getCHOICETerminalRuleCall_5_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3639:6: RULE_DECREMENT
                            {
                            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression6087); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getTerminalExpressionAccess().getDECREMENTTerminalRuleCall_5_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3651:1: entryRuleVariablePath returns [EObject current=null] : iv_ruleVariablePath= ruleVariablePath EOF ;
    public final EObject entryRuleVariablePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablePath = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3652:2: (iv_ruleVariablePath= ruleVariablePath EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3653:2: iv_ruleVariablePath= ruleVariablePath EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariablePathRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath6125);
            iv_ruleVariablePath=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariablePath; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath6135); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3660:1: ruleVariablePath returns [EObject current=null] : ( ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) ) ;
    public final EObject ruleVariablePath() throws RecognitionException {
        EObject current = null;

        Token lv_dot_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_children_4_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_14_0 = null;

        EObject lv_children_22_0 = null;

        EObject lv_children_26_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3665:6: ( ( ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3666:1: ( ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3666:1: ( ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==RULE_DOT) ) {
                alt44=1;
            }
            else if ( (LA44_0==63) ) {
                alt44=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3666:1: ( ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* ) | ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* ) )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3666:2: ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3666:2: ( () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3666:3: () ( (lv_dot_1_0= RULE_DOT ) )? ( (lv_name_2_0= RULE_ID ) ) ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )? ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )*
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3666:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3667:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getVariablePathAccess().getVariablePathAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getVariablePathAccess().getVariablePathAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3680:2: ( (lv_dot_1_0= RULE_DOT ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_DOT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3681:1: (lv_dot_1_0= RULE_DOT )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3681:1: (lv_dot_1_0= RULE_DOT )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3682:3: lv_dot_1_0= RULE_DOT
                            {
                            lv_dot_1_0=(Token)input.LT(1);
                            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath6190); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getVariablePathAccess().getDotDOTTerminalRuleCall_0_1_0(), "dot"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getVariablePathRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"dot",
                              	        		lv_dot_1_0, 
                              	        		"DOT", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3704:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3705:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3705:1: (lv_name_2_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3706:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath6213); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariablePathAccess().getNameIDTerminalRuleCall_0_2_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

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


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3728:2: ( RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_LSQUARE) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3728:3: RULE_LSQUARE ( (lv_children_4_0= ruleExpression ) ) RULE_RSQUARE
                            {
                            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath6228); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_0_3_0(), null); 
                                  
                            }
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3732:1: ( (lv_children_4_0= ruleExpression ) )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3733:1: (lv_children_4_0= ruleExpression )
                            {
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3733:1: (lv_children_4_0= ruleExpression )
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3734:3: lv_children_4_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_0_3_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath6248);
                            lv_children_4_0=ruleExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

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


                            }

                            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath6257); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_0_3_2(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3760:3: ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_DOT) ) {
                            int LA40_2 = input.LA(2);

                            if ( (LA40_2==RULE_LPAREN) ) {
                                alt40=2;
                            }
                            else if ( (LA40_2==RULE_ID||LA40_2==63) ) {
                                alt40=1;
                            }


                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3760:4: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3760:4: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3760:5: RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath6269); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_0_4_0_0(), null); 
                    	          
                    	    }
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3764:1: ( RULE_ID | 'global' )
                    	    int alt38=2;
                    	    int LA38_0 = input.LA(1);

                    	    if ( (LA38_0==RULE_ID) ) {
                    	        alt38=1;
                    	    }
                    	    else if ( (LA38_0==63) ) {
                    	        alt38=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("3764:1: ( RULE_ID | 'global' )", 38, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt38) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3764:2: RULE_ID
                    	            {
                    	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath6278); if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                  createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_0_4_0_1_0(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3769:7: 'global'
                    	            {
                    	            match(input,63,FOLLOW_63_in_ruleVariablePath6293); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getVariablePathAccess().getGlobalKeyword_0_4_0_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3773:2: ( RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==RULE_LSQUARE) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3773:3: RULE_LSQUARE ( (lv_children_10_0= ruleExpression ) ) RULE_RSQUARE
                    	            {
                    	            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath6304); if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                  createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_0_4_0_2_0(), null); 
                    	                  
                    	            }
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3777:1: ( (lv_children_10_0= ruleExpression ) )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3778:1: (lv_children_10_0= ruleExpression )
                    	            {
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3778:1: (lv_children_10_0= ruleExpression )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3779:3: lv_children_10_0= ruleExpression
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_0_4_0_2_1_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath6324);
                    	            lv_children_10_0=ruleExpression();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

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


                    	            }

                    	            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath6333); if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                  createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_0_4_0_2_2(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3806:6: ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3806:6: ( RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3806:7: RULE_DOT RULE_LPAREN ( (lv_children_14_0= ruleExpression ) ) RULE_RPAREN
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath6351); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_0_4_1_0(), null); 
                    	          
                    	    }
                    	    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleVariablePath6359); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_0_4_1_1(), null); 
                    	          
                    	    }
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3814:1: ( (lv_children_14_0= ruleExpression ) )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3815:1: (lv_children_14_0= ruleExpression )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3815:1: (lv_children_14_0= ruleExpression )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3816:3: lv_children_14_0= ruleExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_0_4_1_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath6379);
                    	    lv_children_14_0=ruleExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

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


                    	    }

                    	    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleVariablePath6388); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_0_4_1_3(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3843:6: ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3843:6: ( () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )* )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3843:7: () 'global' ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )*
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3843:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3844:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getVariablePathAccess().getVariablePathAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getVariablePathAccess().getVariablePathAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,63,FOLLOW_63_in_ruleVariablePath6420); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariablePathAccess().getGlobalKeyword_1_1(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3861:1: ( ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? ) | ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN ) )*
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_DOT) ) {
                            int LA43_2 = input.LA(2);

                            if ( (LA43_2==RULE_LPAREN) ) {
                                alt43=2;
                            }
                            else if ( (LA43_2==RULE_ID||LA43_2==63) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3861:2: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3861:2: ( RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )? )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3861:3: RULE_DOT ( RULE_ID | 'global' ) ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath6431); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_0_0(), null); 
                    	          
                    	    }
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3865:1: ( RULE_ID | 'global' )
                    	    int alt41=2;
                    	    int LA41_0 = input.LA(1);

                    	    if ( (LA41_0==RULE_ID) ) {
                    	        alt41=1;
                    	    }
                    	    else if ( (LA41_0==63) ) {
                    	        alt41=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("3865:1: ( RULE_ID | 'global' )", 41, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt41) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3865:2: RULE_ID
                    	            {
                    	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariablePath6440); if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                  createLeafNode(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_2_0_1_0(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3870:7: 'global'
                    	            {
                    	            match(input,63,FOLLOW_63_in_ruleVariablePath6455); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getVariablePathAccess().getGlobalKeyword_1_2_0_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3874:2: ( RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE )?
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==RULE_LSQUARE) ) {
                    	        alt42=1;
                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3874:3: RULE_LSQUARE ( (lv_children_22_0= ruleExpression ) ) RULE_RSQUARE
                    	            {
                    	            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleVariablePath6466); if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                  createLeafNode(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_1_2_0_2_0(), null); 
                    	                  
                    	            }
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3878:1: ( (lv_children_22_0= ruleExpression ) )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3879:1: (lv_children_22_0= ruleExpression )
                    	            {
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3879:1: (lv_children_22_0= ruleExpression )
                    	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3880:3: lv_children_22_0= ruleExpression
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_0_2_1_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath6486);
                    	            lv_children_22_0=ruleExpression();
                    	            _fsp--;
                    	            if (failed) return current;
                    	            if ( backtracking==0 ) {

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


                    	            }

                    	            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleVariablePath6495); if (failed) return current;
                    	            if ( backtracking==0 ) {
                    	               
                    	                  createLeafNode(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_1_2_0_2_2(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3907:6: ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3907:6: ( RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3907:7: RULE_DOT RULE_LPAREN ( (lv_children_26_0= ruleExpression ) ) RULE_RPAREN
                    	    {
                    	    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariablePath6513); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_1_0(), null); 
                    	          
                    	    }
                    	    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleVariablePath6521); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_1_2_1_1(), null); 
                    	          
                    	    }
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3915:1: ( (lv_children_26_0= ruleExpression ) )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3916:1: (lv_children_26_0= ruleExpression )
                    	    {
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3916:1: (lv_children_26_0= ruleExpression )
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3917:3: lv_children_26_0= ruleExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_1_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleVariablePath6541);
                    	    lv_children_26_0=ruleExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

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


                    	    }

                    	    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleVariablePath6550); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_1_2_1_3(), null); 
                    	          
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
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVariablePath


    // $ANTLR start entryRuleWith
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3951:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3952:2: (iv_ruleWith= ruleWith EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3953:2: iv_ruleWith= ruleWith EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWithRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleWith_in_entryRuleWith6589);
            iv_ruleWith=ruleWith();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleWith; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWith6599); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3960:1: ruleWith returns [EObject current=null] : ( () 'with' RULE_LPAREN ( (lv_name_3_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        EObject lv_name_3_0 = null;

        EObject lv_mainrocess_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3965:6: ( ( () 'with' RULE_LPAREN ( (lv_name_3_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3966:1: ( () 'with' RULE_LPAREN ( (lv_name_3_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3966:1: ( () 'with' RULE_LPAREN ( (lv_name_3_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3966:2: () 'with' RULE_LPAREN ( (lv_name_3_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_mainrocess_5_0= ruleMainProcess ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3966:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3967:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getWithAccess().getWithAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getWithAccess().getWithAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,64,FOLLOW_64_in_ruleWith6646); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWithAccess().getWithKeyword_1(), null); 
                  
            }
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleWith6655); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getWithAccess().getLPARENTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3988:1: ( (lv_name_3_0= ruleVariablePath ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3989:1: (lv_name_3_0= ruleVariablePath )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3989:1: (lv_name_3_0= ruleVariablePath )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:3990:3: lv_name_3_0= ruleVariablePath
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWithAccess().getNameVariablePathParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariablePath_in_ruleWith6675);
            lv_name_3_0=ruleVariablePath();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getWithRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"VariablePath", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleWith6684); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getWithAccess().getRPARENTerminalRuleCall_4(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4016:1: ( (lv_mainrocess_5_0= ruleMainProcess ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4017:1: (lv_mainrocess_5_0= ruleMainProcess )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4017:1: (lv_mainrocess_5_0= ruleMainProcess )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4018:3: lv_mainrocess_5_0= ruleMainProcess
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWithAccess().getMainrocessMainProcessParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleMainProcess_in_ruleWith6704);
            lv_mainrocess_5_0=ruleMainProcess();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getWithRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleWith


    // $ANTLR start entryRuleNDChoiceStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4048:1: entryRuleNDChoiceStatement returns [EObject current=null] : iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF ;
    public final EObject entryRuleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNDChoiceStatement = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4049:2: (iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4050:2: iv_ruleNDChoiceStatement= ruleNDChoiceStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNDChoiceStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement6740);
            iv_ruleNDChoiceStatement=ruleNDChoiceStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNDChoiceStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDChoiceStatement6750); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4057:1: ruleNDChoiceStatement returns [EObject current=null] : ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ ) ;
    public final EObject ruleNDChoiceStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variablePath_6_0 = null;

        EObject lv_variablePath_8_0 = null;

        EObject lv_inputOperation_10_0 = null;

        EObject lv_mainProcess_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4062:6: ( ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4063:1: ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4063:1: ( () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4063:2: () ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4063:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4064:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4077:2: ( RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_LSQUARE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4077:3: RULE_LSQUARE ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) ) RULE_RSQUARE ( (lv_mainProcess_12_0= ruleMainProcess ) )
            	    {
            	    match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement6797); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4081:1: ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==55) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==RULE_ID||LA45_0==RULE_DOT||LA45_0==63) ) {
            	        alt45=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("4081:1: ( ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN ) | ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) ) )", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4081:2: ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4081:2: ( 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4081:4: 'linkIn' RULE_LPAREN RULE_ID RULE_RPAREN
            	            {
            	            match(input,55,FOLLOW_55_in_ruleNDChoiceStatement6808); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLinkInKeyword_1_1_0_0(), null); 
            	                  
            	            }
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement6817); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_1_0_1(), null); 
            	                  
            	            }
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNDChoiceStatement6825); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_1_1_0_2(), null); 
            	                  
            	            }
            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement6833); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_1_0_3(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4098:6: ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4098:6: ( ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4098:7: ( (lv_variablePath_6_0= ruleVariablePath ) ) RULE_LPAREN ( (lv_variablePath_8_0= ruleVariablePath ) ) RULE_RPAREN ( (lv_inputOperation_10_0= ruleInputOperation ) )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4098:7: ( (lv_variablePath_6_0= ruleVariablePath ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4099:1: (lv_variablePath_6_0= ruleVariablePath )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4099:1: (lv_variablePath_6_0= ruleVariablePath )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4100:3: lv_variablePath_6_0= ruleVariablePath
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_1_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement6861);
            	            lv_variablePath_6_0=ruleVariablePath();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

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


            	            }

            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement6870); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_1_1_1(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4126:1: ( (lv_variablePath_8_0= ruleVariablePath ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:1: (lv_variablePath_8_0= ruleVariablePath )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:1: (lv_variablePath_8_0= ruleVariablePath )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4128:3: lv_variablePath_8_0= ruleVariablePath
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_1_1_2_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement6890);
            	            lv_variablePath_8_0=ruleVariablePath();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

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


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement6899); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_1_1_3(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4154:1: ( (lv_inputOperation_10_0= ruleInputOperation ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4155:1: (lv_inputOperation_10_0= ruleInputOperation )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4155:1: (lv_inputOperation_10_0= ruleInputOperation )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4156:3: lv_inputOperation_10_0= ruleInputOperation
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getInputOperationInputOperationParserRuleCall_1_1_1_4_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInputOperation_in_ruleNDChoiceStatement6919);
            	            lv_inputOperation_10_0=ruleInputOperation();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getNDChoiceStatementRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"inputOperation",
            	              	        		lv_inputOperation_10_0, 
            	              	        		"InputOperation", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement6930); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_2(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4182:1: ( (lv_mainProcess_12_0= ruleMainProcess ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4183:1: (lv_mainProcess_12_0= ruleMainProcess )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4183:1: (lv_mainProcess_12_0= ruleMainProcess )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4184:3: lv_mainProcess_12_0= ruleMainProcess
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement6950);
            	    lv_mainProcess_12_0=ruleMainProcess();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNDChoiceStatement


    // $ANTLR start entryRuleInterface
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4214:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getInterfaceAccess().getUnorderedGroup_3()
        		);
        	
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4220:2: (iv_ruleInterface= ruleInterface EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4221:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface6994);
            iv_ruleInterface=ruleInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface7004); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleInterface


    // $ANTLR start ruleInterface
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4231:1: ruleInterface returns [EObject current=null] : ( 'interface' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) ) ) RULE_RCURLY ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_RequestResponseOperation_4_0 = null;

        EObject lv_oneWayOperation_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getInterfaceAccess().getUnorderedGroup_3()
        		);
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4239:6: ( ( 'interface' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4240:1: ( 'interface' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4240:1: ( 'interface' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4240:3: 'interface' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) ) ) RULE_RCURLY
            {
            match(input,65,FOLLOW_65_in_ruleInterface7043); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4244:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4245:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4245:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4246:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface7060); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
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

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleInterface7074); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getInterfaceAccess().getLCURLYTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4272:1: ( ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4274:1: ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4274:1: ( ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4275:2: ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getInterfaceAccess().getUnorderedGroup_3());
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4278:2: ( ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4279:3: ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4279:3: ( ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) ) )*
            loop47:
            do {
                int alt47=3;
                int LA47_0 = input.LA(1);

                if ( LA47_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                    alt47=2;
                }


                switch (alt47) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4281:4: ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4281:4: ({...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4282:5: {...}? => ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4282:106: ( ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4283:6: ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4286:6: ( (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4287:1: (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4287:1: (lv_RequestResponseOperation_4_0= ruleRequestResponseOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4288:3: lv_RequestResponseOperation_4_0= ruleRequestResponseOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleInterface7136);
            	    lv_RequestResponseOperation_4_0=ruleRequestResponseOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"RequestResponseOperation",
            	      	        		lv_RequestResponseOperation_4_0, 
            	      	        		"RequestResponseOperation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInterfaceAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4317:4: ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4317:4: ({...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4318:5: {...}? => ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4318:106: ( ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4319:6: ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4322:6: ( (lv_oneWayOperation_5_0= ruleOneWayOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4323:1: (lv_oneWayOperation_5_0= ruleOneWayOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4323:1: (lv_oneWayOperation_5_0= ruleOneWayOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4324:3: lv_oneWayOperation_5_0= ruleOneWayOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getOneWayOperationOneWayOperationParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOneWayOperation_in_ruleInterface7207);
            	    lv_oneWayOperation_5_0=ruleOneWayOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"oneWayOperation",
            	      	        		lv_oneWayOperation_5_0, 
            	      	        		"OneWayOperation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInterfaceAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getInterfaceAccess().getUnorderedGroup_3());

            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleInterface7255); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getInterfaceAccess().getRCURLYTerminalRuleCall_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end ruleInterface


    // $ANTLR start entryRulePort
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4375:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4376:2: (iv_rulePort= rulePort EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4377:2: iv_rulePort= rulePort EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPortRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePort_in_entryRulePort7294);
            iv_rulePort=rulePort();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePort7304); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4384:1: rulePort returns [EObject current=null] : ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject lv_inputPortStatement_0_0 = null;

        EObject lv_outputPortStatement_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4389:6: ( ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4390:1: ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4390:1: ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==66) ) {
                alt48=1;
            }
            else if ( (LA48_0==67) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4390:1: ( ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) ) | ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4390:2: ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4390:2: ( (lv_inputPortStatement_0_0= ruleInputPortStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4391:1: (lv_inputPortStatement_0_0= ruleInputPortStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4391:1: (lv_inputPortStatement_0_0= ruleInputPortStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4392:3: lv_inputPortStatement_0_0= ruleInputPortStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPortAccess().getInputPortStatementInputPortStatementParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputPortStatement_in_rulePort7350);
                    lv_inputPortStatement_0_0=ruleInputPortStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4415:6: ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4415:6: ( (lv_outputPortStatement_1_0= ruleOutputPortStatement ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4416:1: (lv_outputPortStatement_1_0= ruleOutputPortStatement )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4416:1: (lv_outputPortStatement_1_0= ruleOutputPortStatement )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4417:3: lv_outputPortStatement_1_0= ruleOutputPortStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPortAccess().getOutputPortStatementOutputPortStatementParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputPortStatement_in_rulePort7377);
                    lv_outputPortStatement_1_0=ruleOutputPortStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePort


    // $ANTLR start entryRuleInputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4447:1: entryRuleInputPortStatement returns [EObject current=null] : iv_ruleInputPortStatement= ruleInputPortStatement EOF ;
    public final EObject entryRuleInputPortStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPortStatement = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3()
        		);
        	
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4453:2: (iv_ruleInputPortStatement= ruleInputPortStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4454:2: iv_ruleInputPortStatement= ruleInputPortStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputPortStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInputPortStatement_in_entryRuleInputPortStatement7419);
            iv_ruleInputPortStatement=ruleInputPortStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInputPortStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputPortStatement7429); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleInputPortStatement


    // $ANTLR start ruleInputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4464:1: ruleInputPortStatement returns [EObject current=null] : ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) ;
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
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3()
        		);
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4472:6: ( ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4473:1: ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4473:1: ( 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4473:3: 'inputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY
            {
            match(input,66,FOLLOW_66_in_ruleInputPortStatement7468); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputPortStatementAccess().getInputPortKeyword_0(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4477:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4478:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4478:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4479:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputPortStatement7485); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInputPortStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleInputPortStatement7499); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getInputPortStatementAccess().getLCURLYTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4505:1: ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4507:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4507:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4508:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4511:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4512:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4512:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) ) | ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) ) | ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) ) )*
            loop49:
            do {
                int alt49=8;
                int LA49_0 = input.LA(1);

                if ( LA49_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
                    alt49=5;
                }
                else if ( LA49_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5) ) {
                    alt49=6;
                }
                else if ( LA49_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6) ) {
                    alt49=7;
                }


                switch (alt49) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4514:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4514:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4515:5: {...}? => ( ( (lv_location_4_0= ruleLocation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4515:115: ( ( (lv_location_4_0= ruleLocation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4516:6: ( (lv_location_4_0= ruleLocation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4519:6: ( (lv_location_4_0= ruleLocation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4520:1: (lv_location_4_0= ruleLocation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4520:1: (lv_location_4_0= ruleLocation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4521:3: lv_location_4_0= ruleLocation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getLocationLocationParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocation_in_ruleInputPortStatement7561);
            	    lv_location_4_0=ruleLocation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4550:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4550:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4551:5: {...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4551:115: ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4552:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4555:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4556:1: (lv_protocol_5_0= ruleProtocol )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4556:1: (lv_protocol_5_0= ruleProtocol )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4557:3: lv_protocol_5_0= ruleProtocol
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getProtocolProtocolParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProtocol_in_ruleInputPortStatement7632);
            	    lv_protocol_5_0=ruleProtocol();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4586:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4586:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4587:5: {...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4587:115: ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4588:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4591:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4592:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4592:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4593:3: lv_oneWayOperation_6_0= ruleOneWayOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getOneWayOperationOneWayOperationParserRuleCall_3_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOneWayOperation_in_ruleInputPortStatement7703);
            	    lv_oneWayOperation_6_0=ruleOneWayOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4622:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4622:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4623:5: {...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4623:115: ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4624:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4627:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4628:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4628:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4629:3: lv_RequestResponseOperation_7_0= ruleRequestResponseOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleInputPortStatement7774);
            	    lv_RequestResponseOperation_7_0=ruleRequestResponseOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4658:4: ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4658:4: ({...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4659:5: {...}? => ( ( (lv_redirects_8_0= ruleRedirects ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4659:115: ( ( (lv_redirects_8_0= ruleRedirects ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4660:6: ( (lv_redirects_8_0= ruleRedirects ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4663:6: ( (lv_redirects_8_0= ruleRedirects ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4664:1: (lv_redirects_8_0= ruleRedirects )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4664:1: (lv_redirects_8_0= ruleRedirects )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4665:3: lv_redirects_8_0= ruleRedirects
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getRedirectsRedirectsParserRuleCall_3_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRedirects_in_ruleInputPortStatement7845);
            	    lv_redirects_8_0=ruleRedirects();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4694:4: ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4694:4: ({...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4695:5: {...}? => ( ( (lv_aggregates_9_0= ruleAggregates ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4695:115: ( ( (lv_aggregates_9_0= ruleAggregates ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4696:6: ( (lv_aggregates_9_0= ruleAggregates ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4699:6: ( (lv_aggregates_9_0= ruleAggregates ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4700:1: (lv_aggregates_9_0= ruleAggregates )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4700:1: (lv_aggregates_9_0= ruleAggregates )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4701:3: lv_aggregates_9_0= ruleAggregates
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getAggregatesAggregatesParserRuleCall_3_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAggregates_in_ruleInputPortStatement7916);
            	    lv_aggregates_9_0=ruleAggregates();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4730:4: ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4730:4: ({...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4731:5: {...}? => ( ( (lv_intefaces_10_0= ruleInterfaces ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleInputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4731:115: ( ( (lv_intefaces_10_0= ruleInterfaces ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4732:6: ( (lv_intefaces_10_0= ruleInterfaces ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4735:6: ( (lv_intefaces_10_0= ruleInterfaces ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4736:1: (lv_intefaces_10_0= ruleInterfaces )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4736:1: (lv_intefaces_10_0= ruleInterfaces )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4737:3: lv_intefaces_10_0= ruleInterfaces
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getIntefacesInterfacesParserRuleCall_3_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaces_in_ruleInputPortStatement7987);
            	    lv_intefaces_10_0=ruleInterfaces();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3());

            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleInputPortStatement8035); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getInputPortStatementAccess().getRCURLYTerminalRuleCall_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end ruleInputPortStatement


    // $ANTLR start entryRuleOutputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4788:1: entryRuleOutputPortStatement returns [EObject current=null] : iv_ruleOutputPortStatement= ruleOutputPortStatement EOF ;
    public final EObject entryRuleOutputPortStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPortStatement = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3()
        		);
        	
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4794:2: (iv_ruleOutputPortStatement= ruleOutputPortStatement EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4795:2: iv_ruleOutputPortStatement= ruleOutputPortStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputPortStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputPortStatement_in_entryRuleOutputPortStatement8080);
            iv_ruleOutputPortStatement=ruleOutputPortStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputPortStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputPortStatement8090); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleOutputPortStatement


    // $ANTLR start ruleOutputPortStatement
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4805:1: ruleOutputPortStatement returns [EObject current=null] : ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) ;
    public final EObject ruleOutputPortStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_location_4_0 = null;

        EObject lv_protocol_5_0 = null;

        EObject lv_oneWayOperation_6_0 = null;

        EObject lv_RequestResponseOperation_7_0 = null;

        EObject lv_intefaces_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3()
        		);
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4813:6: ( ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4814:1: ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4814:1: ( 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4814:3: 'outputPort' ( (lv_name_1_0= RULE_ID ) ) RULE_LCURLY ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) ) RULE_RCURLY
            {
            match(input,67,FOLLOW_67_in_ruleOutputPortStatement8129); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputPortStatementAccess().getOutputPortKeyword_0(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4818:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4819:1: (lv_name_1_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4819:1: (lv_name_1_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4820:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputPortStatement8146); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOutputPortStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleOutputPortStatement8160); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getOutputPortStatementAccess().getLCURLYTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4846:1: ( ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4848:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4848:1: ( ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4849:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4852:2: ( ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4853:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4853:3: ( ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) ) | ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) ) | ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) ) | ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) ) | ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) ) )*
            loop50:
            do {
                int alt50=6;
                int LA50_0 = input.LA(1);

                if ( LA50_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
                    alt50=2;
                }
                else if ( LA50_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
                    alt50=3;
                }
                else if ( LA50_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
                    alt50=4;
                }
                else if ( LA50_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
                    alt50=5;
                }


                switch (alt50) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4855:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4855:4: ({...}? => ( ( (lv_location_4_0= ruleLocation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4856:5: {...}? => ( ( (lv_location_4_0= ruleLocation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4856:116: ( ( (lv_location_4_0= ruleLocation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4857:6: ( (lv_location_4_0= ruleLocation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4860:6: ( (lv_location_4_0= ruleLocation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4861:1: (lv_location_4_0= ruleLocation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4861:1: (lv_location_4_0= ruleLocation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4862:3: lv_location_4_0= ruleLocation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getLocationLocationParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocation_in_ruleOutputPortStatement8222);
            	    lv_location_4_0=ruleLocation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4891:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4891:4: ({...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4892:5: {...}? => ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4892:116: ( ( (lv_protocol_5_0= ruleProtocol ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4893:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4896:6: ( (lv_protocol_5_0= ruleProtocol ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4897:1: (lv_protocol_5_0= ruleProtocol )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4897:1: (lv_protocol_5_0= ruleProtocol )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4898:3: lv_protocol_5_0= ruleProtocol
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getProtocolProtocolParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProtocol_in_ruleOutputPortStatement8293);
            	    lv_protocol_5_0=ruleProtocol();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4927:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4927:4: ({...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4928:5: {...}? => ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4928:116: ( ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4929:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4932:6: ( (lv_oneWayOperation_6_0= ruleOneWayOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4933:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4933:1: (lv_oneWayOperation_6_0= ruleOneWayOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4934:3: lv_oneWayOperation_6_0= ruleOneWayOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getOneWayOperationOneWayOperationParserRuleCall_3_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOneWayOperation_in_ruleOutputPortStatement8364);
            	    lv_oneWayOperation_6_0=ruleOneWayOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4963:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4963:4: ({...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4964:5: {...}? => ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4964:116: ( ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4965:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4968:6: ( (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4969:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4969:1: (lv_RequestResponseOperation_7_0= ruleRequestResponseOperation )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4970:3: lv_RequestResponseOperation_7_0= ruleRequestResponseOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRequestResponseOperation_in_ruleOutputPortStatement8435);
            	    lv_RequestResponseOperation_7_0=ruleRequestResponseOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4999:4: ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4999:4: ({...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5000:5: {...}? => ( ( (lv_intefaces_8_0= ruleInterfaces ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOutputPortStatement", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5000:116: ( ( (lv_intefaces_8_0= ruleInterfaces ) ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5001:6: ( (lv_intefaces_8_0= ruleInterfaces ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4);
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5004:6: ( (lv_intefaces_8_0= ruleInterfaces ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5005:1: (lv_intefaces_8_0= ruleInterfaces )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5005:1: (lv_intefaces_8_0= ruleInterfaces )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5006:3: lv_intefaces_8_0= ruleInterfaces
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getIntefacesInterfacesParserRuleCall_3_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaces_in_ruleOutputPortStatement8506);
            	    lv_intefaces_8_0=ruleInterfaces();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3());

            }

            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleOutputPortStatement8554); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getOutputPortStatementAccess().getRCURLYTerminalRuleCall_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end ruleOutputPortStatement


    // $ANTLR start entryRuleOneWayOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5057:1: entryRuleOneWayOperation returns [EObject current=null] : iv_ruleOneWayOperation= ruleOneWayOperation EOF ;
    public final EObject entryRuleOneWayOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneWayOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5058:2: (iv_ruleOneWayOperation= ruleOneWayOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5059:2: iv_ruleOneWayOperation= ruleOneWayOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOneWayOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation8593);
            iv_ruleOneWayOperation=ruleOneWayOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOneWayOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayOperation8603); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5066:1: ruleOneWayOperation returns [EObject current=null] : ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* ) ;
    public final EObject ruleOneWayOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_children_8_0=null;
        EObject lv_typeDefinition_5_0 = null;

        EObject lv_typeDefinition_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5071:6: ( ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5072:1: ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5072:1: ( () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5072:2: () 'OneWay' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )? ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5072:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5073:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getOneWayOperationAccess().getOneWayOperationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getOneWayOperationAccess().getOneWayOperationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,68,FOLLOW_68_in_ruleOneWayOperation8650); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOneWayOperationAccess().getOneWayKeyword_1(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOneWayOperation8659); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getOneWayOperationAccess().getCOLONTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5094:1: ( (lv_name_3_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5095:1: (lv_name_3_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5095:1: (lv_name_3_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5096:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneWayOperation8675); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOneWayOperationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOneWayOperationRule().getType().getClassifier());
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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5118:2: ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_LPAREN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5118:3: RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOneWayOperation8690); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getOneWayOperationAccess().getLPARENTerminalRuleCall_4_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5122:1: ( (lv_typeDefinition_5_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5123:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5123:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5124:3: lv_typeDefinition_5_0= ruleTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOneWayOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation8710);
                    lv_typeDefinition_5_0=ruleTypeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOneWayOperation8719); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getOneWayOperationAccess().getRPARENTerminalRuleCall_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5150:3: ( RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5150:4: RULE_COMMA ( (lv_children_8_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )?
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOneWayOperation8730); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getOneWayOperationAccess().getCOMMATerminalRuleCall_5_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5154:1: ( (lv_children_8_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5155:1: (lv_children_8_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5155:1: (lv_children_8_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5156:3: lv_children_8_0= RULE_ID
            	    {
            	    lv_children_8_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneWayOperation8746); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getOneWayOperationAccess().getChildrenIDTerminalRuleCall_5_1_0(), "children"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

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


            	    }

            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5178:2: ( RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==RULE_LPAREN) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5178:3: RULE_LPAREN ( (lv_typeDefinition_10_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOneWayOperation8761); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getOneWayOperationAccess().getLPARENTerminalRuleCall_5_2_0(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5182:1: ( (lv_typeDefinition_10_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5183:1: (lv_typeDefinition_10_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5183:1: (lv_typeDefinition_10_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5184:3: lv_typeDefinition_10_0= ruleTypeDefinition
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getOneWayOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_5_2_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation8781);
            	            lv_typeDefinition_10_0=ruleTypeDefinition();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

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


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOneWayOperation8790); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getOneWayOperationAccess().getRPARENTerminalRuleCall_5_2_2(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOneWayOperation


    // $ANTLR start entryRuleRequestResponseOperation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5218:1: entryRuleRequestResponseOperation returns [EObject current=null] : iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF ;
    public final EObject entryRuleRequestResponseOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestResponseOperation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5219:2: (iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5220:2: iv_ruleRequestResponseOperation= ruleRequestResponseOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRequestResponseOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation8829);
            iv_ruleRequestResponseOperation=ruleRequestResponseOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRequestResponseOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation8839); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5227:1: ruleRequestResponseOperation returns [EObject current=null] : ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* ) ;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5232:6: ( ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5233:1: ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5233:1: ( () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5233:2: () 'RequestResponse' RULE_COLON ( (lv_name_3_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5233:2: ()
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5234:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getRequestResponseOperationAccess().getRequestResponseOperationAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getRequestResponseOperationAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,69,FOLLOW_69_in_ruleRequestResponseOperation8886); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRequestResponseKeyword_1(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleRequestResponseOperation8895); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getCOLONTerminalRuleCall_2(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5255:1: ( (lv_name_3_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5256:1: (lv_name_3_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5256:1: (lv_name_3_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5257:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation8911); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5279:2: ( ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_LPAREN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5279:3: ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5279:3: ( RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5279:4: RULE_LPAREN ( (lv_typeDefinition_5_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation8927); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_4_0_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5283:1: ( (lv_typeDefinition_5_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5284:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5284:1: (lv_typeDefinition_5_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5285:3: lv_typeDefinition_5_0= ruleTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_4_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation8947);
                    lv_typeDefinition_5_0=ruleTypeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation8956); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_4_0_2(), null); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5311:2: ( RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5311:3: RULE_LPAREN ( (lv_typeDefinition_8_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation8966); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_4_1_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5315:1: ( (lv_typeDefinition_8_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5316:1: (lv_typeDefinition_8_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5316:1: (lv_typeDefinition_8_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5317:3: lv_typeDefinition_8_0= ruleTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_4_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation8986);
                    lv_typeDefinition_8_0=ruleTypeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation8995); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_4_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5343:4: ( 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==70) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5343:6: 'throws' ( (lv_name_11_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    {
                    match(input,70,FOLLOW_70_in_ruleRequestResponseOperation9008); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRequestResponseOperationAccess().getThrowsKeyword_5_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5347:1: ( (lv_name_11_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5348:1: (lv_name_11_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5348:1: (lv_name_11_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5349:3: lv_name_11_0= RULE_ID
                    {
                    lv_name_11_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation9025); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_5_1_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

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


                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5371:2: ( RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5371:3: RULE_LPAREN ( (lv_typeDefinition_13_0= ruleTypeDefinition ) ) RULE_RPAREN
                    {
                    match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9040); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_5_2_0(), null); 
                          
                    }
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5375:1: ( (lv_typeDefinition_13_0= ruleTypeDefinition ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5376:1: (lv_typeDefinition_13_0= ruleTypeDefinition )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5376:1: (lv_typeDefinition_13_0= ruleTypeDefinition )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5377:3: lv_typeDefinition_13_0= ruleTypeDefinition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_5_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9060);
                    lv_typeDefinition_13_0=ruleTypeDefinition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

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


                    }

                    match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9069); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_5_2_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5403:4: ( RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5403:5: RULE_COMMA ( (lv_name_16_0= RULE_ID ) ) ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )? ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRequestResponseOperation9081); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getRequestResponseOperationAccess().getCOMMATerminalRuleCall_6_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5407:1: ( (lv_name_16_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5408:1: (lv_name_16_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5408:1: (lv_name_16_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5409:3: lv_name_16_0= RULE_ID
            	    {
            	    lv_name_16_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation9097); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_6_1_0(), "name"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

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


            	    }

            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5431:2: ( ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==RULE_LPAREN) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5431:3: ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN ) ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5431:3: ( RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5431:4: RULE_LPAREN ( (lv_typeDefinition_18_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9113); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_6_2_0_0(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5435:1: ( (lv_typeDefinition_18_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5436:1: (lv_typeDefinition_18_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5436:1: (lv_typeDefinition_18_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5437:3: lv_typeDefinition_18_0= ruleTypeDefinition
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_6_2_0_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9133);
            	            lv_typeDefinition_18_0=ruleTypeDefinition();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

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


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9142); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_6_2_0_2(), null); 
            	                  
            	            }

            	            }

            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5463:2: ( RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5463:3: RULE_LPAREN ( (lv_typeDefinition_21_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9152); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_6_2_1_0(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5467:1: ( (lv_typeDefinition_21_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5468:1: (lv_typeDefinition_21_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5468:1: (lv_typeDefinition_21_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5469:3: lv_typeDefinition_21_0= ruleTypeDefinition
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_6_2_1_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9172);
            	            lv_typeDefinition_21_0=ruleTypeDefinition();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

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


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9181); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_6_2_1_2(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5495:4: ( 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN ) )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==70) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5495:6: 'throws' ( (lv_name_24_0= RULE_ID ) ) ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            {
            	            match(input,70,FOLLOW_70_in_ruleRequestResponseOperation9194); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRequestResponseOperationAccess().getThrowsKeyword_6_3_0(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5499:1: ( (lv_name_24_0= RULE_ID ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5500:1: (lv_name_24_0= RULE_ID )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5500:1: (lv_name_24_0= RULE_ID )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5501:3: lv_name_24_0= RULE_ID
            	            {
            	            lv_name_24_0=(Token)input.LT(1);
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestResponseOperation9211); if (failed) return current;
            	            if ( backtracking==0 ) {

            	              			createLeafNode(grammarAccess.getRequestResponseOperationAccess().getNameIDTerminalRuleCall_6_3_1_0(), "name"); 
            	              		
            	            }
            	            if ( backtracking==0 ) {

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


            	            }

            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5523:2: ( RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5523:3: RULE_LPAREN ( (lv_typeDefinition_26_0= ruleTypeDefinition ) ) RULE_RPAREN
            	            {
            	            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9226); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_6_3_2_0(), null); 
            	                  
            	            }
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5527:1: ( (lv_typeDefinition_26_0= ruleTypeDefinition ) )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5528:1: (lv_typeDefinition_26_0= ruleTypeDefinition )
            	            {
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5528:1: (lv_typeDefinition_26_0= ruleTypeDefinition )
            	            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5529:3: lv_typeDefinition_26_0= ruleTypeDefinition
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getRequestResponseOperationAccess().getTypeDefinitionTypeDefinitionParserRuleCall_6_3_2_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9246);
            	            lv_typeDefinition_26_0=ruleTypeDefinition();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

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


            	            }

            	            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9255); if (failed) return current;
            	            if ( backtracking==0 ) {
            	               
            	                  createLeafNode(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_6_3_2_2(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleRequestResponseOperation


    // $ANTLR start entryRuleTypeDefinition
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5563:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5564:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5565:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition9295);
            iv_ruleTypeDefinition=ruleTypeDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition9305); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5572:1: ruleTypeDefinition returns [EObject current=null] : ( ( ( RULE_ID ) ) | ( () ruleNative_type ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5577:6: ( ( ( ( RULE_ID ) ) | ( () ruleNative_type ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5578:1: ( ( ( RULE_ID ) ) | ( () ruleNative_type ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5578:1: ( ( ( RULE_ID ) ) | ( () ruleNative_type ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==EOF||LA59_0==RULE_RPAREN||(LA59_0>=46 && LA59_0<=50)) ) {
                alt59=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5578:1: ( ( ( RULE_ID ) ) | ( () ruleNative_type ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5578:2: ( ( RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5578:2: ( ( RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5579:1: ( RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5579:1: ( RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5580:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDefinition9352); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypeDefinitionAccess().getTypeTypeCrossReference_0_0(), "type"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5596:6: ( () ruleNative_type )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5596:6: ( () ruleNative_type )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5596:7: () ruleNative_type
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5596:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5597:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTypeDefinitionAccess().getTypeDefinitionAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypeDefinitionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeDefinitionAccess().getNative_typeParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNative_type_in_ruleTypeDefinition9390);
                    ruleNative_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeDefinition


    // $ANTLR start entryRuleLocation
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5629:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5630:2: (iv_ruleLocation= ruleLocation EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5631:2: iv_ruleLocation= ruleLocation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLocationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation9426);
            iv_ruleLocation=ruleLocation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLocation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation9436); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5638:1: ruleLocation returns [EObject current=null] : ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        EObject lv_uri_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5643:6: ( ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5644:1: ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5644:1: ( 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5644:3: 'Location' RULE_COLON ( (lv_uri_2_0= ruleUri ) )
            {
            match(input,71,FOLLOW_71_in_ruleLocation9471); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLocationAccess().getLocationKeyword_0(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleLocation9480); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getLocationAccess().getCOLONTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5652:1: ( (lv_uri_2_0= ruleUri ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5653:1: (lv_uri_2_0= ruleUri )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5653:1: (lv_uri_2_0= ruleUri )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5654:3: lv_uri_2_0= ruleUri
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLocationAccess().getUriUriParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUri_in_ruleLocation9500);
            lv_uri_2_0=ruleUri();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLocation


    // $ANTLR start entryRuleUri
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5684:1: entryRuleUri returns [EObject current=null] : iv_ruleUri= ruleUri EOF ;
    public final EObject entryRuleUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUri = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5685:2: (iv_ruleUri= ruleUri EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5686:2: iv_ruleUri= ruleUri EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUriRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri9536);
            iv_ruleUri=ruleUri();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri9546); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5693:1: ruleUri returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | ( () RULE_STRING ) ) ;
    public final EObject ruleUri() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5698:6: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | ( () RULE_STRING ) ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5699:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | ( () RULE_STRING ) )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5699:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | ( () RULE_STRING ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_STRING) ) {
                alt60=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5699:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | ( () RULE_STRING ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5699:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5699:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5699:3: () ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5699:3: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5700:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getUriAccess().getUriAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getUriAccess().getUriAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5713:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5714:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5714:1: (lv_name_1_0= RULE_ID )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5715:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUri9601); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getUriAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5738:6: ( () RULE_STRING )
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5738:6: ( () RULE_STRING )
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5738:7: () RULE_STRING
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5738:7: ()
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5739:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getUriAccess().getUriAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getUriAccess().getUriAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUri9635); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getUriAccess().getSTRINGTerminalRuleCall_1_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUri


    // $ANTLR start entryRuleInterfaces
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5764:1: entryRuleInterfaces returns [EObject current=null] : iv_ruleInterfaces= ruleInterfaces EOF ;
    public final EObject entryRuleInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaces = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5765:2: (iv_ruleInterfaces= ruleInterfaces EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5766:2: iv_ruleInterfaces= ruleInterfaces EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfacesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaces_in_entryRuleInterfaces9671);
            iv_ruleInterfaces=ruleInterfaces();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaces; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaces9681); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5773:1: ruleInterfaces returns [EObject current=null] : ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleInterfaces() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_name_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5778:6: ( ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5779:1: ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5779:1: ( 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5779:3: 'Interfaces' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            {
            match(input,72,FOLLOW_72_in_ruleInterfaces9716); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfacesAccess().getInterfacesKeyword_0(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleInterfaces9725); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getInterfacesAccess().getCOLONTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5787:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5788:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5788:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5789:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaces9741); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterfacesAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5811:2: ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5811:3: RULE_COMMA ( (lv_name_4_0= RULE_ID ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterfaces9756); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getInterfacesAccess().getCOMMATerminalRuleCall_3_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5815:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5816:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5816:1: (lv_name_4_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5817:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaces9772); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getInterfacesAccess().getNameIDTerminalRuleCall_3_1_0(), "name"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInterfaces


    // $ANTLR start entryRuleProtocol
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5847:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5848:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5849:2: iv_ruleProtocol= ruleProtocol EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProtocolRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol9815);
            iv_ruleProtocol=ruleProtocol();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProtocol; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol9825); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5856:1: ruleProtocol returns [EObject current=null] : ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5861:6: ( ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5862:1: ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5862:1: ( 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5862:3: 'Protocol' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( ruleProtocolConfiguration )?
            {
            match(input,73,FOLLOW_73_in_ruleProtocol9860); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProtocolAccess().getProtocolKeyword_0(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleProtocol9869); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getProtocolAccess().getCOLONTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5870:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5871:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5871:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5872:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProtocol9885); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5894:2: ( ruleProtocolConfiguration )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_LCURLY) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5895:2: ruleProtocolConfiguration
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getProtocolConfigurationParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleProtocolConfiguration_in_ruleProtocol9910);
                    ruleProtocolConfiguration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleProtocol


    // $ANTLR start entryRuleProtocolConfiguration
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5913:1: entryRuleProtocolConfiguration returns [String current=null] : iv_ruleProtocolConfiguration= ruleProtocolConfiguration EOF ;
    public final String entryRuleProtocolConfiguration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtocolConfiguration = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5914:2: (iv_ruleProtocolConfiguration= ruleProtocolConfiguration EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5915:2: iv_ruleProtocolConfiguration= ruleProtocolConfiguration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProtocolConfigurationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleProtocolConfiguration_in_entryRuleProtocolConfiguration9948);
            iv_ruleProtocolConfiguration=ruleProtocolConfiguration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProtocolConfiguration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolConfiguration9959); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5922:1: ruleProtocolConfiguration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY ) ;
    public final AntlrDatatypeRuleToken ruleProtocolConfiguration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LCURLY_0=null;
        Token kw=null;
        Token this_RCURLY_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5927:6: ( (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5928:1: (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5928:1: (this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5928:6: this_LCURLY_0= RULE_LCURLY kw= 'TODO' this_RCURLY_2= RULE_RCURLY
            {
            this_LCURLY_0=(Token)input.LT(1);
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleProtocolConfiguration9999); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_LCURLY_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getProtocolConfigurationAccess().getLCURLYTerminalRuleCall_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,74,FOLLOW_74_in_ruleProtocolConfiguration10017); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getProtocolConfigurationAccess().getTODOKeyword_1(), null); 
                  
            }
            this_RCURLY_2=(Token)input.LT(1);
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleProtocolConfiguration10032); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_RCURLY_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getProtocolConfigurationAccess().getRCURLYTerminalRuleCall_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleProtocolConfiguration


    // $ANTLR start entryRuleRedirects
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5956:1: entryRuleRedirects returns [EObject current=null] : iv_ruleRedirects= ruleRedirects EOF ;
    public final EObject entryRuleRedirects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirects = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5957:2: (iv_ruleRedirects= ruleRedirects EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5958:2: iv_ruleRedirects= ruleRedirects EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRedirectsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRedirects_in_entryRuleRedirects10077);
            iv_ruleRedirects=ruleRedirects();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRedirects; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRedirects10087); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5965:1: ruleRedirects returns [EObject current=null] : ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRedirects() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_outputPortIdentifier_4_0=null;
        Token lv_name_6_0=null;
        Token lv_outputPortIdentifier_8_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5970:6: ( ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5971:1: ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5971:1: ( 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5971:3: 'Redirects' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_4_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )*
            {
            match(input,75,FOLLOW_75_in_ruleRedirects10122); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRedirectsAccess().getRedirectsKeyword_0(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleRedirects10131); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getRedirectsAccess().getCOLONTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5979:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5980:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5980:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5981:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects10147); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRedirectsAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            match(input,60,FOLLOW_60_in_ruleRedirects10162); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRedirectsAccess().getEqualsSignGreaterThanSignKeyword_3(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6007:1: ( (lv_outputPortIdentifier_4_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6008:1: (lv_outputPortIdentifier_4_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6008:1: (lv_outputPortIdentifier_4_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6009:3: lv_outputPortIdentifier_4_0= RULE_ID
            {
            lv_outputPortIdentifier_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects10179); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRedirectsAccess().getOutputPortIdentifierIDTerminalRuleCall_4_0(), "outputPortIdentifier"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6031:2: ( RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6031:3: RULE_COMMA ( (lv_name_6_0= RULE_ID ) ) '=>' ( (lv_outputPortIdentifier_8_0= RULE_ID ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRedirects10194); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getRedirectsAccess().getCOMMATerminalRuleCall_5_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6035:1: ( (lv_name_6_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6036:1: (lv_name_6_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6036:1: (lv_name_6_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6037:3: lv_name_6_0= RULE_ID
            	    {
            	    lv_name_6_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects10210); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getRedirectsAccess().getNameIDTerminalRuleCall_5_1_0(), "name"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

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


            	    }

            	    match(input,60,FOLLOW_60_in_ruleRedirects10225); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRedirectsAccess().getEqualsSignGreaterThanSignKeyword_5_2(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6063:1: ( (lv_outputPortIdentifier_8_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6064:1: (lv_outputPortIdentifier_8_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6064:1: (lv_outputPortIdentifier_8_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6065:3: lv_outputPortIdentifier_8_0= RULE_ID
            	    {
            	    lv_outputPortIdentifier_8_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirects10242); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getRedirectsAccess().getOutputPortIdentifierIDTerminalRuleCall_5_3_0(), "outputPortIdentifier"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleRedirects


    // $ANTLR start entryRuleAggregates
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6095:1: entryRuleAggregates returns [EObject current=null] : iv_ruleAggregates= ruleAggregates EOF ;
    public final EObject entryRuleAggregates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregates = null;


        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6096:2: (iv_ruleAggregates= ruleAggregates EOF )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6097:2: iv_ruleAggregates= ruleAggregates EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAggregatesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAggregates_in_entryRuleAggregates10285);
            iv_ruleAggregates=ruleAggregates();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAggregates; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregates10295); if (failed) return current;

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
    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6104:1: ruleAggregates returns [EObject current=null] : ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAggregates() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_name_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6109:6: ( ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6110:1: ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6110:1: ( 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6110:3: 'Aggregates' RULE_COLON ( (lv_name_2_0= RULE_ID ) ) ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            {
            match(input,76,FOLLOW_76_in_ruleAggregates10330); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAggregatesAccess().getAggregatesKeyword_0(), null); 
                  
            }
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleAggregates10339); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getAggregatesAccess().getCOLONTerminalRuleCall_1(), null); 
                  
            }
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6118:1: ( (lv_name_2_0= RULE_ID ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6119:1: (lv_name_2_0= RULE_ID )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6119:1: (lv_name_2_0= RULE_ID )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6120:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregates10355); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAggregatesAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

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


            }

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6142:2: ( RULE_COMMA ( (lv_name_4_0= RULE_ID ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6142:3: RULE_COMMA ( (lv_name_4_0= RULE_ID ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleAggregates10370); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getAggregatesAccess().getCOMMATerminalRuleCall_3_0(), null); 
            	          
            	    }
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6146:1: ( (lv_name_4_0= RULE_ID ) )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6147:1: (lv_name_4_0= RULE_ID )
            	    {
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6147:1: (lv_name_4_0= RULE_ID )
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6148:3: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAggregates10386); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getAggregatesAccess().getNameIDTerminalRuleCall_3_1_0(), "name"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAggregates

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:370:3: ( 'include' ( ( RULE_STRING ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:370:3: 'include' ( ( RULE_STRING ) )
        {
        match(input,44,FOLLOW_44_in_synpred9555); if (failed) return ;
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:374:1: ( ( RULE_STRING ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:375:1: ( RULE_STRING )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:375:1: ( RULE_STRING )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:376:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred9572); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred91
    public final void synpred91_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4281:4: ( ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4281:4: ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4281:4: ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4282:5: {...}? => ( ( ( ruleRequestResponseOperation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred91", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4282:106: ( ( ( ruleRequestResponseOperation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4283:6: ( ( ruleRequestResponseOperation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 0);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4286:6: ( ( ruleRequestResponseOperation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4287:1: ( ruleRequestResponseOperation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4287:1: ( ruleRequestResponseOperation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4288:3: ruleRequestResponseOperation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRequestResponseOperation_in_synpred917136);
        ruleRequestResponseOperation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred91

    // $ANTLR start synpred92
    public final void synpred92_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4317:4: ( ({...}? => ( ( ( ruleOneWayOperation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4317:4: ({...}? => ( ( ( ruleOneWayOperation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4317:4: ({...}? => ( ( ( ruleOneWayOperation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4318:5: {...}? => ( ( ( ruleOneWayOperation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred92", "getUnorderedGroupHelper().canSelect(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4318:106: ( ( ( ruleOneWayOperation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4319:6: ( ( ruleOneWayOperation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInterfaceAccess().getUnorderedGroup_3(), 1);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4322:6: ( ( ruleOneWayOperation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4323:1: ( ruleOneWayOperation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4323:1: ( ruleOneWayOperation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4324:3: ruleOneWayOperation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getOneWayOperationOneWayOperationParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleOneWayOperation_in_synpred927207);
        ruleOneWayOperation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred92

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4514:4: ( ({...}? => ( ( ( ruleLocation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4514:4: ({...}? => ( ( ( ruleLocation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4514:4: ({...}? => ( ( ( ruleLocation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4515:5: {...}? => ( ( ( ruleLocation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred94", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4515:115: ( ( ( ruleLocation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4516:6: ( ( ruleLocation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 0);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4519:6: ( ( ruleLocation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4520:1: ( ruleLocation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4520:1: ( ruleLocation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4521:3: ruleLocation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getLocationLocationParserRuleCall_3_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleLocation_in_synpred947561);
        ruleLocation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4550:4: ( ({...}? => ( ( ( ruleProtocol ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4550:4: ({...}? => ( ( ( ruleProtocol ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4550:4: ({...}? => ( ( ( ruleProtocol ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4551:5: {...}? => ( ( ( ruleProtocol ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred95", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4551:115: ( ( ( ruleProtocol ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4552:6: ( ( ruleProtocol ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 1);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4555:6: ( ( ruleProtocol ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4556:1: ( ruleProtocol )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4556:1: ( ruleProtocol )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4557:3: ruleProtocol
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getProtocolProtocolParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleProtocol_in_synpred957632);
        ruleProtocol();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4586:4: ( ({...}? => ( ( ( ruleOneWayOperation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4586:4: ({...}? => ( ( ( ruleOneWayOperation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4586:4: ({...}? => ( ( ( ruleOneWayOperation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4587:5: {...}? => ( ( ( ruleOneWayOperation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred96", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4587:115: ( ( ( ruleOneWayOperation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4588:6: ( ( ruleOneWayOperation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 2);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4591:6: ( ( ruleOneWayOperation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4592:1: ( ruleOneWayOperation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4592:1: ( ruleOneWayOperation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4593:3: ruleOneWayOperation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getOneWayOperationOneWayOperationParserRuleCall_3_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleOneWayOperation_in_synpred967703);
        ruleOneWayOperation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4622:4: ( ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4622:4: ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4622:4: ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4623:5: {...}? => ( ( ( ruleRequestResponseOperation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred97", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4623:115: ( ( ( ruleRequestResponseOperation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4624:6: ( ( ruleRequestResponseOperation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 3);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4627:6: ( ( ruleRequestResponseOperation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4628:1: ( ruleRequestResponseOperation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4628:1: ( ruleRequestResponseOperation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4629:3: ruleRequestResponseOperation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRequestResponseOperation_in_synpred977774);
        ruleRequestResponseOperation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4658:4: ( ({...}? => ( ( ( ruleRedirects ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4658:4: ({...}? => ( ( ( ruleRedirects ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4658:4: ({...}? => ( ( ( ruleRedirects ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4659:5: {...}? => ( ( ( ruleRedirects ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred98", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4659:115: ( ( ( ruleRedirects ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4660:6: ( ( ruleRedirects ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 4);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4663:6: ( ( ruleRedirects ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4664:1: ( ruleRedirects )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4664:1: ( ruleRedirects )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4665:3: ruleRedirects
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getRedirectsRedirectsParserRuleCall_3_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRedirects_in_synpred987845);
        ruleRedirects();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4694:4: ( ({...}? => ( ( ( ruleAggregates ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4694:4: ({...}? => ( ( ( ruleAggregates ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4694:4: ({...}? => ( ( ( ruleAggregates ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4695:5: {...}? => ( ( ( ruleAggregates ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred99", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4695:115: ( ( ( ruleAggregates ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4696:6: ( ( ruleAggregates ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 5);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4699:6: ( ( ruleAggregates ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4700:1: ( ruleAggregates )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4700:1: ( ruleAggregates )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4701:3: ruleAggregates
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getAggregatesAggregatesParserRuleCall_3_5_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAggregates_in_synpred997916);
        ruleAggregates();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4730:4: ( ({...}? => ( ( ( ruleInterfaces ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4730:4: ({...}? => ( ( ( ruleInterfaces ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4730:4: ({...}? => ( ( ( ruleInterfaces ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4731:5: {...}? => ( ( ( ruleInterfaces ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred100", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4731:115: ( ( ( ruleInterfaces ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4732:6: ( ( ruleInterfaces ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getInputPortStatementAccess().getUnorderedGroup_3(), 6);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4735:6: ( ( ruleInterfaces ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4736:1: ( ruleInterfaces )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4736:1: ( ruleInterfaces )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4737:3: ruleInterfaces
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInputPortStatementAccess().getIntefacesInterfacesParserRuleCall_3_6_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterfaces_in_synpred1007987);
        ruleInterfaces();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4855:4: ( ({...}? => ( ( ( ruleLocation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4855:4: ({...}? => ( ( ( ruleLocation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4855:4: ({...}? => ( ( ( ruleLocation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4856:5: {...}? => ( ( ( ruleLocation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred101", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4856:116: ( ( ( ruleLocation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4857:6: ( ( ruleLocation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 0);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4860:6: ( ( ruleLocation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4861:1: ( ruleLocation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4861:1: ( ruleLocation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4862:3: ruleLocation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getLocationLocationParserRuleCall_3_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleLocation_in_synpred1018222);
        ruleLocation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4891:4: ( ({...}? => ( ( ( ruleProtocol ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4891:4: ({...}? => ( ( ( ruleProtocol ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4891:4: ({...}? => ( ( ( ruleProtocol ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4892:5: {...}? => ( ( ( ruleProtocol ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred102", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4892:116: ( ( ( ruleProtocol ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4893:6: ( ( ruleProtocol ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 1);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4896:6: ( ( ruleProtocol ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4897:1: ( ruleProtocol )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4897:1: ( ruleProtocol )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4898:3: ruleProtocol
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getProtocolProtocolParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleProtocol_in_synpred1028293);
        ruleProtocol();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4927:4: ( ({...}? => ( ( ( ruleOneWayOperation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4927:4: ({...}? => ( ( ( ruleOneWayOperation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4927:4: ({...}? => ( ( ( ruleOneWayOperation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4928:5: {...}? => ( ( ( ruleOneWayOperation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred103", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4928:116: ( ( ( ruleOneWayOperation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4929:6: ( ( ruleOneWayOperation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 2);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4932:6: ( ( ruleOneWayOperation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4933:1: ( ruleOneWayOperation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4933:1: ( ruleOneWayOperation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4934:3: ruleOneWayOperation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getOneWayOperationOneWayOperationParserRuleCall_3_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleOneWayOperation_in_synpred1038364);
        ruleOneWayOperation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4963:4: ( ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4963:4: ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4963:4: ({...}? => ( ( ( ruleRequestResponseOperation ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4964:5: {...}? => ( ( ( ruleRequestResponseOperation ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred104", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4964:116: ( ( ( ruleRequestResponseOperation ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4965:6: ( ( ruleRequestResponseOperation ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 3);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4968:6: ( ( ruleRequestResponseOperation ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4969:1: ( ruleRequestResponseOperation )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4969:1: ( ruleRequestResponseOperation )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4970:3: ruleRequestResponseOperation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getRequestResponseOperationRequestResponseOperationParserRuleCall_3_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRequestResponseOperation_in_synpred1048435);
        ruleRequestResponseOperation();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred105
    public final void synpred105_fragment() throws RecognitionException {   
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4999:4: ( ({...}? => ( ( ( ruleInterfaces ) ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4999:4: ({...}? => ( ( ( ruleInterfaces ) ) ) )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4999:4: ({...}? => ( ( ( ruleInterfaces ) ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5000:5: {...}? => ( ( ( ruleInterfaces ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred105", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4)");
        }
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5000:116: ( ( ( ruleInterfaces ) ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5001:6: ( ( ruleInterfaces ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOutputPortStatementAccess().getUnorderedGroup_3(), 4);
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5004:6: ( ( ruleInterfaces ) )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5005:1: ( ruleInterfaces )
        {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5005:1: ( ruleInterfaces )
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:5006:3: ruleInterfaces
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getOutputPortStatementAccess().getIntefacesInterfacesParserRuleCall_3_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInterfaces_in_synpred1058506);
        ruleInterfaces();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred105

    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred97() {
        backtracking++;
        int start = input.mark();
        try {
            synpred97_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred94() {
        backtracking++;
        int start = input.mark();
        try {
            synpred94_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred95() {
        backtracking++;
        int start = input.mark();
        try {
            synpred95_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred92() {
        backtracking++;
        int start = input.mark();
        try {
            synpred92_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred91() {
        backtracking++;
        int start = input.mark();
        try {
            synpred91_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred101() {
        backtracking++;
        int start = input.mark();
        try {
            synpred101_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred100() {
        backtracking++;
        int start = input.mark();
        try {
            synpred100_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred103() {
        backtracking++;
        int start = input.mark();
        try {
            synpred103_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred102() {
        backtracking++;
        int start = input.mark();
        try {
            synpred102_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred105() {
        backtracking++;
        int start = input.mark();
        try {
            synpred105_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred99() {
        backtracking++;
        int start = input.mark();
        try {
            synpred99_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleProgram138 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_rulePort_in_ruleProgram165 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleInterface_in_ruleProgram192 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleType_in_ruleProgram219 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleInit_in_ruleProgram246 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleExecution_in_ruleProgram273 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleDefine_in_ruleProgram300 = new BitSet(new long[]{0x0070380000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecution372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleExecution410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleExecution425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_CONCURRENT_in_ruleExecution445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleExecution465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInclude555 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude572 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleType659 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType676 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleType690 = new BitSet(new long[]{0x0007C00000000012L});
    public static final BitSet FOLLOW_ruleNative_type_in_ruleType708 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTypedef_in_ruleType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedef_in_entryRuleTypedef765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedef775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleTypedef821 = new BitSet(new long[]{0x0000000000000C40L});
    public static final BitSet FOLLOW_ruleSubtypes_in_ruleTypedef841 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleTypedef850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtypes_in_entryRuleSubtypes885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtypes895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleSubtypes943 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubtypes959 = new BitSet(new long[]{0x0000000000003A00L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleSubtypes984 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSubtypes994 = new BitSet(new long[]{0x000E800000000512L});
    public static final BitSet FOLLOW_ruleNative_type_sub_in_ruleSubtypes1014 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_ruleTypedef_in_ruleSubtypes1035 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleSubtypes1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleCardinality1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleCardinality1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleCardinality1208 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinality1228 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCardinality1248 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinality1269 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleCardinality1295 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleCardinality1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNative_type_in_entryRuleNative_type1363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNative_type1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNative_type1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNative_type1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNative_type1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNative_type1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNative_type1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNative_type_sub_in_entryRuleNative_type_sub1529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNative_type_sub1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNative_type_sub1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNative_type_sub1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNative_type_sub1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNative_type_sub1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNative_type_sub1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDefine1746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefine1763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleDefine1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInit1878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleInit1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMain2001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleMain2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_entryRuleMainProcess2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainProcess2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleMainProcess2127 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleMainProcess2147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleMainProcess2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProcess2248 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess2268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProcess2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleProcess2293 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleProcess2313 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleProcess2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelStatement2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement2427 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_RULE_VERT_in_ruleParallelStatement2437 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_ruleParallelStatement2457 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement2496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceStatement2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement2565 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSequenceStatement2575 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleSequenceStatement2595 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStatement2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleBasicStatement2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_ruleBasicStatement2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_ruleBasicStatement2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementDecrement_in_ruleBasicStatement2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWith_in_ruleBasicStatement2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynchronized_in_ruleBasicStatement2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUndef_in_ruleBasicStatement2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleBasicStatement2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_ruleBasicStatement2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullProcces_in_ruleBasicStatement2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelinkIn_in_ruleBasicStatement2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicStatement3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelinkIn_in_entryRulelinkIn3053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelinkIn3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulelinkIn3110 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulelinkIn3119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelinkIn3135 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulelinkIn3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullProcces_in_entryRuleNullProcces3185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullProcces3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullProcces3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatementOrPostIncrementDecrementOrInputOperation_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation3272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignStatementOrPostIncrementDecrementOrInputOperation3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation3340 = new BitSet(new long[]{0x0000000007E20000L});
    public static final BitSet FOLLOW_ruleRightSide_in_ruleAssignStatementOrPostIncrementDecrementOrInputOperation3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSide_in_entryRuleRightSide3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSide3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleRightSide3454 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRightSide3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_ruleRightSide3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleRightSide3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POINTSTO_in_ruleRightSide3559 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleRightSide3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEEPCOPYLEFT_in_ruleRightSide3608 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleRightSide3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRightSide3645 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleRightSide3665 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRightSide3674 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_ruleRightSide3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleRightSide3711 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleOutputOperation_in_ruleRightSide3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynchronized_in_entryRuleSynchronized3768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSynchronized3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSynchronized3813 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSynchronized3822 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSynchronized3838 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSynchronized3852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleSynchronized3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUndef_in_entryRuleUndef3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUndef3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUndef3953 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleUndef3962 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleUndef3982 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleUndef3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperation_in_entryRuleOutputOperation4026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperation4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputOperation4078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOutputOperation4092 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOutputOperation4112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOutputOperation4121 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOutputOperation4130 = new BitSet(new long[]{0x8000000000040500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleOutputOperation4150 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOutputOperation4160 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleOutputOperation4169 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_ruleInstallFunciton_in_ruleOutputOperation4189 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleOutputOperation4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstallFunciton_in_entryRuleInstallFunciton4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstallFunciton4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstallFunciton4290 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59_in_ruleInstallFunciton4311 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleInstallFunciton4322 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleInstallFunciton4343 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInstallFunciton4353 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstallFunciton4370 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_59_in_ruleInstallFunciton4391 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleInstallFunciton4402 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleInstallFunciton4423 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_entryRuleInputOperation4461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperation4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleInputOperation4518 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInputOperation4538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleInputOperation4547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleInputOperation4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreIncrementDecrement_in_entryRulePreIncrementDecrement4605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreIncrementDecrement4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rulePreIncrementDecrement4650 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rulePreIncrementDecrement4664 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rulePreIncrementDecrement4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor4721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFor4766 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFor4775 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleFor4795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFor4804 = new BitSet(new long[]{0x8000000008004580L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleFor4824 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFor4833 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_ruleFor4853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleFor4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody4910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBody4954 = new BitSet(new long[]{0xE780000000C22510L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_ruleBody4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition5013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleCondition5058 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleCondition5108 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCondition5123 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition5137 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_ruleRightCondition_in_ruleCondition5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightCondition_in_entryRuleRightCondition5195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightCondition5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleRightCondition5240 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_LANGLE_in_ruleRightCondition5254 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_RANGLE_in_ruleRightCondition5268 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_MAJOR_OR_EQUAL_in_ruleRightCondition5282 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_MINOR_OR_EQUAL_in_ruleRightCondition5296 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_NOT_EQUAL_in_ruleRightCondition5310 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRightCondition5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach5367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleForeach5424 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleForeach5433 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleForeach5453 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleForeach5462 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleForeach5482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleForeach5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression5599 = new BitSet(new long[]{0x0000001C00001002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleExpression5630 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleExpression5650 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_ruleExpression5670 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleExpression5690 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression5757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleTerminalExpression5802 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5826 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleTerminalExpression5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleTerminalExpression5863 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleTerminalExpression5916 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTerminalExpression5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_ruleTerminalExpression5999 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression6013 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleTerminalExpression6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleTerminalExpression6063 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_ruleTerminalExpression6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleTerminalExpression6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath6125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath6190 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath6213 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath6228 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath6248 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath6257 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath6269 = new BitSet(new long[]{0x8000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath6278 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_63_in_ruleVariablePath6293 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath6304 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath6324 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath6333 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath6351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleVariablePath6359 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath6379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleVariablePath6388 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_63_in_ruleVariablePath6420 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath6431 = new BitSet(new long[]{0x8000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariablePath6440 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_63_in_ruleVariablePath6455 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleVariablePath6466 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath6486 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleVariablePath6495 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariablePath6513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleVariablePath6521 = new BitSet(new long[]{0x8000002800C24580L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariablePath6541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleVariablePath6550 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleWith_in_entryRuleWith6589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWith6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleWith6646 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleWith6655 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleWith6675 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleWith6684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleWith6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement6740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDChoiceStatement6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleNDChoiceStatement6797 = new BitSet(new long[]{0x8080000000000500L});
    public static final BitSet FOLLOW_55_in_ruleNDChoiceStatement6808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement6817 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNDChoiceStatement6825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement6833 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement6861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleNDChoiceStatement6870 = new BitSet(new long[]{0x8000000000000500L});
    public static final BitSet FOLLOW_ruleVariablePath_in_ruleNDChoiceStatement6890 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleNDChoiceStatement6899 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleInputOperation_in_ruleNDChoiceStatement6919 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleNDChoiceStatement6930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMainProcess_in_ruleNDChoiceStatement6950 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface6994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInterface7043 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface7060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleInterface7074 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleInterface7136 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_ruleInterface7207 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleInterface7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort7294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPortStatement_in_rulePort7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPortStatement_in_rulePort7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputPortStatement_in_entryRuleInputPortStatement7419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputPortStatement7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleInputPortStatement7468 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputPortStatement7485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleInputPortStatement7499 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleInputPortStatement7561 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleInputPortStatement7632 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_ruleInputPortStatement7703 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleInputPortStatement7774 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleRedirects_in_ruleInputPortStatement7845 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleAggregates_in_ruleInputPortStatement7916 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_ruleInterfaces_in_ruleInputPortStatement7987 = new BitSet(new long[]{0x0000000000000040L,0x0000000000001BB0L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleInputPortStatement8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputPortStatement_in_entryRuleOutputPortStatement8080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputPortStatement8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOutputPortStatement8129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputPortStatement8146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleOutputPortStatement8160 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleOutputPortStatement8222 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleOutputPortStatement8293 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_ruleOutputPortStatement8364 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_ruleOutputPortStatement8435 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003B0L});
    public static final BitSet FOLLOW_ruleInterfaces_in_ruleOutputPortStatement8506 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003B0L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleOutputPortStatement8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_entryRuleOneWayOperation8593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayOperation8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOneWayOperation8650 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOneWayOperation8659 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneWayOperation8675 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOneWayOperation8690 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation8710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOneWayOperation8719 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOneWayOperation8730 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneWayOperation8746 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOneWayOperation8761 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleOneWayOperation8781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOneWayOperation8790 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation8829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleRequestResponseOperation8886 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleRequestResponseOperation8895 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation8911 = new BitSet(new long[]{0x0000000000028002L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation8927 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation8947 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation8956 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation8966 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation8986 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation8995 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleRequestResponseOperation9008 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation9025 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9040 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9060 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9069 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRequestResponseOperation9081 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation9097 = new BitSet(new long[]{0x0000000000028002L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9113 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9133 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9142 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9152 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9172 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9181 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleRequestResponseOperation9194 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestResponseOperation9211 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleRequestResponseOperation9226 = new BitSet(new long[]{0x0007C00000040100L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleRequestResponseOperation9246 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleRequestResponseOperation9255 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition9295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDefinition9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNative_type_in_ruleTypeDefinition9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation9426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleLocation9471 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleLocation9480 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleUri_in_ruleLocation9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri9536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUri9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUri9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaces_in_entryRuleInterfaces9671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaces9681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInterfaces9716 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleInterfaces9725 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaces9741 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterfaces9756 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaces9772 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol9815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleProtocol9860 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleProtocol9869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProtocol9885 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleProtocolConfiguration_in_ruleProtocol9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolConfiguration_in_entryRuleProtocolConfiguration9948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolConfiguration9959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleProtocolConfiguration9999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleProtocolConfiguration10017 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleProtocolConfiguration10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirects_in_entryRuleRedirects10077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRedirects10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleRedirects10122 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleRedirects10131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects10147 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRedirects10162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects10179 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRedirects10194 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects10210 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRedirects10225 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirects10242 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleAggregates_in_entryRuleAggregates10285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregates10295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAggregates10330 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleAggregates10339 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregates10355 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleAggregates10370 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAggregates10386 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_44_in_synpred9555 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_synpred917136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_synpred927207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_synpred947561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_synpred957632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_synpred967703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_synpred977774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirects_in_synpred987845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregates_in_synpred997916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaces_in_synpred1007987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_synpred1018222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_synpred1028293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayOperation_in_synpred1038364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_synpred1048435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaces_in_synpred1058506 = new BitSet(new long[]{0x0000000000000002L});

}
