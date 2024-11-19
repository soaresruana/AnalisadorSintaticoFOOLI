### Autor: Ruana Soares - Compiladores
# FOOLI Language - Grammar Documentation

O projeto FOOLI (Fake Object-Oriented Language with Iteration) é uma extensão de FOOL (Fake Object-Oriented Language).

Este projeto envolve a construção da gramática para a FOOLI utilizando ANTLR. A gramática definida neste projeto cobre a declaração de classes, atributos, métodos, expressões aritméticas e lógicas, além de estruturas de controle como if e while.

A FOOLI Language suporta os seguintes componentes principais:

Declaração de Classes: As classes podem conter atributos (variáveis) e métodos (funções). Cada classe possui um nome e é seguida por um corpo que contém suas declarações e métodos.
Atributos: Variáveis de tipos simples como int e bool, que podem ser inicializadas com valores durante a declaração.
Métodos: Funções que podem ter parâmetros e retornar valores, com suporte para tipos int, bool e void.
Estruturas de Controle: A linguagem implementa as estruturas básicas de controle de fluxo, como if (condicional) e while (laço).
Expressões: Suporte a expressões aritméticas com operadores como +, -, *, /, além de expressões lógicas com operadores como and, or e not.

## Geração de Código (TAC):
Para a FOOLI Language, o projeto implementa um gerador de Código (TAC), que converte expressões e comandos de controle de fluxo da FOOLI em uma representação intermediária.

#### Execução:

- java -jar antlr-4.13.2-complete.jar -visitor FOOLI.g4
- javac -cp ".;antlr-4.13.2-complete.jar;path/to/generated/classes/*" *.java
- java -cp ".;antlr-4.13.2-complete.jar;path/to/generated/classes/*" Main

#### Representação Gráfica com DOT
Ao executar o analisador, um arquivo DOT é gerado automaticamente, representando o fluxo de controle e a organização das instruções TAC de maneira gráfica.

#### Execução usando graphviz:
- dot -Tpng tree.dot -o tree.png 
- dot -Tsvg tree.dot -o tree.svg

#### Resultado do TESTE
Disponível nos arquivos tree.png, tree.svg ou via terminal.


