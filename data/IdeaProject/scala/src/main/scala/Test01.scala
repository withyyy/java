object Test01 {
  def main(args: Array[String]): Unit = {
    val list = List(0,1,-1,128,-128)
    list.filter((x:Int)=> x>0).foreach((x:Int)=>println(x))
    list.filter(_>0).foreach(println(_));
  }
}
