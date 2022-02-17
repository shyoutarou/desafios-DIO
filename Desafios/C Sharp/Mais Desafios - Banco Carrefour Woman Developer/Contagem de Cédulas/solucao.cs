// Contagem de Cédulas

/*
Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.
Entrada
Você receberá um valor inteiro N (0 < N < 1000000).
Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.
 
Exemplo de Entrada	
576	

Exemplo de Saída
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

11257	
Exemplo de Saída
11257
112 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
0 nota(s) de R$ 1,00

503	
Exemplo de Saída
503
5 nota(s) de R$ 100,00
0 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
0 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

*/

using System;
using System.Collections.Generic;

namespace DIO
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
            List<int> results = new List<int>();

            int n, nota, quociente, resto;

            n = int.Parse(Console.ReadLine());
            Console.WriteLine(n);

            resto = n;

            foreach (var item in notas)
            {
                nota = item;
                quociente = resto / item;
                Console.WriteLine($"{quociente} nota(s) de R$ {nota},00");
                resto = resto % item;
            }
                                                   
        }
    }
}
