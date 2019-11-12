object For
{
    case class User(name: String, age: Int)

    def foo(n: Int, v: Int): IndexedSeq[Tuple2[Int, Int]] =
    {
        for (i<-(0 until n);
            j<-0 until n 
            if i+j ==v)
        yield(i,j)
        //println(s"($i,$j)")
    }

    def main(args: Array[String]): Unit =
    {
        val userBase: List[User] = List(
            User("greenie", 28),
            User("comua", 33),
            User("Vegerot", 44),
            User("Dennis", 23)
        )

        val twentySomethings: Seq[String] = for (user <- userBase if (user.age >= 20 && user.age < 30)) yield user.name
        //println(Seq(1,2,3))
       println(twentySomethings) 
       twentySomethings.foreach(name => println(name))
//        foo(10,10)
       foo(10,10) foreach {
           case (i,j) => println(s"($i,$j) ")
       }
        
    }
}