object FunctionDemo {

  def main(args: Array[String]): Unit = {

    val h = hh((a:Int,b:Int)=>a+b,1,2)
    println(h)
  }

  def hh(f:(Int,Int)=>Int,a:Int,b:Int) = f(a,6)
}

