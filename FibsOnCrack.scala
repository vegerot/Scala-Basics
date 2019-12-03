//import scala.math.BigInt
object FibsOnCrack {
  def main(args: Array[String]): Unit = {
    lazy val fibs: LazyList[Int] = 0 #:: 1 #:: fibs.zip(fibs.tail).map({ case (l,r) => l+r})
    fibs take 50 foreach println
  }
}
