// Experiências

/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 
Exemplo de Entrada	
10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R	

Exemplo de Saída
Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %


 */


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int ratos=0,coelhos=0,sapos=0;
        int quantidadeDeInputs=input.nextInt();
        Double totalDeAnimais = 0.0;
        
        //Escreva o seu código aqui
        input.nextLine();

        for (int i = 0; i < quantidadeDeInputs; i++) {
            String casoTeste[] = input.nextLine().split(" ");
            char animal = casoTeste[1].charAt(0);
            int quantidade = Integer.parseInt(casoTeste[0]);
            totalDeAnimais += quantidade;
            switch (animal) {
                case 'R':
                    ratos += quantidade;
                    break;
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }
        }

        Double percentualCoelhos = coelhos / totalDeAnimais;
        Double percentualRatos = ratos / totalDeAnimais;
        Double percentualSapos = sapos / totalDeAnimais;

        DecimalFormat format = new DecimalFormat("0.00 %");

        System.out.printf("Total: %.0f cobaias\n", totalDeAnimais);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %s\n", format.format(percentualCoelhos));
        System.out.printf("Percentual de ratos: %s\n", format.format(percentualRatos));
        System.out.printf("Percentual de sapos: %s\n", format.format(percentualSapos));

        input.close();

    }
}
