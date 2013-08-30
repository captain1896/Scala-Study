package com.lucas.study.scala.CollectionType

import scala.collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午3:03
 * To change this template use File | Settings | File Templates.
 */
object ArrayBuffer {
    def main(args: Array[String]) {
        test
    }

    def test() {
        val buf = new ArrayBuffer[Int]()
        buf += 1
        buf += 2
        buf += 90
        println(buf)
        println(buf.length)
        println(buf(2))
    }
}
