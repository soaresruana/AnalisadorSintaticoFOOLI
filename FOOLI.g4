//Autor: Ruana Boeira Soares - Compiladores

grammar FOOLI;

program: classDeclaration;

classDeclaration: 'class' IDENTIFIER '{' (attributeDeclaration | methodDeclaration)* '}';

attributeDeclaration: type IDENTIFIER ('=' expression)? ';';  

methodDeclaration: type IDENTIFIER '(' parameters? ')' '{' (declarationCommand | command)* '}';  

parameters: parameter (',' parameter)*;

parameter: type IDENTIFIER;

declarationCommand: type IDENTIFIER ('=' expression)? ';';  

command: assignment
       | ifStatement
       | whileLoop
       | returnStatement
       | methodCall ';'?;  

assignment: IDENTIFIER '=' expression ';';  

ifStatement: 'if' '(' booleanExpression ')' '{' command '}' ('else' '{' command '}')?;

whileLoop: 'while' '(' booleanExpression ')' '{' command '}';

returnStatement: 'return' expression? ';';  

methodCall: IDENTIFIER '(' arguments? ')';  

arguments: expression (',' expression)*;

expression: arithmeticExpression
          | booleanExpression;

arithmeticExpression: term (('+' | '-') term)*;

term: factor (('*' | '/') factor)*;

factor: primary
      | methodCall
      | '(' arithmeticExpression ')';

primary: IDENTIFIER
       | NUMBER;

booleanExpression: logicalExpression
                 | relationalExpression
                 | '(' booleanExpression ')';

logicalExpression: primary
                 | 'not' logicalExpression
                 | logicalExpression ('and' | 'or') logicalExpression;

relationalExpression: arithmeticExpression (('==' | '<' | '>') arithmeticExpression)*;

type: 'int' | 'bool' | 'void';  

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;  
NUMBER: [0-9]+;  
BOOLEAN: 'true' | 'false';  

WS: [ \t\r\n]+ -> skip;  
