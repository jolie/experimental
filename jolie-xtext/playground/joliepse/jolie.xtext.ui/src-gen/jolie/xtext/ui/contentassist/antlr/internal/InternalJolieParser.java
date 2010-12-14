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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERISK", "RULE_DIVIDE", "RULE_GLOBAL", "RULE_ID", "RULE_CHOICE", "RULE_DECREMENT", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_DOT", "RULE_LINKIN", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ARROW", "RULE_COLON", "RULE_COMMA", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'"
    };
    public static final int RULE_RCURLY=13;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_CHOICE=10;
    public static final int RULE_COLON=27;
    public static final int RULE_ID=9;
    public static final int RULE_LINKIN=22;
    public static final int RULE_WHILE=29;
    public static final int RULE_STRING=25;
    public static final int RULE_LPAREN=14;
    public static final int RULE_LSQUARE=19;
    public static final int RULE_REAL=24;
    public static final int RULE_SEMICOLON=17;
    public static final int RULE_PERCENT_SIGN=30;
    public static final int RULE_COMMA=28;
    public static final int RULE_RPAREN=15;
    public static final int RULE_ASSIGN=18;
    public static final int RULE_ASTERISK=6;
    public static final int RULE_DOT=21;
    public static final int RULE_MINUS=5;
    public static final int RULE_ARROW=26;
    public static final int RULE_VERT=16;
    public static final int RULE_WS=33;
    public static final int RULE_INT=23;
    public static final int EOF=-1;
    public static final int RULE_RSQUARE=20;
    public static final int RULE_DIVIDE=7;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_GLOBAL=8;
    public static final int RULE_DECREMENT=11;
    public static final int RULE_PLUS=4;
    public static final int RULE_LCURLY=12;

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


    // $ANTLR start entryRuleRightSideAssignament
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:285:1: entryRuleRightSideAssignament : ruleRightSideAssignament EOF ;
    public final void entryRuleRightSideAssignament() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:286:1: ( ruleRightSideAssignament EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:287:1: ruleRightSideAssignament EOF
            {
             before(grammarAccess.getRightSideAssignamentRule()); 
            pushFollow(FOLLOW_ruleRightSideAssignament_in_entryRuleRightSideAssignament541);
            ruleRightSideAssignament();
            _fsp--;

             after(grammarAccess.getRightSideAssignamentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSideAssignament548); 

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
    // $ANTLR end entryRuleRightSideAssignament


    // $ANTLR start ruleRightSideAssignament
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:294:1: ruleRightSideAssignament : ( ( rule__RightSideAssignament__Group__0 ) ) ;
    public final void ruleRightSideAssignament() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:298:2: ( ( ( rule__RightSideAssignament__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:299:1: ( ( rule__RightSideAssignament__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:299:1: ( ( rule__RightSideAssignament__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:300:1: ( rule__RightSideAssignament__Group__0 )
            {
             before(grammarAccess.getRightSideAssignamentAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:301:1: ( rule__RightSideAssignament__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:301:2: rule__RightSideAssignament__Group__0
            {
            pushFollow(FOLLOW_rule__RightSideAssignament__Group__0_in_ruleRightSideAssignament574);
            rule__RightSideAssignament__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRightSideAssignamentAccess().getGroup()); 

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
    // $ANTLR end ruleRightSideAssignament


    // $ANTLR start entryRuleExpression
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:313:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:314:1: ( ruleExpression EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:315:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression601);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression608); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:322:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:326:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:327:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:327:1: ( ( rule__Expression__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:328:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:329:1: ( rule__Expression__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:329:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression634);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:341:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:342:1: ( ruleTerminalExpression EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:343:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression661);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression668); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:350:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:354:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:355:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:355:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:356:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:357:1: ( rule__TerminalExpression__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:357:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression694);
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


    // $ANTLR start entryRuleVariablePath
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:369:1: entryRuleVariablePath : ruleVariablePath EOF ;
    public final void entryRuleVariablePath() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:370:1: ( ruleVariablePath EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:371:1: ruleVariablePath EOF
            {
             before(grammarAccess.getVariablePathRule()); 
            pushFollow(FOLLOW_ruleVariablePath_in_entryRuleVariablePath721);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getVariablePathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablePath728); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:378:1: ruleVariablePath : ( ( rule__VariablePath__Group__0 ) ) ;
    public final void ruleVariablePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:382:2: ( ( ( rule__VariablePath__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:383:1: ( ( rule__VariablePath__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:383:1: ( ( rule__VariablePath__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:384:1: ( rule__VariablePath__Group__0 )
            {
             before(grammarAccess.getVariablePathAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:385:1: ( rule__VariablePath__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:385:2: rule__VariablePath__Group__0
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__0_in_ruleVariablePath754);
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


    // $ANTLR start entryRulePrefix
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:397:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:398:1: ( rulePrefix EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:399:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix781);
            rulePrefix();
            _fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix788); 

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
    // $ANTLR end entryRulePrefix


    // $ANTLR start rulePrefix
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:406:1: rulePrefix : ( ( rule__Prefix__Alternatives )? ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:410:2: ( ( ( rule__Prefix__Alternatives )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:411:1: ( ( rule__Prefix__Alternatives )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:411:1: ( ( rule__Prefix__Alternatives )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:412:1: ( rule__Prefix__Alternatives )?
            {
             before(grammarAccess.getPrefixAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:413:1: ( rule__Prefix__Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_CHOICE && LA1_0<=RULE_DECREMENT)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:413:2: rule__Prefix__Alternatives
                    {
                    pushFollow(FOLLOW_rule__Prefix__Alternatives_in_rulePrefix814);
                    rule__Prefix__Alternatives();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrefixAccess().getAlternatives()); 

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
    // $ANTLR end rulePrefix


    // $ANTLR start entryRuleNDChoiceStatement
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:425:1: entryRuleNDChoiceStatement : ruleNDChoiceStatement EOF ;
    public final void entryRuleNDChoiceStatement() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:426:1: ( ruleNDChoiceStatement EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:427:1: ruleNDChoiceStatement EOF
            {
             before(grammarAccess.getNDChoiceStatementRule()); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement842);
            ruleNDChoiceStatement();
            _fsp--;

             after(grammarAccess.getNDChoiceStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNDChoiceStatement849); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:434:1: ruleNDChoiceStatement : ( ( rule__NDChoiceStatement__Group__0 ) ) ;
    public final void ruleNDChoiceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:438:2: ( ( ( rule__NDChoiceStatement__Group__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:439:1: ( ( rule__NDChoiceStatement__Group__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:439:1: ( ( rule__NDChoiceStatement__Group__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:440:1: ( rule__NDChoiceStatement__Group__0 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getGroup()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:441:1: ( rule__NDChoiceStatement__Group__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:441:2: rule__NDChoiceStatement__Group__0
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__0_in_ruleNDChoiceStatement875);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:453:1: entryRuleInputOperation : ruleInputOperation EOF ;
    public final void entryRuleInputOperation() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:454:1: ( ruleInputOperation EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:455:1: ruleInputOperation EOF
            {
             before(grammarAccess.getInputOperationRule()); 
            pushFollow(FOLLOW_ruleInputOperation_in_entryRuleInputOperation902);
            ruleInputOperation();
            _fsp--;

             after(grammarAccess.getInputOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperation909); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:462:1: ruleInputOperation : ( ( rule__InputOperation__Alternatives ) ) ;
    public final void ruleInputOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:466:2: ( ( ( rule__InputOperation__Alternatives ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:467:1: ( ( rule__InputOperation__Alternatives ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:467:1: ( ( rule__InputOperation__Alternatives ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:468:1: ( rule__InputOperation__Alternatives )
            {
             before(grammarAccess.getInputOperationAccess().getAlternatives()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:469:1: ( rule__InputOperation__Alternatives )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:469:2: rule__InputOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__InputOperation__Alternatives_in_ruleInputOperation935);
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


    // $ANTLR start entryRuleRequestResponseOperation
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:481:1: entryRuleRequestResponseOperation : ruleRequestResponseOperation EOF ;
    public final void entryRuleRequestResponseOperation() throws RecognitionException {
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:482:1: ( ruleRequestResponseOperation EOF )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:483:1: ruleRequestResponseOperation EOF
            {
             before(grammarAccess.getRequestResponseOperationRule()); 
            pushFollow(FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation962);
            ruleRequestResponseOperation();
            _fsp--;

             after(grammarAccess.getRequestResponseOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestResponseOperation969); 

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
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__0_in_ruleRequestResponseOperation995);
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
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LCURLY) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_LPAREN) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("509:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
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
                    pushFollow(FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives1031);
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
                    pushFollow(FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives1049);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:531:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) );
    public final void rule__BasicStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:535:1: ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_LCURLY:
            case RULE_LPAREN:
                {
                alt3=1;
                }
                break;
            case RULE_GLOBAL:
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case EOF:
            case RULE_RCURLY:
            case RULE_RPAREN:
            case RULE_VERT:
            case RULE_SEMICOLON:
            case RULE_LSQUARE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("531:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
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
                    pushFollow(FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives1082);
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
                    pushFollow(FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives1100);
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
                    pushFollow(FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives1118);
                    rule__BasicStatement__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_2()); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:559:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );
    public final void rule__Expression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:563:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt4=1;
                }
                break;
            case RULE_MINUS:
                {
                alt4=2;
                }
                break;
            case RULE_ASTERISK:
                {
                alt4=3;
                }
                break;
            case RULE_DIVIDE:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("559:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:564:1: ( RULE_PLUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:564:1: ( RULE_PLUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:565:1: RULE_PLUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_01151); 
                     after(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:570:6: ( RULE_MINUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:570:6: ( RULE_MINUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:571:1: RULE_MINUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_01168); 
                     after(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:576:6: ( RULE_ASTERISK )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:576:6: ( RULE_ASTERISK )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:577:1: RULE_ASTERISK
                    {
                     before(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 
                    match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_01185); 
                     after(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:582:6: ( RULE_DIVIDE )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:582:6: ( RULE_DIVIDE )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:583:1: RULE_DIVIDE
                    {
                     before(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3()); 
                    match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_01202); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:593:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:597:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_LPAREN:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_REAL:
                {
                alt5=3;
                }
                break;
            case RULE_STRING:
                {
                alt5=4;
                }
                break;
            case RULE_GLOBAL:
            case RULE_ID:
            case RULE_CHOICE:
            case RULE_DECREMENT:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("593:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:598:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:598:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:599:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:600:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:600:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1234);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:604:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:604:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:605:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:606:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:606:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1252);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:610:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:610:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:611:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:612:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:612:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1270);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:616:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:616:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:617:1: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:618:1: ( rule__TerminalExpression__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:618:2: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1288);
                    rule__TerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:6: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:623:1: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:624:1: ( rule__TerminalExpression__Group_4__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:624:2: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1306);
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


    // $ANTLR start rule__VariablePath__Alternatives_1_0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:633:1: rule__VariablePath__Alternatives_1_0 : ( ( RULE_GLOBAL ) | ( RULE_ID ) );
    public final void rule__VariablePath__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:637:1: ( ( RULE_GLOBAL ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_GLOBAL) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("633:1: rule__VariablePath__Alternatives_1_0 : ( ( RULE_GLOBAL ) | ( RULE_ID ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:638:1: ( RULE_GLOBAL )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:638:1: ( RULE_GLOBAL )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:639:1: RULE_GLOBAL
                    {
                     before(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1_0_0()); 
                    match(input,RULE_GLOBAL,FOLLOW_RULE_GLOBAL_in_rule__VariablePath__Alternatives_1_01339); 
                     after(grammarAccess.getVariablePathAccess().getGLOBALTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:644:6: ( RULE_ID )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:644:6: ( RULE_ID )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:645:1: RULE_ID
                    {
                     before(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_1_01356); 
                     after(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end rule__VariablePath__Alternatives_1_0


    // $ANTLR start rule__VariablePath__Alternatives_1_2_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:655:1: rule__VariablePath__Alternatives_1_2_1 : ( ( RULE_ID ) | ( ( rule__VariablePath__Group_1_2_1_1__0 ) ) );
    public final void rule__VariablePath__Alternatives_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:659:1: ( ( RULE_ID ) | ( ( rule__VariablePath__Group_1_2_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_LPAREN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("655:1: rule__VariablePath__Alternatives_1_2_1 : ( ( RULE_ID ) | ( ( rule__VariablePath__Group_1_2_1_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:660:1: ( RULE_ID )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:660:1: ( RULE_ID )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:661:1: RULE_ID
                    {
                     before(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_2_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_1_2_11388); 
                     after(grammarAccess.getVariablePathAccess().getIDTerminalRuleCall_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:666:6: ( ( rule__VariablePath__Group_1_2_1_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:666:6: ( ( rule__VariablePath__Group_1_2_1_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:667:1: ( rule__VariablePath__Group_1_2_1_1__0 )
                    {
                     before(grammarAccess.getVariablePathAccess().getGroup_1_2_1_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:668:1: ( rule__VariablePath__Group_1_2_1_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:668:2: rule__VariablePath__Group_1_2_1_1__0
                    {
                    pushFollow(FOLLOW_rule__VariablePath__Group_1_2_1_1__0_in_rule__VariablePath__Alternatives_1_2_11405);
                    rule__VariablePath__Group_1_2_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariablePathAccess().getGroup_1_2_1_1()); 

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
    // $ANTLR end rule__VariablePath__Alternatives_1_2_1


    // $ANTLR start rule__Prefix__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:677:1: rule__Prefix__Alternatives : ( ( RULE_CHOICE ) | ( RULE_DECREMENT ) );
    public final void rule__Prefix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:681:1: ( ( RULE_CHOICE ) | ( RULE_DECREMENT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CHOICE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DECREMENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("677:1: rule__Prefix__Alternatives : ( ( RULE_CHOICE ) | ( RULE_DECREMENT ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:682:1: ( RULE_CHOICE )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:682:1: ( RULE_CHOICE )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:683:1: RULE_CHOICE
                    {
                     before(grammarAccess.getPrefixAccess().getCHOICETerminalRuleCall_0()); 
                    match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rule__Prefix__Alternatives1438); 
                     after(grammarAccess.getPrefixAccess().getCHOICETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:688:6: ( RULE_DECREMENT )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:688:6: ( RULE_DECREMENT )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:689:1: RULE_DECREMENT
                    {
                     before(grammarAccess.getPrefixAccess().getDECREMENTTerminalRuleCall_1()); 
                    match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rule__Prefix__Alternatives1455); 
                     after(grammarAccess.getPrefixAccess().getDECREMENTTerminalRuleCall_1()); 

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
    // $ANTLR end rule__Prefix__Alternatives


    // $ANTLR start rule__InputOperation__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:699:1: rule__InputOperation__Alternatives : ( ( ( rule__InputOperation__Group_0__0 ) ) | ( ( rule__InputOperation__Group_1__0 ) ) );
    public final void rule__InputOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:703:1: ( ( ( rule__InputOperation__Group_0__0 ) ) | ( ( rule__InputOperation__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LINKIN) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("699:1: rule__InputOperation__Alternatives : ( ( ( rule__InputOperation__Group_0__0 ) ) | ( ( rule__InputOperation__Group_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:704:1: ( ( rule__InputOperation__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:704:1: ( ( rule__InputOperation__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:705:1: ( rule__InputOperation__Group_0__0 )
                    {
                     before(grammarAccess.getInputOperationAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:706:1: ( rule__InputOperation__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:706:2: rule__InputOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InputOperation__Group_0__0_in_rule__InputOperation__Alternatives1487);
                    rule__InputOperation__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInputOperationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:710:6: ( ( rule__InputOperation__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:710:6: ( ( rule__InputOperation__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:711:1: ( rule__InputOperation__Group_1__0 )
                    {
                     before(grammarAccess.getInputOperationAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:712:1: ( rule__InputOperation__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:712:2: rule__InputOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InputOperation__Group_1__0_in_rule__InputOperation__Alternatives1505);
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


    // $ANTLR start rule__Program__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:723:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:727:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:728:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01536);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01539);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:735:1: rule__Program__Group__0__Impl : ( 'main' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:739:1: ( ( 'main' ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:740:1: ( 'main' )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:740:1: ( 'main' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:741:1: 'main'
            {
             before(grammarAccess.getProgramAccess().getMainKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Program__Group__0__Impl1567); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:754:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:758:1: ( rule__Program__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:759:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11598);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:765:1: rule__Program__Group__1__Impl : ( ( rule__Program__MainAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:769:1: ( ( ( rule__Program__MainAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:770:1: ( ( rule__Program__MainAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:770:1: ( ( rule__Program__MainAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:771:1: ( rule__Program__MainAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:772:1: ( rule__Program__MainAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:772:2: rule__Program__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1625);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:786:1: rule__MainProcess__Group__0 : rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 ;
    public final void rule__MainProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:790:1: ( rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:791:2: rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01659);
            rule__MainProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01662);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:798:1: rule__MainProcess__Group__0__Impl : ( () ) ;
    public final void rule__MainProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:802:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:803:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:803:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:804:1: ()
            {
             before(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:805:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:807:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:817:1: rule__MainProcess__Group__1 : rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 ;
    public final void rule__MainProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:821:1: ( rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:822:2: rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11720);
            rule__MainProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11723);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:829:1: rule__MainProcess__Group__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__MainProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:833:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:834:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:834:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:835:1: RULE_LCURLY
            {
             before(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1750); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:846:1: rule__MainProcess__Group__2 : rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 ;
    public final void rule__MainProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:850:1: ( rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:851:2: rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21779);
            rule__MainProcess__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21782);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:858:1: rule__MainProcess__Group__2__Impl : ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) ;
    public final void rule__MainProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:862:1: ( ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:863:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:863:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:864:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementAssignment_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:865:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:865:2: rule__MainProcess__ParallelStatementAssignment_2
            {
            pushFollow(FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1809);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:875:1: rule__MainProcess__Group__3 : rule__MainProcess__Group__3__Impl ;
    public final void rule__MainProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:879:1: ( rule__MainProcess__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:880:2: rule__MainProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31839);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:886:1: rule__MainProcess__Group__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__MainProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:890:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:891:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:891:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:892:1: RULE_RCURLY
            {
             before(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1866); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:911:1: rule__Process__Group_0__0 : rule__Process__Group_0__0__Impl rule__Process__Group_0__1 ;
    public final void rule__Process__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:915:1: ( rule__Process__Group_0__0__Impl rule__Process__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:916:2: rule__Process__Group_0__0__Impl rule__Process__Group_0__1
            {
            pushFollow(FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01903);
            rule__Process__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01906);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:923:1: rule__Process__Group_0__0__Impl : ( () ) ;
    public final void rule__Process__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:927:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:928:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:928:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:929:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:930:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:932:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:942:1: rule__Process__Group_0__1 : rule__Process__Group_0__1__Impl rule__Process__Group_0__2 ;
    public final void rule__Process__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:946:1: ( rule__Process__Group_0__1__Impl rule__Process__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:947:2: rule__Process__Group_0__1__Impl rule__Process__Group_0__2
            {
            pushFollow(FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11964);
            rule__Process__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11967);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:954:1: rule__Process__Group_0__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__Process__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:958:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:959:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:959:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:960:1: RULE_LCURLY
            {
             before(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1994); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:971:1: rule__Process__Group_0__2 : rule__Process__Group_0__2__Impl rule__Process__Group_0__3 ;
    public final void rule__Process__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:975:1: ( rule__Process__Group_0__2__Impl rule__Process__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:976:2: rule__Process__Group_0__2__Impl rule__Process__Group_0__3
            {
            pushFollow(FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__22023);
            rule__Process__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__22026);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:983:1: rule__Process__Group_0__2__Impl : ( ( rule__Process__ChildrenAssignment_0_2 ) ) ;
    public final void rule__Process__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:987:1: ( ( ( rule__Process__ChildrenAssignment_0_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:988:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:988:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:989:1: ( rule__Process__ChildrenAssignment_0_2 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_0_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:990:1: ( rule__Process__ChildrenAssignment_0_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:990:2: rule__Process__ChildrenAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl2053);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1000:1: rule__Process__Group_0__3 : rule__Process__Group_0__3__Impl ;
    public final void rule__Process__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1004:1: ( rule__Process__Group_0__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1005:2: rule__Process__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__32083);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1011:1: rule__Process__Group_0__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__Process__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1015:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1016:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1016:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1017:1: RULE_RCURLY
            {
             before(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl2110); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1036:1: rule__Process__Group_1__0 : rule__Process__Group_1__0__Impl rule__Process__Group_1__1 ;
    public final void rule__Process__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1040:1: ( rule__Process__Group_1__0__Impl rule__Process__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1041:2: rule__Process__Group_1__0__Impl rule__Process__Group_1__1
            {
            pushFollow(FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__02147);
            rule__Process__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__02150);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1048:1: rule__Process__Group_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Process__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1052:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1053:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1053:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1054:1: RULE_LPAREN
            {
             before(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl2177); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1065:1: rule__Process__Group_1__1 : rule__Process__Group_1__1__Impl rule__Process__Group_1__2 ;
    public final void rule__Process__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1069:1: ( rule__Process__Group_1__1__Impl rule__Process__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1070:2: rule__Process__Group_1__1__Impl rule__Process__Group_1__2
            {
            pushFollow(FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__12206);
            rule__Process__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__12209);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1077:1: rule__Process__Group_1__1__Impl : ( ( rule__Process__ChildrenAssignment_1_1 ) ) ;
    public final void rule__Process__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1081:1: ( ( ( rule__Process__ChildrenAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1082:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1082:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1083:1: ( rule__Process__ChildrenAssignment_1_1 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1084:1: ( rule__Process__ChildrenAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1084:2: rule__Process__ChildrenAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl2236);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1094:1: rule__Process__Group_1__2 : rule__Process__Group_1__2__Impl ;
    public final void rule__Process__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1098:1: ( rule__Process__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1099:2: rule__Process__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__22266);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1105:1: rule__Process__Group_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Process__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1109:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1110:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1110:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1111:1: RULE_RPAREN
            {
             before(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl2293); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1128:1: rule__ParallelStatement__Group__0 : rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 ;
    public final void rule__ParallelStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1132:1: ( rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1133:2: rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__02328);
            rule__ParallelStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__02331);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1140:1: rule__ParallelStatement__Group__0__Impl : ( () ) ;
    public final void rule__ParallelStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1144:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1145:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1145:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1146:1: ()
            {
             before(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1147:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1149:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1159:1: rule__ParallelStatement__Group__1 : rule__ParallelStatement__Group__1__Impl ;
    public final void rule__ParallelStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1163:1: ( rule__ParallelStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1164:2: rule__ParallelStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__12389);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1170:1: rule__ParallelStatement__Group__1__Impl : ( ( rule__ParallelStatement__Group_1__0 ) ) ;
    public final void rule__ParallelStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1174:1: ( ( ( rule__ParallelStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1175:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1175:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1176:1: ( rule__ParallelStatement__Group_1__0 )
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1177:1: ( rule__ParallelStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1177:2: rule__ParallelStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl2416);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1191:1: rule__ParallelStatement__Group_1__0 : rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 ;
    public final void rule__ParallelStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1195:1: ( rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1196:2: rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02450);
            rule__ParallelStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02453);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1203:1: rule__ParallelStatement__Group_1__0__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__ParallelStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1207:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1208:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1208:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1209:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1210:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1210:2: rule__ParallelStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2480);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1220:1: rule__ParallelStatement__Group_1__1 : rule__ParallelStatement__Group_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1224:1: ( rule__ParallelStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1225:2: rule__ParallelStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12510);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1231:1: rule__ParallelStatement__Group_1__1__Impl : ( ( rule__ParallelStatement__Group_1_1__0 )* ) ;
    public final void rule__ParallelStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1235:1: ( ( ( rule__ParallelStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1236:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1236:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1237:1: ( rule__ParallelStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1238:1: ( rule__ParallelStatement__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_VERT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1238:2: rule__ParallelStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2537);
            	    rule__ParallelStatement__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1252:1: rule__ParallelStatement__Group_1_1__0 : rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 ;
    public final void rule__ParallelStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1256:1: ( rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1257:2: rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02572);
            rule__ParallelStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02575);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1264:1: rule__ParallelStatement__Group_1_1__0__Impl : ( RULE_VERT ) ;
    public final void rule__ParallelStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1268:1: ( ( RULE_VERT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1269:1: ( RULE_VERT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1269:1: ( RULE_VERT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1270:1: RULE_VERT
            {
             before(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0()); 
            match(input,RULE_VERT,FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2602); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1281:1: rule__ParallelStatement__Group_1_1__1 : rule__ParallelStatement__Group_1_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1285:1: ( rule__ParallelStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1286:2: rule__ParallelStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12631);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1292:1: rule__ParallelStatement__Group_1_1__1__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__ParallelStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1296:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1297:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1297:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1298:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1299:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1299:2: rule__ParallelStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2658);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1313:1: rule__SequenceStatement__Group__0 : rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 ;
    public final void rule__SequenceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1317:1: ( rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1318:2: rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02692);
            rule__SequenceStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02695);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1325:1: rule__SequenceStatement__Group__0__Impl : ( () ) ;
    public final void rule__SequenceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1329:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1330:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1330:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1331:1: ()
            {
             before(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1332:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1334:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1344:1: rule__SequenceStatement__Group__1 : rule__SequenceStatement__Group__1__Impl ;
    public final void rule__SequenceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1348:1: ( rule__SequenceStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1349:2: rule__SequenceStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12753);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1355:1: rule__SequenceStatement__Group__1__Impl : ( ( rule__SequenceStatement__Group_1__0 ) ) ;
    public final void rule__SequenceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1359:1: ( ( ( rule__SequenceStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1360:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1360:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1361:1: ( rule__SequenceStatement__Group_1__0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1362:1: ( rule__SequenceStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1362:2: rule__SequenceStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2780);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1376:1: rule__SequenceStatement__Group_1__0 : rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 ;
    public final void rule__SequenceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1380:1: ( rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1381:2: rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02814);
            rule__SequenceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02817);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1388:1: rule__SequenceStatement__Group_1__0__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__SequenceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1392:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1393:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1393:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1394:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1395:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1395:2: rule__SequenceStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2844);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1405:1: rule__SequenceStatement__Group_1__1 : rule__SequenceStatement__Group_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1409:1: ( rule__SequenceStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1410:2: rule__SequenceStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12874);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1416:1: rule__SequenceStatement__Group_1__1__Impl : ( ( rule__SequenceStatement__Group_1_1__0 )* ) ;
    public final void rule__SequenceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1420:1: ( ( ( rule__SequenceStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1421:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1421:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1422:1: ( rule__SequenceStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1423:1: ( rule__SequenceStatement__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SEMICOLON) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1423:2: rule__SequenceStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2901);
            	    rule__SequenceStatement__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1437:1: rule__SequenceStatement__Group_1_1__0 : rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 ;
    public final void rule__SequenceStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1441:1: ( rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1442:2: rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02936);
            rule__SequenceStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02939);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1449:1: rule__SequenceStatement__Group_1_1__0__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SequenceStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1453:1: ( ( RULE_SEMICOLON ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1454:1: ( RULE_SEMICOLON )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1454:1: ( RULE_SEMICOLON )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1455:1: RULE_SEMICOLON
            {
             before(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0()); 
            match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2966); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1466:1: rule__SequenceStatement__Group_1_1__1 : rule__SequenceStatement__Group_1_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1470:1: ( rule__SequenceStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1471:2: rule__SequenceStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12995);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1477:1: rule__SequenceStatement__Group_1_1__1__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__SequenceStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1481:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1482:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1482:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1483:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1484:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1484:2: rule__SequenceStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl3022);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1498:1: rule__BasicStatement__Group_0__0 : rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 ;
    public final void rule__BasicStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1502:1: ( rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1503:2: rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__03056);
            rule__BasicStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__03059);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1510:1: rule__BasicStatement__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1514:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1515:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1515:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1516:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1517:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1519:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1529:1: rule__BasicStatement__Group_0__1 : rule__BasicStatement__Group_0__1__Impl ;
    public final void rule__BasicStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1533:1: ( rule__BasicStatement__Group_0__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1534:2: rule__BasicStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__13117);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1540:1: rule__BasicStatement__Group_0__1__Impl : ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) ;
    public final void rule__BasicStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1544:1: ( ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1545:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1545:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1546:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAssignment_0_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1547:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1547:2: rule__BasicStatement__ProcessAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl3144);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1561:1: rule__BasicStatement__Group_1__0 : rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 ;
    public final void rule__BasicStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1565:1: ( rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1566:2: rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__03178);
            rule__BasicStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__03181);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1573:1: rule__BasicStatement__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1577:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1578:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1578:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1579:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1580:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1582:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1592:1: rule__BasicStatement__Group_1__1 : rule__BasicStatement__Group_1__1__Impl ;
    public final void rule__BasicStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1596:1: ( rule__BasicStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1597:2: rule__BasicStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__13239);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1603:1: rule__BasicStatement__Group_1__1__Impl : ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) ;
    public final void rule__BasicStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1607:1: ( ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1608:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1608:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1609:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1610:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1610:2: rule__BasicStatement__AssignStatementAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl3266);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1624:1: rule__BasicStatement__Group_2__0 : rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 ;
    public final void rule__BasicStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1628:1: ( rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1629:2: rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__03300);
            rule__BasicStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__03303);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1636:1: rule__BasicStatement__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1640:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1641:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1641:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1642:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1643:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1645:1: 
            {
            }

             after(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAction_2_0()); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1655:1: rule__BasicStatement__Group_2__1 : rule__BasicStatement__Group_2__1__Impl ;
    public final void rule__BasicStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1659:1: ( rule__BasicStatement__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1660:2: rule__BasicStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__13361);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1666:1: rule__BasicStatement__Group_2__1__Impl : ( ( rule__BasicStatement__NDChoiceStatementAssignment_2_1 ) ) ;
    public final void rule__BasicStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1670:1: ( ( ( rule__BasicStatement__NDChoiceStatementAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1671:1: ( ( rule__BasicStatement__NDChoiceStatementAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1671:1: ( ( rule__BasicStatement__NDChoiceStatementAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1672:1: ( rule__BasicStatement__NDChoiceStatementAssignment_2_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1673:1: ( rule__BasicStatement__NDChoiceStatementAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1673:2: rule__BasicStatement__NDChoiceStatementAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__NDChoiceStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl3388);
            rule__BasicStatement__NDChoiceStatementAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getBasicStatementAccess().getNDChoiceStatementAssignment_2_1()); 

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


    // $ANTLR start rule__AssignStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1687:1: rule__AssignStatement__Group__0 : rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 ;
    public final void rule__AssignStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1691:1: ( rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1692:2: rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03422);
            rule__AssignStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03425);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1699:1: rule__AssignStatement__Group__0__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1703:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1704:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1704:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1705:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1706:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1708:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1718:1: rule__AssignStatement__Group__1 : rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 ;
    public final void rule__AssignStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1722:1: ( rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1723:2: rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13483);
            rule__AssignStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13486);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1730:1: rule__AssignStatement__Group__1__Impl : ( ( rule__AssignStatement__VariablePathAssignment_1 ) ) ;
    public final void rule__AssignStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1734:1: ( ( ( rule__AssignStatement__VariablePathAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1735:1: ( ( rule__AssignStatement__VariablePathAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1735:1: ( ( rule__AssignStatement__VariablePathAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1736:1: ( rule__AssignStatement__VariablePathAssignment_1 )
            {
             before(grammarAccess.getAssignStatementAccess().getVariablePathAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1737:1: ( rule__AssignStatement__VariablePathAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1737:2: rule__AssignStatement__VariablePathAssignment_1
            {
            pushFollow(FOLLOW_rule__AssignStatement__VariablePathAssignment_1_in_rule__AssignStatement__Group__1__Impl3513);
            rule__AssignStatement__VariablePathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssignStatementAccess().getVariablePathAssignment_1()); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1747:1: rule__AssignStatement__Group__2 : rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 ;
    public final void rule__AssignStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1751:1: ( rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1752:2: rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23543);
            rule__AssignStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23546);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1759:1: rule__AssignStatement__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__AssignStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1763:1: ( ( RULE_ASSIGN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1764:1: ( RULE_ASSIGN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1764:1: ( RULE_ASSIGN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1765:1: RULE_ASSIGN
            {
             before(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3573); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1776:1: rule__AssignStatement__Group__3 : rule__AssignStatement__Group__3__Impl ;
    public final void rule__AssignStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1780:1: ( rule__AssignStatement__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1781:2: rule__AssignStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33602);
            rule__AssignStatement__Group__3__Impl();
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1787:1: rule__AssignStatement__Group__3__Impl : ( ( rule__AssignStatement__RightSideAssignAssignment_3 ) ) ;
    public final void rule__AssignStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1791:1: ( ( ( rule__AssignStatement__RightSideAssignAssignment_3 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1792:1: ( ( rule__AssignStatement__RightSideAssignAssignment_3 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1792:1: ( ( rule__AssignStatement__RightSideAssignAssignment_3 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1793:1: ( rule__AssignStatement__RightSideAssignAssignment_3 )
            {
             before(grammarAccess.getAssignStatementAccess().getRightSideAssignAssignment_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1794:1: ( rule__AssignStatement__RightSideAssignAssignment_3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1794:2: rule__AssignStatement__RightSideAssignAssignment_3
            {
            pushFollow(FOLLOW_rule__AssignStatement__RightSideAssignAssignment_3_in_rule__AssignStatement__Group__3__Impl3629);
            rule__AssignStatement__RightSideAssignAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAssignStatementAccess().getRightSideAssignAssignment_3()); 

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
    // $ANTLR end rule__AssignStatement__Group__3__Impl


    // $ANTLR start rule__RightSideAssignament__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1812:1: rule__RightSideAssignament__Group__0 : rule__RightSideAssignament__Group__0__Impl rule__RightSideAssignament__Group__1 ;
    public final void rule__RightSideAssignament__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1816:1: ( rule__RightSideAssignament__Group__0__Impl rule__RightSideAssignament__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1817:2: rule__RightSideAssignament__Group__0__Impl rule__RightSideAssignament__Group__1
            {
            pushFollow(FOLLOW_rule__RightSideAssignament__Group__0__Impl_in_rule__RightSideAssignament__Group__03667);
            rule__RightSideAssignament__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RightSideAssignament__Group__1_in_rule__RightSideAssignament__Group__03670);
            rule__RightSideAssignament__Group__1();
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
    // $ANTLR end rule__RightSideAssignament__Group__0


    // $ANTLR start rule__RightSideAssignament__Group__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1824:1: rule__RightSideAssignament__Group__0__Impl : ( () ) ;
    public final void rule__RightSideAssignament__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1828:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1829:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1829:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1830:1: ()
            {
             before(grammarAccess.getRightSideAssignamentAccess().getExpressionAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1831:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1833:1: 
            {
            }

             after(grammarAccess.getRightSideAssignamentAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RightSideAssignament__Group__0__Impl


    // $ANTLR start rule__RightSideAssignament__Group__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1843:1: rule__RightSideAssignament__Group__1 : rule__RightSideAssignament__Group__1__Impl ;
    public final void rule__RightSideAssignament__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1847:1: ( rule__RightSideAssignament__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1848:2: rule__RightSideAssignament__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RightSideAssignament__Group__1__Impl_in_rule__RightSideAssignament__Group__13728);
            rule__RightSideAssignament__Group__1__Impl();
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
    // $ANTLR end rule__RightSideAssignament__Group__1


    // $ANTLR start rule__RightSideAssignament__Group__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1854:1: rule__RightSideAssignament__Group__1__Impl : ( ( rule__RightSideAssignament__ExpressionAssignment_1 ) ) ;
    public final void rule__RightSideAssignament__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1858:1: ( ( ( rule__RightSideAssignament__ExpressionAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1859:1: ( ( rule__RightSideAssignament__ExpressionAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1859:1: ( ( rule__RightSideAssignament__ExpressionAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1860:1: ( rule__RightSideAssignament__ExpressionAssignment_1 )
            {
             before(grammarAccess.getRightSideAssignamentAccess().getExpressionAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1861:1: ( rule__RightSideAssignament__ExpressionAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1861:2: rule__RightSideAssignament__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__RightSideAssignament__ExpressionAssignment_1_in_rule__RightSideAssignament__Group__1__Impl3755);
            rule__RightSideAssignament__ExpressionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRightSideAssignamentAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end rule__RightSideAssignament__Group__1__Impl


    // $ANTLR start rule__Expression__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1875:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1879:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1880:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03789);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03792);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1887:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1891:1: ( ( ruleTerminalExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1892:1: ( ruleTerminalExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1892:1: ( ruleTerminalExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1893:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl3819);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1904:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1908:1: ( rule__Expression__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1909:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13848);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1915:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1919:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1920:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1920:1: ( ( rule__Expression__Group_1__0 )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1921:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1922:1: ( rule__Expression__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLUS && LA12_0<=RULE_DIVIDE)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1922:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3875);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1936:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1940:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1941:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03910);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03913);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1948:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1952:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1953:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1953:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1954:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1955:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1957:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1967:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1971:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1972:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13971);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__13974);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1979:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1983:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1984:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1984:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1985:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1986:1: ( rule__Expression__OpAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1986:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4001);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1996:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2000:1: ( rule__Expression__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2001:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24031);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2007:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2011:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2012:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2012:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2013:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2014:1: ( rule__Expression__RightAssignment_1_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2014:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4058);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2030:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2034:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2035:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04094);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04097);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2042:1: rule__TerminalExpression__Group_0__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2046:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2047:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2047:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2048:1: RULE_LPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4124); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2059:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2063:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2064:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14153);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14156);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2071:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2075:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2076:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2076:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2077:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4183);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2088:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2092:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2093:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24212);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2099:1: rule__TerminalExpression__Group_0__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2103:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2104:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2104:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2105:1: RULE_RPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4239); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2122:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2126:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2127:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04274);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04277);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2134:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2138:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2139:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2139:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2140:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2141:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2143:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2153:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2157:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2158:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14335);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2164:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2168:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2169:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2169:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2170:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2171:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2171:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4362);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2185:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2189:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2190:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04396);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04399);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2197:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2201:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2202:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2202:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2203:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2204:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2206:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2216:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2220:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2221:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14457);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2227:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2231:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2232:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2232:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2233:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2234:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2234:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4484);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2248:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2252:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2253:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__04518);
            rule__TerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__04521);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2260:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2264:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2265:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2265:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2266:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2267:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2269:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2279:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2283:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2284:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__14579);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2290:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2294:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2295:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2295:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2296:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2297:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2297:2: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl4606);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2311:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2315:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2316:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__04640);
            rule__TerminalExpression__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__04643);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2323:1: rule__TerminalExpression__Group_4__0__Impl : ( ( rule__TerminalExpression__PrefixAssignment_4_0 ) ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2327:1: ( ( ( rule__TerminalExpression__PrefixAssignment_4_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2328:1: ( ( rule__TerminalExpression__PrefixAssignment_4_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2328:1: ( ( rule__TerminalExpression__PrefixAssignment_4_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2329:1: ( rule__TerminalExpression__PrefixAssignment_4_0 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getPrefixAssignment_4_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2330:1: ( rule__TerminalExpression__PrefixAssignment_4_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2330:2: rule__TerminalExpression__PrefixAssignment_4_0
            {
            pushFollow(FOLLOW_rule__TerminalExpression__PrefixAssignment_4_0_in_rule__TerminalExpression__Group_4__0__Impl4670);
            rule__TerminalExpression__PrefixAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getPrefixAssignment_4_0()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_4__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2340:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2344:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2345:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__14700);
            rule__TerminalExpression__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__14703);
            rule__TerminalExpression__Group_4__2();
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2352:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__VariablePathAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2356:1: ( ( ( rule__TerminalExpression__VariablePathAssignment_4_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2357:1: ( ( rule__TerminalExpression__VariablePathAssignment_4_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2357:1: ( ( rule__TerminalExpression__VariablePathAssignment_4_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2358:1: ( rule__TerminalExpression__VariablePathAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getVariablePathAssignment_4_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2359:1: ( rule__TerminalExpression__VariablePathAssignment_4_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2359:2: rule__TerminalExpression__VariablePathAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__VariablePathAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl4730);
            rule__TerminalExpression__VariablePathAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getVariablePathAssignment_4_1()); 

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


    // $ANTLR start rule__TerminalExpression__Group_4__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2369:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2373:1: ( rule__TerminalExpression__Group_4__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2374:2: rule__TerminalExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__24760);
            rule__TerminalExpression__Group_4__2__Impl();
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
    // $ANTLR end rule__TerminalExpression__Group_4__2


    // $ANTLR start rule__TerminalExpression__Group_4__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2380:1: rule__TerminalExpression__Group_4__2__Impl : ( ( rule__TerminalExpression__PrefixAssignment_4_2 ) ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2384:1: ( ( ( rule__TerminalExpression__PrefixAssignment_4_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2385:1: ( ( rule__TerminalExpression__PrefixAssignment_4_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2385:1: ( ( rule__TerminalExpression__PrefixAssignment_4_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2386:1: ( rule__TerminalExpression__PrefixAssignment_4_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getPrefixAssignment_4_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2387:1: ( rule__TerminalExpression__PrefixAssignment_4_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2387:2: rule__TerminalExpression__PrefixAssignment_4_2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__PrefixAssignment_4_2_in_rule__TerminalExpression__Group_4__2__Impl4787);
            rule__TerminalExpression__PrefixAssignment_4_2();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getPrefixAssignment_4_2()); 

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
    // $ANTLR end rule__TerminalExpression__Group_4__2__Impl


    // $ANTLR start rule__VariablePath__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2403:1: rule__VariablePath__Group__0 : rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1 ;
    public final void rule__VariablePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2407:1: ( rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2408:2: rule__VariablePath__Group__0__Impl rule__VariablePath__Group__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__0__Impl_in_rule__VariablePath__Group__04823);
            rule__VariablePath__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group__1_in_rule__VariablePath__Group__04826);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2415:1: rule__VariablePath__Group__0__Impl : ( () ) ;
    public final void rule__VariablePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2419:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2420:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2420:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2421:1: ()
            {
             before(grammarAccess.getVariablePathAccess().getVariablePathAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2422:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2424:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2434:1: rule__VariablePath__Group__1 : rule__VariablePath__Group__1__Impl ;
    public final void rule__VariablePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2438:1: ( rule__VariablePath__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2439:2: rule__VariablePath__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group__1__Impl_in_rule__VariablePath__Group__14884);
            rule__VariablePath__Group__1__Impl();
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2445:1: rule__VariablePath__Group__1__Impl : ( ( rule__VariablePath__Group_1__0 ) ) ;
    public final void rule__VariablePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2449:1: ( ( ( rule__VariablePath__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2450:1: ( ( rule__VariablePath__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2450:1: ( ( rule__VariablePath__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2451:1: ( rule__VariablePath__Group_1__0 )
            {
             before(grammarAccess.getVariablePathAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2452:1: ( rule__VariablePath__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2452:2: rule__VariablePath__Group_1__0
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1__0_in_rule__VariablePath__Group__1__Impl4911);
            rule__VariablePath__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getGroup_1()); 

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


    // $ANTLR start rule__VariablePath__Group_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2466:1: rule__VariablePath__Group_1__0 : rule__VariablePath__Group_1__0__Impl rule__VariablePath__Group_1__1 ;
    public final void rule__VariablePath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2470:1: ( rule__VariablePath__Group_1__0__Impl rule__VariablePath__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2471:2: rule__VariablePath__Group_1__0__Impl rule__VariablePath__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1__0__Impl_in_rule__VariablePath__Group_1__04945);
            rule__VariablePath__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1__1_in_rule__VariablePath__Group_1__04948);
            rule__VariablePath__Group_1__1();
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
    // $ANTLR end rule__VariablePath__Group_1__0


    // $ANTLR start rule__VariablePath__Group_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2478:1: rule__VariablePath__Group_1__0__Impl : ( ( rule__VariablePath__Alternatives_1_0 ) ) ;
    public final void rule__VariablePath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2482:1: ( ( ( rule__VariablePath__Alternatives_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2483:1: ( ( rule__VariablePath__Alternatives_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2483:1: ( ( rule__VariablePath__Alternatives_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2484:1: ( rule__VariablePath__Alternatives_1_0 )
            {
             before(grammarAccess.getVariablePathAccess().getAlternatives_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2485:1: ( rule__VariablePath__Alternatives_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2485:2: rule__VariablePath__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__VariablePath__Alternatives_1_0_in_rule__VariablePath__Group_1__0__Impl4975);
            rule__VariablePath__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getAlternatives_1_0()); 

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
    // $ANTLR end rule__VariablePath__Group_1__0__Impl


    // $ANTLR start rule__VariablePath__Group_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2495:1: rule__VariablePath__Group_1__1 : rule__VariablePath__Group_1__1__Impl rule__VariablePath__Group_1__2 ;
    public final void rule__VariablePath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2499:1: ( rule__VariablePath__Group_1__1__Impl rule__VariablePath__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2500:2: rule__VariablePath__Group_1__1__Impl rule__VariablePath__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1__1__Impl_in_rule__VariablePath__Group_1__15005);
            rule__VariablePath__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1__2_in_rule__VariablePath__Group_1__15008);
            rule__VariablePath__Group_1__2();
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
    // $ANTLR end rule__VariablePath__Group_1__1


    // $ANTLR start rule__VariablePath__Group_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2507:1: rule__VariablePath__Group_1__1__Impl : ( ( rule__VariablePath__Group_1_1__0 )? ) ;
    public final void rule__VariablePath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2511:1: ( ( ( rule__VariablePath__Group_1_1__0 )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2512:1: ( ( rule__VariablePath__Group_1_1__0 )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2512:1: ( ( rule__VariablePath__Group_1_1__0 )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2513:1: ( rule__VariablePath__Group_1_1__0 )?
            {
             before(grammarAccess.getVariablePathAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2514:1: ( rule__VariablePath__Group_1_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LSQUARE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2514:2: rule__VariablePath__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__VariablePath__Group_1_1__0_in_rule__VariablePath__Group_1__1__Impl5035);
                    rule__VariablePath__Group_1_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariablePathAccess().getGroup_1_1()); 

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
    // $ANTLR end rule__VariablePath__Group_1__1__Impl


    // $ANTLR start rule__VariablePath__Group_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2524:1: rule__VariablePath__Group_1__2 : rule__VariablePath__Group_1__2__Impl ;
    public final void rule__VariablePath__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2528:1: ( rule__VariablePath__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2529:2: rule__VariablePath__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1__2__Impl_in_rule__VariablePath__Group_1__25066);
            rule__VariablePath__Group_1__2__Impl();
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
    // $ANTLR end rule__VariablePath__Group_1__2


    // $ANTLR start rule__VariablePath__Group_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2535:1: rule__VariablePath__Group_1__2__Impl : ( ( rule__VariablePath__Group_1_2__0 )* ) ;
    public final void rule__VariablePath__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2539:1: ( ( ( rule__VariablePath__Group_1_2__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2540:1: ( ( rule__VariablePath__Group_1_2__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2540:1: ( ( rule__VariablePath__Group_1_2__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2541:1: ( rule__VariablePath__Group_1_2__0 )*
            {
             before(grammarAccess.getVariablePathAccess().getGroup_1_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2542:1: ( rule__VariablePath__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2542:2: rule__VariablePath__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariablePath__Group_1_2__0_in_rule__VariablePath__Group_1__2__Impl5093);
            	    rule__VariablePath__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVariablePathAccess().getGroup_1_2()); 

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
    // $ANTLR end rule__VariablePath__Group_1__2__Impl


    // $ANTLR start rule__VariablePath__Group_1_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2558:1: rule__VariablePath__Group_1_1__0 : rule__VariablePath__Group_1_1__0__Impl rule__VariablePath__Group_1_1__1 ;
    public final void rule__VariablePath__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2562:1: ( rule__VariablePath__Group_1_1__0__Impl rule__VariablePath__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2563:2: rule__VariablePath__Group_1_1__0__Impl rule__VariablePath__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_1__0__Impl_in_rule__VariablePath__Group_1_1__05130);
            rule__VariablePath__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1_1__1_in_rule__VariablePath__Group_1_1__05133);
            rule__VariablePath__Group_1_1__1();
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
    // $ANTLR end rule__VariablePath__Group_1_1__0


    // $ANTLR start rule__VariablePath__Group_1_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2570:1: rule__VariablePath__Group_1_1__0__Impl : ( RULE_LSQUARE ) ;
    public final void rule__VariablePath__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2574:1: ( ( RULE_LSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2575:1: ( RULE_LSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2575:1: ( RULE_LSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2576:1: RULE_LSQUARE
            {
             before(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_1_1_0()); 
            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_rule__VariablePath__Group_1_1__0__Impl5160); 
             after(grammarAccess.getVariablePathAccess().getLSQUARETerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__VariablePath__Group_1_1__0__Impl


    // $ANTLR start rule__VariablePath__Group_1_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2587:1: rule__VariablePath__Group_1_1__1 : rule__VariablePath__Group_1_1__1__Impl rule__VariablePath__Group_1_1__2 ;
    public final void rule__VariablePath__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2591:1: ( rule__VariablePath__Group_1_1__1__Impl rule__VariablePath__Group_1_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2592:2: rule__VariablePath__Group_1_1__1__Impl rule__VariablePath__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_1__1__Impl_in_rule__VariablePath__Group_1_1__15189);
            rule__VariablePath__Group_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1_1__2_in_rule__VariablePath__Group_1_1__15192);
            rule__VariablePath__Group_1_1__2();
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
    // $ANTLR end rule__VariablePath__Group_1_1__1


    // $ANTLR start rule__VariablePath__Group_1_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2599:1: rule__VariablePath__Group_1_1__1__Impl : ( ( rule__VariablePath__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__VariablePath__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2603:1: ( ( ( rule__VariablePath__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2604:1: ( ( rule__VariablePath__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2604:1: ( ( rule__VariablePath__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2605:1: ( rule__VariablePath__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getVariablePathAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2606:1: ( rule__VariablePath__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2606:2: rule__VariablePath__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__VariablePath__ChildrenAssignment_1_1_1_in_rule__VariablePath__Group_1_1__1__Impl5219);
            rule__VariablePath__ChildrenAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getChildrenAssignment_1_1_1()); 

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
    // $ANTLR end rule__VariablePath__Group_1_1__1__Impl


    // $ANTLR start rule__VariablePath__Group_1_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2616:1: rule__VariablePath__Group_1_1__2 : rule__VariablePath__Group_1_1__2__Impl ;
    public final void rule__VariablePath__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2620:1: ( rule__VariablePath__Group_1_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2621:2: rule__VariablePath__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_1__2__Impl_in_rule__VariablePath__Group_1_1__25249);
            rule__VariablePath__Group_1_1__2__Impl();
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
    // $ANTLR end rule__VariablePath__Group_1_1__2


    // $ANTLR start rule__VariablePath__Group_1_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2627:1: rule__VariablePath__Group_1_1__2__Impl : ( RULE_RSQUARE ) ;
    public final void rule__VariablePath__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2631:1: ( ( RULE_RSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2632:1: ( RULE_RSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2632:1: ( RULE_RSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2633:1: RULE_RSQUARE
            {
             before(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_1_1_2()); 
            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_rule__VariablePath__Group_1_1__2__Impl5276); 
             after(grammarAccess.getVariablePathAccess().getRSQUARETerminalRuleCall_1_1_2()); 

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
    // $ANTLR end rule__VariablePath__Group_1_1__2__Impl


    // $ANTLR start rule__VariablePath__Group_1_2__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2650:1: rule__VariablePath__Group_1_2__0 : rule__VariablePath__Group_1_2__0__Impl rule__VariablePath__Group_1_2__1 ;
    public final void rule__VariablePath__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2654:1: ( rule__VariablePath__Group_1_2__0__Impl rule__VariablePath__Group_1_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2655:2: rule__VariablePath__Group_1_2__0__Impl rule__VariablePath__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_2__0__Impl_in_rule__VariablePath__Group_1_2__05311);
            rule__VariablePath__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1_2__1_in_rule__VariablePath__Group_1_2__05314);
            rule__VariablePath__Group_1_2__1();
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
    // $ANTLR end rule__VariablePath__Group_1_2__0


    // $ANTLR start rule__VariablePath__Group_1_2__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2662:1: rule__VariablePath__Group_1_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__VariablePath__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2666:1: ( ( RULE_DOT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2667:1: ( RULE_DOT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2667:1: ( RULE_DOT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2668:1: RULE_DOT
            {
             before(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__VariablePath__Group_1_2__0__Impl5341); 
             after(grammarAccess.getVariablePathAccess().getDOTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end rule__VariablePath__Group_1_2__0__Impl


    // $ANTLR start rule__VariablePath__Group_1_2__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2679:1: rule__VariablePath__Group_1_2__1 : rule__VariablePath__Group_1_2__1__Impl ;
    public final void rule__VariablePath__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2683:1: ( rule__VariablePath__Group_1_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2684:2: rule__VariablePath__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_2__1__Impl_in_rule__VariablePath__Group_1_2__15370);
            rule__VariablePath__Group_1_2__1__Impl();
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
    // $ANTLR end rule__VariablePath__Group_1_2__1


    // $ANTLR start rule__VariablePath__Group_1_2__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2690:1: rule__VariablePath__Group_1_2__1__Impl : ( ( rule__VariablePath__Alternatives_1_2_1 ) ) ;
    public final void rule__VariablePath__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2694:1: ( ( ( rule__VariablePath__Alternatives_1_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2695:1: ( ( rule__VariablePath__Alternatives_1_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2695:1: ( ( rule__VariablePath__Alternatives_1_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2696:1: ( rule__VariablePath__Alternatives_1_2_1 )
            {
             before(grammarAccess.getVariablePathAccess().getAlternatives_1_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2697:1: ( rule__VariablePath__Alternatives_1_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2697:2: rule__VariablePath__Alternatives_1_2_1
            {
            pushFollow(FOLLOW_rule__VariablePath__Alternatives_1_2_1_in_rule__VariablePath__Group_1_2__1__Impl5397);
            rule__VariablePath__Alternatives_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getAlternatives_1_2_1()); 

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
    // $ANTLR end rule__VariablePath__Group_1_2__1__Impl


    // $ANTLR start rule__VariablePath__Group_1_2_1_1__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2711:1: rule__VariablePath__Group_1_2_1_1__0 : rule__VariablePath__Group_1_2_1_1__0__Impl rule__VariablePath__Group_1_2_1_1__1 ;
    public final void rule__VariablePath__Group_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2715:1: ( rule__VariablePath__Group_1_2_1_1__0__Impl rule__VariablePath__Group_1_2_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2716:2: rule__VariablePath__Group_1_2_1_1__0__Impl rule__VariablePath__Group_1_2_1_1__1
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_2_1_1__0__Impl_in_rule__VariablePath__Group_1_2_1_1__05431);
            rule__VariablePath__Group_1_2_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1_2_1_1__1_in_rule__VariablePath__Group_1_2_1_1__05434);
            rule__VariablePath__Group_1_2_1_1__1();
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
    // $ANTLR end rule__VariablePath__Group_1_2_1_1__0


    // $ANTLR start rule__VariablePath__Group_1_2_1_1__0__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2723:1: rule__VariablePath__Group_1_2_1_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__VariablePath__Group_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2727:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2728:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2728:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2729:1: RULE_LPAREN
            {
             before(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_1_2_1_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__VariablePath__Group_1_2_1_1__0__Impl5461); 
             after(grammarAccess.getVariablePathAccess().getLPARENTerminalRuleCall_1_2_1_1_0()); 

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
    // $ANTLR end rule__VariablePath__Group_1_2_1_1__0__Impl


    // $ANTLR start rule__VariablePath__Group_1_2_1_1__1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2740:1: rule__VariablePath__Group_1_2_1_1__1 : rule__VariablePath__Group_1_2_1_1__1__Impl rule__VariablePath__Group_1_2_1_1__2 ;
    public final void rule__VariablePath__Group_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2744:1: ( rule__VariablePath__Group_1_2_1_1__1__Impl rule__VariablePath__Group_1_2_1_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2745:2: rule__VariablePath__Group_1_2_1_1__1__Impl rule__VariablePath__Group_1_2_1_1__2
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_2_1_1__1__Impl_in_rule__VariablePath__Group_1_2_1_1__15490);
            rule__VariablePath__Group_1_2_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VariablePath__Group_1_2_1_1__2_in_rule__VariablePath__Group_1_2_1_1__15493);
            rule__VariablePath__Group_1_2_1_1__2();
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
    // $ANTLR end rule__VariablePath__Group_1_2_1_1__1


    // $ANTLR start rule__VariablePath__Group_1_2_1_1__1__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2752:1: rule__VariablePath__Group_1_2_1_1__1__Impl : ( ( rule__VariablePath__ChildrenAssignment_1_2_1_1_1 ) ) ;
    public final void rule__VariablePath__Group_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2756:1: ( ( ( rule__VariablePath__ChildrenAssignment_1_2_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2757:1: ( ( rule__VariablePath__ChildrenAssignment_1_2_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2757:1: ( ( rule__VariablePath__ChildrenAssignment_1_2_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2758:1: ( rule__VariablePath__ChildrenAssignment_1_2_1_1_1 )
            {
             before(grammarAccess.getVariablePathAccess().getChildrenAssignment_1_2_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2759:1: ( rule__VariablePath__ChildrenAssignment_1_2_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2759:2: rule__VariablePath__ChildrenAssignment_1_2_1_1_1
            {
            pushFollow(FOLLOW_rule__VariablePath__ChildrenAssignment_1_2_1_1_1_in_rule__VariablePath__Group_1_2_1_1__1__Impl5520);
            rule__VariablePath__ChildrenAssignment_1_2_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariablePathAccess().getChildrenAssignment_1_2_1_1_1()); 

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
    // $ANTLR end rule__VariablePath__Group_1_2_1_1__1__Impl


    // $ANTLR start rule__VariablePath__Group_1_2_1_1__2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2769:1: rule__VariablePath__Group_1_2_1_1__2 : rule__VariablePath__Group_1_2_1_1__2__Impl ;
    public final void rule__VariablePath__Group_1_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2773:1: ( rule__VariablePath__Group_1_2_1_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2774:2: rule__VariablePath__Group_1_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablePath__Group_1_2_1_1__2__Impl_in_rule__VariablePath__Group_1_2_1_1__25550);
            rule__VariablePath__Group_1_2_1_1__2__Impl();
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
    // $ANTLR end rule__VariablePath__Group_1_2_1_1__2


    // $ANTLR start rule__VariablePath__Group_1_2_1_1__2__Impl
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2780:1: rule__VariablePath__Group_1_2_1_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__VariablePath__Group_1_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2784:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2785:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2785:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2786:1: RULE_RPAREN
            {
             before(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_1_2_1_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__VariablePath__Group_1_2_1_1__2__Impl5577); 
             after(grammarAccess.getVariablePathAccess().getRPARENTerminalRuleCall_1_2_1_1_2()); 

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
    // $ANTLR end rule__VariablePath__Group_1_2_1_1__2__Impl


    // $ANTLR start rule__NDChoiceStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2803:1: rule__NDChoiceStatement__Group__0 : rule__NDChoiceStatement__Group__0__Impl rule__NDChoiceStatement__Group__1 ;
    public final void rule__NDChoiceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2807:1: ( rule__NDChoiceStatement__Group__0__Impl rule__NDChoiceStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2808:2: rule__NDChoiceStatement__Group__0__Impl rule__NDChoiceStatement__Group__1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__0__Impl_in_rule__NDChoiceStatement__Group__05612);
            rule__NDChoiceStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__1_in_rule__NDChoiceStatement__Group__05615);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2815:1: rule__NDChoiceStatement__Group__0__Impl : ( () ) ;
    public final void rule__NDChoiceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2819:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2820:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2820:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2821:1: ()
            {
             before(grammarAccess.getNDChoiceStatementAccess().getNDChoiceStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2822:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2824:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2834:1: rule__NDChoiceStatement__Group__1 : rule__NDChoiceStatement__Group__1__Impl ;
    public final void rule__NDChoiceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2838:1: ( rule__NDChoiceStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2839:2: rule__NDChoiceStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group__1__Impl_in_rule__NDChoiceStatement__Group__15673);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2845:1: rule__NDChoiceStatement__Group__1__Impl : ( ( rule__NDChoiceStatement__Group_1__0 )* ) ;
    public final void rule__NDChoiceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2849:1: ( ( ( rule__NDChoiceStatement__Group_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2850:1: ( ( rule__NDChoiceStatement__Group_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2850:1: ( ( rule__NDChoiceStatement__Group_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2851:1: ( rule__NDChoiceStatement__Group_1__0 )*
            {
             before(grammarAccess.getNDChoiceStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2852:1: ( rule__NDChoiceStatement__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_LSQUARE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2852:2: rule__NDChoiceStatement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__0_in_rule__NDChoiceStatement__Group__1__Impl5700);
            	    rule__NDChoiceStatement__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2866:1: rule__NDChoiceStatement__Group_1__0 : rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1 ;
    public final void rule__NDChoiceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2870:1: ( rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2871:2: rule__NDChoiceStatement__Group_1__0__Impl rule__NDChoiceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__0__Impl_in_rule__NDChoiceStatement__Group_1__05735);
            rule__NDChoiceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__1_in_rule__NDChoiceStatement__Group_1__05738);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2878:1: rule__NDChoiceStatement__Group_1__0__Impl : ( RULE_LSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2882:1: ( ( RULE_LSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2883:1: ( RULE_LSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2883:1: ( RULE_LSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2884:1: RULE_LSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getLSQUARETerminalRuleCall_1_0()); 
            match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_1__0__Impl5765); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2895:1: rule__NDChoiceStatement__Group_1__1 : rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2 ;
    public final void rule__NDChoiceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2899:1: ( rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2900:2: rule__NDChoiceStatement__Group_1__1__Impl rule__NDChoiceStatement__Group_1__2
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__1__Impl_in_rule__NDChoiceStatement__Group_1__15794);
            rule__NDChoiceStatement__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__2_in_rule__NDChoiceStatement__Group_1__15797);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2907:1: rule__NDChoiceStatement__Group_1__1__Impl : ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) ) ;
    public final void rule__NDChoiceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2911:1: ( ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2912:1: ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2912:1: ( ( rule__NDChoiceStatement__InputOperationAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2913:1: ( rule__NDChoiceStatement__InputOperationAssignment_1_1 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getInputOperationAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2914:1: ( rule__NDChoiceStatement__InputOperationAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2914:2: rule__NDChoiceStatement__InputOperationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__InputOperationAssignment_1_1_in_rule__NDChoiceStatement__Group_1__1__Impl5824);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2924:1: rule__NDChoiceStatement__Group_1__2 : rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3 ;
    public final void rule__NDChoiceStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2928:1: ( rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2929:2: rule__NDChoiceStatement__Group_1__2__Impl rule__NDChoiceStatement__Group_1__3
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__2__Impl_in_rule__NDChoiceStatement__Group_1__25854);
            rule__NDChoiceStatement__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__3_in_rule__NDChoiceStatement__Group_1__25857);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2936:1: rule__NDChoiceStatement__Group_1__2__Impl : ( RULE_RSQUARE ) ;
    public final void rule__NDChoiceStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2940:1: ( ( RULE_RSQUARE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2941:1: ( RULE_RSQUARE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2941:1: ( RULE_RSQUARE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2942:1: RULE_RSQUARE
            {
             before(grammarAccess.getNDChoiceStatementAccess().getRSQUARETerminalRuleCall_1_2()); 
            match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_1__2__Impl5884); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2953:1: rule__NDChoiceStatement__Group_1__3 : rule__NDChoiceStatement__Group_1__3__Impl ;
    public final void rule__NDChoiceStatement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2957:1: ( rule__NDChoiceStatement__Group_1__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2958:2: rule__NDChoiceStatement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__Group_1__3__Impl_in_rule__NDChoiceStatement__Group_1__35913);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2964:1: rule__NDChoiceStatement__Group_1__3__Impl : ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) ) ;
    public final void rule__NDChoiceStatement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2968:1: ( ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2969:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2969:1: ( ( rule__NDChoiceStatement__MainProcessAssignment_1_3 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2970:1: ( rule__NDChoiceStatement__MainProcessAssignment_1_3 )
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessAssignment_1_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2971:1: ( rule__NDChoiceStatement__MainProcessAssignment_1_3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2971:2: rule__NDChoiceStatement__MainProcessAssignment_1_3
            {
            pushFollow(FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_1_3_in_rule__NDChoiceStatement__Group_1__3__Impl5940);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2989:1: rule__InputOperation__Group_0__0 : rule__InputOperation__Group_0__0__Impl rule__InputOperation__Group_0__1 ;
    public final void rule__InputOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2993:1: ( rule__InputOperation__Group_0__0__Impl rule__InputOperation__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2994:2: rule__InputOperation__Group_0__0__Impl rule__InputOperation__Group_0__1
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__0__Impl_in_rule__InputOperation__Group_0__05978);
            rule__InputOperation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__1_in_rule__InputOperation__Group_0__05981);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3001:1: rule__InputOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__InputOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3005:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3006:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3006:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3007:1: ()
            {
             before(grammarAccess.getInputOperationAccess().getInputOperationAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3008:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3010:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3020:1: rule__InputOperation__Group_0__1 : rule__InputOperation__Group_0__1__Impl rule__InputOperation__Group_0__2 ;
    public final void rule__InputOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3024:1: ( rule__InputOperation__Group_0__1__Impl rule__InputOperation__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3025:2: rule__InputOperation__Group_0__1__Impl rule__InputOperation__Group_0__2
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__1__Impl_in_rule__InputOperation__Group_0__16039);
            rule__InputOperation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__2_in_rule__InputOperation__Group_0__16042);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3032:1: rule__InputOperation__Group_0__1__Impl : ( RULE_LINKIN ) ;
    public final void rule__InputOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3036:1: ( ( RULE_LINKIN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3037:1: ( RULE_LINKIN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3037:1: ( RULE_LINKIN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3038:1: RULE_LINKIN
            {
             before(grammarAccess.getInputOperationAccess().getLINKINTerminalRuleCall_0_1()); 
            match(input,RULE_LINKIN,FOLLOW_RULE_LINKIN_in_rule__InputOperation__Group_0__1__Impl6069); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3049:1: rule__InputOperation__Group_0__2 : rule__InputOperation__Group_0__2__Impl rule__InputOperation__Group_0__3 ;
    public final void rule__InputOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3053:1: ( rule__InputOperation__Group_0__2__Impl rule__InputOperation__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3054:2: rule__InputOperation__Group_0__2__Impl rule__InputOperation__Group_0__3
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__2__Impl_in_rule__InputOperation__Group_0__26098);
            rule__InputOperation__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__3_in_rule__InputOperation__Group_0__26101);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3061:1: rule__InputOperation__Group_0__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__InputOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3065:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3066:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3066:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3067:1: RULE_LPAREN
            {
             before(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_0_2()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_0__2__Impl6128); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3078:1: rule__InputOperation__Group_0__3 : rule__InputOperation__Group_0__3__Impl rule__InputOperation__Group_0__4 ;
    public final void rule__InputOperation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3082:1: ( rule__InputOperation__Group_0__3__Impl rule__InputOperation__Group_0__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3083:2: rule__InputOperation__Group_0__3__Impl rule__InputOperation__Group_0__4
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__3__Impl_in_rule__InputOperation__Group_0__36157);
            rule__InputOperation__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_0__4_in_rule__InputOperation__Group_0__36160);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3090:1: rule__InputOperation__Group_0__3__Impl : ( RULE_ID ) ;
    public final void rule__InputOperation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3094:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3095:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3095:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3096:1: RULE_ID
            {
             before(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_0_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InputOperation__Group_0__3__Impl6187); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3107:1: rule__InputOperation__Group_0__4 : rule__InputOperation__Group_0__4__Impl ;
    public final void rule__InputOperation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3111:1: ( rule__InputOperation__Group_0__4__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3112:2: rule__InputOperation__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_0__4__Impl_in_rule__InputOperation__Group_0__46216);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3118:1: rule__InputOperation__Group_0__4__Impl : ( RULE_RPAREN ) ;
    public final void rule__InputOperation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3122:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3123:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3123:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3124:1: RULE_RPAREN
            {
             before(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_0_4()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_0__4__Impl6243); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3145:1: rule__InputOperation__Group_1__0 : rule__InputOperation__Group_1__0__Impl rule__InputOperation__Group_1__1 ;
    public final void rule__InputOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3149:1: ( rule__InputOperation__Group_1__0__Impl rule__InputOperation__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3150:2: rule__InputOperation__Group_1__0__Impl rule__InputOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__0__Impl_in_rule__InputOperation__Group_1__06282);
            rule__InputOperation__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__1_in_rule__InputOperation__Group_1__06285);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3157:1: rule__InputOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__InputOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3161:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3162:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3162:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3163:1: ()
            {
             before(grammarAccess.getInputOperationAccess().getInputOperationAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3164:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3166:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3176:1: rule__InputOperation__Group_1__1 : rule__InputOperation__Group_1__1__Impl rule__InputOperation__Group_1__2 ;
    public final void rule__InputOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3180:1: ( rule__InputOperation__Group_1__1__Impl rule__InputOperation__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3181:2: rule__InputOperation__Group_1__1__Impl rule__InputOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__1__Impl_in_rule__InputOperation__Group_1__16343);
            rule__InputOperation__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__2_in_rule__InputOperation__Group_1__16346);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3188:1: rule__InputOperation__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__InputOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3192:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3193:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3193:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3194:1: RULE_ID
            {
             before(grammarAccess.getInputOperationAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InputOperation__Group_1__1__Impl6373); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3205:1: rule__InputOperation__Group_1__2 : rule__InputOperation__Group_1__2__Impl rule__InputOperation__Group_1__3 ;
    public final void rule__InputOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3209:1: ( rule__InputOperation__Group_1__2__Impl rule__InputOperation__Group_1__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3210:2: rule__InputOperation__Group_1__2__Impl rule__InputOperation__Group_1__3
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__2__Impl_in_rule__InputOperation__Group_1__26402);
            rule__InputOperation__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__3_in_rule__InputOperation__Group_1__26405);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3217:1: rule__InputOperation__Group_1__2__Impl : ( RULE_LPAREN ) ;
    public final void rule__InputOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3221:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3222:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3222:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3223:1: RULE_LPAREN
            {
             before(grammarAccess.getInputOperationAccess().getLPARENTerminalRuleCall_1_2()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_1__2__Impl6432); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3234:1: rule__InputOperation__Group_1__3 : rule__InputOperation__Group_1__3__Impl rule__InputOperation__Group_1__4 ;
    public final void rule__InputOperation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3238:1: ( rule__InputOperation__Group_1__3__Impl rule__InputOperation__Group_1__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3239:2: rule__InputOperation__Group_1__3__Impl rule__InputOperation__Group_1__4
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__3__Impl_in_rule__InputOperation__Group_1__36461);
            rule__InputOperation__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__4_in_rule__InputOperation__Group_1__36464);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3246:1: rule__InputOperation__Group_1__3__Impl : ( () ) ;
    public final void rule__InputOperation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3250:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3251:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3251:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3252:1: ()
            {
             before(grammarAccess.getInputOperationAccess().getVariablePathAction_1_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3253:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3255:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3265:1: rule__InputOperation__Group_1__4 : rule__InputOperation__Group_1__4__Impl rule__InputOperation__Group_1__5 ;
    public final void rule__InputOperation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3269:1: ( rule__InputOperation__Group_1__4__Impl rule__InputOperation__Group_1__5 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3270:2: rule__InputOperation__Group_1__4__Impl rule__InputOperation__Group_1__5
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__4__Impl_in_rule__InputOperation__Group_1__46522);
            rule__InputOperation__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__5_in_rule__InputOperation__Group_1__46525);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3277:1: rule__InputOperation__Group_1__4__Impl : ( ( rule__InputOperation__VariablePathAssignment_1_4 ) ) ;
    public final void rule__InputOperation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3281:1: ( ( ( rule__InputOperation__VariablePathAssignment_1_4 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3282:1: ( ( rule__InputOperation__VariablePathAssignment_1_4 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3282:1: ( ( rule__InputOperation__VariablePathAssignment_1_4 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3283:1: ( rule__InputOperation__VariablePathAssignment_1_4 )
            {
             before(grammarAccess.getInputOperationAccess().getVariablePathAssignment_1_4()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3284:1: ( rule__InputOperation__VariablePathAssignment_1_4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3284:2: rule__InputOperation__VariablePathAssignment_1_4
            {
            pushFollow(FOLLOW_rule__InputOperation__VariablePathAssignment_1_4_in_rule__InputOperation__Group_1__4__Impl6552);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3294:1: rule__InputOperation__Group_1__5 : rule__InputOperation__Group_1__5__Impl rule__InputOperation__Group_1__6 ;
    public final void rule__InputOperation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3298:1: ( rule__InputOperation__Group_1__5__Impl rule__InputOperation__Group_1__6 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3299:2: rule__InputOperation__Group_1__5__Impl rule__InputOperation__Group_1__6
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__5__Impl_in_rule__InputOperation__Group_1__56582);
            rule__InputOperation__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputOperation__Group_1__6_in_rule__InputOperation__Group_1__56585);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3306:1: rule__InputOperation__Group_1__5__Impl : ( RULE_RPAREN ) ;
    public final void rule__InputOperation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3310:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3311:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3311:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3312:1: RULE_RPAREN
            {
             before(grammarAccess.getInputOperationAccess().getRPARENTerminalRuleCall_1_5()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_1__5__Impl6612); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3323:1: rule__InputOperation__Group_1__6 : rule__InputOperation__Group_1__6__Impl ;
    public final void rule__InputOperation__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3327:1: ( rule__InputOperation__Group_1__6__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3328:2: rule__InputOperation__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__InputOperation__Group_1__6__Impl_in_rule__InputOperation__Group_1__66641);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3334:1: rule__InputOperation__Group_1__6__Impl : ( ( ruleRequestResponseOperation )? ) ;
    public final void rule__InputOperation__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3338:1: ( ( ( ruleRequestResponseOperation )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3339:1: ( ( ruleRequestResponseOperation )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3339:1: ( ( ruleRequestResponseOperation )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3340:1: ( ruleRequestResponseOperation )?
            {
             before(grammarAccess.getInputOperationAccess().getRequestResponseOperationParserRuleCall_1_6()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3341:1: ( ruleRequestResponseOperation )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LPAREN) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3341:3: ruleRequestResponseOperation
                    {
                    pushFollow(FOLLOW_ruleRequestResponseOperation_in_rule__InputOperation__Group_1__6__Impl6669);
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


    // $ANTLR start rule__RequestResponseOperation__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3365:1: rule__RequestResponseOperation__Group__0 : rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1 ;
    public final void rule__RequestResponseOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3369:1: ( rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3370:2: rule__RequestResponseOperation__Group__0__Impl rule__RequestResponseOperation__Group__1
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__0__Impl_in_rule__RequestResponseOperation__Group__06714);
            rule__RequestResponseOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__1_in_rule__RequestResponseOperation__Group__06717);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3377:1: rule__RequestResponseOperation__Group__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__RequestResponseOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3381:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3382:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3382:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3383:1: RULE_LPAREN
            {
             before(grammarAccess.getRequestResponseOperationAccess().getLPARENTerminalRuleCall_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__RequestResponseOperation__Group__0__Impl6744); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3394:1: rule__RequestResponseOperation__Group__1 : rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2 ;
    public final void rule__RequestResponseOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3398:1: ( rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3399:2: rule__RequestResponseOperation__Group__1__Impl rule__RequestResponseOperation__Group__2
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__1__Impl_in_rule__RequestResponseOperation__Group__16773);
            rule__RequestResponseOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__2_in_rule__RequestResponseOperation__Group__16776);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3406:1: rule__RequestResponseOperation__Group__1__Impl : ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) ) ;
    public final void rule__RequestResponseOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3410:1: ( ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3411:1: ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3411:1: ( ( rule__RequestResponseOperation__ExpressionAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3412:1: ( rule__RequestResponseOperation__ExpressionAssignment_1 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getExpressionAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3413:1: ( rule__RequestResponseOperation__ExpressionAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3413:2: rule__RequestResponseOperation__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__ExpressionAssignment_1_in_rule__RequestResponseOperation__Group__1__Impl6803);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3423:1: rule__RequestResponseOperation__Group__2 : rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3 ;
    public final void rule__RequestResponseOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3427:1: ( rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3428:2: rule__RequestResponseOperation__Group__2__Impl rule__RequestResponseOperation__Group__3
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__2__Impl_in_rule__RequestResponseOperation__Group__26833);
            rule__RequestResponseOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__3_in_rule__RequestResponseOperation__Group__26836);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3435:1: rule__RequestResponseOperation__Group__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__RequestResponseOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3439:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3440:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3440:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3441:1: RULE_RPAREN
            {
             before(grammarAccess.getRequestResponseOperationAccess().getRPARENTerminalRuleCall_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__RequestResponseOperation__Group__2__Impl6863); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3452:1: rule__RequestResponseOperation__Group__3 : rule__RequestResponseOperation__Group__3__Impl ;
    public final void rule__RequestResponseOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3456:1: ( rule__RequestResponseOperation__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3457:2: rule__RequestResponseOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__Group__3__Impl_in_rule__RequestResponseOperation__Group__36892);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3463:1: rule__RequestResponseOperation__Group__3__Impl : ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) ) ;
    public final void rule__RequestResponseOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3467:1: ( ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3468:1: ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3468:1: ( ( rule__RequestResponseOperation__MainProcessAssignment_3 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3469:1: ( rule__RequestResponseOperation__MainProcessAssignment_3 )
            {
             before(grammarAccess.getRequestResponseOperationAccess().getMainProcessAssignment_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3470:1: ( rule__RequestResponseOperation__MainProcessAssignment_3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3470:2: rule__RequestResponseOperation__MainProcessAssignment_3
            {
            pushFollow(FOLLOW_rule__RequestResponseOperation__MainProcessAssignment_3_in_rule__RequestResponseOperation__Group__3__Impl6919);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3489:1: rule__Program__MainAssignment_1 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3493:1: ( ( ruleMain ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3494:1: ( ruleMain )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3494:1: ( ruleMain )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3495:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_16962);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3504:1: rule__Main__MainrocessAssignment : ( ruleMainProcess ) ;
    public final void rule__Main__MainrocessAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3508:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3509:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3509:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3510:1: ruleMainProcess
            {
             before(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment6993);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3519:1: rule__MainProcess__ParallelStatementAssignment_2 : ( ruleParallelStatement ) ;
    public final void rule__MainProcess__ParallelStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3523:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3524:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3524:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3525:1: ruleParallelStatement
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_27024);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3534:1: rule__Process__ChildrenAssignment_0_2 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3538:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3539:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3539:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3540:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_27055);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3549:1: rule__Process__ChildrenAssignment_1_1 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3553:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3554:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3554:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3555:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_17086);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3564:1: rule__ParallelStatement__ChildrenAssignment_1_0 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3568:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3569:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3569:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3570:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_07117);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3579:1: rule__ParallelStatement__ChildrenAssignment_1_1_1 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3583:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3584:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3584:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3585:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_17148);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3594:1: rule__SequenceStatement__ChildrenAssignment_1_0 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3598:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3599:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3599:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3600:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_07179);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3609:1: rule__SequenceStatement__ChildrenAssignment_1_1_1 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3613:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3614:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3614:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3615:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_17210);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3624:1: rule__BasicStatement__ProcessAssignment_0_1 : ( ruleProcess ) ;
    public final void rule__BasicStatement__ProcessAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3628:1: ( ( ruleProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3629:1: ( ruleProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3629:1: ( ruleProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3630:1: ruleProcess
            {
             before(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_17241);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3639:1: rule__BasicStatement__AssignStatementAssignment_1_1 : ( ruleAssignStatement ) ;
    public final void rule__BasicStatement__AssignStatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3643:1: ( ( ruleAssignStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3644:1: ( ruleAssignStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3644:1: ( ruleAssignStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3645:1: ruleAssignStatement
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_17272);
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


    // $ANTLR start rule__BasicStatement__NDChoiceStatementAssignment_2_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3654:1: rule__BasicStatement__NDChoiceStatementAssignment_2_1 : ( ruleNDChoiceStatement ) ;
    public final void rule__BasicStatement__NDChoiceStatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3658:1: ( ( ruleNDChoiceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3659:1: ( ruleNDChoiceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3659:1: ( ruleNDChoiceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3660:1: ruleNDChoiceStatement
            {
             before(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleNDChoiceStatement_in_rule__BasicStatement__NDChoiceStatementAssignment_2_17303);
            ruleNDChoiceStatement();
            _fsp--;

             after(grammarAccess.getBasicStatementAccess().getNDChoiceStatementNDChoiceStatementParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__BasicStatement__NDChoiceStatementAssignment_2_1


    // $ANTLR start rule__AssignStatement__VariablePathAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3669:1: rule__AssignStatement__VariablePathAssignment_1 : ( ruleVariablePath ) ;
    public final void rule__AssignStatement__VariablePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3673:1: ( ( ruleVariablePath ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3674:1: ( ruleVariablePath )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3674:1: ( ruleVariablePath )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3675:1: ruleVariablePath
            {
             before(grammarAccess.getAssignStatementAccess().getVariablePathVariablePathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariablePath_in_rule__AssignStatement__VariablePathAssignment_17334);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getAssignStatementAccess().getVariablePathVariablePathParserRuleCall_1_0()); 

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
    // $ANTLR end rule__AssignStatement__VariablePathAssignment_1


    // $ANTLR start rule__AssignStatement__RightSideAssignAssignment_3
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3684:1: rule__AssignStatement__RightSideAssignAssignment_3 : ( ruleRightSideAssignament ) ;
    public final void rule__AssignStatement__RightSideAssignAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3688:1: ( ( ruleRightSideAssignament ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3689:1: ( ruleRightSideAssignament )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3689:1: ( ruleRightSideAssignament )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3690:1: ruleRightSideAssignament
            {
             before(grammarAccess.getAssignStatementAccess().getRightSideAssignRightSideAssignamentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRightSideAssignament_in_rule__AssignStatement__RightSideAssignAssignment_37365);
            ruleRightSideAssignament();
            _fsp--;

             after(grammarAccess.getAssignStatementAccess().getRightSideAssignRightSideAssignamentParserRuleCall_3_0()); 

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
    // $ANTLR end rule__AssignStatement__RightSideAssignAssignment_3


    // $ANTLR start rule__RightSideAssignament__ExpressionAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3699:1: rule__RightSideAssignament__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__RightSideAssignament__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3703:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3704:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3704:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3705:1: ruleExpression
            {
             before(grammarAccess.getRightSideAssignamentAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__RightSideAssignament__ExpressionAssignment_17396);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getRightSideAssignamentAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end rule__RightSideAssignament__ExpressionAssignment_1


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3714:1: rule__Expression__OpAssignment_1_1 : ( ( rule__Expression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3718:1: ( ( ( rule__Expression__OpAlternatives_1_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3719:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3719:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3720:1: ( rule__Expression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3721:1: ( rule__Expression__OpAlternatives_1_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3721:2: rule__Expression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_17427);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3730:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3734:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3735:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3735:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3736:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_27460);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3745:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3749:1: ( ( RULE_INT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3750:1: ( RULE_INT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3750:1: ( RULE_INT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3751:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_17491); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3760:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_REAL ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3764:1: ( ( RULE_REAL ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3765:1: ( RULE_REAL )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3765:1: ( RULE_REAL )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3766:1: RULE_REAL
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_17522); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3775:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3779:1: ( ( RULE_STRING ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3780:1: ( RULE_STRING )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3780:1: ( RULE_STRING )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3781:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_3_17553); 
             after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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


    // $ANTLR start rule__TerminalExpression__PrefixAssignment_4_0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3790:1: rule__TerminalExpression__PrefixAssignment_4_0 : ( rulePrefix ) ;
    public final void rule__TerminalExpression__PrefixAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3794:1: ( ( rulePrefix ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3795:1: ( rulePrefix )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3795:1: ( rulePrefix )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3796:1: rulePrefix
            {
             before(grammarAccess.getTerminalExpressionAccess().getPrefixPrefixParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__TerminalExpression__PrefixAssignment_4_07584);
            rulePrefix();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getPrefixPrefixParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__TerminalExpression__PrefixAssignment_4_0


    // $ANTLR start rule__TerminalExpression__VariablePathAssignment_4_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3805:1: rule__TerminalExpression__VariablePathAssignment_4_1 : ( ruleVariablePath ) ;
    public final void rule__TerminalExpression__VariablePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3809:1: ( ( ruleVariablePath ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3810:1: ( ruleVariablePath )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3810:1: ( ruleVariablePath )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3811:1: ruleVariablePath
            {
             before(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleVariablePath_in_rule__TerminalExpression__VariablePathAssignment_4_17615);
            ruleVariablePath();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getVariablePathVariablePathParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__TerminalExpression__VariablePathAssignment_4_1


    // $ANTLR start rule__TerminalExpression__PrefixAssignment_4_2
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3820:1: rule__TerminalExpression__PrefixAssignment_4_2 : ( rulePrefix ) ;
    public final void rule__TerminalExpression__PrefixAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3824:1: ( ( rulePrefix ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3825:1: ( rulePrefix )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3825:1: ( rulePrefix )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3826:1: rulePrefix
            {
             before(grammarAccess.getTerminalExpressionAccess().getPrefixPrefixParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__TerminalExpression__PrefixAssignment_4_27646);
            rulePrefix();
            _fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getPrefixPrefixParserRuleCall_4_2_0()); 

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
    // $ANTLR end rule__TerminalExpression__PrefixAssignment_4_2


    // $ANTLR start rule__VariablePath__ChildrenAssignment_1_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3835:1: rule__VariablePath__ChildrenAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__VariablePath__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3839:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3840:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3840:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3841:1: ruleExpression
            {
             before(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_1_1_17677);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end rule__VariablePath__ChildrenAssignment_1_1_1


    // $ANTLR start rule__VariablePath__ChildrenAssignment_1_2_1_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3850:1: rule__VariablePath__ChildrenAssignment_1_2_1_1_1 : ( ruleExpression ) ;
    public final void rule__VariablePath__ChildrenAssignment_1_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3854:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3855:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3855:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3856:1: ruleExpression
            {
             before(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_1_2_1_1_17708);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getVariablePathAccess().getChildrenExpressionParserRuleCall_1_2_1_1_1_0()); 

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
    // $ANTLR end rule__VariablePath__ChildrenAssignment_1_2_1_1_1


    // $ANTLR start rule__NDChoiceStatement__InputOperationAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3865:1: rule__NDChoiceStatement__InputOperationAssignment_1_1 : ( ruleInputOperation ) ;
    public final void rule__NDChoiceStatement__InputOperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3869:1: ( ( ruleInputOperation ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3870:1: ( ruleInputOperation )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3870:1: ( ruleInputOperation )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3871:1: ruleInputOperation
            {
             before(grammarAccess.getNDChoiceStatementAccess().getInputOperationInputOperationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInputOperation_in_rule__NDChoiceStatement__InputOperationAssignment_1_17739);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3880:1: rule__NDChoiceStatement__MainProcessAssignment_1_3 : ( ruleMainProcess ) ;
    public final void rule__NDChoiceStatement__MainProcessAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3884:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3885:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3885:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3886:1: ruleMainProcess
            {
             before(grammarAccess.getNDChoiceStatementAccess().getMainProcessMainProcessParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_1_37770);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3895:1: rule__InputOperation__VariablePathAssignment_1_4 : ( ruleVariablePath ) ;
    public final void rule__InputOperation__VariablePathAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3899:1: ( ( ruleVariablePath ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3900:1: ( ruleVariablePath )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3900:1: ( ruleVariablePath )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3901:1: ruleVariablePath
            {
             before(grammarAccess.getInputOperationAccess().getVariablePathVariablePathParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleVariablePath_in_rule__InputOperation__VariablePathAssignment_1_47801);
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


    // $ANTLR start rule__RequestResponseOperation__ExpressionAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3910:1: rule__RequestResponseOperation__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__RequestResponseOperation__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3914:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3915:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3915:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3916:1: ruleExpression
            {
             before(grammarAccess.getRequestResponseOperationAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__RequestResponseOperation__ExpressionAssignment_17832);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3925:1: rule__RequestResponseOperation__MainProcessAssignment_3 : ( ruleMainProcess ) ;
    public final void rule__RequestResponseOperation__MainProcessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3929:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3930:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3930:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3931:1: ruleMainProcess
            {
             before(grammarAccess.getRequestResponseOperationAccess().getMainProcessMainProcessParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__RequestResponseOperation__MainProcessAssignment_37863);
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
    public static final BitSet FOLLOW_ruleRightSideAssignament_in_entryRuleRightSideAssignament541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSideAssignament548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightSideAssignament__Group__0_in_ruleRightSideAssignament574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_entryRuleVariablePath721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablePath728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__0_in_ruleVariablePath754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Alternatives_in_rulePrefix814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_entryRuleNDChoiceStatement842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNDChoiceStatement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__0_in_ruleNDChoiceStatement875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_entryRuleInputOperation902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperation909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Alternatives_in_ruleInputOperation935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_entryRuleRequestResponseOperation962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestResponseOperation969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__0_in_ruleRequestResponseOperation995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_01151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_01185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_01202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0_in_rule__TerminalExpression__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GLOBAL_in_rule__VariablePath__Alternatives_1_01339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_1_01356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariablePath__Alternatives_1_2_11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2_1_1__0_in_rule__VariablePath__Alternatives_1_2_11405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rule__Prefix__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rule__Prefix__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__0_in_rule__InputOperation__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__0_in_rule__InputOperation__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01536 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Program__Group__0__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01659 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11720 = new BitSet(new long[]{0x00000000000B7300L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01903 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11964 = new BitSet(new long[]{0x00000000000B7300L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__22023 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__22026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__32083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__02147 = new BitSet(new long[]{0x00000000000BD300L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__12206 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__22266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__02328 = new BitSet(new long[]{0x00000000000B5302L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__02331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02450 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2537 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02572 = new BitSet(new long[]{0x00000000000A5302L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02692 = new BitSet(new long[]{0x00000000000A5302L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02814 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2901 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02936 = new BitSet(new long[]{0x0000000000085302L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__03056 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__03059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__13117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__03178 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__03181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__03300 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__03303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__NDChoiceStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03422 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13483 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__VariablePathAssignment_1_in_rule__AssignStatement__Group__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23543 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__RightSideAssignAssignment_3_in_rule__AssignStatement__Group__3__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightSideAssignament__Group__0__Impl_in_rule__RightSideAssignament__Group__03667 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__RightSideAssignament__Group__1_in_rule__RightSideAssignament__Group__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightSideAssignament__Group__1__Impl_in_rule__RightSideAssignament__Group__13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightSideAssignament__ExpressionAssignment_1_in_rule__RightSideAssignament__Group__1__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03789 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03910 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13971 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__13974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04094 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04274 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04396 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__04518 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__04521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__14579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__0__Impl_in_rule__TerminalExpression__Group_4__04640 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1_in_rule__TerminalExpression__Group_4__04643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__PrefixAssignment_4_0_in_rule__TerminalExpression__Group_4__0__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__1__Impl_in_rule__TerminalExpression__Group_4__14700 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2_in_rule__TerminalExpression__Group_4__14703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__VariablePathAssignment_4_1_in_rule__TerminalExpression__Group_4__1__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_4__2__Impl_in_rule__TerminalExpression__Group_4__24760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__PrefixAssignment_4_2_in_rule__TerminalExpression__Group_4__2__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__0__Impl_in_rule__VariablePath__Group__04823 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__1_in_rule__VariablePath__Group__04826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group__1__Impl_in_rule__VariablePath__Group__14884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1__0_in_rule__VariablePath__Group__1__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1__0__Impl_in_rule__VariablePath__Group_1__04945 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1__1_in_rule__VariablePath__Group_1__04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Alternatives_1_0_in_rule__VariablePath__Group_1__0__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1__1__Impl_in_rule__VariablePath__Group_1__15005 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1__2_in_rule__VariablePath__Group_1__15008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_1__0_in_rule__VariablePath__Group_1__1__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1__2__Impl_in_rule__VariablePath__Group_1__25066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2__0_in_rule__VariablePath__Group_1__2__Impl5093 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_1__0__Impl_in_rule__VariablePath__Group_1_1__05130 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_1__1_in_rule__VariablePath__Group_1_1__05133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_rule__VariablePath__Group_1_1__0__Impl5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_1__1__Impl_in_rule__VariablePath__Group_1_1__15189 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_1__2_in_rule__VariablePath__Group_1_1__15192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__ChildrenAssignment_1_1_1_in_rule__VariablePath__Group_1_1__1__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_1__2__Impl_in_rule__VariablePath__Group_1_1__25249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_rule__VariablePath__Group_1_1__2__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2__0__Impl_in_rule__VariablePath__Group_1_2__05311 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2__1_in_rule__VariablePath__Group_1_2__05314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__VariablePath__Group_1_2__0__Impl5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2__1__Impl_in_rule__VariablePath__Group_1_2__15370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Alternatives_1_2_1_in_rule__VariablePath__Group_1_2__1__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2_1_1__0__Impl_in_rule__VariablePath__Group_1_2_1_1__05431 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2_1_1__1_in_rule__VariablePath__Group_1_2_1_1__05434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__VariablePath__Group_1_2_1_1__0__Impl5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2_1_1__1__Impl_in_rule__VariablePath__Group_1_2_1_1__15490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2_1_1__2_in_rule__VariablePath__Group_1_2_1_1__15493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__ChildrenAssignment_1_2_1_1_1_in_rule__VariablePath__Group_1_2_1_1__1__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablePath__Group_1_2_1_1__2__Impl_in_rule__VariablePath__Group_1_2_1_1__25550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__VariablePath__Group_1_2_1_1__2__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__0__Impl_in_rule__NDChoiceStatement__Group__05612 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__1_in_rule__NDChoiceStatement__Group__05615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group__1__Impl_in_rule__NDChoiceStatement__Group__15673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__0_in_rule__NDChoiceStatement__Group__1__Impl5700 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__0__Impl_in_rule__NDChoiceStatement__Group_1__05735 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__1_in_rule__NDChoiceStatement__Group_1__05738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_rule__NDChoiceStatement__Group_1__0__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__1__Impl_in_rule__NDChoiceStatement__Group_1__15794 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__2_in_rule__NDChoiceStatement__Group_1__15797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__InputOperationAssignment_1_1_in_rule__NDChoiceStatement__Group_1__1__Impl5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__2__Impl_in_rule__NDChoiceStatement__Group_1__25854 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__3_in_rule__NDChoiceStatement__Group_1__25857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_rule__NDChoiceStatement__Group_1__2__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__Group_1__3__Impl_in_rule__NDChoiceStatement__Group_1__35913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NDChoiceStatement__MainProcessAssignment_1_3_in_rule__NDChoiceStatement__Group_1__3__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__0__Impl_in_rule__InputOperation__Group_0__05978 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__1_in_rule__InputOperation__Group_0__05981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__1__Impl_in_rule__InputOperation__Group_0__16039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__2_in_rule__InputOperation__Group_0__16042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINKIN_in_rule__InputOperation__Group_0__1__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__2__Impl_in_rule__InputOperation__Group_0__26098 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__3_in_rule__InputOperation__Group_0__26101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_0__2__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__3__Impl_in_rule__InputOperation__Group_0__36157 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__4_in_rule__InputOperation__Group_0__36160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InputOperation__Group_0__3__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_0__4__Impl_in_rule__InputOperation__Group_0__46216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_0__4__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__0__Impl_in_rule__InputOperation__Group_1__06282 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__1_in_rule__InputOperation__Group_1__06285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__1__Impl_in_rule__InputOperation__Group_1__16343 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__2_in_rule__InputOperation__Group_1__16346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InputOperation__Group_1__1__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__2__Impl_in_rule__InputOperation__Group_1__26402 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__3_in_rule__InputOperation__Group_1__26405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__InputOperation__Group_1__2__Impl6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__3__Impl_in_rule__InputOperation__Group_1__36461 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__4_in_rule__InputOperation__Group_1__36464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__4__Impl_in_rule__InputOperation__Group_1__46522 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__5_in_rule__InputOperation__Group_1__46525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__VariablePathAssignment_1_4_in_rule__InputOperation__Group_1__4__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__5__Impl_in_rule__InputOperation__Group_1__56582 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__6_in_rule__InputOperation__Group_1__56585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__InputOperation__Group_1__5__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputOperation__Group_1__6__Impl_in_rule__InputOperation__Group_1__66641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestResponseOperation_in_rule__InputOperation__Group_1__6__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__0__Impl_in_rule__RequestResponseOperation__Group__06714 = new BitSet(new long[]{0x0000000003804F00L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__1_in_rule__RequestResponseOperation__Group__06717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__RequestResponseOperation__Group__0__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__1__Impl_in_rule__RequestResponseOperation__Group__16773 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__2_in_rule__RequestResponseOperation__Group__16776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__ExpressionAssignment_1_in_rule__RequestResponseOperation__Group__1__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__2__Impl_in_rule__RequestResponseOperation__Group__26833 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__3_in_rule__RequestResponseOperation__Group__26836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__RequestResponseOperation__Group__2__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__Group__3__Impl_in_rule__RequestResponseOperation__Group__36892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestResponseOperation__MainProcessAssignment_3_in_rule__RequestResponseOperation__Group__3__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_16962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_27024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_27055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_17086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_07117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_17148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_07179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_17210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_17241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNDChoiceStatement_in_rule__BasicStatement__NDChoiceStatementAssignment_2_17303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rule__AssignStatement__VariablePathAssignment_17334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSideAssignament_in_rule__AssignStatement__RightSideAssignAssignment_37365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__RightSideAssignament__ExpressionAssignment_17396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_17427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_27460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_17491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_17522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_3_17553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__TerminalExpression__PrefixAssignment_4_07584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rule__TerminalExpression__VariablePathAssignment_4_17615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__TerminalExpression__PrefixAssignment_4_27646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_1_1_17677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariablePath__ChildrenAssignment_1_2_1_1_17708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperation_in_rule__NDChoiceStatement__InputOperationAssignment_1_17739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__NDChoiceStatement__MainProcessAssignment_1_37770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablePath_in_rule__InputOperation__VariablePathAssignment_1_47801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__RequestResponseOperation__ExpressionAssignment_17832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__RequestResponseOperation__MainProcessAssignment_37863 = new BitSet(new long[]{0x0000000000000002L});

}