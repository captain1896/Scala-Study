package com.lucas.study.scala.CollectionType

import scala.collection.mutable.Queue

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
object MutableQueueTest {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val empty = new Queue[Int]
    println(empty)
    val queue = new Queue[Int]()
    queue.enqueue(1)
    queue.enqueue(12)
    queue.enqueue(123)
    queue.enqueue(1234)
    val de = queue.dequeue()
    println(de)
    queue ++= List(9,99,999)
    println(queue)



  }

}
