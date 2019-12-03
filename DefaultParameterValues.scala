object DefaultParameterValues {
  def log(message: String, level: String = "Info") =
    println(s"$level: $message")
  class Point(val x: Double = 0, val y: Double = 0)
  def main(args: Array[String]): Unit = {
    log("system starting")
    log("User not found", "WARNING")

    val point1 = new Point(y = 1)
  }
}
