package com.lucas.study.scala.exercise.charter3

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-18
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
object ListTest {
  def main(args:Array[String]) {
    listUsageTest()
    listUsageTest2()
  }

  def listUsageTest() {
    val oneTwoThree = List(1,2,3,4)
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println("" + oneTwo + "and" + threeFour + " were not mutated.")
    println("" + oneTwoThreeFour + "is a new List")
    listUsageTest2()
  }

  def listUsageTest2() {
    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree
    val oneTwoThreeFour = oneTwoThree.::(4)
    println(oneTwoThree)
    println(oneTwoThreeFour)

  }
}
