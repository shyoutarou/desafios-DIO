package desafios

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:23
 */
fun main() {

    var input : List<Int>

    while (true) {

        input = readLine()!!.split(" ").map { it.toInt() }
        val (h1, m1, h2, m2) = input

        var minutosRestantes = m2-m1

        if (h1==0 && h2==0 && m1==0 && m2==0) { break }

        if (h1 > h2){
            minutosRestantes += 60 * (24 - h1 + h2)
            println(minutosRestantes)
        }
        else if (h1 < h2){
            minutosRestantes += 60 * (- h1 + h2)
            println(minutosRestantes)
        }
        else if (m1 >= m2){
            minutosRestantes += 60 * (24 - h1 + h2)
            println(minutosRestantes)
        }

    }
}