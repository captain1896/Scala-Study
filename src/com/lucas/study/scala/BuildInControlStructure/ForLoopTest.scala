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


}
