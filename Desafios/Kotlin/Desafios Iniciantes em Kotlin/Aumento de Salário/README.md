## Desafio

A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

| Salário | Percentual de Reajuste |
| ---|--- |
| 0 - 400.00<br />400.01 - 800.00<br />800.01 - 1200.00<br />1200.01 - 2000.00<br />Acima de 2000.00 | 15%<br />12%<br />10%<br />7%<br />4% |

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

## Entrada

A entrada contém apenas um valor de ponto flutuante, que pode ser maior ou igual a zero, com duas casas decimais.

## Saída

Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
| 400.00 | Novo salario: 460.00<br />Reajuste ganho: 60.00<br />Em percentual: 15 % |
| 800.01 | Novo salario: 880.01<br />Reajuste ganho: 80.00<br />Em percentual: 10 % |
| 2000.00 | Novo salario: 2140.00<br />Reajuste ganho: 140.00<br />Em percentual: 7 % |


```bash
import java.util.*

fun main(args: Array<String>) {
   val input = Scanner(System.`in`)

   val salario = input.nextDouble()

   val reajuste = when {
       salario > 2000 -> 4
       salario > 
       salario > 
       salario > 
       else -> 
   }

  //escreva o seu código nos espaços em branco 
 
   val novoSalario = 

   System.out.printf(      )
   System.out.printf(       )
   println(    )
}
```