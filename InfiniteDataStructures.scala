object InfiniteDataStructures {
  sealed abstract class InfList[A] {
    def foreach(f: A => Unit): Unit
    def take(n: Int): List[A]
  }

  final class InfCons[A](val head: A, tail: => InfList[A]) extends InfList[A] {
    def foreach(f: A => Unit): Unit = {
      f(head)
      tail.foreach(f)
    }

    def take(n: Int): List[A] = {
      if (n < 0)
        List(head)
      else
        head :: tail.take(n - 1)
    }
  }
  final class InfNil[A]() extends InfList[A] {
    def foreach(f: A => Unit): Unit = ()
    def take(n: Int): List[A] = Nil
  }

  def fromZero: InfList[Int] = {
    def loop(n: Int, tail: => InfList[Int]): InfList[Int] =
      new InfCons[Int](n, loop(n + 1, tail))
    loop(0, new InfNil[Int])
  }
  def main(args: Array[String]): Unit = {
    val xs = fromZero

    val fivexs = xs.take(5)
    val fiftyxs = xs.take(50)

    println(fivexs)
    println(fiftyxs)
    //xs.foreach(x => println(x))

  }
}
