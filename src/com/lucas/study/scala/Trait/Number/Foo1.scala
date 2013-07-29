package com.lucas.study.scala.Trait.Number

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午5:59
 * To change this template use File | Settings | File Templates.
 */
trait Foo1 extends Foo {
   abstract override def bar(x:Int) = {
     val a = x + super.bar(x)
     println("Foo1=" + a)
     a
   }
}
