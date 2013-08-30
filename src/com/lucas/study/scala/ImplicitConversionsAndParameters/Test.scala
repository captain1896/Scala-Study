package com.lucas.study.scala.ImplicitConversionsAndParameters

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 上午11:36
 * To change this template use File | Settings | File Templates.
 */
object Test {
    def main(args: Array[String]) {
        val existsDigicNumber = test
        println(existsDigicNumber)
        testPrintWithSpaces
    }

    def test(): Boolean = {
        stringWrapper("abc123") exists (_.isDigit)
        //result
    }

    /**
     * 隱式轉換，隱式轉換的普通的方法，唯一特殊的地方是它以修飾符implicit開始，你也可以通過應用這個方法把String轉換為RandomAccessSeq子類：
     * 隱式操作，能讓你在顯存類中添加新的方法。然而，隱式操作，遠遠比拓展方法更為簡潔。
     * 隱式轉換的另一個優點是它支持目標類型的轉換，所為目標類型，是指在代碼的某個點需要的類型。
     *
     */
    implicit def stringWrapper(s: String) = {
        new RandomAccessSeq[Char] {
            def length = s.length

            def apply(i: Int) = s.charAt(i)
        }
    }

    def printWithSpaces(seq: RandomAccessSeq[Char]) = seq mkString (" ")

    def testPrintWithSpaces() {
        println("--printWithSpaces(stringWrapper(\"xyz\")---")
        val str1 = printWithSpaces(stringWrapper("xyz"))
        println(str1)
        println("--printWithSpaces(stringWrapper(\"xyz\")---")
        val str2 = printWithSpaces(stringWrapper("xyz"))
        println(str2)
    }

}

