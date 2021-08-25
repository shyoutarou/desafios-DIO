package desafios;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;


/*
2.0 4.0 7.5 8.0
6.4
        Media: 5.4
        Aluno em exame.
        Nota do exame: 6.4
        Aluno aprovado.
        Media final: 5.9
2.0 6.5 4.0 9.0
        Media: 4.8
        Aluno reprovado.
9.0 4.0 8.5 9.0
        Media: 7.3
        Aluno aprovado.
0.0 9.9 10.0 0.0
5.1
        Saída esperada:
        Media: 7.0
1.0 10.0 10.0 0.0
        Saída esperada:
        Media: 7.2
        Aluno aprovado.
10.0 10.0 10.0 10.0
        Saída esperada:
        Media: 10.0
        Aluno aprovado.
2.0 4.0 7.5 8.0
2.2
        Saída esperada:
        Media: 5.4
        Aluno em exame.
        Nota do exame: 2.2
        Aluno reprovado
        Media final: 3.8
 */



import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Desafio{

	public static void main(String[] args)  throws IOException {
	  
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

	// Variaveis tem que ser double float n1,n2,n3,n4,media;
    double n1,n2,n3,n4,media,emexame,mediafinal;
    
	// Variaveis tem que ser double n1 = sc.nextFloat();
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    n4 = sc.nextDouble();

    media = (2*n1 + 3*n2 + 4*n3 + n4)/10;
    System.out.printf("Media: %.1f\n",media);

		//continue a solucao de acordo com o enunciado
    if (media >= 7.0){
        System.out.printf("Aluno aprovado.\n");
    } else if (media < 5.0){
        System.out.printf("Aluno reprovado.\n");
    } else if (media >= 5 && media <= 6.9 ){
        System.out.printf("Aluno em exame.\n");
        emexame = sc.nextFloat();
        System.out.printf("Nota do exame: %.1f\n", emexame);
        mediafinal = ((media + emexame)/2);        

      
      if( mediafinal >= 5.0){
        System.out.printf("Aluno aprovado.\n");
        System.out.printf("Media final: %.1f\n", mediafinal );
      } else{
        System.out.printf("Aluno reprovado\n");
        System.out.printf("Media final: %.1f\n", mediafinal );
      }
		}

		sc.close();
	}
}


