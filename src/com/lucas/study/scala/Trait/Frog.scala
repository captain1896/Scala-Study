package com.lucas.study.scala.Trait

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-27
 * Time: 下午9:26
 * To change this template use File | Settings | File Templates.
 */
class Frog extends Animal with Philosophical{
  override def toString = "green"
  override def philosophize() {
    println("It ain't easy being " + toString + "!")
  }
}
