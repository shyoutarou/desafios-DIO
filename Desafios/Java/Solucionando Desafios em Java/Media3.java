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


public class Media3 {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        float n1,n2,n3,n4,media;
        double emexame, emexamefinal;
/*
        n1 ;*/

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        BigDecimal bd = new BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN);
        media = bd.floatValue();

        System.out.printf("Media: %.1f\n",media);

        //continue a solucao de acordo com o enunciado

        if (media > 7){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (media < 5){
            System.out.printf("Aluno reprovado.\n");
        }
        else if (media > 5 && media < 7)  {
            System.out.printf("Aluno em exame.\n");
            emexame = sc.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", emexame );

            emexamefinal = (media + emexame) / 2;

            if( emexamefinal > 5.5 ){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
            else{
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
        }
        sc.close();
    }
}
