lexer grammar InternalJolie;
@header {
package jolie.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T39 : 'cH' ;
T40 : 'exit' ;
T41 : 'any' ;
T42 : 'int' ;
T43 : 'real' ;
T44 : 'string' ;
T45 : 'void' ;
T46 : 'undefined' ;
T47 : 'double' ;
T48 : 'raw' ;
T49 : 'Java' ;
T50 : 'Jolie' ;
T51 : 'Javascript' ;
T52 : 'is_defined' ;
T53 : 'is_string' ;
T54 : 'is_double' ;
T55 : 'is_int' ;
T56 : 'this' ;
T57 : '&&' ;
T58 : '||' ;
T59 : 'global' ;
T60 : 'constants' ;
T61 : '{' ;
T62 : '}' ;
T63 : 'execution' ;
T64 : 'include' ;
T65 : 'type' ;
T66 : '[' ;
T67 : ']' ;
T68 : 'embedded' ;
T69 : 'define' ;
T70 : '(' ;
T71 : ')' ;
T72 : 'linkIn' ;
T73 : 'nullProcess' ;
T74 : 'install' ;
T75 : 'throw' ;
T76 : 'comp' ;
T77 : 'scope' ;
T78 : 'linkOut' ;
T79 : 'synchronized' ;
T80 : 'undef' ;
T81 : '=>' ;
T82 : 'if' ;
T83 : 'else' ;
T84 : 'for' ;
T85 : 'foreach' ;
T86 : 'while' ;
T87 : 'with' ;
T88 : 'interface' ;
T89 : 'inputPort' ;
T90 : 'outputPort' ;
T91 : 'OneWay' ;
T92 : 'RequestResponse' ;
T93 : 'throws' ;
T94 : 'Location' ;
T95 : 'Interfaces' ;
T96 : 'Protocol' ;
T97 : 'Redirects' ;
T98 : 'Aggregates' ;
T99 : 'init' ;
T100 : 'main' ;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18798
RULE_CONCURRENT : 'concurrent';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18800
RULE_SEQUENTIAL : 'sequential';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18802
RULE_SEMICOLON : ';';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18804
RULE_COLON : ':';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18806
RULE_PLUS : '+';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18808
RULE_VERT : '|';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18810
RULE_ASSIGN : '=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18812
RULE_DOT : '.';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18814
RULE_COMMA : ',';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18816
RULE_AT : '@';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18818
RULE_CHOICE : '++';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18820
RULE_DECREMENT : '--';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18822
RULE_ASTERISK : '*';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18824
RULE_QUESTION : '?';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18826
RULE_DIVIDE : '/';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18828
RULE_POINTSTO : '->';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18830
RULE_DEEPCOPYLEFT : '<<';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18832
RULE_MINUS : '-';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18834
RULE_PERCENT_SIGN : '%';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18836
RULE_EQUAL : '==';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18838
RULE_LANGLE : '<';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18840
RULE_RANGLE : '>';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18842
RULE_HASH : '#';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18844
RULE_MAJOR_OR_EQUAL : '>=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18846
RULE_MINOR_OR_EQUAL : '<=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18848
RULE_NOT_EQUAL : '!=';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18850
RULE_NOT : '!';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18852
RULE_REAL : ('0'..'9')* RULE_DOT ('0'..'9')+ (('e'|'E') ('0'..'9')+)?;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18854
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18856
RULE_INT : ('0'..'9')+;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18858
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18860
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18862
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18864
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../jolie.xtext.ui/src-gen/jolie/xtext/ui/contentassist/antlr/internal/InternalJolie.g" 18866
RULE_ANY_OTHER : .;


