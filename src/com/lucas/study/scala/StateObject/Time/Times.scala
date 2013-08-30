package com.lucas.study.scala.StateObject.Time

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 上午10:38
 * To change this template use File | Settings | File Templates.
 */
class Times {
    private[this] var h = 12
    private[this] var m = 12

    //scala中，私有成員變量x的getter方法命名為"x",它的setter方法命名為"x_="
    //這個是無參數方法，Scala編程一書中有說明，無參數的方法可以省略參數列表，然後方法名之後可以直接跟著返回值類型如：
    //無參數函數的定義以及結構：
    //    函數名 函數返回值
    //      \       \
    // deg hour   :Int = {函數體}
    def hour: Int = h

    //方法名(hour_=)，參數列表(x:Int)
    def hour_=(x: Int) {
        require(0 <= x && x < 24)
        h = x
    }

    def minute: Int = m

    def minute_=(x: Int) {
        require(0 <= x && x < 60)
        m = x
    }

}
