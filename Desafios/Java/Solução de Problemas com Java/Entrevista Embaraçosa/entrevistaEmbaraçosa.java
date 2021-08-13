/**
 * Desafio
A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

Entrada
Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim de arquivo.

Saída
Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.

 
Exemplo de Entrada	Exemplo de Saída
sanduicheiche

barrilarril

ratoato

sol

coliseueu

queijoijo

astroastro

a

sanduiche

barril

rato

sol

coliseu

queijo

astro

a
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String proximaPalavra;

        while((proximaPalavra = br.readLine()) != null) {
            boolean encontrouRepeticao = false;
            for(int i=0; i <= proximaPalavra.length() - 1; i++) {
                if( proximaPalavra.substring(0, i).endsWith(proximaPalavra.substring(i)) ) {
                    System.out.println(proximaPalavra.substring(0, i));
                    encontrouRepeticao = true;
                }
            }
            if(!encontrouRepeticao) 
              System.out.println(proximaPalavra);
        }
    }
}