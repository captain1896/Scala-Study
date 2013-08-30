package com.lucas.study.scala.StateObject.Key

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 */
class Keyed {
    def computeKey: Int = {
        println("計算Key中，這是個耗時操作！！！")
        9
    }
}
