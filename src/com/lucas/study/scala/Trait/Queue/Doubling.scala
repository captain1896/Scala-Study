package com.lucas.study.scala.Trait.Queue

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午12:17
 * To change this template use File | Settings | File Templates.
 */
trait Doubling extends IntQueue{
  abstract override def put(x:Int){
    println("Doubling.BasicIntQueue.put")
    super.put(x * 2)

  }
}
