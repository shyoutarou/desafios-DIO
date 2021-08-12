package desafios;

/*
Desafio
Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.

Entrada
A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

Saída
A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso entre duas palavras.


Exemplo de Entrada
2
One three four mond at midnight
one three five

Exemplo de Saída
midnight three four mond One at
three five one

 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenaPalavrasTamanho {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {

            var palavras = leitor.nextLine().split(" ");

            Arrays.sort(palavras, new java.util.Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.length() - s1.length();// comparision
                }
            });

            System.out.println(Arrays.toString(palavras).replaceAll("[\\[|\\]|\\,]", ""));
        }

        leitor.close();
    }
}
