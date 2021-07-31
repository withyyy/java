import scala.collection.mutable.Map
object Test03 {


  def main(args: Array[String]): Unit = {
    val fruit:List[String] = List("apple","pears","oranges")
    val nums:List[Int] = List(1,2,3,4,5)
    val double_nums:List[Double] = List(1.0,2.5,3.3)
    println(fruit)
    println(nums)
    println(double_nums)
    println(fruit:::double_nums)
//    println(fruit.:::double_nums)
    println(List.concat(fruit,double_nums))
    val num:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    println(num.filter(x=>x%2 ==0))
    println(num.map(x=>x*2))
    println(num.mkString(";"))
    num.foreach(x=>print(x + " "))
    println("**********")
    val setnum1 : Set[Int] = Set(1,2,3,4,5)
    val setnum2 :Set[Int] = Set(3,6,7,8)
    //使用++运算符或Set.++()方法连接两个集合，如果元素有重复的就会移除重复的元素
    println(setnum1.++(setnum2))
    println(setnum1 ++ setnum2)
    val setnum3 = setnum1.&(setnum2)
    val setnum4 = setnum1.intersect(setnum2)
    println(setnum3)
    println(setnum4)
    println("********")
    val map:Map[String,Int] =  Map("a"->1,"b"->2)
    val map1:Map[Int,String] = Map(1->"a",2->"b")
    val  map2 = Map(1->"A")
    map2 += (2->"B")

    println("元组")
    val t =(1,3.14,"apple")
    val t1 = new Tuple3(1,3.14,"apple")
    println(t)
    println(t1)
    //获取元组中的第一个元素
    println(t._1)
    //获取元组中的第二个元素
    println(t._2)
  }
}
