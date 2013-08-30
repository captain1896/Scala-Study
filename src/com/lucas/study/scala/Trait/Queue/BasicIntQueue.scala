package com.lucas.study.scala.Trait.Queue

import scala.collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 上午11:42
 * To change this template use File | Settings | File Templates.
 */
class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]()

    def get() = buf.remove(0)

    def put(x: Int) {
        println("BasicIntQueue.put")
        buf += x
    }
}
