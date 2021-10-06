## Desafio

Papai Noel está brincando com seus duendes para entretê-los durante a véspera do Natal. A brincadeira consiste nos elfos escreverem números em pedaços de papel e colocarem no gorro do Papai Noel. Após todos terminarem de colocar os números Noel sorteia um papel e aquele número representa quantos "Ho" o Noel deve falar.

Seu trabalho é ajudar o Papai Noel montando um problema que mostre todos os "Ho" que ele deve falar dado o número sorteado.

## Entrada

A entrada é composta por um único inteiro N (0 < N ≤ 106) representando quantos "Ho" serão falados por Noel.

## Saída

A saída é composta por todos "Ho" que Papai Noel deve falar separados por um espaço. Após o último "Ho" deve ser apresentado um "!" encerrando o programa.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5 | Ho Ho Ho Ho Ho! |

```bash
using System;

namespace _52._36_URI_1759 {
    class Program {
        static void Main(string[] args) {
           
            int N = int.Parse(Console.ReadLine());

            //Exibir "Ho" do papai noel
            for (int i = 0; i < N; i++) {
                if (             ) {
                    Console.Write("Ho ");                  //Complete o código no espaço em branco
                }
                else{
                    Console.WriteLine("Ho!");
                }
            }
        }
    }
}
```
