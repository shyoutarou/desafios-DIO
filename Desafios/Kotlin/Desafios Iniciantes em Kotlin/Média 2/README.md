## Desafio

Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

## Entrada

O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

## Saída

Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 5.0<br />6.0<br />7.0 | MEDIA = 6.3 |
| 5.0<br />10.0<br />10.0 | MEDIA = 9.0 |
| 10.0<br />10.0<br />5.0 | MEDIA = 7.5 |


```bash
import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val nota1 = input.nextDouble()
    val nota2 = input.nextDouble()
    val nota3 = input.nextDouble()

    val media = ((       ) + (     ) + (     )) / (     )  //complete os espaços em branco
    System.out.printf("MEDIA = %.1f\n", media)
}
```