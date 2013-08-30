package com.lucas.study.scala.CollectionType

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午3:42
 * To change this template use File | Settings | File Templates.
 */
object RichStringTest {
    def main(args: Array[String]) {
        val hasUpperCaseOrNot = hasUpperCase("Robert Frost")
        println(hasUpperCaseOrNot)
    }

    def hasUpperCase(s: String) = {
        s.exists(_.isUpperCase)
    }


}
