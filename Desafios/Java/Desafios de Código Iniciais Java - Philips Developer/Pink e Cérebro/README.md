## Desafio

Pink e Cérebro dividem um apartamento e estão juntos 24h por dia desde o começo da pandemia. Para passar o temp, Pink cria problemas matemáticos para Cérebro resolver, o último deles foi uma lista de números com a seguinte pergunta: quantos números da lista são múltiplos de 2, 3, 4 e 5?
Apesar de parecer simples, porém, quando a lista contém muitos números, Cérebro se confunde e acaba errando alguns cálculos.
Ajude Cérebro a resolver o desadio de Pink.

## Entrada

A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Pink.
A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Pink.

## Saída

Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.
 
| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5<br />2 5 4 20 10 | 4 Multiplo(s) de 2<br />0 Multiplo(s) de 3<br />2 Multiplo(s) de 4<br />3 Multiplo(s) de 5 |

	
```bash
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int multiplosDe2 = 0, multiplosDe3 = 0, multiplosDe4 = 0, multiplosDe5 = 0;

        for (int i = 0; i < n; i++) {
            int li = sc.nextInt();
            if (li % 2 == 0) {
                multiplosDe2++;
            }
            if (li % 3 == 0) {
                multiplosDe3++;
            }
            //TODO: Complete a solução criando as condições e incrementos para os múltiplos de 4 e 5.
        }

        System.out.printf("%d Multiplo(s) de 2\n", multiplosDe2);
        System.out.printf("%d Multiplo(s) de 3\n", multiplosDe3);
        System.out.printf("%d Multiplo(s) de 4\n", multiplosDe4);
        System.out.printf("%d Multiplo(s) de 5\n", multiplosDe5);

    }
}

```
	