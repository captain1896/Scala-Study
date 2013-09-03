package com.lucas.study.scala.UnitTest

import org.scalatest.FunSuite
import com.lucas.study.scala.CombinationAndInheritance.Element.elem

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-3
 * Time: 上午10:23
 * To change this template use File | Settings | File Templates.
 */
class ElementSuite2 extends FunSuite {
    test("elem result should have passed width") {
        val ele = elem('x', 2, 3)
        assert(ele.width == 2)
    }

    test("test for sure ") {
        val boolean = true
        assert(boolean == true)
    }
}
