package com.lucas.study.scala.ImplicitConversionsAndParameters.DateModel

import DateHelper.convertInt2DateHelper
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
object DateTest {
  //implicit def convertInt2DateHelper(number: Int) = new DateHelper(number)

  def main(args: Array[String]) {
    test
  }

  def test() {
    val ago = "ago"
    val from_now = "from_now"
    val past = 2.days(ago)
    val appointment = 5 days (from_now)
    println(past)
    println(appointment)
  }
}
