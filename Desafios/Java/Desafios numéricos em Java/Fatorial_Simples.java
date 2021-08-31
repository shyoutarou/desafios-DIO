
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

 
Exemplo de Entrada	
4
Exemplo de Saída
24

*/

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int fatorial = num;
        int c = 1;

        if (num <= 1) {
            fatorial = 1;
        } else {
            while ((num - c) > 0) {
                fatorial = fatorial * (num - c);
                c++;
            }
        }

        System.out.println(fatorial);
	}
}