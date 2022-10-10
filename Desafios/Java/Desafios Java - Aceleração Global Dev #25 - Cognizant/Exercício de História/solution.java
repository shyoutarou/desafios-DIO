// Exercício de História

/*

Mesmo pensando muito a respeito de como que os anos são encaixados na contagem de séculos, os alunos ainda continuavam com dúvidas e a professora de história não conseguia avançar na matéria. Devido a isso, a professora pediu que seus alunos informassem o número (em decimal e em algarismos arábicos) do século de um determinado ano, mas como quase ninguém aprendia, ela decidiu pedir sua ajuda para criar um programa que fosse capaz dessa proeza.
Você, por outro lado, aprendeu bem que o século 1, por exemplo, relaciona-se aos anos 1 a 100, o século 2 aos anos 101 a 200, o século 3 aos anos de 201 a 300 e por aí vai.
Entrada
A entrada consiste em vários casos de teste. Cada linha é um novo caso de teste e contém um único inteiro N (1 ≤ N ≤ 109), que corresponde ao valor de algum ano que deve ser processado.
Saída
Para cada caso de teste, imprima uma única linha contendo o valor do século do ano correspondente.
 
Exemplo de Entrada	
1
999
2000
2001	

Exemplo de Saída
1
10
20
21

*/

import java.util.*;
 
public class Program
{
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args)
    {
       //a classe Scanner auxilia na leitura dos dados de entrada
       Scanner input = new Scanner(System.in);
       
        int ano, seculo;
    
        // hasNext é um método da classe Java Scanner que retorna true se tiver outra entrada
        while (input.hasNext()) {
            
        //TODO: Complete o código com uma solução possível
        ano = input.nextInt();
        seculo = (int)(Math.ceil((double)ano / 100));
        
        if(ano <= (seculo-1)*100) seculo = seculo - 1;
       
        System.out.println(seculo);
        
        }
    }
}

