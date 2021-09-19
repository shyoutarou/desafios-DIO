package desafios;

/*
Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.


Exemplo de Entrada
576

Exemplo de Saída
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

Exemplo de Entrada
11257

Exemplo de Saída
11257
112 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
0 nota(s) de R$ 1,00

Exemplo de Entrada
503

Exemplo de Saída
503
5 nota(s) de R$ 100,00
0 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
0 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

 */

import java.io.IOException;
import java.util.Scanner;

public class ContagemdeCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -=  notas50 * 50;
        int notas20 = atual / 20;
        atual -=  notas20 * 20;
        int notas10 = atual / 10;
        atual -=   notas10 * 10;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println( notas100 + " nota(s) de R$ 100,00");
        System.out.println( notas50 + " nota(s) de R$ 50,00");
        System.out.println( notas20 + " nota(s) de R$ 20,00");
        System.out.println( notas10 + " nota(s) de R$ 10,00");
        System.out.println( notas5 + " nota(s) de R$ 5,00");
        System.out.println( notas2 + " nota(s) de R$ 2,00");
        System.out.println( notas1 + " nota(s) de R$ 1,00");
    }
}
