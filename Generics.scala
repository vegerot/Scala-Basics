object Generics
{
    class Stack[A]
    {
        private var elements: List[A] = List()
        def push(x: A): Unit = { elements =x :: elements}
        def peek(): A = elements.head
        def pop():  A = 
        {
            val currentTop = peek
            elements=elements.tail
            currentTop
        }
    }

    class Fruit
    class Apple extends Fruit
    class Banana extends Fruit

    def main(args: Array[String]): Unit =
    {
        val stack = new Stack[Int]
        stack.push(1)
        stack.push(2)
        println(stack.pop())
        println(stack.pop)

        val stackF = new Stack[Fruit]
        val apple = new Apple
        val banana = new Banana

        stackF.push(apple)
        stackF.push(banana)
    }
}