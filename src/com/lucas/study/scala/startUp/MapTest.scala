package com.lucas.study.scala.startUp

import scala.collection.mutable.Map
//import scala.collection.immutable.Map
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-19
 * Time: 上午10:31
 * To change this template use File | Settings | File Templates.
 */
object MapTest {
  def main(args:Array[String]){
    mutableMapPlayer()
    immutableMapPlayer()
   }
  def mutableMapPlayer() {
    val treasureMap = Map[Int,String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on the ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
  }

  def immutableMapPlayer() {
    val romanNumberal = Map(
      1 ->"I",2 -> "II",3 -> "III",4 ->"IV",5 -> "V"
    )
    println(romanNumberal(4))
  }
}
