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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERISK", "RULE_DIVIDE", "RULE_ID", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_CHOICE", "RULE_DECREMENT", "RULE_LSQUARE", "RULE_LINKIN", "RULE_RSQUARE", "RULE_GLOBAL", "RULE_DOT", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ARROW", "RULE_COLON", "RULE_COMMA", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'"
    };
    public static final int RULE_RCURLY=10;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_CHOICE=16;
    public static final int RULE_COLON=27;
    public static final int RULE_ID=8;
    public static final int RULE_LINKIN=19;
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
    public static final int RULE_RSQUARE=20;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:406:1: ruleNDChoiceStatement : ( ( rule__NDChoiceStatement__Alternatives ) ) ;
    public final void ruleNDChoiceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:410:2: ( ( ( rule__NDChoiceStatement__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:411:1: ( ( rule__NDChoiceStatement__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:411:1: ( ( rule__NDChoiceStatement__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:412:1: ( rule__NDChoiceStatement__Alternatives )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:413:1: ( rule__NDChoiceStatement__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:413:2: rule__NDChoiceStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Alternatives_in_ruleNDChoiceStatement814);
            rule__NDChoiceStatement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getAlternatives()); 

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


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:425:1: entryRuleVariablePath : ruleVariablePath EOF ;
    public final void entryRuleVariablePath() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:426:1: ( ruleVariablePath EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:427:1: ruleVariablePath EOF
            {
             before(grammarAccess.getVariablePathRule()); 
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath841);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getVariablePathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath848); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:434:1: ruleVariablePath : ( ( rule__VariablePath__Group__0 ) ) ;
    public final void ruleVariablePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:438:2: ( ( ( rule__VariablePath__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:439:1: ( ( rule__VariablePath__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:439:1: ( ( rule__VariablePath__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:440:1: ( rule__VariablePath__Group__0 )
            {
             before(grammarAccess.getVariablePathAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:441:1: ( rule__VariablePath__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:441:2: rule__VariablePath__Group__0
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__0_in_ruleVariablePath874);
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


    // $ANTLR start rule__Process__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:453:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:457:1: ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) )
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
                    new NoViableAltException("453:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:458:1: ( ( rule__Process__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:458:1: ( ( rule__Process__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:459:1: ( rule__Process__Group_0__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:460:1: ( rule__Process__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:460:2: rule__Process__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives910);
                    rule__Process__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:464:6: ( ( rule__Process__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:464:6: ( ( rule__Process__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:465:1: ( rule__Process__Group_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:466:1: ( rule__Process__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:466:2: rule__Process__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives928);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:475:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) );
    public final void rule__BasicStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:479:1: ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) )
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
                case RULE_CHOICE:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_DECREMENT:
                    {
                    alt2=4;
                    }
                    break;
                case RULE_ASSIGN:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("475:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) );", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LSQUARE:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("475:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) | ( ( rule__BasicStatement__Group_4__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:480:1: ( ( rule__BasicStatement__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:480:1: ( ( rule__BasicStatement__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:481:1: ( rule__BasicStatement__Group_0__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:482:1: ( rule__BasicStatement__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:482:2: rule__BasicStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives961);
                    rule__BasicStatement__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:486:6: ( ( rule__BasicStatement__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:486:6: ( ( rule__BasicStatement__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:487:1: ( rule__BasicStatement__Group_1__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:488:1: ( rule__BasicStatement__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:488:2: rule__BasicStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives979);
                    rule__BasicStatement__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:492:6: ( ( rule__BasicStatement__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:492:6: ( ( rule__BasicStatement__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:493:1: ( rule__BasicStatement__Group_2__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:494:1: ( rule__BasicStatement__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:494:2: rule__BasicStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives997);
                    rule__BasicStatement__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:498:6: ( ( rule__BasicStatement__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:498:6: ( ( rule__BasicStatement__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:499:1: ( rule__BasicStatement__Group_3__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:500:1: ( rule__BasicStatement__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:500:2: rule__BasicStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_3__0_in_rule__BasicStatement__Alternatives1015);
                    rule__BasicStatement__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:504:6: ( ( rule__BasicStatement__Group_4__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:504:6: ( ( rule__BasicStatement__Group_4__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:505:1: ( rule__BasicStatement__Group_4__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_4()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:506:1: ( rule__BasicStatement__Group_4__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:506:2: rule__BasicStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_4__0_in_rule__BasicStatement__Alternatives1033);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:515:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );
    public final void rule__Expression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:519:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) )
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
                    new NoViableAltException("515:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:520:1: ( RULE_PLUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:520:1: ( RULE_PLUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:521:1: RULE_PLUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_01066); 
                     after(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:526:6: ( RULE_MINUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:526:6: ( RULE_MINUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:527:1: RULE_MINUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_01083); 
                     after(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:532:6: ( RULE_ASTERISK )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:532:6: ( RULE_ASTERISK )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:533:1: RULE_ASTERISK
                    {
                     before(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 
                    match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_01100); 
                     after(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:538:6: ( RULE_DIVIDE )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:538:6: ( RULE_DIVIDE )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:539:1: RULE_DIVIDE
                    {
                     before(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3()); 
                    match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_01117); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:549:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:553:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) )
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
                    new NoViableAltException("549:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:554:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:554:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:555:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:556:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:556:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1149);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:560:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:560:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:561:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:562:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:562:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1167);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:566:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:566:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:567:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:568:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:568:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1185);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:572:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:572:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:573:1: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:574:1: ( rule__TerminalExpression__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:574:2: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1203);
                    rule__TerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:578:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:578:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:579:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:580:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:580:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1221);
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


    // $ANTLR start rule__NDChoiceStatement__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:589:1: rule__NDChoiceStatement__Alternatives : ( ( ( rule__NDChoiceStatement__Group_0__0 ) ) | ( ( rule__NDChoiceStatement__Group_1__0 ) ) );
    public final void rule__NDChoiceStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:593:1: ( ( ( rule__NDChoiceStatement__Group_0__0 ) ) | ( ( rule__NDChoiceStatement__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LSQUARE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_LINKIN) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("589:1: rule__NDChoiceStatement__Alternatives : ( ( ( rule__NDChoiceStatement__Group_0__0 ) ) | ( ( rule__NDChoiceStatement__Group_1__0 ) ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("589:1: rule__NDChoiceStatement__Alternatives : ( ( ( rule__NDChoiceStatement__Group_0__0 ) ) | ( ( rule__NDChoiceStatement__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:594:1: ( ( rule__NDChoiceStatement__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:594:1: ( ( rule__NDChoiceStatement__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:595:1: ( rule__NDChoiceStatement__Group_0__0 )
                    {
                     before(grammarAccess.getNDChoiceStatementAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:596:1: ( rule__NDChoiceStatement__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:596:2: rule__NDChoiceStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__0_in_rule__NDChoiceStatement__Alternatives1254);
                    rule__NDChoiceStatement__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNDChoiceStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:600:6: ( ( rule__NDChoiceStatement__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:600:6: ( ( rule__NDChoiceStatement__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:601:1: ( rule__NDChoiceStatement__Group_1__0 )
                    {
                     before(grammarAccess.getNDChoiceStatementAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:602:1: ( rule__NDChoiceStatement__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:602:2: rule__NDChoiceStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__0_in_rule__NDChoiceStatement__Alternatives1272);
                    rule__NDChoiceStatement__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNDChoiceStatementAccess().getGroup_1()); 

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
    // $ANTLR end rule__NDChoiceStatement__Alternatives


    // $ANTLR start rule__VariablePath__Alternatives_2_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:611:1: rule__VariablePath__Alternatives_2_1 : ( ( RULE_ID ) | ( ( rule__VariablePath__Group_2_1_1__0 ) ) );
    public final void rule__VariablePath__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:615:1: ( ( RULE_ID ) | ( ( rule__VariablePath__Group_2_1_1__0 ) ) )
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
                    new NoViableAltException("611:1: rule__VariablePath__Alternatives_2_1 : ( ( RULE_ID ) | ( ( rule__VariablePath__Group_2_1_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:616:1: ( RULE_ID )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:616:1: ( RULE_ID )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:617:1: RULE_ID
                    {
                     before(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_2_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_2_11305); 
                     after(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:6: ( ( rule__VariablePath__Group_2_1_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:6: ( ( rule__VariablePath__Group_2_1_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:623:1: ( rule__VariablePath__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getVariablePathAccess().getGroup_2_1_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:624:1: ( rule__VariablePath__Group_2_1_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:624:2: rule__VariablePath__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__0_in_rule__VariablePath__Alternatives_2_11322);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:635:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:639:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:640:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01353);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01356);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:647:1: rule__Program__Group__0__Impl : ( 'main' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:651:1: ( ( 'main' ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:652:1: ( 'main' )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:652:1: ( 'main' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:653:1: 'main'
            {
             before(grammarAccess.getProgramAccess().getMainKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Program__Group__0__Impl1384); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:666:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:670:1: ( rule__Program__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:671:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11415);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:677:1: rule__Program__Group__1__Impl : ( ( rule__Program__MainAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:681:1: ( ( ( rule__Program__MainAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:682:1: ( ( rule__Program__MainAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:682:1: ( ( rule__Program__MainAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:683:1: ( rule__Program__MainAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:684:1: ( rule__Program__MainAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:684:2: rule__Program__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1442);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:698:1: rule__MainProcess__Group__0 : rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 ;
    public final void rule__MainProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:702:1: ( rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:703:2: rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01476);
            rule__MainProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01479);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:710:1: rule__MainProcess__Group__0__Impl : ( () ) ;
    public final void rule__MainProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:714:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:715:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:715:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:716:1: ()
            {
             before(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:717:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:719:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:729:1: rule__MainProcess__Group__1 : rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 ;
    public final void rule__MainProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:733:1: ( rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:734:2: rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11537);
            rule__MainProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11540);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:741:1: rule__MainProcess__Group__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__MainProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:745:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:746:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:746:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:747:1: RULE_LCURLY
            {
             before(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1567); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:758:1: rule__MainProcess__Group__2 : rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 ;
    public final void rule__MainProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:762:1: ( rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:763:2: rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21596);
            rule__MainProcess__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21599);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:770:1: rule__MainProcess__Group__2__Impl : ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) ;
    public final void rule__MainProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:774:1: ( ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:775:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:775:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:776:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementAssignment_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:777:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:777:2: rule__MainProcess__ParallelStatementAssignment_2
            {
            pushFollow(FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1626);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:787:1: rule__MainProcess__Group__3 : rule__MainProcess__Group__3__Impl ;
    public final void rule__MainProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:791:1: ( rule__MainProcess__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:792:2: rule__MainProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31656);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:798:1: rule__MainProcess__Group__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__MainProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:802:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:803:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:803:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:804:1: RULE_RCURLY
            {
             before(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1683); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:823:1: rule__Process__Group_0__0 : rule__Process__Group_0__0__Impl rule__Process__Group_0__1 ;
    public final void rule__Process__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:827:1: ( rule__Process__Group_0__0__Impl rule__Process__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:828:2: rule__Process__Group_0__0__Impl rule__Process__Group_0__1
            {
            pushFollow(FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01720);
            rule__Process__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01723);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:835:1: rule__Process__Group_0__0__Impl : ( () ) ;
    public final void rule__Process__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:839:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:840:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:840:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:841:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:842:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:844:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:854:1: rule__Process__Group_0__1 : rule__Process__Group_0__1__Impl rule__Process__Group_0__2 ;
    public final void rule__Process__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:858:1: ( rule__Process__Group_0__1__Impl rule__Process__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:859:2: rule__Process__Group_0__1__Impl rule__Process__Group_0__2
            {
            pushFollow(FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11781);
            rule__Process__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11784);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:866:1: rule__Process__Group_0__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__Process__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:870:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:871:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:871:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:872:1: RULE_LCURLY
            {
             before(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1811); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:883:1: rule__Process__Group_0__2 : rule__Process__Group_0__2__Impl rule__Process__Group_0__3 ;
    public final void rule__Process__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:887:1: ( rule__Process__Group_0__2__Impl rule__Process__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:888:2: rule__Process__Group_0__2__Impl rule__Process__Group_0__3
            {
            pushFollow(FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__21840);
            rule__Process__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__21843);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:895:1: rule__Process__Group_0__2__Impl : ( ( rule__Process__ChildrenAssignment_0_2 ) ) ;
    public final void rule__Process__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:899:1: ( ( ( rule__Process__ChildrenAssignment_0_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:900:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:900:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:901:1: ( rule__Process__ChildrenAssignment_0_2 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_0_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:902:1: ( rule__Process__ChildrenAssignment_0_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:902:2: rule__Process__ChildrenAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl1870);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:912:1: rule__Process__Group_0__3 : rule__Process__Group_0__3__Impl ;
    public final void rule__Process__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:916:1: ( rule__Process__Group_0__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:917:2: rule__Process__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__31900);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:923:1: rule__Process__Group_0__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__Process__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:927:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:928:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:928:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:929:1: RULE_RCURLY
            {
             before(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl1927); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:948:1: rule__Process__Group_1__0 : rule__Process__Group_1__0__Impl rule__Process__Group_1__1 ;
    public final void rule__Process__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:952:1: ( rule__Process__Group_1__0__Impl rule__Process__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:953:2: rule__Process__Group_1__0__Impl rule__Process__Group_1__1
            {
            pushFollow(FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__01964);
            rule__Process__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__01967);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:960:1: rule__Process__Group_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Process__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:964:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:965:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:965:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:966:1: RULE_LPAREN
            {
             before(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl1994); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:977:1: rule__Process__Group_1__1 : rule__Process__Group_1__1__Impl rule__Process__Group_1__2 ;
    public final void rule__Process__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:981:1: ( rule__Process__Group_1__1__Impl rule__Process__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:982:2: rule__Process__Group_1__1__Impl rule__Process__Group_1__2
            {
            pushFollow(FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__12023);
            rule__Process__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__12026);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:989:1: rule__Process__Group_1__1__Impl : ( ( rule__Process__ChildrenAssignment_1_1 ) ) ;
    public final void rule__Process__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:993:1: ( ( ( rule__Process__ChildrenAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:994:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:994:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:995:1: ( rule__Process__ChildrenAssignment_1_1 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:996:1: ( rule__Process__ChildrenAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:996:2: rule__Process__ChildrenAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl2053);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1006:1: rule__Process__Group_1__2 : rule__Process__Group_1__2__Impl ;
    public final void rule__Process__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1010:1: ( rule__Process__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1011:2: rule__Process__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__22083);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1017:1: rule__Process__Group_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Process__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1021:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1022:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1022:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1023:1: RULE_RPAREN
            {
             before(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl2110); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1040:1: rule__ParallelStatement__Group__0 : rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 ;
    public final void rule__ParallelStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1044:1: ( rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1045:2: rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__02145);
            rule__ParallelStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__02148);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1052:1: rule__ParallelStatement__Group__0__Impl : ( () ) ;
    public final void rule__ParallelStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1056:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1057:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1057:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1058:1: ()
            {
             before(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1059:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1061:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1071:1: rule__ParallelStatement__Group__1 : rule__ParallelStatement__Group__1__Impl ;
    public final void rule__ParallelStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1075:1: ( rule__ParallelStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1076:2: rule__ParallelStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__12206);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1082:1: rule__ParallelStatement__Group__1__Impl : ( ( rule__ParallelStatement__Group_1__0 ) ) ;
    public final void rule__ParallelStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1086:1: ( ( ( rule__ParallelStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1087:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1087:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1088:1: ( rule__ParallelStatement__Group_1__0 )
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1089:1: ( rule__ParallelStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1089:2: rule__ParallelStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl2233);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1103:1: rule__ParallelStatement__Group_1__0 : rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 ;
    public final void rule__ParallelStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1107:1: ( rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1108:2: rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02267);
            rule__ParallelStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02270);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1115:1: rule__ParallelStatement__Group_1__0__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__ParallelStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1119:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1120:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1120:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1121:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1122:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1122:2: rule__ParallelStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2297);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1132:1: rule__ParallelStatement__Group_1__1 : rule__ParallelStatement__Group_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1136:1: ( rule__ParallelStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1137:2: rule__ParallelStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12327);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1143:1: rule__ParallelStatement__Group_1__1__Impl : ( ( rule__ParallelStatement__Group_1_1__0 )* ) ;
    public final void rule__ParallelStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1147:1: ( ( ( rule__ParallelStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1148:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1148:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1149:1: ( rule__ParallelStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1150:1: ( rule__ParallelStatement__Group_1_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_VERT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1150:2: rule__ParallelStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2354);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1164:1: rule__ParallelStatement__Group_1_1__0 : rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 ;
    public final void rule__ParallelStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1168:1: ( rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1169:2: rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02389);
            rule__ParallelStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02392);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1176:1: rule__ParallelStatement__Group_1_1__0__Impl : ( RULE_VERT ) ;
    public final void rule__ParallelStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1180:1: ( ( RULE_VERT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1181:1: ( RULE_VERT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1181:1: ( RULE_VERT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1182:1: RULE_VERT
            {
             before(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0()); 
            match(input,RULE_VERT,FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2419); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1193:1: rule__ParallelStatement__Group_1_1__1 : rule__ParallelStatement__Group_1_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1197:1: ( rule__ParallelStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1198:2: rule__ParallelStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12448);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1204:1: rule__ParallelStatement__Group_1_1__1__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__ParallelStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1208:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1209:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1209:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1210:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1211:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1211:2: rule__ParallelStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2475);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1225:1: rule__SequenceStatement__Group__0 : rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 ;
    public final void rule__SequenceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1229:1: ( rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1230:2: rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02509);
            rule__SequenceStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02512);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1237:1: rule__SequenceStatement__Group__0__Impl : ( () ) ;
    public final void rule__SequenceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1241:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1242:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1242:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1243:1: ()
            {
             before(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1244:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1246:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1256:1: rule__SequenceStatement__Group__1 : rule__SequenceStatement__Group__1__Impl ;
    public final void rule__SequenceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1260:1: ( rule__SequenceStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1261:2: rule__SequenceStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12570);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1267:1: rule__SequenceStatement__Group__1__Impl : ( ( rule__SequenceStatement__Group_1__0 ) ) ;
    public final void rule__SequenceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1271:1: ( ( ( rule__SequenceStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1272:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1272:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1273:1: ( rule__SequenceStatement__Group_1__0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1274:1: ( rule__SequenceStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1274:2: rule__SequenceStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2597);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1288:1: rule__SequenceStatement__Group_1__0 : rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 ;
    public final void rule__SequenceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1292:1: ( rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1293:2: rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02631);
            rule__SequenceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02634);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1300:1: rule__SequenceStatement__Group_1__0__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__SequenceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1304:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1305:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1305:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1306:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1307:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1307:2: rule__SequenceStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2661);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1317:1: rule__SequenceStatement__Group_1__1 : rule__SequenceStatement__Group_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1321:1: ( rule__SequenceStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1322:2: rule__SequenceStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12691);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1328:1: rule__SequenceStatement__Group_1__1__Impl : ( ( rule__SequenceStatement__Group_1_1__0 )* ) ;
    public final void rule__SequenceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1332:1: ( ( ( rule__SequenceStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1333:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1333:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1334:1: ( rule__SequenceStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1335:1: ( rule__SequenceStatement__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SEMICOLON) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1335:2: rule__SequenceStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2718);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1349:1: rule__SequenceStatement__Group_1_1__0 : rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 ;
    public final void rule__SequenceStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1353:1: ( rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1354:2: rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02753);
            rule__SequenceStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02756);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1361:1: rule__SequenceStatement__Group_1_1__0__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SequenceStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1365:1: ( ( RULE_SEMICOLON ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1366:1: ( RULE_SEMICOLON )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1366:1: ( RULE_SEMICOLON )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1367:1: RULE_SEMICOLON
            {
             before(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0()); 
            match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2783); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1378:1: rule__SequenceStatement__Group_1_1__1 : rule__SequenceStatement__Group_1_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1382:1: ( rule__SequenceStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1383:2: rule__SequenceStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12812);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1389:1: rule__SequenceStatement__Group_1_1__1__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__SequenceStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1393:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1394:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1394:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1395:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1396:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1396:2: rule__SequenceStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl2839);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1410:1: rule__BasicStatement__Group_0__0 : rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 ;
    public final void rule__BasicStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1414:1: ( rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1415:2: rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__02873);
            rule__BasicStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__02876);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1422:1: rule__BasicStatement__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1426:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1427:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1427:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1428:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1429:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1431:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1441:1: rule__BasicStatement__Group_0__1 : rule__BasicStatement__Group_0__1__Impl ;
    public final void rule__BasicStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1445:1: ( rule__BasicStatement__Group_0__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1446:2: rule__BasicStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__12934);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1452:1: rule__BasicStatement__Group_0__1__Impl : ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) ;
    public final void rule__BasicStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1456:1: ( ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1457:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1457:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1458:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAssignment_0_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1459:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1459:2: rule__BasicStatement__ProcessAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl2961);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1473:1: rule__BasicStatement__Group_1__0 : rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 ;
    public final void rule__BasicStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1477:1: ( rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1478:2: rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__02995);
            rule__BasicStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__02998);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1485:1: rule__BasicStatement__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1489:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1490:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1490:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1491:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1492:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1494:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1504:1: rule__BasicStatement__Group_1__1 : rule__BasicStatement__Group_1__1__Impl ;
    public final void rule__BasicStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1508:1: ( rule__BasicStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1509:2: rule__BasicStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__13056);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1515:1: rule__BasicStatement__Group_1__1__Impl : ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) ;
    public final void rule__BasicStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1519:1: ( ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1520:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1520:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1521:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1522:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1522:2: rule__BasicStatement__AssignStatementAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl3083);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1536:1: rule__BasicStatement__Group_2__0 : rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 ;
    public final void rule__BasicStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1540:1: ( rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1541:2: rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__03117);
            rule__BasicStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__03120);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1548:1: rule__BasicStatement__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1552:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1553:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1553:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1554:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1555:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1557:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1567:1: rule__BasicStatement__Group_2__1 : rule__BasicStatement__Group_2__1__Impl ;
    public final void rule__BasicStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1571:1: ( rule__BasicStatement__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1572:2: rule__BasicStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__13178);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1578:1: rule__BasicStatement__Group_2__1__Impl : ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) ) ;
    public final void rule__BasicStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1582:1: ( ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1583:1: ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1583:1: ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1584:1: ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1585:1: ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1585:2: rule__BasicStatement__PostIncrementStatementAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__PostIncrementStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl3205);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1599:1: rule__BasicStatement__Group_3__0 : rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1 ;
    public final void rule__BasicStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1603:1: ( rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1604:2: rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_3__0__Impl_in_rule__BasicStatement__Group_3__03239);
            rule__BasicStatement__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_3__1_in_rule__BasicStatement__Group_3__03242);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1611:1: rule__BasicStatement__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1615:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1616:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1616:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1617:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1618:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1620:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1630:1: rule__BasicStatement__Group_3__1 : rule__BasicStatement__Group_3__1__Impl ;
    public final void rule__BasicStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1634:1: ( rule__BasicStatement__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1635:2: rule__BasicStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_3__1__Impl_in_rule__BasicStatement__Group_3__13300);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1641:1: rule__BasicStatement__Group_3__1__Impl : ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) ) ;
    public final void rule__BasicStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1645:1: ( ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1646:1: ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1646:1: ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1647:1: ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1648:1: ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1648:2: rule__BasicStatement__PostDecrementStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__PostDecrementStatementAssignment_3_1_in_rule__BasicStatement__Group_3__1__Impl3327);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1662:1: rule__BasicStatement__Group_4__0 : rule__BasicStatement__Group_4__0__Impl rule__BasicStatement__Group_4__1 ;
    public final void rule__BasicStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1666:1: ( rule__BasicStatement__Group_4__0__Impl rule__BasicStatement__Group_4__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1667:2: rule__BasicStatement__Group_4__0__Impl rule__BasicStatement__Group_4__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_4__0__Impl_in_rule__BasicStatement__Group_4__03361);
            rule__BasicStatement__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_4__1_in_rule__BasicStatement__Group_4__03364);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1674:1: rule__BasicStatement__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1678:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1679:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1679:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1680:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_4_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1681:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1683:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1693:1: rule__BasicStatement__Group_4__1 : rule__BasicStatement__Group_4__1__Impl ;
    public final void rule__BasicStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1697:1: ( rule__BasicStatement__Group_4__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1698:2: rule__BasicStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_4__1__Impl_in_rule__BasicStatement__Group_4__13422);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1704:1: rule__BasicStatement__Group_4__1__Impl : ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) ) ;
    public final void rule__BasicStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1708:1: ( ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1709:1: ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1709:1: ( ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1710:1: ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAssignment_4_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1711:1: ( rule__BasicStatement__NDChoiceStatementAssignment_4_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1711:2: rule__BasicStatement__NDChoiceStatementAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__NDChoiceStatementAssignment_4_1_in_rule__BasicStatement__Group_4__1__Impl3449);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1725:1: rule__AssignStatement__Group__0 : rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 ;
    public final void rule__AssignStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1729:1: ( rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1730:2: rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03483);
            rule__AssignStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03486);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1737:1: rule__AssignStatement__Group__0__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1741:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1742:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1742:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1743:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1744:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1746:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1756:1: rule__AssignStatement__Group__1 : rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 ;
    public final void rule__AssignStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1760:1: ( rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1761:2: rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13544);
            rule__AssignStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13547);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1768:1: rule__AssignStatement__Group__1__Impl : ( ( rule__AssignStatement__NameAssignment_1 ) ) ;
    public final void rule__AssignStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1772:1: ( ( ( rule__AssignStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1773:1: ( ( rule__AssignStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1773:1: ( ( rule__AssignStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1774:1: ( rule__AssignStatement__NameAssignment_1 )
            {
             before(grammarAccess.getAssignStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1775:1: ( rule__AssignStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1775:2: rule__AssignStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AssignStatement__NameAssignment_1_in_rule__AssignStatement__Group__1__Impl3574);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1785:1: rule__AssignStatement__Group__2 : rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 ;
    public final void rule__AssignStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1789:1: ( rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1790:2: rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23604);
            rule__AssignStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23607);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1797:1: rule__AssignStatement__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__AssignStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1801:1: ( ( RULE_ASSIGN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1802:1: ( RULE_ASSIGN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1802:1: ( RULE_ASSIGN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1803:1: RULE_ASSIGN
            {
             before(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3634); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1814:1: rule__AssignStatement__Group__3 : rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4 ;
    public final void rule__AssignStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1818:1: ( rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1819:2: rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33663);
            rule__AssignStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__4_in_rule__AssignStatement__Group__33666);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1826:1: rule__AssignStatement__Group__3__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1830:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1831:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1831:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1832:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionAction_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1833:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1835:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1845:1: rule__AssignStatement__Group__4 : rule__AssignStatement__Group__4__Impl ;
    public final void rule__AssignStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1849:1: ( rule__AssignStatement__Group__4__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1850:2: rule__AssignStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__4__Impl_in_rule__AssignStatement__Group__43724);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1856:1: rule__AssignStatement__Group__4__Impl : ( ( rule__AssignStatement__ExpressionAssignment_4 ) ) ;
    public final void rule__AssignStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1860:1: ( ( ( rule__AssignStatement__ExpressionAssignment_4 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1861:1: ( ( rule__AssignStatement__ExpressionAssignment_4 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1861:1: ( ( rule__AssignStatement__ExpressionAssignment_4 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1862:1: ( rule__AssignStatement__ExpressionAssignment_4 )
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionAssignment_4()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1863:1: ( rule__AssignStatement__ExpressionAssignment_4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1863:2: rule__AssignStatement__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__AssignStatement__ExpressionAssignment_4_in_rule__AssignStatement__Group__4__Impl3751);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1883:1: rule__PostIncrementStatement__Group__0 : rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1 ;
    public final void rule__PostIncrementStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1887:1: ( rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1888:2: rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__0__Impl_in_rule__PostIncrementStatement__Group__03791);
            rule__PostIncrementStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__1_in_rule__PostIncrementStatement__Group__03794);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1895:1: rule__PostIncrementStatement__Group__0__Impl : ( () ) ;
    public final void rule__PostIncrementStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1899:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1900:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1900:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1901:1: ()
            {
             before(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1902:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1904:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1914:1: rule__PostIncrementStatement__Group__1 : rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2 ;
    public final void rule__PostIncrementStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1918:1: ( rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1919:2: rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__1__Impl_in_rule__PostIncrementStatement__Group__13852);
            rule__PostIncrementStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__2_in_rule__PostIncrementStatement__Group__13855);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1926:1: rule__PostIncrementStatement__Group__1__Impl : ( ( rule__PostIncrementStatement__NameAssignment_1 ) ) ;
    public final void rule__PostIncrementStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1930:1: ( ( ( rule__PostIncrementStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1931:1: ( ( rule__PostIncrementStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1931:1: ( ( rule__PostIncrementStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1932:1: ( rule__PostIncrementStatement__NameAssignment_1 )
            {
             before(grammarAccess.getPostIncrementStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1933:1: ( rule__PostIncrementStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1933:2: rule__PostIncrementStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__NameAssignment_1_in_rule__PostIncrementStatement__Group__1__Impl3882);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1943:1: rule__PostIncrementStatement__Group__2 : rule__PostIncrementStatement__Group__2__Impl ;
    public final void rule__PostIncrementStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1947:1: ( rule__PostIncrementStatement__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1948:2: rule__PostIncrementStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__2__Impl_in_rule__PostIncrementStatement__Group__23912);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1954:1: rule__PostIncrementStatement__Group__2__Impl : ( RULE_CHOICE ) ;
    public final void rule__PostIncrementStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1958:1: ( ( RULE_CHOICE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1959:1: ( RULE_CHOICE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1959:1: ( RULE_CHOICE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1960:1: RULE_CHOICE
            {
             before(grammarAccess.getPostIncrementStatementAccess().getCHOICETerminalRuleCall_2()); 
            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rule__PostIncrementStatement__Group__2__Impl3939); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1977:1: rule__PostDecrementStatement__Group__0 : rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1 ;
    public final void rule__PostDecrementStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1981:1: ( rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1982:2: rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__0__Impl_in_rule__PostDecrementStatement__Group__03974);
            rule__PostDecrementStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__1_in_rule__PostDecrementStatement__Group__03977);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1989:1: rule__PostDecrementStatement__Group__0__Impl : ( () ) ;
    public final void rule__PostDecrementStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1993:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1994:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1994:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1995:1: ()
            {
             before(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1996:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1998:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2008:1: rule__PostDecrementStatement__Group__1 : rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2 ;
    public final void rule__PostDecrementStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2012:1: ( rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2013:2: rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__1__Impl_in_rule__PostDecrementStatement__Group__14035);
            rule__PostDecrementStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__2_in_rule__PostDecrementStatement__Group__14038);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2020:1: rule__PostDecrementStatement__Group__1__Impl : ( ( rule__PostDecrementStatement__NameAssignment_1 ) ) ;
    public final void rule__PostDecrementStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2024:1: ( ( ( rule__PostDecrementStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2025:1: ( ( rule__PostDecrementStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2025:1: ( ( rule__PostDecrementStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2026:1: ( rule__PostDecrementStatement__NameAssignment_1 )
            {
             before(grammarAccess.getPostDecrementStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2027:1: ( rule__PostDecrementStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2027:2: rule__PostDecrementStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__NameAssignment_1_in_rule__PostDecrementStatement__Group__1__Impl4065);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2037:1: rule__PostDecrementStatement__Group__2 : rule__PostDecrementStatement__Group__2__Impl ;
    public final void rule__PostDecrementStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2041:1: ( rule__PostDecrementStatement__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2042:2: rule__PostDecrementStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__2__Impl_in_rule__PostDecrementStatement__Group__24095);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2048:1: rule__PostDecrementStatement__Group__2__Impl : ( RULE_DECREMENT ) ;
    public final void rule__PostDecrementStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2052:1: ( ( RULE_DECREMENT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2053:1: ( RULE_DECREMENT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2053:1: ( RULE_DECREMENT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2054:1: RULE_DECREMENT
            {
             before(grammarAccess.getPostDecrementStatementAccess().getDECREMENTTerminalRuleCall_2()); 
            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rule__PostDecrementStatement__Group__2__Impl4122); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2071:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2075:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2076:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04157);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04160);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2083:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2087:1: ( ( ruleTerminalExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2088:1: ( ruleTerminalExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2088:1: ( ruleTerminalExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2089:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl4187);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2100:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2104:1: ( rule__Expression__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2105:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14216);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2111:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2115:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2116:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2116:1: ( ( rule__Expression__Group_1__0 )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2117:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2118:1: ( rule__Expression__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_PLUS && LA9_0<=RULE_DIVIDE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2118:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4243);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2132:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2136:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2137:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04278);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04281);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2144:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2148:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2149:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2149:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2150:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2151:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2153:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2163:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2167:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2168:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14339);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14342);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2175:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2179:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2180:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2180:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2181:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2182:1: ( rule__Expression__OpAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2182:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4369);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2192:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2196:1: ( rule__Expression__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2197:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24399);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2203:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2207:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2208:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2208:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2209:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2210:1: ( rule__Expression__RightAssignment_1_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2210:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4426);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2226:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2230:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2231:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04462);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04465);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2238:1: rule__TerminalExpression__Group_0__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2242:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2243:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2243:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2244:1: RULE_LPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4492); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2255:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2259:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2260:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14521);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14524);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2267:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2271:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2272:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2272:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2273:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4551);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2284:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2288:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2289:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24580);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2295:1: rule__TerminalExpression__Group_0__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2299:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2300:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2300:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2301:1: RULE_RPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4607); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2318:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2322:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2323:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04642);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04645);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2330:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2334:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2335:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2335:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2336:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2337:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2339:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2349:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2353:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2354:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14703);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2360:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2364:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2365:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2365:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2366:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2367:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2367:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4730);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2381:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2385:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2386:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04764);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04767);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2393:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2397:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2398:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2398:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2399:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2400:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2402:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2412:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2416:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2417:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14825);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2423:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2427:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2428:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2428:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2429:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2430:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2430:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4852);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2444:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2448:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2449:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__04886);
            rule__TerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__04889);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2456:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2460:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2461:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2461:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2462:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2463:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2465:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2475:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2479:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2480:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__14947);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2486:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2490:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2491:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2491:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2492:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2493:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2493:2: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl4974);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2507:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2511:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2512:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__05008);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__05011);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2519:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2523:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2524:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2524:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2525:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringAction_4_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2526:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2528:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2538:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2542:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2543:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__15069);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2549:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2553:1: ( ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2554:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2554:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2555:1: ( rule__TerminalExpression__ValueAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2556:1: ( rule__TerminalExpression__ValueAssignment_4_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2556:2: rule__TerminalExpression__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl5096);
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


    // $ANTLR start rule__NDChoiceStatement__Group_0__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2570:1: rule__NDChoiceStatement__Group_0__0 : rule__NDChoiceStatement__Group_0__0__Impl rule__NDChoiceStatement__Group_0__1 ;
    public final void rule__NDChoiceStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2574:1: ( rule__NDChoiceStatement__Group_0__0__Impl rule__NDChoiceStatement__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2575:2: rule__NDChoiceStatement__Group_0__0__Impl rule__NDChoiceStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__0__Impl_in_rule__NDChoiceStatement__Group_0__05130);
            rule__NDChoiceStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__1_in_rule__NDChoiceStatement__Group_0__05133);
            rule__NDChoiceStatement__Group_0__1();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__0


    // $ANTLR start rule__NDChoiceStatement__Group_0__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2582:1: rule__NDChoiceStatement__Group_0__0__Impl : ( RULE_LSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2586:1: ( ( RULE_LSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2587:1: ( RULE_LSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2587:1: ( RULE_LSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2588:1: RULE_LSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_0_0()); 
            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_0__0__Impl5160); 
             after(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__0__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2599:1: rule__NDChoiceStatement__Group_0__1 : rule__NDChoiceStatement__Group_0__1__Impl rule__NDChoiceStatement__Group_0__2 ;
    public final void rule__NDChoiceStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2603:1: ( rule__NDChoiceStatement__Group_0__1__Impl rule__NDChoiceStatement__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2604:2: rule__NDChoiceStatement__Group_0__1__Impl rule__NDChoiceStatement__Group_0__2
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__1__Impl_in_rule__NDChoiceStatement__Group_0__15189);
            rule__NDChoiceStatement__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__2_in_rule__NDChoiceStatement__Group_0__15192);
            rule__NDChoiceStatement__Group_0__2();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__1


    // $ANTLR start rule__NDChoiceStatement__Group_0__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2611:1: rule__NDChoiceStatement__Group_0__1__Impl : ( RULE_LINKIN ) ;
    public final void rule__NDChoiceStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2615:1: ( ( RULE_LINKIN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2616:1: ( RULE_LINKIN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2616:1: ( RULE_LINKIN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2617:1: RULE_LINKIN
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLINKINTerminalRuleCall_0_1()); 
            match(input,RULE_LINKIN,FOLLOW_RULE_LINKIN_in_rule__NDChoiceStatement__Group_0__1__Impl5219); 
             after(grammarAccess.getNDChoiceStatementAccess().getLINKINTerminalRuleCall_0_1()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__1__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2628:1: rule__NDChoiceStatement__Group_0__2 : rule__NDChoiceStatement__Group_0__2__Impl rule__NDChoiceStatement__Group_0__3 ;
    public final void rule__NDChoiceStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2632:1: ( rule__NDChoiceStatement__Group_0__2__Impl rule__NDChoiceStatement__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2633:2: rule__NDChoiceStatement__Group_0__2__Impl rule__NDChoiceStatement__Group_0__3
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__2__Impl_in_rule__NDChoiceStatement__Group_0__25248);
            rule__NDChoiceStatement__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__3_in_rule__NDChoiceStatement__Group_0__25251);
            rule__NDChoiceStatement__Group_0__3();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__2


    // $ANTLR start rule__NDChoiceStatement__Group_0__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2640:1: rule__NDChoiceStatement__Group_0__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__NDChoiceStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2644:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2645:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2645:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2646:1: RULE_LPAREN
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_0_2()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__NDChoiceStatement__Group_0__2__Impl5278); 
             after(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_0_2()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__2__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2657:1: rule__NDChoiceStatement__Group_0__3 : rule__NDChoiceStatement__Group_0__3__Impl rule__NDChoiceStatement__Group_0__4 ;
    public final void rule__NDChoiceStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2661:1: ( rule__NDChoiceStatement__Group_0__3__Impl rule__NDChoiceStatement__Group_0__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2662:2: rule__NDChoiceStatement__Group_0__3__Impl rule__NDChoiceStatement__Group_0__4
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__3__Impl_in_rule__NDChoiceStatement__Group_0__35307);
            rule__NDChoiceStatement__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__4_in_rule__NDChoiceStatement__Group_0__35310);
            rule__NDChoiceStatement__Group_0__4();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__3


    // $ANTLR start rule__NDChoiceStatement__Group_0__3__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2669:1: rule__NDChoiceStatement__Group_0__3__Impl : ( RULE_ID ) ;
    public final void rule__NDChoiceStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2673:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2674:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2674:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2675:1: RULE_ID
            {
             before(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_0_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NDChoiceStatement__Group_0__3__Impl5337); 
             after(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_0_3()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__3__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2686:1: rule__NDChoiceStatement__Group_0__4 : rule__NDChoiceStatement__Group_0__4__Impl rule__NDChoiceStatement__Group_0__5 ;
    public final void rule__NDChoiceStatement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2690:1: ( rule__NDChoiceStatement__Group_0__4__Impl rule__NDChoiceStatement__Group_0__5 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2691:2: rule__NDChoiceStatement__Group_0__4__Impl rule__NDChoiceStatement__Group_0__5
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__4__Impl_in_rule__NDChoiceStatement__Group_0__45366);
            rule__NDChoiceStatement__Group_0__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__5_in_rule__NDChoiceStatement__Group_0__45369);
            rule__NDChoiceStatement__Group_0__5();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__4


    // $ANTLR start rule__NDChoiceStatement__Group_0__4__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2698:1: rule__NDChoiceStatement__Group_0__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__NDChoiceStatement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2702:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2703:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2703:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2704:1: RULE_RPAREN
            {
             before(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_0_4()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__NDChoiceStatement__Group_0__4__Impl5396); 
             after(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_0_4()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__4__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__5
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2715:1: rule__NDChoiceStatement__Group_0__5 : rule__NDChoiceStatement__Group_0__5__Impl rule__NDChoiceStatement__Group_0__6 ;
    public final void rule__NDChoiceStatement__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2719:1: ( rule__NDChoiceStatement__Group_0__5__Impl rule__NDChoiceStatement__Group_0__6 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2720:2: rule__NDChoiceStatement__Group_0__5__Impl rule__NDChoiceStatement__Group_0__6
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__5__Impl_in_rule__NDChoiceStatement__Group_0__55425);
            rule__NDChoiceStatement__Group_0__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__6_in_rule__NDChoiceStatement__Group_0__55428);
            rule__NDChoiceStatement__Group_0__6();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__5


    // $ANTLR start rule__NDChoiceStatement__Group_0__5__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2727:1: rule__NDChoiceStatement__Group_0__5__Impl : ( RULE_RSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2731:1: ( ( RULE_RSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2732:1: ( RULE_RSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2732:1: ( RULE_RSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2733:1: RULE_RSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_0_5()); 
            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_0__5__Impl5455); 
             after(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_0_5()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__5__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__6
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2744:1: rule__NDChoiceStatement__Group_0__6 : rule__NDChoiceStatement__Group_0__6__Impl rule__NDChoiceStatement__Group_0__7 ;
    public final void rule__NDChoiceStatement__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2748:1: ( rule__NDChoiceStatement__Group_0__6__Impl rule__NDChoiceStatement__Group_0__7 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2749:2: rule__NDChoiceStatement__Group_0__6__Impl rule__NDChoiceStatement__Group_0__7
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__6__Impl_in_rule__NDChoiceStatement__Group_0__65484);
            rule__NDChoiceStatement__Group_0__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__7_in_rule__NDChoiceStatement__Group_0__65487);
            rule__NDChoiceStatement__Group_0__7();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__6


    // $ANTLR start rule__NDChoiceStatement__Group_0__6__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2756:1: rule__NDChoiceStatement__Group_0__6__Impl : ( () ) ;
    public final void rule__NDChoiceStatement__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2760:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2761:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2761:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2762:1: ()
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessAction_0_6()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2763:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2765:1: 
            {
            }

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessAction_0_6()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_0__6__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_0__7
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2775:1: rule__NDChoiceStatement__Group_0__7 : rule__NDChoiceStatement__Group_0__7__Impl ;
    public final void rule__NDChoiceStatement__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2779:1: ( rule__NDChoiceStatement__Group_0__7__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2780:2: rule__NDChoiceStatement__Group_0__7__Impl
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_0__7__Impl_in_rule__NDChoiceStatement__Group_0__75545);
            rule__NDChoiceStatement__Group_0__7__Impl();
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
    // $ANTLR end rule__NDChoiceStatement__Group_0__7


    // $ANTLR start rule__NDChoiceStatement__Group_0__7__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2786:1: rule__NDChoiceStatement__Group_0__7__Impl : ( ( rule__NDChoiceStatement__MainProcessAssignment_0_7 ) ) ;
    public final void rule__NDChoiceStatement__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2790:1: ( ( ( rule__NDChoiceStatement__MainProcessAssignment_0_7 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2791:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_0_7 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2791:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_0_7 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2792:1: ( rule__NDChoiceStatement__MainProcessAssignment_0_7 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_0_7()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2793:1: ( rule__NDChoiceStatement__MainProcessAssignment_0_7 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2793:2: rule__NDChoiceStatement__MainProcessAssignment_0_7
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_0_7_in_rule__NDChoiceStatement__Group_0__7__Impl5572);
            rule__NDChoiceStatement__MainProcessAssignment_0_7();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_0_7()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_0__7__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2819:1: rule__NDChoiceStatement__Group_1__0 : rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1 ;
    public final void rule__NDChoiceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2823:1: ( rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2824:2: rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__0__Impl_in_rule__NDChoiceStatement__Group_1__05618);
            rule__NDChoiceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__1_in_rule__NDChoiceStatement__Group_1__05621);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2831:1: rule__NDChoiceStatement__Group_1__0__Impl : ( RULE_LSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2835:1: ( ( RULE_LSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2836:1: ( RULE_LSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2836:1: ( RULE_LSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2837:1: RULE_LSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0()); 
            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_1__0__Impl5648); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2848:1: rule__NDChoiceStatement__Group_1__1 : rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2 ;
    public final void rule__NDChoiceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2852:1: ( rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2853:2: rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__1__Impl_in_rule__NDChoiceStatement__Group_1__15677);
            rule__NDChoiceStatement__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__2_in_rule__NDChoiceStatement__Group_1__15680);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2860:1: rule__NDChoiceStatement__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__NDChoiceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2864:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2865:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2865:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2866:1: RULE_ID
            {
             before(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NDChoiceStatement__Group_1__1__Impl5707); 
             after(grammarAccess.getNDChoiceStatementAccess().getIDTerminalRuleCall_1_1()); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2877:1: rule__NDChoiceStatement__Group_1__2 : rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3 ;
    public final void rule__NDChoiceStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2881:1: ( rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2882:2: rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__2__Impl_in_rule__NDChoiceStatement__Group_1__25736);
            rule__NDChoiceStatement__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__3_in_rule__NDChoiceStatement__Group_1__25739);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2889:1: rule__NDChoiceStatement__Group_1__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__NDChoiceStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2893:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2894:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2894:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2895:1: RULE_LPAREN
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_2()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__NDChoiceStatement__Group_1__2__Impl5766); 
             after(grammarAccess.getNDChoiceStatementAccess().getLPARENTerminalRuleCall_1_2()); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2906:1: rule__NDChoiceStatement__Group_1__3 : rule__NDChoiceStatement__Group_1__3__Impl rule__NDChoiceStatement__Group_1__4 ;
    public final void rule__NDChoiceStatement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2910:1: ( rule__NDChoiceStatement__Group_1__3__Impl rule__NDChoiceStatement__Group_1__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2911:2: rule__NDChoiceStatement__Group_1__3__Impl rule__NDChoiceStatement__Group_1__4
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__3__Impl_in_rule__NDChoiceStatement__Group_1__35795);
            rule__NDChoiceStatement__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__4_in_rule__NDChoiceStatement__Group_1__35798);
            rule__NDChoiceStatement__Group_1__4();
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2918:1: rule__NDChoiceStatement__Group_1__3__Impl : ( () ) ;
    public final void rule__NDChoiceStatement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2922:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2923:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2923:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2924:1: ()
            {
             before(grammarAccess.getNDChoiceStatementAccess().getVariablePathAction_1_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2925:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2927:1: 
            {
            }

             after(grammarAccess.getNDChoiceStatementAccess().getVariablePathAction_1_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__3__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2937:1: rule__NDChoiceStatement__Group_1__4 : rule__NDChoiceStatement__Group_1__4__Impl rule__NDChoiceStatement__Group_1__5 ;
    public final void rule__NDChoiceStatement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2941:1: ( rule__NDChoiceStatement__Group_1__4__Impl rule__NDChoiceStatement__Group_1__5 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2942:2: rule__NDChoiceStatement__Group_1__4__Impl rule__NDChoiceStatement__Group_1__5
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__4__Impl_in_rule__NDChoiceStatement__Group_1__45856);
            rule__NDChoiceStatement__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__5_in_rule__NDChoiceStatement__Group_1__45859);
            rule__NDChoiceStatement__Group_1__5();
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
    // $ANTLR end rule__NDChoiceStatement__Group_1__4


    // $ANTLR start rule__NDChoiceStatement__Group_1__4__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2949:1: rule__NDChoiceStatement__Group_1__4__Impl : ( ( rule__NDChoiceStatement__VariablePathAssignment_1_4 ) ) ;
    public final void rule__NDChoiceStatement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2953:1: ( ( ( rule__NDChoiceStatement__VariablePathAssignment_1_4 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2954:1: ( ( rule__NDChoiceStatement__VariablePathAssignment_1_4 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2954:1: ( ( rule__NDChoiceStatement__VariablePathAssignment_1_4 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2955:1: ( rule__NDChoiceStatement__VariablePathAssignment_1_4 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getVariablePathAssignment_1_4()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2956:1: ( rule__NDChoiceStatement__VariablePathAssignment_1_4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2956:2: rule__NDChoiceStatement__VariablePathAssignment_1_4
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__VariablePathAssignment_1_4_in_rule__NDChoiceStatement__Group_1__4__Impl5886);
            rule__NDChoiceStatement__VariablePathAssignment_1_4();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getVariablePathAssignment_1_4()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_1__4__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__5
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2966:1: rule__NDChoiceStatement__Group_1__5 : rule__NDChoiceStatement__Group_1__5__Impl rule__NDChoiceStatement__Group_1__6 ;
    public final void rule__NDChoiceStatement__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2970:1: ( rule__NDChoiceStatement__Group_1__5__Impl rule__NDChoiceStatement__Group_1__6 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2971:2: rule__NDChoiceStatement__Group_1__5__Impl rule__NDChoiceStatement__Group_1__6
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__5__Impl_in_rule__NDChoiceStatement__Group_1__55916);
            rule__NDChoiceStatement__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__6_in_rule__NDChoiceStatement__Group_1__55919);
            rule__NDChoiceStatement__Group_1__6();
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
    // $ANTLR end rule__NDChoiceStatement__Group_1__5


    // $ANTLR start rule__NDChoiceStatement__Group_1__5__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2978:1: rule__NDChoiceStatement__Group_1__5__Impl : ( RULE_RPAREN ) ;
    public final void rule__NDChoiceStatement__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2982:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2983:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2983:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2984:1: RULE_RPAREN
            {
             before(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_5()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__NDChoiceStatement__Group_1__5__Impl5946); 
             after(grammarAccess.getNDChoiceStatementAccess().getRPARENTerminalRuleCall_1_5()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_1__5__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__6
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2995:1: rule__NDChoiceStatement__Group_1__6 : rule__NDChoiceStatement__Group_1__6__Impl rule__NDChoiceStatement__Group_1__7 ;
    public final void rule__NDChoiceStatement__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2999:1: ( rule__NDChoiceStatement__Group_1__6__Impl rule__NDChoiceStatement__Group_1__7 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3000:2: rule__NDChoiceStatement__Group_1__6__Impl rule__NDChoiceStatement__Group_1__7
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__6__Impl_in_rule__NDChoiceStatement__Group_1__65975);
            rule__NDChoiceStatement__Group_1__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__7_in_rule__NDChoiceStatement__Group_1__65978);
            rule__NDChoiceStatement__Group_1__7();
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
    // $ANTLR end rule__NDChoiceStatement__Group_1__6


    // $ANTLR start rule__NDChoiceStatement__Group_1__6__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3007:1: rule__NDChoiceStatement__Group_1__6__Impl : ( RULE_RSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3011:1: ( ( RULE_RSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3012:1: ( RULE_RSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3012:1: ( RULE_RSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3013:1: RULE_RSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_6()); 
            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_1__6__Impl6005); 
             after(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_6()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_1__6__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__7
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3024:1: rule__NDChoiceStatement__Group_1__7 : rule__NDChoiceStatement__Group_1__7__Impl rule__NDChoiceStatement__Group_1__8 ;
    public final void rule__NDChoiceStatement__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3028:1: ( rule__NDChoiceStatement__Group_1__7__Impl rule__NDChoiceStatement__Group_1__8 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3029:2: rule__NDChoiceStatement__Group_1__7__Impl rule__NDChoiceStatement__Group_1__8
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__7__Impl_in_rule__NDChoiceStatement__Group_1__76034);
            rule__NDChoiceStatement__Group_1__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__8_in_rule__NDChoiceStatement__Group_1__76037);
            rule__NDChoiceStatement__Group_1__8();
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
    // $ANTLR end rule__NDChoiceStatement__Group_1__7


    // $ANTLR start rule__NDChoiceStatement__Group_1__7__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3036:1: rule__NDChoiceStatement__Group_1__7__Impl : ( () ) ;
    public final void rule__NDChoiceStatement__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3040:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3041:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3041:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3042:1: ()
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcess2Action_1_7()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3043:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3045:1: 
            {
            }

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcess2Action_1_7()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NDChoiceStatement__Group_1__7__Impl


    // $ANTLR start rule__NDChoiceStatement__Group_1__8
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3055:1: rule__NDChoiceStatement__Group_1__8 : rule__NDChoiceStatement__Group_1__8__Impl ;
    public final void rule__NDChoiceStatement__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3059:1: ( rule__NDChoiceStatement__Group_1__8__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3060:2: rule__NDChoiceStatement__Group_1__8__Impl
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__8__Impl_in_rule__NDChoiceStatement__Group_1__86095);
            rule__NDChoiceStatement__Group_1__8__Impl();
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
    // $ANTLR end rule__NDChoiceStatement__Group_1__8


    // $ANTLR start rule__NDChoiceStatement__Group_1__8__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3066:1: rule__NDChoiceStatement__Group_1__8__Impl : ( ( rule__NDChoiceStatement__MainProcessAssignment_1_8 ) ) ;
    public final void rule__NDChoiceStatement__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3070:1: ( ( ( rule__NDChoiceStatement__MainProcessAssignment_1_8 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3071:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_1_8 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3071:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_1_8 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3072:1: ( rule__NDChoiceStatement__MainProcessAssignment_1_8 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_1_8()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3073:1: ( rule__NDChoiceStatement__MainProcessAssignment_1_8 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3073:2: rule__NDChoiceStatement__MainProcessAssignment_1_8
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_1_8_in_rule__NDChoiceStatement__Group_1__8__Impl6122);
            rule__NDChoiceStatement__MainProcessAssignment_1_8();
            _fsp--;


            }

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_1_8()); 

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
    // $ANTLR end rule__NDChoiceStatement__Group_1__8__Impl


    // $ANTLR start rule__VariablePath__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3101:1: rule__VariablePath__Group__0 : rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1 ;
    public final void rule__VariablePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3105:1: ( rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3106:2: rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__0__Impl_in_rule__VariablePath__Group__06170);
            rule__VariablePath__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group__1_in_rule__VariablePath__Group__06173);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3113:1: rule__VariablePath__Group__0__Impl : ( () ) ;
    public final void rule__VariablePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3117:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3118:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3118:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3119:1: ()
            {
             before(grammarAccess.getVariablePathAccess().getVariablePathAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3120:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3122:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3132:1: rule__VariablePath__Group__1 : rule__VariablePath__Group__1__Impl rule__VariablePath__Group__2 ;
    public final void rule__VariablePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3136:1: ( rule__VariablePath__Group__1__Impl rule__VariablePath__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3137:2: rule__VariablePath__Group__1__Impl rule__VariablePath__Group__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__1__Impl_in_rule__VariablePath__Group__16231);
            rule__VariablePath__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group__2_in_rule__VariablePath__Group__16234);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3144:1: rule__VariablePath__Group__1__Impl : ( RULE_GLOBAL ) ;
    public final void rule__VariablePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3148:1: ( ( RULE_GLOBAL ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3149:1: ( RULE_GLOBAL )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3149:1: ( RULE_GLOBAL )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3150:1: RULE_GLOBAL
            {
             before(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1()); 
            match(input,RULE_GLOBAL,FOLLOW_RULE_GLOBAL_in_rule__VariablePath__Group__1__Impl6261); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3161:1: rule__VariablePath__Group__2 : rule__VariablePath__Group__2__Impl ;
    public final void rule__VariablePath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3165:1: ( rule__VariablePath__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3166:2: rule__VariablePath__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__2__Impl_in_rule__VariablePath__Group__26290);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3172:1: rule__VariablePath__Group__2__Impl : ( ( rule__VariablePath__Group_2__0 )* ) ;
    public final void rule__VariablePath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3176:1: ( ( ( rule__VariablePath__Group_2__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3177:1: ( ( rule__VariablePath__Group_2__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3177:1: ( ( rule__VariablePath__Group_2__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3178:1: ( rule__VariablePath__Group_2__0 )*
            {
             before(grammarAccess.getVariablePathAccess().getGroup_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3179:1: ( rule__VariablePath__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3179:2: rule__VariablePath__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariablePath__Group_2__0_in_rule__VariablePath__Group__2__Impl6317);
            	    rule__VariablePath__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3195:1: rule__VariablePath__Group_2__0 : rule__VariablePath__Group_2__0__Impl rule__VariablePath__Group_2__1 ;
    public final void rule__VariablePath__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3199:1: ( rule__VariablePath__Group_2__0__Impl rule__VariablePath__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3200:2: rule__VariablePath__Group_2__0__Impl rule__VariablePath__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2__0__Impl_in_rule__VariablePath__Group_2__06354);
            rule__VariablePath__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_2__1_in_rule__VariablePath__Group_2__06357);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3207:1: rule__VariablePath__Group_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__VariablePath__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3211:1: ( ( RULE_DOT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3212:1: ( RULE_DOT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3212:1: ( RULE_DOT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3213:1: RULE_DOT
            {
             before(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_2_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__VariablePath__Group_2__0__Impl6384); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3224:1: rule__VariablePath__Group_2__1 : rule__VariablePath__Group_2__1__Impl ;
    public final void rule__VariablePath__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3228:1: ( rule__VariablePath__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3229:2: rule__VariablePath__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2__1__Impl_in_rule__VariablePath__Group_2__16413);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3235:1: rule__VariablePath__Group_2__1__Impl : ( ( rule__VariablePath__Alternatives_2_1 ) ) ;
    public final void rule__VariablePath__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3239:1: ( ( ( rule__VariablePath__Alternatives_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3240:1: ( ( rule__VariablePath__Alternatives_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3240:1: ( ( rule__VariablePath__Alternatives_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3241:1: ( rule__VariablePath__Alternatives_2_1 )
            {
             before(grammarAccess.getVariablePathAccess().getAlternatives_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3242:1: ( rule__VariablePath__Alternatives_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3242:2: rule__VariablePath__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__VariablePath__Alternatives_2_1_in_rule__VariablePath__Group_2__1__Impl6440);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3256:1: rule__VariablePath__Group_2_1_1__0 : rule__VariablePath__Group_2_1_1__0__Impl rule__VariablePath__Group_2_1_1__1 ;
    public final void rule__VariablePath__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3260:1: ( rule__VariablePath__Group_2_1_1__0__Impl rule__VariablePath__Group_2_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3261:2: rule__VariablePath__Group_2_1_1__0__Impl rule__VariablePath__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__0__Impl_in_rule__VariablePath__Group_2_1_1__06474);
            rule__VariablePath__Group_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__1_in_rule__VariablePath__Group_2_1_1__06477);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3268:1: rule__VariablePath__Group_2_1_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__VariablePath__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3272:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3273:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3273:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3274:1: RULE_LPAREN
            {
             before(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__VariablePath__Group_2_1_1__0__Impl6504); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3285:1: rule__VariablePath__Group_2_1_1__1 : rule__VariablePath__Group_2_1_1__1__Impl rule__VariablePath__Group_2_1_1__2 ;
    public final void rule__VariablePath__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3289:1: ( rule__VariablePath__Group_2_1_1__1__Impl rule__VariablePath__Group_2_1_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3290:2: rule__VariablePath__Group_2_1_1__1__Impl rule__VariablePath__Group_2_1_1__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__1__Impl_in_rule__VariablePath__Group_2_1_1__16533);
            rule__VariablePath__Group_2_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__2_in_rule__VariablePath__Group_2_1_1__16536);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3297:1: rule__VariablePath__Group_2_1_1__1__Impl : ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) ) ;
    public final void rule__VariablePath__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3301:1: ( ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3302:1: ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3302:1: ( ( rule__VariablePath__ChildrenAssignment_2_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3303:1: ( rule__VariablePath__ChildrenAssignment_2_1_1_1 )
            {
             before(grammarAccess.getVariablePathAccess().getChildrenAssignment_2_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3304:1: ( rule__VariablePath__ChildrenAssignment_2_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3304:2: rule__VariablePath__ChildrenAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__VariablePath__ChildrenAssignment_2_1_1_1_in_rule__VariablePath__Group_2_1_1__1__Impl6563);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3314:1: rule__VariablePath__Group_2_1_1__2 : rule__VariablePath__Group_2_1_1__2__Impl ;
    public final void rule__VariablePath__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3318:1: ( rule__VariablePath__Group_2_1_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3319:2: rule__VariablePath__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_2_1_1__2__Impl_in_rule__VariablePath__Group_2_1_1__26593);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3325:1: rule__VariablePath__Group_2_1_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__VariablePath__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3329:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3330:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3330:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3331:1: RULE_RPAREN
            {
             before(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_2_1_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__VariablePath__Group_2_1_1__2__Impl6620); 
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


    // $ANTLR start rule__Program__MainAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3349:1: rule__Program__MainAssignment_1 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3353:1: ( ( ruleMain ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3354:1: ( ruleMain )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3354:1: ( ruleMain )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3355:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_16660);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3364:1: rule__Main__MainrocessAssignment : ( ruleMainProcess ) ;
    public final void rule__Main__MainrocessAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3368:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3369:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3369:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3370:1: ruleMainProcess
            {
             before(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment6691);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3379:1: rule__MainProcess__ParallelStatementAssignment_2 : ( ruleParallelStatement ) ;
    public final void rule__MainProcess__ParallelStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3383:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3384:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3384:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3385:1: ruleParallelStatement
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_26722);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3394:1: rule__Process__ChildrenAssignment_0_2 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3398:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3399:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3399:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3400:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_26753);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3409:1: rule__Process__ChildrenAssignment_1_1 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3413:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3414:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3414:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3415:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_16784);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3424:1: rule__ParallelStatement__ChildrenAssignment_1_0 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3428:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3429:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3429:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3430:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_06815);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3439:1: rule__ParallelStatement__ChildrenAssignment_1_1_1 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3443:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3444:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3444:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3445:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_16846);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3454:1: rule__SequenceStatement__ChildrenAssignment_1_0 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3458:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3459:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3459:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3460:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_06877);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3469:1: rule__SequenceStatement__ChildrenAssignment_1_1_1 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3473:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3474:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3474:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3475:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_16908);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3484:1: rule__BasicStatement__ProcessAssignment_0_1 : ( ruleProcess ) ;
    public final void rule__BasicStatement__ProcessAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3488:1: ( ( ruleProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3489:1: ( ruleProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3489:1: ( ruleProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3490:1: ruleProcess
            {
             before(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_16939);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3499:1: rule__BasicStatement__AssignStatementAssignment_1_1 : ( ruleAssignStatement ) ;
    public final void rule__BasicStatement__AssignStatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3503:1: ( ( ruleAssignStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3504:1: ( ruleAssignStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3504:1: ( ruleAssignStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3505:1: ruleAssignStatement
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_16970);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3514:1: rule__BasicStatement__PostIncrementStatementAssignment_2_1 : ( rulePostIncrementStatement ) ;
    public final void rule__BasicStatement__PostIncrementStatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3518:1: ( ( rulePostIncrementStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3519:1: ( rulePostIncrementStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3519:1: ( rulePostIncrementStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3520:1: rulePostIncrementStatement
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementPostIncrementStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePostIncrementStatement_in_rule__BasicStatement__PostIncrementStatementAssignment_2_17001);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3529:1: rule__BasicStatement__PostDecrementStatementAssignment_3_1 : ( rulePostDecrementStatement ) ;
    public final void rule__BasicStatement__PostDecrementStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3533:1: ( ( rulePostDecrementStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3534:1: ( rulePostDecrementStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3534:1: ( rulePostDecrementStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3535:1: rulePostDecrementStatement
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementPostDecrementStatementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePostDecrementStatement_in_rule__BasicStatement__PostDecrementStatementAssignment_3_17032);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3544:1: rule__BasicStatement__NDChoiceStatementAssignment_4_1 : ( ruleNDChoiceStatement ) ;
    public final void rule__BasicStatement__NDChoiceStatementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3548:1: ( ( ruleNDChoiceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3549:1: ( ruleNDChoiceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3549:1: ( ruleNDChoiceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3550:1: ruleNDChoiceStatement
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_rule__BasicStatement__NDChoiceStatementAssignment_4_17063);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3559:1: rule__AssignStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssignStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3563:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3564:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3564:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3565:1: RULE_ID
            {
             before(grammarAccess.getAssignStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssignStatement__NameAssignment_17094); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3574:1: rule__AssignStatement__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__AssignStatement__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3578:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3579:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3579:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3580:1: ruleExpression
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignStatement__ExpressionAssignment_47125);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3589:1: rule__PostIncrementStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostIncrementStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3593:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3594:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3594:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3595:1: RULE_ID
            {
             before(grammarAccess.getPostIncrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostIncrementStatement__NameAssignment_17156); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3604:1: rule__PostDecrementStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostDecrementStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3608:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3609:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3609:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3610:1: RULE_ID
            {
             before(grammarAccess.getPostDecrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostDecrementStatement__NameAssignment_17187); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3619:1: rule__Expression__OpAssignment_1_1 : ( ( rule__Expression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3623:1: ( ( ( rule__Expression__OpAlternatives_1_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3624:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3624:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3625:1: ( rule__Expression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3626:1: ( rule__Expression__OpAlternatives_1_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3626:2: rule__Expression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_17218);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3635:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3639:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3640:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3640:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3641:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_27251);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3650:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3654:1: ( ( RULE_INT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3655:1: ( RULE_INT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3655:1: ( RULE_INT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3656:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_17282); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3665:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_REAL ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3669:1: ( ( RULE_REAL ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3670:1: ( RULE_REAL )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3670:1: ( RULE_REAL )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3671:1: RULE_REAL
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_17313); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3680:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3684:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3685:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3685:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3686:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_3_17344); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3695:1: rule__TerminalExpression__ValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3699:1: ( ( RULE_STRING ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3700:1: ( RULE_STRING )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3700:1: ( RULE_STRING )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3701:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_4_17375); 
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


    // $ANTLR start rule__NDChoiceStatement__MainProcessAssignment_0_7
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3710:1: rule__NDChoiceStatement__MainProcessAssignment_0_7 : ( ruleMainProcess ) ;
    public final void rule__NDChoiceStatement__MainProcessAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3714:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3715:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3715:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3716:1: ruleMainProcess
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_0_7_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_0_77406);
            ruleMainProcess();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_0_7_0()); 

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
    // $ANTLR end rule__NDChoiceStatement__MainProcessAssignment_0_7


    // $ANTLR start rule__NDChoiceStatement__VariablePathAssignment_1_4
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3725:1: rule__NDChoiceStatement__VariablePathAssignment_1_4 : ( ruleVariablePath ) ;
    public final void rule__NDChoiceStatement__VariablePathAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3729:1: ( ( ruleVariablePath ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3730:1: ( ruleVariablePath )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3730:1: ( ruleVariablePath )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3731:1: ruleVariablePath
            {
             before(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleVariablePath_in_rule__NDChoiceStatement__VariablePathAssignment_1_47437);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementAccess().getVariablePathVariablePathParserRuleCall_1_4_0()); 

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
    // $ANTLR end rule__NDChoiceStatement__VariablePathAssignment_1_4


    // $ANTLR start rule__NDChoiceStatement__MainProcessAssignment_1_8
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3740:1: rule__NDChoiceStatement__MainProcessAssignment_1_8 : ( ruleMainProcess ) ;
    public final void rule__NDChoiceStatement__MainProcessAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3744:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3745:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3745:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3746:1: ruleMainProcess
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_8_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_1_87468);
            ruleMainProcess();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_8_0()); 

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
    // $ANTLR end rule__NDChoiceStatement__MainProcessAssignment_1_8


    // $ANTLR start rule__VariablePath__ChildrenAssignment_2_1_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3755:1: rule__VariablePath__ChildrenAssignment_2_1_1_1 : ( ruleExpression ) ;
    public final void rule__VariablePath__ChildrenAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3759:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3760:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3760:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3761:1: ruleExpression
            {
             before(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_2_1_1_17499);
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
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Alternatives_in_ruleNDChoiceStatement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__0_in_ruleVariablePath874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__0_in_rule__BasicStatement__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__0_in_rule__BasicStatement__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_01066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_01083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_01100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_01117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__0_in_rule__NDChoiceStatement__Alternatives1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__0_in_rule__NDChoiceStatement__Alternatives1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_2_11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__0_in_rule__VariablePath__Alternatives_2_11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01353 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Program__Group__0__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01476 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11537 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21596 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01720 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11781 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__21840 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__21843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__31900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__01964 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__01967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__12023 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__12026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__22083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__02145 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__02148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02267 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2354 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02389 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02509 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02631 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2718 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02753 = new BitSet(new long[]{0x0000000000040B00L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__02873 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__02995 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__02998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__13056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__03117 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__03120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__PostIncrementStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__0__Impl_in_rule__BasicStatement__Group_3__03239 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__1_in_rule__BasicStatement__Group_3__03242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__1__Impl_in_rule__BasicStatement__Group_3__13300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__PostDecrementStatementAssignment_3_1_in_rule__BasicStatement__Group_3__1__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__0__Impl_in_rule__BasicStatement__Group_4__03361 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__1_in_rule__BasicStatement__Group_4__03364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_4__1__Impl_in_rule__BasicStatement__Group_4__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__NDChoiceStatementAssignment_4_1_in_rule__BasicStatement__Group_4__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03483 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13544 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__NameAssignment_1_in_rule__AssignStatement__Group__1__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23604 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33663 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__4_in_rule__AssignStatement__Group__33666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__4__Impl_in_rule__AssignStatement__Group__43724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__ExpressionAssignment_4_in_rule__AssignStatement__Group__4__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__0__Impl_in_rule__PostIncrementStatement__Group__03791 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__1_in_rule__PostIncrementStatement__Group__03794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__1__Impl_in_rule__PostIncrementStatement__Group__13852 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__2_in_rule__PostIncrementStatement__Group__13855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__NameAssignment_1_in_rule__PostIncrementStatement__Group__1__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__2__Impl_in_rule__PostIncrementStatement__Group__23912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rule__PostIncrementStatement__Group__2__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__0__Impl_in_rule__PostDecrementStatement__Group__03974 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__1_in_rule__PostDecrementStatement__Group__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__1__Impl_in_rule__PostDecrementStatement__Group__14035 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__2_in_rule__PostDecrementStatement__Group__14038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__NameAssignment_1_in_rule__PostDecrementStatement__Group__1__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__2__Impl_in_rule__PostDecrementStatement__Group__24095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rule__PostDecrementStatement__Group__2__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04157 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04278 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14339 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04462 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04642 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04764 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__04886 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__05008 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__05011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__0__Impl_in_rule__NDChoiceStatement__Group_0__05130 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__1_in_rule__NDChoiceStatement__Group_0__05133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_0__0__Impl5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__1__Impl_in_rule__NDChoiceStatement__Group_0__15189 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__2_in_rule__NDChoiceStatement__Group_0__15192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINKIN_in_rule__NDChoiceStatement__Group_0__1__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__2__Impl_in_rule__NDChoiceStatement__Group_0__25248 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__3_in_rule__NDChoiceStatement__Group_0__25251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__NDChoiceStatement__Group_0__2__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__3__Impl_in_rule__NDChoiceStatement__Group_0__35307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__4_in_rule__NDChoiceStatement__Group_0__35310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NDChoiceStatement__Group_0__3__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__4__Impl_in_rule__NDChoiceStatement__Group_0__45366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__5_in_rule__NDChoiceStatement__Group_0__45369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__NDChoiceStatement__Group_0__4__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__5__Impl_in_rule__NDChoiceStatement__Group_0__55425 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__6_in_rule__NDChoiceStatement__Group_0__55428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_0__5__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__6__Impl_in_rule__NDChoiceStatement__Group_0__65484 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__7_in_rule__NDChoiceStatement__Group_0__65487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_0__7__Impl_in_rule__NDChoiceStatement__Group_0__75545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_0_7_in_rule__NDChoiceStatement__Group_0__7__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__0__Impl_in_rule__NDChoiceStatement__Group_1__05618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__1_in_rule__NDChoiceStatement__Group_1__05621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_1__0__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__1__Impl_in_rule__NDChoiceStatement__Group_1__15677 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__2_in_rule__NDChoiceStatement__Group_1__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NDChoiceStatement__Group_1__1__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__2__Impl_in_rule__NDChoiceStatement__Group_1__25736 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__3_in_rule__NDChoiceStatement__Group_1__25739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__NDChoiceStatement__Group_1__2__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__3__Impl_in_rule__NDChoiceStatement__Group_1__35795 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__4_in_rule__NDChoiceStatement__Group_1__35798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__4__Impl_in_rule__NDChoiceStatement__Group_1__45856 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__5_in_rule__NDChoiceStatement__Group_1__45859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__VariablePathAssignment_1_4_in_rule__NDChoiceStatement__Group_1__4__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__5__Impl_in_rule__NDChoiceStatement__Group_1__55916 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__6_in_rule__NDChoiceStatement__Group_1__55919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__NDChoiceStatement__Group_1__5__Impl5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__6__Impl_in_rule__NDChoiceStatement__Group_1__65975 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__7_in_rule__NDChoiceStatement__Group_1__65978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_1__6__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__7__Impl_in_rule__NDChoiceStatement__Group_1__76034 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__8_in_rule__NDChoiceStatement__Group_1__76037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__8__Impl_in_rule__NDChoiceStatement__Group_1__86095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_1_8_in_rule__NDChoiceStatement__Group_1__8__Impl6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__0__Impl_in_rule__VariablePath__Group__06170 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__1_in_rule__VariablePath__Group__06173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__1__Impl_in_rule__VariablePath__Group__16231 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__2_in_rule__VariablePath__Group__16234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GLOBAL_in_rule__VariablePath__Group__1__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__2__Impl_in_rule__VariablePath__Group__26290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__0_in_rule__VariablePath__Group__2__Impl6317 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__0__Impl_in_rule__VariablePath__Group_2__06354 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__1_in_rule__VariablePath__Group_2__06357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__VariablePath__Group_2__0__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2__1__Impl_in_rule__VariablePath__Group_2__16413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Alternatives_2_1_in_rule__VariablePath__Group_2__1__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__0__Impl_in_rule__VariablePath__Group_2_1_1__06474 = new BitSet(new long[]{0x0000000003800900L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__1_in_rule__VariablePath__Group_2_1_1__06477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__VariablePath__Group_2_1_1__0__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__1__Impl_in_rule__VariablePath__Group_2_1_1__16533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__2_in_rule__VariablePath__Group_2_1_1__16536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__ChildrenAssignment_2_1_1_1_in_rule__VariablePath__Group_2_1_1__1__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_2_1_1__2__Impl_in_rule__VariablePath__Group_2_1_1__26593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__VariablePath__Group_2_1_1__2__Impl6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_16660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_26722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_26753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_16784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_06815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_16846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_06877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_16939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_16970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementStatement_in_rule__BasicStatement__PostIncrementStatementAssignment_2_17001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDecrementStatement_in_rule__BasicStatement__PostDecrementStatementAssignment_3_17032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_rule__BasicStatement__NDChoiceStatementAssignment_4_17063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssignStatement__NameAssignment_17094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignStatement__ExpressionAssignment_47125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostIncrementStatement__NameAssignment_17156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostDecrementStatement__NameAssignment_17187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_17218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_27251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_17282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_17313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_3_17344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_4_17375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_0_77406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rule__NDChoiceStatement__VariablePathAssignment_1_47437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_1_87468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_2_1_1_17499 = new BitSet(new long[]{0x0000000000000002L});

}