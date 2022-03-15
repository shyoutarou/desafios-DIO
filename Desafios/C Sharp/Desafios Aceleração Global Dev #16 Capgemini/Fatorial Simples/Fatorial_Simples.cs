//  Fatorial Simples

/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

 
Exemplo de Entrada	Exemplo de Saída
4

24
*/


using System; 

class Problem 
{

    static void Main(string[] args) 
    { 
       //complete o código com sua solução
        int num = Convert.ToInt16(Console.ReadLine());
        int fatorial = num;
        int c = 1;

        if (num <= 1) {
            fatorial = 1;
        } else {
            while ((num - c) > 0) {
                fatorial = fatorial * (num - c);
                c++;
            }
        }
        
        Console.Write(fatorial);
     
    }

}
