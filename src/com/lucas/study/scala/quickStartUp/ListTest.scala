package com.lucas.study.scala.exercise.charter3

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-18
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
object ListTest {
    def main(args: Array[String]) {
        //numberPlayer()
        //numberMarriage()
        //testListNil()
        testListAllCommonUsage()
    }

    def numberPlayer() {
        val oneTwoThree = List(1, 2, 3, 4)
        val oneTwo = List(1, 2)
        val threeFour = List(3, 4)
        val oneTwoThreeFour = oneTwo ::: threeFour
        println(oneTwoThree)
        println("" + oneTwo + "and" + threeFour + " were not mutated.")
        println("" + oneTwoThreeFour + "is a new List")
    }

    def numberMarriage() {
        val twoThree = List(2, 3)
        val oneTwoThree = 1 :: twoThree
        val oneTwoThreeFour = oneTwoThree.::(4)
        println(oneTwoThree)
        println(oneTwoThreeFour)

    }

    def testListNil() {
        val oneTwoThreeFourFive = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
        println(oneTwoThreeFourFive)
        println(oneTwoThreeFourFive.reverse)
    }

    def testListAllCommonUsage() {
        println("-------------")
        var fStart = List("Football", "Facebookl", "FBIl")
        println(fStart.forall(s => s.startsWith("F") && s.endsWith("l")))
        val nilLsit = List()
        println(nilLsit.isEmpty)

        val freeList = List[String]("Cool", "tool", "rule")
        println(freeList)
        println(freeList.reverse)

        val thrill = "will" :: "fill" :: "until" :: Nil
        println("thrill=" + thrill + " | " + "thrill.reverse=" + thrill.reverse)

        val mergeList = List("a", "b") ::: List("c", "d")
        println(mergeList)
        //返回在thrill列表上索引为2（基于0）的元素("until")
        println(thrill(2))
        //计算长度为4的String元素的个数
        //println(thrill.count(s => s.length.==(4)))
        //println(thrill.drop(2))
        //println(thrill.dropRight(2))
        println(thrill.exists(s => s == "until"))
        println(thrill.exists(s => s == "until"))
        println("thrill elements\'s length equals 4 :" + thrill.filter(s => s.length == 4))
        //判断thrill里面的元素是否都是以"ll"结束
        println(thrill + "|" + thrill.forall(s => s.endsWith("ll")))
        //
        println(thrill.foreach(s => print(s)))
        println(thrill.foreach(print))
        println("thrill's head=" + thrill.head)
        println("thrill's head=" + thrill.init)
        println("thrill isEmpty=" + thrill.isEmpty)
        println("thrill's last element=" + thrill.last)
        println(thrill.length)
        println(thrill.map(s => s + "y"))
        println(thrill.mkString(","))
        println(thrill.remove(s => s.length == 4))
        println(thrill.reverse)
        println(thrill.sort((s, t) => s.charAt(0).toLowerCase < t.charAt(0).toLowerCase))
        println(thrill.tail)


    }
}
