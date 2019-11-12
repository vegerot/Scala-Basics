object Mixins
{ 
  abstract class A
  {
    val message: String
  }
  
  class B extends A
  {
    val message = "I'm an instance of class B"
  }
  
  trait C extends A 
  {
    def loudMessage(): String = message.toUpperCase()
  }
  
  class D() extends B with C

  
  abstract class AbsIterator(v: Any)
  {
    type T//difference between "Any" and Generic?
    def hasNext: Boolean
    def next(): T
  }
  
  class StringIterator(s: String) extends AbsIterator()
  {
    type T = Char
    private var i = 0
    def hasNext = i<s.length
    def next() = 
    {
      val ch = s.charAt(i)
      i += 1
      ch
    }
  }
  
  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit): Unit = while(hasNext) f(next())
  }
  
  class RichStringIter(s: String) extends StringIterator(s: String) with RichIterator(){}
  
  def main(args: Array[String]): Unit =
  {
    val d = new D()
    println(d.message)
    println(d.loudMessage())
    val richStringIter = new RichStringIter("Scala")
    richStringIter.foreach(println)
    
  }
}
