package desafios

import java.util.Scanner

fun maximoDivisorComum(a: Int, b: Int): Int {
    return if (b == 0) a else maximoDivisorComum(b, a % b)
}
fun main() {
    val lista = mutableListOf<String>()
    val scan = Scanner(System.`in`)
    var n1: Int
    var d1: Int
    var n2: Int
    var d2: Int
    var nf: Int
    var df: Int
    var aux: String
    var mdc:Int
    val n: Int = scan.nextInt()
    for (i in 1..n) {
        n1 = scan.nextInt()
        scan.next()
        d1 = scan.nextInt()
        aux = scan.next()
        n2 = scan.nextInt()
        scan.next()
        d2 = scan.nextInt()
        when (aux) {
            "+" -> {
                nf = (n1*d2)+(n2*d1)
                df = d1*d2
                mdc = maximoDivisorComum(nf,df)
                if (mdc < 0){
                    mdc *= -1

                }
                lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")

            }
            "-" -> {
                nf = (n1*d2)-(n2*d1)
                df = d1*d2
                mdc = maximoDivisorComum(nf,df)
                if (mdc < 0){
                    mdc *= -1

                }
                lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
            }
            "*" -> {
                nf = n1*n2
                df = d1*d2
                mdc = maximoDivisorComum(nf,df)
                if (mdc < 0){
                    mdc *= -1

                }
                lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
            }
            "/" -> {
                nf = n1*d2
                df = d1*n2
                mdc = maximoDivisorComum(nf,df)
                if (mdc < 0){
                    mdc *= -1
                }
                lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
            }
        }

    }

    lista.forEach {
        println(it)
    }

}

