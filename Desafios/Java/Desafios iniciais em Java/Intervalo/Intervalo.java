import java.io.IOException;
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]"); //digite sua lógica aqui
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");  //digite sua lógica aqui
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]"); //digite sua lógica aqui
        } else {
            System.out.println("Fora de intervalo");
    }
    } 
}