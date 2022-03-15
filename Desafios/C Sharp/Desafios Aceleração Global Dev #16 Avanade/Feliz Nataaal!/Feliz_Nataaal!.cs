//  https://web.digitalinnovation.one/coding/desafios-c-aceleracao-global-dev-16-avanade/algorithm/feliz-nataaal?back=/tests/1d66f99c-21b1-4d68-b281-172e959666db


//   Feliz Nataaal!

/* Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!". Pra colocar toda essa felicidade pra fora, você montou um programa que, colocado um índice I de felicidade, seu grito de natal é mais animado.

Entrada
A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o índice de felicidade.

Saída
A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra a da frase. Uma quebra de linha é necessária após a impressão da frase.

 
Exemplo de Entrada	Exemplo de Saída
5

Feliz nataaaaal!

 
Contest de Natal 2016.
*/

using System; 

class TESTE {

    static void Main(string[] args) { 

        int x = int.Parse(Console.ReadLine());
        Console.Write("Feliz nat");
        for ( var i =0; i < x; i++ )
        {
            Console.Write('a');
        }
        Console.Write("l!\n");

    }

}



