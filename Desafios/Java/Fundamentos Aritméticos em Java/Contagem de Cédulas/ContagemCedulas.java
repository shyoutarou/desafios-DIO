import java.util.Scanner;

public class ContagemCedulas {

    public static void main(String[] args) {
        int entrada = (new Scanner(System.in)).nextInt();
        System.out.println(entrada);
        int[] notas = { 100, 50, 20, 10, 5, 2, 1 };

        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = entrada / notas[i];
            System.out.println(quantidadeNotas + " nota(s) de R$ " + notas[i] + ",00");
            entrada -= quantidadeNotas * notas[i];
        }
    }

}