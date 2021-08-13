import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VogaisExtraterrestres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String vogais = sc.nextLine();
            String frase = sc.nextLine();

            int countVogais = 0;
            for(char vogal : vogais.toCharArray()) {
                countVogais += frase.chars().filter(c -> c == vogal).count();
            }
            System.out.println(countVogais);
        }
    }
}