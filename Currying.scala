object Currying
{
    def main(args: Array[String]): Unit =
    {
        //single function parameters
        val numbers: List[Int] = (1 to 10).toList
        //val res:Int = numbers.foldLeft(0)((m,n) => m+n)
        val res:Int = numbers.foldLeft(0)(_ + _)
        // numbers.foreach(println((_:Int)+", "+(_:Int)))
        //numbers.foreach(println((m:Int, n:Int)=>(m:Int)+", "+(n:Int)))
        println(res)
        
        //implicit parameters
       
        //partial application
        val numberFunc: ((List[Int], Int)=>List[Int])=>List[Int] = numbers.foldLeft(List[Int]())_

        val squares: List[Int] = numberFunc((xs:List[Int],x:Int)=>xs :+ x*x)
        println(squares)

        val cubes: List[Int] = numberFunc((xs:List[Int],x:Int)=>(xs :+ x*x*x))
        println(cubes)


    }

}