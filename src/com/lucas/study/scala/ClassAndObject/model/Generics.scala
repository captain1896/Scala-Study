package com.lucas.study.scala.ClassAndObject.model

import java.util.ArrayList
import java.util.List
import scala.collection.immutable.{List => SList}

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午3:37
 * To change this template use File | Settings | File Templates.
 */

object Generics {
    def main(args: Array[String]) {
        test
        testCommentOnPractice
    }

    def test {
        var list1: List[Int] = new ArrayList[Int]
        var list2 = new ArrayList[Int]
        list2 add 1
        list2 add 2
        var total = 0
        for (index <- 0 until list2.size()) {
            total += list2.get(index)
        }

        println(total)
        val list3 = SList[Int](1, 100)
        var sum = 0
        list3.foreach(i => sum = sum + i)
        println(sum)

    }

    def madMethod() = {
        //throw new IllegalArgumentException
    }

    def testMadMethod() {
        println(getClass().getDeclaredMethod("madMethod", null).getReturnType().getName())
    }

    def commentOnPractice(input: String) = {
        //rather than returning null
        if (input == "scala") Some("Some->SCALA") else None
    }

    def testCommentOnPractice() {
        for (input <- Set("scala", "hack")) {
            val comment = commentOnPractice(input)
            println("input=" + input + ",comment=" + comment.getOrElse("Found No Parameters"))
        }
    }

}
