object Operators {
  case class Vec(x: Double, y: Double) {
    def +(that: Vec): Vec = Vec(this.x + that.x, this.y + that.y)
  }

  case class MyBool(x: Boolean) {
    def and(that: MyBool): MyBool = if (x) that else this
    def or(that: MyBool): MyBool = if (x) this else that
    def negate: MyBool = MyBool(!x)
    def not(x: MyBool) = x.negate
    def xor(x: MyBool, y: MyBool) = (x or y) and not(x and y)
  }

  def main(args: Array[String]): Unit = {
    val x: Int = 10
    x.+(3)
    val vector1: Vec = Vec(1, 2)
    val vector2: Vec = Vec(2.0, 3.0)

    val vector3: Vec = vector1 + vector2

    println(vector3.x, vector3.y)
  }
}
