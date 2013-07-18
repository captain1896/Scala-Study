package com.lucas.study.scala

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-18
 * Time: 上午11:58
 * To change this template use File | Settings | File Templates.
 */
object ScalaPrimer {
  def main(args:Array[String]){
    foreach()
  }

  def foreach(){
    var strArr = new Array[String](3)
    strArr(0) = "string1"
    strArr(1) = "string2"
    strArr(2) = "string3"
    strArr foreach ((str: String) => println(str))

    println("-----我是分割线--------")
    for(i <- 0 to 2) {
      println(strArr(i))
    }
  }

}
