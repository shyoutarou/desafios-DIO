// Sucessor Par

/*
Para se preparar para os outros problemas, vamos fazer um teste. Dado um número X, retorne o menor número par maior do que X.
Entrada
Uma linha contendo um número  0 < X < 107.
Saída
Uma linha contendo a resposta do problema.
 
Exemplo de Entrada	
1	

Exemplo de Saída
2
 
5ª Maratona De Programação Da UFFS

*/

using System; 

class DIO {

    static void Main(string[] args) { 

       int x = int.Parse(Console.ReadLine());
            
        if (x % 2 == 0)
        {
            Console.WriteLine(x + 2);      //escreva aqui o seu código
        }
        else
        {
            Console.WriteLine(x + 1);
        }
    }
}
