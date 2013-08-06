package com.lucas.study.scala.StateObject

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-6
 * Time: 下午6:53
 * To change this template use File | Settings | File Templates.
 */
object Test {
  def main(args: Array[String]) {
    test
  }

  def test() {
    val account = new BankAccount
    val result1 = account.deposit(100)
    println("account.deposit(100),account=" + account.balance + ",result=" + result1)
    val result2 = account.withdraw(80)
    println("account.withdraw(80),account=" + account.balance + ",result=" + result2)
    val result3 = account.withdraw(80)
    println("account.withdraw(80),account=" + account.balance + ",result=" + result3)
  }
}

