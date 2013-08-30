package com.lucas.study.scala.AbstractMember

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-7
 * Time: 上午11:47
 * To change this template use File | Settings | File Templates.
 */
trait Abstract {
    //每種抽象成員各聲明了一個例子，他們分別是，類型(T),方法(transform),val(initial),以及var(current)
    type T

    def transform(x: T): T

    val initail: T
    var current: T
}
