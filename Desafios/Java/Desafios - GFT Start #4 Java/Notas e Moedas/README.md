## Desafio

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

## Entrada

O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

## Saída

Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 576.73 | NOTAS:<br />5 nota(s) de R$ 100.00<br />1 nota(s) de R$ 50.00<br />1 nota(s) de R$ 20.00<br />0 nota(s) de R$ 10.00<br />1 nota(s) de R$ 5.00<br />0 nota(s) de R$ 2.00<br />MOEDAS:<br />1 moeda(s) de R$ 1.00<br />1 moeda(s) de R$ 0.50<br />0 moeda(s) de R$ 0.25<br />2 moeda(s) de R$ 0.10<br />0 moeda(s) de R$ 0.05<br />3 moeda(s) de R$ 0.01 |
| 4.00 | NOTAS:<br />0 nota(s) de R$ 100.00<br />0 nota(s) de R$ 50.00<br />0 nota(s) de R$ 20.00<br />0 nota(s) de R$ 10.00<br />0 nota(s) de R$ 5.00<br />2 nota(s) de R$ 2.00<br />MOEDAS:<br />0 moeda(s) de R$ 1.00<br />0 moeda(s) de R$ 0.50<br />0 moeda(s) de R$ 0.25<br />0 moeda(s) de R$ 0.10<br />0 moeda(s) de R$ 0.05<br />0 moeda(s) de R$ 0.01 |
| 91.01 | NOTAS:<br />0 nota(s) de R$ 100.00<br />1 nota(s) de R$ 50.00<br />2 nota(s) de R$ 20.00<br />0 nota(s) de R$ 10.00<br />0 nota(s) de R$ 5.00<br />0 nota(s) de R$ 2.00<br />MOEDAS:<br />1 moeda(s) de R$ 1.00<br />0 moeda(s) de R$ 0.50<br />0 moeda(s) de R$ 0.25<br />0 moeda(s) de R$ 0.10<br />0 moeda(s) de R$ 0.05<br />1 moeda(s) de R$ 0.01 |


```bash
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N;
		int quociente, resto, nota, moeda;

		N = sc.nextDouble();

		resto = (int) (N * 100.0 + 0.5);

		System.out.println("NOTAS:");

		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

	        //Continue o seu código aqui


		System.out.println("MOEDAS:");


		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;

		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		//continue o seu código aqui



		System.out.println(resto + " moeda(s) de R$ 0.01");

		sc.close();
	}
}


```






