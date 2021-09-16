package desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

/*

Desafio
O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

Entrada
Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.

Exemplo de Entrada
9
Maria Jose
branco P
Mangojata Mancuda
vermelho P
Cezar Torres Mo
branco P
Baka Lhau
vermelho P
JuJu Mentina
branco M
Amaro Dinha
vermelho P
Adabi Finho
branco G
Severina Rigudinha
branco G
Carlos Chade Losna
vermelho P
0

Exemplo de Saída
branco P Cezar Torres Mo
branco P Maria Jose
branco M JuJu Mentina
branco G Adabi Finho
branco G Severina Rigudinha
vermelho P Amaro Dinha
vermelho P Baka Lhau
vermelho P Carlos Chade Losna
vermelho P Mangojata Mancuda

 */
public class UniformesFinaldeAno {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String linha;
        Tshirt[] tshirts = new Tshirt[0];
        int N = 0;
        int index = 0;
        boolean firstCase = true;

        while (!(linha = read()).equals("0")) {

            if (firstCase) {
                N = toInt(linha);
                tshirts = new Tshirt[N];
                firstCase = false;
                continue;
            } else {
                if(linha.contains("branco") || linha.contains("vermelho"))
                {
                    var colorsize = linha.split(" ");
                    tshirts[index].setColor(colorsize[0]);
                    tshirts[index].setSize(colorsize[1]);
                    index++;
                }
                else
                {
                    tshirts[index] = new Tshirt(null, null, linha.toString());
                }
            }
        }

        Comparator<Tshirt> byAge = Comparator.comparing(Tshirt::getColor);
        Comparator<Tshirt> bySize = Comparator.comparing(Tshirt::getSize).reversed();
        Comparator<Tshirt> byName = Comparator.comparing(Tshirt::getOwner);

        Arrays.sort(tshirts, byAge.thenComparing(bySize).thenComparing(byName));

        for (int i = 0; i < N; i++) {
            out.println(tshirts[i].toString());
        }

        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}
