package com.lucas.study.scala.CombinationAndInheritance

import Element.elem

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 上午11:53
 * To change this template use File | Settings | File Templates.
 */
abstract class Element {
  def contents: Array[String]

  //定義無參數方法
  def height: Int = contents.length

  //定義無參數方法，這些無參數方法不同於：def width(): Int，一下的方法定義中不含括號：
  //def width: Int,這種無參數的方法在Scala裏面非常普遍
  //相對地，帶有空括號的方法定義，如def height():Int,被稱為空括號方法（empty-paren method）
  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    elem(this.contents ++ that.contents)

  def beside(that: Element): Element =
    elem(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2

    )

  /*def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      var right = elem(' ', w - width - left.widen, height)
      left beside this beside right
    }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      var bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }*/

  override def toString = contents mkString "\n"

}

object Element {

  private class ArrayElement(val contents: Array[String]) extends Element {
    println("ArrayElement created!")
  }

  private class LineElement(s: String) extends Element {
    val contents = Array(s)

    override def width = s.length

    override def height = 1

    println("LineElement created!")
  }

  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
    private val line = ch.toString * width

    def contents = Array.make(height, line)

    println("UniformElement created!")
  }

  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)

  def elem(line: String): Element =
    new LineElement(line)
}

