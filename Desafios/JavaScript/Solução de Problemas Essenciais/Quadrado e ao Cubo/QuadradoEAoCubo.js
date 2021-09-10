/* Desafio
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido. */

const N = parseInt(gets());

for (i = 1; i <= N; i++) {
  console.log(i, i*i, i**3);
}