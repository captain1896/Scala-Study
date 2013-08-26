package com.lucas.study.scala.CaseClassAndPatternMatching.Stock

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-26
 * Time: 上午11:51
 * To change this template use File | Settings | File Templates.
 */
object Symbol {
  def unapply(symbol: String): Boolean = symbol == "GOOD" || symbol == "IBM"

  // do something

}
