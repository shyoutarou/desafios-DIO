## Desafio

Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

## Entrada

O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

## Saída

Imprima a saída conforme o exemplo fornecido.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5 | 1 1 1<br />1 2 2<br />2 4 8<br />2 5 9<br />3 9 27<br />3 10 28<br />4 16 64<br />4 17 65<br />5 25 125<br />5 26 126 |

```bash
import java.io.IOException;
import java.util.Scanner;
//TODO: Complete os espaços em branco com uma solução possível
public class Desafio {	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (                   ) {
			System.out.println(i + " " + (         ) + " " + (          ));
			System.out.println(i + " " + (      +1) + " " + (          );
		}
    }
}

```

	