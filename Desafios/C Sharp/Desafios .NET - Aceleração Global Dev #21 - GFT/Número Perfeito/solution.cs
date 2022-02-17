// Número Perfeito


/* 
Desafio
O número perfeito é definido matematicamente como um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
O seu desafio é escrever um programa que imprima se um determinado número é perfeito ou não.
Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.
Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo com a especificação fornecida.
 
Exemplo de Entrada	
3
6
5
28	

Exemplo de Saída
6 eh perfeito
5 nao eh perfeito
28 eh perfeito

*/


using System;

namespace Dio 
{
    class Program
    {
        public static void Main()
        {
            int.TryParse(Console.ReadLine(), out int n);
            int soma;

           //Digite o seu código aqui
            for(int i = 0; i < n; i++)
            {
                int X = int.Parse(Console.ReadLine());
                soma = 0;
                for (int j = 1; j <X; j++)
                {
                    if (X % j == 0)
                        soma += j;
                }
                
                if (soma == X)
                    Console.WriteLine("{0} eh perfeito", X);
                else
                    Console.WriteLine("{0} nao eh perfeito", X);
            }
        }
    }
}
