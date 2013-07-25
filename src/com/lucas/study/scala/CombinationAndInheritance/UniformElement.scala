package com.lucas.study.scala.CombinationAndInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午2:44
 * To change this template use File | Settings | File Templates.
 */

/**
 * 多態和動態綁定
 *
 * 類層次結構
 *            Element
 *              \
 *        ------------------
 *       |                  |
 *   UniformElement     ArrayElement
 *                          |
 *                     LineElement
 *
 * @param ch
 * @param width
 * @param height
 */
class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
  private val line = ch.toString * width

  def contents = Array.make(height, line)
}
