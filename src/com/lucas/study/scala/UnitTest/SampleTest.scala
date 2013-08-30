package com.lucas.study.scala.UnitTest

import org.junit.Test

/**/

import java.util.ArrayList
import org.junit.Assert._


/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-30
 * Time: 下午4:36
 * To change this template use File | Settings | File Templates.
 */
class SampleTest {
    @Test def listAdd() {
        val list = new ArrayList[String]()
        list.add("Milk")
        list.add("Sugar")

        assertEquals(2, list.size())
    }
}
