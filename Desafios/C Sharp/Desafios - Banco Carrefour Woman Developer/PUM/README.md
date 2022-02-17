## Desafio

Desenvolva um programa que leia um valor inteiro N. Este N refere-se à quantidade de linhas de saída que serão apresentadas na execução do programa.

## Entrada

O arquivo de entrada contém um número inteiro positivo N.

## Saída

Imprima a saída conforme o exemplo fornecido.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 7  | 1 2 3 PUM<br />5 6 7 PUM<br />9 10 11 PUM<br />13 14 15 PUM<br />17 18 19 PUM<br />21 22 23 PUM<br />25 26 27 PUM|

```bash
using System;

namespace TESTE {
    class Program {
        static void Main(string[] args) {
        
            int N = int.Parse(Console.ReadLine());

            int primeiro = 1;
            for (int i = 1; i <= N; i++) {

               // Insira o seu código aqui


            }
        }
    }
}
```
