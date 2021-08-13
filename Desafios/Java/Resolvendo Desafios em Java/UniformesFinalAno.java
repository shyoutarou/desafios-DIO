import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer b,a = Integer.parseInt(st.nextToken());


        String nome,tamanho,cor;
        String[] tamanhoCor;
        List<Uniforme> list=new ArrayList<>();

        for(var i=1; i<=a; i++){

            nome=br.readLine().trim();
            tamanhoCor=br.readLine().trim().split(" ");
            cor=tamanhoCor[0];
            tamanho=tamanhoCor[1];
            list.add(new Uniforme(nome,cor,tamanho));

        }
        br.read();
        list.sort(Comparator.comparing((Uniforme uniforme)->uniforme.corUniforme).reversed()
                .thenComparing(uniforme->uniforme.tamanho).reversed().thenComparing(uniforme->uniforme.nomeAluno));

        list.stream().forEach(System.out::println);
        
  }
}

class Uniforme{
    public String nomeAluno;
    public String corUniforme;
    public String tamanho;

    public Uniforme(String nomeAluno, String corUniforme, String tamanho) {
        this.nomeAluno = nomeAluno;
        this.corUniforme = corUniforme;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return ""+corUniforme+" "+tamanho+" "+nomeAluno;
    }
}


/* Desafio
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
vermelho P Mangojata Mancuda */
