object ByNameParameters {
  def calculate(input: => Int) = input * 37

  def whileLoop(condition: => Boolean)(body: => Unit): Unit = {
    if (condition) {
      body
      whileLoop(condition)(body)
    }
  }

  def main(args: Array[String]): Unit = {
    println(calculate(2))

    var i = 2
    whileLoop(i > 0) {
      println(i)
      i -= 1
    }
  }
}
