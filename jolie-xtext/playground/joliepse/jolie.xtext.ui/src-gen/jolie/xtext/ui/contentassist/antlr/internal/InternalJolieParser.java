package jolie.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import jolie.xtext.services.JolieGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJolieParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERISK", "RULE_DIVIDE", "RULE_ID", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_CHOICE", "RULE_DECREMENT", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_LINKIN", "RULE_GLOBAL", "RULE_DOT", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ARROW", "RULE_COLON", "RULE_COMMA", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'"
    };
    public static final int RULE_RCURLY=10;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_CHOICE=16;
    public static final int RULE_COLON=27;
    public static final int RULE_ID=8;
    public static final int RULE_LINKIN=20;
    public static final int RULE_WHILE=29;
    public static final int RULE_STRING=25;
    public static final int RULE_LPAREN=11;
    public static final int RULE_LSQUARE=18;
    public static final int RULE_REAL=24;
    public static final int RULE_SEMICOLON=14;
    public static final int RULE_PERCENT_SIGN=30;
    public static final int RULE_COMMA=28;
    public static final int RULE_RPAREN=12;
    public static final int RULE_ASSIGN=15;
    public static final int RULE_ASTERISK=6;
    public static final int RULE_DOT=22;
    public static final int RULE_MINUS=5;
    public static final int RULE_ARROW=26;
    public static final int RULE_VERT=13;
    public static final int RULE_WS=33;
    public static final int RULE_INT=23;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=19;
    public static final int RULE_DIVIDE=7;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_GLOBAL=21;
    public static final int RULE_DECREMENT=17;
    public static final int RULE_PLUS=4;
    public static final int RULE_LCURLY=9;

        public InternalJolieParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g"; }


     
     	private JolieGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JolieGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleProgram
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:62:1: ( ruleProgram EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:63:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();
            _fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:70:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:74:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:75:1: ( ( rule__Program__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:75:1: ( ( rule__Program__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:76:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:77:1: ( rule__Program__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:77:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleMain
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:89:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:90:1: ( ruleMain EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:91:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain121);
            ruleMain();
            _fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMain


    // $ANTLR start ruleMain
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:98:1: ruleMain : ( ( rule__Main__MainrocessAssignment ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:102:2: ( ( ( rule__Main__MainrocessAssignment ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:103:1: ( ( rule__Main__MainrocessAssignment ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:103:1: ( ( rule__Main__MainrocessAssignment ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:104:1: ( rule__Main__MainrocessAssignment )
            {
             before(grammarAccess.getMainAccess().getMainrocessAssignment()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:105:1: ( rule__Main__MainrocessAssignment )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:105:2: rule__Main__MainrocessAssignment
            {
            pushFollow(FOLLOW_rule__Main__MainrocessAssignment_in_ruleMain154);
            rule__Main__MainrocessAssignment();
            _fsp--;


            }

             after(grammarAccess.getMainAccess().getMainrocessAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMain


    // $ANTLR start entryRuleMainProcess
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:117:1: entryRuleMainProcess : ruleMainProcess EOF ;
    public final void entryRuleMainProcess() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:118:1: ( ruleMainProcess EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:119:1: ruleMainProcess EOF
            {
             before(grammarAccess.getMainProcessRule()); 
            pushFollow(FOLLOW_ruleMainProcess_in_entryRuleMainProcess181);
            ruleMainProcess();
            _fsp--;

             after(grammarAccess.getMainProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainProcess188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMainProcess


    // $ANTLR start ruleMainProcess
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:126:1: ruleMainProcess : ( ( rule__MainProcess__Group__0 ) ) ;
    public final void ruleMainProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:130:2: ( ( ( rule__MainProcess__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:131:1: ( ( rule__MainProcess__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:131:1: ( ( rule__MainProcess__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:132:1: ( rule__MainProcess__Group__0 )
            {
             before(grammarAccess.getMainProcessAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:133:1: ( rule__MainProcess__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:133:2: rule__MainProcess__Group__0
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__0_in_ruleMainProcess214);
            rule__MainProcess__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMainProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMainProcess


    // $ANTLR start entryRuleProcess
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:145:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:146:1: ( ruleProcess EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:147:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess241);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProcess


    // $ANTLR start ruleProcess
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:154:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:158:2: ( ( ( rule__Process__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:159:1: ( ( rule__Process__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:159:1: ( ( rule__Process__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:160:1: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:161:1: ( rule__Process__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:161:2: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_in_ruleProcess274);
            rule__Process__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleParallelStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:173:1: entryRuleParallelStatement : ruleParallelStatement EOF ;
    public final void entryRuleParallelStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:174:1: ( ruleParallelStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:175:1: ruleParallelStatement EOF
            {
             before(grammarAccess.getParallelStatementRule()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement301);
            ruleParallelStatement();
            _fsp--;

             after(grammarAccess.getParallelStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStatement308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParallelStatement


    // $ANTLR start ruleParallelStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:182:1: ruleParallelStatement : ( ( rule__ParallelStatement__Group__0 ) ) ;
    public final void ruleParallelStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:186:2: ( ( ( rule__ParallelStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:187:1: ( ( rule__ParallelStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:187:1: ( ( rule__ParallelStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:188:1: ( rule__ParallelStatement__Group__0 )
            {
             before(grammarAccess.getParallelStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:189:1: ( rule__ParallelStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:189:2: rule__ParallelStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__0_in_ruleParallelStatement334);
            rule__ParallelStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParallelStatement


    // $ANTLR start entryRuleSequenceStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:201:1: entryRuleSequenceStatement : ruleSequenceStatement EOF ;
    public final void entryRuleSequenceStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:202:1: ( ruleSequenceStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:203:1: ruleSequenceStatement EOF
            {
             before(grammarAccess.getSequenceStatementRule()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement361);
            ruleSequenceStatement();
            _fsp--;

             after(grammarAccess.getSequenceStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceStatement368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSequenceStatement


    // $ANTLR start ruleSequenceStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:210:1: ruleSequenceStatement : ( ( rule__SequenceStatement__Group__0 ) ) ;
    public final void ruleSequenceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:214:2: ( ( ( rule__SequenceStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:215:1: ( ( rule__SequenceStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:215:1: ( ( rule__SequenceStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:216:1: ( rule__SequenceStatement__Group__0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:217:1: ( rule__SequenceStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:217:2: rule__SequenceStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__0_in_ruleSequenceStatement394);
            rule__SequenceStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSequenceStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSequenceStatement


    // $ANTLR start entryRuleBasicStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:229:1: entryRuleBasicStatement : ruleBasicStatement EOF ;
    public final void entryRuleBasicStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:230:1: ( ruleBasicStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:231:1: ruleBasicStatement EOF
            {
             before(grammarAccess.getBasicStatementRule()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement421);
            ruleBasicStatement();
            _fsp--;

             after(grammarAccess.getBasicStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicStatement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBasicStatement


    // $ANTLR start ruleBasicStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:238:1: ruleBasicStatement : ( ( rule__BasicStatement__Alternatives ) ) ;
    public final void ruleBasicStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:242:2: ( ( ( rule__BasicStatement__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:243:1: ( ( rule__BasicStatement__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:243:1: ( ( rule__BasicStatement__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:244:1: ( rule__BasicStatement__Alternatives )
            {
             before(grammarAccess.getBasicStatementAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:245:1: ( rule__BasicStatement__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:245:2: rule__BasicStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicStatement__Alternatives_in_ruleBasicStatement454);
            rule__BasicStatement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBasicStatement


    // $ANTLR start entryRuleAssignStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:257:1: entryRuleAssignStatement : ruleAssignStatement EOF ;
    public final void entryRuleAssignStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:258:1: ( ruleAssignStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:259:1: ruleAssignStatement EOF
            {
             before(grammarAccess.getAssignStatementRule()); 
            pushFollow(FOLLOW_ruleAssignStatement_in_entryRuleAssignStatement481);
            ruleAssignStatement();
            _fsp--;

             after(grammarAccess.getAssignStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignStatement488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAssignStatement


    // $ANTLR start ruleAssignStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:266:1: ruleAssignStatement : ( ( rule__AssignStatement__Group__0 ) ) ;
    public final void ruleAssignStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:270:2: ( ( ( rule__AssignStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:271:1: ( ( rule__AssignStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:271:1: ( ( rule__AssignStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:272:1: ( rule__AssignStatement__Group__0 )
            {
             before(grammarAccess.getAssignStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:273:1: ( rule__AssignStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:273:2: rule__AssignStatement__Group__0
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__0_in_ruleAssignStatement514);
            rule__AssignStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssignStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssignStatement


    // $ANTLR start entryRulePostIncrementStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:285:1: entryRulePostIncrementStatement : rulePostIncrementStatement EOF ;
    public final void entryRulePostIncrementStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:286:1: ( rulePostIncrementStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:287:1: rulePostIncrementStatement EOF
            {
             before(grammarAccess.getPostIncrementStatementRule()); 
            pushFollow(FOLLOW_rulePostIncrementStatement_in_entryRulePostIncrementStatement541);
            rulePostIncrementStatement();
            _fsp--;

             after(grammarAccess.getPostIncrementStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostIncrementStatement548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePostIncrementStatement


    // $ANTLR start rulePostIncrementStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:294:1: rulePostIncrementStatement : ( ( rule__PostIncrementStatement__Group__0 ) ) ;
    public final void rulePostIncrementStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:298:2: ( ( ( rule__PostIncrementStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:299:1: ( ( rule__PostIncrementStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:299:1: ( ( rule__PostIncrementStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:300:1: ( rule__PostIncrementStatement__Group__0 )
            {
             before(grammarAccess.getPostIncrementStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:301:1: ( rule__PostIncrementStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:301:2: rule__PostIncrementStatement__Group__0
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__0_in_rulePostIncrementStatement574);
            rule__PostIncrementStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPostIncrementStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePostIncrementStatement


    // $ANTLR start entryRulePostDecrementStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:313:1: entryRulePostDecrementStatement : rulePostDecrementStatement EOF ;
    public final void entryRulePostDecrementStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:314:1: ( rulePostDecrementStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:315:1: rulePostDecrementStatement EOF
            {
             before(grammarAccess.getPostDecrementStatementRule()); 
            pushFollow(FOLLOW_rulePostDecrementStatement_in_entryRulePostDecrementStatement601);
            rulePostDecrementStatement();
            _fsp--;

             after(grammarAccess.getPostDecrementStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostDecrementStatement608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePostDecrementStatement


    // $ANTLR start rulePostDecrementStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:322:1: rulePostDecrementStatement : ( ( rule__PostDecrementStatement__Group__0 ) ) ;
    public final void rulePostDecrementStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:326:2: ( ( ( rule__PostDecrementStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:327:1: ( ( rule__PostDecrementStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:327:1: ( ( rule__PostDecrementStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:328:1: ( rule__PostDecrementStatement__Group__0 )
            {
             before(grammarAccess.getPostDecrementStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:329:1: ( rule__PostDecrementStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:329:2: rule__PostDecrementStatement__Group__0
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__0_in_rulePostDecrementStatement634);
            rule__PostDecrementStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPostDecrementStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePostDecrementStatement


    // $ANTLR start entryRuleExpression
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:341:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:342:1: ( ruleExpression EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:343:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression661);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:350:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:354:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:355:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:355:1: ( ( rule__Expression__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:356:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:357:1: ( rule__Expression__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:357:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression694);
            rule__Expression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpression
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:369:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:370:1: ( ruleTerminalExpression EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:371:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression721);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:378:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:382:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:383:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:383:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:384:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:385:1: ( rule__TerminalExpression__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:385:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression754);
            rule__TerminalExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleNDChoiceStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:397:1: entryRuleNDChoiceStatement : ruleNDChoiceStatement EOF ;
    public final void entryRuleNDChoiceStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:398:1: ( ruleNDChoiceStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:399:1: ruleNDChoiceStatement EOF
            {
             before(grammarAccess.getNDChoiceStatementRule()); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement781);
            ruleNDChoiceStatement();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDChoiceStatement788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNDChoiceStatement


    // $ANTLR start ruleNDChoiceStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:406:1: ruleNDChoiceStatement : ( ( rule__NDChoiceStatement__Group__0 ) ) ;
    public final void ruleNDChoiceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:410:2: ( ( ( rule__NDChoiceStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:411:1: ( ( rule__NDChoiceStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:411:1: ( ( rule__NDChoiceStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:412:1: ( rule__NDChoiceStatement__Group__0 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:413:1: ( rule__NDChoiceStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:413:2: rule__NDChoiceStatement__Group__0
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__0_in_ruleNDChoiceStatement814);
            rule__NDChoiceStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNDChoiceStatement


    // $ANTLR start entryRuleInputOperation
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:425:1: entryRuleInputOperation : ruleInputOperation EOF ;
    public final void entryRuleInputOperation() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:426:1: ( ruleInputOperation EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:427:1: ruleInputOperation EOF
            {
             before(grammarAccess.getInputOperationRule()); 
            pushFollow(FOLLOW_ruleInputOperation_in_entryRuleInputOperation841);
            ruleInputOperation();
            _fsp--;

             after(grammarAccess.getInputOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperation848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInputOperation


    // $ANTLR start ruleInputOperation
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:434:1: ruleInputOperation : ( ( rule__InputOperation__Alternatives ) ) ;
    public final void ruleInputOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:438:2: ( ( ( rule__InputOperation__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:439:1: ( ( rule__InputOperation__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:439:1: ( ( rule__InputOperation__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:440:1: ( rule__InputOperation__Alternatives )
            {
             before(grammarAccess.getInputOperationAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:441:1: ( rule__InputOperation__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:441:2: rule__InputOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__InputOperation__Alternatives_in_ruleInputOperation874);
            rule__InputOperation__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInputOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInputOperation


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:453:1: entryRuleVariablePath : ruleVariablePath EOF ;
    public final void entryRuleVariablePath() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:454:1: ( ruleVariablePath EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:455:1: ruleVariablePath EOF
            {
             before(grammarAccess.getVariablePathRule()); 
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath901);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getVariablePathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVariablePath


    // $ANTLR start ruleVariablePath
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:462:1: ruleVariablePath : ( ( rule__VariablePath__Group__0 ) ) ;
    public final void ruleVariablePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:466:2: ( ( ( rule__VariablePath__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:467:1: ( ( rule__VariablePath__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:467:1: ( ( rule__VariablePath__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:468:1: ( rule__VariablePath__Group__0 )
            {
             before(grammarAccess.getVariablePathAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:469:1: ( rule__VariablePath__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:469:2: rule__VariablePath__Group__0
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__0_in_ruleVariablePath934);
            rule__VariablePath__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVariablePath


    // $ANTLR start entryRuleRequestResponseOperation
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:481:1: entryRuleRequestResponseOperation : ruleRequestResponseOperation EOF ;
    public final void entryRuleRequestResponseOperation() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:482:1: ( ruleRequestResponseOperation EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:483:1: ruleRequestResponseOperation EOF
            {
             before(grammarAccess.getRequestResponseOperationRule()); 
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation961);
            ruleRequestResponseOperation();
            _fsp--;

             after(grammarAccess.getRequestResponseOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRequestResponseOperation


    // $ANTLR start ruleRequestResponseOperation
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:490:1: ruleRequestResponseOperation : ( ( rule__RequestResponseOperation__Group__0 ) ) ;
    public final void ruleRequestResponseOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:494:2: ( ( ( rule__RequestResponseOperation__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:495:1: ( ( rule__RequestResponseOperation__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:495:1: ( ( rule__RequestResponseOperation__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:496:1: ( rule__RequestResponseOperation__Group__0 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:497:1: ( rule__RequestResponseOperation__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:497:2: rule__RequestResponseOperation__Group__0
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__0_in_ruleRequestResponseOperation994);
            rule__RequestResponseOperation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRequestResponseOperation


    // $ANTLR start rule__Process__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:509:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:513:1: ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) )
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
                    new NoViableAltException("509:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:514:1: ( ( rule__Process__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:514:1: ( ( rule__Process__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:515:1: ( rule__Process__Group_0__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:516:1: ( rule__Process__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:516:2: rule__Process__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives1030);
                    rule__Process__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:520:6: ( ( rule__Process__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:520:6: ( ( rule__Process__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:521:1: ( rule__Process__Group_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:522:1: ( rule__Process__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:522:2: rule__Process__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives1048);
                    rule__Process__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Alternatives


    // $ANTLR start rule__BasicStatement__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:531:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) );
    public final void rule__BasicStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:535:1: ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_LCURLY:
            case RULE_LPAREN:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_ASSIGN:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_DECREMENT:
                    {
                    alt2=4;
                    }
                    break;
                case RULE_CHOICE:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("531:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) );", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case EOF:
            case RULE_RCURLY:
            case RULE_RPAREN:
            case RULE_VERT:
            case RULE_SEMICOLON:
            case RULE_LSQUARE:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("531:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:536:1: ( ( rule__BasicStatement__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:536:1: ( ( rule__BasicStatement__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:537:1: ( rule__BasicStatement__Group_0__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:538:1: ( rule__BasicStatement__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:538:2: rule__BasicStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives1081);
                    rule__BasicStatement__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:542:6: ( ( rule__BasicStatement__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:542:6: ( ( rule__BasicStatement__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:543:1: ( rule__BasicStatement__Group_1__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:544:1: ( rule__BasicStatement__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:544:2: rule__BasicStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives1099);
                    rule__BasicStatement__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:548:6: ( ( rule__BasicStatement__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:548:6: ( ( rule__BasicStatement__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:549:1: ( rule__BasicStatement__Group_2__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:550:1: ( rule__BasicStatement__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:550:2: rule__BasicStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives1117);
                    rule__BasicStatement__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:554:6: ( ( rule__BasicStatement__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:554:6: ( ( rule__BasicStatement__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:555:1: ( rule__BasicStatement__Group_3__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:556:1: ( rule__BasicStatement__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:556:2: rule__BasicStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_3__0_in_rule__BasicStatement__Alternatives1135);
                    rule__BasicStatement__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:560:6: ( ( rule__BasicStatement__Group_4__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:560:6: ( ( rule__BasicStatement__Group_4__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:561:1: ( rule__BasicStatement__Group_4__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_4()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:562:1: ( rule__BasicStatement__Group_4__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:562:2: rule__BasicStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_4__0_in_rule__BasicStatement__Alternatives1153);
                    rule__BasicStatement__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Alternatives


    // $ANTLR start rule__Expression__OpAlternatives_1_1_0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:571:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );
    public final void rule__Expression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:575:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt3=1;
                }
                break;
            case RULE_MINUS:
                {
                alt3=2;
                }
                break;
            case RULE_ASTERISK:
                {
                alt3=3;
                }
                break;
            case RULE_DIVIDE:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("571:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:576:1: ( RULE_PLUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:576:1: ( RULE_PLUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:577:1: RULE_PLUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_01186); 
                     after(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:582:6: ( RULE_MINUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:582:6: ( RULE_MINUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:583:1: RULE_MINUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_01203); 
                     after(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:588:6: ( RULE_ASTERISK )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:588:6: ( RULE_ASTERISK )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:589:1: RULE_ASTERISK
                    {
                     before(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 
                    match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_01220); 
                     after(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:594:6: ( RULE_DIVIDE )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:594:6: ( RULE_DIVIDE )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:595:1: RULE_DIVIDE
                    {
                     before(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3()); 
                    match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_01237); 
                     after(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__OpAlternatives_1_1_0


    // $ANTLR start rule__TerminalExpression__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:605:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:609:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_LPAREN:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_REAL:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case RULE_STRING:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("605:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:610:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:610:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:611:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:612:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:612:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1269);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:616:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:616:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:617:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:618:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:618:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1287);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:623:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:624:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:624:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1305);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:628:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:628:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:629:1: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:630:1: ( rule__TerminalExpression__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:630:2: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1323);
                    rule__TerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:634:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:634:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:635:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:636:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:636:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1341);
                    rule__TerminalExpression__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Alternatives


    // $ANTLR start rule__InputOperation__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:645:1: rule__InputOperation__Alternatives : ( ( ( rule__InputOperation__Group_0__0 ) ) | ( ( rule__InputOperation__Group_1__0 ) ) );
    public final void rule__InputOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:649:1: ( ( ( rule__InputOperation__Group_0__0 ) ) | ( ( rule__InputOperation__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LINKIN) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("645:1: rule__InputOperation__Alternatives : ( ( ( rule__InputOperation__Group_0__0 ) ) | ( ( rule__InputOperation__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:650:1: ( ( rule__InputOperation__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:650:1: ( ( rule__InputOperation__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:651:1: ( rule__InputOperation__Group_0__0 )
                    {
                     before(grammarAccess.getInputOperationAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:652:1: ( rule__InputOperation__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:652:2: rule__InputOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InputOperation__Group_0__0_in_rule__InputOperation__Alternatives1374);
                    rule__InputOperation__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInputOperationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:656:6: ( ( rule__InputOperation__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:656:6: ( ( rule__InputOperation__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:657:1: ( rule__InputOperation__Group_1__0 )
                    {
                     before(grammarAccess.getInputOperationAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:658:1: ( rule__InputOperation__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:658:2: rule__InputOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InputOperation__Group_1__0_in_rule__InputOperation__Alternatives1392);
                    rule__InputOperation__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInputOperationAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Alternatives


    // $ANTLR start rule__VariablePath__Alternatives_2_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:667:1: rule__VariablePath__Alternatives_2_1 : ( ( RULE_ID ) | ( ( rule__VariablePath__Group_2_1_1__0 ) ) );
    public final void rule__VariablePath__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:671:1: ( ( RULE_ID ) | ( ( rule__VariablePath__Group_2_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_LPAREN) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("667:1: rule__VariablePath__Alternatives_2_1 : ( ( RULE_ID ) | ( ( rule__VariablePath__Group_2_1_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:672:1: ( RULE_ID )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:672:1: ( RULE_ID )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:673:1: RULE_ID
                    {
                     before(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_2_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_2_11425); 
                     after(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:678:6: ( ( rule__VariablePath__Group_2_1_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:678:6: ( ( rule__VariablePath__Group_2_1_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:679:1: ( rule__VariablePath__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getVariablePathAccess().getGroup_2_1_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:680:1: ( rule__VariablePath__Group_2_1_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:680:2: rule__VariablePath__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__0_in_rule__VariablePath__Alternatives_2_11442);
                    rule__VariablePath__Group_2_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariablePathAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Alternatives_2_1


    // $ANTLR start rule__Program__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:691:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:695:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:696:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01473);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01476);
            rule__Program__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__0


    // $ANTLR start rule__Program__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:703:1: rule__Program__Group__0__Impl : ( 'main' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:707:1: ( ( 'main' ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:708:1: ( 'main' )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:708:1: ( 'main' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:709:1: 'main'
            {
             before(grammarAccess.getProgramAccess().getMainKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Program__Group__0__Impl1504); 
             after(grammarAccess.getProgramAccess().getMainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__0__Impl


    // $ANTLR start rule__Program__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:722:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:726:1: ( rule__Program__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:727:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11535);
            rule__Program__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__1


    // $ANTLR start rule__Program__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:733:1: rule__Program__Group__1__Impl : ( ( rule__Program__MainAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:737:1: ( ( ( rule__Program__MainAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:738:1: ( ( rule__Program__MainAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:738:1: ( ( rule__Program__MainAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:739:1: ( rule__Program__MainAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:740:1: ( rule__Program__MainAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:740:2: rule__Program__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1562);
            rule__Program__MainAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__Group__1__Impl


    // $ANTLR start rule__MainProcess__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:754:1: rule__MainProcess__Group__0 : rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 ;
    public final void rule__MainProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:758:1: ( rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:759:2: rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01596);
            rule__MainProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01599);
            rule__MainProcess__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__0


    // $ANTLR start rule__MainProcess__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:766:1: rule__MainProcess__Group__0__Impl : ( () ) ;
    public final void rule__MainProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:770:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:771:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:771:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:772:1: ()
            {
             before(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:773:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:775:1: 
            {
            }

             after(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__0__Impl


    // $ANTLR start rule__MainProcess__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:785:1: rule__MainProcess__Group__1 : rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 ;
    public final void rule__MainProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:789:1: ( rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:790:2: rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11657);
            rule__MainProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11660);
            rule__MainProcess__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__1


    // $ANTLR start rule__MainProcess__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:797:1: rule__MainProcess__Group__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__MainProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:801:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:802:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:802:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:803:1: RULE_LCURLY
            {
             before(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1687); 
             after(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__1__Impl


    // $ANTLR start rule__MainProcess__Group__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:814:1: rule__MainProcess__Group__2 : rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 ;
    public final void rule__MainProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:818:1: ( rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:819:2: rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21716);
            rule__MainProcess__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21719);
            rule__MainProcess__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__2


    // $ANTLR start rule__MainProcess__Group__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:826:1: rule__MainProcess__Group__2__Impl : ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) ;
    public final void rule__MainProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:830:1: ( ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:831:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:831:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:832:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementAssignment_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:833:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:833:2: rule__MainProcess__ParallelStatementAssignment_2
            {
            pushFollow(FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1746);
            rule__MainProcess__ParallelStatementAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMainProcessAccess().getParallelStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__2__Impl


    // $ANTLR start rule__MainProcess__Group__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:843:1: rule__MainProcess__Group__3 : rule__MainProcess__Group__3__Impl ;
    public final void rule__MainProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:847:1: ( rule__MainProcess__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:848:2: rule__MainProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31776);
            rule__MainProcess__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__3


    // $ANTLR start rule__MainProcess__Group__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:854:1: rule__MainProcess__Group__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__MainProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:858:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:859:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:859:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:860:1: RULE_RCURLY
            {
             before(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1803); 
             after(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__Group__3__Impl


    // $ANTLR start rule__Process__Group_0__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:879:1: rule__Process__Group_0__0 : rule__Process__Group_0__0__Impl rule__Process__Group_0__1 ;
    public final void rule__Process__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:883:1: ( rule__Process__Group_0__0__Impl rule__Process__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:884:2: rule__Process__Group_0__0__Impl rule__Process__Group_0__1
            {
            pushFollow(FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01840);
            rule__Process__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01843);
            rule__Process__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__0


    // $ANTLR start rule__Process__Group_0__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:891:1: rule__Process__Group_0__0__Impl : ( () ) ;
    public final void rule__Process__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:895:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:896:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:896:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:897:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:898:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:900:1: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__0__Impl


    // $ANTLR start rule__Process__Group_0__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:910:1: rule__Process__Group_0__1 : rule__Process__Group_0__1__Impl rule__Process__Group_0__2 ;
    public final void rule__Process__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:914:1: ( rule__Process__Group_0__1__Impl rule__Process__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:915:2: rule__Process__Group_0__1__Impl rule__Process__Group_0__2
            {
            pushFollow(FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11901);
            rule__Process__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11904);
            rule__Process__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__1


    // $ANTLR start rule__Process__Group_0__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:922:1: rule__Process__Group_0__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__Process__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:926:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:927:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:927:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:928:1: RULE_LCURLY
            {
             before(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1931); 
             after(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__1__Impl


    // $ANTLR start rule__Process__Group_0__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:939:1: rule__Process__Group_0__2 : rule__Process__Group_0__2__Impl rule__Process__Group_0__3 ;
    public final void rule__Process__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:943:1: ( rule__Process__Group_0__2__Impl rule__Process__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:944:2: rule__Process__Group_0__2__Impl rule__Process__Group_0__3
            {
            pushFollow(FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__21960);
            rule__Process__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__21963);
            rule__Process__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__2


    // $ANTLR start rule__Process__Group_0__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:951:1: rule__Process__Group_0__2__Impl : ( ( rule__Process__ChildrenAssignment_0_2 ) ) ;
    public final void rule__Process__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:955:1: ( ( ( rule__Process__ChildrenAssignment_0_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:956:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:956:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:957:1: ( rule__Process__ChildrenAssignment_0_2 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_0_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:958:1: ( rule__Process__ChildrenAssignment_0_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:958:2: rule__Process__ChildrenAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl1990);
            rule__Process__ChildrenAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getChildrenAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__2__Impl


    // $ANTLR start rule__Process__Group_0__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:968:1: rule__Process__Group_0__3 : rule__Process__Group_0__3__Impl ;
    public final void rule__Process__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:972:1: ( rule__Process__Group_0__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:973:2: rule__Process__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__32020);
            rule__Process__Group_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__3


    // $ANTLR start rule__Process__Group_0__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:979:1: rule__Process__Group_0__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__Process__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:983:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:984:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:984:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:985:1: RULE_RCURLY
            {
             before(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl2047); 
             after(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_0__3__Impl


    // $ANTLR start rule__Process__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1004:1: rule__Process__Group_1__0 : rule__Process__Group_1__0__Impl rule__Process__Group_1__1 ;
    public final void rule__Process__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1008:1: ( rule__Process__Group_1__0__Impl rule__Process__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1009:2: rule__Process__Group_1__0__Impl rule__Process__Group_1__1
            {
            pushFollow(FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__02084);
            rule__Process__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__02087);
            rule__Process__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_1__0


    // $ANTLR start rule__Process__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1016:1: rule__Process__Group_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Process__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1020:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1021:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1021:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1022:1: RULE_LPAREN
            {
             before(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl2114); 
             after(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_1__0__Impl


    // $ANTLR start rule__Process__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1033:1: rule__Process__Group_1__1 : rule__Process__Group_1__1__Impl rule__Process__Group_1__2 ;
    public final void rule__Process__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1037:1: ( rule__Process__Group_1__1__Impl rule__Process__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1038:2: rule__Process__Group_1__1__Impl rule__Process__Group_1__2
            {
            pushFollow(FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__12143);
            rule__Process__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__12146);
            rule__Process__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_1__1


    // $ANTLR start rule__Process__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1045:1: rule__Process__Group_1__1__Impl : ( ( rule__Process__ChildrenAssignment_1_1 ) ) ;
    public final void rule__Process__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1049:1: ( ( ( rule__Process__ChildrenAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1050:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1050:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1051:1: ( rule__Process__ChildrenAssignment_1_1 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1052:1: ( rule__Process__ChildrenAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1052:2: rule__Process__ChildrenAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl2173);
            rule__Process__ChildrenAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getChildrenAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_1__1__Impl


    // $ANTLR start rule__Process__Group_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1062:1: rule__Process__Group_1__2 : rule__Process__Group_1__2__Impl ;
    public final void rule__Process__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1066:1: ( rule__Process__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1067:2: rule__Process__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__22203);
            rule__Process__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_1__2


    // $ANTLR start rule__Process__Group_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1073:1: rule__Process__Group_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Process__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1077:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1078:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1078:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1079:1: RULE_RPAREN
            {
             before(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl2230); 
             after(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_1__2__Impl


    // $ANTLR start rule__ParallelStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1096:1: rule__ParallelStatement__Group__0 : rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 ;
    public final void rule__ParallelStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1100:1: ( rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1101:2: rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__02265);
            rule__ParallelStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__02268);
            rule__ParallelStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group__0


    // $ANTLR start rule__ParallelStatement__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1108:1: rule__ParallelStatement__Group__0__Impl : ( () ) ;
    public final void rule__ParallelStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1112:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1113:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1113:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1114:1: ()
            {
             before(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1115:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1117:1: 
            {
            }

             after(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group__0__Impl


    // $ANTLR start rule__ParallelStatement__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1127:1: rule__ParallelStatement__Group__1 : rule__ParallelStatement__Group__1__Impl ;
    public final void rule__ParallelStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1131:1: ( rule__ParallelStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1132:2: rule__ParallelStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__12326);
            rule__ParallelStatement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group__1


    // $ANTLR start rule__ParallelStatement__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1138:1: rule__ParallelStatement__Group__1__Impl : ( ( rule__ParallelStatement__Group_1__0 ) ) ;
    public final void rule__ParallelStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1142:1: ( ( ( rule__ParallelStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1143:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1143:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1144:1: ( rule__ParallelStatement__Group_1__0 )
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1145:1: ( rule__ParallelStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1145:2: rule__ParallelStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl2353);
            rule__ParallelStatement__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group__1__Impl


    // $ANTLR start rule__ParallelStatement__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1159:1: rule__ParallelStatement__Group_1__0 : rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 ;
    public final void rule__ParallelStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1163:1: ( rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1164:2: rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02387);
            rule__ParallelStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02390);
            rule__ParallelStatement__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1__0


    // $ANTLR start rule__ParallelStatement__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1171:1: rule__ParallelStatement__Group_1__0__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__ParallelStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1175:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1176:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1176:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1177:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1178:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1178:2: rule__ParallelStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2417);
            rule__ParallelStatement__ChildrenAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1__0__Impl


    // $ANTLR start rule__ParallelStatement__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1188:1: rule__ParallelStatement__Group_1__1 : rule__ParallelStatement__Group_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1192:1: ( rule__ParallelStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1193:2: rule__ParallelStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12447);
            rule__ParallelStatement__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1__1


    // $ANTLR start rule__ParallelStatement__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1199:1: rule__ParallelStatement__Group_1__1__Impl : ( ( rule__ParallelStatement__Group_1_1__0 )* ) ;
    public final void rule__ParallelStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1203:1: ( ( ( rule__ParallelStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1204:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1204:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1205:1: ( rule__ParallelStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1206:1: ( rule__ParallelStatement__Group_1_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_VERT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1206:2: rule__ParallelStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2474);
            	    rule__ParallelStatement__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getParallelStatementAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1__1__Impl


    // $ANTLR start rule__ParallelStatement__Group_1_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1220:1: rule__ParallelStatement__Group_1_1__0 : rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 ;
    public final void rule__ParallelStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1224:1: ( rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1225:2: rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02509);
            rule__ParallelStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02512);
            rule__ParallelStatement__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1_1__0


    // $ANTLR start rule__ParallelStatement__Group_1_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1232:1: rule__ParallelStatement__Group_1_1__0__Impl : ( RULE_VERT ) ;
    public final void rule__ParallelStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1236:1: ( ( RULE_VERT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1237:1: ( RULE_VERT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1237:1: ( RULE_VERT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1238:1: RULE_VERT
            {
             before(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0()); 
            match(input,RULE_VERT,FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2539); 
             after(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1_1__0__Impl


    // $ANTLR start rule__ParallelStatement__Group_1_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1249:1: rule__ParallelStatement__Group_1_1__1 : rule__ParallelStatement__Group_1_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1253:1: ( rule__ParallelStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1254:2: rule__ParallelStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12568);
            rule__ParallelStatement__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1_1__1


    // $ANTLR start rule__ParallelStatement__Group_1_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1260:1: rule__ParallelStatement__Group_1_1__1__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__ParallelStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1264:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1265:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1265:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1266:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1267:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1267:2: rule__ParallelStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2595);
            rule__ParallelStatement__ChildrenAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__Group_1_1__1__Impl


    // $ANTLR start rule__SequenceStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1281:1: rule__SequenceStatement__Group__0 : rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 ;
    public final void rule__SequenceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1285:1: ( rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1286:2: rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02629);
            rule__SequenceStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02632);
            rule__SequenceStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group__0


    // $ANTLR start rule__SequenceStatement__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1293:1: rule__SequenceStatement__Group__0__Impl : ( () ) ;
    public final void rule__SequenceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1297:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1298:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1298:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1299:1: ()
            {
             before(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1300:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1302:1: 
            {
            }

             after(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group__0__Impl


    // $ANTLR start rule__SequenceStatement__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1312:1: rule__SequenceStatement__Group__1 : rule__SequenceStatement__Group__1__Impl ;
    public final void rule__SequenceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1316:1: ( rule__SequenceStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1317:2: rule__SequenceStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12690);
            rule__SequenceStatement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group__1


    // $ANTLR start rule__SequenceStatement__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1323:1: rule__SequenceStatement__Group__1__Impl : ( ( rule__SequenceStatement__Group_1__0 ) ) ;
    public final void rule__SequenceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1327:1: ( ( ( rule__SequenceStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1328:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1328:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1329:1: ( rule__SequenceStatement__Group_1__0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1330:1: ( rule__SequenceStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1330:2: rule__SequenceStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2717);
            rule__SequenceStatement__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getSequenceStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group__1__Impl


    // $ANTLR start rule__SequenceStatement__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1344:1: rule__SequenceStatement__Group_1__0 : rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 ;
    public final void rule__SequenceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1348:1: ( rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1349:2: rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02751);
            rule__SequenceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02754);
            rule__SequenceStatement__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1__0


    // $ANTLR start rule__SequenceStatement__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1356:1: rule__SequenceStatement__Group_1__0__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__SequenceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1360:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1361:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1361:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1362:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1363:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1363:2: rule__SequenceStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2781);
            rule__SequenceStatement__ChildrenAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1__0__Impl


    // $ANTLR start rule__SequenceStatement__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1373:1: rule__SequenceStatement__Group_1__1 : rule__SequenceStatement__Group_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1377:1: ( rule__SequenceStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1378:2: rule__SequenceStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12811);
            rule__SequenceStatement__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1__1


    // $ANTLR start rule__SequenceStatement__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1384:1: rule__SequenceStatement__Group_1__1__Impl : ( ( rule__SequenceStatement__Group_1_1__0 )* ) ;
    public final void rule__SequenceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1388:1: ( ( ( rule__SequenceStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1389:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1389:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1390:1: ( rule__SequenceStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1391:1: ( rule__SequenceStatement__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SEMICOLON) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1391:2: rule__SequenceStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2838);
            	    rule__SequenceStatement__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSequenceStatementAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1__1__Impl


    // $ANTLR start rule__SequenceStatement__Group_1_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1405:1: rule__SequenceStatement__Group_1_1__0 : rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 ;
    public final void rule__SequenceStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1409:1: ( rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1410:2: rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02873);
            rule__SequenceStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02876);
            rule__SequenceStatement__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1_1__0


    // $ANTLR start rule__SequenceStatement__Group_1_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1417:1: rule__SequenceStatement__Group_1_1__0__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SequenceStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1421:1: ( ( RULE_SEMICOLON ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1422:1: ( RULE_SEMICOLON )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1422:1: ( RULE_SEMICOLON )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1423:1: RULE_SEMICOLON
            {
             before(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0()); 
            match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2903); 
             after(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1_1__0__Impl


    // $ANTLR start rule__SequenceStatement__Group_1_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1434:1: rule__SequenceStatement__Group_1_1__1 : rule__SequenceStatement__Group_1_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1438:1: ( rule__SequenceStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1439:2: rule__SequenceStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12932);
            rule__SequenceStatement__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1_1__1


    // $ANTLR start rule__SequenceStatement__Group_1_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1445:1: rule__SequenceStatement__Group_1_1__1__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__SequenceStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1449:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1450:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1450:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1451:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1452:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1452:2: rule__SequenceStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl2959);
            rule__SequenceStatement__ChildrenAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__Group_1_1__1__Impl


    // $ANTLR start rule__BasicStatement__Group_0__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1466:1: rule__BasicStatement__Group_0__0 : rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 ;
    public final void rule__BasicStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1470:1: ( rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1471:2: rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__02993);
            rule__BasicStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__02996);
            rule__BasicStatement__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_0__0


    // $ANTLR start rule__BasicStatement__Group_0__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1478:1: rule__BasicStatement__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1482:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1483:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1483:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1484:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1485:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1487:1: 
            {
            }

             after(grammarAccess.getBasicStatementAccess().getProcessAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_0__0__Impl


    // $ANTLR start rule__BasicStatement__Group_0__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1497:1: rule__BasicStatement__Group_0__1 : rule__BasicStatement__Group_0__1__Impl ;
    public final void rule__BasicStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1501:1: ( rule__BasicStatement__Group_0__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1502:2: rule__BasicStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__13054);
            rule__BasicStatement__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_0__1


    // $ANTLR start rule__BasicStatement__Group_0__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1508:1: rule__BasicStatement__Group_0__1__Impl : ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) ;
    public final void rule__BasicStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1512:1: ( ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1513:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1513:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1514:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAssignment_0_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1515:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1515:2: rule__BasicStatement__ProcessAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl3081);
            rule__BasicStatement__ProcessAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getProcessAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_0__1__Impl


    // $ANTLR start rule__BasicStatement__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1529:1: rule__BasicStatement__Group_1__0 : rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 ;
    public final void rule__BasicStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1533:1: ( rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1534:2: rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__03115);
            rule__BasicStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__03118);
            rule__BasicStatement__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_1__0


    // $ANTLR start rule__BasicStatement__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1541:1: rule__BasicStatement__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1545:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1546:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1546:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1547:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1548:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1550:1: 
            {
            }

             after(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_1__0__Impl


    // $ANTLR start rule__BasicStatement__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1560:1: rule__BasicStatement__Group_1__1 : rule__BasicStatement__Group_1__1__Impl ;
    public final void rule__BasicStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1564:1: ( rule__BasicStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1565:2: rule__BasicStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__13176);
            rule__BasicStatement__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_1__1


    // $ANTLR start rule__BasicStatement__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1571:1: rule__BasicStatement__Group_1__1__Impl : ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) ;
    public final void rule__BasicStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1575:1: ( ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1576:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1576:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1577:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1578:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1578:2: rule__BasicStatement__AssignStatementAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl3203);
            rule__BasicStatement__AssignStatementAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getAssignStatementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_1__1__Impl


    // $ANTLR start rule__BasicStatement__Group_2__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1592:1: rule__BasicStatement__Group_2__0 : rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 ;
    public final void rule__BasicStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1596:1: ( rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1597:2: rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__03237);
            rule__BasicStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__03240);
            rule__BasicStatement__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_2__0


    // $ANTLR start rule__BasicStatement__Group_2__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1604:1: rule__BasicStatement__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1608:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1609:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1609:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1610:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1611:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1613:1: 
            {
            }

             after(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_2__0__Impl


    // $ANTLR start rule__BasicStatement__Group_2__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1623:1: rule__BasicStatement__Group_2__1 : rule__BasicStatement__Group_2__1__Impl ;
    public final void rule__BasicStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1627:1: ( rule__BasicStatement__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1628:2: rule__BasicStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__13298);
            rule__BasicStatement__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_2__1


    // $ANTLR start rule__BasicStatement__Group_2__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1634:1: rule__BasicStatement__Group_2__1__Impl : ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) ) ;
    public final void rule__BasicStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1638:1: ( ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1639:1: ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1639:1: ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1640:1: ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1641:1: ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1641:2: rule__BasicStatement__PostIncrementStatementAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__PostIncrementStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl3325);
            rule__BasicStatement__PostIncrementStatementAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_2__1__Impl


    // $ANTLR start rule__BasicStatement__Group_3__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1655:1: rule__BasicStatement__Group_3__0 : rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1 ;
    public final void rule__BasicStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1659:1: ( rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1660:2: rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_3__0__Impl_in_rule__BasicStatement__Group_3__03359);
            rule__BasicStatement__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_3__1_in_rule__BasicStatement__Group_3__03362);
            rule__BasicStatement__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_3__0


    // $ANTLR start rule__BasicStatement__Group_3__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1667:1: rule__BasicStatement__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1671:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1672:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1672:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1673:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1674:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1676:1: 
            {
            }

             after(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_3__0__Impl


    // $ANTLR start rule__BasicStatement__Group_3__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1686:1: rule__BasicStatement__Group_3__1 : rule__BasicStatement__Group_3__1__Impl ;
    public final void rule__BasicStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1690:1: ( rule__BasicStatement__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1691:2: rule__BasicStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_3__1__Impl_in_rule__BasicStatement__Group_3__13420);
            rule__BasicStatement__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_3__1


    // $ANTLR start rule__BasicStatement__Group_3__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1697:1: rule__BasicStatement__Group_3__1__Impl : ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) ) ;
    public final void rule__BasicStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1701:1: ( ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1702:1: ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1702:1: ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1703:1: ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1704:1: ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1704:2: rule__BasicStatement__PostDecrementStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__PostDecrementStatementAssignment_3_1_in_rule__BasicStatement__Group_3__1__Impl3447);
            rule__BasicStatement__PostDecrementStatementAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_3__1__Impl


    // $ANTLR start rule__BasicStatement__Group_4__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1718:1: rule__BasicStatement__Group_4__0 : rule__BasicStatement__Group_4__0__Impl rule__BasicStatement__Group_4__1 ;
    public final void rule__BasicStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1722:1: ( rule__BasicStatement__Group_4__0__Impl rule__BasicStatement__Group_4__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1723:2: rule__BasicStatement__Group_4__0__Impl rule__BasicStatement__Group_4__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_4__0__Impl_in_rule__BasicStatement__Group_4__03481);
            rule__BasicStatement__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_4__1_in_rule__BasicStatement__Group_4__03484);
            rule__BasicStatement__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_4__0


    // $ANTLR start rule__BasicStatement__Group_4__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1730:1: rule__BasicStatement__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1734:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1735:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1735:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1736:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_4_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1737:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1739:1: 
            {
            }

             after(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_4__0__Impl


    // $ANTLR start rule__BasicStatement__Group_4__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1749:1: rule__BasicStatement__Group_4__1 : rule__BasicStatement__Group_4__1__Impl ;
    public final void rule__BasicStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1753:1: ( rule__BasicStatement__Group_4__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1754:2: rule__BasicStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_4__1__Impl_in_rule__BasicStatement__Group_4__13542);
            rule__BasicStatement__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_4__1


    // $ANTLR start rule__BasicStatement__Group_4__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1760:1: rule__BasicStatement__Group_4__1__Impl : ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) ) ;
    public final void rule__BasicStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1764:1: ( ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1765:1: ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1765:1: ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1766:1: ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAssignment_4_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1767:1: ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1767:2: rule__BasicStatement__NDChoiceStatementAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__NDChoiceStatementAssignment_4_1_in_rule__BasicStatement__Group_4__1__Impl3569);
            rule__BasicStatement__NDChoiceStatementAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__Group_4__1__Impl


    // $ANTLR start rule__AssignStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1781:1: rule__AssignStatement__Group__0 : rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 ;
    public final void rule__AssignStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1785:1: ( rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1786:2: rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03603);
            rule__AssignStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03606);
            rule__AssignStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__0


    // $ANTLR start rule__AssignStatement__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1793:1: rule__AssignStatement__Group__0__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1797:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1798:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1798:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1799:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1800:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1802:1: 
            {
            }

             after(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__0__Impl


    // $ANTLR start rule__AssignStatement__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1812:1: rule__AssignStatement__Group__1 : rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 ;
    public final void rule__AssignStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1816:1: ( rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1817:2: rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13664);
            rule__AssignStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13667);
            rule__AssignStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__1


    // $ANTLR start rule__AssignStatement__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1824:1: rule__AssignStatement__Group__1__Impl : ( ( rule__AssignStatement__NameAssignment_1 ) ) ;
    public final void rule__AssignStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1828:1: ( ( ( rule__AssignStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1829:1: ( ( rule__AssignStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1829:1: ( ( rule__AssignStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1830:1: ( rule__AssignStatement__NameAssignment_1 )
            {
             before(grammarAccess.getAssignStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1831:1: ( rule__AssignStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1831:2: rule__AssignStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AssignStatement__NameAssignment_1_in_rule__AssignStatement__Group__1__Impl3694);
            rule__AssignStatement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssignStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__1__Impl


    // $ANTLR start rule__AssignStatement__Group__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1841:1: rule__AssignStatement__Group__2 : rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 ;
    public final void rule__AssignStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1845:1: ( rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1846:2: rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23724);
            rule__AssignStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23727);
            rule__AssignStatement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__2


    // $ANTLR start rule__AssignStatement__Group__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1853:1: rule__AssignStatement__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__AssignStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1857:1: ( ( RULE_ASSIGN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1858:1: ( RULE_ASSIGN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1858:1: ( RULE_ASSIGN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1859:1: RULE_ASSIGN
            {
             before(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3754); 
             after(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__2__Impl


    // $ANTLR start rule__AssignStatement__Group__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1870:1: rule__AssignStatement__Group__3 : rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4 ;
    public final void rule__AssignStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1874:1: ( rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1875:2: rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33783);
            rule__AssignStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__4_in_rule__AssignStatement__Group__33786);
            rule__AssignStatement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__3


    // $ANTLR start rule__AssignStatement__Group__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1882:1: rule__AssignStatement__Group__3__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1886:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1887:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1887:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1888:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionAction_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1889:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1891:1: 
            {
            }

             after(grammarAccess.getAssignStatementAccess().getExpressionAction_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__3__Impl


    // $ANTLR start rule__AssignStatement__Group__4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1901:1: rule__AssignStatement__Group__4 : rule__AssignStatement__Group__4__Impl ;
    public final void rule__AssignStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1905:1: ( rule__AssignStatement__Group__4__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1906:2: rule__AssignStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__4__Impl_in_rule__AssignStatement__Group__43844);
            rule__AssignStatement__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__4


    // $ANTLR start rule__AssignStatement__Group__4__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1912:1: rule__AssignStatement__Group__4__Impl : ( ( rule__AssignStatement__ExpressionAssignment_4 ) ) ;
    public final void rule__AssignStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1916:1: ( ( ( rule__AssignStatement__ExpressionAssignment_4 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1917:1: ( ( rule__AssignStatement__ExpressionAssignment_4 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1917:1: ( ( rule__AssignStatement__ExpressionAssignment_4 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1918:1: ( rule__AssignStatement__ExpressionAssignment_4 )
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionAssignment_4()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1919:1: ( rule__AssignStatement__ExpressionAssignment_4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1919:2: rule__AssignStatement__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__AssignStatement__ExpressionAssignment_4_in_rule__AssignStatement__Group__4__Impl3871);
            rule__AssignStatement__ExpressionAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAssignStatementAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__Group__4__Impl


    // $ANTLR start rule__PostIncrementStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1939:1: rule__PostIncrementStatement__Group__0 : rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1 ;
    public final void rule__PostIncrementStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1943:1: ( rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1944:2: rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__0__Impl_in_rule__PostIncrementStatement__Group__03911);
            rule__PostIncrementStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__1_in_rule__PostIncrementStatement__Group__03914);
            rule__PostIncrementStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__Group__0


    // $ANTLR start rule__PostIncrementStatement__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1951:1: rule__PostIncrementStatement__Group__0__Impl : ( () ) ;
    public final void rule__PostIncrementStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1955:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1956:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1956:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1957:1: ()
            {
             before(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1958:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1960:1: 
            {
            }

             after(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__Group__0__Impl


    // $ANTLR start rule__PostIncrementStatement__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1970:1: rule__PostIncrementStatement__Group__1 : rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2 ;
    public final void rule__PostIncrementStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1974:1: ( rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1975:2: rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__1__Impl_in_rule__PostIncrementStatement__Group__13972);
            rule__PostIncrementStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__2_in_rule__PostIncrementStatement__Group__13975);
            rule__PostIncrementStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__Group__1


    // $ANTLR start rule__PostIncrementStatement__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1982:1: rule__PostIncrementStatement__Group__1__Impl : ( ( rule__PostIncrementStatement__NameAssignment_1 ) ) ;
    public final void rule__PostIncrementStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1986:1: ( ( ( rule__PostIncrementStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1987:1: ( ( rule__PostIncrementStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1987:1: ( ( rule__PostIncrementStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1988:1: ( rule__PostIncrementStatement__NameAssignment_1 )
            {
             before(grammarAccess.getPostIncrementStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1989:1: ( rule__PostIncrementStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1989:2: rule__PostIncrementStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__NameAssignment_1_in_rule__PostIncrementStatement__Group__1__Impl4002);
            rule__PostIncrementStatement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPostIncrementStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__Group__1__Impl


    // $ANTLR start rule__PostIncrementStatement__Group__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1999:1: rule__PostIncrementStatement__Group__2 : rule__PostIncrementStatement__Group__2__Impl ;
    public final void rule__PostIncrementStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2003:1: ( rule__PostIncrementStatement__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2004:2: rule__PostIncrementStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__2__Impl_in_rule__PostIncrementStatement__Group__24032);
            rule__PostIncrementStatement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__Group__2


    // $ANTLR start rule__PostIncrementStatement__Group__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2010:1: rule__PostIncrementStatement__Group__2__Impl : ( RULE_CHOICE ) ;
    public final void rule__PostIncrementStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2014:1: ( ( RULE_CHOICE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2015:1: ( RULE_CHOICE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2015:1: ( RULE_CHOICE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2016:1: RULE_CHOICE
            {
             before(grammarAccess.getPostIncrementStatementAccess().getCHOICETerminalRuleCall_2()); 
            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rule__PostIncrementStatement__Group__2__Impl4059); 
             after(grammarAccess.getPostIncrementStatementAccess().getCHOICETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__Group__2__Impl


    // $ANTLR start rule__PostDecrementStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2033:1: rule__PostDecrementStatement__Group__0 : rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1 ;
    public final void rule__PostDecrementStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2037:1: ( rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2038:2: rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__0__Impl_in_rule__PostDecrementStatement__Group__04094);
            rule__PostDecrementStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__1_in_rule__PostDecrementStatement__Group__04097);
            rule__PostDecrementStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__Group__0


    // $ANTLR start rule__PostDecrementStatement__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2045:1: rule__PostDecrementStatement__Group__0__Impl : ( () ) ;
    public final void rule__PostDecrementStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2049:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2050:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2050:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2051:1: ()
            {
             before(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2052:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2054:1: 
            {
            }

             after(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__Group__0__Impl


    // $ANTLR start rule__PostDecrementStatement__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2064:1: rule__PostDecrementStatement__Group__1 : rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2 ;
    public final void rule__PostDecrementStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2068:1: ( rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2069:2: rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__1__Impl_in_rule__PostDecrementStatement__Group__14155);
            rule__PostDecrementStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__2_in_rule__PostDecrementStatement__Group__14158);
            rule__PostDecrementStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__Group__1


    // $ANTLR start rule__PostDecrementStatement__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2076:1: rule__PostDecrementStatement__Group__1__Impl : ( ( rule__PostDecrementStatement__NameAssignment_1 ) ) ;
    public final void rule__PostDecrementStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2080:1: ( ( ( rule__PostDecrementStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2081:1: ( ( rule__PostDecrementStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2081:1: ( ( rule__PostDecrementStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2082:1: ( rule__PostDecrementStatement__NameAssignment_1 )
            {
             before(grammarAccess.getPostDecrementStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2083:1: ( rule__PostDecrementStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2083:2: rule__PostDecrementStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__NameAssignment_1_in_rule__PostDecrementStatement__Group__1__Impl4185);
            rule__PostDecrementStatement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPostDecrementStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__Group__1__Impl


    // $ANTLR start rule__PostDecrementStatement__Group__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2093:1: rule__PostDecrementStatement__Group__2 : rule__PostDecrementStatement__Group__2__Impl ;
    public final void rule__PostDecrementStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2097:1: ( rule__PostDecrementStatement__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2098:2: rule__PostDecrementStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__2__Impl_in_rule__PostDecrementStatement__Group__24215);
            rule__PostDecrementStatement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__Group__2


    // $ANTLR start rule__PostDecrementStatement__Group__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2104:1: rule__PostDecrementStatement__Group__2__Impl : ( RULE_DECREMENT ) ;
    public final void rule__PostDecrementStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2108:1: ( ( RULE_DECREMENT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2109:1: ( RULE_DECREMENT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2109:1: ( RULE_DECREMENT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2110:1: RULE_DECREMENT
            {
             before(grammarAccess.getPostDecrementStatementAccess().getDECREMENTTerminalRuleCall_2()); 
            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rule__PostDecrementStatement__Group__2__Impl4242); 
             after(grammarAccess.getPostDecrementStatementAccess().getDECREMENTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__Group__2__Impl


    // $ANTLR start rule__Expression__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2127:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2131:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2132:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04277);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04280);
            rule__Expression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__0


    // $ANTLR start rule__Expression__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2139:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2143:1: ( ( ruleTerminalExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2144:1: ( ruleTerminalExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2144:1: ( ruleTerminalExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2145:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl4307);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__0__Impl


    // $ANTLR start rule__Expression__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2156:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2160:1: ( rule__Expression__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2161:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14336);
            rule__Expression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__1


    // $ANTLR start rule__Expression__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2167:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2171:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2172:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2172:1: ( ( rule__Expression__Group_1__0 )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2173:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2174:1: ( rule__Expression__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_PLUS && LA9_0<=RULE_DIVIDE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2174:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4363);
                    rule__Expression__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__1__Impl


    // $ANTLR start rule__Expression__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2188:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2192:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2193:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04398);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04401);
            rule__Expression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__0


    // $ANTLR start rule__Expression__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2200:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2204:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2205:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2205:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2206:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2207:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2209:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__0__Impl


    // $ANTLR start rule__Expression__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2219:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2223:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2224:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14459);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14462);
            rule__Expression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__1


    // $ANTLR start rule__Expression__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2231:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2235:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2236:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2236:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2237:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2238:1: ( rule__Expression__OpAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2238:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4489);
            rule__Expression__OpAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__1__Impl


    // $ANTLR start rule__Expression__Group_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2248:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2252:1: ( rule__Expression__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2253:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24519);
            rule__Expression__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__2


    // $ANTLR start rule__Expression__Group_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2259:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2263:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2264:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2264:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2265:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2266:1: ( rule__Expression__RightAssignment_1_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2266:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4546);
            rule__Expression__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2282:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2286:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2287:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04582);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04585);
            rule__TerminalExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__0


    // $ANTLR start rule__TerminalExpression__Group_0__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2294:1: rule__TerminalExpression__Group_0__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2298:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2299:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2299:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2300:1: RULE_LPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4612); 
             after(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2311:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2315:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2316:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14641);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14644);
            rule__TerminalExpression__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__1


    // $ANTLR start rule__TerminalExpression__Group_0__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2323:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2327:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2328:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2328:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2329:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4671);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2340:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2344:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2345:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24700);
            rule__TerminalExpression__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__2


    // $ANTLR start rule__TerminalExpression__Group_0__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2351:1: rule__TerminalExpression__Group_0__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2355:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2356:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2356:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2357:1: RULE_RPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4727); 
             after(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__2__Impl


    // $ANTLR start rule__TerminalExpression__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2374:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2378:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2379:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04762);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04765);
            rule__TerminalExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__0


    // $ANTLR start rule__TerminalExpression__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2386:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2390:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2391:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2391:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2392:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2393:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2395:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2405:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2409:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2410:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14823);
            rule__TerminalExpression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__1


    // $ANTLR start rule__TerminalExpression__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2416:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2420:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2421:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2421:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2422:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2423:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2423:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4850);
            rule__TerminalExpression__ValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_2__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2437:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2441:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2442:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04884);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04887);
            rule__TerminalExpression__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__0


    // $ANTLR start rule__TerminalExpression__Group_2__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2449:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2453:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2454:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2454:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2455:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2456:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2458:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_2__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2468:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2472:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2473:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14945);
            rule__TerminalExpression__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__1


    // $ANTLR start rule__TerminalExpression__Group_2__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2479:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2483:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2484:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2484:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2485:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2486:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2486:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4972);
            rule__TerminalExpression__ValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_3__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2500:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2504:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2505:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__05006);
            rule__TerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__05009);
            rule__TerminalExpression__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__0


    // $ANTLR start rule__TerminalExpression__Group_3__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2512:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2516:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2517:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2517:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2518:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2519:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2521:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_3__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2531:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2535:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2536:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__15067);
            rule__TerminalExpression__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__1


    // $ANTLR start rule__TerminalExpression__Group_3__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2542:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2546:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2547:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2547:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2548:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2549:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2549:2: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl5094);
            rule__TerminalExpression__ValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_3__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2563:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2567:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2568:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__05128);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__05131);
            rule__TerminalExpression__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__0


    // $ANTLR start rule__TerminalExpression__Group_4__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2575:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2579:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2580:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2580:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2581:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringAction_4_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2582:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2584:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getStringAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2594:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2598:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2599:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__15189);
            rule__TerminalExpression__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__1


    // $ANTLR start rule__TerminalExpression__Group_4__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2605:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2609:1: ( ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2610:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2610:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2611:1: ( rule__TerminalExpression__ValueAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2612:1: ( rule__TerminalExpression__ValueAssignment_4_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2612:2: rule__TerminalExpression__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl5216);
            rule__TerminalExpression__ValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_4__1__Impl


    // $ANTLR start rule__NDChoiceStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2626:1: rule__NDChoiceStatement__Group__0 : rule__NDChoiceStatement__Group__0__Impl rule__NDChoiceStatement__Group__1 ;
    public final void rule__NDChoiceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2630:1: ( rule__NDChoiceStatement__Group__0__Impl rule__NDChoiceStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2631:2: rule__NDChoiceStatement__Group__0__Impl rule__NDChoiceStatement__Group__1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__0__Impl_in_rule__NDChoiceStatement__Group__05250);
            rule__NDChoiceStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__1_in_rule__NDChoiceStatement__Group__05253);
            rule__NDChoiceStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group__0


    // $ANTLR start rule__NDChoiceStatement__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2638:1: rule__NDChoiceStatement__Group__0__Impl : ( () ) ;
    public final void rule__NDChoiceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2642:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2643:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2643:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2644:1: ()
            {
             before(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2645:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2647:1: 
            {
            }

             after(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group__0__Impl


    // $ANTLR start rule__NDChoiceStatement__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2657:1: rule__NDChoiceStatement__Group__1 : rule__NDChoiceStatement__Group__1__Impl ;
    public final void rule__NDChoiceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2661:1: ( rule__NDChoiceStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2662:2: rule__NDChoiceStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__1__Impl_in_rule__NDChoiceStatement__Group__15311);
            rule__NDChoiceStatement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group__1


    // $ANTLR start rule__NDChoiceStatement__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2668:1: rule__NDChoiceStatement__Group__1__Impl : ( ( rule__NDChoiceStatement__Group_1__0 )* ) ;
    public final void rule__NDChoiceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2672:1: ( ( ( rule__NDChoiceStatement__Group_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2673:1: ( ( rule__NDChoiceStatement__Group_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2673:1: ( ( rule__NDChoiceStatement__Group_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2674:1: ( rule__NDChoiceStatement__Group_1__0 )*
            {
             before(grammarAccess.getNDChoiceStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2675:1: ( rule__NDChoiceStatement__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_LSQUARE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2675:2: rule__NDChoiceStatement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__0_in_rule__NDChoiceStatement__Group__1__Impl5338);
            	    rule__NDChoiceStatement__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getNDChoiceStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group__1__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2689:1: rule__NDChoiceStatement__Group_1__0 : rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1 ;
    public final void rule__NDChoiceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2693:1: ( rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2694:2: rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__0__Impl_in_rule__NDChoiceStatement__Group_1__05373);
            rule__NDChoiceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__1_in_rule__NDChoiceStatement__Group_1__05376);
            rule__NDChoiceStatement__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__0


    // $ANTLR start rule__NDChoiceStatement__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2701:1: rule__NDChoiceStatement__Group_1__0__Impl : ( RULE_LSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2705:1: ( ( RULE_LSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2706:1: ( RULE_LSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2706:1: ( RULE_LSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2707:1: RULE_LSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0()); 
            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_1__0__Impl5403); 
             after(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__0__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2718:1: rule__NDChoiceStatement__Group_1__1 : rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2 ;
    public final void rule__NDChoiceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2722:1: ( rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2723:2: rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__1__Impl_in_rule__NDChoiceStatement__Group_1__15432);
            rule__NDChoiceStatement__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__2_in_rule__NDChoiceStatement__Group_1__15435);
            rule__NDChoiceStatement__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__1


    // $ANTLR start rule__NDChoiceStatement__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2730:1: rule__NDChoiceStatement__Group_1__1__Impl : ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) ) ;
    public final void rule__NDChoiceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2734:1: ( ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2735:1: ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2735:1: ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2736:1: ( rule__NDChoiceStatement__InputOperationAssignment_1_1 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getInputOperationAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2737:1: ( rule__NDChoiceStatement__InputOperationAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2737:2: rule__NDChoiceStatement__InputOperationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__InputOperationAssignment_1_1_in_rule__NDChoiceStatement__Group_1__1__Impl5462);
            rule__NDChoiceStatement__InputOperationAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getInputOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__1__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2747:1: rule__NDChoiceStatement__Group_1__2 : rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3 ;
    public final void rule__NDChoiceStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2751:1: ( rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2752:2: rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__2__Impl_in_rule__NDChoiceStatement__Group_1__25492);
            rule__NDChoiceStatement__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__3_in_rule__NDChoiceStatement__Group_1__25495);
            rule__NDChoiceStatement__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__2


    // $ANTLR start rule__NDChoiceStatement__Group_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2759:1: rule__NDChoiceStatement__Group_1__2__Impl : ( RULE_RSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2763:1: ( ( RULE_RSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2764:1: ( RULE_RSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2764:1: ( RULE_RSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2765:1: RULE_RSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_2()); 
            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_1__2__Impl5522); 
             after(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__2__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2776:1: rule__NDChoiceStatement__Group_1__3 : rule__NDChoiceStatement__Group_1__3__Impl ;
    public final void rule__NDChoiceStatement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2780:1: ( rule__NDChoiceStatement__Group_1__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2781:2: rule__NDChoiceStatement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__3__Impl_in_rule__NDChoiceStatement__Group_1__35551);
            rule__NDChoiceStatement__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__3


    // $ANTLR start rule__NDChoiceStatement__Group_1__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2787:1: rule__NDChoiceStatement__Group_1__3__Impl : ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) ) ;
    public final void rule__NDChoiceStatement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2791:1: ( ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2792:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2792:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2793:1: ( rule__NDChoiceStatement__MainProcessAssignment_1_3 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_1_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2794:1: ( rule__NDChoiceStatement__MainProcessAssignment_1_3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2794:2: rule__NDChoiceStatement__MainProcessAssignment_1_3
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_1_3_in_rule__NDChoiceStatement__Group_1__3__Impl5578);
            rule__NDChoiceStatement__MainProcessAssignment_1_3();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__3__Impl


    // $ANTLR start rule__InputOperation__Group_0__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2812:1: rule__InputOperation__Group_0__0 : rule__InputOperation__Group_0__0__Impl rule__InputOperation__Group_0__1 ;
    public final void rule__InputOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2816:1: ( rule__InputOperation__Group_0__0__Impl rule__InputOperation__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2817:2: rule__InputOperation__Group_0__0__Impl rule__InputOperation__Group_0__1
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__0__Impl_in_rule__InputOperation__Group_0__05616);
            rule__InputOperation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__1_in_rule__InputOperation__Group_0__05619);
            rule__InputOperation__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__0


    // $ANTLR start rule__InputOperation__Group_0__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2824:1: rule__InputOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__InputOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2828:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2829:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2829:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2830:1: ()
            {
             before(grammarAccess.getInputOperationAccess().getInputOperationAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2831:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2833:1: 
            {
            }

             after(grammarAccess.getInputOperationAccess().getInputOperationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__0__Impl


    // $ANTLR start rule__InputOperation__Group_0__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2843:1: rule__InputOperation__Group_0__1 : rule__InputOperation__Group_0__1__Impl rule__InputOperation__Group_0__2 ;
    public final void rule__InputOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2847:1: ( rule__InputOperation__Group_0__1__Impl rule__InputOperation__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2848:2: rule__InputOperation__Group_0__1__Impl rule__InputOperation__Group_0__2
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__1__Impl_in_rule__InputOperation__Group_0__15677);
            rule__InputOperation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__2_in_rule__InputOperation__Group_0__15680);
            rule__InputOperation__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__1


    // $ANTLR start rule__InputOperation__Group_0__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2855:1: rule__InputOperation__Group_0__1__Impl : ( RULE_LINKIN ) ;
    public final void rule__InputOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2859:1: ( ( RULE_LINKIN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2860:1: ( RULE_LINKIN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2860:1: ( RULE_LINKIN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2861:1: RULE_LINKIN
            {
             before(grammarAccess.getInputOperationAccess().getLINKINTerminalRuleCall_0_1()); 
            match(input,RULE_LINKIN,FOLLOW_RULE_LINKIN_in_rule__InputOperation__Group_0__1__Impl5707); 
             after(grammarAccess.getInputOperationAccess().getLINKINTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__1__Impl


    // $ANTLR start rule__InputOperation__Group_0__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2872:1: rule__InputOperation__Group_0__2 : rule__InputOperation__Group_0__2__Impl rule__InputOperation__Group_0__3 ;
    public final void rule__InputOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2876:1: ( rule__InputOperation__Group_0__2__Impl rule__InputOperation__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2877:2: rule__InputOperation__Group_0__2__Impl rule__InputOperation__Group_0__3
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__2__Impl_in_rule__InputOperation__Group_0__25736);
            rule__InputOperation__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__3_in_rule__InputOperation__Group_0__25739);
            rule__InputOperation__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__2


    // $ANTLR start rule__InputOperation__Group_0__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2884:1: rule__InputOperation__Group_0__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__InputOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2888:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2889:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2889:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2890:1: RULE_LPAREN
            {
             before(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_0_2()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_0__2__Impl5766); 
             after(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__2__Impl


    // $ANTLR start rule__InputOperation__Group_0__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2901:1: rule__InputOperation__Group_0__3 : rule__InputOperation__Group_0__3__Impl rule__InputOperation__Group_0__4 ;
    public final void rule__InputOperation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2905:1: ( rule__InputOperation__Group_0__3__Impl rule__InputOperation__Group_0__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2906:2: rule__InputOperation__Group_0__3__Impl rule__InputOperation__Group_0__4
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__3__Impl_in_rule__InputOperation__Group_0__35795);
            rule__InputOperation__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__4_in_rule__InputOperation__Group_0__35798);
            rule__InputOperation__Group_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__3


    // $ANTLR start rule__InputOperation__Group_0__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2913:1: rule__InputOperation__Group_0__3__Impl : ( RULE_ID ) ;
    public final void rule__InputOperation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2917:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2918:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2918:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2919:1: RULE_ID
            {
             before(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_0_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InputOperation__Group_0__3__Impl5825); 
             after(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__3__Impl


    // $ANTLR start rule__InputOperation__Group_0__4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2930:1: rule__InputOperation__Group_0__4 : rule__InputOperation__Group_0__4__Impl ;
    public final void rule__InputOperation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2934:1: ( rule__InputOperation__Group_0__4__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2935:2: rule__InputOperation__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__4__Impl_in_rule__InputOperation__Group_0__45854);
            rule__InputOperation__Group_0__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__4


    // $ANTLR start rule__InputOperation__Group_0__4__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2941:1: rule__InputOperation__Group_0__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__InputOperation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2945:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2946:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2946:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2947:1: RULE_RPAREN
            {
             before(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_0_4()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_0__4__Impl5881); 
             after(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_0__4__Impl


    // $ANTLR start rule__InputOperation__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2968:1: rule__InputOperation__Group_1__0 : rule__InputOperation__Group_1__0__Impl rule__InputOperation__Group_1__1 ;
    public final void rule__InputOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2972:1: ( rule__InputOperation__Group_1__0__Impl rule__InputOperation__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2973:2: rule__InputOperation__Group_1__0__Impl rule__InputOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__0__Impl_in_rule__InputOperation__Group_1__05920);
            rule__InputOperation__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__1_in_rule__InputOperation__Group_1__05923);
            rule__InputOperation__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__0


    // $ANTLR start rule__InputOperation__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2980:1: rule__InputOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__InputOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2984:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2985:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2985:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2986:1: ()
            {
             before(grammarAccess.getInputOperationAccess().getInputOperationAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2987:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2989:1: 
            {
            }

             after(grammarAccess.getInputOperationAccess().getInputOperationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__0__Impl


    // $ANTLR start rule__InputOperation__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2999:1: rule__InputOperation__Group_1__1 : rule__InputOperation__Group_1__1__Impl rule__InputOperation__Group_1__2 ;
    public final void rule__InputOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3003:1: ( rule__InputOperation__Group_1__1__Impl rule__InputOperation__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3004:2: rule__InputOperation__Group_1__1__Impl rule__InputOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__1__Impl_in_rule__InputOperation__Group_1__15981);
            rule__InputOperation__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__2_in_rule__InputOperation__Group_1__15984);
            rule__InputOperation__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__1


    // $ANTLR start rule__InputOperation__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3011:1: rule__InputOperation__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__InputOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3015:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3016:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3016:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3017:1: RULE_ID
            {
             before(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InputOperation__Group_1__1__Impl6011); 
             after(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__1__Impl


    // $ANTLR start rule__InputOperation__Group_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3028:1: rule__InputOperation__Group_1__2 : rule__InputOperation__Group_1__2__Impl rule__InputOperation__Group_1__3 ;
    public final void rule__InputOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3032:1: ( rule__InputOperation__Group_1__2__Impl rule__InputOperation__Group_1__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3033:2: rule__InputOperation__Group_1__2__Impl rule__InputOperation__Group_1__3
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__2__Impl_in_rule__InputOperation__Group_1__26040);
            rule__InputOperation__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__3_in_rule__InputOperation__Group_1__26043);
            rule__InputOperation__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__2


    // $ANTLR start rule__InputOperation__Group_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3040:1: rule__InputOperation__Group_1__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__InputOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3044:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3045:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3045:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3046:1: RULE_LPAREN
            {
             before(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_1_2()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_1__2__Impl6070); 
             after(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__2__Impl


    // $ANTLR start rule__InputOperation__Group_1__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3057:1: rule__InputOperation__Group_1__3 : rule__InputOperation__Group_1__3__Impl rule__InputOperation__Group_1__4 ;
    public final void rule__InputOperation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3061:1: ( rule__InputOperation__Group_1__3__Impl rule__InputOperation__Group_1__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3062:2: rule__InputOperation__Group_1__3__Impl rule__InputOperation__Group_1__4
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__3__Impl_in_rule__InputOperation__Group_1__36099);
            rule__InputOperation__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__4_in_rule__InputOperation__Group_1__36102);
            rule__InputOperation__Group_1__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__3


    // $ANTLR start rule__InputOperation__Group_1__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3069:1: rule__InputOperation__Group_1__3__Impl : ( () ) ;
    public final void rule__InputOperation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3073:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3074:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3074:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3075:1: ()
            {
             before(grammarAccess.getInputOperationAccess().getVariablePathAction_1_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3076:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3078:1: 
            {
            }

             after(grammarAccess.getInputOperationAccess().getVariablePathAction_1_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__3__Impl


    // $ANTLR start rule__InputOperation__Group_1__4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3088:1: rule__InputOperation__Group_1__4 : rule__InputOperation__Group_1__4__Impl rule__InputOperation__Group_1__5 ;
    public final void rule__InputOperation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3092:1: ( rule__InputOperation__Group_1__4__Impl rule__InputOperation__Group_1__5 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3093:2: rule__InputOperation__Group_1__4__Impl rule__InputOperation__Group_1__5
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__4__Impl_in_rule__InputOperation__Group_1__46160);
            rule__InputOperation__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__5_in_rule__InputOperation__Group_1__46163);
            rule__InputOperation__Group_1__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__4


    // $ANTLR start rule__InputOperation__Group_1__4__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3100:1: rule__InputOperation__Group_1__4__Impl : ( ( rule__InputOperation__VariablePathAssignment_1_4 ) ) ;
    public final void rule__InputOperation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3104:1: ( ( ( rule__InputOperation__VariablePathAssignment_1_4 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3105:1: ( ( rule__InputOperation__VariablePathAssignment_1_4 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3105:1: ( ( rule__InputOperation__VariablePathAssignment_1_4 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3106:1: ( rule__InputOperation__VariablePathAssignment_1_4 )
            {
             before(grammarAccess.getInputOperationAccess().getVariablePathAssignment_1_4()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3107:1: ( rule__InputOperation__VariablePathAssignment_1_4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3107:2: rule__InputOperation__VariablePathAssignment_1_4
            {
            pushFollow(FOLLOW_rule__InputOperation__VariablePathAssignment_1_4_in_rule__InputOperation__Group_1__4__Impl6190);
            rule__InputOperation__VariablePathAssignment_1_4();
            _fsp--;


            }

             after(grammarAccess.getInputOperationAccess().getVariablePathAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__4__Impl


    // $ANTLR start rule__InputOperation__Group_1__5
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3117:1: rule__InputOperation__Group_1__5 : rule__InputOperation__Group_1__5__Impl rule__InputOperation__Group_1__6 ;
    public final void rule__InputOperation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3121:1: ( rule__InputOperation__Group_1__5__Impl rule__InputOperation__Group_1__6 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3122:2: rule__InputOperation__Group_1__5__Impl rule__InputOperation__Group_1__6
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__5__Impl_in_rule__InputOperation__Group_1__56220);
            rule__InputOperation__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__6_in_rule__InputOperation__Group_1__56223);
            rule__InputOperation__Group_1__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__5


    // $ANTLR start rule__InputOperation__Group_1__5__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3129:1: rule__InputOperation__Group_1__5__Impl : ( RULE_RPAREN ) ;
    public final void rule__InputOperation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3133:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3134:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3134:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3135:1: RULE_RPAREN
            {
             before(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_1_5()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_1__5__Impl6250); 
             after(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__5__Impl


    // $ANTLR start rule__InputOperation__Group_1__6
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3146:1: rule__InputOperation__Group_1__6 : rule__InputOperation__Group_1__6__Impl ;
    public final void rule__InputOperation__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3150:1: ( rule__InputOperation__Group_1__6__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3151:2: rule__InputOperation__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__6__Impl_in_rule__InputOperation__Group_1__66279);
            rule__InputOperation__Group_1__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__6


    // $ANTLR start rule__InputOperation__Group_1__6__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3157:1: rule__InputOperation__Group_1__6__Impl : ( ( ruleRequestResponseOperation )? ) ;
    public final void rule__InputOperation__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3161:1: ( ( ( ruleRequestResponseOperation )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3162:1: ( ( ruleRequestResponseOperation )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3162:1: ( ( ruleRequestResponseOperation )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3163:1: ( ruleRequestResponseOperation )?
            {
             before(grammarAccess.getInputOperationAccess().getRequestResponseOperationParserRuleCall_1_6()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3164:1: ( ruleRequestResponseOperation )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LPAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3164:3: ruleRequestResponseOperation
                    {
                    pushFollow(FOLLOW_ruleRequestResponseOperation_in_rule__InputOperation__Group_1__6__Impl6307);
                    ruleRequestResponseOperation();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputOperationAccess().getRequestResponseOperationParserRuleCall_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__Group_1__6__Impl


    // $ANTLR start rule__VariablePath__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3188:1: rule__VariablePath__Group__0 : rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1 ;
    public final void rule__VariablePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3192:1: ( rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3193:2: rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__0__Impl_in_rule__VariablePath__Group__06352);
            rule__VariablePath__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group__1_in_rule__VariablePath__Group__06355);
            rule__VariablePath__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group__0


    // $ANTLR start rule__VariablePath__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3200:1: rule__VariablePath__Group__0__Impl : ( () ) ;
    public final void rule__VariablePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3204:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3205:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3205:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3206:1: ()
            {
             before(grammarAccess.getVariablePathAccess().getVariablePathAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3207:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3209:1: 
            {
            }

             after(grammarAccess.getVariablePathAccess().getVariablePathAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group__0__Impl


    // $ANTLR start rule__VariablePath__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3219:1: rule__VariablePath__Group__1 : rule__VariablePath__Group__1__Impl rule__VariablePath__Group__2 ;
    public final void rule__VariablePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3223:1: ( rule__VariablePath__Group__1__Impl rule__VariablePath__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3224:2: rule__VariablePath__Group__1__Impl rule__VariablePath__Group__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__1__Impl_in_rule__VariablePath__Group__16413);
            rule__VariablePath__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group__2_in_rule__VariablePath__Group__16416);
            rule__VariablePath__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group__1


    // $ANTLR start rule__VariablePath__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3231:1: rule__VariablePath__Group__1__Impl : ( RULE_GLOBAL ) ;
    public final void rule__VariablePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3235:1: ( ( RULE_GLOBAL ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3236:1: ( RULE_GLOBAL )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3236:1: ( RULE_GLOBAL )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3237:1: RULE_GLOBAL
            {
             before(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1()); 
            match(input,RULE_GLOBAL,FOLLOW_RULE_GLOBAL_in_rule__VariablePath__Group__1__Impl6443); 
             after(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group__1__Impl


    // $ANTLR start rule__VariablePath__Group__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3248:1: rule__VariablePath__Group__2 : rule__VariablePath__Group__2__Impl ;
    public final void rule__VariablePath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3252:1: ( rule__VariablePath__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3253:2: rule__VariablePath__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__2__Impl_in_rule__VariablePath__Group__26472);
            rule__VariablePath__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group__2


    // $ANTLR start rule__VariablePath__Group__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3259:1: rule__VariablePath__Group__2__Impl : ( ( rule__VariablePath__Group_2__0 )* ) ;
    public final void rule__VariablePath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3263:1: ( ( ( rule__VariablePath__Group_2__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3264:1: ( ( rule__VariablePath__Group_2__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3264:1: ( ( rule__VariablePath__Group_2__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3265:1: ( rule__VariablePath__Group_2__0 )*
            {
             before(grammarAccess.getVariablePathAccess().getGroup_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3266:1: ( rule__VariablePath__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3266:2: rule__VariablePath__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariablePath__Group_2__0_in_rule__VariablePath__Group__2__Impl6499);
            	    rule__VariablePath__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVariablePathAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group__2__Impl


    // $ANTLR start rule__VariablePath__Group_2__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3282:1: rule__VariablePath__Group_2__0 : rule__VariablePath__Group_2__0__Impl rule__VariablePath__Group_2__1 ;
    public final void rule__VariablePath__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3286:1: ( rule__VariablePath__Group_2__0__Impl rule__VariablePath__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3287:2: rule__VariablePath__Group_2__0__Impl rule__VariablePath__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2__0__Impl_in_rule__VariablePath__Group_2__06536);
            rule__VariablePath__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_2__1_in_rule__VariablePath__Group_2__06539);
            rule__VariablePath__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2__0


    // $ANTLR start rule__VariablePath__Group_2__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3294:1: rule__VariablePath__Group_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__VariablePath__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3298:1: ( ( RULE_DOT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3299:1: ( RULE_DOT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3299:1: ( RULE_DOT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3300:1: RULE_DOT
            {
             before(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_2_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__VariablePath__Group_2__0__Impl6566); 
             after(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2__0__Impl


    // $ANTLR start rule__VariablePath__Group_2__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3311:1: rule__VariablePath__Group_2__1 : rule__VariablePath__Group_2__1__Impl ;
    public final void rule__VariablePath__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3315:1: ( rule__VariablePath__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3316:2: rule__VariablePath__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2__1__Impl_in_rule__VariablePath__Group_2__16595);
            rule__VariablePath__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2__1


    // $ANTLR start rule__VariablePath__Group_2__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3322:1: rule__VariablePath__Group_2__1__Impl : ( ( rule__VariablePath__Alternatives_2_1 ) ) ;
    public final void rule__VariablePath__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3326:1: ( ( ( rule__VariablePath__Alternatives_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3327:1: ( ( rule__VariablePath__Alternatives_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3327:1: ( ( rule__VariablePath__Alternatives_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3328:1: ( rule__VariablePath__Alternatives_2_1 )
            {
             before(grammarAccess.getVariablePathAccess().getAlternatives_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3329:1: ( rule__VariablePath__Alternatives_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3329:2: rule__VariablePath__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__VariablePath__Alternatives_2_1_in_rule__VariablePath__Group_2__1__Impl6622);
            rule__VariablePath__Alternatives_2_1();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2__1__Impl


    // $ANTLR start rule__VariablePath__Group_2_1_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3343:1: rule__VariablePath__Group_2_1_1__0 : rule__VariablePath__Group_2_1_1__0__Impl rule__VariablePath__Group_2_1_1__1 ;
    public final void rule__VariablePath__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3347:1: ( rule__VariablePath__Group_2_1_1__0__Impl rule__VariablePath__Group_2_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3348:2: rule__VariablePath__Group_2_1_1__0__Impl rule__VariablePath__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__0__Impl_in_rule__VariablePath__Group_2_1_1__06656);
            rule__VariablePath__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__1_in_rule__VariablePath__Group_2_1_1__06659);
            rule__VariablePath__Group_2_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2_1_1__0


    // $ANTLR start rule__VariablePath__Group_2_1_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3355:1: rule__VariablePath__Group_2_1_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__VariablePath__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3359:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3360:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3360:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3361:1: RULE_LPAREN
            {
             before(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__VariablePath__Group_2_1_1__0__Impl6686); 
             after(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2_1_1__0__Impl


    // $ANTLR start rule__VariablePath__Group_2_1_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3372:1: rule__VariablePath__Group_2_1_1__1 : rule__VariablePath__Group_2_1_1__1__Impl rule__VariablePath__Group_2_1_1__2 ;
    public final void rule__VariablePath__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3376:1: ( rule__VariablePath__Group_2_1_1__1__Impl rule__VariablePath__Group_2_1_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3377:2: rule__VariablePath__Group_2_1_1__1__Impl rule__VariablePath__Group_2_1_1__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__1__Impl_in_rule__VariablePath__Group_2_1_1__16715);
            rule__VariablePath__Group_2_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__2_in_rule__VariablePath__Group_2_1_1__16718);
            rule__VariablePath__Group_2_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2_1_1__1


    // $ANTLR start rule__VariablePath__Group_2_1_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3384:1: rule__VariablePath__Group_2_1_1__1__Impl : ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) ) ;
    public final void rule__VariablePath__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3388:1: ( ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3389:1: ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3389:1: ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3390:1: ( rule__VariablePath__ChildrenAssignment_2_1_1_1 )
            {
             before(grammarAccess.getVariablePathAccess().getChildrenAssignment_2_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3391:1: ( rule__VariablePath__ChildrenAssignment_2_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3391:2: rule__VariablePath__ChildrenAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__VariablePath__ChildrenAssignment_2_1_1_1_in_rule__VariablePath__Group_2_1_1__1__Impl6745);
            rule__VariablePath__ChildrenAssignment_2_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getChildrenAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2_1_1__1__Impl


    // $ANTLR start rule__VariablePath__Group_2_1_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3401:1: rule__VariablePath__Group_2_1_1__2 : rule__VariablePath__Group_2_1_1__2__Impl ;
    public final void rule__VariablePath__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3405:1: ( rule__VariablePath__Group_2_1_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3406:2: rule__VariablePath__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__2__Impl_in_rule__VariablePath__Group_2_1_1__26775);
            rule__VariablePath__Group_2_1_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2_1_1__2


    // $ANTLR start rule__VariablePath__Group_2_1_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3412:1: rule__VariablePath__Group_2_1_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__VariablePath__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3416:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3417:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3417:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3418:1: RULE_RPAREN
            {
             before(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_2_1_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__VariablePath__Group_2_1_1__2__Impl6802); 
             after(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__Group_2_1_1__2__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3435:1: rule__RequestResponseOperation__Group__0 : rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1 ;
    public final void rule__RequestResponseOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3439:1: ( rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3440:2: rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__0__Impl_in_rule__RequestResponseOperation__Group__06837);
            rule__RequestResponseOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__1_in_rule__RequestResponseOperation__Group__06840);
            rule__RequestResponseOperation__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__0


    // $ANTLR start rule__RequestResponseOperation__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3447:1: rule__RequestResponseOperation__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__RequestResponseOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3451:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3452:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3452:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3453:1: RULE_LPAREN
            {
             before(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__RequestResponseOperation__Group__0__Impl6867); 
             after(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__0__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3464:1: rule__RequestResponseOperation__Group__1 : rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2 ;
    public final void rule__RequestResponseOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3468:1: ( rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3469:2: rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__1__Impl_in_rule__RequestResponseOperation__Group__16896);
            rule__RequestResponseOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__2_in_rule__RequestResponseOperation__Group__16899);
            rule__RequestResponseOperation__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__1


    // $ANTLR start rule__RequestResponseOperation__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3476:1: rule__RequestResponseOperation__Group__1__Impl : ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) ) ;
    public final void rule__RequestResponseOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3480:1: ( ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3481:1: ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3481:1: ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3482:1: ( rule__RequestResponseOperation__ExpressionAssignment_1 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getExpressionAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3483:1: ( rule__RequestResponseOperation__ExpressionAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3483:2: rule__RequestResponseOperation__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__ExpressionAssignment_1_in_rule__RequestResponseOperation__Group__1__Impl6926);
            rule__RequestResponseOperation__ExpressionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__1__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3493:1: rule__RequestResponseOperation__Group__2 : rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3 ;
    public final void rule__RequestResponseOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3497:1: ( rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3498:2: rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__2__Impl_in_rule__RequestResponseOperation__Group__26956);
            rule__RequestResponseOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__3_in_rule__RequestResponseOperation__Group__26959);
            rule__RequestResponseOperation__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__2


    // $ANTLR start rule__RequestResponseOperation__Group__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3505:1: rule__RequestResponseOperation__Group__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__RequestResponseOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3509:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3510:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3510:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3511:1: RULE_RPAREN
            {
             before(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__RequestResponseOperation__Group__2__Impl6986); 
             after(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__2__Impl


    // $ANTLR start rule__RequestResponseOperation__Group__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3522:1: rule__RequestResponseOperation__Group__3 : rule__RequestResponseOperation__Group__3__Impl ;
    public final void rule__RequestResponseOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3526:1: ( rule__RequestResponseOperation__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3527:2: rule__RequestResponseOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__3__Impl_in_rule__RequestResponseOperation__Group__37015);
            rule__RequestResponseOperation__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__3


    // $ANTLR start rule__RequestResponseOperation__Group__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3533:1: rule__RequestResponseOperation__Group__3__Impl : ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) ) ;
    public final void rule__RequestResponseOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3537:1: ( ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3538:1: ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3538:1: ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3539:1: ( rule__RequestResponseOperation__MainProcessAssignment_3 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getMainProcessAssignment_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3540:1: ( rule__RequestResponseOperation__MainProcessAssignment_3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3540:2: rule__RequestResponseOperation__MainProcessAssignment_3
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__MainProcessAssignment_3_in_rule__RequestResponseOperation__Group__3__Impl7042);
            rule__RequestResponseOperation__MainProcessAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getRequestResponseOperationAccess().getMainProcessAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__Group__3__Impl


    // $ANTLR start rule__Program__MainAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3559:1: rule__Program__MainAssignment_1 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3563:1: ( ( ruleMain ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3564:1: ( ruleMain )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3564:1: ( ruleMain )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3565:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_17085);
            ruleMain();
            _fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Program__MainAssignment_1


    // $ANTLR start rule__Main__MainrocessAssignment
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3574:1: rule__Main__MainrocessAssignment : ( ruleMainProcess ) ;
    public final void rule__Main__MainrocessAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3578:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3579:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3579:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3580:1: ruleMainProcess
            {
             before(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment7116);
            ruleMainProcess();
            _fsp--;

             after(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Main__MainrocessAssignment


    // $ANTLR start rule__MainProcess__ParallelStatementAssignment_2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3589:1: rule__MainProcess__ParallelStatementAssignment_2 : ( ruleParallelStatement ) ;
    public final void rule__MainProcess__ParallelStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3593:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3594:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3594:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3595:1: ruleParallelStatement
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_27147);
            ruleParallelStatement();
            _fsp--;

             after(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MainProcess__ParallelStatementAssignment_2


    // $ANTLR start rule__Process__ChildrenAssignment_0_2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3604:1: rule__Process__ChildrenAssignment_0_2 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3608:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3609:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3609:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3610:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_27178);
            ruleParallelStatement();
            _fsp--;

             after(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__ChildrenAssignment_0_2


    // $ANTLR start rule__Process__ChildrenAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3619:1: rule__Process__ChildrenAssignment_1_1 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3623:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3624:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3624:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3625:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_17209);
            ruleParallelStatement();
            _fsp--;

             after(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__ChildrenAssignment_1_1


    // $ANTLR start rule__ParallelStatement__ChildrenAssignment_1_0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3634:1: rule__ParallelStatement__ChildrenAssignment_1_0 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3638:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3639:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3639:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3640:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_07240);
            ruleSequenceStatement();
            _fsp--;

             after(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__ChildrenAssignment_1_0


    // $ANTLR start rule__ParallelStatement__ChildrenAssignment_1_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3649:1: rule__ParallelStatement__ChildrenAssignment_1_1_1 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3653:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3654:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3654:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3655:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_17271);
            ruleSequenceStatement();
            _fsp--;

             after(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParallelStatement__ChildrenAssignment_1_1_1


    // $ANTLR start rule__SequenceStatement__ChildrenAssignment_1_0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3664:1: rule__SequenceStatement__ChildrenAssignment_1_0 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3668:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3669:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3669:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3670:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_07302);
            ruleBasicStatement();
            _fsp--;

             after(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__ChildrenAssignment_1_0


    // $ANTLR start rule__SequenceStatement__ChildrenAssignment_1_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3679:1: rule__SequenceStatement__ChildrenAssignment_1_1_1 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3683:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3684:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3684:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3685:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_17333);
            ruleBasicStatement();
            _fsp--;

             after(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SequenceStatement__ChildrenAssignment_1_1_1


    // $ANTLR start rule__BasicStatement__ProcessAssignment_0_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3694:1: rule__BasicStatement__ProcessAssignment_0_1 : ( ruleProcess ) ;
    public final void rule__BasicStatement__ProcessAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3698:1: ( ( ruleProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3699:1: ( ruleProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3699:1: ( ruleProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3700:1: ruleProcess
            {
             before(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_17364);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__ProcessAssignment_0_1


    // $ANTLR start rule__BasicStatement__AssignStatementAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3709:1: rule__BasicStatement__AssignStatementAssignment_1_1 : ( ruleAssignStatement ) ;
    public final void rule__BasicStatement__AssignStatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3713:1: ( ( ruleAssignStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3714:1: ( ruleAssignStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3714:1: ( ruleAssignStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3715:1: ruleAssignStatement
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_17395);
            ruleAssignStatement();
            _fsp--;

             after(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__AssignStatementAssignment_1_1


    // $ANTLR start rule__BasicStatement__PostIncrementStatementAssignment_2_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3724:1: rule__BasicStatement__PostIncrementStatementAssignment_2_1 : ( rulePostIncrementStatement ) ;
    public final void rule__BasicStatement__PostIncrementStatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3728:1: ( ( rulePostIncrementStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3729:1: ( rulePostIncrementStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3729:1: ( rulePostIncrementStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3730:1: rulePostIncrementStatement
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementPostIncrementStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePostIncrementStatement_in_rule__BasicStatement__PostIncrementStatementAssignment_2_17426);
            rulePostIncrementStatement();
            _fsp--;

             after(grammarAccess.getBasicStatementAccess().getPostIncrementStatementPostIncrementStatementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__PostIncrementStatementAssignment_2_1


    // $ANTLR start rule__BasicStatement__PostDecrementStatementAssignment_3_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3739:1: rule__BasicStatement__PostDecrementStatementAssignment_3_1 : ( rulePostDecrementStatement ) ;
    public final void rule__BasicStatement__PostDecrementStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3743:1: ( ( rulePostDecrementStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3744:1: ( rulePostDecrementStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3744:1: ( rulePostDecrementStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3745:1: rulePostDecrementStatement
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementPostDecrementStatementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePostDecrementStatement_in_rule__BasicStatement__PostDecrementStatementAssignment_3_17457);
            rulePostDecrementStatement();
            _fsp--;

             after(grammarAccess.getBasicStatementAccess().getPostDecrementStatementPostDecrementStatementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__PostDecrementStatementAssignment_3_1


    // $ANTLR start rule__BasicStatement__NDChoiceStatementAssignment_4_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3754:1: rule__BasicStatement__NDChoiceStatementAssignment_4_1 : ( ruleNDChoiceStatement ) ;
    public final void rule__BasicStatement__NDChoiceStatementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3758:1: ( ( ruleNDChoiceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3759:1: ( ruleNDChoiceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3759:1: ( ruleNDChoiceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3760:1: ruleNDChoiceStatement
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_rule__BasicStatement__NDChoiceStatementAssignment_4_17488);
            ruleNDChoiceStatement();
            _fsp--;

             after(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BasicStatement__NDChoiceStatementAssignment_4_1


    // $ANTLR start rule__AssignStatement__NameAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3769:1: rule__AssignStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssignStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3773:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3774:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3774:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3775:1: RULE_ID
            {
             before(grammarAccess.getAssignStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssignStatement__NameAssignment_17519); 
             after(grammarAccess.getAssignStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__NameAssignment_1


    // $ANTLR start rule__AssignStatement__ExpressionAssignment_4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3784:1: rule__AssignStatement__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__AssignStatement__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3788:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3789:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3789:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3790:1: ruleExpression
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignStatement__ExpressionAssignment_47550);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getAssignStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignStatement__ExpressionAssignment_4


    // $ANTLR start rule__PostIncrementStatement__NameAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3799:1: rule__PostIncrementStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostIncrementStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3803:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3804:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3804:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3805:1: RULE_ID
            {
             before(grammarAccess.getPostIncrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostIncrementStatement__NameAssignment_17581); 
             after(grammarAccess.getPostIncrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostIncrementStatement__NameAssignment_1


    // $ANTLR start rule__PostDecrementStatement__NameAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3814:1: rule__PostDecrementStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostDecrementStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3818:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3820:1: RULE_ID
            {
             before(grammarAccess.getPostDecrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostDecrementStatement__NameAssignment_17612); 
             after(grammarAccess.getPostDecrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__NameAssignment_1


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3829:1: rule__Expression__OpAssignment_1_1 : ( ( rule__Expression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3833:1: ( ( ( rule__Expression__OpAlternatives_1_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3834:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3834:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3835:1: ( rule__Expression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3836:1: ( rule__Expression__OpAlternatives_1_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3836:2: rule__Expression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_17643);
            rule__Expression__OpAlternatives_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__OpAssignment_1_1


    // $ANTLR start rule__Expression__RightAssignment_1_2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3845:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3849:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3850:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3850:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3851:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_27676);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__RightAssignment_1_2


    // $ANTLR start rule__TerminalExpression__ValueAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3860:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3864:1: ( ( RULE_INT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3865:1: ( RULE_INT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3865:1: ( RULE_INT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3866:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_17707); 
             after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_1_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_2_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3875:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_REAL ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3879:1: ( ( RULE_REAL ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3880:1: ( RULE_REAL )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3880:1: ( RULE_REAL )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3881:1: RULE_REAL
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_17738); 
             after(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_2_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_3_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3890:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3894:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3895:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3895:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3896:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_3_17769); 
             after(grammarAccess.getTerminalExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_3_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_4_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3905:1: rule__TerminalExpression__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3909:1: ( ( RULE_STRING ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3910:1: ( RULE_STRING )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3910:1: ( RULE_STRING )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3911:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_4_17800); 
             after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_4_1


    // $ANTLR start rule__NDChoiceStatement__InputOperationAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3920:1: rule__NDChoiceStatement__InputOperationAssignment_1_1 : ( ruleInputOperation ) ;
    public final void rule__NDChoiceStatement__InputOperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3924:1: ( ( ruleInputOperation ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3925:1: ( ruleInputOperation )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3925:1: ( ruleInputOperation )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3926:1: ruleInputOperation
            {
             before(grammarAccess.getNDChoiceStatementAccess().getInputOperationInputOperationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInputOperation_in_rule__NDChoiceStatement__InputOperationAssignment_1_17831);
            ruleInputOperation();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementAccess().getInputOperationInputOperationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__InputOperationAssignment_1_1


    // $ANTLR start rule__NDChoiceStatement__MainProcessAssignment_1_3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3935:1: rule__NDChoiceStatement__MainProcessAssignment_1_3 : ( ruleMainProcess ) ;
    public final void rule__NDChoiceStatement__MainProcessAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3939:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3940:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3940:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3941:1: ruleMainProcess
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_1_37862);
            ruleMainProcess();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__MainProcessAssignment_1_3


    // $ANTLR start rule__InputOperation__VariablePathAssignment_1_4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3950:1: rule__InputOperation__VariablePathAssignment_1_4 : ( ruleVariablePath ) ;
    public final void rule__InputOperation__VariablePathAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3954:1: ( ( ruleVariablePath ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3955:1: ( ruleVariablePath )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3955:1: ( ruleVariablePath )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3956:1: ruleVariablePath
            {
             before(grammarAccess.getInputOperationAccess().getVariablePathVariablePathParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleVariablePath_in_rule__InputOperation__VariablePathAssignment_1_47893);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getInputOperationAccess().getVariablePathVariablePathParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputOperation__VariablePathAssignment_1_4


    // $ANTLR start rule__VariablePath__ChildrenAssignment_2_1_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3965:1: rule__VariablePath__ChildrenAssignment_2_1_1_1 : ( ruleExpression ) ;
    public final void rule__VariablePath__ChildrenAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3969:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3970:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3970:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3971:1: ruleExpression
            {
             before(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_2_1_1_17924);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariablePath__ChildrenAssignment_2_1_1_1


    // $ANTLR start rule__RequestResponseOperation__ExpressionAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3980:1: rule__RequestResponseOperation__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__RequestResponseOperation__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3984:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3985:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3985:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3986:1: ruleExpression
            {
             before(grammarAccess.getRequestResponseOperationAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__RequestResponseOperation__ExpressionAssignment_17955);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getRequestResponseOperationAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__ExpressionAssignment_1


    // $ANTLR start rule__RequestResponseOperation__MainProcessAssignment_3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3995:1: rule__RequestResponseOperation__MainProcessAssignment_3 : ( ruleMainProcess ) ;
    public final void rule__RequestResponseOperation__MainProcessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3999:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:4000:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:4000:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:4001:1: ruleMainProcess
            {
             before(grammarAccess.getRequestResponseOperationAccess().getMainProcessMainProcessParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__RequestResponseOperation__MainProcessAssignment_37986);
            ruleMainProcess();
            _fsp--;

             after(grammarAccess.getRequestResponseOperationAccess().getMainProcessMainProcessParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RequestResponseOperation__MainProcessAssignment_3


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__MainrocessAssignment_in_ruleMain154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_entryRuleMainProcess181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainProcess188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__0_in_ruleMainProcess214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_in_ruleProcess274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_entryRuleParallelStatement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelStatement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__0_in_ruleParallelStatement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_entryRuleSequenceStatement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceStatement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__0_in_ruleSequenceStatement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_entryRuleBasicStatement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Alternatives_in_ruleBasicStatement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_entryRuleAssignStatement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignStatement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__0_in_ruleAssignStatement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementStatement_in_entryRulePostIncrementStatement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostIncrementStatement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__0_in_rulePostIncrementStatement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDecrementStatement_in_entryRulePostDecrementStatement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostDecrementStatement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__0_in_rulePostDecrementStatement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDChoiceStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__0_in_ruleNDChoiceStatement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_entryRuleInputOperation841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperation848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Alternatives_in_ruleInputOperation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__0_in_ruleVariablePath934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__0_in_ruleRequestResponseOperation994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__0_in_rule__BasicStatement__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__0_in_rule__BasicStatement__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_01186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_01203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_01237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__0_in_rule__InputOperation__Alternatives1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__0_in_rule__InputOperation__Alternatives1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_2_11425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__0_in_rule__VariablePath__Alternatives_2_11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01473 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Program__Group__0__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01596 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11657 = new BitSet(new long[]{0x0000000000046F00L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21716 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01840 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11901 = new BitSet(new long[]{0x0000000000046F00L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__21960 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__21963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__32020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__02084 = new BitSet(new long[]{0x0000000000047B00L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__12143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__22203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__02265 = new BitSet(new long[]{0x0000000000046B02L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__02268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__12326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02387 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2474 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02509 = new BitSet(new long[]{0x0000000000044B02L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02629 = new BitSet(new long[]{0x0000000000044B02L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02751 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2838 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02873 = new BitSet(new long[]{0x0000000000040B02L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__02993 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__02996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__03115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__03237 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__03240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__PostIncrementStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__0__Impl_in_rule__BasicStatement__Group_3__03359 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__1_in_rule__BasicStatement__Group_3__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__1__Impl_in_rule__BasicStatement__Group_3__13420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__PostDecrementStatementAssignment_3_1_in_rule__BasicStatement__Group_3__1__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__0__Impl_in_rule__BasicStatement__Group_4__03481 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__1_in_rule__BasicStatement__Group_4__03484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__1__Impl_in_rule__BasicStatement__Group_4__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__NDChoiceStatementAssignment_4_1_in_rule__BasicStatement__Group_4__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03603 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__NameAssignment_1_in_rule__AssignStatement__Group__1__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23724 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33783 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__4_in_rule__AssignStatement__Group__33786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__4__Impl_in_rule__AssignStatement__Group__43844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__ExpressionAssignment_4_in_rule__AssignStatement__Group__4__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__0__Impl_in_rule__PostIncrementStatement__Group__03911 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__1_in_rule__PostIncrementStatement__Group__03914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__1__Impl_in_rule__PostIncrementStatement__Group__13972 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__2_in_rule__PostIncrementStatement__Group__13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__NameAssignment_1_in_rule__PostIncrementStatement__Group__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__2__Impl_in_rule__PostIncrementStatement__Group__24032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rule__PostIncrementStatement__Group__2__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__0__Impl_in_rule__PostDecrementStatement__Group__04094 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__1_in_rule__PostDecrementStatement__Group__04097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__1__Impl_in_rule__PostDecrementStatement__Group__14155 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__2_in_rule__PostDecrementStatement__Group__14158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__NameAssignment_1_in_rule__PostDecrementStatement__Group__1__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__2__Impl_in_rule__PostDecrementStatement__Group__24215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rule__PostDecrementStatement__Group__2__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04277 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04398 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14459 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04582 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04762 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__05006 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__15067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__05128 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__05131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__0__Impl_in_rule__NDChoiceStatement__Group__05250 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__1_in_rule__NDChoiceStatement__Group__05253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__1__Impl_in_rule__NDChoiceStatement__Group__15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__0_in_rule__NDChoiceStatement__Group__1__Impl5338 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__0__Impl_in_rule__NDChoiceStatement__Group_1__05373 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__1_in_rule__NDChoiceStatement__Group_1__05376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_1__0__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__1__Impl_in_rule__NDChoiceStatement__Group_1__15432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__2_in_rule__NDChoiceStatement__Group_1__15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__InputOperationAssignment_1_1_in_rule__NDChoiceStatement__Group_1__1__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__2__Impl_in_rule__NDChoiceStatement__Group_1__25492 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__3_in_rule__NDChoiceStatement__Group_1__25495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_1__2__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__3__Impl_in_rule__NDChoiceStatement__Group_1__35551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_1_3_in_rule__NDChoiceStatement__Group_1__3__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__0__Impl_in_rule__InputOperation__Group_0__05616 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__1_in_rule__InputOperation__Group_0__05619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__1__Impl_in_rule__InputOperation__Group_0__15677 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__2_in_rule__InputOperation__Group_0__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINKIN_in_rule__InputOperation__Group_0__1__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__2__Impl_in_rule__InputOperation__Group_0__25736 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__3_in_rule__InputOperation__Group_0__25739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_0__2__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__3__Impl_in_rule__InputOperation__Group_0__35795 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__4_in_rule__InputOperation__Group_0__35798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InputOperation__Group_0__3__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__4__Impl_in_rule__InputOperation__Group_0__45854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_0__4__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__0__Impl_in_rule__InputOperation__Group_1__05920 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__1_in_rule__InputOperation__Group_1__05923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__1__Impl_in_rule__InputOperation__Group_1__15981 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__2_in_rule__InputOperation__Group_1__15984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InputOperation__Group_1__1__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__2__Impl_in_rule__InputOperation__Group_1__26040 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__3_in_rule__InputOperation__Group_1__26043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_1__2__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__3__Impl_in_rule__InputOperation__Group_1__36099 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__4_in_rule__InputOperation__Group_1__36102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__4__Impl_in_rule__InputOperation__Group_1__46160 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__5_in_rule__InputOperation__Group_1__46163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__VariablePathAssignment_1_4_in_rule__InputOperation__Group_1__4__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__5__Impl_in_rule__InputOperation__Group_1__56220 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__6_in_rule__InputOperation__Group_1__56223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_1__5__Impl6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__6__Impl_in_rule__InputOperation__Group_1__66279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_rule__InputOperation__Group_1__6__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__0__Impl_in_rule__VariablePath__Group__06352 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__1_in_rule__VariablePath__Group__06355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__1__Impl_in_rule__VariablePath__Group__16413 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__2_in_rule__VariablePath__Group__16416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GLOBAL_in_rule__VariablePath__Group__1__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__2__Impl_in_rule__VariablePath__Group__26472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__0_in_rule__VariablePath__Group__2__Impl6499 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__0__Impl_in_rule__VariablePath__Group_2__06536 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__1_in_rule__VariablePath__Group_2__06539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__VariablePath__Group_2__0__Impl6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__1__Impl_in_rule__VariablePath__Group_2__16595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Alternatives_2_1_in_rule__VariablePath__Group_2__1__Impl6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__0__Impl_in_rule__VariablePath__Group_2_1_1__06656 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__1_in_rule__VariablePath__Group_2_1_1__06659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__VariablePath__Group_2_1_1__0__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__1__Impl_in_rule__VariablePath__Group_2_1_1__16715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__2_in_rule__VariablePath__Group_2_1_1__16718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__ChildrenAssignment_2_1_1_1_in_rule__VariablePath__Group_2_1_1__1__Impl6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__2__Impl_in_rule__VariablePath__Group_2_1_1__26775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__VariablePath__Group_2_1_1__2__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__0__Impl_in_rule__RequestResponseOperation__Group__06837 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__1_in_rule__RequestResponseOperation__Group__06840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__RequestResponseOperation__Group__0__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__1__Impl_in_rule__RequestResponseOperation__Group__16896 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__2_in_rule__RequestResponseOperation__Group__16899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__ExpressionAssignment_1_in_rule__RequestResponseOperation__Group__1__Impl6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__2__Impl_in_rule__RequestResponseOperation__Group__26956 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__3_in_rule__RequestResponseOperation__Group__26959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__RequestResponseOperation__Group__2__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__3__Impl_in_rule__RequestResponseOperation__Group__37015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__MainProcessAssignment_3_in_rule__RequestResponseOperation__Group__3__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_17085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_27147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_27178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_07240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_17271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_07302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_17333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_17364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_17395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementStatement_in_rule__BasicStatement__PostIncrementStatementAssignment_2_17426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDecrementStatement_in_rule__BasicStatement__PostDecrementStatementAssignment_3_17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_rule__BasicStatement__NDChoiceStatementAssignment_4_17488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssignStatement__NameAssignment_17519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignStatement__ExpressionAssignment_47550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostIncrementStatement__NameAssignment_17581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostDecrementStatement__NameAssignment_17612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_17643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_27676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_17707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_17738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_3_17769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_4_17800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_rule__NDChoiceStatement__InputOperationAssignment_1_17831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_1_37862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rule__InputOperation__VariablePathAssignment_1_47893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_2_1_1_17924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__RequestResponseOperation__ExpressionAssignment_17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__RequestResponseOperation__MainProcessAssignment_37986 = new BitSet(new long[]{0x0000000000000002L});

}