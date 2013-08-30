package com.lucas.study.scala.CollectionType

import scala.collection.mutable.ListBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午2:53
 * To change this template use File | Settings | File Templates.
 */
object ListBufferTest {
    def main(args: Array[String]) {
        test
    }

    def test() {
        val buf = new ListBuffer[Int]
        buf += 1
        buf += 2
        buf += 3
        buf += 4
        buf += 5
        buf.+:(33)
        println(buf)
        val bufList = buf.toList
        println(bufList)
    }
}
