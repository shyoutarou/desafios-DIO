/**
 * Desafio
Desenvolva um código que leia um valor E. Este E será o tamanho de um vetor X[E]. 
A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, 
mostrando esta informação.

Entrada
A primeira linha de entrada contem um único inteiro E (1 < E < 1000), 
indicando o número de elementos que deverão ser lidos em seguida para o vetor X[E] de inteiros. 
A segunda linha contém cada um dos E valores, separados por um espaço.

Saída
A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. 
A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se 
encontra o menor valor lido, lembrando que o vetor inicia na posição zero.
 * 
 */

let E = parseInt(gets());
let X = gets().replace(/\s/g,',').trim().split(',');

X.length = E;

let menorValor = 0;
let indiceDoMenorValor = 0;

for(let i = 0; i < E; i++){
  if(i === 0)
    menorValor = X[i];
  else if(parseFloat(X[i]) < menorValor){
    menorValor = X[i];
    indiceDoMenorValor = i;
  }
}

console.log(`Menor valor: ${menorValor}`);
console.log(`Posicao: ${indiceDoMenorValor}`);