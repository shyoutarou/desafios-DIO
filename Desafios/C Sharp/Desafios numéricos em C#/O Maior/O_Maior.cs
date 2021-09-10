// O Maior

/*
Desafio
Desenvolva um programa capaz de ler três valores e apresentar o maior deles e adicionar a mensagem “ eh o maior”. Use a seguinte forma como base:

MaiorAB = (a+b+abs(a-b)) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido pela mensagem " eh o maior".

 
Exemplos de Entrada	
7 14 106

Exemplos de Saída
106 eh o maior

Exemplos de Entrada	
217 14 6

Exemplos de Saída
217 eh o maior
*/

using System;

    class Program
    {
        static void Main(string[] args)
        {
            string[] vet = Console.ReadLine().Split(' ');
            //complete declarando as variáveis
            var A = Convert.ToInt32(vet[0]);
            var B = Convert.ToInt32(vet[1]);
            var C = Convert.ToInt32(vet[2]);
            int maiorAB = (A + B + Math.Abs(A - B)) / 2;
            int maiorABC = (maiorAB + C + Math.Abs(maiorAB - C)) / 2;

            Console.WriteLine($"{maiorABC} eh o maior");
                        
        }
    }