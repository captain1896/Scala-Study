package com.lucas.study.scala.ForLoop.Friends

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-16
 * Time: 下午3:39
 * To change this template use File | Settings | File Templates.
 */
class Person(val firstName: String, val lastName: String) {
}

object Person {
    def apply(firstName: String, lastName: String): Person = new Person(firstName, lastName)

    def main(args: Array[String]) {
        val firends = List(Person("Brian", "Sletten"), Person("Neal", "Ford"), Person("Scott", "Davis"), Person("Struart", "Halloway"))
        val lastNames = for (f <- firends; lastName = f.lastName) yield lastName
        println(lastNames.mkString(","))
    }
}


