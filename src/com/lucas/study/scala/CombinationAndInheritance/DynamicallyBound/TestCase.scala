package com.lucas.study.scala.CombinationAndInheritance.DynamicallyBound

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */
object TestCase {
   def main(args:Array[String]) {
     invokedDemo(new ArrayElement)
     invokedDemo(new LineElement)
     invokedDemo(new UniformElement)
     //Uniform沒有重寫demo,所以他繼承了超類Element中的demo的實現。
     //因此，當對象是UniformElement類時，Element的實現就是應該被調用的demo的正確實現。
   }

    def invokedDemo(e:Element) {
      e.demo()
    }
}
