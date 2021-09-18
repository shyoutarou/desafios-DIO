package desafios

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    val entrada: Int = scanner.nextInt()

    val anos = entrada/365//2
    var dias = entrada-(365*anos)//70
    var meses = 0

    if (dias>30){
        meses = dias/30
        dias -= (30*meses)
    }
    if (dias==30){
        meses = 1
        dias = 0
    }

    println("$anos ano(s)")
    println("$meses mes(es)")
    println("$dias dia(s)")

}