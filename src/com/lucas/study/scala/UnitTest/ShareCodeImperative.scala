package com.lucas.study.scala.UnitTest

import org.scalatest.{BeforeAndAfter, Suite}
import java.util.ArrayList
import java.util

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 下午6:41
 * To change this template use File | Settings | File Templates.
 */
class ShareCodeImperative extends Suite with BeforeAndAfter {
    var list: ArrayList[Integer] = _

    override def before(fun: => Any) {
        list = new util.ArrayList[Integer]()
    }

    override def after(fun: => Any) {
        list = null
    }

    def testListEmptyOnCreate() {
        expect(0, "Expected size to be 0") {
            list.size()
        }
    }

    def testGetOnEmptyList() {
        intercept[IndexOutOfBoundsException] {
            list.get(0)
        }
    }
}
