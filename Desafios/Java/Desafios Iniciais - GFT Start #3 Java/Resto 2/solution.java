// Resto 2

/*


Desafio
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
Entrada
A entrada contém um valor inteiro N (N < 10000).
Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 
Exemplo de Entrada	
13	

Exemplo de Saída
2
15
28
41
...


*/

import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (var numero = 0; numero < 10000 ; numero++) {
    		if (numero  % N == 2) System.out.println(numero);
    	}
	}
//Complete com a sua lógica nos espaços em branco	
}





