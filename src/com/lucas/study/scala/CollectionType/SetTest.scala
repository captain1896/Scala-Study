package com.lucas.study.scala.CollectionType

import scala.collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
object SetTest {
    def main(args: Array[String]) {
        test
        allMethod
    }

    def test() {
        val text = "see spot run. Run,Spot. Run!"
        val wordsArray = text.split("[ !,.]+")
        println(wordsArray)
        val words = mutable.Set.empty[String]
        for (word <- wordsArray)
            words += word.toLowerCase
        println(words)
    }

    def allMethod() {
        val nums = mutable.Set(1, 2, 3)
        println(nums)
        val newNums = nums + 5
        println(newNums)
        val nums2 = nums - 3
        println(nums2)
        val nums3 = nums ++ List(5, 6)
        println(nums3)
        val nums4 = nums -- List(1, 2)
        println(nums4)
        val nums5 = nums ** mutable.Set(1, 3, 5, 7)
        println(nums5)
        println(nums.size)
        val numsBoolean = nums.contains(3)
        println(numsBoolean)


        val words = mutable.Set.empty[String]
        words += "the"
        println(words)
        words -= "the"
        println(words)
        words ++= List("do", "re", "me")
        println(words)
        words --= List("do", "re")
        println(words)
        words.clear()
        println(words)

    }

}
