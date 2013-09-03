package com.lucas.study.scala.UnitTest

import org.scalatest.junit.JUnit3Suite
import org.scalatest.prop.Checkers
import com.lucas.study.scala.CombinationAndInheritance.Element.elem
import org.scalacheck.Prop._

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-3
 * Time: 上午10:31
 * To change this template use File | Settings | File Templates.
 */
class ElementSuite extends JUnit3Suite with Checkers {
    def testUnitforElement() {
        check((w: Int) => w > 0 ==> (elem('x', w, 3).width == w))
        check((h: Int) => h > 0 ==> (elem('x', 2, h).width == h))
    }
}
