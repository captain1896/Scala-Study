package com.lucas.study.scala.Trait.Queue

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 上午11:57
 * To change this template use File | Settings | File Templates.
 */
object TestQueue {
  def main(args: Array[String]) {
    val queue = new BasicIntQueue
    for (i <- 121 to 130) {
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
    testTraitOrder
  }

  def testMyQueue() {
    println("-----testMyQueue invoked!-------")
    val queue = new MyQueue
    queue.put(10)
    println(queue)
  }

  def testIncrementingQueue() {
    println("------testIncrementingQueue invoked!----")
    val queue = new IncrementingQueue
    queue.put(20)
    println(queue)
  }

  def testFilteringQueue() {
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

  /**
   * 抽象方法中有一個super調用，這種調用對於普通的類來說是非法的。
   * 因為他們在執行的時候將必然會失敗。然而對於特質來說，這樣的調用實際能夠成功。
   * 因為特質里的super調用是動態綁定的，特質Doubling的super調用將指導被混入另一個特質或類之後，有了具體的方法定義是才工作。
   * 這種安排對於實現可以堆疊的改動的特質來說，常常要用到。這種標誌符的組合僅在特質成員的定義中被認可，在類中則不行，它意味著特質必須被混入某個具有期待方法的具體定義的類中。
   *
   * 特質混入的次序非常重要。粗略地說，越靠近右側的特質越先起作用。
   * 當你調用帶混入的類的方法的時候，最右側的方法首先被調用。如果那個方法調用了super,它調用其左側的特質的方法，以此類推。
   * 一旦特質混入了類，你也可以稱其為一個混入（mixin）
   */
  def testTraitOrder() {
    val queue = new BasicIntQueue with Incrementing with Filtering
    queue.put(-1)
    queue.put(0)
    queue.put(1)
    println("-------")

    val queue2 = new BasicIntQueue with Filtering with Incrementing
    queue2.put(-1)
    queue2.put(0)
    queue2.put(1)
  }
}
