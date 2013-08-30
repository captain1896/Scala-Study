package com.lucas.study.scala.ScalaClassHierarchy

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-26
 * Time: 下午1:16
 * To change this template use File | Settings | File Templates.
 */
object Hierarchy {
    def main(args: Array[String]) {
        AnyValHierarchyTestCase()
        AnyRefHierarchyTestCase()
        testIsEqual()
        testError
    }

    /**
     * 每個類都繼承自Any
     * 根類Any有兩個子類：AnyVal和AnyRef。AnyVal是Scala里每一個內建值類的父類。
     * 有九個這樣的值類：Byte，Short，Char，Int，Long，Float、Double、Boolean 和Unit。
     * 其中前面八個對應到Java的基本類型，他們的值在運行時表示成Java的基本類型的值。
     * Scala裏這些類的實例都寫成字面量，例如：42是Int的實例，`x`是Char的實例，false是Boolean的實例。
     * 不能用new創造這些類的實例。
     * 另一個值，Unit，大約對應於Java的Void類型；
     * 被用作不反悔任何有趣結果的方法的結果類型。
     * Unit只有一個實例值，寫成（）
     * 值類，以方法的形式支持通用的數學和布爾操作符。
     * 例如，名為+和*的方法，Boolean有名為||和&&的方法。
     * 值類也從Any繼承所有的方法。
     */

    def AnyValHierarchyTestCase() = {
        // new Int,這樣實例化一個Int是不可以的。
        //不能使用new創造這些類的實例。
        //這點由一個“小技巧”保證，值類都被定義為既是抽象的，同時又是final的。

        println(42.toString)
        println(42.hashCode())
        println(42.equals(42))
        println(42.to(213))
        println(-42.abs)
        println(42.until(213))
        println(42 max 43)
        println(42 min 23)

    }

    //類Any的另一個子類是類AnyRef。這個是Scala裏面所有引用類型（Reference Class）的基類。
    //正如前面提到的，在Java平臺上AnyRef實際就是Java.lang.Object的別名。因此Java裏寫的類和Scala里寫的都繼承自AnyRef。
    //你可以認為java.lang.Object是Java平臺上實現AnyRef的方式。
    //因此，儘管在Java平臺上的Scala程序里Object和AnyRef的使用是可交換的，推薦的風格是在任何地方都只使用AnyRef。
    //Scala類與Java類的不同在於它們還繼承自一個名為ScalaObejct的特別的記號特質（Special marker Trait）。
    //只想要通過ScalaObject包含的Scala編譯器定義和實現的方法讓Scala程序的執行更高效。
    // 到現在為止，ScalaObject只包含一個方法，名為$tag,在內部使用以加速模式匹配


    def AnyRefHierarchyTestCase() = {
        val a: AnyRef = new AnyRef
        println(a)
    }

    def isEqual(x: Int, y: Int) = {
        println("isEqual(x: Int, y: Int) invoked!")
        x == y
    }

    def isEqual(x: AnyVal, y: AnyVal) = {
        println("isEqual(x: Any, y: Any) invoked!")
        x == y
    }


    def testIsEqual() = {
        println("isEqual(421,421)=" + isEqual(421, 421))
        println("isEqual(421,421)=" + isEqual(421, 421))
        //println(Array[String]("NBA").eq(Array[String]("RNR")))

        val xString = new String("abc")
        val yString = new String("abc")
        println("xString == yString =>" + (xString == yString))
        println("xString eq yString=" + (xString eq yString))
        println("xString ne yString=" + (xString ne yString))
        println("StringToString =" + (new String("abc") == new String("abc")))
    }


    /**
     * Scala底層類型：Scala.Null和Scala.Nothing.
     * 它們是用統一的方式處理Scala面向對象類型系統的某些“邊界情況”的特殊類型
     * Null類是null引用對象的類型，他是每個引用類的子類。
     * Null不兼容值類型，例如，你不能吧null值付給整數變量：
     *
     */


    def testBaseHierarchy() = {
        //val i :Int = null  //編譯的時候，編譯器編譯到這裡會報錯
    }

    def error(message: String): Nothing = {
        throw new RuntimeException(message)
    }

    def divide(x: Int, y: Int): Int = {
        if (y != 0) x / y
        else error("Can't divide by Zero, 淚奔了 !!")
    }

    def testError = divide(1, 0)

    /**
     * Nothing類型在Scala的類層次的最底端；他是任何其他類型的子類型。
     * 然而根本沒有這個類型的任何值。
     * Nothing的一個用處是它標明了不正常的終止。
     * 例如，Scala的標準庫中的Predef對象中一個error方法，error的返回類型是Nothing，告訴用戶方法不是正常返回的（代之以拋出異常）。
     * 因為Nothing是任何其他類型的子類，所以你可以非常靈活地使用error這樣的方法，定義如下。
     */
}