## Desafio

A Copa do Mundo de Futebol é um dos maiores eventos esportivos do Planeta Terra, e o álbum de figurinhas oficial é sempre um grande sucesso entre os amantes dessa competição. O álbum contém espaços numerados de 1 a N para colar as figurinhas; cada figurinha, também numerada de 1 a N, é uma pequena foto de um jogador de uma das seleções que jogará a Copa do Mundo. O objetivo é colar todas as figurinhas nos respectivos espaços no álbum, de modo a completar o álbum, ou seja, não deixar nenhum espaço sem a correspondente figurinha.
As figurinhas são vendidas em envelopes fechados, de forma que o comprador não sabe quais figurinhas está comprando, e pode ocorrer de comprar uma figurinha que ele já tenha colado no álbum.
Para ajudar os usuários, a empresa responsável pela venda do álbum e das figurinhas quer criar um aplicativo que permita gerenciar facilmente as figurinhas que faltam para completar o álbum e está solicitando a sua ajuda.
Dados o número total de espaços e figurinhas do álbum, e uma lista das figurinhas já compradas (que pode conter figurinhas repetidas), o seu desafio é determinar quantas figurinhas faltam para completar o álbum.

## Entrada

A primeira linha contém um inteiro N (1 ≤ N ≤ 100) indicando o número total de figurinhas e espaços no álbum. A segunda linha contém um inteiro M (1 ≤ M ≤ 300) indicando o número de figurinhas já compradas. Cada uma das M linhas seguintes contém um número inteiro X (1 ≤ X ≤ N) indicando uma figurinha já comprada.

## Saída

Seu programa deve produzir uma única linha contendo um inteiro representando o número de figurinhas que falta para completar o álbum.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 10<br>3<br>5<br>8<br>3 | 7 |
| 3<br>4<br>2<br>1<br>3<br>3 | 0 |


```bash
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numTotal = scan.nextInt();
    int numFigCompradas = scan.nextInt();
    Set<Integer> setFig = new HashSet<>();
//TODO: Complete os espaços em branco com uma solução possível para o problema
    for (                                      ) {
      
    }
    System.out.println(numTotal - setFig.size());
  }
}


```
