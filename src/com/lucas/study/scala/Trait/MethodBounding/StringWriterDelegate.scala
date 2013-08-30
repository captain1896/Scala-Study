package com.lucas.study.scala.Trait.MethodBounding

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午2:30
 * To change this template use File | Settings | File Templates.
 */
class StringWriterDelegate extends Writer {
    val writer = new java.io.StringWriter

    def writeMessage(message: String) = writer.write(message)

    override def toString(): String = writer.toString
}
