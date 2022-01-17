// Taxa de Imposto de Renda

/*

Desafio
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 
Exemplos de Entrada	Exemplos de Saída
3002.00	R$ 80.36
1701.12	Isento
4520.00	R$ 355.60

*/

import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
       

      //digite o seu código 
        double salario, imposto;
        salario = leitor.nextDouble();

        imposto = 0.00;

        if (salario >= 0 && salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario >= 2000.01 && salario <= 3000.00) {
                imposto = (salario - 2000.00)*.08;
            } else if (salario >= 3000.01 && salario <= 4500.00) {
                imposto = (1000*.08) + ((salario - 3000.00)*.18);
            } else if (salario >= 4500.01) {
                imposto = (1000*.08) + (1500*.18) + ((salario - 4500.00)*.28);
            } 
            System.out.printf("R$ %.2f", imposto);
        }  
    }
	
}



