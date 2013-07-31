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
  }

  /**
   * Scala為可選值定義了一個名為Option的保准類型。
   * 這個值有兩種形式，可以是Some(x)形式，其中x是實際值，火鶴也可以是None對象，代表缺失值。
   * Scala集合類的某些標準操作會產生可選值，例如，Scala的Map的get方法會在發現指定鍵的情況下產生Some(value),在沒有找到指定的時候產生None。
   * 列舉如下：
   */
  def testOption() {
    val capitals = Map[String, String]("France" -> "Paris", "Japan" -> "Tokyo")
    println(capitals.get("France"))  //Some(x)
    println(capitals get "China")    //None

    println(show(capitals.get("Japan")))
    println(show(capitals.get("France")))
    println(show(capitals.get("China")))
    println(show(capitals.get("North Pole")))
  }
  //分離可選值最通常的辦法是通過模式匹配
  def show(x:Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  def useMatchingPattern() {
    val myTuple = (123,"abc")
    val (number,string) = myTuple
    println("number=" + number + "|" + "string=" + string)
  }
}
