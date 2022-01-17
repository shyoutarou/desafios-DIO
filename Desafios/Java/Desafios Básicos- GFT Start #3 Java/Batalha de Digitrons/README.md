## Desafio

Após os rivais Bruno e Guarte capturarem alguns Digitrons, eles resolveram batalhar entre eles. Então decidiram fazer isso de uma forma simples, com combates no modo 1x1 e vencendo quem tem o Digitron com maior valor de golpe, que é definido da seguinte forma:
 
<p align="center">
	<img src="../../../assets/Digitrons.png" width="470" height="270">
</p>

O Bônus será dado ao Digitron do treinador que estiver em um level de valor par.
Neste problema será dado a você o valor do bônus aplicado, os valores de ataque e defesa do Digitron de Bruno e Guarte e seus respectivos níveis, cabe a você informar o vencedor da batalha.

## Entrada

A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de instâncias. Cada instância começa com um inteiro B (0 ≤ B ≤ 100), que indica o valor do bônus aplicado. Nas duas linhas seguintes terão três inteiros Ai, Di e Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), representado o valor de ataque do Digitron, o valor de defesa e o level do treinador. A primeira linha representa o Digitron de Bruno e a segunda o de Guarte.

## Saída

Para instância na entrada você deverá imprimir o nome do treinador que vencerá a batalha, em caso de empate imprima: "Empate", mas sem as aspas.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- | 
| 3<br />5<br />12 23 15<br />42 12 20<br />2<br />52 1 11<br />1 52 1<br />3<br />95 12 22<br />5 51 21 | Guarte<br />Empate<br />Bruno |


```bash
import java.io.IOException;
import java.util.Scanner;

public class Problem {
//complete os espaços em branco com uma solução possível
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    		B = leitor.nextInt();
    		A1 = leitor.nextInt();
    		D1 = leitor.nextInt();
    		L1 = leitor.nextInt();
    		A2 = leitor.nextInt();
    		D2 = leitor.nextInt();
    		L2 = leitor.nextInt();

    		V1 = (            ) + (L1 % 2 == 0 ? B : 0);
    		V2 = (            ) + (L2 % 2 == 0 ? B : 0);
    		
                if (           ) System.out.println("Bruno");
    		else if (         ) System.out.println("Guarte");
    		else System.out.println("Empate");
    	}
    }
	
}


```