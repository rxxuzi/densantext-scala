package chapter1

object C1E3 {
  def main(args: Array[String]): Unit = {
    val p = ()  => {
      for(i <- 0 until 10){
        print(i)
      }
    }

    println(p)

  }
}
