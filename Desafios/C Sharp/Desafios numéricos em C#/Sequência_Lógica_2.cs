// Sequência Lógica 2

/*
Desafio
Você terá desafio de escrever um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.

 
Exemplo de Entrada	Exemplo de Saída
3 99

1 2 3
4 5 6
7 8 9
10 11 12
...
97 98 99
*/

using System;

    class Program
    {
        static void Main(string[] args)
        {
           
           
            //complete o código com sua solução
            var line = Console.ReadLine();
            string[] vet = line.Split(' ');
            var num_linha = Convert.ToInt16(vet[0]);
            var num_total = Convert.ToInt16(vet[1]);

            var count_linha = 0;
            for(int i = 1; i <= num_total; i++)
            {
                if (count_linha == (num_linha - 1))
                {
                    Console.WriteLine(i);
                    count_linha = 0;
                }
                else
                {
                    Console.Write(i);
                    Console.Write(" ");
                    count_linha++;
                }
            }
        }
    }