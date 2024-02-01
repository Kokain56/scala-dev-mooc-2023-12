import module1.opt.Option
import module1.list.List

object Main {

  def main(args: Array[String]): Unit = {
    val op1 = Option(7)
    val op2 = Option("ggg")
    val op3 = Option(null)
    op1.filter(x => x.get > 2).printIfAny()
    Option.zip(op1, op3).printIfAny()

    import module1.list.List._

    val list = List(1, 2, 3, 4, 5)
    val list2 = List("aee", "b", "c", "d", "e")
    list.reverse.println()
    println(list.mkString("."))
    list.map(x => x * 2).println()
    list.filter(x => x % 2 == 0).println()
    incList(list).println()
    shoutString(list2).println()
  }
}