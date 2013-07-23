package com.lucas.study.scala.FunctionAndClosure

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-23
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
object FindLongLines {
  def main(args:Array[String]) {
    val args = Array[String]("45","H:\\intellij_workspace\\scala-study\\src\\com\\lucas\\study\\scala\\FunctionAndClosure\\LongLines.scala"
      ,"H:\\intellij_workspace\\scala-study\\src\\com\\lucas\\study\\scala\\FunctionAndClosure\\FindLongLines.scala")
    val width = args(0).toInt
    for(arg <- args.drop(1))
      LongLines.processFileWithLocalFunctionRefactor(arg,width)
  }
}
