// Diferença

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

 
Exemplos de Entrada	
5
6
7
8

Exemplos de Saída
DIFERENCA = -26

0
0
7
8

Exemplos de Saída
DIFERENCA = -56

5
6
-7
8

Exemplos de Saída
DIFERENCA = 86
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        int prodAB = a * b;
        int prodCD = c * d;
        
        int dif = prodAB - prodCD;

        System.out.println("DIFERENCA = " +  dif);
    }
	
}
