package com.lucas.study.scala.Extrators.Email

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-10
 * Time: 下午8:59
 * To change this template use File | Settings | File Templates.
 */
/**
 * Scala里的抽取器是具有unapplay成員方法的對象。
 * unapply方法的目的是爲了匹配并分解值。
 * 通常抽取器對象還會定義構建值的對偶方法，apply()，但並非必須。
 */
object Domain {
  //注入方法（可選）
  def apply(parts: String*): String = parts.reverse.mkString(".")

  //抽取方法（必須要有）
  def unapply(whole: String): Option[Seq[String]] = Some(whole.split("\\.").reverse)

}
