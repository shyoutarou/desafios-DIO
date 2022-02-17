//  Notas e Moedas

/* 
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.
 
Exemplo de Entrada	
576.73	

Exemplo de Saída
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

4.00	
Exemplo de Saída
NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
2 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
0 moeda(s) de R$ 0.01

91.01	
Exemplo de Saída
NOTAS:
0 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
2 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
1 moeda(s) de R$ 0.01

*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N, valormoeda;
		int quociente, resto;
    List<Integer> notas = Arrays.asList( 100, 50, 20, 10, 5, 2 );
    List<Integer> moedas = Arrays.asList( 100, 50, 25, 10, 5, 1 );
    
		N = sc.nextDouble();

		resto = (int) (N * 100.0 + 0.5);

		System.out.println("NOTAS:");

    for(Integer nota : notas){
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    }
  
		System.out.println("MOEDAS:");
		
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    for(Integer moeda : moedas){
    		valormoeda = (double) moeda / 100;
    		quociente = resto / moeda;
    		System.out.println(quociente + " moeda(s) de R$ " + decimalFormat.format(valormoeda));
    		resto = resto % moeda;    		
    }

		sc.close();
	}
}
