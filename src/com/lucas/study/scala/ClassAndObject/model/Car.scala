package com.lucas.study.scala.ClassAndObject.model

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午12:01
 * To change this template use File | Settings | File Templates.
 */
class Car(val year: Int) {
  private var milesDriven: Int = 0

  def miles() = milesDriven

  def drive(distance: Int) {
    milesDriven += Math.abs(distance)
  }
}

object Car {
  def main(args: Array[String]) = {
    val car = new Car(2009)
    println("Car Made In Year " + car.year)
    println("Miles driven " + car.miles())
    println("Driven for 10 miles")
    car.drive(10)
    println("Miles driven " + car.miles())
  }
}
