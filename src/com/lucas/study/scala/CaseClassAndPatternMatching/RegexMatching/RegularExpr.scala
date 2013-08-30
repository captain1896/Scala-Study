package com.lucas.study.scala.CaseClassAndPatternMatching.RegexMatching

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-26
 * Time: 下午12:18
 * To change this template use File | Settings | File Templates.
 */
object RegularExpr {
    def main(args: Array[String]) {
        testRegularExpr
        process("GOOG:310.84")
        process("GOOG:310")
        process("GOOG:84.01")
        process("GOOG:310.84")
        process("IBM:84.01")
        process("GE:15.96")
    }


    def testRegularExpr {
        val pattern = "(S|s)cala".r
        val str = "Scala is scalable and cool"
        println(pattern.findAllIn(str).mkString(","))
        println("cool".r.replaceFirstIn(str, "awesome"))
    }

    def process(input: String) {
        val MatchStock = """^(.+):(\d*\.\d+)""".r
        input match {
            case MatchStock("GOOG", price) => println("price of GOOG is " + price)
            case MatchStock("IBM", price) => println("IBM's trading at " + price)
            case MatchStock(symbol, price) => println("price of %s is %s \n ", symbol, price)
            case _ => println("not processing " + input)
        }
    }
}
