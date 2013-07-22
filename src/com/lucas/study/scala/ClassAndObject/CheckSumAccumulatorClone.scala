package com.lucas.study.scala.ClassAndObject

import scala.collection.mutable.Map
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-19
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */


class CheckSumAccumulator {
  private var sum = 0
  def add(b:Byte) {sum += b}
  def checksum():Int = ~(sum &0xFF) + 1
}


/**
 * 单例对象是用object关键字定义的对象。
 * 当单例对象鱼某个类共享同一个名称时，它就被称为是这个类的半生对象（companion object）
 * 类和它的伴生对象必须定义在一个源文件里。
 * 类被称为是这个单例对象的伴生类（companion class）
 * 类和伴生对象，可以互相访问器是有成员
 */
object CheckSumAccumulator {
  private val cache = Map[String,Int]()
  def calculate(s:String):Int = {
    if (cache.contains(s)) {
      cache(s)
    }else {
      val acc = new CheckSumAccumulator
      println(acc)
      for (c <- s) {
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      //这行不能删除,类似于Java的返回值来的
      cs

    }
  }


  def testOperator() ={
    val sum = 1 + 2
    println(sum)
    println((1).+(2))
    println((3.9).unary_-)
    println((89).unary_~)
    println(~89)
  }

  def main(args:Array[String]) {
    val obj = new CheckSumAccumulator
    CheckSumAccumulator.calculate("")
    testOperator()
  }
}
