package com.lucas.study.scala.Trait.Number

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午5:58
 * To change this template use File | Settings | File Templates.
 */
class Foo extends Bar {
    override def bar(x: Int) = x
}

/**
 * 堆疊是作用對象是對同一方法。
 * 假設現在又trait1和trait2，trait1進行加一操作，trait2進行加二操作。
 */

object Foo {
    def main(args: Array[String]) {
        val foo1 = new Foo with Foo1 with Foo2
        println(foo1)
        println("(new Foo with Foo1 with Foo2).bar(5)=")
        foo1.bar(5)
        val foo2 = new Foo with Foo2 with Foo1
        println(foo2)
        println("(new Foo with Foo2 with Foo1).bar(5)=")
        foo2.bar(5)
    }
}