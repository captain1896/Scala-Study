package com.lucas.study.scala.ClassAndObject.model.Friend

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午6:42
 * To change this template use File | Settings | File Templates.
 */
trait Friend {
  val name: String

  def listen() = println("Your friend " + name + " is listening!")
}
