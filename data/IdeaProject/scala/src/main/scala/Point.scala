class Point(xc:Int,yc:Int) {
  var x:Int =xc
  var y:Int = yc

  def move(dx:Int,dy:Int): Unit ={
    x = x + dx
    y = y + dy

  }
}

//def main(args: Array[String]): Unit = {
//  var point = new Point(3,4)
//  point.move(3,3)
//  println(point.x)
//  println(point.y)
//}