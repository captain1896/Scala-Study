package com.lucas.study.scala.ImplicitConversionsAndParameters.myImplicits

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午12:30
 * To change this template use File | Settings | File Templates.
 */
object MyConversions {
  implicit def stringWrapper(s: String): RandomAccessSeq[Char] = {
        new RandomAccessSeq[Char] {
          def length = s.length
          def apply(i:Int) = s.charAt(i)
        }
  }

  implicit def intToString(x: Int): String = {
    x.toString
  }

}
