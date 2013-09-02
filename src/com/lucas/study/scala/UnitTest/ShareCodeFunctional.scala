package com.lucas.study.scala.UnitTest

import org.scalatest.Suite
import java.util

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 下午6:54
 * To change this template use File | Settings | File Templates.
 */
class ShareCodeFunctional extends Suite {
    def withList(testFunction: (java.util.ArrayList[Integer]) => Unit) {
        val list = new util.ArrayList[Integer]()
        try {
            testFunction(list)
        } finally {
            // do something
        }

    }

    def testListEmptyOnCreate() {
        withList {
            list => expect(0, "Expected size to be 0") {
                list.get(0)
            }
        }
    }


    def testGetOnEmptyList() {
        withList {
            list => intercept[IndexOutOfBoundsException] {
                list.get(0)
            }
        }
    }


}
