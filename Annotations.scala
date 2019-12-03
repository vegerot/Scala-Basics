import scala.annotation.tailrec
object Annotations {
  object DeprecationDemo extends App {
    @deprecated("deprecation message", "release # which deprecates method")
    def hello = "hola"

    hello
  }

  def tailFactorial(x: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
    }
    factorialHelper(x, 1)
  }
  //class myInt(val value: Int) extends Int {
  //  def *(i: => myInt): myInt = this.value * i.value
  //}
  //def factorial(x: myInt): myInt = {
  //  def factorialHelper(x: myInt): myInt = {
  //    if (x == 1) 1 else x * factorialHelper(x - 1)
  //  }
  //  factorialHelper(x)
  //}

  def main(args: Array[String]): Unit = {
    println(tailFactorial(7))
  }
}
