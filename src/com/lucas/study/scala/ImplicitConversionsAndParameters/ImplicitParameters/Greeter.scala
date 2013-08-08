package com.lucas.study.scala.ImplicitConversionsAndParameters.ImplicitParameters

import com.lucas.study.scala.ImplicitConversionsAndParameters.ImplicitParameters.JoesPreds.prompt
import com.lucas.study.scala.ImplicitConversionsAndParameters.ImplicitParameters.JoesPreds.drink

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
object Greeter {

  def greet(name: String)(implicit prompt: PreferredPrompt, drink: PreferredDrink) {
    println("Welcome," + name + ".The system is ready!")
    print("But while you work,")
    println("why not enjoy a cup of" + drink.preference + "?")
    println(prompt.preference)
  }

  def test() {
    val bobsPrompt = new PreferredPrompt("relax>")
    //因為prompt,drink現在都是以單一標誌符的形式處於作用於之內，所以現在可以用它們來顯式讀補充最後的參數列表。
    Greeter.greet("Bob")(prompt, drink)

    //由於現在已經符合隱式參數的所有規則，所以也可以通過省略最後的參數列表的方式讓Scala編譯器為你補充prompt和drink
    Greeter.greet("Joe")
  }

  def main(args: Array[String]) {
    test
    testMaxListUpBound
  }


  def maxListUpBound[T](elements: List[T])(implicit orderer:T => Ordered[T]): T = elements match {
    case List() =>
      throw new IllegalArgumentException("empty list!")

    case List(x) => x

    case x :: rest =>
      val maxRest = maxListUpBound(rest)
      if(x > maxRest) x
      else maxRest
  }

  def testMaxListUpBound() {
    val max1 =  maxListUpBound(List(1,34,54,3,2,65,77,8,99,11,25,806,100000000))
    println(max1)

    val max2 =  maxListUpBound(List(1.5,5.2,10.7,3,1544343))
    println(max2)

    val max3 =  maxListUpBound(List("one","two","three"))
    println(max3)
  }


}
