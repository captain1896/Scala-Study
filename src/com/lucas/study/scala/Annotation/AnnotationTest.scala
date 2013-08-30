package com.lucas.study.scala.Annotation

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-11
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */


/**
 * scala的若干注解：@deprecated、@volatile、@serializable、@BeanProperty以及@unchecked
 */
object AnnotationTest {
    def main(args: Array[String]) = {

    }

    //Annotation注解，deprecated
    @deprecated def bigMistake() = {
        // do something ...
    }

    def test() {
        //@cool val normal = "hello"
        //@coolerThan(normal) val fonzy = "Heeyyy"
        val test = new AnnotationTestCase

        //@unchecked 注解由編譯器在模式匹配的時候解釋，它告訴編譯器不要擔心match表達式忽略了某些情況。
        @unchecked val UNchecked = ""
    }
}
