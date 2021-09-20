/* Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * 
 * Entrada
 * Não há nenhuma entrada neste problema.
 * 
 * Saída
 * Imprima a sequencia conforme exemplo abaixo.
 * 
 * Exemplo:
 * ======================================================
 * Entrada                                  Saída
 * ======================================================
 *                                          I=1 J=7
 *                                          I=1 J=6
 *                                          I=1 J=5
 *                                          I=3 J=9
 *                                          I=3 J=8
 *                                          I=3 J=7
 *                                          ...
 *                                          I=9 J=15
 *                                          I=9 J=14
 *                                          I=9 J=13
 * 
 */


using System;

namespace URI_1097 {
    class Program {
        static void Main(string[] args) {

            int j = 7;

            for (int i = 1; i <= 9; i = i + 2) {
                Console.WriteLine("I=" + i + " J=" + j);
                Console.WriteLine("I=" + i + " J=" + (j - 1));
                Console.WriteLine("I=" + i + " J=" + (j - 2));
                j = j + 2;
            }

        }
    }
}




namespace URI_1097 {
    class Program {
        static void Main( string[] args )
        {
            for (int i = 1; i <= 9; i++)
            {
                if (i % 2 != 0)
                {
                    for (int j = 7; j >= 5; j--)
                    {
                        Console.WriteLine($"I={i} J={j}");
                    }
                }
            }
        }
    }
}