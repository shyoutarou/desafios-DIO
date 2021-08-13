package desafios;

/*
   public static void main(String[] args) throws IOException {
        String , , , ; //declare suas variaveis aqui
        while (( = in.readLine()) != null) { // complete seu código
                = in.readLine();
            if (  ) {

            } else {

            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = ; i <= ; ) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
}

Exemplo de Entrada
abcdef
cdofhij
TWO
FOUR
abracadabra
open
Hey This java is hot
Java is a new paradigm

Exemplo de Saída
2
1
0
7

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EncontreMaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String min = "", max = "", temp = ""; //declare suas variaveis aqui
        while ((min = in.readLine()) != null) { // complete seu código
            max = in.readLine();
            if (min.length() > max.length()) {
                temp = min;
                min = max;
                max= temp;
            }

            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao

                    var minsub = min.substring(i, i + maxS);

                    if (max.contains(minsub)) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}
