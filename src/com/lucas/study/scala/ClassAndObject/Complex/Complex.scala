package com.lucas.study.scala.ClassAndObject.Complex

import java.util

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 上午10:16
 * To change this template use File | Settings | File Templates.
 */
class Complex(val real: Int, val imaginary: Int) {

    def +(operand: Complex): Complex = {
        println("Calling +")
        new Complex(real + operand.real, imaginary + operand.imaginary)
    }

    def *(operand: Complex): Complex = {
        println("Calling *")
        new Complex(real * operand.real - imaginary * operand.imaginary, real * operand.imaginary + imaginary * operand.real)
    }

    override def toString(): String = {
        real + (if (imaginary < 0) "" else "+") + imaginary + "i"
    }
}


object Complex {
    def main(args: Array[String]) = {
        test1
        test2
    }

    def test1() {
        val c1 = new Complex(1, 4)
        val c2 = new Complex(2, -3)
        val c3 = new Complex(2, 2)
        println(c1 + c2 * c3)
    }

    def test2() {
        var a, b, c = 1
        val re1 = (a = b) //a = b ,賦值之後的結果是re1的類型是Unit,而不是rel = 1 (Int)
        println(a = b)

        val list1 = new util.ArrayList[Int];
        {
            println("creating list1")
        }

        val list2 = new util.ArrayList[Int];
        {
            println("Creating list2")
        }

        println(list1.getClass)
        println(list2.getClass)

    }
}