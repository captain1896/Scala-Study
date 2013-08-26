package com.lucas.study.scala.CaseClassAndPatternMatching.Stock

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-26
 * Time: 上午11:48
 * To change this template use File | Settings | File Templates.
 */
object StockService {
  def process(input: String) {
    input match {
      case Symbol() => println("Look Up price for valid symbol " + input)
      case ReceiveStockPrice(symbol@Symbol(), price) => println("Received price %f for symbol %s \n", price, symbol)
      case ReceiveStockPrice(symbol, price) => println("Received price %f for symbol %s \n", price, symbol)
      case _ => println("Invalid input " + input)
    }
  }

  def main(args: Array[String]) {
    StockService.process("GOOD")
    StockService.process("GOOD:310.84")
    StockService.process("GOOD:BUY")
    StockService.process("IBM")
    StockService.process("ERR")
    StockService.process("ERR:12.21")
  }
}
