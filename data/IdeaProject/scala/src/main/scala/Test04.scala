object Test04 {
  def matchTest(x:Int) = x match {
    case 1 => x + 10
    case 2 => x + 20
    case _ => 0
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(1))
  }
}
