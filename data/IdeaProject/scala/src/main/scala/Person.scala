abstract class Person {
  var name:String;
  var age:Int;
  var position:Position;
  def move(x:Int,y:Int): Unit ={
    position.changePosition(x, y)
  }
}

abstract class Position{
  var x:Int;
  var y:Int;
  def changePosition(x:Int,y:Int): Unit ={
    this.x = x;
    this.y = y;
  }
}