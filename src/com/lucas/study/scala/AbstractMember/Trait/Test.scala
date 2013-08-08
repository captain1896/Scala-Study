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
    multiplesOf3and5(10)
    multiplesOf3and5(1000)
    //fibonacciNumber(10)
    testString
  }

  def test() {
    val x = 2
    val t = new {
      val denomArg: Int = 1 * x
      val numerArg: Int = 2 * x
    } with RationalTraits
    println(t)
  }

  def multiplesOf3and5(end:Int) {
    var sum = 0
    for (i <- 1 until end) {
         if(i % 3 == 0 || i % 5 == 0){
           sum += i
         }
    }
    println(sum)
  }

 /* def fibonacciNumber(i:Int):Int =  {
    var sum =  if(i == 1) {
      println(i)
      1
    } else if(i == 2){
      println(i)
      2
    } else{
      //println(i)
      fibonacciNumber(i-1) + fibonacciNumber(i -2)
    }
    sum
  }*/


  def testString() {
    val existsDigit = "abc123".exists(_.isDigit)
    println(existsDigit)

  }


}
