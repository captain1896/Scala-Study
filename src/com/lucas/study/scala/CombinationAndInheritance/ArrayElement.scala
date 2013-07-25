package com.lucas.study.scala.CombinationAndInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午12:08
 * To change this template use File | Settings | File Templates.
 */

/**
 *
 * 如果省略extends子句，Scala編譯器將隱式地假設你的類拓展自scala.AnyRef，
 * 這與Java平臺上的java.lang.Object相同。因此，Element類隱式地拓展了AnyRef類
 *繼承表示超類的所有成員也是子類的成員，但是一下兩種情況例外。第一，超類的室友成員不會被子類繼承。
 * 第二，超類中的成員若與子類中實現的成員具有相同名稱和參數則不會被子類繼承。
 * 這種情況被稱為子類的成員重寫(override)了超類的成員。
 * 如果子類中的具體的而超類中的是抽象的，我們也可以說具體的成員實現(implement)了超類的成員
 * 例如，ArrayElement類的contents方法重寫了（或者說實現了）Element類中的抽象方法contents
 *
 * @param conts
 */
class ArrayElement(conts:Array[String]) extends Element {
  def contents: Array[String] = conts
}

object ArrayElement {
  def main(args:Array[String]) {
    val arg = Array[String]("Man","Woman","Fish","海龜")
    val element = new ArrayElement(arg)
    println(element.contents.toString)
    element.contents.foreach(println _)
    println(element.height)
    println(element.width)

    val ae = new ArrayElement(Array("hello","world"))
    println("------------")
    println(ae.height)
    println(ae.width)
  }
}


