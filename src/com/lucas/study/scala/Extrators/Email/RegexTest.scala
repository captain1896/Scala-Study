package com.lucas.study.scala.Extrators.Email

import scala.util.matching.Regex

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-11
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
object RegexTest {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val decimal = new Regex("(-)?(\\d+)(\\.\\d*)?")
    val decimal2 = """(-)?(\d+)(\.\d*)?""".r
    val input = "for -1.0 to 99 by 3"
    for (s <- decimal2.findAllIn(input))
      println(s)
  }
}
