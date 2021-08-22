/*
Múltiplos
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

 
Exemplo de Entrada	
6 24

Exemplo de Saída
Sao Multiplos

Exemplo de Entrada	
6 25

Exemplo de Saída
Nao sao Multiplos

*/

using System;

 class minhaClasse {
        static void Main(string[] args) {
            //continue a solucao com a insercao da variavel corretamente

            string[] valores = Console.ReadLine().Split(' ');
            int A = int.Parse(  valores[0] );
            int B = int.Parse(  valores[1] );

            if (A % B == 0 || B % A == 0 ) {
                Console.WriteLine("Sao Multiplos");
            }
            else {
                Console.WriteLine("Nao sao Multiplos");
            }
        }
    }