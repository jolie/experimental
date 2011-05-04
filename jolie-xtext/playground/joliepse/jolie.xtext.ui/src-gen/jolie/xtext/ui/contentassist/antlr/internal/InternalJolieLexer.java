package jolie.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJolieLexer extends Lexer {
    public static final int RULE_PERCENT_SIGN=34;
    public static final int RULE_ID=7;
    public static final int RULE_ANY_OTHER=38;
    public static final int EOF=-1;
    public static final int RULE_POINTSTO=30;
    public static final int RULE_REAL=6;
    public static final int T39=39;
    public static final int RULE_ASTERISK=11;
    public static final int T49=49;
    public static final int RULE_HASH=33;
    public static final int RULE_COMMA=24;
    public static final int T48=48;
    public static final int T100=100;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int RULE_ML_COMMENT=35;
    public static final int T45=45;
    public static final int T44=44;
    public static final int RULE_CHOICE=12;
    public static final int RULE_MINUS=21;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int RULE_MAJOR_OR_EQUAL=17;
    public static final int T56=56;
    public static final int T55=55;
    public static final int RULE_AT=29;
    public static final int T58=58;
    public static final int RULE_QUESTION=10;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_SEMICOLON=28;
    public static final int RULE_LANGLE=15;
    public static final int RULE_NOT_EQUAL=19;
    public static final int RULE_DIVIDE=22;
    public static final int RULE_NOT=32;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int RULE_ASSIGN=23;
    public static final int T62=62;
    public static final int T63=63;
    public static final int RULE_RANGLE=16;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int RULE_DOT=26;
    public static final int T67=67;
    public static final int RULE_SEQUENTIAL=9;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_DECREMENT=13;
    public static final int RULE_INT=4;
    public static final int RULE_VERT=27;
    public static final int T61=61;
    public static final int T60=60;
    public static final int T99=99;
    public static final int T97=97;
    public static final int T98=98;
    public static final int T95=95;
    public static final int T96=96;
    public static final int RULE_PLUS=20;
    public static final int RULE_EQUAL=14;
    public static final int T94=94;
    public static final int Tokens=101;
    public static final int T93=93;
    public static final int RULE_SL_COMMENT=36;
    public static final int T92=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int RULE_CONCURRENT=8;
    public static final int T88=88;
    public static final int T89=89;
    public static final int RULE_COLON=25;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int RULE_WS=37;
    public static final int T81=81;
    public static final int RULE_DEEPCOPYLEFT=31;
    public static final int T80=80;
    public static final int RULE_MINOR_OR_EQUAL=18;
    public static final int T83=83;
    public static final int T82=82;
    public InternalJolieLexer() {;} 
    public InternalJolieLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g"; }

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:10:5: ( 'cH' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:10:7: 'cH'
            {
            match("cH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:11:5: ( 'exit' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:11:7: 'exit'
            {
            match("exit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:12:5: ( 'any' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:12:7: 'any'
            {
            match("any"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:13:5: ( 'int' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:13:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:14:5: ( 'real' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:14:7: 'real'
            {
            match("real"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:15:5: ( 'string' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:15:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:16:5: ( 'void' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:16:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:17:5: ( 'undefined' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:17:7: 'undefined'
            {
            match("undefined"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18:5: ( 'double' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:19:5: ( 'raw' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:19:7: 'raw'
            {
            match("raw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:20:5: ( 'Java' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:20:7: 'Java'
            {
            match("Java"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:21:5: ( 'Jolie' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:21:7: 'Jolie'
            {
            match("Jolie"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:22:5: ( 'Javascript' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:22:7: 'Javascript'
            {
            match("Javascript"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:23:5: ( 'is_defined' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:23:7: 'is_defined'
            {
            match("is_defined"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:24:5: ( 'is_string' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:24:7: 'is_string'
            {
            match("is_string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:25:5: ( 'is_double' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:25:7: 'is_double'
            {
            match("is_double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:26:5: ( 'is_int' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:26:7: 'is_int'
            {
            match("is_int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:27:5: ( 'this' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:27:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:28:5: ( '&&' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:28:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:29:5: ( '||' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:29:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:30:5: ( 'global' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:30:7: 'global'
            {
            match("global"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:31:5: ( 'constants' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:31:7: 'constants'
            {
            match("constants"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:32:5: ( '{' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:32:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:33:5: ( '}' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:33:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:34:5: ( 'execution' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:34:7: 'execution'
            {
            match("execution"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:35:5: ( 'include' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:35:7: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:36:5: ( 'type' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:36:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:37:5: ( '[' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:37:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:38:5: ( ']' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:38:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:39:5: ( 'embedded' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:39:7: 'embedded'
            {
            match("embedded"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:40:5: ( 'define' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:40:7: 'define'
            {
            match("define"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:41:5: ( '(' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:41:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:42:5: ( ')' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:42:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:43:5: ( 'linkIn' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:43:7: 'linkIn'
            {
            match("linkIn"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:44:5: ( 'nullProcess' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:44:7: 'nullProcess'
            {
            match("nullProcess"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:45:5: ( 'install' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:45:7: 'install'
            {
            match("install"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:46:5: ( 'throw' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:46:7: 'throw'
            {
            match("throw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:47:5: ( 'comp' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:47:7: 'comp'
            {
            match("comp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:48:5: ( 'scope' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:48:7: 'scope'
            {
            match("scope"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:49:5: ( 'linkOut' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:49:7: 'linkOut'
            {
            match("linkOut"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:50:5: ( 'synchronized' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:50:7: 'synchronized'
            {
            match("synchronized"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:51:5: ( 'undef' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:51:7: 'undef'
            {
            match("undef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:52:5: ( '=>' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:52:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:53:5: ( 'if' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:53:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:54:5: ( 'else' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:54:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:55:5: ( 'for' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:55:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:56:5: ( 'foreach' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:56:7: 'foreach'
            {
            match("foreach"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:57:5: ( 'while' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:57:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:58:5: ( 'with' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:58:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:59:5: ( 'interface' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:59:7: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:60:5: ( 'inputPort' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:60:7: 'inputPort'
            {
            match("inputPort"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:61:5: ( 'outputPort' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:61:7: 'outputPort'
            {
            match("outputPort"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:62:5: ( 'OneWay' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:62:7: 'OneWay'
            {
            match("OneWay"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:63:5: ( 'RequestResponse' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:63:7: 'RequestResponse'
            {
            match("RequestResponse"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:64:5: ( 'throws' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:64:7: 'throws'
            {
            match("throws"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:65:5: ( 'Location' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:65:7: 'Location'
            {
            match("Location"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:66:5: ( 'Interfaces' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:66:7: 'Interfaces'
            {
            match("Interfaces"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:67:5: ( 'Protocol' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:67:7: 'Protocol'
            {
            match("Protocol"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:68:5: ( 'Redirects' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:68:7: 'Redirects'
            {
            match("Redirects"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:69:5: ( 'Aggregates' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:69:7: 'Aggregates'
            {
            match("Aggregates"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:70:5: ( 'init' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:70:7: 'init'
            {
            match("init"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:71:6: ( 'main' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:71:8: 'main'
            {
            match("main"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start RULE_CONCURRENT
    public final void mRULE_CONCURRENT() throws RecognitionException {
        try {
            int _type = RULE_CONCURRENT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18798:17: ( 'concurrent' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18798:19: 'concurrent'
            {
            match("concurrent"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_CONCURRENT

    // $ANTLR start RULE_SEQUENTIAL
    public final void mRULE_SEQUENTIAL() throws RecognitionException {
        try {
            int _type = RULE_SEQUENTIAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18800:17: ( 'sequential' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18800:19: 'sequential'
            {
            match("sequential"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SEQUENTIAL

    // $ANTLR start RULE_SEMICOLON
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18802:16: ( ';' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18802:18: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SEMICOLON

    // $ANTLR start RULE_COLON
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18804:12: ( ':' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18804:14: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COLON

    // $ANTLR start RULE_PLUS
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18806:11: ( '+' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18806:13: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PLUS

    // $ANTLR start RULE_VERT
    public final void mRULE_VERT() throws RecognitionException {
        try {
            int _type = RULE_VERT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18808:11: ( '|' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18808:13: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_VERT

    // $ANTLR start RULE_ASSIGN
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18810:13: ( '=' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18810:15: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ASSIGN

    // $ANTLR start RULE_DOT
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18812:10: ( '.' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18812:12: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DOT

    // $ANTLR start RULE_COMMA
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18814:12: ( ',' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18814:14: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMA

    // $ANTLR start RULE_AT
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18816:9: ( '@' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18816:11: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_AT

    // $ANTLR start RULE_CHOICE
    public final void mRULE_CHOICE() throws RecognitionException {
        try {
            int _type = RULE_CHOICE;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18818:13: ( '++' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18818:15: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_CHOICE

    // $ANTLR start RULE_DECREMENT
    public final void mRULE_DECREMENT() throws RecognitionException {
        try {
            int _type = RULE_DECREMENT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18820:16: ( '--' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18820:18: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DECREMENT

    // $ANTLR start RULE_ASTERISK
    public final void mRULE_ASTERISK() throws RecognitionException {
        try {
            int _type = RULE_ASTERISK;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18822:15: ( '*' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18822:17: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ASTERISK

    // $ANTLR start RULE_QUESTION
    public final void mRULE_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_QUESTION;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18824:15: ( '?' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18824:17: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_QUESTION

    // $ANTLR start RULE_DIVIDE
    public final void mRULE_DIVIDE() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18826:13: ( '/' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18826:15: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DIVIDE

    // $ANTLR start RULE_POINTSTO
    public final void mRULE_POINTSTO() throws RecognitionException {
        try {
            int _type = RULE_POINTSTO;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18828:15: ( '->' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18828:17: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_POINTSTO

    // $ANTLR start RULE_DEEPCOPYLEFT
    public final void mRULE_DEEPCOPYLEFT() throws RecognitionException {
        try {
            int _type = RULE_DEEPCOPYLEFT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18830:19: ( '<<' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18830:21: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DEEPCOPYLEFT

    // $ANTLR start RULE_MINUS
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18832:12: ( '-' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18832:14: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_MINUS

    // $ANTLR start RULE_PERCENT_SIGN
    public final void mRULE_PERCENT_SIGN() throws RecognitionException {
        try {
            int _type = RULE_PERCENT_SIGN;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18834:19: ( '%' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18834:21: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PERCENT_SIGN

    // $ANTLR start RULE_EQUAL
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18836:12: ( '==' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18836:14: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_EQUAL

    // $ANTLR start RULE_LANGLE
    public final void mRULE_LANGLE() throws RecognitionException {
        try {
            int _type = RULE_LANGLE;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18838:13: ( '<' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18838:15: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LANGLE

    // $ANTLR start RULE_RANGLE
    public final void mRULE_RANGLE() throws RecognitionException {
        try {
            int _type = RULE_RANGLE;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18840:13: ( '>' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18840:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RANGLE

    // $ANTLR start RULE_HASH
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18842:11: ( '#' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18842:13: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HASH

    // $ANTLR start RULE_MAJOR_OR_EQUAL
    public final void mRULE_MAJOR_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MAJOR_OR_EQUAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18844:21: ( '>=' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18844:23: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_MAJOR_OR_EQUAL

    // $ANTLR start RULE_MINOR_OR_EQUAL
    public final void mRULE_MINOR_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MINOR_OR_EQUAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18846:21: ( '<=' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18846:23: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_MINOR_OR_EQUAL

    // $ANTLR start RULE_NOT_EQUAL
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18848:16: ( '!=' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18848:18: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NOT_EQUAL

    // $ANTLR start RULE_NOT
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18850:10: ( '!' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18850:12: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NOT

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:11: ( ( '0' .. '9' )* RULE_DOT ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:13: ( '0' .. '9' )* RULE_DOT ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:13: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_DOT(); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:34: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:35: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:46: ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:47: ( 'e' | 'E' ) ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:57: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18852:58: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18854:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18854:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18854:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18854:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18854:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18856:10: ( ( '0' .. '9' )+ )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18856:12: ( '0' .. '9' )+
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18856:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18856:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("18858:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFE')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18858:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18860:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18860:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18860:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFE')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18860:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:41: ( '\\r' )? '\\n'
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18862:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18864:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18864:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18864:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18866:16: ( . )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:18866:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:8: ( T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | RULE_CONCURRENT | RULE_SEQUENTIAL | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_COMMA | RULE_AT | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_QUESTION | RULE_DIVIDE | RULE_POINTSTO | RULE_DEEPCOPYLEFT | RULE_MINUS | RULE_PERCENT_SIGN | RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_HASH | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL | RULE_NOT | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=97;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:10: T39
                {
                mT39(); 

                }
                break;
            case 2 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:14: T40
                {
                mT40(); 

                }
                break;
            case 3 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:18: T41
                {
                mT41(); 

                }
                break;
            case 4 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:22: T42
                {
                mT42(); 

                }
                break;
            case 5 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:26: T43
                {
                mT43(); 

                }
                break;
            case 6 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:30: T44
                {
                mT44(); 

                }
                break;
            case 7 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:34: T45
                {
                mT45(); 

                }
                break;
            case 8 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:38: T46
                {
                mT46(); 

                }
                break;
            case 9 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:42: T47
                {
                mT47(); 

                }
                break;
            case 10 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:46: T48
                {
                mT48(); 

                }
                break;
            case 11 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:50: T49
                {
                mT49(); 

                }
                break;
            case 12 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:54: T50
                {
                mT50(); 

                }
                break;
            case 13 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:58: T51
                {
                mT51(); 

                }
                break;
            case 14 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:62: T52
                {
                mT52(); 

                }
                break;
            case 15 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:66: T53
                {
                mT53(); 

                }
                break;
            case 16 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:70: T54
                {
                mT54(); 

                }
                break;
            case 17 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:74: T55
                {
                mT55(); 

                }
                break;
            case 18 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:78: T56
                {
                mT56(); 

                }
                break;
            case 19 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:82: T57
                {
                mT57(); 

                }
                break;
            case 20 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:86: T58
                {
                mT58(); 

                }
                break;
            case 21 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:90: T59
                {
                mT59(); 

                }
                break;
            case 22 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:94: T60
                {
                mT60(); 

                }
                break;
            case 23 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:98: T61
                {
                mT61(); 

                }
                break;
            case 24 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:102: T62
                {
                mT62(); 

                }
                break;
            case 25 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:106: T63
                {
                mT63(); 

                }
                break;
            case 26 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:110: T64
                {
                mT64(); 

                }
                break;
            case 27 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:114: T65
                {
                mT65(); 

                }
                break;
            case 28 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:118: T66
                {
                mT66(); 

                }
                break;
            case 29 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:122: T67
                {
                mT67(); 

                }
                break;
            case 30 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:126: T68
                {
                mT68(); 

                }
                break;
            case 31 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:130: T69
                {
                mT69(); 

                }
                break;
            case 32 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:134: T70
                {
                mT70(); 

                }
                break;
            case 33 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:138: T71
                {
                mT71(); 

                }
                break;
            case 34 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:142: T72
                {
                mT72(); 

                }
                break;
            case 35 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:146: T73
                {
                mT73(); 

                }
                break;
            case 36 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:150: T74
                {
                mT74(); 

                }
                break;
            case 37 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:154: T75
                {
                mT75(); 

                }
                break;
            case 38 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:158: T76
                {
                mT76(); 

                }
                break;
            case 39 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:162: T77
                {
                mT77(); 

                }
                break;
            case 40 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:166: T78
                {
                mT78(); 

                }
                break;
            case 41 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:170: T79
                {
                mT79(); 

                }
                break;
            case 42 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:174: T80
                {
                mT80(); 

                }
                break;
            case 43 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:178: T81
                {
                mT81(); 

                }
                break;
            case 44 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:182: T82
                {
                mT82(); 

                }
                break;
            case 45 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:186: T83
                {
                mT83(); 

                }
                break;
            case 46 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:190: T84
                {
                mT84(); 

                }
                break;
            case 47 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:194: T85
                {
                mT85(); 

                }
                break;
            case 48 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:198: T86
                {
                mT86(); 

                }
                break;
            case 49 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:202: T87
                {
                mT87(); 

                }
                break;
            case 50 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:206: T88
                {
                mT88(); 

                }
                break;
            case 51 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:210: T89
                {
                mT89(); 

                }
                break;
            case 52 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:214: T90
                {
                mT90(); 

                }
                break;
            case 53 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:218: T91
                {
                mT91(); 

                }
                break;
            case 54 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:222: T92
                {
                mT92(); 

                }
                break;
            case 55 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:226: T93
                {
                mT93(); 

                }
                break;
            case 56 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:230: T94
                {
                mT94(); 

                }
                break;
            case 57 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:234: T95
                {
                mT95(); 

                }
                break;
            case 58 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:238: T96
                {
                mT96(); 

                }
                break;
            case 59 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:242: T97
                {
                mT97(); 

                }
                break;
            case 60 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:246: T98
                {
                mT98(); 

                }
                break;
            case 61 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:250: T99
                {
                mT99(); 

                }
                break;
            case 62 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:254: T100
                {
                mT100(); 

                }
                break;
            case 63 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:259: RULE_CONCURRENT
                {
                mRULE_CONCURRENT(); 

                }
                break;
            case 64 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:275: RULE_SEQUENTIAL
                {
                mRULE_SEQUENTIAL(); 

                }
                break;
            case 65 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:291: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 66 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:306: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 67 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:317: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 68 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:327: RULE_VERT
                {
                mRULE_VERT(); 

                }
                break;
            case 69 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:337: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 70 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:349: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 71 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:358: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 72 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:369: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 73 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:377: RULE_CHOICE
                {
                mRULE_CHOICE(); 

                }
                break;
            case 74 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:389: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 75 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:404: RULE_ASTERISK
                {
                mRULE_ASTERISK(); 

                }
                break;
            case 76 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:418: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 77 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:432: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 78 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:444: RULE_POINTSTO
                {
                mRULE_POINTSTO(); 

                }
                break;
            case 79 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:458: RULE_DEEPCOPYLEFT
                {
                mRULE_DEEPCOPYLEFT(); 

                }
                break;
            case 80 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:476: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 81 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:487: RULE_PERCENT_SIGN
                {
                mRULE_PERCENT_SIGN(); 

                }
                break;
            case 82 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:505: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 83 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:516: RULE_LANGLE
                {
                mRULE_LANGLE(); 

                }
                break;
            case 84 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:528: RULE_RANGLE
                {
                mRULE_RANGLE(); 

                }
                break;
            case 85 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:540: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 86 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:550: RULE_MAJOR_OR_EQUAL
                {
                mRULE_MAJOR_OR_EQUAL(); 

                }
                break;
            case 87 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:570: RULE_MINOR_OR_EQUAL
                {
                mRULE_MINOR_OR_EQUAL(); 

                }
                break;
            case 88 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:590: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 89 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:605: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 90 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:614: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 91 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:624: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 92 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:632: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 93 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:641: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 94 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:653: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:669: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:685: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 97 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:693: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\13\72\1\67\1\122\1\72\6\uffff\2\72\1\136\12\72\2\uffff"+
        "\1\155\1\156\2\uffff\1\164\2\uffff\1\171\1\174\1\uffff\1\177\1\uffff"+
        "\1\u0082\1\u0084\1\67\1\uffff\2\67\2\uffff\1\u0087\1\72\1\uffff"+
        "\6\72\1\u0095\16\72\3\uffff\1\72\6\uffff\2\72\3\uffff\13\72\31\uffff"+
        "\1\u0084\4\uffff\6\72\1\u00bb\2\72\1\u00bf\3\72\1\uffff\1\72\1\u00c6"+
        "\20\72\1\u00d8\13\72\1\u00e4\2\72\1\u00e7\2\72\1\u00ea\1\uffff\1"+
        "\72\1\u00ec\1\72\1\uffff\5\72\1\u00f4\1\uffff\4\72\1\u00f9\4\72"+
        "\1\u00ff\1\u0100\1\u0101\5\72\1\uffff\1\u0108\11\72\1\u0112\1\uffff"+
        "\2\72\1\uffff\2\72\1\uffff\1\72\1\uffff\7\72\1\uffff\1\72\1\u0120"+
        "\2\72\1\uffff\1\u0124\2\72\1\u0127\1\72\3\uffff\1\u012a\5\72\1\uffff"+
        "\1\u0130\10\72\1\uffff\10\72\1\u0141\3\72\1\u0145\1\uffff\3\72\1"+
        "\uffff\1\u0149\1\u014a\1\uffff\1\72\1\u014c\1\uffff\1\u014d\1\72"+
        "\1\u014f\2\72\1\uffff\1\72\1\u0153\12\72\1\u015e\1\72\1\u0160\1"+
        "\72\1\uffff\3\72\1\uffff\3\72\2\uffff\1\72\2\uffff\1\u0169\1\uffff"+
        "\1\72\1\u016b\1\72\1\uffff\11\72\1\u0176\1\uffff\1\72\1\uffff\10"+
        "\72\1\uffff\1\72\1\uffff\3\72\1\u0184\1\72\1\u0186\2\72\1\u0189"+
        "\1\u018a\1\uffff\1\u018b\1\u018c\1\72\1\u018e\1\u018f\2\72\1\u0192"+
        "\4\72\1\u0197\1\uffff\1\72\1\uffff\1\72\1\u019a\4\uffff\1\u019b"+
        "\2\uffff\1\72\1\u019d\1\uffff\1\u019e\1\72\1\u01a0\1\72\1\uffff"+
        "\1\u01a2\1\u01a3\2\uffff\1\72\2\uffff\1\u01a5\1\uffff\1\72\2\uffff"+
        "\1\u01a7\1\uffff\1\72\1\uffff\2\72\1\u01ab\1\uffff";
    static final String DFA16_eofS =
        "\u01ac\uffff";
    static final String DFA16_minS =
        "\1\0\1\110\1\154\1\156\1\146\1\141\1\143\1\157\1\156\1\145\1\141"+
        "\1\150\1\46\1\174\1\154\6\uffff\1\151\1\165\1\75\1\157\1\150\1\165"+
        "\1\156\1\145\1\157\1\156\1\162\1\147\1\141\2\uffff\1\53\1\60\2\uffff"+
        "\1\55\2\uffff\1\52\1\74\1\uffff\1\75\1\uffff\1\75\1\56\1\101\1\uffff"+
        "\2\0\2\uffff\1\60\1\155\1\uffff\1\145\1\142\1\163\1\171\1\143\1"+
        "\137\1\60\1\141\1\167\1\162\1\157\1\156\1\161\1\151\1\144\1\165"+
        "\1\146\1\154\1\166\1\160\1\151\3\uffff\1\157\6\uffff\1\156\1\154"+
        "\3\uffff\1\162\1\164\1\151\1\164\1\145\1\144\1\143\1\164\1\157\1"+
        "\147\1\151\31\uffff\1\56\4\uffff\1\160\1\143\1\164\1\143\2\145\1"+
        "\60\1\154\1\164\1\60\1\164\1\165\1\144\1\uffff\1\154\1\60\1\151"+
        "\1\160\1\143\1\165\1\144\1\145\1\142\2\151\1\141\1\145\1\163\1\157"+
        "\1\142\1\153\1\154\1\60\1\150\1\154\1\160\1\127\1\165\1\151\1\141"+
        "\1\145\1\164\1\162\1\156\1\60\1\165\1\164\1\60\1\165\1\144\1\60"+
        "\1\uffff\1\165\1\60\1\162\1\uffff\1\141\1\164\1\156\1\145\1\164"+
        "\1\60\1\uffff\1\156\1\145\1\150\1\145\1\60\1\146\1\154\1\156\1\145"+
        "\3\60\1\167\1\141\1\111\1\120\1\141\1\uffff\1\60\1\145\1\165\1\141"+
        "\1\145\1\162\1\164\1\162\1\157\1\145\1\60\1\uffff\1\162\1\141\1"+
        "\uffff\1\164\1\144\1\uffff\1\144\1\uffff\1\146\1\154\1\120\1\164"+
        "\1\146\1\165\1\162\1\uffff\1\147\1\60\1\162\1\156\1\uffff\1\60\2"+
        "\145\1\60\1\143\3\uffff\1\60\1\154\1\165\1\156\1\162\1\143\1\uffff"+
        "\1\60\1\164\1\171\1\163\1\145\1\151\1\146\1\143\1\147\1\uffff\1"+
        "\162\1\156\1\151\2\145\1\141\1\154\1\157\1\60\1\151\1\142\1\151"+
        "\1\60\1\uffff\1\157\1\164\1\156\1\uffff\2\60\1\uffff\1\162\1\60"+
        "\1\uffff\1\60\1\164\1\60\1\157\1\150\1\uffff\1\120\1\60\1\164\1"+
        "\143\1\157\1\141\1\157\1\141\1\145\1\164\1\157\1\144\1\60\1\143"+
        "\1\60\1\162\1\uffff\1\156\1\154\1\156\1\uffff\1\156\1\151\1\145"+
        "\2\uffff\1\151\2\uffff\1\60\1\uffff\1\143\1\60\1\157\1\uffff\1\122"+
        "\1\164\1\156\1\143\1\154\1\164\1\156\1\163\1\156\1\60\1\uffff\1"+
        "\145\1\uffff\1\164\2\145\1\147\1\151\1\141\1\144\1\160\1\uffff\1"+
        "\145\1\uffff\1\162\1\145\1\163\1\60\1\145\1\60\1\145\1\164\2\60"+
        "\1\uffff\2\60\1\144\2\60\1\172\1\154\1\60\1\164\1\163\1\164\1\163"+
        "\1\60\1\uffff\1\163\1\uffff\1\163\1\60\4\uffff\1\60\2\uffff\1\145"+
        "\1\60\1\uffff\1\60\1\163\1\60\1\160\1\uffff\2\60\2\uffff\1\144\2"+
        "\uffff\1\60\1\uffff\1\157\2\uffff\1\60\1\uffff\1\156\1\uffff\1\163"+
        "\1\145\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\ufffe\1\157\1\170\1\156\1\163\1\145\1\171\1\157\1\156\2\157\1"+
        "\171\1\46\1\174\1\154\6\uffff\1\151\1\165\1\76\1\157\1\151\1\165"+
        "\1\156\1\145\1\157\1\156\1\162\1\147\1\141\2\uffff\1\53\1\71\2\uffff"+
        "\1\76\2\uffff\1\57\1\75\1\uffff\1\75\1\uffff\1\75\1\71\1\172\1\uffff"+
        "\2\ufffe\2\uffff\1\172\1\156\1\uffff\1\151\1\142\1\163\1\171\1\164"+
        "\1\137\1\172\1\141\1\167\1\162\1\157\1\156\1\161\1\151\1\144\1\165"+
        "\1\146\1\154\1\166\1\160\1\162\3\uffff\1\157\6\uffff\1\156\1\154"+
        "\3\uffff\1\162\1\164\1\151\1\164\1\145\1\161\1\143\1\164\1\157\1"+
        "\147\1\151\31\uffff\1\71\4\uffff\1\160\1\163\1\164\1\143\2\145\1"+
        "\172\1\154\1\164\1\172\1\164\1\165\1\163\1\uffff\1\154\1\172\1\151"+
        "\1\160\1\143\1\165\1\144\1\145\1\142\2\151\1\141\1\145\1\163\1\157"+
        "\1\142\1\153\1\154\1\172\1\150\1\154\1\160\1\127\1\165\1\151\1\141"+
        "\1\145\1\164\1\162\1\156\1\172\1\165\1\164\1\172\1\165\1\144\1\172"+
        "\1\uffff\1\165\1\172\1\162\1\uffff\1\141\1\164\1\156\1\157\1\164"+
        "\1\172\1\uffff\1\156\1\145\1\150\1\145\1\172\1\146\1\154\1\156\1"+
        "\145\3\172\1\167\1\141\1\117\1\120\1\141\1\uffff\1\172\1\145\1\165"+
        "\1\141\1\145\1\162\1\164\1\162\1\157\1\145\1\172\1\uffff\1\162\1"+
        "\141\1\uffff\1\164\1\144\1\uffff\1\144\1\uffff\1\146\1\154\1\120"+
        "\1\164\1\146\1\165\1\162\1\uffff\1\147\1\172\1\162\1\156\1\uffff"+
        "\1\172\2\145\1\172\1\143\3\uffff\1\172\1\154\1\165\1\156\1\162\1"+
        "\143\1\uffff\1\172\1\164\1\171\1\163\1\145\1\151\1\146\1\143\1\147"+
        "\1\uffff\1\162\1\156\1\151\2\145\1\141\1\154\1\157\1\172\1\151\1"+
        "\142\1\151\1\172\1\uffff\1\157\1\164\1\156\1\uffff\2\172\1\uffff"+
        "\1\162\1\172\1\uffff\1\172\1\164\1\172\1\157\1\150\1\uffff\1\120"+
        "\1\172\1\164\1\143\1\157\1\141\1\157\1\141\1\145\1\164\1\157\1\144"+
        "\1\172\1\143\1\172\1\162\1\uffff\1\156\1\154\1\156\1\uffff\1\156"+
        "\1\151\1\145\2\uffff\1\151\2\uffff\1\172\1\uffff\1\143\1\172\1\157"+
        "\1\uffff\1\122\1\164\1\156\1\143\1\154\1\164\1\156\1\163\1\156\1"+
        "\172\1\uffff\1\145\1\uffff\1\164\2\145\1\147\1\151\1\141\1\144\1"+
        "\160\1\uffff\1\145\1\uffff\1\162\1\145\1\163\1\172\1\145\1\172\1"+
        "\145\1\164\2\172\1\uffff\2\172\1\144\3\172\1\154\1\172\1\164\1\163"+
        "\1\164\1\163\1\172\1\uffff\1\163\1\uffff\1\163\1\172\4\uffff\1\172"+
        "\2\uffff\1\145\1\172\1\uffff\1\172\1\163\1\172\1\160\1\uffff\2\172"+
        "\2\uffff\1\144\2\uffff\1\172\1\uffff\1\157\2\uffff\1\172\1\uffff"+
        "\1\156\1\uffff\1\163\1\145\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\17\uffff\1\27\1\30\1\34\1\35\1\40\1\41\15\uffff\1\101\1\102\2\uffff"+
        "\1\107\1\110\1\uffff\1\113\1\114\2\uffff\1\121\1\uffff\1\125\3\uffff"+
        "\1\133\2\uffff\1\140\1\141\2\uffff\1\133\25\uffff\1\23\1\24\1\104"+
        "\1\uffff\1\27\1\30\1\34\1\35\1\40\1\41\2\uffff\1\53\1\122\1\105"+
        "\13\uffff\1\101\1\102\1\111\1\103\1\106\1\132\1\107\1\110\1\116"+
        "\1\112\1\120\1\113\1\114\1\136\1\137\1\115\1\117\1\127\1\123\1\121"+
        "\1\126\1\124\1\125\1\130\1\131\1\uffff\1\134\1\135\1\140\1\1\15"+
        "\uffff\1\54\45\uffff\1\3\3\uffff\1\4\6\uffff\1\12\21\uffff\1\56"+
        "\13\uffff\1\46\2\uffff\1\2\2\uffff\1\55\1\uffff\1\75\7\uffff\1\5"+
        "\4\uffff\1\7\5\uffff\1\13\1\33\1\22\6\uffff\1\61\11\uffff\1\76\15"+
        "\uffff\1\47\3\uffff\1\52\2\uffff\1\14\2\uffff\1\45\5\uffff\1\60"+
        "\20\uffff\1\21\3\uffff\1\6\3\uffff\1\11\1\37\1\uffff\1\67\1\25\1"+
        "\uffff\1\42\3\uffff\1\65\12\uffff\1\32\1\uffff\1\44\10\uffff\1\50"+
        "\1\uffff\1\57\12\uffff\1\36\15\uffff\1\70\1\uffff\1\72\2\uffff\1"+
        "\26\1\31\1\62\1\63\1\uffff\1\20\1\17\2\uffff\1\10\4\uffff\1\73\2"+
        "\uffff\1\77\1\16\1\uffff\1\100\1\15\1\uffff\1\64\1\uffff\1\71\1"+
        "\74\1\uffff\1\43\1\uffff\1\51\3\uffff\1\66";
    static final String DFA16_specialS =
        "\u01ac\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\60\1\64\1\57\1\67\1\55\1"+
            "\14\1\65\1\23\1\24\1\51\1\44\1\46\1\50\1\45\1\53\12\61\1\43"+
            "\1\42\1\54\1\27\1\56\1\52\1\47\1\40\7\63\1\36\1\12\1\63\1\35"+
            "\2\63\1\33\1\37\1\63\1\34\10\63\1\21\1\67\1\22\1\62\1\63\1\67"+
            "\1\3\1\63\1\1\1\11\1\2\1\30\1\16\1\63\1\4\2\63\1\25\1\41\1\26"+
            "\1\32\2\63\1\5\1\6\1\13\1\10\1\7\1\31\3\63\1\17\1\15\1\20\uff81"+
            "\67",
            "\1\70\46\uffff\1\71",
            "\1\75\1\74\12\uffff\1\73",
            "\1\76",
            "\1\101\7\uffff\1\77\4\uffff\1\100",
            "\1\103\3\uffff\1\102",
            "\1\105\1\uffff\1\107\16\uffff\1\104\4\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\113\11\uffff\1\112",
            "\1\115\15\uffff\1\114",
            "\1\117\20\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\135\1\134",
            "\1\137",
            "\1\141\1\140",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "\1\154",
            "\12\157",
            "",
            "",
            "\1\163\20\uffff\1\162",
            "",
            "",
            "\1\167\4\uffff\1\170",
            "\1\172\1\173",
            "",
            "\1\176",
            "",
            "\1\u0081",
            "\1\157\1\uffff\12\u0083",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\uffff\u0085",
            "\uffff\u0085",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0088\1\u0089",
            "",
            "\1\u008b\3\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\5\uffff\1\u0090\6\uffff\1\u0093\2\uffff\1\u0092\1\u0091",
            "\1\u0094",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\10\uffff\1\u00a4",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\14\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157\1\uffff\12\u0083",
            "",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5\17\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00bc",
            "\1\u00bd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u00be\25\72",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c3\4\uffff\1\u00c2\11\uffff\1\u00c4",
            "",
            "\1\u00c5",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u00d7\25\72",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00e5",
            "\1\u00e6",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00e8",
            "\1\u00e9",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00eb",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1\11\uffff\1\u00f2",
            "\1\u00f3",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\22\72\1\u00fe\7\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0102",
            "\1\u0103",
            "\1\u0105\5\uffff\1\u0104",
            "\1\u0106",
            "\1\u0107",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0121",
            "\1\u0122",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\10\72\1\u0123\21\72",
            "\1\u0125",
            "\1\u0126",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0128",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\22\72\1\u0129\7\72",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u014b",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u014e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u015f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0161",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "",
            "",
            "\1\u0168",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u016a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0185",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0187",
            "\1\u0188",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0190",
            "\1\u0191",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0198",
            "",
            "\1\u0199",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u019c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u019f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01a1",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u01a4",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u01a6",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | RULE_CONCURRENT | RULE_SEQUENTIAL | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_COMMA | RULE_AT | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_QUESTION | RULE_DIVIDE | RULE_POINTSTO | RULE_DEEPCOPYLEFT | RULE_MINUS | RULE_PERCENT_SIGN | RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_HASH | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL | RULE_NOT | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}