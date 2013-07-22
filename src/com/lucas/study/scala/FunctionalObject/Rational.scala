package com.lucas.study.scala.FunctionalObject

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-22
 * Time: 上午10:53
 * To change this template use File | Settings | File Templates.
 */

/**
 *在类名之后，的括号里的n和d,成为类参数（class parameter）.
 * Scala编译器会收集这两个类参数并创造出带同样的两个参数的主构造器
 * @param n
 * @param d
 */
class Rational(n : Int , d : Int){
  require( d != 0)
  val numer: Int = n
  val denom:Int = d

  def this(n : Int) = this(n,1) //辅助构造器
  //Scala编译器将把类内部的任何既不是字段也不是方法定义的代码编译至主构造器中，
  //Scala编译器将这段代码的println调用放进Rational的主构造器。因此，println调用将在每次创建新的Rational实例打印这样一条信息。
  override def toString = n + "/" + d

  def add(that:Rational):Rational = new Rational(
    numer * that.denom + that.numer * denom ,
    denom * that.denom
  )

  def lessThan(that:Rational) ={
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that:Rational) =
    if (this.lessThan(that)) that else this
}

object Rational {
  def main(args:Array[String]) {
    val oneHalf = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    val elevenTwos = new Rational(11,2)
    val oneTwoHundredAndOne = new Rational(1,201)
    //val oneZero = new Rational(1,0)
    println(oneHalf.add(twoThirds))
    println(oneHalf.lessThan(twoThirds))
    println(oneHalf.max(oneTwoHundredAndOne))
    val y = new Rational(45)
    println(y)
  }
}
