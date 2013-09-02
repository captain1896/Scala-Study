package com.lucas.study.scala.scalaAndJavaInteractive

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-2
 * Time: 下午3:19
 * To change this template use File | Settings | File Templates.
 */
object UserInvestment {
    def main(args: Array[String]) {
        val investment = new Investment("XYZ Coration", InvestmentType.STOCK)
        println(investment.getClass)
        println(investment.toString)
        println(investment.`yield`())
    }
}
