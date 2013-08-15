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
    println(add1(1, 2, 3))
    println(add2(1)(2, 3))
    println(add3(1)(2)(3))

  }

  def add1(x: Int, y: Int, z: Int): Int = x + y + z

  def add2(x: Int)(y: Int, z: Int): Int = x + y + z

  def add3(x: Int)(y: Int)(z: Int): Int = x + y + z

}
