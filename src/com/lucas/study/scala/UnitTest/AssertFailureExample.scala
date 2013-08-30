package com.lucas.study.scala.UnitTest

import org.scalatest.Suite
import java.util

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 下午6:08
 * To change this template use File | Settings | File Templates.
 */
class AssertFailureExample extends Suite {
    def testAssertFailure() {
        assert(2 === List().size, "Unexpected size of List")
    }

    def testAssertFailure2() {
        expect(2, "Unexpected List size") {
            List().size
        }
    }

    def testGetOnEmptyList() {
        try {
            val list = new util.ArrayList[Integer]()
            list.get(0)
            fail("Expected exception for getting element from empty list")
        } catch {
            case ex: IndexOutOfBoundsException => //: ) success
        }
    }

    def testGetOnEmptyList_Concise() {
        val list = new java.util.ArrayList[Integer]()
        intercept(classOf[IndexOutOfBoundsException], "Expected excetion for getting element from empty list") {
            //list.get(0)
            throw new IndexOutOfBoundsException
        }

        //
    }
}
