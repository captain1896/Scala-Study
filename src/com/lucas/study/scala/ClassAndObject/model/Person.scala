package com.lucas.study.scala.ClassAndObject.model

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午12:15
 * To change this template use File | Settings | File Templates.
 */
class Person(val firstName: String, val lastName: String) {
  //可以初始化position
  private var position: String = _
  println("Creating " + toString)

  //副構造函數調用主構造函數初始化名字相關的字段。
  //副構造函數的第一條語句，要麼是調用住構造函數，要麼是調用另外一個副構造函數；二者必選其一
  def this(firstName: String, lastName: String, positionHeld: String) {
    this(firstName, lastName)
    position = positionHeld
  }

  override def toString(): String = {
    firstName + " " + lastName + " holds " + position + " position !"
  }
}


object Person extends App {
  val john = new Person("John", "Smith", "Analyst")
  println(john)
  val bill = new Person("Bill", "Walker")
  println(bill)

  def test() {
    val lucas = new Person("Lucas", "Ley", "Development Engineering")
    println(lucas)
  }
  test
}
