package com.lucas.study.scala.ListUsage.ImplementingLists.Fruit

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午5:58
 * To change this template use File | Settings | File Templates.
 */
object FruitTest {
    def main(args: Array[String]) {
        test
    }

    def test() {
        val apples = new Apple :: Nil
        println(apples)
        val fruits = new Orange :: apples
        println(fruits)

        val obj = new Object
        val anys = obj :: fruits
        println(anys)
    }

}
