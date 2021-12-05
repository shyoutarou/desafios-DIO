// Múltiplos

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
Entrada
A entrada contém valores inteiros.
Saída
A saída deve conter uma das mensagens conforme descrito acima.
 
Exemplo de Entrada	
6 24	

Exemplo de Saída
Sao Multiplos

6 25	

Exemplo de Saída
Nao sao Multiplos

*/

let lines = gets().split("\n");

let line = lines.shift().split(" ");
let A = parseInt(line[0]);
let B = parseInt(line[1]);

if ( A % B == 0 || B % A == 0 )
    print('Sao Multiplos' );                   //complete com a sua lógica
else 
    print('Nao sao Multiplos' );
    
