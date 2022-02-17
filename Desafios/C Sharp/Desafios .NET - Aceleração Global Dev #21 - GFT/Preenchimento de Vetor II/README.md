## Desafio

Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

## Entrada

A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

## Saída

Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 3 | N[0] = 0<br />N[1] = 1<br />N[2] = 2<br />N[3] = 0<br />N[4] = 1<br />N[5] = 2<br />N[6] = 0<br />N[7] = 1<br />N[8] = 2<br />... |

Agradecimentos a Cassio F.


```bash
using System;

namespace DIO 
{
    class Program
    {
        public static void Main()
        {
            int.TryParse(Console.ReadLine(), out int t);
            int[] n = new int[1000];

           //Escreva o seu código aqui          
  
              
        }
    }
}



```

