package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJolieLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int RULE_PERCENT_SIGN=39;
    public static final int T73=73;
    public static final int RULE_ID=8;
    public static final int T74=74;
    public static final int RULE_SEMICOLON=20;
    public static final int RULE_LANGLE=29;
    public static final int RULE_NOT_EQUAL=33;
    public static final int RULE_DIVIDE=36;
    public static final int RULE_RSQUARE=16;
    public static final int EOF=-1;
    public static final int RULE_NOT=27;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int RULE_ASSIGN=21;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int RULE_RANGLE=30;
    public static final int T65=65;
    public static final int RULE_WHILE=38;
    public static final int T66=66;
    public static final int T67=67;
    public static final int RULE_DOT=10;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_LPAREN=17;
    public static final int RULE_POINTSTO=24;
    public static final int RULE_DECREMENT=23;
    public static final int RULE_INT=14;
    public static final int RULE_VERT=19;
    public static final int RULE_REAL=37;
    public static final int RULE_ASTERISK=12;
    public static final int RULE_LSQUARE=13;
    public static final int T61=61;
    public static final int T60=60;
    public static final int RULE_PLUS=34;
    public static final int T49=49;
    public static final int T48=48;
    public static final int RULE_COMMA=15;
    public static final int RULE_EQUAL=28;
    public static final int T43=43;
    public static final int Tokens=77;
    public static final int RULE_SL_COMMENT=41;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=40;
    public static final int T44=44;
    public static final int RULE_CONCURRENT=5;
    public static final int RULE_CHOICE=22;
    public static final int RULE_MINUS=35;
    public static final int RULE_COLON=9;
    public static final int RULE_STRING=7;
    public static final int T50=50;
    public static final int T59=59;
    public static final int RULE_RPAREN=18;
    public static final int T52=52;
    public static final int RULE_WS=42;
    public static final int T51=51;
    public static final int RULE_DEEPCOPYLEFT=25;
    public static final int T54=54;
    public static final int RULE_MINOR_OR_EQUAL=32;
    public static final int T53=53;
    public static final int T56=56;
    public static final int RULE_MAJOR_OR_EQUAL=31;
    public static final int RULE_RCURLY=6;
    public static final int T55=55;
    public static final int T58=58;
    public static final int RULE_AT=26;
    public static final int T57=57;
    public static final int RULE_LCURLY=4;
    public static final int RULE_QUESTION=11;
    public InternalJolieLexer() {;} 
    public InternalJolieLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g"; }

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:10:5: ( 'execution' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:10:7: 'execution'
            {
            match("execution"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:11:5: ( 'include' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:11:7: 'include'
            {
            match("include"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:12:5: ( 'type' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:12:7: 'type'
            {
            match("type"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:13:5: ( 'any' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:13:7: 'any'
            {
            match("any"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:14:5: ( 'int' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:14:7: 'int'
            {
            match("int"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:15:5: ( 'raw' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:15:7: 'raw'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:16:5: ( 'string' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:16:7: 'string'
            {
            match("string"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:17:5: ( 'void' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:17:7: 'void'
            {
            match("void"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:18:5: ( 'real' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:18:7: 'real'
            {
            match("real"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:19:5: ( 'define' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:19:7: 'define'
            {
            match("define"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:20:5: ( 'init' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:20:7: 'init'
            {
            match("init"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:21:5: ( 'main' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:21:7: 'main'
            {
            match("main"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:22:5: ( 'linkIn' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:22:7: 'linkIn'
            {
            match("linkIn"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:23:5: ( 'nullProcess' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:23:7: 'nullProcess'
            {
            match("nullProcess"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:24:5: ( 'synchronized' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:24:7: 'synchronized'
            {
            match("synchronized"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:25:5: ( 'undef' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:25:7: 'undef'
            {
            match("undef"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:26:5: ( 'this' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:26:7: 'this'
            {
            match("this"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:27:5: ( '=>' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:27:7: '=>'
            {
            match("=>"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:28:5: ( 'for' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:28:7: 'for'
            {
            match("for"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:29:5: ( 'foreach' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:29:7: 'foreach'
            {
            match("foreach"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:30:5: ( 'global' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:30:7: 'global'
            {
            match("global"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:31:5: ( 'with' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:31:7: 'with'
            {
            match("with"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:32:5: ( 'interface' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:32:7: 'interface'
            {
            match("interface"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:33:5: ( 'inputPort' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:33:7: 'inputPort'
            {
            match("inputPort"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:34:5: ( 'outputPort' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:34:7: 'outputPort'
            {
            match("outputPort"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:35:5: ( 'OneWay' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:35:7: 'OneWay'
            {
            match("OneWay"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:36:5: ( 'RequestResponse' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:36:7: 'RequestResponse'
            {
            match("RequestResponse"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:37:5: ( 'throws' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:37:7: 'throws'
            {
            match("throws"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:38:5: ( 'Location' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:38:7: 'Location'
            {
            match("Location"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:39:5: ( 'Interfaces' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:39:7: 'Interfaces'
            {
            match("Interfaces"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:40:5: ( 'Protocol' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:40:7: 'Protocol'
            {
            match("Protocol"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:41:5: ( 'TODO' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:41:7: 'TODO'
            {
            match("TODO"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:42:5: ( 'Redirects' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:42:7: 'Redirects'
            {
            match("Redirects"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:43:5: ( 'Aggregates' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:43:7: 'Aggregates'
            {
            match("Aggregates"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start RULE_CONCURRENT
    public final void mRULE_CONCURRENT() throws RecognitionException {
        try {
            int _type = RULE_CONCURRENT;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6177:17: ( 'concurrent' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6177:19: 'concurrent'
            {
            match("concurrent"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_CONCURRENT

    // $ANTLR start RULE_LCURLY
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6179:13: ( '{' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6179:15: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LCURLY

    // $ANTLR start RULE_RCURLY
    public final void mRULE_RCURLY() throws RecognitionException {
        try {
            int _type = RULE_RCURLY;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6181:13: ( '}' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6181:15: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RCURLY

    // $ANTLR start RULE_LSQUARE
    public final void mRULE_LSQUARE() throws RecognitionException {
        try {
            int _type = RULE_LSQUARE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6183:14: ( '[' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6183:16: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LSQUARE

    // $ANTLR start RULE_RSQUARE
    public final void mRULE_RSQUARE() throws RecognitionException {
        try {
            int _type = RULE_RSQUARE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6185:14: ( ']' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6185:16: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RSQUARE

    // $ANTLR start RULE_SEMICOLON
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6187:16: ( ';' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6187:18: ';'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6189:12: ( ':' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6189:14: ':'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6191:11: ( '+' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6191:13: '+'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6193:11: ( '|' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6193:13: '|'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6195:13: ( '=' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6195:15: '='
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6197:10: ( '.' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6197:12: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DOT

    // $ANTLR start RULE_LPAREN
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6199:13: ( '(' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6199:15: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LPAREN

    // $ANTLR start RULE_RPAREN
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6201:13: ( ')' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6201:15: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RPAREN

    // $ANTLR start RULE_COMMA
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6203:12: ( ',' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6203:14: ','
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6205:9: ( '@' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6205:11: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_AT

    // $ANTLR start RULE_WHILE
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6207:12: ( 'while' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6207:14: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WHILE

    // $ANTLR start RULE_CHOICE
    public final void mRULE_CHOICE() throws RecognitionException {
        try {
            int _type = RULE_CHOICE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6209:13: ( '++' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6209:15: '++'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6211:16: ( '--' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6211:18: '--'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6213:15: ( '*' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6213:17: '*'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6215:15: ( '?' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6215:17: '?'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6217:13: ( '/' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6217:15: '/'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6219:15: ( '->' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6219:17: '->'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6221:19: ( '<<' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6221:21: '<<'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6223:12: ( '-' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6223:14: '-'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6225:19: ( '%' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6225:21: '%'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6227:12: ( '==' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6227:14: '=='
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6229:13: ( '<' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6229:15: '<'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6231:13: ( '>' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6231:15: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RANGLE

    // $ANTLR start RULE_MAJOR_OR_EQUAL
    public final void mRULE_MAJOR_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MAJOR_OR_EQUAL;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6233:21: ( '>=' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6233:23: '>='
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6235:21: ( '<=' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6235:23: '<='
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6237:16: ( '!=' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6237:18: '!='
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6239:10: ( '!' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6239:12: '!'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:11: ( ( '0' .. '9' )* RULE_DOT ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:13: ( '0' .. '9' )* RULE_DOT ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:13: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_DOT(); 
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:34: ( '0' .. '9' )+
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:35: '0' .. '9'
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:46: ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:47: ( 'e' | 'E' ) ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:57: ( '0' .. '9' )+
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6241:58: '0' .. '9'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6243:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6243:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6243:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6243:11: '^'
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6243:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6245:10: ( ( '0' .. '9' )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6245:12: ( '0' .. '9' )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6245:12: ( '0' .. '9' )+
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6245:13: '0' .. '9'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("6247:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6247:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6249:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6249:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6249:24: ( options {greedy=false; } : . )*
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6249:52: .
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:41: ( '\\r' )? '\\n'
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6251:41: '\\r'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6253:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6253:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:6253:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:
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

    public void mTokens() throws RecognitionException {
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:8: ( T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | RULE_CONCURRENT | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_AT | RULE_WHILE | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_QUESTION | RULE_DIVIDE | RULE_POINTSTO | RULE_DEEPCOPYLEFT | RULE_MINUS | RULE_PERCENT_SIGN | RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL | RULE_NOT | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt16=73;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:10: T43
                {
                mT43(); 

                }
                break;
            case 2 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:14: T44
                {
                mT44(); 

                }
                break;
            case 3 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:18: T45
                {
                mT45(); 

                }
                break;
            case 4 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:22: T46
                {
                mT46(); 

                }
                break;
            case 5 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:26: T47
                {
                mT47(); 

                }
                break;
            case 6 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:30: T48
                {
                mT48(); 

                }
                break;
            case 7 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:34: T49
                {
                mT49(); 

                }
                break;
            case 8 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:38: T50
                {
                mT50(); 

                }
                break;
            case 9 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:42: T51
                {
                mT51(); 

                }
                break;
            case 10 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:46: T52
                {
                mT52(); 

                }
                break;
            case 11 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:50: T53
                {
                mT53(); 

                }
                break;
            case 12 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:54: T54
                {
                mT54(); 

                }
                break;
            case 13 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:58: T55
                {
                mT55(); 

                }
                break;
            case 14 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:62: T56
                {
                mT56(); 

                }
                break;
            case 15 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:66: T57
                {
                mT57(); 

                }
                break;
            case 16 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:70: T58
                {
                mT58(); 

                }
                break;
            case 17 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:74: T59
                {
                mT59(); 

                }
                break;
            case 18 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:78: T60
                {
                mT60(); 

                }
                break;
            case 19 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:82: T61
                {
                mT61(); 

                }
                break;
            case 20 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:86: T62
                {
                mT62(); 

                }
                break;
            case 21 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:90: T63
                {
                mT63(); 

                }
                break;
            case 22 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:94: T64
                {
                mT64(); 

                }
                break;
            case 23 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:98: T65
                {
                mT65(); 

                }
                break;
            case 24 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:102: T66
                {
                mT66(); 

                }
                break;
            case 25 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:106: T67
                {
                mT67(); 

                }
                break;
            case 26 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:110: T68
                {
                mT68(); 

                }
                break;
            case 27 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:114: T69
                {
                mT69(); 

                }
                break;
            case 28 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:118: T70
                {
                mT70(); 

                }
                break;
            case 29 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:122: T71
                {
                mT71(); 

                }
                break;
            case 30 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:126: T72
                {
                mT72(); 

                }
                break;
            case 31 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:130: T73
                {
                mT73(); 

                }
                break;
            case 32 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:134: T74
                {
                mT74(); 

                }
                break;
            case 33 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:138: T75
                {
                mT75(); 

                }
                break;
            case 34 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:142: T76
                {
                mT76(); 

                }
                break;
            case 35 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:146: RULE_CONCURRENT
                {
                mRULE_CONCURRENT(); 

                }
                break;
            case 36 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:162: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 37 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:174: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 38 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:186: RULE_LSQUARE
                {
                mRULE_LSQUARE(); 

                }
                break;
            case 39 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:199: RULE_RSQUARE
                {
                mRULE_RSQUARE(); 

                }
                break;
            case 40 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:212: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 41 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:227: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 42 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:238: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 43 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:248: RULE_VERT
                {
                mRULE_VERT(); 

                }
                break;
            case 44 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:258: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 45 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:270: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 46 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:279: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 47 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:291: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 48 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:303: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 49 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:314: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 50 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:322: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 51 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:333: RULE_CHOICE
                {
                mRULE_CHOICE(); 

                }
                break;
            case 52 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:345: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 53 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:360: RULE_ASTERISK
                {
                mRULE_ASTERISK(); 

                }
                break;
            case 54 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:374: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 55 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:388: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 56 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:400: RULE_POINTSTO
                {
                mRULE_POINTSTO(); 

                }
                break;
            case 57 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:414: RULE_DEEPCOPYLEFT
                {
                mRULE_DEEPCOPYLEFT(); 

                }
                break;
            case 58 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:432: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 59 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:443: RULE_PERCENT_SIGN
                {
                mRULE_PERCENT_SIGN(); 

                }
                break;
            case 60 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:461: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 61 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:472: RULE_LANGLE
                {
                mRULE_LANGLE(); 

                }
                break;
            case 62 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:484: RULE_RANGLE
                {
                mRULE_RANGLE(); 

                }
                break;
            case 63 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:496: RULE_MAJOR_OR_EQUAL
                {
                mRULE_MAJOR_OR_EQUAL(); 

                }
                break;
            case 64 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:516: RULE_MINOR_OR_EQUAL
                {
                mRULE_MINOR_OR_EQUAL(); 

                }
                break;
            case 65 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:536: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 66 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:551: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 67 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:560: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 68 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:570: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:578: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:587: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:599: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:615: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:631: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\14\60\1\104\14\60\6\uffff\1\123\1\uffff\1\124\4\uffff\1"+
        "\130\2\uffff\1\133\1\136\1\uffff\1\140\1\142\1\143\3\uffff\17\60"+
        "\3\uffff\15\60\22\uffff\2\60\1\u0088\5\60\1\u008e\1\u008f\11\60"+
        "\1\u009a\20\60\1\uffff\1\u00ab\1\60\1\u00ad\1\60\1\u00af\2\uffff"+
        "\1\u00b0\2\60\1\u00b3\1\60\1\u00b5\4\60\1\uffff\1\60\1\u00bb\10"+
        "\60\1\u00c4\5\60\1\uffff\1\60\1\uffff\1\60\2\uffff\2\60\1\uffff"+
        "\1\60\1\uffff\2\60\1\u00d1\2\60\1\uffff\1\u00d4\7\60\1\uffff\6\60"+
        "\1\u00e2\1\u00e3\1\60\1\u00e5\1\u00e6\1\60\1\uffff\1\60\1\u00e9"+
        "\1\uffff\1\60\1\u00eb\10\60\1\u00f4\2\60\2\uffff\1\60\2\uffff\1"+
        "\60\1\u00f9\1\uffff\1\60\1\uffff\10\60\1\uffff\4\60\1\uffff\3\60"+
        "\1\u010a\1\60\1\u010c\2\60\1\u010f\1\u0110\1\u0111\4\60\1\u0116"+
        "\1\uffff\1\60\1\uffff\2\60\3\uffff\2\60\1\u011c\1\60\1\uffff\1\u011e"+
        "\1\u011f\1\u0120\1\60\1\u0122\1\uffff\1\60\3\uffff\1\u0124\1\uffff"+
        "\1\60\1\uffff\2\60\1\u0128\1\uffff";
    static final String DFA16_eofS =
        "\u0129\uffff";
    static final String DFA16_minS =
        "\1\11\1\170\1\156\1\150\1\156\1\141\1\164\1\157\1\145\1\141\1\151"+
        "\1\165\1\156\1\75\1\157\1\154\1\150\1\165\1\156\1\145\1\157\1\156"+
        "\1\162\1\117\1\147\1\157\6\uffff\1\53\1\uffff\1\60\4\uffff\1\55"+
        "\2\uffff\1\52\1\74\1\uffff\2\75\1\56\3\uffff\1\145\1\143\1\151\1"+
        "\160\1\171\1\167\1\141\1\162\1\156\1\151\1\146\1\151\1\156\1\154"+
        "\1\144\3\uffff\1\162\1\157\1\164\1\151\1\164\1\145\1\144\1\143\1"+
        "\164\1\157\1\104\1\147\1\156\22\uffff\1\143\1\154\1\60\1\164\1\165"+
        "\1\163\1\157\1\145\2\60\1\154\1\151\1\143\1\144\1\151\1\156\1\153"+
        "\1\154\1\145\1\60\1\142\1\150\1\154\1\160\1\127\1\165\1\151\1\141"+
        "\1\145\1\164\1\117\1\162\1\143\2\165\1\162\1\uffff\1\60\1\164\1"+
        "\60\1\167\1\60\2\uffff\1\60\1\156\1\150\1\60\1\156\1\60\1\111\1"+
        "\120\1\146\1\141\1\uffff\1\141\1\60\1\145\1\165\1\141\1\145\1\162"+
        "\1\164\1\162\1\157\1\60\1\145\1\165\1\164\1\144\1\146\1\uffff\1"+
        "\120\1\uffff\1\163\2\uffff\1\147\1\162\1\uffff\1\145\1\uffff\1\156"+
        "\1\162\1\60\1\143\1\154\1\uffff\1\60\1\164\1\171\1\163\1\145\1\151"+
        "\1\146\1\143\1\uffff\1\147\1\162\1\151\1\145\1\141\1\157\2\60\1"+
        "\157\2\60\1\157\1\uffff\1\150\1\60\1\uffff\1\120\1\60\1\164\1\143"+
        "\1\157\1\141\1\157\1\141\1\162\1\157\1\60\1\143\1\162\2\uffff\1"+
        "\156\2\uffff\1\143\1\60\1\uffff\1\157\1\uffff\1\122\1\164\1\156"+
        "\1\143\1\154\1\164\1\145\1\156\1\uffff\1\145\1\164\1\151\1\145\1"+
        "\uffff\1\162\1\145\1\163\1\60\1\145\1\60\1\145\1\156\3\60\1\172"+
        "\1\163\1\164\1\163\1\60\1\uffff\1\163\1\uffff\1\163\1\164\3\uffff"+
        "\1\145\1\163\1\60\1\160\1\uffff\3\60\1\144\1\60\1\uffff\1\157\3"+
        "\uffff\1\60\1\uffff\1\156\1\uffff\1\163\1\145\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\175\1\170\1\156\1\171\1\156\1\145\1\171\1\157\1\145\1\141\1\151"+
        "\1\165\1\156\1\76\1\157\1\154\1\151\1\165\1\156\1\145\1\157\1\156"+
        "\1\162\1\117\1\147\1\157\6\uffff\1\53\1\uffff\1\71\4\uffff\1\76"+
        "\2\uffff\1\57\1\75\1\uffff\2\75\1\71\3\uffff\1\145\1\164\1\162\1"+
        "\160\1\171\1\167\1\141\1\162\1\156\1\151\1\146\1\151\1\156\1\154"+
        "\1\144\3\uffff\1\162\1\157\1\164\1\151\1\164\1\145\1\161\1\143\1"+
        "\164\1\157\1\104\1\147\1\156\22\uffff\1\143\1\154\1\172\1\164\1"+
        "\165\1\163\1\157\1\145\2\172\1\154\1\151\1\143\1\144\1\151\1\156"+
        "\1\153\1\154\1\145\1\172\1\142\1\150\1\154\1\160\1\127\1\165\1\151"+
        "\1\141\1\145\1\164\1\117\1\162\1\143\2\165\1\162\1\uffff\1\172\1"+
        "\164\1\172\1\167\1\172\2\uffff\1\172\1\156\1\150\1\172\1\156\1\172"+
        "\1\111\1\120\1\146\1\141\1\uffff\1\141\1\172\1\145\1\165\1\141\1"+
        "\145\1\162\1\164\1\162\1\157\1\172\1\145\1\165\1\164\1\144\1\146"+
        "\1\uffff\1\120\1\uffff\1\163\2\uffff\1\147\1\162\1\uffff\1\145\1"+
        "\uffff\1\156\1\162\1\172\1\143\1\154\1\uffff\1\172\1\164\1\171\1"+
        "\163\1\145\1\151\1\146\1\143\1\uffff\1\147\1\162\1\151\1\145\1\141"+
        "\1\157\2\172\1\157\2\172\1\157\1\uffff\1\150\1\172\1\uffff\1\120"+
        "\1\172\1\164\1\143\1\157\1\141\1\157\1\141\1\162\1\157\1\172\1\143"+
        "\1\162\2\uffff\1\156\2\uffff\1\143\1\172\1\uffff\1\157\1\uffff\1"+
        "\122\1\164\1\156\1\143\1\154\1\164\1\145\1\156\1\uffff\1\145\1\164"+
        "\1\151\1\145\1\uffff\1\162\1\145\1\163\1\172\1\145\1\172\1\145\1"+
        "\156\4\172\1\163\1\164\1\163\1\172\1\uffff\1\163\1\uffff\1\163\1"+
        "\164\3\uffff\1\145\1\163\1\172\1\160\1\uffff\3\172\1\144\1\172\1"+
        "\uffff\1\157\3\uffff\1\172\1\uffff\1\156\1\uffff\1\163\1\145\1\172"+
        "\1\uffff";
    static final String DFA16_acceptS =
        "\32\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\uffff\1\53\1\uffff\1\56"+
        "\1\57\1\60\1\61\1\uffff\1\65\1\66\2\uffff\1\73\3\uffff\1\104\1\106"+
        "\1\111\17\uffff\1\74\1\22\1\54\15\uffff\1\63\1\52\1\55\1\103\1\70"+
        "\1\64\1\72\1\107\1\110\1\67\1\71\1\100\1\75\1\77\1\76\1\101\1\102"+
        "\1\105\44\uffff\1\5\5\uffff\1\4\1\6\12\uffff\1\23\20\uffff\1\13"+
        "\1\uffff\1\21\1\uffff\1\3\1\11\2\uffff\1\10\1\uffff\1\14\5\uffff"+
        "\1\26\10\uffff\1\40\14\uffff\1\20\2\uffff\1\62\15\uffff\1\34\1\7"+
        "\1\uffff\1\12\1\15\2\uffff\1\25\1\uffff\1\32\10\uffff\1\2\4\uffff"+
        "\1\24\20\uffff\1\35\1\uffff\1\37\2\uffff\1\1\1\27\1\30\4\uffff\1"+
        "\41\5\uffff\1\31\1\uffff\1\36\1\42\1\43\1\uffff\1\16\1\uffff\1\17"+
        "\3\uffff\1\33";
    static final String DFA16_specialS =
        "\u0129\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\62\2\uffff\1\62\22\uffff\1\62\1\56\1\61\2\uffff\1\54\1\uffff"+
            "\1\61\1\43\1\44\1\50\1\40\1\45\1\47\1\42\1\52\12\57\1\37\1\36"+
            "\1\53\1\15\1\55\1\51\1\46\1\30\7\60\1\25\2\60\1\24\2\60\1\22"+
            "\1\26\1\60\1\23\1\60\1\27\6\60\1\34\1\uffff\1\35\2\60\1\uffff"+
            "\1\4\1\60\1\31\1\10\1\1\1\16\1\17\1\60\1\2\2\60\1\12\1\11\1"+
            "\13\1\21\2\60\1\5\1\6\1\3\1\14\1\7\1\20\3\60\1\32\1\41\1\33",
            "\1\63",
            "\1\64",
            "\1\65\20\uffff\1\66",
            "\1\67",
            "\1\70\3\uffff\1\71",
            "\1\72\4\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102\1\103",
            "\1\105",
            "\1\106",
            "\1\110\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "",
            "\12\125",
            "",
            "",
            "",
            "",
            "\1\127\20\uffff\1\126",
            "",
            "",
            "\1\131\4\uffff\1\132",
            "\1\134\1\135",
            "",
            "\1\137",
            "\1\141",
            "\1\125\1\uffff\12\57",
            "",
            "",
            "",
            "\1\144",
            "\1\145\5\uffff\1\147\6\uffff\1\150\3\uffff\1\146",
            "\1\151\10\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\176\14\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
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
            "\1\u0085",
            "\1\u0086",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0087\25\60",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0099\25\60",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ac",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ae",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b1",
            "\1\u00b2",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00ea",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "",
            "\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010d",
            "\1\u010e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0117",
            "",
            "\1\u0118",
            "\1\u0119",
            "",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011d",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0121",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0123",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            return "1:1: Tokens : ( T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | RULE_CONCURRENT | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_AT | RULE_WHILE | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_QUESTION | RULE_DIVIDE | RULE_POINTSTO | RULE_DEEPCOPYLEFT | RULE_MINUS | RULE_PERCENT_SIGN | RULE_EQUAL | RULE_LANGLE | RULE_RANGLE | RULE_MAJOR_OR_EQUAL | RULE_MINOR_OR_EQUAL | RULE_NOT_EQUAL | RULE_NOT | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}