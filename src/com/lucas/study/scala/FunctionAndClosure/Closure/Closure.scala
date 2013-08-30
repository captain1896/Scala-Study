package com.lucas.study.scala.FunctionAndClosure.Closure

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 上午10:42
 * To change this template use File | Settings | File Templates.
 */
object Closure {
    def main(args: Array[String]) {
        testClosure
    }

    def loopThrough(number: Int)(closure: Int => Unit) {
        for (i <- 1 to number) {
            closure(i)
        }
    }

    def testClosure() {
        var result = 0
        val addInt = {
            value: Int => result += value
        }
        loopThrough(10) {
            addInt
        }
        println("Total of values for 1-10 is:" + result)

        result = 0
        loopThrough(5) {
            addInt
        }
        println("Total of values for 1-5 is:" + result)

        val productInt = {
            value: Int => result *= value
        }

        //result = 1
        //loopThrough(5)(productInt)
        var product = 1
        loopThrough(5) {
            product *= _
        }
        println("Product of values for 1-5 is:" + product)

    }
}
