package com.lucas.study.scala.StateObject

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */
class Temperature {
    /**
     * 這一行定義了var變量celsius,以保存攝氏溫度值，celsius變量初始化設置缺省值‘_’,
     * 這個符號指定了變量的“初始化值”。更為精確地說，字段的初始化器“=_”把零值賦給該字段。
     * 這裡的“零”的取值取決於字段的類型。對於述職類型來說是0，對於布爾類型是false，引用類型是null。
     * 在Scala中不可以隨便省略“=_”初始化器。如果寫成：
     * var celsius:Float，這將定義為抽象變量，而不是未初始化的變量。
     */
    var celsius: Float = _

    def fahrenheit = celsius * 9 / 5 + 32

    def fahrenheit_=(f: Float) {
        celsius = (f - 32) * 5 / 9
    }

    override def toString = fahrenheit + "F/" + celsius + "C"
}


object Temperature {
    def main(args: Array[String]) {
        val t = new Temperature
        println(t.celsius)
        println(t.fahrenheit)
        t.celsius = 100
        println("t.celsius = 100,t.celsius=" + t.celsius)
        println("t.celsius = 100,t.fahrenheit=" + t.fahrenheit)
        println("t.toString=" + t.toString)

        t.fahrenheit = -40
        println("t.fahrenheit = -40,t.celsius =" + t.celsius)
        println("t.fahrenheit = -40,t.fahrenheit =" + t.fahrenheit)
        println("t.toString=" + t.toString)

    }
}