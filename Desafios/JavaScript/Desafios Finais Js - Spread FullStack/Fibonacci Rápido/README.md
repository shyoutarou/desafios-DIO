## Desafio

A fórmula de Binet é uma forma de calcular números de Fibonacci.

<p align="center">
    <img src="../../../../assets/fatorialrapido.png" width="470" height="270">
</p>

Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

## Entrada

A entrada é um número natural n (0 < n ≤ 50).

## Saída

A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 1 | 1.0 |
| 2 | 1.0 |
| 3 | 2.0 |

Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA

```bash
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados.
// Abaixo segue um exemplo de código que você pode ou não utilizar

let N = parseInt(gets());

//TODO: Complete os espaços em branco com uma possível solução para o problema

let fib = (Math.pow((                   ) / 2, N) - Math.pow((                  )) /              ;

print(fib.toFixed(   ));


```