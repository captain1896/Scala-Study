package com.lucas.study.scala.Trait

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-27
 * Time: 下午10:47
 * To change this template use File | Settings | File Templates.
 */
object Test {
   def main(args:Array[String]){
     val frog = new Frog
     frog.philosophize()
     val rationalF = new Rational(256,256)
     val rationalT = new Rational(10,1)
     if(rationalF.compare(rationalT) < 0 )
       println("rationalF(256,256) < rationalT(10,1)")
     else if(rationalF.compare(rationalT) > 0 )
       println("rationalF(256,256) > rationalT(10,1)")
     else
       println("rationalF(256,256) = rationalT(10,1)")
   }
}
