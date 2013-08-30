package com.lucas.study.scala.ClassAndObject.Point

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 上午10:59
 * To change this template use File | Settings | File Templates.
 */
class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int) {
        x = x + dx
        y = y + dy
        z = z + dz

        println("Moved started!")
        println("Location x is :" + x)
        println("Location x is :" + y)
        println("Location x is :" + z)
        println("Point's new Location is (" + x + "," + y + "," + z + ") after moved ! ")
    }

    println("Location:(" + x + "," + y + "," + z + ") is created!")
}
