package com.lucas.study.scala.startUp

import scala.io.Source
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-19
 * Time: 上午10:56
 * To change this template use File | Settings | File Templates.
 */
object FunctionalProgrammingStyleTest {
  def main(args:Array[String]){
    //printArgsWithImperativeStyle(new Array[String]("Map","Reduce","Hadoop","ZooKeeper")),这种定义以及初始化数组是错误的，不用new关键字
    //初始化一个数组可以用这种形式，Array[String]("one","two","three")
    // 正确的初始化数组格式是：new Array[String](3),初始化数组，然后用索引初始化
    //List("Cool","Tools","Rules")可以构建和初始化一个List
    var arg = new Array[String](3)
    arg(0) = "Map"
    arg(1) = "Reduce"
    arg(2) = "Hadoop"
    printArgsWithImperativeStyle(arg)
    printArgsWithFunctionalStyle(arg)
    printArgsWithQuickFunctionalStyle(arg)
    println(formatArgs(arg))
    testAssertion()
  }

  def printArgsWithImperativeStyle(args:Array[String]):Unit = {
    var i = 0
    while(i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def printArgsWithFunctionalStyle(args:Array[String]) : Unit = {
    for(arg <- args) {
      println(arg)
    }
  }

  def printArgsWithQuickFunctionalStyle(args:Array[String]):Unit = {
    args.foreach(println)
  }

  def formatArgs(args:Array[String]): String = args.mkString("\n")

  def testAssertion():Unit = {
    val res = formatArgs(Array[String]("zero","one","two"))
    assert(res == "zero\none\ntwo")
  }

  def widthOfLength(s:String) = s.length.toString.length
  /*def printArgsWithFormat(args:Array[String]) {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines.toString
      val longestLine = lines.reduceLeft(
        (a,b) => if (a.length > b.length) a else b
      )
      val maxWidth = widthOfLength(longestLine)
      for (line <- lines) {
        val numSpaces = maxWidth widthOflength(line)
        val padding = " " * numSpaces
        print(padding + line.length + "|" + line)
      }

    }else {
      Console.err.println("Please enter filename")
    }
  }*/
}
