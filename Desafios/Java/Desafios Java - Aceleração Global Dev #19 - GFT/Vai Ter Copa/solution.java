//  Vai Ter Copa?

/*

Desafio
Kluper é o país sede da copa do mundo. Porém, há muitas pessoas protestando contra o governo. Em redes sociais é possível ver pessoas afirmando que não vai ter copa devido aos protestos e insatisfação política
Mas esses rumores de que não haverá copa são totalmente falsos, e o governo já avisou: vai ter copa sim! 
Entrada
A entrada contém vários casos de teste. Cada caso de teste consiste de uma linha contendo o número N de reclamações sobre a copa encaminhadas para o governo (0 ≤ N ≤ 100).
Saída
Para cada teste, a saída consiste de uma linha dizendo "vai ter copa!" caso não haja reclamações para o governo. Caso haja reclamações, a saída deverá dizer "vai ter duas!".
 
Exemplo de Entrada	
0
1
0
2
100
0	

Exemplo de Saída
vai ter copa!
vai ter duas!
vai ter copa!
vai ter duas!
vai ter duas!
vai ter copa!

*/

import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
       //digite o seu código aqui
        while (leitor.hasNext()) {
            int value = Integer.parseInt(leitor.next());

            if (value > 0) {
                System.out.println("vai ter duas!");
            } else {
                System.out.println("vai ter copa!");
            }
        }
    }
	
}


