/**
A fórmula de Binet é uma forma de calcular números de Fibonacci.
 
Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.
Entrada
A entrada é um número natural n (0 < n ≤ 50).
Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.
 
Exemplos de Entrada	Exemplos de Saída
1	1.0
 
2	1.0
 
3	2.0
Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA


 */

// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados.
// Abaixo segue um exemplo de código que você pode ou não utilizar

let N = parseInt(gets());

//TODO: Complete os espaços em branco com uma possível solução para o problema
let sqrt5 = Math.sqrt(5);
let parte1 = (1.0 + sqrt5) / 2;
let parte2 = (1.0 - sqrt5) / 2;
let fib = (Math.pow(parte1, N) - Math.pow(parte2, N)) / sqrt5;
print(fib.toFixed(1));
