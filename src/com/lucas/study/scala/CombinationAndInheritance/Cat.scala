package com.lucas.study.scala.CombinationAndInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
class Cat {
    val dangerous = false
}

class Tiger(override val dangerous: Boolean, private var age: Int) extends Cat

class Tiger2(param1: Boolean, param2: Int) extends Cat {
    override val dangerous = param1
    private var age = param2
}
