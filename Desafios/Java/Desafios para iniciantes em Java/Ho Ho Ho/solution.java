import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int i = 0; i < num; i ++) {
            if ( i != num - 1 ) 
                System.out.print("Ho ");                      //complete o código nos espaços em branco
            else
            System.out.println("Ho!");
        }

    }
}