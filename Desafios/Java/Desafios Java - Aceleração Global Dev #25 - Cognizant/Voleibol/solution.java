// Voleibol

/*

Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.
Entrada
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.
Saída
A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.
 
Exemplo de Entrada	
3
Renan
10 20 12
1 10 9
Jonas
8 7 1
2 7 0
Edson
3 3 3
1 2 3	

Exemplo de Saída
Pontos de Saque: 19.05 %.
Pontos de Bloqueio: 63.33 %.
Pontos de Ataque: 75.00 %.


*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) throws IOException {
 
     //a classe Scanner auxilia na leitura dos dados de entrada
     Scanner leitor = new Scanner(System.in);

		//TODO: Complete o código com uma solução possível

    int N = leitor.nextInt();
    
    int saques = 0, bloqueios = 0, ataques = 0;
    int s1 = 0, b1 = 0, a1 = 0;
    
    for (int i = 0; i < N; i++) {
        String name = leitor.next();
        
        saques += leitor.nextInt();
        bloqueios += leitor.nextInt();
        ataques += leitor.nextInt();
        
        s1 += leitor.nextInt();
        b1 += leitor.nextInt();
        a1 += leitor.nextInt();
    }
    
    System.out.printf("Pontos de Saque: %.2f %%.\n", 100.0*s1/saques);
    System.out.printf("Pontos de Bloqueio: %.2f %%.\n", 100.0*b1/bloqueios);
    System.out.printf("Pontos de Ataque: %.2f %%.\n", 100.0*a1/ataques);
    
    leitor.close();


    }
 
}


