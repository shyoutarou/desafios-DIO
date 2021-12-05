// Números Ímpares

/*

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.
Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 
Exemplo de Entrada	
8	

Exemplo de Saída
1
3
5
7


*/

let lines = gets().split('\n')

var X = parseInt( lines.shift() );
var index = 1;
var count;

do {
    count = false;

    if ( index <= X ) {

        if ( index % 2 == 1 ) {
            console.log( index );
        }

        index++
        count = true;
    }
} while ( count )
