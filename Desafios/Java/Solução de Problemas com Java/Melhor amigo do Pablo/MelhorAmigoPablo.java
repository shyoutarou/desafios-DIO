import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MelhorAmigoPablo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> alunosAmigos = new TreeSet<>();
        Set<String> alunosNaoAmigos = new TreeSet<>();
        String vencedor = "";
        String entrada;

        while (!"FIM".equals(entrada = sc.nextLine())) {
            String nomeAluno = entrada.split(" ")[0];
            boolean isAmigo = "SIM".equals(entrada.split(" ")[1]);
            if(isAmigo) {
                alunosAmigos.add(nomeAluno);
                if (nomeAluno.length() > vencedor.length())
                    vencedor = nomeAluno;
            } else {
                alunosNaoAmigos.add(nomeAluno);
            }
        }

        alunosAmigos.forEach(System.out::println);
        alunosNaoAmigos.forEach(System.out::println);
        System.out.println("\nAmigo do Pablo:");
        System.out.println(vencedor);
    }
}