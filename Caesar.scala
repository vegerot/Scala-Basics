import scala.util.Random
object Caesar {
  def main(args: Array[String]) {
    val alpha: Vector[Char] =
      ('A' to 'Z').toVector
    type Cipher = Map[Char, Char]
    val message: String = "MESSAGE BASIC"
    val cip: Vector[Char] = Random.shuffle(alpha)
    def makeMap(cip: Vector[Char]): Cipher = (alpha zip cip).toMap

    def crypt(message: String, cip: Vector[Char]): String = {
      val map = makeMap(cip)
      message.toUpperCase.map(c => map.getOrElse(c, c))
    }
    println(cip)

    println(crypt(message, cip))

  }
}
