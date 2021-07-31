class App(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(xd: Int, yd: Int): Unit = {
    x += xd
    y += yd
  }

}

//def main(args: Array[String]): Unit = {
//  var app = new App(3, 4)
//  app.move(1, 1)
//  println(app.x)
//  println(app.y)
//
//}