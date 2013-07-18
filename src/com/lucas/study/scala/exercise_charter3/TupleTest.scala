package com.lucas.study.scala.exercise_charter3

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-18
 * Time: 下午5:19
 * To change this template use File | Settings | File Templates.
 */
object TupleTest {
  def main(args:Array[String]) {
    firstTuple()
    footballTeam()
  }

  def firstTuple() {
    val pair = (20130718,"Lucas@lucas.com")
    println(pair)
    println(pair._1)
    println(pair._2)

    val mulPairValue = ('A','B','C',123,"Str1","Str2")
    println(mulPairValue._1)
    println(mulPairValue._2)
    println(mulPairValue._3)
    println(mulPairValue._4)
    println(mulPairValue._5)
    println(mulPairValue._6)
  }

  /**
   * List all famous football team in European
   */
  def footballTeam(){
    val ENGLADN_BIG_FOUR = ("Liverpool","Arsenal","chelsea","Manchester Unit")
    val SCOTLAND = ("Celtic","Scottish Team")
    val ITALY = ("Rome","Lazio","AC Milan","Inner Milan","Juventus")
    val SPAIN = ("REAL MADRID","BARCELONA")
    val GERMAN = ("BAYER MUNICH","ERUOPEAN CUP","FAMOUS_FOOTBALL_PLAYER's Name:Franz")
    var EURO_FOOTBALL_TEAM = (ENGLADN_BIG_FOUR,SCOTLAND,ITALY,SPAIN,GERMAN)
    println(EURO_FOOTBALL_TEAM)
  }


}
