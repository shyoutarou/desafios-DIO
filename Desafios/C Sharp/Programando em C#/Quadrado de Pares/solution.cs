// Quadrado de Pares

/*
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.
Entrada
A entrada contém um valor inteiro N (5 < N < 2000).
Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.
Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
 
Exemplo de Entrada	
6	

Exemplo de Saída
2^2 = 4
4^2 = 16
6^2 = 36
 

*/

using System;

class DIO {

    static void Main(string[] args) { 

      int n = int.Parse(Console.ReadLine());
  
      if (n > 5 && n < 2000)
      {
  
          for (var i = 1; i <= n; i++)
          {
              if (i % 2 == 0)
              {
                  Console.WriteLine(i + "^2 = " + i * i);
              }
          }
      }

    }

}
