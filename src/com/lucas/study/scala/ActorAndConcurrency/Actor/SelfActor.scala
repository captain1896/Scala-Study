package com.lucas.study.scala.ActorAndConcurrency.Actor

import scala.actors.Actor._

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-11
 * Time: 上午11:09
 * To change this template use File | Settings | File Templates.
 */
object SelfActor {
    def run() {
        self ! "Welcome to Rome!"
        val receives = self.receive {
            case x => x
        }
        println(receives)


        val intActor = actor {
            receive {
                case x: Int => println("I got a Int:" + x)
                case _ => println("Do nothing!")
            }
        }

        intActor ! 12321


        val stringActor = actor {
            receive {
                case s: String => println("I got a String:" + s)
                case _ => println("Do nothing!")
            }
        }

        stringActor ! 1232

    }

    def main(args: Array[String]) {
        run
    }
}
