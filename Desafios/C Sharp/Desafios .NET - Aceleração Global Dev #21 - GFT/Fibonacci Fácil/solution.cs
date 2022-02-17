// Fibonacci Fácil

/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).
Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.
 
Exemplo de Entrada	Exemplo de Saída
5					0 1 1 2 3
Agradecimentos a Cássio F.

*/


using System;

namespace DIO// Fibonacci Fácil
{
    class Program
    {
        public static void Main()
        {
            int.TryParse(Console.ReadLine(), out int n);

            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    Console.WriteLine(a);
                }
                else {
                    Console.Write(a + " ");
                }
                int aux = b;
                b = a;
                a = aux + b;
            }
            
        }
    }
}
