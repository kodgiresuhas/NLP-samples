grammar Metal;
 
// Parser Rules
 
metalSentence : metal EOF ;
 
metal : (strdl);

strdl : MONTH PRICE STRDL VS PRICE CALLPUT X PRICE FUTOPT DEC_COL_DEC RATIO? PRICE SLASH PRICE INT OFFER DAYS?;
 
// Lexer Rules

MONTH : 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' ; 

fragment DOT : '.';

fragment DOLLAR : '$'; 

PRICE : ( DOLLAR? DECIMAL );

fragment DIGIT : [0-9];

fragment NUM : DIGIT+;

STRDL : 'strdl' ;

VS : 'vs';

CALLPUT : 'call' | 'put';

X : 'x';

FUTOPT : 'fut' | 'opt';

fragment DECIMAL : DIGIT+ (DOT DIGIT+)?;

fragment COL : ':';

DEC_COL_DEC : DECIMAL COL DECIMAL;

RATIO : 'ratio';

SLASH : '/';

INT : 'int';

OFFER : 'offer';

D : 'd';

DAYS  : NUM D;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;