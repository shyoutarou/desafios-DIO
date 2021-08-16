// Positivos e Média

/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

 
Exemplo de Entrada	
7
-5
6
-3.4
4.6
12

Exemplo de Saída
4 valores positivos
7.4


Dado de entrada:
2
-2
3
-5
7
9
Saída esperada:
4 valores positivos
5.2

Dado de entrada:
2
2
3
5
7
9
Saída esperada:
6 valores positivos
4.7
 */

const positives = [];

let positivos = 0;

for (let i = 0; i < 6; i++) {
   let valor = Number(gets());

   if ( valor  >  0  ) {
      positives.push(valor);
      positivos += 1 ;
   }
}

console.log(positivos + " valores positivos");
var soma = positives.reduce(function(a, b){
    return a + b;
}, 0);
var averange = (soma / positives.length)
var numbertrunc = Math.trunc(averange*10)/10
var numberround = Math.round(averange*10)/10
var diff = (numberround - averange);

if(diff < 0.049)
  console.log(numberround);
else 
  console.log(numbertrunc);


