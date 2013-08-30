package com.lucas.study.scala.Trait.AnalogAspect

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午5:17
 * To change this template use File | Settings | File Templates.
 */
class ServiceImpl extends Service {
    override def doAction() = {
        println("do Action!")
    }
}

object ServiceImpl {
    def main(args: Array[String]) = {
        val service = new ServiceImpl with BeforeAspectService with AfterAspectService
        service.doAction()
    }
}
