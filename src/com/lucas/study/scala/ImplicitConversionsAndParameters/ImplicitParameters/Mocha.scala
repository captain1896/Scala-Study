package com.lucas.study.scala.ImplicitConversionsAndParameters.ImplicitParameters

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */


/**
 * 隱式操作是功能強大，代碼凝練的Scala特性。本章展示了Scala的關於隱式操作的規則，並同時說明了若干適用於隱式操作的通用編程場景。
 * 如果要給一些警告的話，隱式操作若過於頻繁使用，代碼會變得晦澀難懂。因此，在考慮添加新的隱式轉換之前，請首先問自己能否通過其他手段，
 * 諸如，繼承，混入組合或者方法重載，達到同樣的目的。如果所有這些都不能成功，並且你感覺你的代碼仍有一些繁複和榮譽，那麼隱式操作或許正好能幫到你。
 */
object Mocha extends App {

  class PreferredDrink(val preference: String)

  implicit val pref = new PreferredDrink("mocha")

  def enjoy(name: String)(implicit drink: PreferredDrink) {
    print("welcome," + name)
    print(".Enjoy a ")
    print(drink.preference)
    println("!")
  }

  enjoy("reader")

}
