/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
*/

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		if ((a % b == 0) || (b % a == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		scan.close();
	}
}
