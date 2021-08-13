import java.util.Scanner;

public class ConsumoMedio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int distance = leitor.nextInt();
        Double consumption = leitor.nextDouble();
        Double mediumConsumption = distance / consumption;
        System.out.printf("%.3f km/l", mediumConsumption);
    }
}