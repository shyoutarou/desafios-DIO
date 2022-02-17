## Desafio

A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

## Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 46).

## Saída

Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5 | 0 1 1 2 3 |

Agradecimentos a Cássio F.

```bash
using System;

namespace DIO// Fibonacci Fácil
{
    class Program
    {
        public static void Main()
        {
            int.TryParse(Console.ReadLine(), out int n);
            if (n == 1)
            {
                Console.Write("0");
            }
            else if (n == 2)
            {
                Console.Write("0 1");
            }
            else
            {
              
               //Continue com o seu código nos espaços em branco

                for (        )
                {
                  
                }
            }
            
        }
    }
}


```
