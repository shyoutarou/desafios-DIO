import java.util.*

fun main(args: Array<String>) {
   val input = Scanner(System.`in`)

   val salario = input.nextDouble()

    val reajuste = when {
        salario > 2000 -> 4
        salario > 1200 -> 7
        salario > 800 -> 10
        salario > 400 -> 12
        else -> 15
    }

    val novoSalario = salario * (1 + reajuste/100.0)

    System.out.printf("Novo salario: %.2f\n", novoSalario)
    System.out.printf("Reajuste ganho: %.2f\n", salario * reajuste/100.0)
    println("Em percentual: $reajuste %")
}
