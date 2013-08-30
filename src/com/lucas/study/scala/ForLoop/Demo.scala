package com.lucas.study.scala.ForLoop

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-9
 * Time: 下午4:02
 * To change this template use File | Settings | File Templates.
 */
object Demo {
    def map[A, B](xs: List[A], f: A => B): List[B] = for (x <- xs) yield f(x)

    def flatMap[A, B](xs: List[A], f: A => List[B]): List[B] = for (x <- xs; y <- f(x)) yield y

    def filter[A](xs: List[A], p: A => Boolean): List[A] = for (x <- xs if p(x)) yield x

}
