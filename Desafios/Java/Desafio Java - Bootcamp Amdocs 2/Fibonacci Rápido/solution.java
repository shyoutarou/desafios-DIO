// Fibonacci Rápido

/*
A fórmula de Binet é uma forma de calcular números de Fibonacci.
 
Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.
Entrada
A entrada é um número natural n (0 < n ≤ 50).
Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.
 
Exemplos de Entrada	Exemplos de Saída
1	1.0
 
2	1.0
 
3	2.0
Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA


*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static double fibonacci(int numero){

      double raiz5, parte1, parte2, fibo;

      raiz5 = Math.sqrt(5);
      parte1 = (1.0 + raiz5) / 2;
      parte2 = (1.0 - raiz5) / 2;

      fibo = (Math.pow(parte1, numero) - Math.pow(parte2, numero)) / raiz5;

      return fibo;
  }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
     //escreva o seu código aqui
    int valor = sc.nextInt();

    System.out.printf("%.1f\n", fibonacci(valor));
	}
}
