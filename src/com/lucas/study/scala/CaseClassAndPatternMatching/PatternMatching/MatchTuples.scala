package com.lucas.study.scala.CaseClassAndPatternMatching.PatternMatching

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
object MatchTuples {
    def processCoordinates(input: Any) {
        input match {
            case (a, b) => println("Processing (%d,%d)...", a, b)
            case "done" => println("done")
            case _ => null
        }
    }

    def processItems(items: List[String]) {
        items match {
            case List("apple", "ibm") => println("Apples and IBMs")
            case List("red", "blue", "white") => println("stars and stripes")
            case List("red", "blue", _*) => println("colors red , blue ,...")
            case List("apple", "orange", otherFruits@_*) => println("apples,oranges,and " + otherFruits)
            case _ => println("Not Match!")
        }
    }

    def process(input: Any) {
        input match {
            case (a: Int, b: Int) => println("Processing (int,int)...")
            case (a: Double, b: Double) => print("Processing (double,double)")
            case msg: Int if (msg > 10000) => println("Processing int > 10000")
            case msg: Int => println("Processing string...")
            case _ => println("Can't handle %s ...", input)
        }
    }

    def test() {
        processCoordinates((34, 89))
        processCoordinates("done")
        processCoordinates(12321)

        processItems(List("apple", "ibm"))
        processItems(List("red", "blue", "green"))
        processItems(List("red", "blue", "white"))
        processItems(List("apple", "orange", "grapes", "dates"))

        process((34.34, 43.3))
        process(0)
        process(20000)
        process(2.222)
    }


    def main(args: Array[String]) {
        test()
    }
}
