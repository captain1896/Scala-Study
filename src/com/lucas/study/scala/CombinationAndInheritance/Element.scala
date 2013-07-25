package com.lucas.study.scala.CombinationAndInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 上午11:53
 * To change this template use File | Settings | File Templates.
 */
abstract class Element {
  def contents:Array[String]
  //定義無參數方法
  def height: Int = contents.length
  //定義無參數方法，這些無參數方法不同於：def width(): Int，一下的方法定義中不含括號：
  //def width: Int,這種無參數的方法在Scala裏面非常普遍
  //相對地，帶有空括號的方法定義，如def height():Int,被稱為空括號方法（empty-paren method）
  def width:Int = if (height == 0 ) 0 else contents(0).length

}
