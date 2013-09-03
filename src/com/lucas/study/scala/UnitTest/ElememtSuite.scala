package com.lucas.study.scala.UnitTest

import org.scalatest.Suite
import com.lucas.study.scala.CombinationAndInheritance.Element.elem

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-3
 * Time: 上午10:17
 * To change this template use File | Settings | File Templates.
 */
class ElememtSuite extends Suite {
    def testUintforElement() {
        val ele = elem('X', 2, 3)
        assert(ele.width == 2)
    }

}
