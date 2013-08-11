package com.lucas.study.scala.Annotation

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-11
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
//可以序列化@serializable
@serializable
@deprecated class AnnotationTestCase {
  // many things ...

  //添加了@transient注解之後，這個字段就不會被序列化
  @transient
  private val name = "Jayden"

}
