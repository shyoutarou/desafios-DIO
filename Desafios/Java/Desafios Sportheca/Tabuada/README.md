## Desafio

Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

## Entrada

A entrada contém um valor inteiro N (2 < N < 1000).

## Saída

Imprima a tabuada de N, conforme o exemplo fornecido.


| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 140 | 1 x 140 = 140<br />2 x 140 = 280<br />3 x 140 = 420<br />4 x 140 = 560<br />5 x 140 = 700<br />6 x 140 = 840<br />7 x 140 = 980<br />8 x 140 = 1120<br />9 x 140 = 1260<br />10 x 140 = 1400 |

 
```bash
import java.io.IOException;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	System.out.println("1 x " + N + " = " + (N * 1));
    	System.out.println("2 x " + N + " = " + (N * 2));
    	System.out.println("3 x " + N + " = " + (         ));
    	System.out.println("4 x " + N + " = " + (         ));
    	System.out.println("5 x " + N + " = " + (         ));
    	System.out.println(                                          ));
    	System.out.println(                                          ));
    	System.out.println(                                          ));
    	System.out.println(                                          ));
    	System.out.println("10 x " + N + " = " + (N * 10));
	}
	
}
```
 

