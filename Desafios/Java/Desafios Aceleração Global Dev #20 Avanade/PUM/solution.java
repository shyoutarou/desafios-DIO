// PUM

/*

Desafio
Desenvolva um programa que leia um valor inteiro N. Este N refere-se à quantidade de linhas de saída que serão apresentadas na execução do programa.
Entrada
O arquivo de entrada contém um número inteiro positivo N.
Saída
Imprima a saída conforme o exemplo fornecido.
 
Exemplo de Entrada	
7	

Exemplo de Saída
1 2 3 PUM
5 6 7 PUM
9 10 11 PUM
13 14 15 PUM
17 18 19 PUM
21 22 23 PUM
25 26 27 PUM


*/

import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n, aux=1;
		
		n = sc.nextInt();
		
		//Escreva o seu código
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <=3; j++) {
            System.out.print(aux + " ");
            aux++;
            if(j % 3 == 0)
            {
                aux++;
                System.out.println("PUM");
            }
        }
    }
    
    sc.close();
	}
}

