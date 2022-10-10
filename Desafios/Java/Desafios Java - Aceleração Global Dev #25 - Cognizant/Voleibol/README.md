## Desafio

Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.

## Entrada

A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.

## Saída

A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 3<br />Renan<br />10 20 12<br />1 10 9<br />Jonas<br />8 7 1<br />2 7 0<br />Edson<br />3 3 3<br />1 2 3 | Pontos de Saque: 19.05 %.<br />Pontos de Bloqueio: 63.33 %.<br />Pontos de Ataque: 75.00 %.  |


```bash
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) throws IOException {
 
     //a classe Scanner auxilia na leitura dos dados de entrada
     Scanner leitor = new Scanner(System.in);

		//TODO: Complete o código com uma solução possível

		int N = leitor.nextInt();          

		int[] dados =           ;
		for (                 ) {
			
			//input para pegar o nome do jogador que não vai ser utilizado nos cálculos
			leitor.next(); 

			for (                        ) {
				dados[j] += leitor.nextInt();
			}
		}
		double bloqueios = (                ) /         ;
		double saques = (                   ) /         ;
		double ataques = (                  ) /         ;
		System.out.println(String.format("Pontos de Saque: %.2f", bloqueios) + " %.");
		System.out.println(String.format(                                  ) + " %.");
		System.out.println(                                                         );
 
    }
 
}



```