/*
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores
informados são pares, quantos valores informados são ímpares, quantos valores
informados são positivos e quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha
e não esquecendo o final de linha após cada uma.
*/

import java.util.Scanner;

public class AnaliseDeNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;

		for (int i = 0; i < 5; i++) {
			n = scan.nextInt();
			if (n % 2 == 0)
				par += 1;
			if (n % 2 != 0)
				impar += 1;
			if (n > 0)
				positivo += 1;
			if (n < 0)
				negativo += 1;
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		scan.close();
	}
}
