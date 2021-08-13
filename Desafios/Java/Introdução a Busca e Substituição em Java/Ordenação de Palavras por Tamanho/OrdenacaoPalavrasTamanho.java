import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrdenacaoPalavrasTamanho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeListas = sc.nextInt();

        Comparator<String> comparatorPalavras = Comparator.comparing(String::length, Comparator.reverseOrder())
                                                        .thenComparing(Comparator.naturalOrder());

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            List<String> lista = Arrays.asList(linha.split(" "));
            System.out.println(lista.stream().sorted(comparatorPalavras).collect(Collectors.joining(" ")));
        }
    }
}