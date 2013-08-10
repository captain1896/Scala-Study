package com.lucas.study.scala.Extrators.Email

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-10
 * Time: 下午8:25
 * To change this template use File | Settings | File Templates.
 */
class ConcreteEmail extends AbstractEmail {
  def isEmail(s: String): Boolean = true

  def domain(s: String): String = s

  def user(s: String): String = s
}
