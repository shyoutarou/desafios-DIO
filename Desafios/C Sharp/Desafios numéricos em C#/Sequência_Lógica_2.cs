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
        string[] vet = Console.ReadLine().Split(' ') ;
        int x,y,count;
        x = int.Parse(vet[0]);
        y = int.Parse(vet[1]);
        count = 1;

        for (int i = 1;i <= y;i++)
        {
            Console.Write(i);
            if (x == count)
            {
                Console.WriteLine();
                count = 1;
            }
             else if(count < x)
            {
                Console.Write(" ");
                count++;
            }
        }
    }
}