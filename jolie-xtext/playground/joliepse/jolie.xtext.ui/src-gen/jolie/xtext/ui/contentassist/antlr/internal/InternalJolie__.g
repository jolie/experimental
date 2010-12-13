lexer grammar InternalJolie;
@header {
package jolie.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T34 : 'main' ;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2665
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2667
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2669
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2671
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2673
RULE_ARROW : '->';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2675
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2677
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2679
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2681
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2683
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2685
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2687
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2689
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2691
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2693
RULE_LINKIN : 'linkIn';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2695
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2697
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2699
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2701
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2703
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2705
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2707
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2709
RULE_REAL : ('0'..'9')* '.' ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2711
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2713
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2715
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2717
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2719
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2721
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 2723
RULE_ANY_OTHER : .;


