import scala.util.Random
object Caesar {
  def main(args: Array[String]) {
    val alpha: Vector[Char] =
      Vector('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
    val cip: Vector[Char] = Random.shuffle(alpha)

    val message: String = "MESSAGE"

    println(crypt(message, cip))

    def crypt(message: String, cip: Vector[Char]): String = {
      val map: Map[Char, Char] = makeMap(alpha, cip)
      message.map(c => map(c))
    }
    def makeMap(alpha: Vector[Char], cip: Vector[Char]): Map[Char, Char] = {
      val ret: Map[Char, Char] = (alpha.zip(cip)).toMap
      println(ret)
      ret

    }
  }
}
