//import scala.language.implicitConversions
object ImplicitConversions {
  implicit def list2ordered[A](
      x: List[A]
  )(implicit elem2ordered: A => Ordered[A]): Ordered[List[A]] =
    new Ordered[List[A]] {
      def compare(that: List[A]): Int = {
        println(x)
        println(that)
        1
      }
    }
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3) > List(4, 5))
  }
}
