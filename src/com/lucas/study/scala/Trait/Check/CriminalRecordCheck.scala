package com.lucas.study.scala.Trait.Check

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午12:25
 * To change this template use File | Settings | File Templates.
 */
trait CriminalRecordCheck extends Check {
    override def check(): String = "Check Criminal Records..." + super.check()
}
