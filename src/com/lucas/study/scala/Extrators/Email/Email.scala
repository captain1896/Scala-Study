package com.lucas.study.scala.Extrators.Email

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-10
 * Time: 下午8:31
 * To change this template use File | Settings | File Templates.
 */
object Email {

  //注入方法
  def apply(user: String, domain: String) = user + "@" + domain

  //抽取方法（規定的）
  def unapply(str: String): Option[(String, String)] = {
    val parts = str.split("@")
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }

  def main(args: Array[String]) {
    val result1 = unapply("John@epfl.ch")
    println(result1)
    val result2 = unapply("John Doe")
    println(result2)

    val user = "Lucas"
    val domain = "gmail.com"
    val result3 = Email.unapply(Email.apply(user, domain))
    println(result3)

    val params = Email.unapply("Lucas@gmail.com")
    val paValue1 = params.get._1
    val paValue2 = params.get._2
    val result4 = Email.apply(paValue1, paValue2)
    println(result4)
  }
}
