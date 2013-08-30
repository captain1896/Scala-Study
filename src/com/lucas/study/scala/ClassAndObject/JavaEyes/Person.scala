package com.lucas.study.scala.ClassAndObject.JavaEyes

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-17
 * Time: 下午5:32
 * To change this template use File | Settings | File Templates.
 */
class Person(val firstName: String, val lastName: String) {
    private var position: String = _

    println("Creating " + toString)

    def this(firstName: String, lastName: String, positionHeld: String) {
        this(firstName, lastName)
        position = positionHeld
    }

    override def toString(): String = {
        firstName + " " + lastName + " holds " + position + " position"
    }
}

object Person {
    def main(args: Array[String]) = {
        val john = new Person("John", "Smith", "Analyst")
        println(john)
        val bill = new Person("Bill", "Walker")
        println(bill)
        println("bill toString:" + bill toString())

    }
}
