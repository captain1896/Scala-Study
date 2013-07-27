package com.lucas.study.scala.Trait

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-27
 * Time: 下午10:56
 * To change this template use File | Settings | File Templates.
 */
class Rational(n:Int,d :Int) {
  //...
  //def < (that:Rational) =
  require( d != 0)
  private val g = gcd (n.abs , d.abs)
  val numer = n / g
  val denom = d / g

  def this(n : Int) = this(n,1) //辅助构造器
  override def toString = numer + "/" + denom

  private def gcd(a:Int , b : Int): Int =
    if (b == 0 ) a else gcd (b, a % b)

  def compare(that:Rational) =
    (this.numer * that.denom) - (that.numer * this.denom)
}
