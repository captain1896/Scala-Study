package com.lucas.study.scala.BuildInControlStructure

import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-22
 * Time: 下午5:19
 * To change this template use File | Settings | File Templates.
 */

class ForLoopTest{

}

object ForLoopTest {
  def main(args:Array[String]) {
    listFiles
    testMatchCase
    testMatchCase2
    testWhileCase
    testWhileCaseInFPStyle(0)
    searchFrom(1)
    printFrom(1)
    //printMultiTable
    multiTable
  }

  def listFiles() {
    val filesHere = (new File(".")).listFiles
    for (file <-  filesHere)
       println(file)

    //to 包含边界1,2,3,4,5
    for (i <- 1 to 5)
      println("Iteration:" + i)
    //until不包含边界1,2,3,4
    for ( i <- 1 until 5)
      println("Iteration: " + i)

    println("-----------")
    for (file <- filesHere if file.getName.endsWith(".git"))
      println(file)

    println("-----------")
    for (file <- filesHere )
      if (file.getName.endsWith(".git"))
        println(file)

    for (file <- filesHere if file.getName.endsWith(".iml"))
      println(file)
    println("---multi filter----")
    for (file <- filesHere if file.isFile; if file.getName.endsWith(".git"))
      println(file)
  }

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  /*def grep(pattern :String) =
    val filesHere = (new File(".")).listFiles
    for (
      file <- filesHere
      if file.getName.endsWith(".scala")
        line <- fileLines(file)
      if line.trim.matched(pattern)
    ) println(file + ":" + line.trim)*/

  /*val forLineLengths =
    for {
      file <- fileHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length*/

  def testMatchCase() {
    val args = Array[String]("salt", "", "")
    val firstArg = if (args.length > 0) args(0) else ""
    firstArg match {
      case "salt" => println("case value :pepper")
      case "chips" => println("case value :salsa")
      case "eggs" => println("case value :bacon")
      case _ => println("huh?")
    }
    println("firstArg:" + firstArg)
  }

  def testMatchCase2() {
    val args = Array[String]("salt", "", "")
    val firstArg = if (!args.isEmpty) args(0) else ""
    val friend = firstArg match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _  => "huh?"
    }
    println(friend)
  }

  def testWhileCase() {
    val args = Array[String]("system.log","wow.bcb","test.scala")
    var i = 0
    var foundIt = false
    while ( i < args.length && !foundIt) {
      if ( !args(i).startsWith("-")) {
        if(args(i).endsWith(".scala")){
          foundIt = true
          println("After " + i + " Times, We Found It !")
        }
      }
      i = i + 1
    }
  }

  def testWhileCaseInFPStyle(i: Int): Int = {
    val args = Array[String]("system.log", "wow.bcb", "test.scala")
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) testWhileCaseInFPStyle(i + 1)
    else if (args(i).endsWith(".scala")) {println("index value:" + i) ; i}
    else testWhileCaseInFPStyle(i + 1)
  }

  def searchFrom(i: Int): Int = {
    val args = Array[String]("", "","", "","", "","", "","", "","", "", ".scala")
    if (i >= args.length) -1
    if (args(i).startsWith("-")) searchFrom(i + 1)
    if (args(i).endsWith(".scala")) {
      println("index value:" + i); i
    }
    else searchFrom(i + 1)
  }

  def printFrom(i: Int): Int = {
    val max = 100
    if (i >= max) {
      println("End!"); -1
    }
    else if (i % 2 == 0) {
      println(i); printFrom(i + 1)
    }
    else if(i % 3 == 0) {
      println(i); printFrom(i + 1)
    } else {
      printFrom(i + 1)
    }
  }

  //这种是指令式风格写的乘法表
  def printMultiTable() {
    var i = 1
    //这里只有i在范围内
    while ( i < 10) {
      var j = 1
      //这里i和j在范围内
      while( j <= 10) {
        val prod = (i * j).toString
        //这里i和j和prod都在范围内
        var k = prod.length
        //这里i,j,prod和k都在范围内
        while (k < 4) {
          print(" ")
          k += 1
        }

        print(prod)
        j += 1

      }
      // i 和 j 仍然在范围内；prod和k脱离范围
      println()
      i += 1
    }

    //i仍在范围内；j,prod和k脱离范围
    //总结：i,j,prod,k都是本地变量，local variable,函数每次调用的时候会使用一套全新的本地变量
  }


   def demonstrateVariableScope() {
     val a = 1
     /*{
       val a = 2 //编译通过
       println(2)
     }*/
     println(a)

     val test = 1
     //val test = 1   //编译无法通过

     //scala和Java的差异是，Java不允许在内部范围创建于外部范围变量同名的变。
     //在Scala程序里面，内部变量被认为遮蔽(shadow)了同名的外部变量，因为在内部范围中外部变量变得不可见。
   }

  //重构指令式风格的代码，重构打印乘法表的代码，以函数式编程的方式重构
  //以序列形式返回一行乘法表
  def makeRowSeq(row : Int) =  {
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  }

  //以字符串形式返回一行乘法表
  def makeRow(row:Int) = makeRowSeq(row).mkString("\t")

  //以字符串形式返回乘法表，没行记录占一行字符串
  def multiTable() = {
    val tableSeq = //行记录字符串的序列
      for (row <- 1 to 10)
      yield makeRow(row)
    val table = tableSeq.mkString("\n")
    println(table)
    var m: Int = 10
    println(m.*(m))
  }

  def makeRowSeqp(row: Int) = {
    for (col <- 1 to 10) yield{
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  }

  def makeRowP(row : Int) = makeRowSeqp(row).mkString("\t")

  def multiTableP() = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRowP(row)
    val table = tableSeq.mkString("\n")
    println(table)
  }//行记录字符串的序列


}
