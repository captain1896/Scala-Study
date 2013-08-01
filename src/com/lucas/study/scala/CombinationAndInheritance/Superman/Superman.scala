package com.lucas.study.scala.CombinationAndInheritance.Superman

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-1
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
class Superman(names: String) extends Man(names) with BeatMonster with DeepIntoTheGroup with Fly
with RescueHumanBeing with NeverDie with LiftTrainOrBus with NoNeedToEatFood {
}
