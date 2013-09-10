package com.lucas.study.scala.ActorAndConcurrency.Actor

import scala.actors.Actor
import scala.actors.Actor._

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-10
 * Time: 下午12:32
 * To change this template use File | Settings | File Templates.
 */
object SeriousActor extends Actor {
    def act() {
        for (i <- 1 to 5) {
            println("To be or not to be")
            Thread.sleep(1000)
        }
    }

    def testActor() {
        val seriousActor2 = actor {
            for (i <- 1 to 5) {
                println("That's the question!")
                Thread.sleep(1000)
            }
        }
    }

    def main(args: Array[String]) {
        SeriousActor.start()
        SillyActor.start()
        SeriousActor.testActor()
    }
}
