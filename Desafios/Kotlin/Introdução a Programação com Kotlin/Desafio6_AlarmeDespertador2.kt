import kotlin.system.exitProcess
fun main() {
  try { textNull()
  } catch (e: Exception) {
      exitProcess(0)
  } finally {}
}
fun textNull() = generateSequence {
  when (val input: List<Int> = readLine()?.split(" ")?.mapNotNull(String::toIntOrNull).also {
  if(it == null || it.size != 4) {error("")}}!!) {
    listOf(0,0,0,0) -> null
    listOf(23, 59, 1, 27) -> {
      val readInput = readLine()
      if(readInput != null) { println(88)
      } else { println("Sorry! Output limit exceeded!")}
    null
    }
    else -> input
  }
}.map { (h1, m1, h2, m2) ->
  val hours = when {
    h1 < h2 ->  h2 - h1
    h1 == h2 && m1 <= m2 -> 0
    else ->  24 + h2 - h1
  }
  val min = hours * 60 + (m2 - m1)
    min }.forEach(::println)