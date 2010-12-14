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
    public static final int RULE_RCURLY=10;
    public static final int RULE_CHOICE=16;
    public static final int RULE_ML_COMMENT=31;
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
    public static final int T35=35;
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
    public static final int Tokens=36;
    public static final int RULE_DIVIDE=7;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_DECREMENT=17;
    public static final int RULE_GLOBAL=21;
    public static final int RULE_PLUS=4;
    public static final int RULE_LCURLY=9;
    public InternalJolieLexer() {;} 
    public InternalJolieLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g"; }

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:10:5: ( 'main' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:10:7: 'main'
            {
            match("main"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start RULE_LCURLY
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3771:13: ( '{' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3771:15: '{'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3773:13: ( '}' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3773:15: '}'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3775:14: ( '[' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3775:16: '['
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3777:14: ( ']' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3777:16: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RSQUARE

    // $ANTLR start RULE_ARROW
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3779:12: ( '->' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3779:14: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ARROW

    // $ANTLR start RULE_SEMICOLON
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3781:16: ( ';' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3781:18: ';'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3783:12: ( ':' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3783:14: ':'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3785:11: ( '+' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3785:13: '+'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3787:11: ( '|' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3787:13: '|'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3789:13: ( '=' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3789:15: '='
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3791:10: ( '.' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3791:12: '.'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3793:13: ( '(' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3793:15: '('
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3795:13: ( ')' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3795:15: ')'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3797:12: ( ',' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3797:14: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMA

    // $ANTLR start RULE_LINKIN
    public final void mRULE_LINKIN() throws RecognitionException {
        try {
            int _type = RULE_LINKIN;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3799:13: ( 'linkIn' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3799:15: 'linkIn'
            {
            match("linkIn"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LINKIN

    // $ANTLR start RULE_WHILE
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3801:12: ( 'while' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3801:14: 'while'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3803:13: ( '++' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3803:15: '++'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3805:16: ( '--' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3805:18: '--'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3807:15: ( '*' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3807:17: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ASTERISK

    // $ANTLR start RULE_DIVIDE
    public final void mRULE_DIVIDE() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3809:13: ( '/' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3809:15: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DIVIDE

    // $ANTLR start RULE_MINUS
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3811:12: ( '-' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3811:14: '-'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3813:19: ( '%' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3813:21: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PERCENT_SIGN

    // $ANTLR start RULE_GLOBAL
    public final void mRULE_GLOBAL() throws RecognitionException {
        try {
            int _type = RULE_GLOBAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3815:13: ( 'global' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3815:15: 'global'
            {
            match("global"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_GLOBAL

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:11: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:13: ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:13: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('.'); 
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:29: ( '0' .. '9' )+
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
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:30: '0' .. '9'
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

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:41: ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:42: ( 'e' | 'E' ) ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:52: ( '0' .. '9' )+
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
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3817:53: '0' .. '9'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:11: '^'
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

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3819:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3821:10: ( ( '0' .. '9' )+ )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3821:12: ( '0' .. '9' )+
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3821:12: ( '0' .. '9' )+
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
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3821:13: '0' .. '9'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("3823:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3823:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3825:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3825:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3825:24: ( options {greedy=false; } : . )*
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
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3825:52: .
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:41: ( '\\r' )? '\\n'
                    {
                    // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3827:41: '\\r'
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3829:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3829:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3829:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3831:16: ( . )
            // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:3831:18: .
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
        // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:8: ( T35 | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_ARROW | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_LINKIN | RULE_WHILE | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_DIVIDE | RULE_MINUS | RULE_PERCENT_SIGN | RULE_GLOBAL | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=32;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:10: T35
                {
                mT35(); 

                }
                break;
            case 2 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:14: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 3 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:26: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 4 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:38: RULE_LSQUARE
                {
                mRULE_LSQUARE(); 

                }
                break;
            case 5 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:51: RULE_RSQUARE
                {
                mRULE_RSQUARE(); 

                }
                break;
            case 6 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:64: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 7 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:75: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 8 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:90: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 9 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:101: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 10 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:111: RULE_VERT
                {
                mRULE_VERT(); 

                }
                break;
            case 11 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:121: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 12 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:133: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 13 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:142: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 14 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:154: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 15 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:166: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 16 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:177: RULE_LINKIN
                {
                mRULE_LINKIN(); 

                }
                break;
            case 17 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:189: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 18 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:200: RULE_CHOICE
                {
                mRULE_CHOICE(); 

                }
                break;
            case 19 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:212: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 20 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:227: RULE_ASTERISK
                {
                mRULE_ASTERISK(); 

                }
                break;
            case 21 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:241: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 22 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:253: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 23 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:264: RULE_PERCENT_SIGN
                {
                mRULE_PERCENT_SIGN(); 

                }
                break;
            case 24 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:282: RULE_GLOBAL
                {
                mRULE_GLOBAL(); 

                }
                break;
            case 25 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:294: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 26 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:304: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:312: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:321: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:333: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:349: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:365: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g:1:373: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\36\4\uffff\1\45\2\uffff\1\51\2\uffff\1\54\3\uffff\2\36"+
        "\1\uffff\1\66\1\uffff\1\36\1\71\1\34\1\uffff\2\34\2\uffff\1\36\23"+
        "\uffff\2\36\5\uffff\1\36\1\uffff\1\71\2\uffff\4\36\1\105\3\36\1"+
        "\uffff\1\36\1\112\1\36\1\114\1\uffff\1\115\2\uffff";
    static final String DFA16_eofS =
        "\116\uffff";
    static final String DFA16_minS =
        "\1\0\1\141\4\uffff\1\55\2\uffff\1\53\2\uffff\1\60\3\uffff\1\151"+
        "\1\150\1\uffff\1\52\1\uffff\1\154\1\56\1\101\1\uffff\2\0\2\uffff"+
        "\1\151\23\uffff\1\156\1\151\5\uffff\1\157\1\uffff\1\56\2\uffff\1"+
        "\156\1\153\1\154\1\142\1\60\1\111\1\145\1\141\1\uffff\1\156\1\60"+
        "\1\154\1\60\1\uffff\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\ufffe\1\141\4\uffff\1\76\2\uffff\1\53\2\uffff\1\71\3\uffff\1"+
        "\151\1\150\1\uffff\1\57\1\uffff\1\154\1\71\1\172\1\uffff\2\ufffe"+
        "\2\uffff\1\151\23\uffff\1\156\1\151\5\uffff\1\157\1\uffff\1\71\2"+
        "\uffff\1\156\1\153\1\154\1\142\1\172\1\111\1\145\1\141\1\uffff\1"+
        "\156\1\172\1\154\1\172\1\uffff\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\12\1\13\1\uffff"+
        "\1\15\1\16\1\17\2\uffff\1\24\1\uffff\1\27\3\uffff\1\32\2\uffff\1"+
        "\37\1\40\1\uffff\1\32\1\2\1\3\1\4\1\5\1\23\1\6\1\26\1\7\1\10\1\22"+
        "\1\11\1\12\1\13\1\14\1\31\1\15\1\16\1\17\2\uffff\1\24\1\36\1\35"+
        "\1\25\1\27\1\uffff\1\33\1\uffff\1\34\1\37\10\uffff\1\1\4\uffff\1"+
        "\21\1\uffff\1\20\1\30";
    static final String DFA16_specialS =
        "\116\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\31\2\34\1\24\1\34\1"+
            "\32\1\15\1\16\1\22\1\11\1\17\1\6\1\14\1\23\12\26\1\10\1\7\1"+
            "\34\1\13\3\34\32\30\1\4\1\34\1\5\1\27\1\30\1\34\6\30\1\25\4"+
            "\30\1\20\1\1\11\30\1\21\3\30\1\2\1\12\1\3\uff81\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "\1\43\20\uffff\1\44",
            "",
            "",
            "\1\50",
            "",
            "",
            "\12\55",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\65\4\uffff\1\64",
            "",
            "\1\70",
            "\1\55\1\uffff\12\72",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\uffff\73",
            "\uffff\73",
            "",
            "",
            "\1\75",
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
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "\1\55\1\uffff\12\72",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\113",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
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
            return "1:1: Tokens : ( T35 | RULE_LCURLY | RULE_RCURLY | RULE_LSQUARE | RULE_RSQUARE | RULE_ARROW | RULE_SEMICOLON | RULE_COLON | RULE_PLUS | RULE_VERT | RULE_ASSIGN | RULE_DOT | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_LINKIN | RULE_WHILE | RULE_CHOICE | RULE_DECREMENT | RULE_ASTERISK | RULE_DIVIDE | RULE_MINUS | RULE_PERCENT_SIGN | RULE_GLOBAL | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}