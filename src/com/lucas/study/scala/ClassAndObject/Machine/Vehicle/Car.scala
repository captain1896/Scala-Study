package com.lucas.study.scala.ClassAndObject.Machine.Vehicle

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 上午11:20
 * To change this template use File | Settings | File Templates.
 */
class Car extends Vehicle {
    def start() {
        checkingEngine() //It's accessible
    }

    def tow(car: Car) {
        car.checkingEngine() //OK
    }

    def tow(vehicle: Vehicle) {
        //派生類只可以訪問本類內的protexted成員,
        //vehicle.checkingEngine()
    }

}
