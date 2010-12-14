lexer grammar InternalJolie;
@header {
package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T35 : 'main' ;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1646
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1648
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1650
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1652
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1654
RULE_ARROW : '->';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1656
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1658
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1660
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1662
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1664
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1666
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1668
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1670
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1672
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1674
RULE_LINKIN : 'linkIn';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1676
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1678
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1680
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1682
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1684
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1686
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1688
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1690
RULE_GLOBAL : 'global';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1692
RULE_REAL : ('0'..'9')* '.' ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1694
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1696
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1698
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1700
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1702
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1704
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1706
RULE_ANY_OTHER : .;


