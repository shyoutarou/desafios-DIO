/* Desafio
Degustação de vinho às escuras é a habilidade de identificar um vinho usando apenas seus sentidos do olfato e paladar.
Durante uma competição de degustação, uma garrafa de vinho é aberta e dividia em taças para que os cinco competidores possam provar. Eles podem cheiras, saborear e avaliar a bebida para conseguir identificar qual o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir. No final, as respostas são verificadas para determinar o número de suposições corretas.
Dado o qual foi o tipo do vinho e as respostas fornecidas, determine o número de participantes que receberam a resposta correta.
Entrada
A primeira linha contém um inteiro T representando o tipo de vinho (1 ≤ T ≤ 4). A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta dada por cada competidor (1 ≤ A, B, C, D, E ≤ 4).
Saída
A saída contém um inteiro representando o número de concorrentes que obtiveram a resposta correta.

Exemplos de Entrada	Exemplos de Saída
1
1 2 3 2 1			2
3
4 1 1 2 1			0


 */

let opcaoCorreta = gets();
let chutes = gets().split(' ');

//TODO: Complete o código com uma possível solução para o problema.
let acertos = 0;

for (let chute = 0; chute < chutes.length; chute++)
  if (chutes[chute] == opcaoCorreta)
     acertos++;
print(acertos);
