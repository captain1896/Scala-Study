package com.lucas.study.scala.Trait

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-27
 * Time: 下午10:51
 * To change this template use File | Settings | File Templates.
 */
trait CharSequence {
    def charAt(index: Int): Char

    def length: Int

    def subSequence(start: Int, end: Int): CharSequence

    def toString(): String
}
