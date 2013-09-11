package com.lucas.study.scala.ActorAndConcurrency.Actor

import scala.actors.Actor._

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-11
 * Time: 上午10:47
 * To change this template use File | Settings | File Templates.
 */
object ActorTest {
    def run() {
        val stringActor = actor {
            while (true) {
                receive {
                    case x: String => println("Got A String:" + x)
                }
            }
        }

        stringActor ! "HELLO"
        stringActor ! "Scala is beautiful!"

        val intActor = actor {
            while (true) {
                receive {
                    case x: Int => println("Got A Int:" + x)
                }
            }
        }

        intActor ! 123
        intActor ! 989
    }

    def main(args: Array[String]) {
        run()
    }
}
