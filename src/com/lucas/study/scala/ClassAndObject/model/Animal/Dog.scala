package com.lucas.study.scala.ClassAndObject.model.Animal

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午6:05
 * To change this template use File | Settings | File Templates.
 */
class Dog(override val name: String) extends Pet(name) {
    override def toString() = name + " is " + "BUCKING !"
}

object Dog {
    def main(args: Array[String]) {
        testDogWorkedWith
    }

    //將子類的實例的容器賦值給基類容器的能力成為協變(cocariance),將超類實例的容器賦給子類容器的能力成為逆變(contravariance)
    def workWithPets[T <: Pet](pets: Array[Pet]) {
        pets.foreach(println _)
    }

    def testDogWorkedWith() {
        val dogs = Array[Pet](new Dog("Buck"), new Dog("Rover"))
        workWithPets(dogs)
    }
}
