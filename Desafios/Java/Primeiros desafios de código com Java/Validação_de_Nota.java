//  Validação de Nota

/*
Desafio
Para ajudar a calcular as notas referentes às duas avaliações dos alunos, uma professora pediu para que você desenvolva um programa que calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.

 
Exemplo de Entrada	
-3.5
3.5
11.0
10.0

Exemplo de Saída
nota invalida
nota invalida
media = 6.75
*/

import java.util.Scanner;

public class Problem{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int c=0;
        double soma=0, n;
        
        while(c<2){
            n=entrada.nextDouble();
            if((n >= 0) & (n <= 10)){
                c++;
                soma+=n;
            }
            else{
                System.out.println("nota invalida");
            }
        }

        System.out.println("media = " + String.format("%.2f",soma*0.5));

        entrada.close();
    }
}