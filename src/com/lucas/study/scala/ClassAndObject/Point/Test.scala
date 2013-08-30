package com.lucas.study.scala.ClassAndObject.Point

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 上午11:03
 * To change this template use File | Settings | File Templates.
 */
object Test {
    def main(args: Array[String]) {
        val p = new Point(12, 12)
        p.move(12, 12)

        val l = new Location(1, 2, 3)
        l.move(10, 10, 10)
    }
}
