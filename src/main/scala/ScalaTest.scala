object ScalaTest {
  def run(runnable: Runnable) =
    runnable.run()

  def runnable(code: => Unit) = new Runnable {
    def run() = code
  }

  def main(args: Array[String]) {
    run(runnable(println("scala-scala")))
    JavaTest.run(runnable(println("scala-java")))
  }

}
