## Desafio

Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

## Entrada

A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

## Saída

Imprima a soma dos consecutivos números ímpares a partir do valor X.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 2<br />4 3<br />11 2 | 21<br />24 |

```bash
import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, Y;
        int soma=0, cont=0;
        for (int i = 0; i < N; i++) {
        	


        	while (cont < Y) {
        		if (X % 2 != 0) {
        			
                       //Digite seu código nos espaços em branco  

        		}
        		X++;
        	}
        	System.out.println(soma);
        }
    }
	
}



```