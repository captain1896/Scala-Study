package com.lucas.study.scala.CollectionType

import scala.collection.mutable.{Map, SynchronizedMap, HashMap}
import scala.collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午5:40
 * To change this template use File | Settings | File Templates.
 */
object Mapmaker {
  def main(args: Array[String]) {
    val map = Mapmaker.makeMap
    println(map.get("PSD"))
    map ++ List("US" -> "Washington", "Paris" -> "France", "Japan" -> "Tokyo")
    println(map("US"))
    println(map("New Zealand"))

    val synchroSet = Mapmaker.makeSet
    synchroSet += "Hello"
    println("@overide synchroSet.toString=" + synchroSet)
  }

  def makeMap: Map[String, String] = {
    new HashMap[String, String] with SynchronizedMap[String, String] {
      override def default(key: String) = "why do you want to know?"
    }
  }

  def makeSet:mutable.HashSet[String] = {
    new mutable.HashSet[String] with mutable.SynchronizedSet[String] {
      override def toString() = "why do you want to know?"
    }
  }


}
