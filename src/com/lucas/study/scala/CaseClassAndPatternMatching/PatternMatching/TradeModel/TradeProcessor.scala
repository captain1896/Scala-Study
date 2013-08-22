package com.lucas.study.scala.CaseClassAndPatternMatching.PatternMatching.TradeModel

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 下午3:31
 * To change this template use File | Settings | File Templates.
 */
class TradeProcessor {
  def processTransaction(request: Trade) {
    request match {
      case Sell(stock, 1000) => println("Selling 1000-units of" + stock)
      case Sell(stock, quantity) => println("Selling %d units of %s \n", quantity, stock)
      case Buy(stock, quantity) if (quantity > 2000) => println("Buying %d (large) units of %s \n", quantity, stock)
      case Buy(stock, quantity) => println("Buying %d units of %s \n", quantity, stock)
    }
  }
}

object TradeProcessor {
  def main(args: Array[String]) {
    val tradeProcessor = new TradeProcessor
    tradeProcessor.processTransaction(Sell("GOOG", 500))
    tradeProcessor.processTransaction(Buy("GOOG", 700))
    tradeProcessor.processTransaction(Sell("GOOG", 1000))
    tradeProcessor.processTransaction(Buy("GOOG", 3000))

  }
}