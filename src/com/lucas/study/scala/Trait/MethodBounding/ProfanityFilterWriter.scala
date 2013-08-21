package com.lucas.study.scala.Trait.MethodBounding

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
trait ProfanityFilterWriter extends Writer {
  abstract override def writeMessage(message: String) = super.writeMessage(message.replace("stupid", "s-----"))
}
