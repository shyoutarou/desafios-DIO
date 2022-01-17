// Fórmula de Bhaskara

/*


Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
Entrada
Leia três valores de ponto flutuante (double) A, B e C.
Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 
Exemplos de Entrada	
10.0 20.1 5.1	

Exemplos de Saída
R1 = -0.29788
R2 = -1.71212

0.0 20.0 5.0	

Exemplos de Saída
Impossivel calcular


10.3 203.0 5.0	

Exemplos de Saída
R1 = -0.02466
R2 = -19.68408


10.0 3.0 5.0	

Exemplos de Saída
Impossivel calcular


*/

import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        double delta, r1, r2;

      //Escreva o seu código
        delta = ((b * b) - (4 * a * c));
        
        if ( delta < 0 || a == 0) {

            System.out.println("Impossivel calcular");
        } else {

            r1 = (-b + (Math.sqrt(delta))) / (2 * a);
            r2 = (-b - (Math.sqrt(delta))) / (2 * a);

            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);

        }
        
    }
	
}

