package com.lucas.study.scala.FunctionAndClosure

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-17
 * Time: 下午6:58
 * To change this template use File | Settings | File Templates.
 */
class Equipment(val routine: Int => Int) {
    def simulate(input: Int) = {
        println("Runnig simulate...")
        routine(input)
    }
}

object Equipment {
    def main(args: Array[String]) = {
        test
    }

    def test() {
        val equitment1 = new Equipment({
            input => {
                println("cal with " + input)
                input
            }

        })

        val equitment2 = new Equipment({
            input => {
                println("cal with " + input)
                input
            }
        })

        equitment1.simulate(4)
        equitment2.simulate(6)


        //複用性好的代碼：
        val calculator1 = {
            input: Int => println("calc with " + input)
                input
        }

        val equipment3 = new Equipment(calculator1)
        val equipment4 = new Equipment(calculator1)
        equipment3.simulate(4)
        equipment4.simulate(6)
    }
}
