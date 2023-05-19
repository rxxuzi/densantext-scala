package chapter1

object C1E0 {
  def main(args: Array[String]): Unit = {
    val y = 9
    val z = 2
    val x = 10

    //四則演算
    def add(a: Int, b: Int) = a + b

    def sub(a: Int, b: Int) = a - b

    def mul(a: Int, b: Int) = a * b

    def div(a: Int, b: Int) = a / b

    def mod(a: Int, b: Int) = a % b

    println(s"x: $x , y: $y , z: $z")
    // x + y
    println(s"x + y = ${add(x, y)}")
    // x - z
    println(s"x - z = ${sub(x, z)}")
    // y * z
    println(s"y * z = ${mul(y, z)}")
    // x / z
    println(s"x / z = ${div(x, z)}")
    // x % y
    println(s"x % y = ${mod(x, y)}")
  }
}
