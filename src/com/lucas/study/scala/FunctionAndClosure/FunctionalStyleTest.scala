package com.lucas.study.scala.FunctionAndClosure

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-17
 * Time: 下午6:18
 * To change this template use File | Settings | File Templates.
 */
object FunctionalStyleTest {
    def totalResultOverRange(numberRange: Int, codeBlock: Int => Int): Int = {
        var result = 0
        for (i <- 1 to numberRange) {
            result += codeBlock(i)
        }
        result
    }

    def testTotalResultOverRange() {
        println("1-10的和:" + totalResultOverRange(10, i => i))
        println("1-10的偶數和:" + totalResultOverRange(10, i => if (i % 2 == 0) i else 0))
        println("1-10的偶數和:" + totalResultOverRange(10, i => if (i % 2 != 0) i else 0))
        println("1-100的偶數個數：" + totalResultOverRange(100, i => if (i % 2 == 0) 1 else 0))
        println("1-100的奇數個數：" + totalResultOverRange(100, i => if (i % 2 != 0) 1 else 0))
    }


    def inject(arr: Array[Int], initial: Int, operation: (Int, Int) => Int): Int = {
        var carryOver = initial
        arr.foreach(element => carryOver = operation(carryOver, element))
        carryOver
    }

    def testInject() {
        val array = Array[Int](2, 3, 5, 6, 4)
        val sum = inject(array, 0, (carryOver, elem) => carryOver + elem)
        println("Sum of elements in array " + array.toString() + " and Sum =" + sum)
    }

    def main(args: Array[String]) {
        testTotalResultOverRange
        testInject
    }
}
