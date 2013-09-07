package com.lucas.study.scala.ClassAndObject.Rocket

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-7
 * Time: 下午2:30
 * To change this template use File | Settings | File Templates.
 */
class Rocket {
    private var fuleVolume: Double = 20.3

    import Rocket.fuel


    private def canGoHomeAgain = fuel > 20

}

object Rocket {
    private def fuel = 22

    def chooseStrategy(rocket: Rocket) {
        if (rocket.canGoHomeAgain) {
            goHome()
        } else {
            pickStar()
        }
    }


    def goHome() {
        println("Go Home Now!")
    }

    def pickStar() {
        println("pick Star now !")
    }

    def apply(): Rocket = {
        new Rocket
    }
}

object Test {
    def main(args: Array[String]) {
        val rocket = new Rocket
        Rocket.chooseStrategy(rocket)
    }
}