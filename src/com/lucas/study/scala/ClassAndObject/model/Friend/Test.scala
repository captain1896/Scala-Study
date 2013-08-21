package com.lucas.study.scala.ClassAndObject.model.Friend

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午6:48
 * To change this template use File | Settings | File Templates.
 */
object Test {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val human = new Human("Human")
    val man = new Man("Man")
    val woman = new Woman("Woman")
    human.listen()
    man.listen()
    woman.listen()
  }
}
