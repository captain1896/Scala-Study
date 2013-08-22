package com.lucas.study.scala.CaseClassAndPatternMatching.PatternMatching

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
class Sample {
  val max = 100
  val MIN = 0

  def process(input: Int) {
    input match {
      case this.max => println("You matched max")
      case MIN => println("You matched MIN")
      case _ => println("Unmatched!")
    }
  }

}

object Sample {
  def main(args: Array[String]) {
    new Sample().process(100)
    new Sample().process(0)
    new Sample().process(10)
  }
}
