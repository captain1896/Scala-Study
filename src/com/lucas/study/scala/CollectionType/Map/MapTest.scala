package com.lucas.study.scala.CollectionType.Map

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午5:55
 * To change this template use File | Settings | File Templates.
 */
object MapTest {
  def main(args: Array[String]) {
    test()
  }

  def test() {
    val feeds = Map[String, String]("Andy Hunt" -> "blog.toolshed.com",
      "Dave Thomas" -> "pradave.pragprog.com",
      "Dan Steinberg" -> "dimsumthinking.com/blog"
    )

    val filterNameStartWithD = feeds.filterKeys(_ startsWith "D")
    println("# of Filtered = " + filterNameStartWithD)

    val filterNameStartWithDAndBlogInFeed = feeds.filter {
      element => val (key, value) = element
        (key startsWith ("D")) && (value contains "blog")
    }

    println("# of feeds with auth name D* and blog in URL:" +
      filterNameStartWithDAndBlogInFeed)

    println("Get Andy's Feed:" + feeds.get("Andy Hunt"))
    println("Get Bill's Feed:" + feeds.get("Bill Who"))
    try {
      println("Get Andy's Feed Using apply():" + feeds("Andy Hunt"))
      println("Get Bill's Feed :" + feeds("Bill Who"))
    } catch {
      case ex: java.util.NoSuchElementException => println("Not Found!")
    }

    val newFeeds1 = feeds.updated("Venkat Subramaniam", "agiledeveloper.com.blog")
    println("Venkt's blog in original feeds :" + feeds.get("Venkat Subramaniam"))
    println("Venkt's blog in original feeds :" + newFeeds1.get("Venkat Subramaniam"))

    val mutableFeeds = scala.collection.mutable.Map("Scala Book Forums" -> "forums.pragprog.com/forums/87")
    mutableFeeds("Groovy Book Forums:") = " mutableFeeds.size"
    println("Number of forums:" + mutableFeeds.size)

  }
}
