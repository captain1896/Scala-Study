package com.lucas.study.scala.Trait.Number

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午6:01
 * To change this template use File | Settings | File Templates.
 */
trait Foo2 extends Foo {
  abstract override def bar(x:Int) = {
    val a = x * super.bar(x)
    println("Foo2=" + a)
    a
  }
}
