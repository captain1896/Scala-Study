package com.lucas.study.scala.ActorAndConcurrency.ActorModel

import scala.actors.Actor._
import scala.actors.Actor

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-12
 * Time: 上午11:26
 * To change this template use File | Settings | File Templates.
 */
object NameResolver extends Actor {

    import java.net.{InetAddress, UnknownHostException}

    def act() {
        react {
            case (name: String, actor: Actor) =>
                actor ! getIp(name)
                act()
            case "EXIT" =>
                println("Mame Resolver exiting!")
            case msg =>
                println("Unknowned message:" + msg)
                act()
        }
    }

    def getIp(name: String): Option[InetAddress] = {
        try {
            Some(InetAddress.getByName(name))
        } catch {
            case _: UnknownHostException => None
        }
    }

    def test() {
        NameResolver.start()
        NameResolver !("www.scala-lang.org", self)
        val rec1 = self.receiveWithin(0) {
            case x => x
        }
        println(rec1)

        NameResolver !("www.scala-lang.org", self)
        val rec2 = self.receiveWithin(0) {
            case x => x
        }
        println(rec2)

    }

    def main(args: Array[String]) {
        test
    }
}
