import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PedarPapelTesouraLagartoSpock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> combinacoes = Arrays.asList(new String[]{"tesoura papel", "papel pedra", "pedra lagarto", "lagarto spock", "spock tesoura", 
                                            "tesoura lagarto", "lagarto papel", "papel spock", "spock pedra", "pedra tesoura"});

        sc.nextLine();
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            if(linha.split(" ")[0].equals(linha.split(" ")[1])) {
                System.out.println("empate");
            } else if (combinacoes.contains(linha)){
                System.out.println("fernanda");
            } else {
                System.out.println("marcia");
            }
        }
    }
}