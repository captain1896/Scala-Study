package com.lucas.study.scala.Trait.Animals

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 上午11:58
 * To change this template use File | Settings | File Templates.
 */
class Dog(val name: String) extends Animal with Friend {
  override def listen() = println(name + "'s listening quietly!")
}
