package com.lucas.study.scala.CaseClassAndPatternMatching.Stock

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-26
 * Time: 上午11:59
 * To change this template use File | Settings | File Templates.
 */
object ReceiveStockPrice {
  def unapply(input: String): Option[(String, Double)] = {
    try {
      if (input contains ":") {
        val splitQuote = input split ":"
        Some(splitQuote(0), splitQuote(1).toDouble)
      } else {
        None
      }
    } catch {
      case _: NumberFormatException => None
    }
  }
}
