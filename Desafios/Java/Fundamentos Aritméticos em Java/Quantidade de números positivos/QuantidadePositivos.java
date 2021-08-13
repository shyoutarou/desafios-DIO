import java.util.Scanner;

public class QuantidadePositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        while (sc.hasNextDouble())
            if (sc.nextDouble() > 0)
                contador++;

        System.out.println(contador + " valores positivos");
    }
}