object AbstractMembers {
  trait Buffer {
    type T
    val element: T
  }

  abstract class SeqBuffer extends Buffer {
    type U
    type T <: Seq[U]
    def length = element.length
  }

  abstract class IntSeqBuffer extends SeqBuffer {
    type U = Int
  }

  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer { val x: Int } =
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2)
      val x: Int = 7
    }
  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(7, 8)
    println("length = " + buf.length)
    println("content = " + buf.element)
    println("x = " + buf.x)
  }
}
