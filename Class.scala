object Class{
 class Point { //same as Point ?
   private var _x = 0
   private var _y = 0
   private val bound = 100

   def x: Int= _x  //no return type needed?
   def x_= (newValue: Int): Unit = { //what does  this syntax mean?
     if (newValue < bound) _x = newValue else printWarning
   }

   def y: Int = _y
   def y_= (newValue: Int): Unit = {
     if (newValue < bound) _y = newValue else printWarning
   }

   private def printWarning = println("WARNING: Out of bounds")

   def move(dx: Int, dy: Int): Unit = {
     _x=x+dx
     _y=y+dy
   }

   override def toString: String = {
     s"($x, $y)"
   }
 }
 def main(args: Array[String]): Unit = {
   val origin=new Point()
   //same as origin=new Point ?
   //val point1 = new Point(2,3)
   //val point2 = new Point(y=2)
   //println(point1.x)
   //println(origin)
   //println(point1)
   //println(point2)
   origin.x=99
   println(origin)
   origin.y=101
 }
}

