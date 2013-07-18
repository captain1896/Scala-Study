package com.lucas.study.scala.charter3

import java.math.BigInteger

/**
  * Created with IntelliJ IDEA.
  * User: Lucas
  * Date: 13-7-18
  * Time: 下午12:17
  * To change this template use File | Settings | File Templates.
  */
object ArrayTest {
   def main(args:Array[String]){
     Array()
   }

   def Array() {
     val big = new BigInteger("12345")
     println(big)

     var greetings = new Array[String](3)
     greetings(0) = "hello"
     greetings(1) = ","
     greetings(2) = "world!\n"

     //first print type
     println("------1-----")
     greetings.foreach(print)
     println("------2-----")
     greetings.foreach(s => print(s))
     println("------3-----")
     greetings.foreach((s:String) => print(s))
     println("------4-----")
     for(i <- 0 to 2) {
       print(greetings(i))
     }

   }
 }
