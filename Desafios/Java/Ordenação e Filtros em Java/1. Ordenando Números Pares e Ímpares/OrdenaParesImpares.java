package desafios;

/*

Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares
Depois os impares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

Exemplo de Entrada
10
4
32
34
543
3456
654
567
87
6789
98

Exemplo de Saída
4
32
34
98
654
3456
6789
567
543
87
 */

import java.util.*;

public class OrdenaParesImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Integer> listpares = new ArrayList<>();
        List<Integer> listimpares = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int valor = sc.nextInt();
            if (valor % 2 == 0 ) listpares.add(valor);
            else listimpares.add(valor);
        }

        listpares.stream().sorted().forEach(System.out:: println);
        listimpares.stream().sorted(Comparator.reverseOrder()).forEach(System.out:: println);

        sc.close();
    }
}
