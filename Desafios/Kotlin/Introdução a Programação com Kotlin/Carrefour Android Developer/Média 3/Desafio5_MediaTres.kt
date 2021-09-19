package desafios

import java.util.*
import kotlin.math.round

private fun Float.round(decimal:Int):Float{
    var multiplicador = 1.0f
    repeat(decimal){
        multiplicador*=10
    }
    return round(this * multiplicador)/multiplicador
}

fun main() {

    val peso1 = 2
    val peso2 = 3
    val peso3 = 4
    val peso4 = 1

    val entrada = Scanner(System.`in`)

    val n1 = entrada.nextFloat()
    val n2 = entrada.nextFloat()
    val n3 = entrada.nextFloat()
    val n4 = entrada.nextFloat()
    val media:Float

    val mediaPonderada = (n1*peso1+n2*peso2+n3*peso3+n4*peso4)/(peso1+peso2+peso3+peso4)
    var mediaPrint = mediaPonderada.round(1)
    println("Media: $mediaPrint")
    //println("Media: ${"%.1f".format(mediaPonderada)}")

    //complete o codigo
    if (mediaPonderada>=7){
        println("Aluno aprovado.")
    }
    if (mediaPonderada<5){
        println("Aluno reprovado.")
    }
    if (mediaPonderada >=5 && mediaPonderada<6.9){
        println("Aluno em exame.")
        val exame = entrada.nextFloat()
        val examePrint = exame.round(1)
        println("Nota do exame: $examePrint")
        //println("Nota do exame: ${"%.1f".format(exame)}")
        media = (mediaPonderada + exame) / 2
        mediaPrint = media.round(1)
        if (media >= 5) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado")
        }
        println("Media final: $mediaPrint")
        //println("Media final: ${"%.1f".format(media)}")
    }


}