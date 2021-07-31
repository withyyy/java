object Test05 {
  val phone:List[String] =List("115035,1477798,广东,广州,中国移动,020,510000",
    "115056,1477819,广东,广州,中国移动,020,510000",
    "115026,1477820,广东,深圳,中国移动,0755,518000",
    "115048,1477811,广东,深圳,中国移动,0755,518000")

  def main(args: Array[String]): Unit = {
    println(phone.groupBy(x=>x.split(",")(3)))
  }

}
