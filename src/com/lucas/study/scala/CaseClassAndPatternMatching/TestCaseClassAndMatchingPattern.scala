package com.lucas.study.scala.CaseClassAndPatternMatching

import Math.{E,Pi}
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-30
 * Time: 下午3:54
 * To change this template use File | Settings | File Templates.
 */
object TestCaseClassAndMatchingPattern {
  def main(args:Array[String]) = {
    testCaseClass
    testSimplifyTop
    testDescibr
    testValMatchingPattern
    testMath
    testConstructorPattern
  }

  def testCaseClass() {
    val v = Var("x")
    println(v)

    val op = BinOp("+" , Number(1),v)
    println(v.name + "|" + op.left + "|" + op.right)
  }

  def simplifyTop(expr:Expr):Expr = expr match {
    case UnOp("-",UnOp("-",e)) => e
    case BinOp("+",e,Number(0)) => e
    case BinOp("*",e,Number(1)) => e
    case _ => expr
  }

  def testSimplifyTop() {
    println(simplifyTop(UnOp("-",UnOp("-",Number(12.3)))))
  }

  def describe(x:Any) = x match {
    case 5 => "five"
    case true => "true"
    case "hello" => "hi!"
    case Nil => "the empty list!"
    case _ => "something else!"
  }

  def testDescibr() {
    println(describe(5))
    println(describe(true))
    println(describe("hello"))
    println(describe(Nil))
    println(describe(List(1,2,3)))
  }


  def valMatchingPattern(somethingElse:Any) = somethingElse match {
    case 0 => "zero"
    case somethingElse => "not zero:" + somethingElse
  }

  def testValMatchingPattern() {
    println(valMatchingPattern(0))
    println(valMatchingPattern(Nil))
  }

  def math() = E match {
    case Pi => "Strange math? Pi=" + Pi
    case _ => "OK"
  }
  def math2() = E match {
    case pi => "Strange math? Pi=" + Pi
      // case _ => "Ok" // unreachable code!
  }

  def testMath() {
    println(math)
    val pi = Math.Pi
    println(math2)
  }

  def constructorPattern(x:Any) = x match {
    case BinOp("+" , Var("Y") , Number(0)) => println("A deep match!")
    case _ => println("Not match!")
  }

  def testConstructorPattern(){
    println(constructorPattern(BinOp("+",Var("Y"),Number(0))))
    println(constructorPattern(BinOp("-",Var("Y"),Number(0))))
    println(constructorPattern(BinOp("+",Var("X"),Number(0))))
    println(constructorPattern(BinOp("+",Var("Y"),Number(9.0))))
  }


}
