package desafios;
/*
Desafio
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.


Exemplo de Entrada
5

Exemplo de Saída
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125



 */


import java.io.IOException;
import java.util.Scanner;

public class QuadradoeaoCubo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {

            System.out.println(i + " " + String.format("%.0f", Math.pow(i,2))   + " " + String.format("%.0f", Math.pow(i,3)) );
        }
    }
}
