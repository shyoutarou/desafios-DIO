// Teste de Seleção 1

/*
Desafio
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Imprima a mensagem corretamente esperada pela validação dos valores.

 
Exemplo de Entrada	
5 6 7 8
Exemplo de Saída
Valores nao aceitos

2 3 2 6	
Exemplo de Saída
Valores aceitos
*/

import java.util.Scanner;

public class Problem{

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

    boolean sit1 = false;
    boolean sit2 = false;
    boolean sit3 = false;
    boolean sit4 = false;
    boolean sit5 = false;

    if(B>C) {
        sit1 = true;
    }

    if(D>A) {
        sit2 = true;
    }

    if((C+D)>(A+B)) {
        sit3 = true;
    }

    if(C>=0 && D>=0) {
        sit4 = true;
    }

    if(A%2==0) {
        sit5 = true;
    }

    if(sit1 && sit2 && sit3 && sit4 && sit5) {
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores nao aceitos");
    }
        
	}
}