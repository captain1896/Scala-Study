package com.lucas.study.scala.CombinationAndInheritance.Superman

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-1
 * Time: 上午11:45
 * To change this template use File | Settings | File Templates.
 */
object ManTest extends App{
  val man = new Man("Normal Man")
  val superMan = new Superman("Ortmann")
  println("-- Normal Man Ability ---" + man.name)
  man.eat()
  man.sleep()

  println("-- Super Man Ability ----" + superMan.name)
  superMan.beatMonster()
  superMan.deepIntoTheGroup()
  superMan.liftTrainOrBus()
  superMan.neverDie()
  superMan.fly()
  superMan.rescueHumanBeing()
  superMan.noNeedToEatFood()

}
