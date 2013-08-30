package com.lucas.study.scala.CollectionType

import scala.collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午4:29
 * To change this template use File | Settings | File Templates.
 */
object MapTest {
    def main(args: Array[String]) {
        test
        testAllMethod
    }

    def test() {
        val count = countWords("See Spot run!Run,Spot.Run!")
        println(count)
    }


    def countWords(text: String) = {
        val counts = mutable.Map.empty[String, Int]
        for (rawWord <- text.split("[ ,!.]+")) {
            val word = rawWord.toLowerCase
            val oldCount =
                if (counts.contains(word)) counts(word)
                else 0
            counts += (word -> (oldCount + 1))
        }

        counts
    }


    def testAllMethod() {
        val nums = mutable.Map("i" -> 1, "ii" -> 2)
        println(nums)
        val nums1 = nums + ("vi" -> 6)
        println(nums1)
        val nums2 = nums - "ii"
        println(nums2)
        val nums3 = nums ++ List("iii" -> 3, "v" -> 5)
        println(nums3)
        val nums4 = nums -- List("i", "ii")
        println(nums4)
        val numsSize = nums.size
        println(numsSize)

        val words = mutable.Map.empty[String, Int]
        words += ("one" -> 1)
        println(words)
        words -= "one"
        println(words)
        words ++= List("one" -> 1, "two" -> 2, "three" -> 3)
        words --= List("one", "two")
        println(words)


    }


}
