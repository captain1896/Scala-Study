package com.lucas.study.scala.CaseClassAndPatternMatching.PatternMatching.TradeModel.FruitModel

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 */
class ThingsAcceptor {
  def acceptStuff(thing: Any) {
    thing match {
      case Apple() => println("Thanks for the Apple!")
      case Orange() => println("Thanks for the Orange")
      case Book() => println("Thanks for the Book")
      case _ => println("Excuse me , why did you send me a " + thing)
    }
  }
}

object ThingsAcceptor {
  def main(args: Array[String]) {
    val acceptor = new ThingsAcceptor
    acceptor.acceptStuff(Apple())
    acceptor.acceptStuff(Book())
    acceptor.acceptStuff(Apple)
  }
}
