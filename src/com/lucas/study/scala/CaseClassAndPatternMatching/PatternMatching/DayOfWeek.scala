package com.lucas.study.scala.CaseClassAndPatternMatching.PatternMatching

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 下午2:27
 * To change this template use File | Settings | File Templates.
 */
object DayOfWeek extends Enumeration {
    val SUNDAY = Value("Sunday")
    val MONDAY = Value("Monday")
    val TUESDAY = Value("Tuesday")
    val WEDNESDAY = Value("Wednesday")
    val THURSDAY = Value("Thursday")
    val FRIDAY = Value("Friday")
    val SATURDAY = Value("Saturday")

    def activity(day: DayOfWeek.Value) {
        day match {
            case DayOfWeek.SUNDAY => println("Eat,Sleep,Repeat...")
            case DayOfWeek.MONDAY => println("Hangout With Friends")
            case _ => println("...Code For Fun...")
        }
    }

    def test() {
        activity(DayOfWeek.SUNDAY)
        activity(DayOfWeek.MONDAY)
        activity(DayOfWeek.SATURDAY)
        activity(DayOfWeek.WEDNESDAY)
    }

    def main(args: Array[String]) {
        test
    }
}
