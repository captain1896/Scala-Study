package com.lucas.study.scala.startUp

import scala.collection.mutable.Set
import scala.collection.immutable.HashSet

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-18
 * Time: 下午7:43
 * To change this template use File | Settings | File Templates.
 */
object SetTest {
    def main(args: Array[String]) {
        test()
        test2()
        hashSetTest()
    }

    def test() {
        var jetSet = Set("Boeing", "Airbus")
        jetSet += "Lear"
        println(jetSet.contains("Cessna"))

    }

    def test2() {
        var jetSet2 = Set("AMERICAN", "CHINA", "EURO");
        jetSet2 += "JAPAN"
        println(jetSet2)
    }

    def hashSetTest() {
        var hashSet = HashSet("Tomatoes", "Chilies")
        println(hashSet + "Coriander")
    }
}
