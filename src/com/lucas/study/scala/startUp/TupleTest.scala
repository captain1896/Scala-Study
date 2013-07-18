package com.lucas.study.scala.startUp

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
    val namePair = (20130718,"Lucas@lucas.com")
    println(namePair)
    println(namePair._1)
    println(namePair._2)

    val lovelyAsiaCountry = ("Thailand","Vietnam",'C',123,"Cambodia","Bhutan")
    println(lovelyAsiaCountry._1)
    println(lovelyAsiaCountry._2)
    println(lovelyAsiaCountry._3)
    println(lovelyAsiaCountry._4)
    println(lovelyAsiaCountry._5)
    println(lovelyAsiaCountry._6)
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
