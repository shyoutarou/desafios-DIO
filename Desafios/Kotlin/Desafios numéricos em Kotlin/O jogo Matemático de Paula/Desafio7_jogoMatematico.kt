package desafios

fun main() {

    val numeroTestes = readLine()!!.toInt()
    val listaStrings = mutableListOf<Int>()
    var list: List<String>
    var primeiroNumero: Int
    var segundoNumero: Int
    var subtracao: Int
    var produto: Int
    var soma: Int

    for (i in 1..numeroTestes) {

        list = readLine()!!.split(" ")


        for (i in list) {

            primeiroNumero = i.substring(2, 3).toInt()
            segundoNumero = i.substring(0, 1).toInt()

            if (i.substring(0, 1) == i.substring(2, 3)) {

                produto = primeiroNumero.times(segundoNumero)
                listaStrings.add(produto)

            }

            if (i.contentEquals(i.toLowerCase()) && primeiroNumero != segundoNumero) {

                soma = primeiroNumero.plus(segundoNumero)
                listaStrings.add(soma)


            }
            if (i.contentEquals(i.toUpperCase()) && primeiroNumero != segundoNumero) {

                subtracao = primeiroNumero.minus(segundoNumero)
                listaStrings.add(subtracao)


            }


        }


    }

    for (s in listaStrings) {

        println(s)

    }

}