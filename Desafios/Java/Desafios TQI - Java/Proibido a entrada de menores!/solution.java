// Proibido a entrada de menores!

/*
Desafio
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos. Faça um programa para ler um número N, a idade de N pessoas. Depois disso, coloque a idade mínima permitida  para se entrar no local, conforme exemplo.

Retorne às idades de quem não puder entrar.
Entrada 	
4
18
22
15
50	

Saída
Nao poderao entrar as idades:
4
15

*/

import java.util.*;
 
    public class DIO{

	//complete o código para que ele funcione corretamente
 
        public static void main(String[] args) {
           
	    //a classe Scanner auxilia na leitura dos dados de entrada
            Scanner scan = new Scanner(System.in);
 
            int N= scan.nextInt();
            String string = scan.nextLine();
	    
	    
	    //quebra string em várias substrings a partir de um caracter
            //String[] s = string.split(" ");
 
            double[] idade = new double[N];
 
            for (int i = 0; i < N; i++)
            {
	            string = scan.nextLine();	            
	            idade[i] = Integer.parseInt(string);	
            }
 
 
            System.out.println("Nao poderao entrar as idades: ");
            for (int i = 0; i < N; i++)
            {
  	            if(idade[i] < 18) {
  	            	System.out.println((int) idade[i]);
  	            }
            }
                   
        }
    }


