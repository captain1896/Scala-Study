package com.lucas.study.scala.Trait.AnalogAspect

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午5:14
 * To change this template use File | Settings | File Templates.
 */
trait BeforeAspectService extends Service {
    abstract override def doAction() {
        println("Before service starts !")
        super.doAction()
    }
}
