// Resto 2

/*

Desafio
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
Entrada
A entrada contém um valor inteiro N (N < 10000).
Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 
Exemplo de Entrada	
13	

Exemplo de Saída
2
15
28
41
...

*/

let lines = gets().split('\n');

let N = parseInt(lines.shift());

for(let i = 0; i < 10000; i++){
  if(i % N === 2){
    console.log(i);
  }
}

