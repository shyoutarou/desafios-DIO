// Seis Números Ímpares

/* 
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.
Entrada
A entrada será um valor inteiro positivo.
Saída
A saída será uma sequência de seis números ímpares.
 
Exemplo de Entrada	
8	

Exemplo de Saída
9
11
13
15
17
19
 */

const nCasos = parseInt(gets());
let lines = gets().split("\n");

let num = parseInt(lines.shift());

let init = num % 2 === 0 ? num + 1 : num;

for (let mlt = 0; mlt <= 5; mlt++) {
    
    console.log(`${init}`)
    init += 2;
}
