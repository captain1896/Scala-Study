package com.lucas.study.scala.ClassAndObject.Product

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-4
 * Time: 下午2:17
 * To change this template use File | Settings | File Templates.
 */
object Runner {
    def main(args: Array[String]) {
        run
        runnable
    }

    def run() {
        val iPhone = Product(339.0)
        println("iPhone's price:" + iPhone.getPrice)

        val lifeOfPi = Movie("lifeOfPi", 55.9)
        println("lifeOfPi's name:" + lifeOfPi.name + "|lifeOfPi's ticketPrice:" + lifeOfPi.ticketPrice)
    }

    def runnable() {
        val iMac = Product(10000.0)
        println(iMac.getPrice)
    }
}
