//  Preenchimento de Vetor II

/* 
Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.
Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
 
Exemplo de Entrada	
3	

Exemplo de Saída
N[0] = 0
N[1] = 1
N[2] = 2
N[3] = 0
N[4] = 1
N[5] = 2
N[6] = 0
N[7] = 1
N[8] = 2
...
Agradecimentos a Cassio F.

*/


using System;

namespace DIO 
{
    class Program
    {
        public static void Main()
        {
            int.TryParse(Console.ReadLine(), out int t);
            int[] n = new int[1000];

           //Escreva o seu código aqui          
            for (int i = 0; i < 1000;)
            {
                for (int j = 0; j < t && i < 1000; j++, i++)
                {
                    n[i] = j;
                    Console.WriteLine($"N[{i}] = {n[i]}");
                }
            }  
        }
    }
}

