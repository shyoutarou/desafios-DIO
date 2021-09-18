package desafios

fun main() {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {

        val input = readLine()!!.split(" ").map { it.toInt() }

        if(input.size == 2){

            val valorMdc = mdc(input[0], input[1])
            lista.add(valorMdc)

        }


    }

    for (i in lista){

        println(i)

    }

}
// máximo divisor comum (chamada recursiva)
fun mdc(n1:Int, n2:Int) :Int{

    var resto: Int

    var n1 = n1
    var n2 = n2



    do{

        resto = n1%n2
        n1 = n2
        n2 = resto

    }while (resto != 0)



    return n1

}
