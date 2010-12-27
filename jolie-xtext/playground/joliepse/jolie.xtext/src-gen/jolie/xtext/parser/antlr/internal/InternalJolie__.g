lexer grammar InternalJolie;
@header {
package jolie.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T43 : 'execution' ;
T44 : 'include' ;
T45 : 'type' ;
T46 : 'any' ;
T47 : 'int' ;
T48 : 'raw' ;
T49 : 'string' ;
T50 : 'void' ;
T51 : 'real' ;
T52 : 'define' ;
T53 : 'init' ;
T54 : 'main' ;
T55 : 'linkIn' ;
T56 : 'nullProcess' ;
T57 : 'synchronized' ;
T58 : 'undef' ;
T59 : 'this' ;
T60 : '=>' ;
T61 : 'for' ;
T62 : 'foreach' ;
T63 : 'global' ;
T64 : 'with' ;
T65 : 'interface' ;
T66 : 'inputPort' ;
T67 : 'outputPort' ;
T68 : 'OneWay' ;
T69 : 'RequestResponse' ;
T70 : 'throws' ;
T71 : 'Location' ;
T72 : 'Interfaces' ;
T73 : 'Protocol' ;
T74 : 'TODO' ;
T75 : 'Redirects' ;
T76 : 'Aggregates' ;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6177
RULE_CONCURRENT : 'concurrent';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6179
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6181
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6183
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6185
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6187
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6189
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6191
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6193
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6195
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6197
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6199
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6201
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6203
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6205
RULE_AT : '@';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6207
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6209
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6211
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6213
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6215
RULE_QUESTION : '?';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6217
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6219
RULE_POINTSTO : '->';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6221
RULE_DEEPCOPYLEFT : '<<';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6223
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6225
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6227
RULE_EQUAL : '==';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6229
RULE_LANGLE : '<';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6231
RULE_RANGLE : '>';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6233
RULE_MAJOR_OR_EQUAL : '>=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6235
RULE_MINOR_OR_EQUAL : '<=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6237
RULE_NOT_EQUAL : '!=';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6239
RULE_NOT : '!';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6241
RULE_REAL : ('0'..'9')* RULE_DOT ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6243
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6245
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6247
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6249
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6251
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext/src-gen/jolie/xtext/parser/antlr/internal/InternalJolie.g" 6253
RULE_WS : (' '|'\t'|'\r'|'\n')+;


