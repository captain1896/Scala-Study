package com.lucas.study.scala.ActorAndConcurrency.Actor

import scala.actors.Actor

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-10
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
object SillyActor extends Actor {
    def main(args: Array[String]) {
        SillyActor.start()
    }

    def act() {
        for (i <- 1 to 5) {
            println("I'm Acting!")
            Thread.sleep(1000)
        }
    }
}


