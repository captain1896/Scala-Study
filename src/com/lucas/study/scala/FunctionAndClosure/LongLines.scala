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

  def increase = (x : Int) => x + 9999
  def printIncrease() {
    val incr = increase(1)
    println("increase(1)=" + incr)
  }

  //如果你想让函数字面狼包含多条语句，可以用花括号包住函数体，一行放一条语句，这样就组成了代码块。
  //与方法一样，当函数被调用时，所有的语句将被执行，而函数的返回值就是最后一行表达式产生的值。
  /**
   * increase = (x:Int) => {
   *   statement1
   *   statement2
   *   statement3
   *   ...
   * }
   */
  def sayHelloTo = (name:String) => {
    println(name + ",Good morning! You are my cup of tea?! ")
    println(name + ",Good Luck To You!")
    println(name + ",You're The King!")
  }

  def printLsitNumber() {
    val someNumber = List[Int](-123,11,-32,44,2,32,90,-4)
    //所有集合类都能用到foreach方法，它以函数作为传入参数，并对每个元素调用该该函数。
    someNumber.foreach((x:Int) => print(x + "\t"))
    println()
    someNumber.foreach((x:Int) => print(x + "\t"))
    //集合类的filter方法，这个方法选择集合类型里可以通过用户提供的测试的元素。
    //测试是通过作为传入参数的函数实现的。
    //函数(x:Int) => x > 0 可以用来过滤，它把正整数映射为真，其他为假。下面说明如何把它当做filter：
    val greateTZero = someNumber.filter((x:Int) => x > 0)
    println()
    println(greateTZero)
  }
}
