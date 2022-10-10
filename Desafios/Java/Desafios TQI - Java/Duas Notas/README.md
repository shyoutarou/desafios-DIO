## Desafio

Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos gostarem de suas esfirras, ele só sabe dar o troco com duas notas, ou seja, nem sempre é possível receber o troco certo. Para facilitar a vida de Gil, escreva um programa para ele que determine se é possível ou não devolver o troco exato utilizando duas notas.
As notas disponíveis são: 2, 5, 10, 20, 50 e 100.

## Entrada

A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, em seguida, o valor inteiro M pago pelo cliente (N < M ≤ 104). A entrada termina com N = M = 0.

## Saída

Seu programa deverá imprimir "possible" se for possível devolver o troco exato ou "impossible" se não for possível.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 11 23<br />500 650<br />100 600<br />9948 9963<br />1 2<br />2 4<br />0 0 | possible<br />possible<br />impossible<br />possible<br />impossible<br />impossible |

Aquecimento para a VI Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2016


```bash
import java.io.IOException;
import java.util.Scanner;

public class DIO {

    //complete o código para que ele funcione corretamente

    public static void main(String[] args) throws IOException {
	//a classe Scanner auxilia na leitura dos dados de entrada
    	Scanner leitor = new Scanner(System.in);

    	while (true) {
        	int N = leitor.nextInt();
        	int M = 
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possivel = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (                )              ;
    			}
    		}
    		
    		if (        ) System.out.println("possible");
    		else                 ("impossible");
    	}
    }
	
}


```