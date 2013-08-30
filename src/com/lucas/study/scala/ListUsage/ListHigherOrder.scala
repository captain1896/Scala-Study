package com.lucas.study.scala.ListUsage

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-5
 * Time: 下午7:20
 * To change this template use File | Settings | File Templates.
 */
object ListHigherOrder {
    def main(args: Array[String]) {
        test
        testFolder
        testRightFolder
        testReverseLeft
        testSort
        listObjectMethod
    }

    def test() {
        val addOneList = List(1, 2, 3, 4).map(_ + 1)
        println(addOneList)

        val words = List("the", "quick", "broken", "fox")
        val lengthList = words.map(_.length)
        println(lengthList)

        val wordsMap = words.map(_.toList)
        println(wordsMap)

        val wordsMappp = words.map(_.toList)
        val str: String = words.toString()
        str.toList
        val bbc = words.toString()
        val wordsFlatmap = words.flatMap(_.toList)
        println(wordsFlatmap)
        val range = List.range(1, 5)
        val rangeFlatMap = range.flatMap(i => List.range(1, i).map(j => (i, j)))
        println(range)
        println(rangeFlatMap)
        val range2 = List.range(1, 2)
        println(range2)

        val numbers = List(1, 2, 3, 4, 5)
        val evens = numbers.filter(_ % 2 == 0)
        val odds = numbers.filter(_ % 2 != 0)
        println(numbers + "|" + evens + "|" + odds)
        val wordLengthEq3 = words.filter(_.length == 3)
        println(wordLengthEq3)
        var sum = 0
        numbers.foreach(sum += _)
        println(sum)
        val partitionList = numbers.partition(_ % 2 == 0)
        println(partitionList)
        val tar = numbers.find(_ % 2 == 0)
        val tar2 = numbers.find(_ > 0)
        println(tar2)
        if (tar2.isDefined) {
            println(tar2.get)
        }

        val takeWhileList = List(1, 2, 4, -5, 6, 5) takeWhile (s => s <= 2)
        println(takeWhileList)
        val dropWhileList = words.dropWhile(s => s.startsWith("t"))
        println(dropWhileList)
        testHasZeroRow
    }

    def hasZeroRow(m: List[List[Int]]) =
        m exists (row => row.forall(e => e == 0))

    def testHasZeroRow() {
        val matrix = List(List(0, 0, 10, 0, 0), List(0, 0, 0, 20, 0), List(0, 0, 0, 0, 0))
        val result = hasZeroRow(matrix)
        println(result)
    }

    def sum(xs: List[Int]): Int = (0 /: xs)(_ + _)

    def product(xs: List[Int]): Int = (1 /: xs)(_ * _)

    //List的折叠列表測試
    def testFolder() {
        println(sum(List(22, 22, 22)))
        println(product(List(10, 10, 10)))
    }

    def sumRight(xs: List[Int]): Int = (xs :\ 0)(_ + _)

    def productRight(xs: List[Int]): Int = (xs :\ 1)(_ * _)

    def testRightFolder() {
        println(sumRight(List(1, 1, 1)))
        println(productRight(List(2, 2, 2)))
    }

    def reverseLeft[T](xs: List[T]) =
        (List[T]() /: xs) {
            (ys, y) => y :: ys
        }


    def testReverseLeft() {
        val afterReverse = reverseLeft(List(0, 1, 2, 3, 4, 5))
        println(afterReverse)
    }

    def testSort() {
        val list = List(1, -3, 4, 2, 6)
        val sortList = list.sort(_ < _)
        println(sortList)
        val rangeList1 = List.apply(1, 2, 3, 4, 5)
        val rangeList2 = List.range(9, 1, -3)
        val rangeList3 = List.range(15, 0, -2)
        println(rangeList1)
        println(rangeList2)
        println(rangeList3)
    }

    def listObjectMethod() {
        val n1 = List.make(5, "Ooops")
        println(n1)
        val zipped = "abcde".toList zip List(1, 2, 3)
        println(zipped)

        val n2 = List.unzip(zipped)
        println(n2)

        val xss = List(List(List('a', 'b'), List('c'), List('e', 'f', 'g')), List(List('a', 'b'), List('c'), List('e', 'f', 'g')))
        val flattenList = List.flatten(xss)
        println(flattenList)

        val concatList = List.concat(List('a', 'b'), List('c'), List('d', 'e', 'f'))
        println(concatList)

        val v1 = List.map2(List(10, 20), List(3, 4, 5))(_ * _)
        val v2 = List.forall2(List("abc", "de"), List(3, 2))(_.length == _)
        val v3 = List.exists2(List("abc", "de"), List(3, 2))(_.length != _)
        println("v1=" + v1)
        println("v2=" + v2)
        println("v3=" + v3)

    }
}