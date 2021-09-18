/*


Daniela é enfermeira em um grande hospital, e tem os horários de trabalho muito variáveis. Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com relógios despertadores.

Recentemente ela ganhou de presente um relógio digital, com alarme com vários tons, e tem esperança que isso resolva o seu problema. No entanto, ela anda muito cansada e quer aproveitar cada momento de descanso. Por isso, carrega seu relógio digital despertador para todos os lugares, e sempre que tem um tempo de descanso procura dormir, programando o alarme despertador para a hora em que tem que acordar. No entanto, com tanta ansiedade para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.

Um problema que a tem atormentado na hora de dormir é saber quantos minutos ela teria de sono se adormecesse imediatamente e acordasse somente quando o despertador tocasse. Mas ela realmente não é muito boa com números, e pediu sua ajuda para escrever um programa que, dada a hora corrente e a hora do alarme, determine o número de minutos que ela poderia dormir.

Entrada

A entrada contém vários casos de teste. Cada caso de teste é descrito em uma linha, contendo quatro números inteiros H  1 , M 1 , H2 e M 2, com H1:M1 representando a hora e minuto atuais, e H2:M2 representando a hora e minuto para os quais o alarme  despertador foi programado (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).

O final da entrada é indicado por uma linha que contém apenas quatro zeros, separados por espaços em branco.

Saída

Para cada caso de teste da entrada seu programa deve imprimir uma linha, cada uma contendo um número inteiro, indicando o número de minutos que Daniela tem para dormir.

Sample Input	
1 5 3 5
23 59 0 34
21 33 21 10
0 0 0 0

Sample Output
120
35
1417


Dado de entrada:
23 59 1 27


Saída esperada:
Sorry! Output limit exceeded!

Dado de entrada:
23 30 0 34
0 0 0 0

Saída esperada:
64


COM ERRO!! NÃO PASSA NOS TESTES FECHADOS

*/

import kotlin.math.abs
fun main(args: Array<String>) {
    
    var input : List<String>
    var res: MutableList<Int> = arrayListOf()
    var min : Int
    var x: Int
    var y: Int
    var h1: Int
    var m1: Int
    var h2: Int
    var m2: Int
    var t: Boolean = true
    
    while (t) {
        
        input = readLine()!!.split(" ")
        
        h1 = input.component1().toInt()
        m1 = input.component2().toInt()
        h2 = input.component3().toInt()
        m2 = input.component4().toInt()
        
        var sum: Int = h1 + m1 + h2 + m2
    
        if (sum != 0) { 
        
            x = if (h1 == 0) (24 * 60) + m1 else (h1 * 60) + m1 
            y = if (h2 == 0) (24 * 60) + m2 else (h2 * 60) + m2
            
            min = if (y > x) y - x else (24 * 60) - (x - y) 
            
            res.add(min)
        }
        
        if (readLine() == null && sum != 0) {
        
            println("Sorry! Output limit exceeded!")
            
            t = false
        }
        else {
        
            for (l in res) {
              
                println(l)
            }
        
            t = false
        }
    }
} 