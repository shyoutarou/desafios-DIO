## Desafio

Nesse desafio você terá que desenvolver um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.

## Entrada

A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao enésimo termo da série de Fibonacci.

## Saída

Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.


| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 3<br />0<br />4<br />2 | Fib(0) = 0<br />Fib(4) = 3<br />Fib(2) = 1 |
| 3<br />30<br />41<br />52 | Fib(30) = 832040<br />Fib(41) = 165580141<br />Fib(52) = 32951280099 |
| 10<br />1<br />2<br />3<br />4<br />5<br />6<br />7<br />8<br />9<br />20 | Fib(1) = 1<br />Fib(2) = 1<br />Fib(3) = 2<br />Fib(4) = 3<br />Fib(5) = 5<br />Fib(6) = 8<br />Fib(7) = 13<br />Fib(8) = 21<br />Fib(9) = 34<br />Fib(20) = 6765 |