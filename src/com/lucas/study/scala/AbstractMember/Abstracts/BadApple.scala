package com.lucas.study.scala.AbstractMember.Abstracts

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
abstract class BadApple extends Fruit{
  //def v:String //錯誤：不能用'def'重寫'val'
  def m:String //
}
