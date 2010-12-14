lexer grammar InternalJolie;
@header {
package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T35 : 'main' ;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1609
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1611
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1613
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1615
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1617
RULE_ARROW : '->';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1619
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1621
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1623
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1625
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1627
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1629
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1631
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1633
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1635
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1637
RULE_LINKIN : 'linkIn';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1639
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1641
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1643
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1645
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1647
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1649
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1651
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1653
RULE_GLOBAL : 'global';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1655
RULE_REAL : ('0'..'9')* '.' ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1657
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1659
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1661
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1663
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1665
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1667
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1669
RULE_ANY_OTHER : .;


