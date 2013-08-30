package com.lucas.study.scala.CaseClassAndPatternMatching.sealedClass

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-31
 * Time: 上午11:37
 * To change this template use File | Settings | File Templates.
 */
sealed abstract class Expr {

}

case class Var(name: String) extends Expr {

}

case class Number(num: Double) extends Expr {

}

case class UnOp(operator: String, arg: Expr) extends Expr {

}

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr {

}


object test {
    def main(args: Array[String]) {
        println(describe(Number(9.8)))
        println(describeUpdateVersion(Number(9.8)))
    }

    //爲了關閉編譯器的警報，輕量級的做法是給匹配的表達式添加@unchecked注解
    def describe(e: Expr): String = (e: @unchecked) match {
        case Number(_) => "a numberRange"
        case Var(_) => "a variable"
    }


    def describeUpdateVersion(e: Expr): String = e match {
        case Number(_) => "a numberRange"
        case Var(_) => "a variable"
        case _ => throw new RuntimeException
    }
}