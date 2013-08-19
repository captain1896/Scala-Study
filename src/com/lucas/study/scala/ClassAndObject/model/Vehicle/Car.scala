package com.lucas.study.scala.ClassAndObject.model.Vehicle

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午2:22
 * To change this template use File | Settings | File Templates.
 */
class Car(override val id: Int, override val year: Int, var fuelLevel: Int) extends Vehicle(id, year) {
  override def toString(): String = {
    super.toString() + " Fuel Level: " + fuelLevel
  }
}
