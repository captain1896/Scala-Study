package com.lucas.study.scala.ListUsage

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-5
 * Time: 下午7:20
 * To change this template use File | Settings | File Templates.
 */
object ListHigherOrder {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val addOneList = List(1, 2, 3, 4).map(_ + 1)
    println(addOneList)

    val words = List("the", "quick", "broken", "fox")
    val lengthList = words.map(_.length)
    println(lengthList)

    val wordsMap = words.map(_.toList)
    println(wordsMap)

    val wordsMappp = words.map(_.toList)
    val str: String = words.toString()
    str.toList
    val bbc = words.toString()
    val wordsFlatmap = words.flatMap(_.toList)
    println(wordsFlatmap)
    val range = List.range(1, 5)
    val rangeFlatMap = range.flatMap(i => List.range(1, i).map(j => (i, j)))
    println(range)
    println(rangeFlatMap)
    val range2 = List.range(1, 2)
    println(range2)

    val numbers = List(1, 2, 3, 4, 5)
    val evens = numbers.filter(_ % 2 == 0)
    val odds = numbers.filter(_ % 2 != 0)
    println(numbers + "|" + evens + "|" + odds)
    val wordLengthEq3 = words.filter(_.length == 3)
    println(wordLengthEq3)
    var sum = 0
    numbers.foreach(sum += _)
    println(sum)
    val partitionList = numbers.partition(_ % 2 == 0)
    println(partitionList)
    val tar = numbers.find(_ % 2 == 0)
    val tar2 = numbers.find(_ > 0)
    println(tar2)
    if (tar2.isDefined) {
      println(tar2.get)
    }

    val takeWhileList = List(1, 2, 4, -5, 6, 5) takeWhile (s => s <= 2)
    println(takeWhileList)
    val dropWhileList = words.dropWhile(s => s.startsWith("t"))
    println(dropWhileList)
    testHasZeroRow
  }

  def hasZeroRow(m:List[List[Int]]) =
    m exists (row => row.forall(e => e == 0))

  def testHasZeroRow() {
    val matrix = List(List(0,0,10,0,0),List(0,0,0,20,0),List(0,0,0,0,0))
    val result = hasZeroRow(matrix)
    println(result)
  }
}
