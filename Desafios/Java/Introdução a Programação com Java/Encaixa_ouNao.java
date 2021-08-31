package desafios;

/*Desafio
        Paulinho tem em suas mãos um novo problema.
        Agora a sua professora lhe pediu que construísse
        um programa para verificar, à partir de dois valores
        muito grandes A e B, se B corresponde aos últimos
        dígitos de A.

Entrada
        A entrada consiste de vários casos de teste. A primeira
        linha de entrada contém um inteiro N que indica a quantidade
        de casos de teste. Cada caso de teste consiste de dois
        valores A e B maiores que zero, cada um deles podendo
        ter até 1000 dígitos.

Saída
        Para cada caso de entrada imprima uma mensagem indicando
        se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

Exemplo de Entrada	                     Exemplo de Saída
4
56234523485723854755454545478690 78690   encaixa
5434554 543                              nao encaixa
1243 1243                                encaixa
54 64545454545454545454545454545454554   nao encaixa

 */

import java.util.Scanner;

public class Encaixa_ouNao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());

		for (int i = 0; i < N; i++) {
			String n1 = leitor.next();
			String n2 = leitor.next();
            Boolean AmaiorB = ( n1.length() >= n2.length());
            var partefinal =  AmaiorB ? n1.substring((n1.length() - n2.length()), n1.length()) : "";

			if (partefinal.equals(n2))
				System.out.println("encaixa");
			else
				System.out.println("nao encaixa");
		}
    }
}
