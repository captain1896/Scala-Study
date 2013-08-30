package com.lucas.study.scala.CaseClassAndPatternMatching.PatternMatching

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 下午2:21
 * To change this template use File | Settings | File Templates.
 */
object MatchLiterals {
    def main(args: Array[String]) {
        test
    }

    def activity(day: String) {
        day match {
            case "Sunday" => println("Eat,Sleep,repeat...")
            case "Saturday" => println("Hangout with Friends")
            case "Monday" => println("...code for fun...")
            case "Friday" => println("...read a good book...")
            case _ => println("Not Match!")
        }

    }

    def test() {
        List("Monday", "Sunday", "Saturday", "Tuesday").foreach(activity
        )
    }
}
