// Soma Simples

/*
Desafio
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

 
Exemplos de Entrada	
30
10

Exemplos de Saída
SOMA = 40

Exemplos de Entrada	
-30
10

Exemplos de Saída
SOMA = -20

Exemplos de Entrada	
0
0

Exemplos de Saída
SOMA = 0
*/

using System;

class Program
{
    static void Main(string[] args)
    {

        //Declare Variables
        int A = Convert.ToInt32(Console.ReadLine());
        int B = Convert.ToInt32(Console.ReadLine());
        
        //Insira as variaveis de acordo com o solicitado
        int SOMA =  A + B ;

        //Print
        Console.WriteLine("SOMA = {0}", SOMA);

    }
}