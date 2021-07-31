object Test {
  def rectange(length:Double)=(height:Double)=>(length + height) *2
  def main(args: Array[String]): Unit = {
    val func =rectange(4)(5)
    println(func)
  }
}
