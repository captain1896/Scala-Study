package com.lucas.study.scala.FunctionAndClosure

import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 上午11:03
 * To change this template use File | Settings | File Templates.
 */
object Log {
    def log(date: Date, message: String) {
        //...
        println(date + "----" + message)
    }

    def testPartialFunction() {
        val logWithDateBound = log(new Date(), _: String)
        logWithDateBound("Message 1")
        logWithDateBound("Message 2")
        logWithDateBound("Message 3")
    }

    def main(args: Array[String]) {
        val date = new Date()
        log(date, "message 1")
        log(date, "message 2")
        log(date, "message 3")
        testPartialFunction
    }
}
