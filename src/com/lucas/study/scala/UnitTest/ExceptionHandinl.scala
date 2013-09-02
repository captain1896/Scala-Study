package com.lucas.study.scala.UnitTest

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-2
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
object ExceptionHandinl {
    def taxFor(amount: Double): String = {
        if (amount < 0) throw new IllegalArgumentException("Amount must be grater than zero")

        if (amount < 0.1) throw new RuntimeException("Amount too small to be taxed")

        if (amount > 1000000) throw new Exception("Amount too large...")
        "Tax for $" + amount + " is $" + amount * 0.08
    }

    /**
     * taxFor(）方法根據輸入拋出三種不同的異常。catch 塊用case 語句處理兩個異常。
     * 上面的輸出展示了代碼塊如何處理這兩個異常。第三個未處理的異常程序的終結，并打印出stack trace 的細節。
     * case語句的順序很重要，scala也支持finally塊
     */
    def testTaxFor() {
        for (amount <- List(100.0, 0.09, -2.0, 1000001.0)) {
            try {
                println(taxFor(amount))
            }
            catch {
                case ex: IllegalArgumentException => println(ex.getMessage)
                /*case ex: RuntimeException => {
                    // if you need a block of code to handle exception
                    println("Don't bother reporting ..." + ex.getMessage)
                }*/

                case _ => println("Something went wrong!")
            }
        }
    }


    def main(args: Array[String]) {
        testTaxFor()
    }


}
