package com.lucas.study.scala.CaseClassAndPatternMatching.Option

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-31
 * Time: 下午12:11
 * To change this template use File | Settings | File Templates.
 */
class TestOption {

}

object TestOption {
  def main(args: Array[String]) {
    testOption
    useMatchingPattern
    testOptionUsage
    testOptionUsage2
  }

  /**
   * Scala為可選值定義了一個名為Option的保准類型。
   * 這個值有兩種形式，可以是Some(x)形式，其中x是實際值，火鶴也可以是None對象，代表缺失值。
   * Scala集合類的某些標準操作會產生可選值，例如，Scala的Map的get方法會在發現指定鍵的情況下產生Some(value),在沒有找到指定的時候產生None。
   * 列舉如下：
   */
  def testOption() {
    val capitals = Map[String, String]("France" -> "Paris", "Japan" -> "Tokyo")
    println(capitals.get("France")) //Some(x)
    println(capitals get "China") //None

    println(show(capitals.get("Japan")))
    println(show(capitals.get("France")))
    println(show(capitals.get("China")))
    println(show(capitals.get("North Pole")))
  }

  //分離可選值最通常的辦法是通過模式匹配
  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  def useMatchingPattern() {
    val myTuple = (123, "abc")
    val (number, string) = myTuple
    println("number=" + number + "|" + "string=" + string)
  }

  def testOptionUsage() {
    val footballPlayerMap: Map[String, String] = Map[String, String]("Zidane" -> "France", "David Beckham" -> "England")
    val zidan = footballPlayerMap.get("Zidane") //some
    val beckham = footballPlayerMap.get("David Beckham") //some
    val kaka = footballPlayerMap.get("kaka") //none
    println("zidan.isDefined:" + zidan.isDefined + "|zidan.isEmpty:" + zidan.isEmpty + "|zidan.get:" + zidan.get + "!")
    println(beckham)
    println("beckham.isDefined:" + beckham.isDefined + "|beckham.isEmpty:" + beckham.isEmpty + "|beckham.get:" + beckham.get + "!")
    println(kaka)
    println("kaka.isDefined:" + kaka.isDefined + "|kaka.isEmpty:" + kaka.isEmpty + "|kaka.get!")

  }

  def testOptionUsage2() {
    val testMap: Map[String, String] = Map("Nintama Rantarou" -> "忍者亂太郎", "Touch" -> "棒球小子", "Slam Dunk" -> "男兒當入樽")
    val nintama: Option[String] = testMap.get("Nintama Rantarou")
    val touch: Option[String] = testMap.get("Bingo")
    val slamDunk: Option[String] = testMap.get("Slam Dunk")

    nintama match {
      case Some(name) => println("Nintama Rantarou:" + name)
      case None => println("Do Nothing")
    }

    touch match {
      case Some(name) => println("Touch:" + name)
      case None => println("棒球小子，Sorry, It's None!")
    }

    slamDunk match {
      case Some(name) => println("Slam Dunk:" + name)
      case None => println("Sorry,Slam Dunk isEmpty!")
    }

    for (nin <- nintama) {
      println("nin.length=" + nin.length)
    }

    for (tou <- touch) {
      println("tou.legth=" + tou.length)
    }

    val vx = List("Hello,", "Goodbye,", "Oh,My ")
    val vxNew = vx.map(_ + "World!")
    for (v <- vxNew) println(v)
    vxNew.foreach(println)

    vx.map("|Lucas " + _).map(_ + ".length=").foreach(println)
    vx.map("length=" + _.length).foreach(println)

  }


}
