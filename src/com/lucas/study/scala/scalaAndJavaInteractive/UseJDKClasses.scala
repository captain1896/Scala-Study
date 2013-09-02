package com.lucas.study.scala.scalaAndJavaInteractive

import java.util.Date
import java.lang.reflect.{Array => _}
import java.lang.reflect.Method

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-2
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */
object UseJDKClasses {
    def main(args: Array[String]) {
        test
    }

    def test() {
        println("Today is " + new Date())
        val methods = getClass.getMethods()
        methods.foreach {
            method: Method => println(method.getName)
        }
    }
}
