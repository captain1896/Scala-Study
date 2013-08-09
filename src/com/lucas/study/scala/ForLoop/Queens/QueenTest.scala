package com.lucas.study.scala.ForLoop.Queens

import com.lucas.study.scala.ForLoop.testcase.Person

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-9
 * Time: 下午2:41
 * To change this template use File | Settings | File Templates.
 */
object QueenTest {
  var p: Person = _

  def queens(n: Int): List[List[(Int, Int)]] = {
    def placeQueens(k: Int): List[List[(Int, Int)]] =
      if (k == 0)
        List(List())
      else
        for {
          queens <- placeQueens(k - 1)
          column <- 1 to n
          queen = (k, column)
          if (isSafe(queen, queens))
        } yield queen :: queens

    placeQueens(n)
  }

  def isSafe(queen: (Int, Int), queens: List[(Int, Int)]) =
    queens.forall(q => !inCheck(queen, q))

  def inCheck(q1: (Int, Int), q2: (Int, Int)) = {
    q1._1 == q2._1 //同一行
    q1._2 == q2._2 //同一列
    (q1._1 - q2._1).abs == (q1._2 - q2._2).abs //對角線
  }


  def main(args: Array[String]) {
    println("")
    val result = queens(8)
    result.foreach(println _)
    println(result.length)
  }

}
