package com.lucas.study.scala.ImplicitConversionsAndParameters.ImplicitParameters

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-8
 * Time: 下午3:26
 * To change this template use File | Settings | File Templates.
 */
object JoesPreds {
    implicit val prompt = new PreferredPrompt("Yes,Master>")
    implicit val drink = new PreferredDrink("tea")
}
