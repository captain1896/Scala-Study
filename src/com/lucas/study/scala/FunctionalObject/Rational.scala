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
  private val g = gcd (n.abs , d.abs)
  val numer = n / g
  val denom = d / g

  def this(n : Int) = this(n,1) //辅助构造器
  //Scala编译器将把类内部的任何既不是字段也不是方法定义的代码编译至主构造器中，
  //Scala编译器将这段代码的println调用放进Rational的主构造器。因此，println调用将在每次创建新的Rational实例打印这样一条信息。
  override def toString = numer + "/" + denom

  def add(that:Rational):Rational = new Rational(
    numer * that.denom + that.numer * denom ,
    denom * that.denom
  )

  def +(that:Rational):Rational = new Rational(
    numer * that.denom + that.numer * denom,
    denom * that.denom
  )

  def + (i:Int):Rational = new Rational(numer + i * denom ,denom )

  def - (that :Rational) :Rational = new Rational(
    numer * that.denom - that.numer * denom,
    denom * that.denom
  )

  def - (i : Int):Rational = {
    new Rational(numer - i * denom, denom)
  }

  def *(that:Rational) : Rational = new Rational (
    numer * that.numer , denom * that.denom
  )

  def *(i : Int) :Rational = new Rational(numer * i ,denom)

  def /(that:Rational):Rational = new Rational(numer * that.denom,denom * that.numer)
  def /(i :Int) :Rational = new Rational(numer,denom * i)

  def lessThan(that:Rational) ={
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that:Rational) =
    if (this.lessThan(that)) that else this

  private def gcd(a:Int , b : Int): Int =
    if (b == 0 ) a else gcd (b, a % b)

  //隐式转换起作用，需要定义在作用范围之内。如果你把饮食方法定义放在类Rational之内，它就不在解析器的作用范围。
  //目前，只能在解析器内直接定义它。
  //implicit def intToRational(x:Int) = new Rational(x)
}

object Rational {
  def main(args:Array[String]) {
    val oneHalf = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    val elevenTwos = new Rational(11,2)
    val oneTwoHundredAndOne = new Rational(1500000000,2000000000)
    //val oneZero = new Rational(1,0)
    println(oneHalf.add(twoThirds))
    println(oneHalf.lessThan(twoThirds))
    println(oneHalf.max(oneTwoHundredAndOne))
    val y = new Rational(45)
    println(y)
    println(twoThirds + oneTwoHundredAndOne)
    println(oneHalf * twoThirds)
    println(oneHalf - 3)
    println(oneHalf * 2)
  }
}
