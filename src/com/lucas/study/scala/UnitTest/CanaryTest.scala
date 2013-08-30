package com.lucas.study.scala.UnitTest

import org.scalatest.Suite
import java.util


/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 */
class CanaryTest extends Suite {
    def testOk() {
        assert(true)
    }

    def testListEmpty() {
        val list = new util.ArrayList[Integer]()
        assert(0 == list.size())
    }

    def testListAdd() {
        val list = new util.ArrayList[Integer]()
        list.add(1)
        list add 4
        assert(2 == list.size())
    }
}

