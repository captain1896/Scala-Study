package com.lucas.study.scala.FunctionalObject.ClassAndObject

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-14
 * Time: 下午6:12
 * To change this template use File | Settings | File Templates.
 */
//class Coffee(id: Int = 1232, price: Double = 5.5, tag: String = "default Tag") {
class Coffee(id: Int, price: Double, tag: String) {
    override def toString = id + "|" + price + "|" + tag

    def this(id: Int, price: Double) = this(id, price, "this(id: Int, price: Double)")

    def this(id: Int) = this(id, 5.5, "this(id:Int)")

    //def this(id: String, price: String) = this(id, price, "this(id: String, price: String)")

    def this() = this(1232, 5.5, "this()")
}

object Coffee {
    implicit def stringToInt(s: String) = 888888

    implicit def stringToDouble(s: String) = 999999.0

    def main(args: Array[String]) {
        val coffee = new Coffee(1111, 12.1, "Italy Coffee")
        val defaultCoffee = new Coffee
        val twoArgsCoffee = new Coffee(9, 11111.1)


        println(coffee)
        println("Default Coffee:" + defaultCoffee)
        println("twoArgsCoffee:" + twoArgsCoffee)


        val testImplicitCoffee = new Coffee("", "")
        println("testImplicitCoffee:" + testImplicitCoffee)
    }
}
