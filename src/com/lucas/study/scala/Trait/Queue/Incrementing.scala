package com.lucas.study.scala.Trait.Queue

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
trait Incrementing extends IntQueue{
  abstract override def put(x:Int) {
    super.put(x + 1)
  }
}
