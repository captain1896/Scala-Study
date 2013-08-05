package com.lucas.study.scala.ListUsage

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-5
 * Time: 下午7:20
 * To change this template use File | Settings | File Templates.
 */
object ListHigherOrder {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val addOneList = List(1, 2, 3, 4).map(_ + 1)
    println(addOneList)

    val words = List("the", "quick", "broken", "fox")
    val lengthList = words.map(_.length)
    println(lengthList)

  }
}
