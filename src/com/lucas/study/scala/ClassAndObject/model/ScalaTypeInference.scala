package com.lucas.study.scala.ClassAndObject.model

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 下午5:38
 * To change this template use File | Settings | File Templates.
 */
object ScalaTypeInference {

    //如果用等號(=)定義方法，Scala就可以推演返回類型。否則，它就會假設方法是一個void方法。
    //如果方法定義或者方法體很小，能夠濃縮為一個表達式，就可以省去{}，就像method3()一樣。
    //對於，僅僅執行最小檢查的簡單的getter和setter而言，這點非常有用。
    //總的來說，使用=，讓Scala推演方法的類型會好一些，這樣可以少擔心一件事，讓構建良好的類型推斷為我們服務。
    //返回值類型為Void
    def method1() {
        6
    }

    //返回值類型為Int
    def method2() = {
        6
    }

    //返回值類型為Int
    def method3() = 6

    //返回值類型為Double
    def method4: Double = 6

    def printMethodInfo(methodName: String) {
        println("The return type of" + methodName + "is" + getClass.getDeclaredMethod(methodName, null).getReturnType.getName)
    }

    def max(values: Int*) = values.foldLeft(values(0)) {
        Math.max
    }

    def testMax() {
        println(max(2, 5, 3, 7, 1, 6))
    }

    def main(args: Array[String]) {
        /*printMethodInfo("method1")
        printMethodInfo("method2")
        printMethodInfo("method3")
        printMethodInfo("method4")*/
        testMax
    }


}
