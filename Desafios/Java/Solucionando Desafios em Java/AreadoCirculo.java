package desafios;

/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".


Exemplos de Entrada
2.00
Exemplos de Saída
A=12.5664

Exemplos de Entrada
100.64
Exemplos de Saída
A=31819.3103

Exemplos de Entrada
150.00
Exemplos de Saída
A=70685.7750

 */

import java.util.Scanner;

public class AreadoCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double
        var raio = Double.parseDouble(scan.nextLine());

        //continue a solucao
        var area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);

    }
}
