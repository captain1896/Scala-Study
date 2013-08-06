package com.lucas.study.scala.CollectionType

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午6:35
 * To change this template use File | Settings | File Templates.
 */
object TupleTest {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val longWord = longestWord(Array[String]("Hello", "Matrix", "OGNL", "Hadoooop"))
    println(longWord)
    val longWord2 = longestWord("Hey, World!I swear that I'm love 成寶靜 forever!".split(" "))
    println(longWord2._1 + "|" + longWord2._2)
  }

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  }

}
