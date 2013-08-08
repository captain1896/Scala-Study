package com.lucas.study.scala.ListUsage.ImplementingLists

import java.lang.Integer
import java.lang.System

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午5:01
 * To change this template use File | Settings | File Templates.
 */
object ListTest {
  def main(args: Array[String]) {
    test
    testList
  }

  //類型參數前的+號特指列表是協變的，因為這一屬性。比如，List[Int]類型可以誒類型為List[Any]的變量
  def test() {
    val xs = List(1, 2, 3)
    println(xs)

    val ys: List[Any] = xs
    println(ys)

    val i = 123
    System.out.println(i)
  }

  /**
   * List是抽象類，列表並非Scala的“內建”語言結構，它們由List抽象類定義在Scala包之中，並且包含了兩個子類---::和Nil。
   * ::是子；類，Nil是子對象，不過依照原文，譯作子類。
   * List是抽象類，所以不能通過調用空的List構造器定義元素。例如，"new List"是不合法的表達式。
   * 所有列表的操作都可以用以下三種基本方法定義：
   * def isEmpty:Boolean     ，判斷列表是否為空
   * def head:T              ，取出第一個元素
   * def tail:List[T]        ，返回除了第一個元素之外的列表
   *
   * 這三種方法在List中都是抽象的，它們被定義在子對象Nil和子類::中。
   * List的層級結構
   *
   *         List[+T]
   *    <<sealed abstract>>
   *           \
   *     ----------------
   *     \               \
   *     ::               Nil
   *  <<final case>>   <<case object>>
   *
   */

  def testList() {

    //合法操作
    val v = scala.List
    //非法表達式，編譯器報錯
    //val v = new scala.List


    val nil = Nil
    val emptyList = List()
    //nil.head        //拋出NoSuchElementException異常
    //nil.tail        //拋出NoSuchElementException異常
    nil.isEmpty       //true

    //emptyList.head  //拋出NoSuchElementException異常
    //emptyList.tail  //拋出NoSuchElementException異常
    emptyList.isEmpty  //true

    val numbers = List("ONE","TWO","THREE","FOUR")
    val newNumbers = "ZERO"::numbers
    println(newNumbers)

    val vcs1 = List("Git","BitKeeper","Monotone")
    val vcs2 = List("SVN","VSS")
    val vcs = vcs1 ::: vcs2
    println(vcs)




  }

}
