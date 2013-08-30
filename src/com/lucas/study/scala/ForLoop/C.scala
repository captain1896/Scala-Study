package com.lucas.study.scala.ForLoop

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-9
 * Time: 下午5:06
 * To change this template use File | Settings | File Templates.
 */
abstract class C[A] {

    //map函數的參數是可以把集合的元素類型A轉換為另外的類型B的函數，它可以產生與C類型相同但元素類型為B的新集合
    def map[B](f: A => B): C[B]

    //flatMap方法的擦書是從類型A轉換到B的C集合的函數，并產生B的C集合
    def flatMap[B](f: A => C[B]): C[B]

    //filter方法的參數是可以把元素的類型A的集合轉換為Boolean的論斷函數，它產生與被調用對象一直的集合
    def filter(p: A => Boolean): C[A]

    //foreach方法的參數是從A到Unit的函數，并產生Unit結果
    def foreach(b: A => Unit): Unit

}
