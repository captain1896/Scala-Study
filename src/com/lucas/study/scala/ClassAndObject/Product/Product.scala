package com.lucas.study.scala.ClassAndObject.Product

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-4
 * Time: 下午2:16
 * To change this template use File | Settings | File Templates.
 */
case class Product() {
    private var price: Double = 0

    def getPrice = price

    def price_(price_ : Double) = {
        price = price_
    }

}


object Product {
    def apply(price: Double): Product = {
        val p = new Product()
        p.price = price
        p
    }
}