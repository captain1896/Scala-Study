package com.lucas.study.scala.CaseClassAndPatternMatching

import Math.{E, Pi}

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-30
 * Time: 下午3:54
 * To change this template use File | Settings | File Templates.
 */
object TestCaseClassAndMatchingPattern {
  def main(args: Array[String]) = {
    testCaseClass
    testSimplifyTop
    testDescibr
    testValMatchingPattern
    testMath
    testConstructorPattern
    testSerializeMatchingPattern
    testTupleMatchingPattern
    testTypedPattern
    testIsIntIntMap
    testSimplifyAdd
    testSimplifyAll
  }

  def testCaseClass() {
    val v = Var("x")
    println(v)

    val op = BinOp("+", Number(1), v)
    println(v.name + "|" + op.left + "|" + op.right)
  }

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr
  }

  def testSimplifyTop() {
    println(simplifyTop(UnOp("-", UnOp("-", Number(12.3)))))
  }

  def describe(x: Any) = x match {
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
    println(describe(List(1, 2, 3)))
  }


  def valMatchingPattern(somethingElse: Any) = somethingElse match {
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

  def constructorPattern(x: Any) = x match {
    case BinOp("+", Var("Y"), Number(0)) => println("A deep match!")
    case _ => println("Not match!")
  }

  def testConstructorPattern() {
    println(constructorPattern(BinOp("+", Var("Y"), Number(0))))
    println(constructorPattern(BinOp("-", Var("Y"), Number(0))))
    println(constructorPattern(BinOp("+", Var("X"), Number(0))))
    println(constructorPattern(BinOp("+", Var("Y"), Number(9.0))))
  }

  def serializeMatchingPattern(x: Any) = x match {
    case List(0, _, _) => println("serializeMatchingPattern Found It!")
    case _ => println("serializeMatchingPattern Not Match!")
  }

  /**
   * 匹配任意長度的序列，可以指定_*作為模式的最後元素。
   * 這種古怪的模式能匹配序列中零到任意數量的元素。
   * 下面的方法匹配由零開始，不計長度的任意列表的模式。
   * @param x
   */
  def serializeMatchingPattern2(x: Any) = x match {
    case List(0, _*) => println("serializeMatchingPattern2 Found It!")
    case _ => println("serializeMatchingPattern2 Not Match!")
  }

  def testSerializeMatchingPattern() {
    println(serializeMatchingPattern(Nil))
    println(serializeMatchingPattern(List(1, 2, 3)))
    println(serializeMatchingPattern(List(0, 1, 4, 5)))
    println(serializeMatchingPattern(List(0, 1)))
    println(serializeMatchingPattern(List(0, 1, 4)))
    serializeMatchingPattern2(List(0, 1, 4))
    println("---Unit---:" + serializeMatchingPattern2(List(0, 1, 4)))
  }

  def tupleDemo(x: Any) = x match {
    case (a, b, c) => println("matched :" + a + b + c)
    case _ => println("tupleDemo Not Match !")
  }

  def testTupleMatchingPattern() {
    tupleDemo(("ENGLAND|", "SCOTLAND|", "IRELAND"))
    tupleDemo(("", "", "", ""))
    tupleDemo("")

  }

  def typedPattern(x: Any) = x match {
    case s: String => println("Matched!"); s.length
    case m: Map[_, _] => println("Matched!"); m.size
    case _ => 1
  }

  def testTypedPattern() = {
    println(typedPattern("Maven"))
    println(typedPattern(Map(1 -> 'a', 2 -> 'b')))
  }

  def isIntIntMap(x: Any) = x match {
    case m: Map[Int, Int] => true
    case _ => false
  }

  def isIntIntMap2(x: Any) = x match {
    case a: Array[String] => "yes"
    case _ => "no"
  }

  //類型擦除，擦除規則唯一例外的就是數組，因為Scala和Java裏面，數組被特殊處理過了。！
  def testIsIntIntMap() {
    println(isIntIntMap(Map(1 -> 1))) //true
    println(isIntIntMap(Map("China" -> "China"))) //true

    println(isIntIntMap2(Array[String]("abc"))) //true
    println(isIntIntMap2(Array[Int](1, 2, 3))) // false
  }

  //守衛模式定制匹配模式
  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x, y) if x == y =>
      BinOp("*", x, Number(2))
    case _ => e
  }

  def testSimplifyAdd() {
    println("simplifyAdd(BinOp(\"+\",Var(\"1\"),Var(\"1\"))) ===> " + simplifyAdd(BinOp("+", Var("1"), Var("1"))))
    println("simplifyAdd(BinOp(\"+\",Var(\"1\"),Var(\"2\"))) ===> " + simplifyAdd(BinOp("+", Var("1"), Var("2"))))
    println("simplifyAdd(BinOp(\"+\",Var(\"5\"),Var(\"5\"))) ===> " + simplifyAdd(BinOp("+", Var("5"), Var("5"))))
  }

  /**
   * 模式重疊，第四個樣本包含了模式UnOp（op,e）;等內容，它匹配任何一元操作。
   * 操作符和操作單元任選，它們相應地綁定變量op和e。
   * 這個樣本中的可選表達式對操作元e進行遞歸調用simplifyAll方法並使用（可能是）簡化了的操作的操作元重建同樣的一元操作。
   * 第五個樣本對BinOp是類似的：它是任意二院操作符的“全匹配”，並且對兩個操作元遞歸調用了簡化方法。
   * @param expr
   * @return
   */
  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e)
    case BinOp("+", e, Number(0)) => simplifyAll(e)
    case BinOp("*", e, Number(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, Number(1), r) => BinOp(op, simplifyAll(Number(1)), simplifyAll(r))
    case _ => expr
  }


  def testSimplifyAll() {
    println("simplifyAll(BinOp(\"+\",Number(100,Number(0)))) ===>" + simplifyAll(BinOp("+", Number(100), Number(0))))
    println("simplifyAll(UnOp(\"-\",UnOp(\"-\",Number(1000)))) ===>" + simplifyAll(UnOp("-",UnOp("-",Number(1000)))))
    println("simplifyAll(BinOp(\"*\",Var(\"O\"),Number(1.0))) ===>" + simplifyAll(BinOp("*",Var("O"),Number(1.0))) )
  }

}

