package chapter4

object C4E0 {
  def main(args: Array[String]): Unit = {
    val myUnit = new MyUnit
    myUnit()
    myUnit("world")
    println(myUnit.x)
    println(myUnit.y)
  }
  class MyUnit {
    def apply() = println("hello")
    def apply(name: String) = println(s"hello $name")
    val x = 1
    val y = 2
    val z = 3
  }
}
