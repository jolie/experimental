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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PLUS", "RULE_MINUS", "RULE_ASTERISK", "RULE_DIVIDE", "RULE_LCURLY", "RULE_RCURLY", "RULE_LPAREN", "RULE_RPAREN", "RULE_VERT", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_CHOICE", "RULE_DECREMENT", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_ARROW", "RULE_COLON", "RULE_DOT", "RULE_COMMA", "RULE_LINKIN", "RULE_WHILE", "RULE_PERCENT_SIGN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'"
    };
    public static final int RULE_RCURLY=9;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_CHOICE=15;
    public static final int RULE_COLON=23;
    public static final int RULE_ID=17;
    public static final int RULE_LINKIN=26;
    public static final int RULE_WHILE=27;
    public static final int RULE_STRING=29;
    public static final int RULE_LPAREN=10;
    public static final int RULE_LSQUARE=20;
    public static final int RULE_SEMICOLON=13;
    public static final int RULE_REAL=19;
    public static final int RULE_PERCENT_SIGN=28;
    public static final int RULE_COMMA=25;
    public static final int RULE_RPAREN=11;
    public static final int RULE_ASSIGN=14;
    public static final int RULE_ASTERISK=6;
    public static final int RULE_DOT=24;
    public static final int RULE_MINUS=5;
    public static final int RULE_ARROW=22;
    public static final int RULE_VERT=12;
    public static final int RULE_WS=32;
    public static final int EOF=-1;
    public static final int RULE_INT=18;
    public static final int RULE_RSQUARE=21;
    public static final int RULE_DIVIDE=7;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_SL_COMMENT=31;
    public static final int RULE_DECREMENT=16;
    public static final int RULE_PLUS=4;
    public static final int RULE_LCURLY=8;

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


    // $ANTLR start rule__Process__Alternatives
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:397:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:401:1: ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) )
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
                    new NoViableAltException("397:1: rule__Process__Alternatives : ( ( ( rule__Process__Group_0__0 ) ) | ( ( rule__Process__Group_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:402:1: ( ( rule__Process__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:402:1: ( ( rule__Process__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:403:1: ( rule__Process__Group_0__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:404:1: ( rule__Process__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:404:2: rule__Process__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives790);
                    rule__Process__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:408:6: ( ( rule__Process__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:408:6: ( ( rule__Process__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:409:1: ( rule__Process__Group_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:410:1: ( rule__Process__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:410:2: rule__Process__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives808);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:419:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) );
    public final void rule__BasicStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:423:1: ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LCURLY||LA2_0==RULE_LPAREN) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                case RULE_ASSIGN:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("419:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) );", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("419:1: rule__BasicStatement__Alternatives : ( ( ( rule__BasicStatement__Group_0__0 ) ) | ( ( rule__BasicStatement__Group_1__0 ) ) | ( ( rule__BasicStatement__Group_2__0 ) ) | ( ( rule__BasicStatement__Group_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:424:1: ( ( rule__BasicStatement__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:424:1: ( ( rule__BasicStatement__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:425:1: ( rule__BasicStatement__Group_0__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:426:1: ( rule__BasicStatement__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:426:2: rule__BasicStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives841);
                    rule__BasicStatement__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:430:6: ( ( rule__BasicStatement__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:430:6: ( ( rule__BasicStatement__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:431:1: ( rule__BasicStatement__Group_1__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:432:1: ( rule__BasicStatement__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:432:2: rule__BasicStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives859);
                    rule__BasicStatement__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:436:6: ( ( rule__BasicStatement__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:436:6: ( ( rule__BasicStatement__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:437:1: ( rule__BasicStatement__Group_2__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:438:1: ( rule__BasicStatement__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:438:2: rule__BasicStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives877);
                    rule__BasicStatement__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:442:6: ( ( rule__BasicStatement__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:442:6: ( ( rule__BasicStatement__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:443:1: ( rule__BasicStatement__Group_3__0 )
                    {
                     before(grammarAccess.getBasicStatementAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:444:1: ( rule__BasicStatement__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:444:2: rule__BasicStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BasicStatement__Group_3__0_in_rule__BasicStatement__Alternatives895);
                    rule__BasicStatement__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBasicStatementAccess().getGroup_3()); 

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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:453:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );
    public final void rule__Expression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:457:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) )
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
                    new NoViableAltException("453:1: rule__Expression__OpAlternatives_1_1_0 : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_ASTERISK ) | ( RULE_DIVIDE ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:458:1: ( RULE_PLUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:458:1: ( RULE_PLUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:459:1: RULE_PLUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_0928); 
                     after(grammarAccess.getExpressionAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:464:6: ( RULE_MINUS )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:464:6: ( RULE_MINUS )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:465:1: RULE_MINUS
                    {
                     before(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_0945); 
                     after(grammarAccess.getExpressionAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:470:6: ( RULE_ASTERISK )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:470:6: ( RULE_ASTERISK )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:471:1: RULE_ASTERISK
                    {
                     before(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 
                    match(input,RULE_ASTERISK,FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_0962); 
                     after(grammarAccess.getExpressionAccess().getOpASTERISKTerminalRuleCall_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:476:6: ( RULE_DIVIDE )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:476:6: ( RULE_DIVIDE )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:477:1: RULE_DIVIDE
                    {
                     before(grammarAccess.getExpressionAccess().getOpDIVIDETerminalRuleCall_1_1_0_3()); 
                    match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_0979); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:487:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:491:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) )
            int alt4=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("487:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:492:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:492:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:493:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:494:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:494:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1011);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:498:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:498:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:499:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:500:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:500:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1029);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:504:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:504:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:505:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:506:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:506:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1047);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:510:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:510:6: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:511:1: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:512:1: ( rule__TerminalExpression__Group_3__0 )
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:512:2: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1065);
                    rule__TerminalExpression__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

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


    // $ANTLR start rule__Program__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:523:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:527:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:528:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01096);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01099);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:535:1: rule__Program__Group__0__Impl : ( 'main' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:539:1: ( ( 'main' ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:540:1: ( 'main' )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:540:1: ( 'main' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:541:1: 'main'
            {
             before(grammarAccess.getProgramAccess().getMainKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Program__Group__0__Impl1127); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:554:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:558:1: ( rule__Program__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:559:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11158);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:565:1: rule__Program__Group__1__Impl : ( ( rule__Program__MainAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:569:1: ( ( ( rule__Program__MainAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:570:1: ( ( rule__Program__MainAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:570:1: ( ( rule__Program__MainAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:571:1: ( rule__Program__MainAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:572:1: ( rule__Program__MainAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:572:2: rule__Program__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1185);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:586:1: rule__MainProcess__Group__0 : rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 ;
    public final void rule__MainProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:590:1: ( rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:591:2: rule__MainProcess__Group__0__Impl rule__MainProcess__Group__1
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01219);
            rule__MainProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01222);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:598:1: rule__MainProcess__Group__0__Impl : ( () ) ;
    public final void rule__MainProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:602:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:603:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:603:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:604:1: ()
            {
             before(grammarAccess.getMainProcessAccess().getOLSyntaxNodeAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:605:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:607:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:617:1: rule__MainProcess__Group__1 : rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 ;
    public final void rule__MainProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:621:1: ( rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:622:2: rule__MainProcess__Group__1__Impl rule__MainProcess__Group__2
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11280);
            rule__MainProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11283);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:629:1: rule__MainProcess__Group__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__MainProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:633:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:634:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:634:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:635:1: RULE_LCURLY
            {
             before(grammarAccess.getMainProcessAccess().getLCURLYTerminalRuleCall_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1310); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:646:1: rule__MainProcess__Group__2 : rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 ;
    public final void rule__MainProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:650:1: ( rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:651:2: rule__MainProcess__Group__2__Impl rule__MainProcess__Group__3
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21339);
            rule__MainProcess__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21342);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:658:1: rule__MainProcess__Group__2__Impl : ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) ;
    public final void rule__MainProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:662:1: ( ( ( rule__MainProcess__ParallelStatementAssignment_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:663:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:663:1: ( ( rule__MainProcess__ParallelStatementAssignment_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:664:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementAssignment_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:665:1: ( rule__MainProcess__ParallelStatementAssignment_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:665:2: rule__MainProcess__ParallelStatementAssignment_2
            {
            pushFollow(FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1369);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:675:1: rule__MainProcess__Group__3 : rule__MainProcess__Group__3__Impl ;
    public final void rule__MainProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:679:1: ( rule__MainProcess__Group__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:680:2: rule__MainProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31399);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:686:1: rule__MainProcess__Group__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__MainProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:690:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:691:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:691:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:692:1: RULE_RCURLY
            {
             before(grammarAccess.getMainProcessAccess().getRCURLYTerminalRuleCall_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1426); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:711:1: rule__Process__Group_0__0 : rule__Process__Group_0__0__Impl rule__Process__Group_0__1 ;
    public final void rule__Process__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:715:1: ( rule__Process__Group_0__0__Impl rule__Process__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:716:2: rule__Process__Group_0__0__Impl rule__Process__Group_0__1
            {
            pushFollow(FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01463);
            rule__Process__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01466);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:723:1: rule__Process__Group_0__0__Impl : ( () ) ;
    public final void rule__Process__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:727:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:728:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:728:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:729:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:730:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:732:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:742:1: rule__Process__Group_0__1 : rule__Process__Group_0__1__Impl rule__Process__Group_0__2 ;
    public final void rule__Process__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:746:1: ( rule__Process__Group_0__1__Impl rule__Process__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:747:2: rule__Process__Group_0__1__Impl rule__Process__Group_0__2
            {
            pushFollow(FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11524);
            rule__Process__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11527);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:754:1: rule__Process__Group_0__1__Impl : ( RULE_LCURLY ) ;
    public final void rule__Process__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:758:1: ( ( RULE_LCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:759:1: ( RULE_LCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:759:1: ( RULE_LCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:760:1: RULE_LCURLY
            {
             before(grammarAccess.getProcessAccess().getLCURLYTerminalRuleCall_0_1()); 
            match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1554); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:771:1: rule__Process__Group_0__2 : rule__Process__Group_0__2__Impl rule__Process__Group_0__3 ;
    public final void rule__Process__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:775:1: ( rule__Process__Group_0__2__Impl rule__Process__Group_0__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:776:2: rule__Process__Group_0__2__Impl rule__Process__Group_0__3
            {
            pushFollow(FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__21583);
            rule__Process__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__21586);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:783:1: rule__Process__Group_0__2__Impl : ( ( rule__Process__ChildrenAssignment_0_2 ) ) ;
    public final void rule__Process__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:787:1: ( ( ( rule__Process__ChildrenAssignment_0_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:788:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:788:1: ( ( rule__Process__ChildrenAssignment_0_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:789:1: ( rule__Process__ChildrenAssignment_0_2 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_0_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:790:1: ( rule__Process__ChildrenAssignment_0_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:790:2: rule__Process__ChildrenAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl1613);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:800:1: rule__Process__Group_0__3 : rule__Process__Group_0__3__Impl ;
    public final void rule__Process__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:804:1: ( rule__Process__Group_0__3__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:805:2: rule__Process__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__31643);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:811:1: rule__Process__Group_0__3__Impl : ( RULE_RCURLY ) ;
    public final void rule__Process__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:815:1: ( ( RULE_RCURLY ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:816:1: ( RULE_RCURLY )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:816:1: ( RULE_RCURLY )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:817:1: RULE_RCURLY
            {
             before(grammarAccess.getProcessAccess().getRCURLYTerminalRuleCall_0_3()); 
            match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl1670); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:836:1: rule__Process__Group_1__0 : rule__Process__Group_1__0__Impl rule__Process__Group_1__1 ;
    public final void rule__Process__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:840:1: ( rule__Process__Group_1__0__Impl rule__Process__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:841:2: rule__Process__Group_1__0__Impl rule__Process__Group_1__1
            {
            pushFollow(FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__01707);
            rule__Process__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__01710);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:848:1: rule__Process__Group_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Process__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:852:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:853:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:853:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:854:1: RULE_LPAREN
            {
             before(grammarAccess.getProcessAccess().getLPARENTerminalRuleCall_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl1737); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:865:1: rule__Process__Group_1__1 : rule__Process__Group_1__1__Impl rule__Process__Group_1__2 ;
    public final void rule__Process__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:869:1: ( rule__Process__Group_1__1__Impl rule__Process__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:870:2: rule__Process__Group_1__1__Impl rule__Process__Group_1__2
            {
            pushFollow(FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__11766);
            rule__Process__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__11769);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:877:1: rule__Process__Group_1__1__Impl : ( ( rule__Process__ChildrenAssignment_1_1 ) ) ;
    public final void rule__Process__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:881:1: ( ( ( rule__Process__ChildrenAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:882:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:882:1: ( ( rule__Process__ChildrenAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:883:1: ( rule__Process__ChildrenAssignment_1_1 )
            {
             before(grammarAccess.getProcessAccess().getChildrenAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:884:1: ( rule__Process__ChildrenAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:884:2: rule__Process__ChildrenAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl1796);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:894:1: rule__Process__Group_1__2 : rule__Process__Group_1__2__Impl ;
    public final void rule__Process__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:898:1: ( rule__Process__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:899:2: rule__Process__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__21826);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:905:1: rule__Process__Group_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Process__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:909:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:910:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:910:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:911:1: RULE_RPAREN
            {
             before(grammarAccess.getProcessAccess().getRPARENTerminalRuleCall_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl1853); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:928:1: rule__ParallelStatement__Group__0 : rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 ;
    public final void rule__ParallelStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:932:1: ( rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:933:2: rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__01888);
            rule__ParallelStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__01891);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:940:1: rule__ParallelStatement__Group__0__Impl : ( () ) ;
    public final void rule__ParallelStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:944:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:945:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:945:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:946:1: ()
            {
             before(grammarAccess.getParallelStatementAccess().getParallelStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:947:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:949:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:959:1: rule__ParallelStatement__Group__1 : rule__ParallelStatement__Group__1__Impl ;
    public final void rule__ParallelStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:963:1: ( rule__ParallelStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:964:2: rule__ParallelStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__11949);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:970:1: rule__ParallelStatement__Group__1__Impl : ( ( rule__ParallelStatement__Group_1__0 ) ) ;
    public final void rule__ParallelStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:974:1: ( ( ( rule__ParallelStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:975:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:975:1: ( ( rule__ParallelStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:976:1: ( rule__ParallelStatement__Group_1__0 )
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:977:1: ( rule__ParallelStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:977:2: rule__ParallelStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl1976);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:991:1: rule__ParallelStatement__Group_1__0 : rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 ;
    public final void rule__ParallelStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:995:1: ( rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:996:2: rule__ParallelStatement__Group_1__0__Impl rule__ParallelStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02010);
            rule__ParallelStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02013);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1003:1: rule__ParallelStatement__Group_1__0__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__ParallelStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1007:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1008:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1008:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1009:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1010:1: ( rule__ParallelStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1010:2: rule__ParallelStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2040);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1020:1: rule__ParallelStatement__Group_1__1 : rule__ParallelStatement__Group_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1024:1: ( rule__ParallelStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1025:2: rule__ParallelStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12070);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1031:1: rule__ParallelStatement__Group_1__1__Impl : ( ( rule__ParallelStatement__Group_1_1__0 )* ) ;
    public final void rule__ParallelStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1035:1: ( ( ( rule__ParallelStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1036:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1036:1: ( ( rule__ParallelStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1037:1: ( rule__ParallelStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getParallelStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1038:1: ( rule__ParallelStatement__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_VERT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1038:2: rule__ParallelStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2097);
            	    rule__ParallelStatement__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1052:1: rule__ParallelStatement__Group_1_1__0 : rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 ;
    public final void rule__ParallelStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1056:1: ( rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1057:2: rule__ParallelStatement__Group_1_1__0__Impl rule__ParallelStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02132);
            rule__ParallelStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02135);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1064:1: rule__ParallelStatement__Group_1_1__0__Impl : ( RULE_VERT ) ;
    public final void rule__ParallelStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1068:1: ( ( RULE_VERT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1069:1: ( RULE_VERT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1069:1: ( RULE_VERT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1070:1: RULE_VERT
            {
             before(grammarAccess.getParallelStatementAccess().getVERTTerminalRuleCall_1_1_0()); 
            match(input,RULE_VERT,FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2162); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1081:1: rule__ParallelStatement__Group_1_1__1 : rule__ParallelStatement__Group_1_1__1__Impl ;
    public final void rule__ParallelStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1085:1: ( rule__ParallelStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1086:2: rule__ParallelStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12191);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1092:1: rule__ParallelStatement__Group_1_1__1__Impl : ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__ParallelStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1096:1: ( ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1097:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1097:1: ( ( rule__ParallelStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1098:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1099:1: ( rule__ParallelStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1099:2: rule__ParallelStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2218);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1113:1: rule__SequenceStatement__Group__0 : rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 ;
    public final void rule__SequenceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1117:1: ( rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1118:2: rule__SequenceStatement__Group__0__Impl rule__SequenceStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02252);
            rule__SequenceStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02255);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1125:1: rule__SequenceStatement__Group__0__Impl : ( () ) ;
    public final void rule__SequenceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1129:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1130:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1130:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1131:1: ()
            {
             before(grammarAccess.getSequenceStatementAccess().getSequenceStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1132:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1134:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1144:1: rule__SequenceStatement__Group__1 : rule__SequenceStatement__Group__1__Impl ;
    public final void rule__SequenceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1148:1: ( rule__SequenceStatement__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1149:2: rule__SequenceStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12313);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1155:1: rule__SequenceStatement__Group__1__Impl : ( ( rule__SequenceStatement__Group_1__0 ) ) ;
    public final void rule__SequenceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1159:1: ( ( ( rule__SequenceStatement__Group_1__0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1160:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1160:1: ( ( rule__SequenceStatement__Group_1__0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1161:1: ( rule__SequenceStatement__Group_1__0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1162:1: ( rule__SequenceStatement__Group_1__0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1162:2: rule__SequenceStatement__Group_1__0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2340);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1176:1: rule__SequenceStatement__Group_1__0 : rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 ;
    public final void rule__SequenceStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1180:1: ( rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1181:2: rule__SequenceStatement__Group_1__0__Impl rule__SequenceStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02374);
            rule__SequenceStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02377);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1188:1: rule__SequenceStatement__Group_1__0__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) ;
    public final void rule__SequenceStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1192:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1193:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1193:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1194:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1195:1: ( rule__SequenceStatement__ChildrenAssignment_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1195:2: rule__SequenceStatement__ChildrenAssignment_1_0
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2404);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1205:1: rule__SequenceStatement__Group_1__1 : rule__SequenceStatement__Group_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1209:1: ( rule__SequenceStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1210:2: rule__SequenceStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12434);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1216:1: rule__SequenceStatement__Group_1__1__Impl : ( ( rule__SequenceStatement__Group_1_1__0 )* ) ;
    public final void rule__SequenceStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1220:1: ( ( ( rule__SequenceStatement__Group_1_1__0 )* ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1221:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1221:1: ( ( rule__SequenceStatement__Group_1_1__0 )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1222:1: ( rule__SequenceStatement__Group_1_1__0 )*
            {
             before(grammarAccess.getSequenceStatementAccess().getGroup_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1223:1: ( rule__SequenceStatement__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SEMICOLON) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1223:2: rule__SequenceStatement__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2461);
            	    rule__SequenceStatement__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1237:1: rule__SequenceStatement__Group_1_1__0 : rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 ;
    public final void rule__SequenceStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1241:1: ( rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1242:2: rule__SequenceStatement__Group_1_1__0__Impl rule__SequenceStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02496);
            rule__SequenceStatement__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02499);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1249:1: rule__SequenceStatement__Group_1_1__0__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__SequenceStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1253:1: ( ( RULE_SEMICOLON ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1254:1: ( RULE_SEMICOLON )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1254:1: ( RULE_SEMICOLON )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1255:1: RULE_SEMICOLON
            {
             before(grammarAccess.getSequenceStatementAccess().getSEMICOLONTerminalRuleCall_1_1_0()); 
            match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2526); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1266:1: rule__SequenceStatement__Group_1_1__1 : rule__SequenceStatement__Group_1_1__1__Impl ;
    public final void rule__SequenceStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1270:1: ( rule__SequenceStatement__Group_1_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1271:2: rule__SequenceStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12555);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1277:1: rule__SequenceStatement__Group_1_1__1__Impl : ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) ;
    public final void rule__SequenceStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1281:1: ( ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1282:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1282:1: ( ( rule__SequenceStatement__ChildrenAssignment_1_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1283:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenAssignment_1_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1284:1: ( rule__SequenceStatement__ChildrenAssignment_1_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1284:2: rule__SequenceStatement__ChildrenAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl2582);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1298:1: rule__BasicStatement__Group_0__0 : rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 ;
    public final void rule__BasicStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1302:1: ( rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1303:2: rule__BasicStatement__Group_0__0__Impl rule__BasicStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__02616);
            rule__BasicStatement__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__02619);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1310:1: rule__BasicStatement__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1314:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1315:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1315:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1316:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAction_0_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1317:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1319:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1329:1: rule__BasicStatement__Group_0__1 : rule__BasicStatement__Group_0__1__Impl ;
    public final void rule__BasicStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1333:1: ( rule__BasicStatement__Group_0__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1334:2: rule__BasicStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__12677);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1340:1: rule__BasicStatement__Group_0__1__Impl : ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) ;
    public final void rule__BasicStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1344:1: ( ( ( rule__BasicStatement__ProcessAssignment_0_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1345:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1345:1: ( ( rule__BasicStatement__ProcessAssignment_0_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1346:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getProcessAssignment_0_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1347:1: ( rule__BasicStatement__ProcessAssignment_0_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1347:2: rule__BasicStatement__ProcessAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl2704);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1361:1: rule__BasicStatement__Group_1__0 : rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 ;
    public final void rule__BasicStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1365:1: ( rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1366:2: rule__BasicStatement__Group_1__0__Impl rule__BasicStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__02738);
            rule__BasicStatement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__02741);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1373:1: rule__BasicStatement__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1377:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1378:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1378:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1379:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1380:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1382:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1392:1: rule__BasicStatement__Group_1__1 : rule__BasicStatement__Group_1__1__Impl ;
    public final void rule__BasicStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1396:1: ( rule__BasicStatement__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1397:2: rule__BasicStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__12799);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1403:1: rule__BasicStatement__Group_1__1__Impl : ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) ;
    public final void rule__BasicStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1407:1: ( ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1408:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1408:1: ( ( rule__BasicStatement__AssignStatementAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1409:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1410:1: ( rule__BasicStatement__AssignStatementAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1410:2: rule__BasicStatement__AssignStatementAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl2826);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1424:1: rule__BasicStatement__Group_2__0 : rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 ;
    public final void rule__BasicStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1428:1: ( rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1429:2: rule__BasicStatement__Group_2__0__Impl rule__BasicStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__02860);
            rule__BasicStatement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__02863);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1436:1: rule__BasicStatement__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1440:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1441:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1441:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1442:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1443:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1445:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1455:1: rule__BasicStatement__Group_2__1 : rule__BasicStatement__Group_2__1__Impl ;
    public final void rule__BasicStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1459:1: ( rule__BasicStatement__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1460:2: rule__BasicStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__12921);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1466:1: rule__BasicStatement__Group_2__1__Impl : ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) ) ;
    public final void rule__BasicStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1470:1: ( ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1471:1: ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1471:1: ( ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1472:1: ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1473:1: ( rule__BasicStatement__PostIncrementStatementAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1473:2: rule__BasicStatement__PostIncrementStatementAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__PostIncrementStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl2948);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1487:1: rule__BasicStatement__Group_3__0 : rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1 ;
    public final void rule__BasicStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1491:1: ( rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1492:2: rule__BasicStatement__Group_3__0__Impl rule__BasicStatement__Group_3__1
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_3__0__Impl_in_rule__BasicStatement__Group_3__02982);
            rule__BasicStatement__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BasicStatement__Group_3__1_in_rule__BasicStatement__Group_3__02985);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1499:1: rule__BasicStatement__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1503:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1504:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1504:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1505:1: ()
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1506:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1508:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1518:1: rule__BasicStatement__Group_3__1 : rule__BasicStatement__Group_3__1__Impl ;
    public final void rule__BasicStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1522:1: ( rule__BasicStatement__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1523:2: rule__BasicStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicStatement__Group_3__1__Impl_in_rule__BasicStatement__Group_3__13043);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1529:1: rule__BasicStatement__Group_3__1__Impl : ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) ) ;
    public final void rule__BasicStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1533:1: ( ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1534:1: ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1534:1: ( ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1535:1: ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 )
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1536:1: ( rule__BasicStatement__PostDecrementStatementAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1536:2: rule__BasicStatement__PostDecrementStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BasicStatement__PostDecrementStatementAssignment_3_1_in_rule__BasicStatement__Group_3__1__Impl3070);
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


    // $ANTLR start rule__AssignStatement__Group__0
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1550:1: rule__AssignStatement__Group__0 : rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 ;
    public final void rule__AssignStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1554:1: ( rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1555:2: rule__AssignStatement__Group__0__Impl rule__AssignStatement__Group__1
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03104);
            rule__AssignStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03107);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1562:1: rule__AssignStatement__Group__0__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1566:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1567:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1567:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1568:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getAssignStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1569:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1571:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1581:1: rule__AssignStatement__Group__1 : rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 ;
    public final void rule__AssignStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1585:1: ( rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1586:2: rule__AssignStatement__Group__1__Impl rule__AssignStatement__Group__2
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13165);
            rule__AssignStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13168);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1593:1: rule__AssignStatement__Group__1__Impl : ( ( rule__AssignStatement__NameAssignment_1 ) ) ;
    public final void rule__AssignStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1597:1: ( ( ( rule__AssignStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1598:1: ( ( rule__AssignStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1598:1: ( ( rule__AssignStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1599:1: ( rule__AssignStatement__NameAssignment_1 )
            {
             before(grammarAccess.getAssignStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1600:1: ( rule__AssignStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1600:2: rule__AssignStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AssignStatement__NameAssignment_1_in_rule__AssignStatement__Group__1__Impl3195);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1610:1: rule__AssignStatement__Group__2 : rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 ;
    public final void rule__AssignStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1614:1: ( rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1615:2: rule__AssignStatement__Group__2__Impl rule__AssignStatement__Group__3
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23225);
            rule__AssignStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23228);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1622:1: rule__AssignStatement__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__AssignStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1626:1: ( ( RULE_ASSIGN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1627:1: ( RULE_ASSIGN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1627:1: ( RULE_ASSIGN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1628:1: RULE_ASSIGN
            {
             before(grammarAccess.getAssignStatementAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3255); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1639:1: rule__AssignStatement__Group__3 : rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4 ;
    public final void rule__AssignStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1643:1: ( rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1644:2: rule__AssignStatement__Group__3__Impl rule__AssignStatement__Group__4
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33284);
            rule__AssignStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignStatement__Group__4_in_rule__AssignStatement__Group__33287);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1651:1: rule__AssignStatement__Group__3__Impl : ( () ) ;
    public final void rule__AssignStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1655:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1656:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1656:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1657:1: ()
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionAction_3()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1658:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1660:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1670:1: rule__AssignStatement__Group__4 : rule__AssignStatement__Group__4__Impl ;
    public final void rule__AssignStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1674:1: ( rule__AssignStatement__Group__4__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1675:2: rule__AssignStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssignStatement__Group__4__Impl_in_rule__AssignStatement__Group__43345);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1681:1: rule__AssignStatement__Group__4__Impl : ( ( rule__AssignStatement__ExpressionAssignment_4 ) ) ;
    public final void rule__AssignStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1685:1: ( ( ( rule__AssignStatement__ExpressionAssignment_4 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1686:1: ( ( rule__AssignStatement__ExpressionAssignment_4 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1686:1: ( ( rule__AssignStatement__ExpressionAssignment_4 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1687:1: ( rule__AssignStatement__ExpressionAssignment_4 )
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionAssignment_4()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1688:1: ( rule__AssignStatement__ExpressionAssignment_4 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1688:2: rule__AssignStatement__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__AssignStatement__ExpressionAssignment_4_in_rule__AssignStatement__Group__4__Impl3372);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1708:1: rule__PostIncrementStatement__Group__0 : rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1 ;
    public final void rule__PostIncrementStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1712:1: ( rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1713:2: rule__PostIncrementStatement__Group__0__Impl rule__PostIncrementStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__0__Impl_in_rule__PostIncrementStatement__Group__03412);
            rule__PostIncrementStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__1_in_rule__PostIncrementStatement__Group__03415);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1720:1: rule__PostIncrementStatement__Group__0__Impl : ( () ) ;
    public final void rule__PostIncrementStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1724:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1725:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1725:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1726:1: ()
            {
             before(grammarAccess.getPostIncrementStatementAccess().getPostIncrementStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1727:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1729:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1739:1: rule__PostIncrementStatement__Group__1 : rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2 ;
    public final void rule__PostIncrementStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1743:1: ( rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1744:2: rule__PostIncrementStatement__Group__1__Impl rule__PostIncrementStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__1__Impl_in_rule__PostIncrementStatement__Group__13473);
            rule__PostIncrementStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__2_in_rule__PostIncrementStatement__Group__13476);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1751:1: rule__PostIncrementStatement__Group__1__Impl : ( ( rule__PostIncrementStatement__NameAssignment_1 ) ) ;
    public final void rule__PostIncrementStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1755:1: ( ( ( rule__PostIncrementStatement__NameAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1756:1: ( ( rule__PostIncrementStatement__NameAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1756:1: ( ( rule__PostIncrementStatement__NameAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1757:1: ( rule__PostIncrementStatement__NameAssignment_1 )
            {
             before(grammarAccess.getPostIncrementStatementAccess().getNameAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1758:1: ( rule__PostIncrementStatement__NameAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1758:2: rule__PostIncrementStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__NameAssignment_1_in_rule__PostIncrementStatement__Group__1__Impl3503);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1768:1: rule__PostIncrementStatement__Group__2 : rule__PostIncrementStatement__Group__2__Impl ;
    public final void rule__PostIncrementStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1772:1: ( rule__PostIncrementStatement__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1773:2: rule__PostIncrementStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostIncrementStatement__Group__2__Impl_in_rule__PostIncrementStatement__Group__23533);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1779:1: rule__PostIncrementStatement__Group__2__Impl : ( RULE_CHOICE ) ;
    public final void rule__PostIncrementStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1783:1: ( ( RULE_CHOICE ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1784:1: ( RULE_CHOICE )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1784:1: ( RULE_CHOICE )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1785:1: RULE_CHOICE
            {
             before(grammarAccess.getPostIncrementStatementAccess().getCHOICETerminalRuleCall_2()); 
            match(input,RULE_CHOICE,FOLLOW_RULE_CHOICE_in_rule__PostIncrementStatement__Group__2__Impl3560); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1802:1: rule__PostDecrementStatement__Group__0 : rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1 ;
    public final void rule__PostDecrementStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1806:1: ( rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1807:2: rule__PostDecrementStatement__Group__0__Impl rule__PostDecrementStatement__Group__1
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__0__Impl_in_rule__PostDecrementStatement__Group__03595);
            rule__PostDecrementStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__1_in_rule__PostDecrementStatement__Group__03598);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1814:1: rule__PostDecrementStatement__Group__0__Impl : ( () ) ;
    public final void rule__PostDecrementStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1818:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1819:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1819:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1820:1: ()
            {
             before(grammarAccess.getPostDecrementStatementAccess().getPostDecrementStatementAction_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1821:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1823:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1833:1: rule__PostDecrementStatement__Group__1 : rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2 ;
    public final void rule__PostDecrementStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1837:1: ( rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1838:2: rule__PostDecrementStatement__Group__1__Impl rule__PostDecrementStatement__Group__2
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__1__Impl_in_rule__PostDecrementStatement__Group__13656);
            rule__PostDecrementStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__2_in_rule__PostDecrementStatement__Group__13659);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1845:1: rule__PostDecrementStatement__Group__1__Impl : ( ( rule__PostDecrementStatement__NaemAssignment_1 ) ) ;
    public final void rule__PostDecrementStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1849:1: ( ( ( rule__PostDecrementStatement__NaemAssignment_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1850:1: ( ( rule__PostDecrementStatement__NaemAssignment_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1850:1: ( ( rule__PostDecrementStatement__NaemAssignment_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1851:1: ( rule__PostDecrementStatement__NaemAssignment_1 )
            {
             before(grammarAccess.getPostDecrementStatementAccess().getNaemAssignment_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1852:1: ( rule__PostDecrementStatement__NaemAssignment_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1852:2: rule__PostDecrementStatement__NaemAssignment_1
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__NaemAssignment_1_in_rule__PostDecrementStatement__Group__1__Impl3686);
            rule__PostDecrementStatement__NaemAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPostDecrementStatementAccess().getNaemAssignment_1()); 

            }


            }

        }
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1862:1: rule__PostDecrementStatement__Group__2 : rule__PostDecrementStatement__Group__2__Impl ;
    public final void rule__PostDecrementStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1866:1: ( rule__PostDecrementStatement__Group__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1867:2: rule__PostDecrementStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostDecrementStatement__Group__2__Impl_in_rule__PostDecrementStatement__Group__23716);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1873:1: rule__PostDecrementStatement__Group__2__Impl : ( RULE_DECREMENT ) ;
    public final void rule__PostDecrementStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1877:1: ( ( RULE_DECREMENT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1878:1: ( RULE_DECREMENT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1878:1: ( RULE_DECREMENT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1879:1: RULE_DECREMENT
            {
             before(grammarAccess.getPostDecrementStatementAccess().getDECREMENTTerminalRuleCall_2()); 
            match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_rule__PostDecrementStatement__Group__2__Impl3743); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1896:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1900:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1901:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03778);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03781);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1908:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1912:1: ( ( ruleTerminalExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1913:1: ( ruleTerminalExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1913:1: ( ruleTerminalExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1914:1: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl3808);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1925:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1929:1: ( rule__Expression__Group__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1930:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13837);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1936:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1940:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1941:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1941:1: ( ( rule__Expression__Group_1__0 )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1942:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1943:1: ( rule__Expression__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_PLUS && LA7_0<=RULE_DIVIDE)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1943:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3864);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1957:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1961:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1962:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03899);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03902);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1969:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1973:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1974:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1974:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1975:1: ()
            {
             before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1976:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1978:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1988:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1992:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1993:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13960);
            rule__Expression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__13963);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2000:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2004:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2005:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2005:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2006:1: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2007:1: ( rule__Expression__OpAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2007:2: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl3990);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2017:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2021:1: ( rule__Expression__Group_1__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2022:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24020);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2028:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2032:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2033:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2033:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2034:1: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2035:1: ( rule__Expression__RightAssignment_1_2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2035:2: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4047);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2051:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2055:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2056:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04083);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04086);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2063:1: rule__TerminalExpression__Group_0__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2067:1: ( ( RULE_LPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2068:1: ( RULE_LPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2068:1: ( RULE_LPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2069:1: RULE_LPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4113); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2080:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2084:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2085:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14142);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14145);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2092:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2096:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2097:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2097:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2098:1: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4172);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2109:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2113:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2114:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24201);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2120:1: rule__TerminalExpression__Group_0__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2124:1: ( ( RULE_RPAREN ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2125:1: ( RULE_RPAREN )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2125:1: ( RULE_RPAREN )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2126:1: RULE_RPAREN
            {
             before(grammarAccess.getTerminalExpressionAccess().getRPARENTerminalRuleCall_0_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4228); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2143:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2147:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2148:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04263);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04266);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2155:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2159:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2160:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2160:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2161:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2162:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2164:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2174:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2178:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2179:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14324);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2185:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2189:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2190:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2190:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2191:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2192:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2192:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4351);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2206:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2210:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2211:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04385);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04388);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2218:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2222:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2223:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2223:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2224:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_2_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2225:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2227:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2237:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2241:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2242:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14446);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2248:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2252:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2253:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2253:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2254:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2255:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2255:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4473);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2269:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2273:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2274:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__04507);
            rule__TerminalExpression__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__04510);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2281:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2285:1: ( ( () ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2286:1: ( () )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2286:1: ( () )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2287:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringAction_3_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2288:1: ()
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2290:1: 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2300:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2304:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2305:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__14568);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2311:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2315:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2316:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2316:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2317:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2318:1: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2318:2: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl4595);
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


    // $ANTLR start rule__Program__MainAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2333:1: rule__Program__MainAssignment_1 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2337:1: ( ( ruleMain ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2338:1: ( ruleMain )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2338:1: ( ruleMain )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2339:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_14634);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2348:1: rule__Main__MainrocessAssignment : ( ruleMainProcess ) ;
    public final void rule__Main__MainrocessAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2352:1: ( ( ruleMainProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2353:1: ( ruleMainProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2353:1: ( ruleMainProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2354:1: ruleMainProcess
            {
             before(grammarAccess.getMainAccess().getMainrocessMainProcessParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment4665);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2363:1: rule__MainProcess__ParallelStatementAssignment_2 : ( ruleParallelStatement ) ;
    public final void rule__MainProcess__ParallelStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2367:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2368:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2368:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2369:1: ruleParallelStatement
            {
             before(grammarAccess.getMainProcessAccess().getParallelStatementParallelStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_24696);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2378:1: rule__Process__ChildrenAssignment_0_2 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2382:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2383:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2383:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2384:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_24727);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2393:1: rule__Process__ChildrenAssignment_1_1 : ( ruleParallelStatement ) ;
    public final void rule__Process__ChildrenAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2397:1: ( ( ruleParallelStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2398:1: ( ruleParallelStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2398:1: ( ruleParallelStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2399:1: ruleParallelStatement
            {
             before(grammarAccess.getProcessAccess().getChildrenParallelStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_14758);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2408:1: rule__ParallelStatement__ChildrenAssignment_1_0 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2412:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2413:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2413:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2414:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_04789);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2423:1: rule__ParallelStatement__ChildrenAssignment_1_1_1 : ( ruleSequenceStatement ) ;
    public final void rule__ParallelStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2427:1: ( ( ruleSequenceStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2428:1: ( ruleSequenceStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2428:1: ( ruleSequenceStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2429:1: ruleSequenceStatement
            {
             before(grammarAccess.getParallelStatementAccess().getChildrenSequenceStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_14820);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2438:1: rule__SequenceStatement__ChildrenAssignment_1_0 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2442:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2443:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2443:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2444:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_04851);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2453:1: rule__SequenceStatement__ChildrenAssignment_1_1_1 : ( ruleBasicStatement ) ;
    public final void rule__SequenceStatement__ChildrenAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2457:1: ( ( ruleBasicStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2458:1: ( ruleBasicStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2458:1: ( ruleBasicStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2459:1: ruleBasicStatement
            {
             before(grammarAccess.getSequenceStatementAccess().getChildrenBasicStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_14882);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2468:1: rule__BasicStatement__ProcessAssignment_0_1 : ( ruleProcess ) ;
    public final void rule__BasicStatement__ProcessAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2472:1: ( ( ruleProcess ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2473:1: ( ruleProcess )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2473:1: ( ruleProcess )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2474:1: ruleProcess
            {
             before(grammarAccess.getBasicStatementAccess().getProcessProcessParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_14913);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2483:1: rule__BasicStatement__AssignStatementAssignment_1_1 : ( ruleAssignStatement ) ;
    public final void rule__BasicStatement__AssignStatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2487:1: ( ( ruleAssignStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2488:1: ( ruleAssignStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2488:1: ( ruleAssignStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2489:1: ruleAssignStatement
            {
             before(grammarAccess.getBasicStatementAccess().getAssignStatementAssignStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_14944);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2498:1: rule__BasicStatement__PostIncrementStatementAssignment_2_1 : ( rulePostIncrementStatement ) ;
    public final void rule__BasicStatement__PostIncrementStatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2502:1: ( ( rulePostIncrementStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2503:1: ( rulePostIncrementStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2503:1: ( rulePostIncrementStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2504:1: rulePostIncrementStatement
            {
             before(grammarAccess.getBasicStatementAccess().getPostIncrementStatementPostIncrementStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePostIncrementStatement_in_rule__BasicStatement__PostIncrementStatementAssignment_2_14975);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2513:1: rule__BasicStatement__PostDecrementStatementAssignment_3_1 : ( rulePostDecrementStatement ) ;
    public final void rule__BasicStatement__PostDecrementStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2517:1: ( ( rulePostDecrementStatement ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2518:1: ( rulePostDecrementStatement )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2518:1: ( rulePostDecrementStatement )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2519:1: rulePostDecrementStatement
            {
             before(grammarAccess.getBasicStatementAccess().getPostDecrementStatementPostDecrementStatementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePostDecrementStatement_in_rule__BasicStatement__PostDecrementStatementAssignment_3_15006);
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


    // $ANTLR start rule__AssignStatement__NameAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2528:1: rule__AssignStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssignStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2532:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2533:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2533:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2534:1: RULE_ID
            {
             before(grammarAccess.getAssignStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssignStatement__NameAssignment_15037); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2543:1: rule__AssignStatement__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__AssignStatement__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2547:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2548:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2548:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2549:1: ruleExpression
            {
             before(grammarAccess.getAssignStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignStatement__ExpressionAssignment_45068);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2558:1: rule__PostIncrementStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostIncrementStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2562:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2563:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2563:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2564:1: RULE_ID
            {
             before(grammarAccess.getPostIncrementStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostIncrementStatement__NameAssignment_15099); 
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


    // $ANTLR start rule__PostDecrementStatement__NaemAssignment_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2573:1: rule__PostDecrementStatement__NaemAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostDecrementStatement__NaemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2577:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2578:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2578:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2579:1: RULE_ID
            {
             before(grammarAccess.getPostDecrementStatementAccess().getNaemIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostDecrementStatement__NaemAssignment_15130); 
             after(grammarAccess.getPostDecrementStatementAccess().getNaemIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostDecrementStatement__NaemAssignment_1


    // $ANTLR start rule__Expression__OpAssignment_1_1
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2588:1: rule__Expression__OpAssignment_1_1 : ( ( rule__Expression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2592:1: ( ( ( rule__Expression__OpAlternatives_1_1_0 ) ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2593:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2593:1: ( ( rule__Expression__OpAlternatives_1_1_0 ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2594:1: ( rule__Expression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2595:1: ( rule__Expression__OpAlternatives_1_1_0 )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2595:2: rule__Expression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_15161);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2604:1: rule__Expression__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2608:1: ( ( ruleExpression ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2609:1: ( ruleExpression )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2609:1: ( ruleExpression )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2610:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_25194);
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2619:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2623:1: ( ( RULE_INT ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2624:1: ( RULE_INT )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2624:1: ( RULE_INT )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2625:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_15225); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2634:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_REAL ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2638:1: ( ( RULE_REAL ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2639:1: ( RULE_REAL )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2639:1: ( RULE_REAL )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2640:1: RULE_REAL
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueREALTerminalRuleCall_2_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_15256); 
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
    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2649:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2653:1: ( ( RULE_ID ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2654:1: ( RULE_ID )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2654:1: ( RULE_ID )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:2655:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_3_15287); 
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
    public static final BitSet FOLLOW_rule__Process__Group_0__0_in_rule__Process__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0_in_rule__Process__Alternatives808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0_in_rule__BasicStatement__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0_in_rule__BasicStatement__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0_in_rule__BasicStatement__Alternatives877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__0_in_rule__BasicStatement__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__Expression__OpAlternatives_1_1_0928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__Expression__OpAlternatives_1_1_0945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASTERISK_in_rule__Expression__OpAlternatives_1_1_0962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_rule__Expression__OpAlternatives_1_1_0979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0_in_rule__TerminalExpression__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01096 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Program__Group__0__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_1_in_rule__Program__Group__1__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__0__Impl_in_rule__MainProcess__Group__01219 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1_in_rule__MainProcess__Group__01222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__1__Impl_in_rule__MainProcess__Group__11280 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2_in_rule__MainProcess__Group__11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__MainProcess__Group__1__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__2__Impl_in_rule__MainProcess__Group__21339 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3_in_rule__MainProcess__Group__21342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__ParallelStatementAssignment_2_in_rule__MainProcess__Group__2__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainProcess__Group__3__Impl_in_rule__MainProcess__Group__31399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__MainProcess__Group__3__Impl1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__0__Impl_in_rule__Process__Group_0__01463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1_in_rule__Process__Group_0__01466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__1__Impl_in_rule__Process__Group_0__11524 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2_in_rule__Process__Group_0__11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_rule__Process__Group_0__1__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__2__Impl_in_rule__Process__Group_0__21583 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3_in_rule__Process__Group_0__21586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_0_2_in_rule__Process__Group_0__2__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_0__3__Impl_in_rule__Process__Group_0__31643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_rule__Process__Group_0__3__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__0__Impl_in_rule__Process__Group_1__01707 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1_in_rule__Process__Group_1__01710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Process__Group_1__0__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__1__Impl_in_rule__Process__Group_1__11766 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2_in_rule__Process__Group_1__11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ChildrenAssignment_1_1_in_rule__Process__Group_1__1__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_1__2__Impl_in_rule__Process__Group_1__21826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Process__Group_1__2__Impl1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__0__Impl_in_rule__ParallelStatement__Group__01888 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1_in_rule__ParallelStatement__Group__01891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group__1__Impl_in_rule__ParallelStatement__Group__11949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0_in_rule__ParallelStatement__Group__1__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__0__Impl_in_rule__ParallelStatement__Group_1__02010 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1_in_rule__ParallelStatement__Group_1__02013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_0_in_rule__ParallelStatement__Group_1__0__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1__1__Impl_in_rule__ParallelStatement__Group_1__12070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0_in_rule__ParallelStatement__Group_1__1__Impl2097 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__0__Impl_in_rule__ParallelStatement__Group_1_1__02132 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1_in_rule__ParallelStatement__Group_1_1__02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERT_in_rule__ParallelStatement__Group_1_1__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__Group_1_1__1__Impl_in_rule__ParallelStatement__Group_1_1__12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStatement__ChildrenAssignment_1_1_1_in_rule__ParallelStatement__Group_1_1__1__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__0__Impl_in_rule__SequenceStatement__Group__02252 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1_in_rule__SequenceStatement__Group__02255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group__1__Impl_in_rule__SequenceStatement__Group__12313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0_in_rule__SequenceStatement__Group__1__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__0__Impl_in_rule__SequenceStatement__Group_1__02374 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1_in_rule__SequenceStatement__Group_1__02377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_0_in_rule__SequenceStatement__Group_1__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1__1__Impl_in_rule__SequenceStatement__Group_1__12434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0_in_rule__SequenceStatement__Group_1__1__Impl2461 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__0__Impl_in_rule__SequenceStatement__Group_1_1__02496 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1_in_rule__SequenceStatement__Group_1_1__02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rule__SequenceStatement__Group_1_1__0__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__Group_1_1__1__Impl_in_rule__SequenceStatement__Group_1_1__12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceStatement__ChildrenAssignment_1_1_1_in_rule__SequenceStatement__Group_1_1__1__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__0__Impl_in_rule__BasicStatement__Group_0__02616 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1_in_rule__BasicStatement__Group_0__02619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_0__1__Impl_in_rule__BasicStatement__Group_0__12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__ProcessAssignment_0_1_in_rule__BasicStatement__Group_0__1__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__0__Impl_in_rule__BasicStatement__Group_1__02738 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1_in_rule__BasicStatement__Group_1__02741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_1__1__Impl_in_rule__BasicStatement__Group_1__12799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__AssignStatementAssignment_1_1_in_rule__BasicStatement__Group_1__1__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__0__Impl_in_rule__BasicStatement__Group_2__02860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1_in_rule__BasicStatement__Group_2__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_2__1__Impl_in_rule__BasicStatement__Group_2__12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__PostIncrementStatementAssignment_2_1_in_rule__BasicStatement__Group_2__1__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__0__Impl_in_rule__BasicStatement__Group_3__02982 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__1_in_rule__BasicStatement__Group_3__02985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__Group_3__1__Impl_in_rule__BasicStatement__Group_3__13043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicStatement__PostDecrementStatementAssignment_3_1_in_rule__BasicStatement__Group_3__1__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__0__Impl_in_rule__AssignStatement__Group__03104 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1_in_rule__AssignStatement__Group__03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__1__Impl_in_rule__AssignStatement__Group__13165 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2_in_rule__AssignStatement__Group__13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__NameAssignment_1_in_rule__AssignStatement__Group__1__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__2__Impl_in_rule__AssignStatement__Group__23225 = new BitSet(new long[]{0x00000000000E0400L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3_in_rule__AssignStatement__Group__23228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__AssignStatement__Group__2__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__3__Impl_in_rule__AssignStatement__Group__33284 = new BitSet(new long[]{0x00000000000E0400L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__4_in_rule__AssignStatement__Group__33287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__Group__4__Impl_in_rule__AssignStatement__Group__43345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignStatement__ExpressionAssignment_4_in_rule__AssignStatement__Group__4__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__0__Impl_in_rule__PostIncrementStatement__Group__03412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__1_in_rule__PostIncrementStatement__Group__03415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__1__Impl_in_rule__PostIncrementStatement__Group__13473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__2_in_rule__PostIncrementStatement__Group__13476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__NameAssignment_1_in_rule__PostIncrementStatement__Group__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostIncrementStatement__Group__2__Impl_in_rule__PostIncrementStatement__Group__23533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHOICE_in_rule__PostIncrementStatement__Group__2__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__0__Impl_in_rule__PostDecrementStatement__Group__03595 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__1_in_rule__PostDecrementStatement__Group__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__1__Impl_in_rule__PostDecrementStatement__Group__13656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__2_in_rule__PostDecrementStatement__Group__13659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__NaemAssignment_1_in_rule__PostDecrementStatement__Group__1__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostDecrementStatement__Group__2__Impl_in_rule__PostDecrementStatement__Group__23716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_rule__PostDecrementStatement__Group__2__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03778 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Expression__Group__0__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__03899 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__03902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__13960 = new BitSet(new long[]{0x00000000000E0400L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_1_in_rule__Expression__Group_1__1__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_2_in_rule__Expression__Group_1__2__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__04083 = new BitSet(new long[]{0x00000000000E0400L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__TerminalExpression__Group_0__0__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__14142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2_in_rule__TerminalExpression__Group_0__14145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TerminalExpression__Group_0__1__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__2__Impl_in_rule__TerminalExpression__Group_0__24201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__TerminalExpression__Group_0__2__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__04263 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__04266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__14324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__04385 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__04388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__14446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__0__Impl_in_rule__TerminalExpression__Group_3__04507 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1_in_rule__TerminalExpression__Group_3__04510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_3__1__Impl_in_rule__TerminalExpression__Group_3__14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_3_1_in_rule__TerminalExpression__Group_3__1__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_14634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainProcess_in_rule__Main__MainrocessAssignment4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__MainProcess__ParallelStatementAssignment_24696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_0_24727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelStatement_in_rule__Process__ChildrenAssignment_1_14758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_04789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceStatement_in_rule__ParallelStatement__ChildrenAssignment_1_1_14820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_04851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicStatement_in_rule__SequenceStatement__ChildrenAssignment_1_1_14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__BasicStatement__ProcessAssignment_0_14913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStatement_in_rule__BasicStatement__AssignStatementAssignment_1_14944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostIncrementStatement_in_rule__BasicStatement__PostIncrementStatementAssignment_2_14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostDecrementStatement_in_rule__BasicStatement__PostDecrementStatementAssignment_3_15006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssignStatement__NameAssignment_15037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignStatement__ExpressionAssignment_45068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostIncrementStatement__NameAssignment_15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostDecrementStatement__NaemAssignment_15130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAlternatives_1_1_0_in_rule__Expression__OpAssignment_1_15161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__RightAssignment_1_25194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_1_15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__TerminalExpression__ValueAssignment_2_15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_3_15287 = new BitSet(new long[]{0x0000000000000002L});

}