lexer grammar InternalJolie;
@header {
package jolie.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T43 : 'nullProcess' ;
T44 : 'any' ;
T45 : 'int' ;
T46 : 'raw' ;
T47 : 'string' ;
T48 : 'void' ;
T49 : 'real' ;
T50 : 'this' ;
T51 : 'global' ;
T52 : 'execution' ;
T53 : 'include' ;
T54 : 'type' ;
T55 : 'define' ;
T56 : 'linkIn' ;
T57 : 'synchronized' ;
T58 : 'undef' ;
T59 : '=>' ;
T60 : 'for' ;
T61 : 'foreach' ;
T62 : 'with' ;
T63 : 'interface' ;
T64 : 'inputPort' ;
T65 : 'outputPort' ;
T66 : 'OneWay' ;
T67 : 'RequestResponse' ;
T68 : 'throws' ;
T69 : 'Location' ;
T70 : 'Interfaces' ;
T71 : 'Protocol' ;
T72 : 'TODO' ;
T73 : 'Redirects' ;
T74 : 'Aggregates' ;
T75 : 'init' ;
T76 : 'main' ;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15258
RULE_CONCURRENT : 'concurrent';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15260
RULE_LCURLY : '{';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15262
RULE_RCURLY : '}';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15264
RULE_LSQUARE : '[';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15266
RULE_RSQUARE : ']';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15268
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15270
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15272
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15274
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15276
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15278
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15280
RULE_LPAREN : '(';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15282
RULE_RPAREN : ')';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15284
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15286
RULE_AT : '@';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15288
RULE_WHILE : 'while';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15290
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15292
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15294
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15296
RULE_QUESTION : '?';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15298
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15300
RULE_POINTSTO : '->';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15302
RULE_DEEPCOPYLEFT : '<<';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15304
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15306
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15308
RULE_EQUAL : '==';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15310
RULE_LANGLE : '<';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15312
RULE_RANGLE : '>';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15314
RULE_MAJOR_OR_EQUAL : '>=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15316
RULE_MINOR_OR_EQUAL : '<=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15318
RULE_NOT_EQUAL : '!=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15320
RULE_NOT : '!';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15322
RULE_REAL : ('0'..'9')* RULE_DOT ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15324
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15326
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15328
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15330
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15332
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 15334
RULE_WS : (' '|'\t'|'\r'|'\n')+;


