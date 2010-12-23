lexer grammar InternalJolie;
@header {
package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T37 : 'type' ;
T38 : 'main' ;
T39 : 'global' ;
T40 : 'with' ;
T41 : 'linkIn' ;
T42 : 'inputPort' ;
T43 : 'outputPort' ;
T44 : 'OneWay' ;
T45 : 'RequestResponse' ;
T46 : 'throws' ;
T47 : 'Location' ;
T48 : 'Interfaces' ;
T49 : 'Protocol' ;
T50 : 'TODO' ;
T51 : 'Redirects' ;
T52 : '=>' ;
T53 : 'Aggregates' ;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4071
RULE_NATIVE_TYPE : ('int'|'real'|'string'|'void')?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4073
RULE_ID_PRE : '.' '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4075
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4077
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4079
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4081
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4083
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4085
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4087
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4089
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4091
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4093
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4095
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4097
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4099
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4101
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4103
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4105
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4107
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4109
RULE_QUESTION : '?';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4111
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4113
RULE_POINTSTO : '->';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4115
RULE_DEEPCOPYLEFT : '<<';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4117
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4119
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4121
RULE_REAL : ('0'..'9')* '.' ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4123
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4125
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4127
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4129
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4131
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4133
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 4135
RULE_ANY_OTHER : .;


