package com.lucas.study.scala.ActorAndConcurrency

import scala.actors.Actor._

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-12
 * Time: 上午10:47
 * To change this template use File | Settings | File Templates.
 */
object SeriousActor2 {
    /**
     * 上述val定義創建了一個由執行actor方法后的代碼塊定義的actor，這個actor在定義后立即啟動，無需另外調用start方法。
     */
    def test() {
        val seriousActor2 = actor {
            for (i <- 1 to 5) {
                println("That is the question!")
                Thread.sleep(1000L)
            }

        }
    }

    def test2() {
        val echoActor = actor {
            while (true) {
                receive {
                    case msg =>
                        println("received message:" + msg)
                }
            }
        }
        echoActor ! "hi there"
        echoActor ! 14
        echoActor ! SillyActor
    }

    def test3() {
        val intActor = actor {
            while (true) {
                receive {
                    case x: Int => //只要Int
                        println("Got An Int:" + x)
                }
            }

        }
        intActor ! "Hello"
        intActor ! Math.Pi //Pi是double類型的
        intActor ! 999
        intActor ! 12
        intActor ! 1
        for (i <- 1 to 10) {
            intActor ! i
        }
    }

    /**
     * Actor子系統會管理一個或者多個原生線程供自己使用。只要你用的是你顯樣式定義的actor，就不需要關心他們和線程的對應關係是怎麼樣的。
     * 該子系統也支持反過來的情形：每個原生線程也可以被當做actor來使用，不過，你不能直接使用Thread.current，因為它并不具備必要的方法，
     * 你應該使用Actor.self來將當前的線程當做actor來查看。
     * 這個設施對於在交互死命令中調試actor尤為有用。
     * 使用Actor.self來將當前的線程當做actor來查看。
     */
    def selfTest() {
        self ! "hello"
        val receiveMsg = self.receive {
            case x => x
        }
        println(receiveMsg)
        self ! "reveive Within 1000"
        val recMsg = self.receiveWithin(1000) {
            case x => x //等一秒鐘
        }

        println(recMsg)
    }

    def main(args: Array[String]) {
        test
        test2
        test3
        selfTest
    }
}
