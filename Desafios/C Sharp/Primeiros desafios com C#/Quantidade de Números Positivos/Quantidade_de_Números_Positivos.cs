//  Quantidade de Números Positivos

/*
Desafio
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

 
Exemplo de Entrada	
7
-5
6
-3.4
4.6
12

Exemplo de Saída
4 valores positivos
*/

using System;

class Program
{
    static void Main(string[] args)
    {
      
        double[] arr = new double[6];//declaration of 2D array  
      
        for (int i = 0; i < 6; i++) 
        {
              arr[i] = double.Parse(Console.ReadLine());
        }
        
        int ehPositivo = 0;

        for (int i = 0; i < 6; i++) 
        {
            if (arr[i] > 0.0) ehPositivo++;
        }

       //comtinue com sua solução
        Console.WriteLine(ehPositivo + " valores positivos");
    }
}