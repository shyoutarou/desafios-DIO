/*Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

Exemplo de entrada          exemplos de saidas
6                            2
                             4
                             6


*/

/* SOLUÇÃO */

i = 0
let valor;

valor = parseInt(gets())

if (valor > 0 || valor % 2 === 0) {
while (i < valor) {
i = i + 2
if (i > valor) {
break
} else {
console.log(i)
}
}
}