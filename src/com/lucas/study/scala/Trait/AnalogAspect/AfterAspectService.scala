package com.lucas.study.scala.Trait.AnalogAspect

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午5:15
 * To change this template use File | Settings | File Templates.
 */
trait AfterAspectService extends Service {
  abstract override def doAction() {
    super.doAction()
    println("After Aspect ends!")
  }
}
