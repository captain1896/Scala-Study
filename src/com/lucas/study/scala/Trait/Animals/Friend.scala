package com.lucas.study.scala.Trait.Animals

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 上午11:59
 * To change this template use File | Settings | File Templates.
 */
trait Friend {
    val name: String

    def listen() = println("Your friend " + name + " is listening!")
}
