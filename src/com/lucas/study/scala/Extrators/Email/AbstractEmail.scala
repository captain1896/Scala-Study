package com.lucas.study.scala.Extrators.Email

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-10
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
abstract class AbstractEmail {
  def isEmail(s: String): Boolean

  def domain(s: String): String

  def user(s: String): String
}
