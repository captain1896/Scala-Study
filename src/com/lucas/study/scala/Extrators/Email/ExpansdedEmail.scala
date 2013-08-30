package com.lucas.study.scala.Extrators.Email

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-10
 * Time: 下午9:12
 * To change this template use File | Settings | File Templates.
 */
object ExpandedEmail {
    def unapplySeq(email: String): Option[(String, Seq[String])] = {
        val parts = email.split("@")
        if (parts == 2)
            Some(parts(0), parts(1).split("\\.").reverse)
        else
            None
    }

    def main(args: Array[String]) {
        val s = "tom@support.epfl.ch"
        //val ExpandedEmail(name, topdom, subdoms @ _*) = s
    }
}
