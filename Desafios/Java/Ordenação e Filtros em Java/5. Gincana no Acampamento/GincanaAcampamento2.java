package desafios;

/*

Desafio
Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade, sempre com um adulto que, além de dormir com o grupo no cabana, também são responsáveis por criar e executar várias atividades, como por exemplo jogos, excursões, Gincanas Noturnas, etc.

No primeiro dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria o vencedor.

No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando no aluno que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que o primeiro detém. O aluno onde o número contado cair, deve ser retirado do grupo, e a contagem inicia novamente segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido anti-horário.

Desenvolva um programa para que no próximo evento o responsável pela brincadeira saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as N linhas de cada caso de teste conterão duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo inicial.

OBS: O Nome de cada aluno nao devera ultrapassar 30 caracteres e contém apenas letras maiusculas e minúsculas, sem acentos, e o caractere underline. O final da entrada é indicado pelo número zero.

Saída
Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.

Exemplo de Entrada
3
Fernanda 7
Fernando 9
Gustavo 11
5
Maria 7
Pedro 9
Joao_Vitor 5
Isabel 12
Laura 8
3
Maria 4
Pedro 3
Joao 2
0

Exemplo de Saída
Vencedor(a): Fernanda
Vencedor(a): Pedro
Vencedor(a): Pedro


 */

import java.util.*;

public class GincanaAcampamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        List<Jogador> jogadores = new ArrayList<>();
        var numJogadores = 0;

        while (!((numJogadores = scan.nextInt()) == 0)) {

            jogadores.clear();
            int carta;

            for (int i=0; i< numJogadores; i++) {
                String[] entrada = scan.next().split(" ");
                jogadores.add(new Jogador(entrada[0], Integer.parseInt(entrada[1])));
            }
            var jogadorCorrente = 0;
            carta = jogadores.get(jogadorCorrente).getNumero();
            do {
                int resto = carta % jogadores.size();
                int caiuEm = 0;

                if (carta % 2 != 0){
                    caiuEm = jogadorCorrente + resto;
                    if (caiuEm >= jogadores.size()) {
                        caiuEm = caiuEm - jogadores.size();
                    }
                }
                else {
                    caiuEm = jogadorCorrente - resto;
                    if (caiuEm < 0) {
                        caiuEm = caiuEm + jogadores.size();
                    }
                }

                carta = jogadores.get(caiuEm).getNumero();
                jogadores.remove(caiuEm);
                /*
                Se eu removo o jogador da lista, o corrente, quando no sentido crescente
                deve ser um a menos
                 */
                if (carta % 2 !=0) jogadorCorrente = caiuEm - 1;
                else jogadorCorrente = caiuEm;

                if (jogadorCorrente < 0) jogadorCorrente = jogadores.size() - 1;
                if (jogadorCorrente >= jogadores.size()) jogadorCorrente = 0;

            } while (jogadores.size() > 1);

            System.out.println("Vencedor(a): " + jogadores.get(0).getNome());
        }
    }
}

class Jogador {
    private String nome;
    private Integer numero;

    Jogador(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }
}
