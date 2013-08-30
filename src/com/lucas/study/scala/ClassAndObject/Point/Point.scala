package com.lucas.study.scala.ClassAndObject.Point

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 上午10:49
 * To change this template use File | Settings | File Templates.
 */
class Point(val xc: Int, val yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
        x = x + dx
        y = y + dy

        println("Moved started!")
        println("Point's x location:" + x)
        println("Point's location:" + y)
        println("Point's new Location is (" + x + "," + y + ") after moved!")
    }

    println("Point:(" + x + "" + "," + y + ") created!")
}