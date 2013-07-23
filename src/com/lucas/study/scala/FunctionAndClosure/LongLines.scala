package com.lucas.study.scala.FunctionAndClosure

import scala.io.Source
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-23
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
object LongLines {
  def processFile(filename:String , width :Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(filename ,width,line)
  }

  private def processLine(filename:String , width:Int , line:String) {
    if(line.length > width)
      println(filename + ":" + line.trim +"|line.length:" + line.length)
  }

  //通过私有方法processLine转换为局部方法processLine,重构了原本的读取文件的方式。
  //作为本地函数，processLine的范围局限于processLine之内，外部无法访问
  def processFileWithLocalFunction(filename: String, width: Int) {
    def processLine(filename: String, width: Int, line: String) {
      if (line.length > width)
        println(filename + ":" + line.trim + "|line.length:" + line.length)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines()) {
      processLine(filename, width, line)
    }
  }

  //本地函数可以访问，包含本地函数本身的函数的参数，如：processLine可以访问filename
  def processFileWithLocalFunctionRefactor(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length > width) {
        println(filename + ":|FileStart:" + line.trim + "|lien.length:" + line.length)
      }
    }
    val source = Source.fromFile(filename)
    for(line <- source.getLines)
      processLine(line)
  }
}
