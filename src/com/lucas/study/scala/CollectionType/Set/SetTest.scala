package com.lucas.study.scala.CollectionType.Set

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午3:16
 * To change this template use File | Settings | File Templates.
 */
object SetTest {
  def main(args: Array[String]) {
    test
    test2
  }

  def test() {
    val colors1 = Set[String]("Blue", "Green", "Red")
    var colors2 = colors1
    println("colors1(color):" + colors1)

    colors2 += "Black"
    println("colors2:" + colors2)
    println("colors1:" + colors1)
  }

  def test2() {
    val feeds1 = Set[String]("blog.toolshed.com", "pragdave.pragprog.com",
      "pragmactic-osxer.blogspot.com", "vita-contemplelative.blogspot.com")

    val feeds2 = Set[String]("blog.toolshed.com", "martinfowler.com/bliki")

    val blogSpotFeeds = feeds1.filter(_ contains "blogspot")
    println("blogSpotFeeds: " + blogSpotFeeds.mkString(","))


    val mergeFeeds = feeds1 ++ feeds2
    println("# of mergeFeeds.size=" + mergeFeeds.size + ",# Of mergeFeeds=" + mergeFeeds)

    //對兩個集合進行交集運算
    val commonFeeds = feeds1 ** feeds2
    println("common feeds:" + commonFeeds.mkString(","))

    val urls = feeds1.map("http://" + _)
    println(urls)
    val arrs = urls.toArray
    println("arrs(0)=" + arrs(0))


    println("Refresh Feeds:")
    feeds1 foreach (feed => println("Refreshing " + feed))


  }

}
