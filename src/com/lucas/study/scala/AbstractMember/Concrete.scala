package com.lucas.study.scala.AbstractMember

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 上午11:50
 * To change this template use File | Settings | File Templates.
 */
class Concrete extends Abstract {
  type T = String
  def transform(x:String) = x + x
  val initail = "hi"
  var current = initail
}
