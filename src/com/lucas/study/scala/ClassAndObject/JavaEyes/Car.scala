package com.lucas.study.scala.ClassAndObject.JavaEyes

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-17
 * Time: 下午5:26
 * To change this template use File | Settings | File Templates.
 */
class Car(override val id: Int, override val year: Int, val fuelLevel: Int) extends Vehicle(id, year) {
  override def toString(): String = super.toString() + ",Fuel Level:" + fuelLevel
}
