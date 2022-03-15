// Sequência Lógica

/*
Detalhe
Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.
Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
Saída
Imprima a saída conforme o exemplo fornecido.
 
Exemplo de Entrada	Exemplo de Saída
5					1 1 1
					1 2 2
					2 4 8
					2 5 9
					3 9 27
					3 10 28
					4 16 64
					4 17 65
					5 25 125
					5 26 126

*/

import java.io.IOException;
import java.util.Scanner;
//TODO: Complete os espaços em branco com uma solução possível
public class Desafio {	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		
    for (int i = 1; i <= N; ++i) {
      System.out.println((int)Math.pow(i, 1) + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
      System.out.println((int)Math.pow(i, 1) + " " + ((int)Math.pow(i, 2) + 1) + " " + ((int)Math.pow(i, 3) + 1));
    }
    }
}
