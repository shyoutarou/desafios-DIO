//  https://web.digitalinnovation.one/coding/aceleracao-global-dev-15-gft/algorithm/calculo-simples?back=/tracks

// Cálculo Simples

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

 
Exemplos de Entrada	Exemplos de Saída
12 1 5.30
16 2 5.10

VALOR A PAGAR: R$ 15.50

13 2 15.30
161 4 5.20

VALOR A PAGAR: R$ 51.40

1 1 15.10
2 1 15.10

VALOR A PAGAR: R$ 30.20
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double total = 0;
    		for (int i = 0; i < 2; i++) {
            int cod1 = leitor.nextInt();
            int n1 = leitor.nextInt();
            double valor1 = leitor.nextDouble();

            total += n1 * valor1;
    		}
		

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}