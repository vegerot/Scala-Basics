object TypeInference {

  def SquareOf(x: Int) = x * x
  def fac(n: Int): Int = if (n == 0) 1 else n * fac(n - 1)
  def mult(n: Int) = if (n == 0) "string" else 17

  case class MyPair[A, B](x: A, y: B)
  def id[T](x: T) = x
  def main(args: Array[String]): Unit = {
    val businessName = "Montreux Jazz Café"
    println(fac(3))
    println(mult(1))
    val p = MyPair(1, "scala")
    val q = id(1)

    Seq(1, 3, 4).map((x => x * 2): Int => Int)
  }
}
