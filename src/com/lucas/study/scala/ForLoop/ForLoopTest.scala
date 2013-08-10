package com.lucas.study.scala.ForLoop

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-9
 * Time: 上午11:02
 * To change this template use File | Settings | File Templates.
 */
object ForLoopTest {
  def main(args: Array[String]) {
    println(test)
  }

  def test(): Int = {
    var sum = 0
    for (i <- 1 to 100; if i % 2 != 0) {
      sum += i * i
    }
    sum
  }

}
