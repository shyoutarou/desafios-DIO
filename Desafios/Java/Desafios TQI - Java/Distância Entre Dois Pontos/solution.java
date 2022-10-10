// Distância Entre Dois Pontos


/*

Desafio
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, conforme a fórmula:
Distancia = 
Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 
Exemplo de Entrada		Exemplo de Saída
1.0 7.0
5.0 9.0					4.4721
-2.5 0.4
12.1 7.3				16.1484
2.5 -0.4
-12.2 7.0				16.4575


*/

import java.io.IOException;
import java. util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
            DecimalFormat decimal = new DecimalFormat("0.0000");

            Double distancia, x1, x2, x3, y1, y2, y3;

            x1 = input.nextDouble();
            y1 = input.nextDouble();
            x2 = input.nextDouble();
            y2 = input.nextDouble();

            x3 = (x2 - x1) * (x2 - x1);
            y3 = (y2 - y1) * (y2 - y1);

            distancia = x3 + y3;

            distancia = Math.sqrt(distancia);

            System.out.println(decimal.format(distancia));

    }
}


