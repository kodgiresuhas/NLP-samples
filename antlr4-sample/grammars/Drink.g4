grammar Drink;
 
// Parser Rules
 
drinkSentence : ARTICLE? DRINKING_VESSEL OF drink IN location ;
 
drink : TEXT;
 
location : LOCATION;

// Lexer Rules
 
ARTICLE : 'the' | 'an' | 'a' ;
 
OF : 'of' ;

IN : 'in' ;
 
DRINKING_VESSEL : 'cup' | 'pint' | 'shot' | 'mug' | 'glass' ;
 
TEXT : ('a'..'z')+ ;
 
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;

LOCATION : ( 'India') ;