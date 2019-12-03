object CompoundTypes {
  trait Cloneable extends java.lang.Cloneable {
    override def clone(): Cloneable = {
      super.clone().asInstanceOf[Cloneable]
    }
  }

  trait Resetable {
    def reset: Unit
  }

  def closeAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone()
    obj.reset
    cloned
  }
  def main(args: Array[String]): Unit = {}
}
