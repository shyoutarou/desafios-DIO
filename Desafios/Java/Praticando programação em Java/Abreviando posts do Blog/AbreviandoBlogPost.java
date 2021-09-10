import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class AbreviandoBlogPosts {

    protected static Map<String, Integer> ocorrenciasPalavra;
    protected static Map<Character, String> abreviacoes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!".".equals((line = br.readLine()))) {
            StringTokenizer st = new StringTokenizer(line);
            ocorrenciasPalavra = new HashMap<>();
            abreviacoes = new TreeMap<>();
            while (st.hasMoreTokens()) {
                String proximaPalavra = st.nextToken();
                if (proximaPalavra.length() <= 2) continue;
                ocorrenciasPalavra.put(proximaPalavra, ocorrenciasPalavra.containsKey(proximaPalavra) ? ocorrenciasPalavra.get(proximaPalavra) + 1 : 1);
                abreviacoes.put(proximaPalavra.charAt(0), melhorPalavraAbreviada(proximaPalavra));
            }
            imprimirSaida(line);
        }
    }

    private static String melhorPalavraAbreviada(String proximaPalavra) {
        if (!abreviacoes.containsKey(proximaPalavra.charAt(0))) {
            return proximaPalavra;
        }
        int novaReducaoCaracteres = ocorrenciasPalavra.get(proximaPalavra) * (proximaPalavra.length() - 2);
        String abreviadaAtual = abreviacoes.get(proximaPalavra.charAt(0));
        int reducaoAtualCaracteres = ocorrenciasPalavra.get(abreviadaAtual) * (abreviadaAtual.length() - 2);
        return novaReducaoCaracteres > reducaoAtualCaracteres ? proximaPalavra : abreviadaAtual;
    }

    private static void imprimirSaida(String line) {
        List<String> listaAbreviacoes = new ArrayList<>();
        for (Character c : abreviacoes.keySet()) {
            String palavraAbreviada = abreviacoes.get(c);
            line = line.replaceAll("\\b" + palavraAbreviada + "\\b", " " + c + ". ");
            listaAbreviacoes.add(c + ". = " + palavraAbreviada);
        }

        System.out.println(line.trim());
        System.out.println(listaAbreviacoes.size());
        listaAbreviacoes.forEach(System.out::println);
    }
}