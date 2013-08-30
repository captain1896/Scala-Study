package com.lucas.study.scala.ActorAndConcurrency

import scala.actors.Actor

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-12
 * Time: 上午10:43
 * To change this template use File | Settings | File Templates.
 */
object SeriousActor extends Actor {
    def act() {
        for (i <- 1 to 5) {
            println("To be or not to be.")
            Thread.sleep(1000L)
        }
    }

    def main(args: Array[String]) {
        SillyActor.start()
        SeriousActor.start()
    }

}
