package com.lucas.study.scala.ExceptionHandling

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-2
 * Time: 上午11:35
 * To change this template use File | Settings | File Templates.
 */
object CatchOrder {
    def main(args: Array[String]) {
        try {
            val str = "hello"
            println(str(31))
        } catch {
            case ex: Exception => println("Exception Caught!")
            case ex: StringIndexOutOfBoundsException => println("Invalid Index")
        }

    }
}
