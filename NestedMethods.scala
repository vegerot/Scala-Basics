object NestedMethods
{
    def factorial(x: Int/*, accumulator: Int = 1*/): Int =
    {
        def fact(x: Int, accumulator: Int = 1): Int =
        {
            if (x<=1) accumulator
            else fact/*orial*/(x-1, x*accumulator)
        }    
        fact(x)
    }
    def main(args: Array[String]): Unit =
    {
        println(factorial(16))
    }
}