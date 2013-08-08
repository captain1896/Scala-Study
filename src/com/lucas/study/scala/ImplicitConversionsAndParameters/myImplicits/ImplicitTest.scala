package com.lucas.study.scala.ImplicitConversionsAndParameters.myImplicits

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午12:32
 * To change this template use File | Settings | File Templates.
 */
object ImplicitTest {
  def main(args: Array[String]) {
    test
  }

  /**
   * 這種是隱式類型轉換為期望類型
   */
  implicit def doubleToInt(x: Double) = x.toInt

  def test() {
    val i: Int = 3.5
    println(i)
  }

  //implicit def doubleToInt(x: Double) = x.toInt
  //implicit 函數放在test()函數之後，編譯時會報錯。
  //錯誤為：Note: implicit method doubleToInt is not applicable here because it comes after the application point and it lacks an explicit result type
  //把函數：implicit def doubleToInt(x: Double) = x.toInt，放在test()函數之前，編譯就可以通過，並且可以運行。
}

