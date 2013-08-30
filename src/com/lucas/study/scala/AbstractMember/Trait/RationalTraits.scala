package com.lucas.study.scala.AbstractMember.Trait

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 下午2:49
 * To change this template use File | Settings | File Templates.
 */
trait RationalTraits {
    val numerArg: Int
    val denomArg: Int
    require(denomArg != 0)
    private val g = gcd(numerArg, denomArg)
    val numer = numerArg / g
    val denom = denomArg / g

    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }

    override def toString = numer + "/" + denom
}
