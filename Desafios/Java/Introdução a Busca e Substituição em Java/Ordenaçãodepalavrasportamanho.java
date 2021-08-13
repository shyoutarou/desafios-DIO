 /*
 * Desafio:
 *  Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho.
 *  Seu programa deve receber um conjunto de palavras e retornar este mesmo
 *  conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das
 * palavras for igual, deve-se ordernar por ordem alfabética.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Ordenaçãodepalavrasportamanho {
   

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int casosTeste = Integer.parseInt(br.readLine());

            List<String> palavras = new ArrayList<>();
            List<Integer> tamPalavra;// = new ArrayList<>();
            List<String> palavra;// = new ArrayList<>();

            StringTokenizer st;// = new StringTokenizer(br.readLine());

            for (int i = 0; i < casosTeste; i++) {

                st = new StringTokenizer(br.readLine());
                //System.out.println("----------------------------------");
                while (st.hasMoreTokens()) {
                    palavras.add(st.nextToken());
                }

                //Retorna uma nova coleção com os nomes concatenados a quantidade de letra de cada nome
                tamPalavra = palavras.stream()
                        .map(estudante
                                -> estudante.length())
                        .collect(Collectors.toList());

                palavra = palavras.stream()
                        .map(estudante
                                -> estudante)
                        .collect(Collectors.toList());

                List<objPalavras> objP = new ArrayList<>();

                for (int j = 0; j < palavras.size(); j++) {
                    objPalavras pal = new objPalavras(tamPalavra.get(j), palavra.get(j));
                    objP.add(pal);
                }

                Collections.sort(objP, (objPalavras c1, objPalavras c2) -> {
                    int cmp = Double.compare(c2.getTamPalavra(), c1.getTamPalavra());
                    if (cmp == 0) { // se as médias forem iguais, desempata pelo menor preço
                        cmp = c1.getPalavra().compareTo(c2.getPalavra());
                    }
                    return cmp;
                });

                for (int j = 0; j < objP.size(); j++) {
                    if ((j + 1) != objP.size()) {
                        System.out.print(objP.get(j).getPalavra() + " ");
                    } else {
                        System.out.print(objP.get(j).getPalavra());
                    }
                }
                System.out.println("");
                palavras.clear();
            }
        }
    }

    public static final class objPalavras {

        private int tamPalavra;
        private String palavra;

        public objPalavras(int tamPalavra, String palavra) {
            this.setTamPalavra(tamPalavra);
            this.setPalavra(palavra);
        }

        /**
         * @return the tamPalavra
         */
        public int getTamPalavra() {
            return tamPalavra;
        }

        /**
         * @param tamPalavra the tamPalavra to set
         */
        public void setTamPalavra(int tamPalavra) {
            this.tamPalavra = tamPalavra;
        }

        /**
         * @return the palavra
         */
        public String getPalavra() {
            return palavra;
        }

        /**
         * @param palavra the palavra to set
         */
        public void setPalavra(String palavra) {
            this.palavra = palavra;
        }
    }
}