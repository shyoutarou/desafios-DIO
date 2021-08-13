package desafios;

/*
Desafio
Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

Tesoura corta papel
Papel cobre pedra
Pedra derruba lagarto
Lagarto adormece Spock
Spock derrete tesoura
Tesoura prende lagarto
Lagarto come papel
Papel refuta Spock
Spock vaporiza pedra
Pedra quebra tesoura
Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

Entrada
Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

Saída
Para cada caso de teste, imprima quem venceu, ou se houve empate.


Exemplo de Entrada
3
spock spock
tesoura spock
lagarto spock

Exemplo de Saída
empate
Marcia
Fernanda

 */


import java.io.IOException;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {
            var resultado = "";
            var palavras = leitor.nextLine().split(" ");

            if(palavras[0].equals(palavras[1])) resultado = "empate";
            else if( (palavras[0].equals("tesoura") && (palavras[1].equals("papel") ||   palavras[1].equals("lagarto") )) ||
                     (palavras[0].equals("papel") && (  palavras[1].equals("pedra") ||   palavras[1].equals("spock") )) ||
                     (palavras[0].equals("pedra") && (  palavras[1].equals("lagarto") || palavras[1].equals("tesoura") )) ||
                     (palavras[0].equals("lagarto") && (palavras[1].equals("spock") ||   palavras[1].equals("papel") )) ||
                     (palavras[0].equals("spock") && (  palavras[1].equals("tesoura") || palavras[1].equals("pedra") ))) resultado = "fernanda";
            else resultado = "marcia";

            System.out.println(resultado);
        }

        leitor.close();
    }
}
