package com.lucas.study.scala.ImplicitConversionsAndParameters.DateModel

import java.util._

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
class DateHelper(number: Int) {
  def days(when: String): Date = {
    var date = Calendar.getInstance()
    when match {
      case "ago" => date.add(Calendar.DAY_OF_MONTH, -number)
      case "from_now" => date.add(Calendar.DAY_OF_MONTH, number)
      case _ => date
    }

    date.getTime
  }
}

object DateHelper {
  val ago = "ago"
  val from_now = "from_now"

  implicit def convertInt2DateHelper(number: Int) = new DateHelper(number)
}
