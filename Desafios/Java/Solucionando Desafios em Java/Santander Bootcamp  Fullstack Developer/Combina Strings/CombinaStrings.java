package desafios;

/*Desafio
        Crie um algoritmo que receba dois inputs que sejam strings
        e combine-as alternando as letras de cada string.

        Deve começar pela primeira letra da primeira string,
        seguido pela primeira letra da segunda string, em seguida
        pela segunda letra da primeira string e continuar dessa
        forma sucessivamente.

        As letras restantes da cadeia mais longa devem ser
        adicionadas ao fim da string resultante e retornada.

        Entrada
        A entrada contém vários casos de teste. A primeira
        linha contém um inteiro N que indica a quantidade de
        casos de teste que vem a seguir. Cada caso de teste
        é composto por uma linha que contém duas cadeias
        de caracteres, cada cadeia de caracteres contém
        entre 1 e 50 caracteres inclusive.

        Saída
        Combine as duas cadeias de caracteres da entrada como
        mostrado no exemplo abaixo e exiba a cadeia resultante.

Dado de entrada:
2
aA Bb
aa bb
Saída esperada:
aBAb
abab

Dado de entrada:
3
AoQeaeAADeNtaehchec DguMksuuosoMkNeN
CouLdaaMrde aQearNoo
nWOVQJKKabhiBrPnYvPAwByBmtCPtlrBEovbBMbPtaxraYIIzA PyzAniqSbUBQLxGKacruKWYDIJzxJCKUBNteUdXDoplmnOIYo
Saída esperada:
ADogQueMakesAuAuDoesNotMakeNhecNhec
CaoQueLadraNaoMorde
nPWyOzVAQnJiKqKSabbUhBiQBLrxPGnKYavcPrAuwKBWyYBDmItJCzPxtJlCrKBUEBoNvtbeBUMdbXPDtoapxlrmanYOIIIYzoA

 */

import java.io.IOException;
import java.util.Scanner;

public class CombinaStrings {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String n1,n2,resultado = "";

        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {

            resultado = "";
            n1 = leitor.next();
            n2 = leitor.next();

            var tam_maior =  ( n1.length() > n2.length()) ? n1.length() : n2.length();
            var tam_menor =  ( n1.length() > n2.length()) ? n2.length() : n1.length();
            var partefinal =  ( n1.length() > n2.length()) ?
                    n1.substring(tam_menor, tam_maior) : n2.substring(tam_menor, tam_maior);

            for (int j = 0; j < tam_menor; j++) {
                resultado += n1.charAt(j);
                resultado += n2.charAt(j);
            }

            System.out.printf(resultado + partefinal + "\n");
            leitor.nextLine();
        }
    }
}
