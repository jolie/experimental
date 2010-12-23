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
    public static final int RULE_COLON=7;
    public static final int RULE_STRING=26;
    public static final int RULE_LSQUARE=27;
    public static final int RULE_PERCENT_SIGN=32;
    public static final int RULE_RPAREN=13;
    public static final int RULE_ASSIGN=16;
    public static final int RULE_ID_PRE=10;
    public static final int RULE_ASTERISK=5;
    public static final int T45=45;
    public static final int RULE_NATIVE_TYPE=8;
    public static final int RULE_DOT=29;
    public static final int RULE_MINUS=22;
    public static final int RULE_VERT=14;
    public static final int RULE_QUESTION=4;
    public static final int T37=37;
    public static final int RULE_DEEPCOPYLEFT=20;
    public static final int RULE_INT=24;
    public static final int RULE_RSQUARE=28;
    public static final int T51=51;
    public static final int RULE_DIVIDE=23;
    public static final int T46=46;
    public static final int T38=38;
    public static final int RULE_DECREMENT=18;
    public static final int T41=41;
    public static final int RULE_PLUS=21;
    public static final int T39=39;
    public static final int T44=44;
    public static final int RULE_RCURLY=11;
    public static final int RULE_ML_COMMENT=33;
    public static final int RULE_CHOICE=17;
    public static final int RULE_ID=6;
    public static final int RULE_WHILE=31;
    public static final int T50=50;
    public static final int RULE_LPAREN=12;
    public static final int T43=43;
    public static final int RULE_SEMICOLON=15;
    public static final int RULE_REAL=25;
    public static final int T42=42;
    public static final int RULE_COMMA=30;
    public static final int T40=40;
    public static final int RULE_WS=35;
    public static final int T48=48;
    public static final int EOF=-1;
    public static final int T47=47;
    public static final int Tokens=54;
    public static final int T53=53;
    public static final int RULE_ANY_OTHER=36;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=34;
    public static final int T52=52;
    public static final int RULE_POINTSTO=19;
    public static final int RULE_LCURLY=9;
    public InternalJolieLexer() {;} 
    public InternalJolieLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g"; }

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:10:5: ( 'type' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:10:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:11:5: ( 'main' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:11:7: 'main'
            {
            match("main"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:12:5: ( 'global' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:12:7: 'global'
            {
            match("global"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:13:5: ( 'with' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:13:7: 'with'
            {
            match("with"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:14:5: ( 'linkIn' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:14:7: 'linkIn'
            {
            match("linkIn"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:15:5: ( 'inputPort' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:15:7: 'inputPort'
            {
            match("inputPort"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:16:5: ( 'outputPort' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:16:7: 'outputPort'
            {
            match("outputPort"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:17:5: ( 'OneWay' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:17:7: 'OneWay'
            {
            match("OneWay"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:18:5: ( 'RequestResponse' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:18:7: 'RequestResponse'
            {
            match("RequestResponse"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:19:5: ( 'throws' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:19:7: 'throws'
            {
            match("throws"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:20:5: ( 'Location' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:20:7: 'Location'
            {
            match("Location"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:21:5: ( 'Interfaces' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:21:7: 'Interfaces'
            {
            match("Interfaces"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:22:5: ( 'Protocol' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:22:7: 'Protocol'
            {
            match("Protocol"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:23:5: ( 'TODO' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:23:7: 'TODO'
            {
            match("TODO"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:24:5: ( 'Redirects' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:24:7: 'Redirects'
            {
            match("Redirects"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:25:5: ( '=>' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:25:7: '=>'
            {
            match("=>"); 


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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:26:5: ( 'Aggregates' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:26:7: 'Aggregates'
            {
            match("Aggregates"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start RULE_NATIVE_TYPE
    public final void mRULE_NATIVE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_NATIVE_TYPE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:18: ( ( 'int' | 'real' | 'string' | 'void' )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:20: ( 'int' | 'real' | 'string' | 'void' )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:20: ( 'int' | 'real' | 'string' | 'void' )?
            int alt1=5;
            switch ( input.LA(1) ) {
                case 'i':
                    {
                    alt1=1;
                    }
                    break;
                case 'r':
                    {
                    alt1=2;
                    }
                    break;
                case 's':
                    {
                    alt1=3;
                    }
                    break;
                case 'v':
                    {
                    alt1=4;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:21: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:27: 'real'
                    {
                    match("real"); 


                    }
                    break;
                case 3 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:34: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 4 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4071:43: 'void'
                    {
                    match("void"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NATIVE_TYPE

    // $ANTLR start RULE_ID_PRE
    public final void mRULE_ID_PRE() throws RecognitionException {
        try {
            int _type = RULE_ID_PRE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4073:13: ( '.' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4073:15: '.' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('.'); 
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4073:19: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4073:19: '^'
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4073:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID_PRE

    // $ANTLR start RULE_LCURLY
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4075:13: ( '{' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4075:15: '{'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4077:13: ( '}' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4077:15: '}'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4079:14: ( '[' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4079:16: '['
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4081:14: ( ']' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4081:16: ']'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4083:16: ( ';' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4083:18: ';'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4085:12: ( ':' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4085:14: ':'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4087:11: ( '+' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4087:13: '+'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4089:11: ( '|' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4089:13: '|'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4091:13: ( '=' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4091:15: '='
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4093:10: ( '.' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4093:12: '.'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4095:13: ( '(' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4095:15: '('
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4097:13: ( ')' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4097:15: ')'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4099:12: ( ',' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4099:14: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMA

    // $ANTLR start RULE_WHILE
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4101:12: ( 'while' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4101:14: 'while'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4103:13: ( '++' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4103:15: '++'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4105:16: ( '--' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4105:18: '--'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4107:15: ( '*' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4107:17: '*'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4109:15: ( '?' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4109:17: '?'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4111:13: ( '/' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4111:15: '/'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4113:15: ( '->' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4113:17: '->'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4115:19: ( '<<' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4115:21: '<<'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4117:12: ( '-' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4117:14: '-'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4119:19: ( '%' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4119:21: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PERCENT_SIGN

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:11: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:13: ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:13: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('.'); 
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:29: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:41: ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:42: ( 'e' | 'E' ) ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:52: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4121:53: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4123:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4123:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4123:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4123:11: '^'
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

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4123:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4125:10: ( ( '0' .. '9' )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4125:12: ( '0' .. '9' )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4125:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4125:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4127:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFE')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4127:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4129:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4129:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4129:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFE')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4129:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:41: ( '\\r' )? '\\n'
                    {
                    // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4131:41: '\\r'
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4133:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4133:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4133:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4135:16: ( . )
            // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:4135:18: .
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
        // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:8: ( T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | RULE_NATIVE_TYPE | RULE_ID_PRE | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_WHILE | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_QUESTION | RULE_DIVIDE | RULE_POINTSTO | RULE_DEEPCOPYLEFT | RULE_MINUS | RULE_PERCENT_SIGN | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=50;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:10: T37
                {
                mT37(); 

                }
                break;
            case 2 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:14: T38
                {
                mT38(); 

                }
                break;
            case 3 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:18: T39
                {
                mT39(); 

                }
                break;
            case 4 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:22: T40
                {
                mT40(); 

                }
                break;
            case 5 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:26: T41
                {
                mT41(); 

                }
                break;
            case 6 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:30: T42
                {
                mT42(); 

                }
                break;
            case 7 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:34: T43
                {
                mT43(); 

                }
                break;
            case 8 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:38: T44
                {
                mT44(); 

                }
                break;
            case 9 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:42: T45
                {
                mT45(); 

                }
                break;
            case 10 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:46: T46
                {
                mT46(); 

                }
                break;
            case 11 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:50: T47
                {
                mT47(); 

                }
                break;
            case 12 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:54: T48
                {
                mT48(); 

                }
                break;
            case 13 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:58: T49
                {
                mT49(); 

                }
                break;
            case 14 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:62: T50
                {
                mT50(); 

                }
                break;
            case 15 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:66: T51
                {
                mT51(); 

                }
                break;
            case 16 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:70: T52
                {
                mT52(); 

                }
                break;
            case 17 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:74: T53
                {
                mT53(); 

                }
                break;
            case 18 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:78: RULE_NATIVE_TYPE
                {
                mRULE_NATIVE_TYPE(); 

                }
                break;
            case 19 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:95: RULE_ID_PRE
                {
                mRULE_ID_PRE(); 

                }
                break;
            case 20 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:107: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 21 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:119: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 22 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:131: RULE_LSQUARE
                {
                mRULE_LSQUARE(); 

                }
                break;
            case 23 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:144: RULE_RSQUARE
                {
                mRULE_RSQUARE(); 

                }
                break;
            case 24 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:157: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 25 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:172: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 26 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:183: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 27 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:193: RULE_VERT
                {
                mRULE_VERT(); 

                }
                break;
            case 28 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:203: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 29 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:215: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 30 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:224: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 31 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:236: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 32 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:248: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 33 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:259: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 34 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:270: RULE_CHOICE
                {
                mRULE_CHOICE(); 

                }
                break;
            case 35 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:282: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 36 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:297: RULE_ASTERISK
                {
                mRULE_ASTERISK(); 

                }
                break;
            case 37 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:311: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 38 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:325: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 39 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:337: RULE_POINTSTO
                {
                mRULE_POINTSTO(); 

                }
                break;
            case 40 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:351: RULE_DEEPCOPYLEFT
                {
                mRULE_DEEPCOPYLEFT(); 

                }
                break;
            case 41 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:369: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 42 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:380: RULE_PERCENT_SIGN
                {
                mRULE_PERCENT_SIGN(); 

                }
                break;
            case 43 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:398: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 44 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:408: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:416: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:425: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:437: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:453: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:469: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // ../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g:1:477: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\23\15\57\1\76\4\57\1\uffff\1\103\6\uffff\1\115\4\uffff\1\124"+
        "\2\uffff\1\131\1\54\1\uffff\1\134\1\54\1\uffff\2\54\2\uffff\2\57"+
        "\1\uffff\15\57\2\uffff\4\57\32\uffff\1\134\2\uffff\7\57\1\23\15"+
        "\57\1\u0089\1\57\1\u008b\2\57\1\u008e\11\57\1\u0098\1\57\1\23\1"+
        "\57\1\23\1\uffff\1\57\1\uffff\1\57\1\u009d\1\uffff\11\57\1\uffff"+
        "\2\57\1\u00a9\1\u00aa\1\uffff\1\u00ab\2\57\1\u00ae\6\57\1\23\3\uffff"+
        "\2\57\1\uffff\12\57\1\u00c1\1\57\1\u00c3\1\57\1\u00c5\1\57\1\u00c7"+
        "\1\57\1\uffff\1\57\1\uffff\1\57\1\uffff\1\u00cb\1\uffff\1\57\1\u00cd"+
        "\1\u00ce\1\uffff\1\57\2\uffff\3\57\1\u00d3\1\uffff";
    static final String DFA19_eofS =
        "\u00d4\uffff";
    static final String DFA19_minS =
        "\1\0\1\150\1\141\1\154\1\150\1\151\1\156\1\165\1\156\1\145\1\157"+
        "\1\156\1\162\1\117\1\76\1\147\1\145\1\164\1\157\1\uffff\1\60\6\uffff"+
        "\1\53\4\uffff\1\55\2\uffff\1\52\1\74\1\uffff\1\56\1\101\1\uffff"+
        "\2\0\2\uffff\1\160\1\162\1\uffff\1\151\1\157\1\151\1\164\1\156\1"+
        "\160\1\164\1\145\1\144\1\143\1\164\1\157\1\104\2\uffff\1\147\1\141"+
        "\1\162\1\151\32\uffff\1\56\2\uffff\1\145\1\157\1\156\1\142\1\154"+
        "\1\150\1\153\1\60\1\165\1\160\1\127\1\151\1\165\1\141\1\145\1\164"+
        "\1\117\1\162\1\154\1\151\1\144\1\60\1\167\1\60\1\141\1\145\1\60"+
        "\1\111\1\164\1\165\1\141\1\162\1\145\1\164\1\162\1\157\1\60\1\145"+
        "\1\60\1\156\1\60\1\uffff\1\163\1\uffff\1\154\1\60\1\uffff\1\156"+
        "\1\120\1\164\1\171\1\145\1\163\1\151\1\146\1\143\1\uffff\2\147\2"+
        "\60\1\uffff\1\60\1\157\1\120\1\60\1\143\1\164\1\157\1\141\1\157"+
        "\1\141\1\60\3\uffff\1\162\1\157\1\uffff\1\164\1\122\1\156\1\143"+
        "\1\154\2\164\1\162\1\163\1\145\1\60\1\145\1\60\1\145\1\60\1\164"+
        "\1\60\1\163\1\uffff\1\163\1\uffff\1\163\1\uffff\1\60\1\uffff\1\160"+
        "\2\60\1\uffff\1\157\2\uffff\1\156\1\163\1\145\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\ufffe\1\171\1\141\1\154\2\151\1\156\1\165\1\156\1\145\1\157\1"+
        "\156\1\162\1\117\1\76\1\147\1\145\1\164\1\157\1\uffff\1\172\6\uffff"+
        "\1\53\4\uffff\1\76\2\uffff\1\57\1\74\1\uffff\1\71\1\172\1\uffff"+
        "\2\ufffe\2\uffff\1\160\1\162\1\uffff\1\151\1\157\1\151\1\164\1\156"+
        "\2\164\1\145\1\161\1\143\1\164\1\157\1\104\2\uffff\1\147\1\141\1"+
        "\162\1\151\32\uffff\1\71\2\uffff\1\145\1\157\1\156\1\142\1\154\1"+
        "\150\1\153\1\172\1\165\1\160\1\127\1\151\1\165\1\141\1\145\1\164"+
        "\1\117\1\162\1\154\1\151\1\144\1\172\1\167\1\172\1\141\1\145\1\172"+
        "\1\111\1\164\1\165\1\141\1\162\1\145\1\164\1\162\1\157\1\172\1\145"+
        "\1\172\1\156\1\172\1\uffff\1\163\1\uffff\1\154\1\172\1\uffff\1\156"+
        "\1\120\1\164\1\171\1\145\1\163\1\151\1\146\1\143\1\uffff\2\147\2"+
        "\172\1\uffff\1\172\1\157\1\120\1\172\1\143\1\164\1\157\1\141\1\157"+
        "\1\141\1\172\3\uffff\1\162\1\157\1\uffff\1\164\1\122\1\156\1\143"+
        "\1\154\2\164\1\162\1\163\1\145\1\172\1\145\1\172\1\145\1\172\1\164"+
        "\1\172\1\163\1\uffff\1\163\1\uffff\1\163\1\uffff\1\172\1\uffff\1"+
        "\160\2\172\1\uffff\1\157\2\uffff\1\156\1\163\1\145\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\23\uffff\1\22\1\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\uffff\1\33"+
        "\1\36\1\37\1\40\1\uffff\1\44\1\45\2\uffff\1\52\2\uffff\1\54\2\uffff"+
        "\1\61\1\62\2\uffff\1\54\15\uffff\1\20\1\34\4\uffff\1\35\1\23\1\53"+
        "\1\24\1\25\1\26\1\27\1\30\1\31\1\42\1\32\1\33\1\36\1\37\1\40\1\47"+
        "\1\43\1\51\1\44\1\45\1\57\1\60\1\46\1\50\1\52\1\55\1\uffff\1\56"+
        "\1\61\51\uffff\1\1\1\uffff\1\2\2\uffff\1\4\11\uffff\1\16\4\uffff"+
        "\1\41\13\uffff\1\12\1\3\1\5\2\uffff\1\10\22\uffff\1\13\1\uffff\1"+
        "\15\1\uffff\1\6\1\uffff\1\17\3\uffff\1\7\1\uffff\1\14\1\21\4\uffff"+
        "\1\11";
    static final String DFA19_specialS =
        "\u00d4\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\51\2\54\1\45\1\54\1"+
            "\52\1\35\1\36\1\41\1\33\1\37\1\40\1\24\1\43\12\46\1\32\1\31"+
            "\1\44\1\16\1\54\1\42\1\54\1\17\7\50\1\13\2\50\1\12\2\50\1\10"+
            "\1\14\1\50\1\11\1\50\1\15\6\50\1\27\1\54\1\30\1\47\1\50\1\54"+
            "\6\50\1\3\1\50\1\6\2\50\1\5\1\2\1\50\1\7\2\50\1\20\1\21\1\1"+
            "\1\50\1\22\1\4\3\50\1\25\1\34\1\26\uff81\54",
            "\1\56\20\uffff\1\55",
            "\1\60",
            "\1\61",
            "\1\62\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\12\105\7\uffff\32\104\3\uffff\2\104\1\uffff\32\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "",
            "",
            "\1\123\20\uffff\1\122",
            "",
            "",
            "\1\127\4\uffff\1\130",
            "\1\132",
            "",
            "\1\105\1\uffff\12\135",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\uffff\136",
            "\uffff\136",
            "",
            "",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\150\3\uffff\1\147",
            "\1\151",
            "\1\152",
            "\1\153\14\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
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
            "",
            "\1\105\1\uffff\12\135",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008c",
            "\1\u008d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0099",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u009b",
            "",
            "\1\u009c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ac",
            "\1\u00ad",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00cc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | RULE_NATIVE_TYPE | RULE_ID_PRE | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_WHILE | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_QUESTION | RULE_DIVIDE | RULE_POINTSTO | RULE_DEEPCOPYLEFT | RULE_MINUS | RULE_PERCENT_SIGN | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}