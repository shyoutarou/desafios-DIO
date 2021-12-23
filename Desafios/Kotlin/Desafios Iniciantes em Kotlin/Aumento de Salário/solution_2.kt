import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val salario = input.nextDouble()


    val reajuste = when {
        salario > 2000.00 -> 4
        salario in 1200.01..2000.00 -> 7
        salario in 800.01..1200.00 -> 10
        salario in 400.01..800.00 -> 12
        else -> 15
    }
    val valorAumento = salario * ( reajuste.toDouble() /100 )
    val novoSalario = salario + valorAumento


    println("Novo salario: %.2f".format(novoSalario))
    println("Reajuste ganho: %.2f".format(valorAumento))
    println("Em percentual: $reajuste %")
}