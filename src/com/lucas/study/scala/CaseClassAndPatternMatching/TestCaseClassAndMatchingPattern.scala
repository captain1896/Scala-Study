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
    testSerializeMatchingPattern
    testTupleMatchingPattern
    testTypedPattern
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

  def serializeMatchingPattern(x:Any) = x match {
    case List(0,_,_) => println("serializeMatchingPattern Found It!")
    case _ =>  println("serializeMatchingPattern Not Match!")
  }

  /**
   *匹配任意長度的序列，可以指定_*作為模式的最後元素。
   * 這種古怪的模式能匹配序列中零到任意數量的元素。
   * 下面的方法匹配由零開始，不計長度的任意列表的模式。
   * @param x
   */
  def serializeMatchingPattern2(x:Any) = x match {
    case List(0,_*) => println("serializeMatchingPattern2 Found It!")
    case _ =>  println("serializeMatchingPattern2 Not Match!")
  }

  def testSerializeMatchingPattern() {
    println(serializeMatchingPattern(Nil))
    println(serializeMatchingPattern(List(1,2,3)))
    println(serializeMatchingPattern(List(0,1,4,5)))
    println(serializeMatchingPattern(List(0,1)))
    println(serializeMatchingPattern(List(0,1,4)))
    serializeMatchingPattern2(List(0,1,4))
    println("---Unit---:" + serializeMatchingPattern2(List(0,1,4)))
  }

  def tupleDemo(x:Any) = x match {
    case (a,b,c) => println("matched :" + a + b + c)
    case _ => println("tupleDemo Not Match !")
  }

  def testTupleMatchingPattern() {
    tupleDemo(("ENGLAND|","SCOTLAND|","IRELAND"))
    tupleDemo(("","","",""))
    tupleDemo("")

  }

  def typedPattern(x:Any) = x match {
    case s:String => println("Matched!"); s.length
    case m:Map[_,_] => println("Matched!"); m.size
    case _ => 1
  }

  def testTypedPattern() = {
    println(typedPattern("Maven"))
    println(typedPattern(Map(1 -> 'a' , 2 -> 'b')))
  }
}

