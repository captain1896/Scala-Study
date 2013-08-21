package com.lucas.study.scala.ClassAndObject.model

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午12:12
 * To change this template use File | Settings | File Templates.
 */
class Sample {
  println("You are constructing an instance of Sample!")
  println("Happy Creating!")
}

object Sample extends App {
  new Sample
  new Sample
}
