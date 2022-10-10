// De Quem é a Vez?


/*

Desafio
O jogo PAR ou ÍMPAR vem decidindo o destino de pessoas ao longo de décadas. As regras são simples: dois jogadores informam um número e se a soma desses números for par o jogador que escolheu PAR ganha e vice-versa. Em um jogo que as crianças do bairro estão jogando, eles não conseguem decidir quem será o próximo a escolher as regras da brincadeira. Para solucionar esse problema, você foi chamado.
Basicamente a brincadeira só poderá ser jogada de dois em dois jogadores e para escolher o próximo jogador uma das  crianças pediu sua ajuda para desenvolver um programa que, dado o nome dos jogadores, suas respectivas escolhas PAR ou IMPAR e os números, informe quem foi o vencedor.
Entrada
A primeira linha de entrada contém um número inteiro QT (1 ≤ QT ≤ 100), indicando a quantidade de casos de teste que vem a seguir. Cada caso de teste contém duas linhas. Na primeira linha será informado o nome do jogador 1 seguido de sua escolha, “PAR” ou “IMPAR” e logo após, o nome do jogador 2 seguido de sua escolha, “PAR” ou “IMPAR”. Na segunda linha de entrada, contém 2 números inteiros N (1 ≤ N ≤ 10⁹) e M (1 ≤ M ≤ 10⁹), representando respectivamente os números escolhidos pelo jogador 1 e pelo jogador 2. É garantido que a escolha (PAR ou IMPAR) do jogador 1 será diferente da escolha (PAR ou IMPAR) do jogador 2 e que o nome dos jogares são formados somente por letras e não ultrapassarão 100 caracteres.
Saída
Para cada caso de teste, imprima uma única linha contendo o nome do jogador vencedor.
 
Exemplo de Entrada	
4
Quico PAR Chiquinha IMPAR
9 7
Dami PAR Marcus IMPAR
12 3
Dayran PAR Conrado IMPAR
3 1000000000
Popis PAR Chaves IMPAR
2 7	

Exemplo de Saída
Quico
Marcus
Conrado
Chaves


*/

// TODO: complete os espaços em branco com sua solução para o problema
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;

public class DIO{
	 
    public static void main(String[] args) {

		//a classe Scanner auxilia na leitura dos dados de entrada
		Scanner leitor = new Scanner(System.in);

		int QT = Integer.parseInt(leitor.nextLine());

		String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
		int N, M;
		
		for (int i = 0; i < QT; i++) {

			//quebra string em várias substrings a partir de um caracter
			linha1 = leitor.nextLine().split(" ");
			linha2 = leitor.nextLine().split(" ");
			

			N = Integer.parseInt(linha2[0]);
		  M = Integer.parseInt(linha2[1]);
		
			nome1 = linha1[0];
			escolha1 = linha1[1];

	    nome2 = linha1[2];
			escolha2 = linha1[3];
			 
			if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) ||
			     ((N + M) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) System.out.println(nome1);
			else System.out.println(nome2);
		}
    }
	
}

