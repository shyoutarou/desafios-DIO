import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConjuntoBomRuim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());

        while (N != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < N; i++)
                conjunto.add(br.readLine());

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());

            String saida = "Conjunto Bom";
            for (int i = 0; i < N - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    saida = "Conjunto Ruim";
                    break;
                }
            }

            System.out.println(saida);
            N = Integer.valueOf(br.readLine());
        }
    }
}