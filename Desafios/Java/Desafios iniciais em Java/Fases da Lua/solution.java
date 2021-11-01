import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        
        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        } else if (inicio >= 3 && fim <= 96) {
            System.out.println("minguante"); //implemente o código aqui
        } else if (inicio >= 96 && fim <= 3 ) {
            System.out.println("crescente"); //implemente o código aqui
        } else { 
            System.out.println("cheia");  //implemente o código aqui
        }
    }

}
