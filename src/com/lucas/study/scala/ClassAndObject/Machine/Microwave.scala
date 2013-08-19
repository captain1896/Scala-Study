package com.lucas.study.scala.ClassAndObject.Machine

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
class Microwave {
  def start() = println("Started")

  def stop() = println("Stopped")

  private def turnTable() = println("turning table")
}

object Microwave {
  def main(args: Array[String]) {
    testMicrowave
  }

  def testMicrowave() {
    val microwave = new Microwave
    microwave.start()
    microwave.stop()
    //伴生對象可以訪問類的私有方法以及字段，在別的類裏面就不可以訪問
    microwave.turnTable()
  }

}
