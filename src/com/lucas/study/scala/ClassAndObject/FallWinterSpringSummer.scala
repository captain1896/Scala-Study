package com.lucas.study.scala.ClassAndObject
import CheckSumAccumulator.calculate
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-19
 * Time: 下午4:19
 * To change this template use File | Settings | File Templates.
 */
object FallWinterSpringSummer extends Application{
  for (season <- List("fall","winter","spring"))
    println(season + ":" + calculate(season))
}
