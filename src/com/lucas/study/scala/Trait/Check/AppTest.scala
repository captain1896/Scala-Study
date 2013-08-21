package com.lucas.study.scala.Trait.Check

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午12:28
 * To change this template use File | Settings | File Templates.
 */
object AppTest extends App {
  val apartmentApplication = new Check with CreditCheck with CriminalRecordCheck
  println(apartmentApplication.check())

  val employmentApplication = new Check with CriminalRecordCheck with EmploymentCheck
  println(employmentApplication check())
  println(new Check {
    override def toString() = "It is only a test ! "
  })
}
