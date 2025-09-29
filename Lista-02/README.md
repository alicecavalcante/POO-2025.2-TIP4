# LISTA-02 – Estrutura Condicional e Estrutura de Repetição

Esta pasta contém os **exercícios resolvidos e propostos** referentes ao **Capítulo 4 – Estrutura Condicional** e **Capítulo 5 – Estrutura de Repetição** do livro *Fundamentos da Programação de Computadores*, de Ana Fernanda Gomes Ascencio e Edilene Aparecida Veneruchi de Campos.

## Conteúdo

- **Exercícios Resolvidos:** 1º ao 10º  
- **Exercícios Propostos:** 1º ao 5º

## Exercícios Resolvidos - Questões - Estrutua Condicional

1. A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas obedece aos pesos a seguir:

| Nota                   | Peso |
|------------------------|------|
| Trabalho de laboratório| 2    |
| Avaliação semestral    | 3    |
| Exame final            | 5    |

Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue
a tabela:

| Média Ponderada | Conceito |
|------------------|----------|
| 8,0 – 10,0       | A        |
| 7,0 – 8,0        | B        |
| 6,0 – 7,0        | C        |
| 5,0 – 6,0        | D        |
| 0,0 – 5,0        | E        |

---

2. Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem
constante na tabela a seguir. Aos alunos que ficaram para exame, calcule e mostre a nota que deverão
tirar para serem aprovados, considerando que a média exigida é 6,0.

---

3. Faça um programa que receba dois números e mostre o maior.

---

4. Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário
digitará três números diferentes.

---

5. Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto núme-
ro que não siga essa regra. Mostre, em seguida, os quatro números em ordem decrescente. Suponha

que o usuário digitará quatro números diferentes.

---

6. Faça um programa que receba um número inteiro e verifique se é par ou ímpar.

---

7. Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e
C são reais. Escreva os números A, B e C obedecendo à tabela a seguir.
Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e que os números
digitados sejam diferentes um do outro.

| Valor de i | Forma a escrever                                  |
|------------|---------------------------------------------------|
| 1          | A, B e C em ordem crescente                        |
| 2          | A, B e C em ordem decrescente                     |
| 3          | O maior fica entre os outros dois números         |

---

8. Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados neces-
sários para executar cada operação.

Menu de opções:
1. Somar dois números.
2. Raiz quadrada de um número.
Digite a opção desejada:

---

9. Faça um programa que mostre a data e a hora do sistema nos seguintes formatos: DD/MM/AAAA –
mês por extenso e hora:minuto.

---

10. Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo
usuário. Cada data deve ser composta por três valores inteiros, em que o primeiro representa o dia, o
segundo, o mês e o terceiro, o ano.

---

## Exercícios Propostos - Questões - Estrutura Condicional

1. Faça um programa que receba quatro notas de um aluno, calcule e mostre a média aritmética das notas e a mensagem de aprovado ou reprovado, considerando para aprovação média 7.
---
2. Faça um programa que receba duas notas, calcule e mostre a média aritmética e a mensagem que se encontra na tabela a seguir:

| Média Aritmética | Mensagem   |
|------------------|------------|
| 0,0 – 3,0        | Reprovado  |
| 3,0 – 7,0        | Exame      |
| 7,0 – 10,0       | Aprovado   |

---
3. Faça um programa que receba dois números e mostre o menor.
---
4. Faça um programa que receba três números e mostre o maior.
---
5. Faça um programa que receba dois números e execute as operações listadas a seguir, de acordo com a escolha
do usuário.

| Escolha do usuário | Operação                              |
|--------------------|----------------------------------------|
| 1                  | Média entre os números digitados       |
| 2                  | Diferença do maior pelo menor          |
| 3                  | Produto entre os números digitados     |
| 4                  | Divisão do primeiro pelo segundo       |

---

##  Exercícios Resolvidos - Questões - Estrutura de Repetição

1. Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00.
b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
c) A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano
anterior.
Faça um programa que determine o salário atual desse funcionário.
---
2. Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a
fórmula a seguir:
| E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!|
---
3. Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser
lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.
---
4. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
Foram obtidos os seguintes dados:
a) código da cidade;
b) número de veículos de passeio;
c) número de acidentes de trânsito com vítimas.
Deseja-se saber:
a) qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
b) qual é a média de veículos nas cinco cidades juntas;
c) qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
---
5. Faça um programa que leia o número de termos e um valor positivo para X. Calcule e mostre o valor
da série a seguir:
\[
S = -X²/1! + X³/2! - X⁴/3! + X⁵/4! - X⁶/3! + X⁷/2! - X⁸/1! + X⁹/2! - X¹⁰/3! + X¹¹/4! - ...


---
6.
---
7.
---
8.
---
9.
---
10.
---

##  Exercícios Propostos - Questões - Estrutura de Repetição

1.
---
2.
---
3.
---
4.
---
5.
---

## Objetivo

O objetivo desta lista é fixar os conhecimentos iniciais sobre **Estrutura Condicional** e **Estrutura de Repetição**, por meio da resolução de problemas simples utilizando entrada, processamento e saída de dados em linguagem Java.

## Observações

- A resolução foi feita seguindo os conceitos aprendidos em sala de aula.
