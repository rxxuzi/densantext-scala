package chapter1

object C1E1 {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(
      "abc", //string
      100, // integer
      'c', // character
      true, // boolean
      () => print("Hello") // function
    )
    list.foreach(element => println(element))
  }

}
