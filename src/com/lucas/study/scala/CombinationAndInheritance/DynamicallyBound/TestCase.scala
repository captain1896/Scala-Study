package com.lucas.study.scala.CombinationAndInheritance.DynamicallyBound

import com.lucas.study.scala.CombinationAndInheritance.Element

//import com.lucas.study.scala.CombinationAndInheritance.DynamicallyBound.Element
/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-25
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */
object TestCase {
    def main(args: Array[String]) {
        invokedDemo(new ArrayElement)
        invokedDemo(new LineElement)
        invokedDemo(new UniformElement)
        //Uniform沒有重寫demo,所以他繼承了超類Element中的demo的實現。
        //因此，當對象是UniformElement類時，Element的實現就是應該被調用的demo的正確實現。

        val arr1 = Array[String]("Element1", "Element2", "Element3", "Element4")
        val arr2 = Array[String]("Q1", "Q2", "Q3", "Q4")
        val arr3 = arr1 ++ arr2

        /**
         * 也可以這樣寫：arr3.foreach(s => print(s + "\t"))
         * 在這個例子中，Scala解析器可以推斷arg的類型是String,因為String是調用doreach的那個數組的元素類型。
         * 如果想表達得更加明確，可以給arg加上類型名，
         * 不過這樣做需要把參數部份寫在括號里（總之，這是語法的正規形式，不寫在括號裏面，編譯會報錯）
         * 這是個函數，所以要加括號（），是函數的參數列表
         * 書寫函數字面量的時候，如果參數列表的參數個數有兩個以上，一定要有括號。
         * 如果參數列表的參數個數是一個的時候，可以省略括號，此時，也要省略參數類型，否則會拋錯；
         * 如果要把參數的類型也明確表示出來，那麼一定要用完整的形式，即要把參數名和參數類型放在括號裏面；
         */
        arr3.foreach((s: String) => print(s + "\t"))
        arr3.foreach(s => println(s + "\t"))

        println("-----Factory Method Of Element------")

        //create ArrayElement
        Element.elem(Array("ArrayOne", "ArrayTwo", "ArrayThree"))
        //create UniformElement
        Element.elem('A', 256, 256)
        //create LineElement
        Element.elem("I'm Factory Method Test!")

    }

    /**
     * 函數的結構：
     * 定義函數開始
     * |     函數名括     號中的參數列表  函數返回值類型
     * |      |               |           |
     * def     max    (x : Int , y : Int): Int = {
     * ----------函數體
     * }
     *
     *
     * 函數字面量結構：
     *
     * 括號裏面的函數參數     右箭頭  函數體
     * |                    |      |
     * （x:  Int ,   y:  Int） =>   x + y
     *
     * @param e
     */

    def invokedDemo(e: Element) {
        e.demo()
    }
}
