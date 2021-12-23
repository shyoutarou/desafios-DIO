// Xenlonguinho

/*
Entrada
A primeira linha consiste de um inteiro C que representa a quantidade de casos de teste. As linhas subsequentes contém um inteiro N (2 ≤ N ≤ 1000) que representa a quantidade de esferas necessárias para invocar Xenlonguinho.

Saída
Seu programa deve exibir a quantidade mínima de esferas que Kogu tem que procurar.

 
Exemplo de Entrada	Exemplo de Saída
1
7

5

 
The First Contest 2017 - IFSULDEMINAS
*/

using System;

namespace DIO
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = int.Parse(Console.ReadLine());
            for (int i = 0; i < numero; i++)
            {
                   //escreva o seu código
                var esferas = int.Parse(Console.ReadLine());

                Console.WriteLine(esferas - Math.Floor(Math.Sqrt(esferas)));

            }
        }
    }
}