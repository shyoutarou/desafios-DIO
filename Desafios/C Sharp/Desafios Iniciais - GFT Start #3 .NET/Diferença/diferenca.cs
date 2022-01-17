// Diferença

/* Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

 
Exemplos de Entrada	
5
6
7
8

Exemplos de Saída
DIFERENCA = -26

0
0
7
8

Exemplos de Saída
DIFERENCA = -56

5
6
-7
8

Exemplos de Saída
DIFERENCA = 86

*/

using System;

namespace Desafio
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            int d = int.Parse(Console.ReadLine());
          
          //continue a solução
            Console.WriteLine("DIFERENCA = " +   ( ( a   *   b )   - ( c  *   d ) ));
            Console.ReadKey();
        }
    }
}