package com.lucas.study.scala.CollectionType.ListTest

import com.lucas.study.scala.ForLoop.Friends.Person

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-22
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
object ListTest {
  def main(args: Array[String]) {
    test
    test2
  }

  def test() {
    val feeds = List("blog.toolshed.com", "pragdave.pragprog.com", "dimsumthinking.com/blog")
    println("First Feed:" + feeds.head)
    println("Second Feed:" + feeds(1))

    val prefixedList = "forums.pragprog.com/forums/87" :: feeds
    println("First Feed In Prefixed:" + prefixedList.head)


    val feedsWithForums = feeds ::: List("forums.pragprog.com/forums/87", "forums.pragprog.com/forums/55")
    println("First feed in feeds with forum:" + feedsWithForums.head)
    println("Last feed in feeds with forum:" + feedsWithForums.last)

    val appendedList = feeds ::: List("agiledeveloper.com/blog")
    println("last feed in Appended:" + appendedList.last)

    println("All Feeds have com :" + feeds.forall(_ contains "com"))
    println("All feeds have dave :" + feeds.forall(_ contains "dave"))
    println("Any feeds has dave :" + feeds.exists(_ contains "dave"))
    println("Any feeds has dave :" + feeds.exists(_ contains "dave"))
    println("Feed URL length:" + feeds.map(_.length).mkString(","))

    val total = feeds.foldLeft(0) {
      (total, feed) => total + feed.length
    }

    println("Total length of feed urls:" + total)

    val total2 = (0 /: feeds) {
      (total, feed) => total + feed.length
    }

    println("Total length of feed urls:" + total2)

    val total3 = (0 /: feeds) {
      _ + _.length
    }

    println("Total length if feed URLs:" + total3)
  }

  def test2() {
    for (i <- 1 to 3) {
      println("ho" + i)
    }


    val result = for (i <- 1 to 10) yield i * 2
    println(result)

    //這個for 表達式可以讀作"i * 2的容器，其中i是給定範圍內的成員且i是偶數"
    val doubleEven = for (i <- 1 to 10; if i % 2 == 0) yield i * 2
    println(doubleEven)


    val doubleEven2 = for {
      i <- 1 to 10
      if i % 2 == 0
    } yield i * 2

    println(doubleEven2)

    val friends = List(Person("Brain", "Sletten"), Person("Neal", "Ford"),
      Person("Scott", "Davis"), Person("Stuart", "Halloway"))

    val lastNames = for (friend <- friends; lastName = friend.lastName)
    yield lastName

    println("Last Names:" + lastNames.mkString(","))

    for (i <- 1 to 3; j <- 4 to 6) {
      print("[" + i + "," + j + "] ")
    }

  }

}
