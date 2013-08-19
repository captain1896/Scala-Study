package com.lucas.study.scala.ClassAndObject.model.Marker

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
class Marker(val color: String) {
  println("Creating " + this)

  override def toString(): String = "marker color: " + color
}


object Marker {
  private val markers = Map[String, Marker]("red" -> new Marker("red"), "green" -> new Marker("green"), "blue" -> new Marker("blue"))

  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def primaryColors = "red,green,blue"

  def apply(color: String) = if (markers.contains(color)) markers(color) else null

  def main(args: Array[String]) = {
    println(Marker.getMarker("blue"))
    println(Marker.getMarker("blue"))
    println(Marker.getMarker("green"))
    println(Marker.getMarker("red"))

    println("Primary Color are :" + Marker.primaryColors)
    println(Marker("green"))
    println(Marker("red"))
  }
}

