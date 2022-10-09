## Desafio

Você recebeu o desafio de ler um valor e criar um programa que coloque o valor
lido na primeira posição de um vetor N[10]. Em cada posição subsequente,
coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for
1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor
em seguida.

## Entrada

A entrada contém um valor inteiro (V<=50).

## Saída

Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e
X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá
receber o valor de V.


| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 1 | N[0] = 1<br>N[1] = 2<br>N[2] = 4<br>... |

	
```bash
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar

const input = gets();
let a = input;

//TODO: Complete os espaços em branco com uma possível solução para o desafio

for (                              ) {
  print(`N[${      }] = ${   }`);
  a =       ;
}

```