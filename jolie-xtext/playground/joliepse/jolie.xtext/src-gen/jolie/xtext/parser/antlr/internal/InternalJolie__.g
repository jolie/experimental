lexer grammar InternalJolie;
@header {
package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T35 : 'main' ;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1532
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1534
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1536
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1538
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1540
RULE_ARROW : '->';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1542
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1544
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1546
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1548
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1550
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1552
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1554
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1556
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1558
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1560
RULE_LINKIN : 'linkIn';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1562
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1564
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1566
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1568
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1570
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1572
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1574
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1576
RULE_GLOBAL : 'global';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1578
RULE_REAL : ('0'..'9')* '.' ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1580
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1582
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1584
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1586
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1588
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1590
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 1592
RULE_ANY_OTHER : .;


