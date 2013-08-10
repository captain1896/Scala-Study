package com.lucas.study.scala.Extrators.Email

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-10
 * Time: 下午8:53
 * To change this template use File | Settings | File Templates.
 */
object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase() == s

  def userTwiceUpper(s: String) = s match {
    case Email(Twice(x@UpperCase()), domain) => "match:" + x + " in domain" + domain
    case _ => "no match"
  }

/*  def isTomInDotCom(s: String): Boolean = s match {
    case Email("tom", Domain("com", _*)) => true
    case _ => false
  }*/

 /* def testDom(dom: String) = dom match {
    case Domain("org", "acm") => println("acm.org")
    case Domain("com", "sun", "java") => println("java.sun.com")
    case Domain("net", _*) => println("a .net domain")
  }*/

  def main(args: Array[String]) {
    val r1 = userTwiceUpper("DIDI@hotmail.com")
    val r2 = userTwiceUpper("DIDO@hotmail.com")
    val r3 = userTwiceUpper("didi@hotmail.com")
    println(r1)
    println(r2)
    println(r3)
  }
};