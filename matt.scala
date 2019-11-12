object matt {
  object argh {
    def a= {
      println("a")
      1
    }

    val b= {
      println("b")
      a + 2
    }

    def c= {
      println("c")
      a
      b.toString + "c"
    }
  }
  def main(args: Array[String]): Unit = {
    println(argh.c + argh.b + argh.a)
  }
}
