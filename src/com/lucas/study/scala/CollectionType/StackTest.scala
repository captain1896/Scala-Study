package com.lucas.study.scala.CollectionType

import scala.collection.mutable.Stack

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午3:31
 * To change this template use File | Settings | File Templates.
 */
object StackTest {
    def main(args: Array[String]) {
        test
    }

    def test() {
        val stack = new Stack[Int]
        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)
        stack.push(5)
        println(stack)
        val s1 = stack.top
        println(s1)
        println(stack)
        val s2 = stack.pop()
        println(s2)
        println(stack)
    }

}

