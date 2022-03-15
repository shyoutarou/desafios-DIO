## Desafio

Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca 

## Entrada

O arquivo de entrada contém um valor inteiro.

## Saída

Imprima a saída conforme exemplo fornecido.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 400 | 1 ano(s)<br />1 mes(es)<br />5 dia(s) |
| 800 | 2 ano(s)<br />2 mes(es)<br />10 dia(s) |
| 30 | 0 ano(s)<br />1 mes(es)<br />0 dia(s) |

```bash
using System;
//TODO: Complete os espaços em branco com uma solução possível para o problema.
namespace Desafio
{
    class Program
    {
        static void Main(string[] args)
        {
            var dias = int.Parse(Console.ReadLine());
            var anos = dias /     ;
            dias = dias %      ;
            var meses = dias /     ;
            dias = dias %     ;
            
            Console.WriteLine($"{anos} ano(s)");
            Console.WriteLine($"{meses} mes(es)");
            Console.WriteLine($"{dias} dia(s)");
        }
    }
}

```
