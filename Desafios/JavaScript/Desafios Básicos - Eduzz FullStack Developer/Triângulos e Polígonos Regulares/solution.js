// Triângulos e Polígonos Regulares

/* 
O professor Rafael adora computação gráfica. Ele gosta muito de renderizar objetos, especialmente bonecas. Mas ele não gosta de desenhar polígonos regulares usando triângulos. Fazer isso consiste em compor um polígono regular usando apenas triângulos, de forma que os triângulos não se interceptem e se utilize o menor número possível de triângulos na composição. Veja um quadrado e um pentágono com os triângulos na figura.
 
O professor Rafael pediu para você calcular qual o número mínimo de triângulos necessários para compor um polígono regular de N lados.
Entrada
A entrada é composta por um número N (3 ≤ N ≤ 109), que indica o número de lados de um polígono regular.
Saída
A saída é o número mínimo de triângulos necessários para compor um polígono regular de N lados.
 
Exemplos de Entrada	Exemplos de Saída
3					1
4					2
5					3
Aquecimento para a OBI 2016
 */

let lines = gets().split('\n');

let valor1 = parseInt(lines.shift());

print(valor1-2);

//Escreva a sua lógica acima
