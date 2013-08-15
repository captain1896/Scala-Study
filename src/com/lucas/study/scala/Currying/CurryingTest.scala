package com.lucas.study.scala.Currying

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-15
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
object CurryingTest {
  def main(args: Array[String]) {
    /*  println(add1(1, 2, 3))
      println(add2(1)(2, 3))
      println(add3(1)(2)(3))*/
    //testForLoop
    testList
  }

  def add1(x: Int, y: Int, z: Int): Int = x + y + z

  def add2(x: Int)(y: Int, z: Int): Int = x + y + z

  def add3(x: Int)(y: Int)(z: Int): Int = x + y + z


  def testForLoop(): Unit = {
    val list1 = List[Int](1, 2, 3)
    val list2 = List[String]("A", "B", "C")
    for (a <- list1) {
      println(a)
    }

    for (a <- list1; b <- list2) {
      println(a + b)
    }

    val tuples = for {
      a <- list1
      if a >= 2
      b <- list2
      length = b.length
    } yield (a, b, length)
    println(tuples)
  }


  def testList() {
    val fruit = List[String]("APPLE", "ORANGE", "BANANA")
    println(fruit.tail)
    println(fruit.head)

    println(fruit.init)
    println(fruit.last)
    println(fruit.reverse)

    // make a list via the companion object factory
    val days = List[String]("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY")
    val when = "AM" :: "PM" :: Nil
    val daysTimes = days ::: when
    println(daysTimes)


    val matchResult = List() match {
      case firstDay :: otherDays => println("The first element is " + firstDay)
      case Nil => println("It seems there is no week day!")
    }

    println(Nil.equals(List()))
  }

}
