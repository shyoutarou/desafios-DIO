// https://web.digitalinnovation.one/coding/desafios-c-aceleracao-global-dev-16-avanade/algorithm/galopeira?back=/tests/1d66f99c-21b1-4d68-b281-172e959666db

// Galopeira

/*Sempre competindo para saber quem é o melhor, Capitão América e Homem de Ferro fizeram um desafio: quem digita mais rápido. Para isto, conseguiram um computador que não processa teclas pressionadas, ou seja, se for para digitar a mesma letra duas vezes seguidas, precisa pressionar a tecla duas vezes, visto que, pressionar a tecla por mais tempo, não adianta, e calcularam o tempo de uma tecla pressionada, que foi de um centésimo de segundo.

O desafio seria quem digitasse a palavra “galopeira”, formada por mais letras e, mas ambos eram muito bons e chegava num ponto que não era possível contar quantas letras haviam sido digitadas. Então, os super heróis pediram humildemente a sua ajuda para escrever um programa que verifique a palavra digitada e veja quanto tempo foi gasto para a digitação.

Escreva um programa que, dada uma palavra digitada, informe quanto tempo foi gasto para ser digitada.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso tem uma palavra, de, no mínimo, 9 e, no máximo 10000 letras.

Saída
Para cada caso de teste, imprima um número T, que é o tempo gasto, em segundos, para digitar a palavra do respectivo caso de teste, com aproximação de duas casas decimais.

 
Exemplo de Entrada	
3
galopeira
galopeeeeeeeeeeeeeeeeeira
galopeeira

Exemplo de Saída
0.09
0.25
0.1
*/

using System; 

class Teste 
{

    static void Main(string[] args) 
    { 

      int x=int.Parse(Console.ReadLine());
      for (int i = 0; i < x; i++)
      {
          var txt = Console.ReadLine();
          Console.WriteLine((txt.Length * 0.01).ToString("N2") );
      }
    }
}

