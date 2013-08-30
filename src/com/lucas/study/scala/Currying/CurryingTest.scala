package com.lucas.study.scala.Currying

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-15
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
object CurryingTest {
    def main(args: Array[String]) {
        /*  println(add1(1, 2, 3))
          println(add2(1)(2, 3))
          println(add3(1)(2)(3))*/
        //testForLoop
        //testList
        //testTuple
        testListfoldLeft
    }

    def add1(x: Int, y: Int, z: Int): Int = x + y + z

    def add2(x: Int)(y: Int, z: Int): Int = x + y + z

    def add3(x: Int)(y: Int)(z: Int): Int = x + y + z


    def testForLoop(): Unit = {
        val list1 = List[Int](1, 2, 3)
        val list2 = List[String]("A", "B", "C")
        for (a <- list1) {
            println(a)
        }

        for (a <- list1; b <- list2) {
            println(a + b)
        }

        val tuples = for {
            a <- list1
            if a >= 2
            b <- list2
            length = b.length
        } yield (a, b, length)
        println(tuples)
    }


    def testList() {
        val fruit = List[String]("APPLE", "ORANGE", "BANANA")
        println(fruit.tail)
        println(fruit.head)

        println(fruit.init)
        println(fruit.last)
        println(fruit.reverse)

        // make a list via the companion object factory
        val days = List[String]("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY")
        val when = "AM" :: "PM" :: Nil
        val daysTimes = days ::: when
        println(daysTimes)


        val matchResult = List() match {
            case firstDay :: otherDays => println("The first element is " + firstDay)
            case Nil => println("It seems there is no week day!")
        }

        println(Nil.equals(List()))
    }


    def testTuple() {
        val str = List[String]("Aladin", "Mikey")
        val strWithIndex = str.zipWithIndex
        println(strWithIndex)
        val indexAndString = for {
            s <- strWithIndex
            value = s._1
            index = s._2
        } yield (index, value)

        println(indexAndString)
        println(str.mkString("|"))
        val it = str.elements
        while (it.hasNext)
            println(it.next)

        val newStrList = List[String]("bbc", "news", "report").map(s => s.toUpperCase())
        println(newStrList)
        val newStrList2 = newStrList.map(s => s.toList.reverse)
        println(newStrList2)

        println(newStrList.flatMap(_.toList))
        def convertToOptionType(str: String): Option[String] = if (str.contains("E")) Some(str) else None
        val convertStr = newStrList.map(s => convertToOptionType(s))
        println(convertStr.flatMap(o => o.getOrElse("EMPTY")))

        val multiList = List[List[String]](List[String]("@@", "@@", "@@"), List[String]("##", "##", "##"), List[String]("&&", "&&", "&&"))
        println(multiList.flatMap(l => l.map(_.contains("@@"))))

        val mutilTypeList = List(List("QQ", "", ""), List("QQ", "", ""), List("QQ", "", ""))
        println(List.flatten(mutilTypeList))
        ("Thank you!" * 3).foreach(print)

    }

    def testListfoldLeft() {
        val feeds = List[String]("blog.toolshed.com", "pragdave.pragdave.com", "dimsumthinking.com/blog")

        val total = feeds.foldLeft(0) {
            (total, feed) => total + feed.length
        }

        println("total length of feed urls:" + total)
    }

}
