package com.lucas.study.scala.AbstractMember.Trait


/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 下午2:40
 * To change this template use File | Settings | File Templates.
 */
object Test {
  def main(args: Array[String]) {
    val ra = new RationalTrait {
      val denomArg: Int = 1
      val numerArg: Int = 2
    }

    println(ra.denomArg + "|" + ra.numerArg)
    test
  }

  def test() {
    val x = 2
    val t = new {
      val denomArg: Int = 1 * x
      val numerArg: Int = 2 * x
    } with RationalTraits
    println(t)
  }
}
