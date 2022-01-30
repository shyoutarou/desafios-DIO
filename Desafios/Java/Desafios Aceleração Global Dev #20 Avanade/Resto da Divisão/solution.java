//  Resto da Divisão

/*

Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.
Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.
Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
 
Sample Input	
10
18	

Sample Output
12
13
17

 Apesar de haver como exemplo esses testes abertos.... é pra ignorar essa saída de error, pois não passará no teste fechado #6
Sample Input	
2
2

Sample Output
error

Sample Input	
3
2

Sample Output
error

*/

import java.util.Scanner;

public class DIO {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
       
        //Escreva o seu código aqui
        int maior = Math.max(x, y);
        int menor = Math.min(x, y);

        for (int i = menor + 1; i < maior; ++i) {
            if (i % 5 == 2 || i % 5 == 3 ) System.out.println(i);
        }

    }
}


