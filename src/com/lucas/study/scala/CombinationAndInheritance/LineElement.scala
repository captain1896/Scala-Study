package com.lucas.study.scala.CombinationAndInheritance

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午2:10
 * To change this template use File | Settings | File Templates.
 */

/**
 * 由於LineElement拓展了ArrayElement，並且ArrayElement的構造器帶一個參數（Array[String]）,
 * 因此LineElement需要傳遞給超類的住構造器一個參數。
 * 要調用超類的構造器，只要簡單地把要傳遞的參數或參數列表放在超類的類名之後的括號裏面即可。
 * 例如，LineElement類傳遞參數Array(s)到ArrayElement的主構造器，把它放在超類ArrayElement的類名後面的括號里:
 * ...extends ArrayElement(Array(s) ...
 *
 * 新的繼承層級是：
 *    Element
 *      |
 * ArrayElement <--Array[String]
 *      |
 * LineElement
 *
 * @param s
 */
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length

  override def height = 1
}

//scala要求，若子類成員所有重寫了父類的具體成員則必須帶有這個修飾符；
//若成員實現的是同名的抽象成員時，則這個修飾符是可選的；
//若成員並未重寫或者實現什麽其他基類（我們通常稱為超類）裏面的成員則禁用這個修飾符。
//由於LineElement類的height和width重寫了Element類的具體成員定義，因此需要override修飾符。
