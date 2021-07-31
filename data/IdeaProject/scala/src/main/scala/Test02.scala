object Test02 {
  /**
   * 九九乘法表
   * @param args
   */
  def main(args: Array[String]): Unit = {
    for (i <- 0 to (8); j <- 0 to (i)) {
      print((i + 1) + "*" + (j + 1) + "=" + ((i + 1) * (j + 1)) + "\t")
      if (j == i) {
        println()
      }
    }
  }

}
