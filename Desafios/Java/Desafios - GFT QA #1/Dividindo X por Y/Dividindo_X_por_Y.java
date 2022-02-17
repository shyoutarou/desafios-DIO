// Dividindo X por Y

/*
Desafio
Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

 
Exemplo de Entrada	
3
3 -2
-8 0
0 8

Exemplo de Saída
-1.5
divisao impossivel
0.0
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double divisao = 0;
        for (double i = 0; i < n; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            divisao = x / y;

            if (y == 0){
                System.out.println("divisao impossivel");
            } else {
               
                System.out.println( String.format("%.1f", divisao));
            }

        }
        sc.close();
    }
	
}