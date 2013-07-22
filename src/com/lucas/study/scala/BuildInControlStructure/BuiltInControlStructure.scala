package com.lucas.study.scala.BuildInControlStructure

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-22
 * Time: 下午3:56
 * To change this template use File | Settings | File Templates.
 */

class BuiltInControlStructure {

}

object BuiltInControlStructure {
  def main(args: Array[String]) {
    var argsn = Array [String]("map.txt","reduce.doc","javascript.js")
    ifTestCase(argsn)
  }

  def ifTestCase(args: Array[String]) {
    val filename =
      if (!args.isEmpty) args(0)
      else "default.txt"
    println(filename)
    println(gcdLoop(12,36))
    println(gcd(12,36))
  }

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)

  def gcd2(x: Long, y: Long): Long = if (y == 0) x else gcd2(y, x % y)
}
