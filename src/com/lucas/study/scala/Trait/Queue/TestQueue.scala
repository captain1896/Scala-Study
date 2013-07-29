package com.lucas.study.scala.Trait.Queue

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 上午11:57
 * To change this template use File | Settings | File Templates.
 */
object TestQueue {
  def main(args:Array[String]) {
    val queue = new BasicIntQueue
    for(i <- 121 to 130){
      queue.put(i)
    }
    val get1 = queue.get();
    val get2 = queue.get();
    val get3 = queue.get();
    val get4 = queue.get();
    println(get1 + "|" + get2 + "|" + get3 + "|" + get4)
    testMyQueue
    testIncrementingQueue
    testFilteringQueue
    testBasicIntQueueWithDoubling
  }

  def testMyQueue() {
    println("-----testMyQueue invoked!-------")
    val queue = new MyQueue
    queue.put(10)
    println(queue)
  }

  def testIncrementingQueue() {
    println("------testIncrementingQueue invoked!----")
    val queue= new IncrementingQueue
    queue.put(20)
    println(queue)
  }

  def testFilteringQueue(){
    println("------testFilteringQueue invoked!-------")
    val queue = new FilteringQueue
    queue.put(-12)
    queue.put(12)
  }

  def testBasicIntQueueWithDoubling() {
    println("testBasicIntQueueWithDoubling invoked!")
    val queueD = new BasicIntQueue with Doubling
    val queueI = new BasicIntQueue with Incrementing
    val queueF = new BasicIntQueue with Filtering
    queueD.put(123)
    queueI.put(900)
    queueF.put(200)
    queueF.put(-200)
    println()
  }
}
