package com.lucas.study.scala.CombinationAndInheritance.DynamicallyBound

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */
class ArrayElement extends Element{
  override def demo() {
    println("ArrayElement's implementation invoked!")
  }

  /**
   *有時候在設計一個繼承層級的時候，你想要確保一個成員不被子類重寫。
   *這在Scala中可以和Java一樣通過給成員添加final修飾符來實現。
   *例如，你可以再ArrayElement的demo方法前放置一個final修飾符
   *如下：r
   */

  /*final override def demo() {
    println("ArrayElement's implementation invoked!")
  }*/

  /**
   * 有時候或許還想確保整個類都不會有子類。要做到這點只要簡單地在類的聲明上添加final修飾符來吧整個類聲明為final即可。
   */

  /*final class ArrayElement extends Element {
    override def demo() {
      println("ArrayElement's implementation invoked!")
    }
  }*/
}

