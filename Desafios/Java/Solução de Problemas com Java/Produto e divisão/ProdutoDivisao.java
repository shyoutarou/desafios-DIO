import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CombinacaoStrings {
    public static void main(String[] args) {
        BigDecimal resultado = new BigDecimal(1);
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        while (sc.hasNextLine()) {
            BigDecimal digito = new BigDecimal(sc.nextInt());
            String operador = sc.nextLine().trim();
            if ("/".equals(operador)) resultado = resultado.divide(digito, 3, RoundingMode.CEILING);
            if ("*".equals(operador)) resultado = resultado.multiply(digito);
        }
        System.out.println(resultado.toBigInteger());
    }
}