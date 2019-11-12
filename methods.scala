object methods{
  def main(args: Array[String]): Unit = {
    println("Hello  from main of class")
    def add(x: Int, y: Int): Int = x + y
    println(add(1,2))

    //def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x+y)*multiplier
    //println(addThenMultiply())

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x+y)*multiplier
    println(addThenMultiply(1,1)(3))


    //Case classes
    
    case class Point(x: Int, y: Int)

    val point: Point = Point(1,2)
    val anotherPoint = Point(1,2)
    val yetAnotherPoint = Point(2,2)


    if(point==anotherPoint)
    {
      println(point.toString()+ " and " + anotherPoint + " are the same.")
    } else
    {
      println(point  + " and " + anotherPoint + " are different.")
    }

    if (point == yetAnotherPoint)
    {
      println(point + " and "+ yetAnotherPoint +"are the same")
    } else {
      println(point + " and "+yetAnotherPoint+" are different")
    }

  }
}

