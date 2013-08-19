package com.lucas.study.scala.ClassAndObject.Machine

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 上午11:15
 * To change this template use File | Settings | File Templates.
 */
object Test {
  def main(args: Array[String]) = {
    val microwave = new Microwave
    microwave.start()
    microwave.stop()
    //microwave.turnTable()  //ERROR
  }
}
