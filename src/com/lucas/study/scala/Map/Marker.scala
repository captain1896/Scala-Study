package com.lucas.study.scala.Map

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-17
 * Time: 下午5:03
 * To change this template use File | Settings | File Templates.
 */
class Marker private(val color: String) {
    override def toString(): String = "marker color " + color
}

object Marker {
    private val markers = Map[String, Marker]("red" -> new Marker("red"), "blue" -> new Marker("blue"), "green" -> new Marker("green"))

    def primaryColors() = "red,green,blue"

    /**
     *
     * 伴生對象還有另外一個好處：創建伴生類的實例不需要new關鍵字，這是apply（）方法是可以省略，在伴生對象Marker里調用這個方法的方式就跟調用Java類中的靜態方法一樣。
     * apply()方法幫助我們完成的，它是Scala提供的語法糖，上面的代碼在調用Marker("blue")的時候，其實就是調用Marker.apply("blue").
     * 這是個輕量級的語法，讓實例的創建或獲取更加容易。
     *
     */
    def apply(color: String) = if (markers.contains(color)) markers(color) else null

    def getMarker(color: String) = if (markers.contains(color)) markers(color) else null

    def main(args: Array[String]): Unit = {
        println("primary colors are:" + Marker.primaryColors())
        println(Marker("blue"))
        println(Marker("green"))
        println(Marker.getMarker("red"))
        println(Marker.getMarker("White"))
    }
}
