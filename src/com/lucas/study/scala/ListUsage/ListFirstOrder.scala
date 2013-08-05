package com.lucas.study.scala.ListUsage

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-5
 * Time: 下午12:00
 * To change this template use File | Settings | File Templates.
 */
object ListFirstOrder {

  def main(args: Array[String]) {
    test
  }

  /**
   * ScalaList的一階方法：一階方法是指不以函數作入參的方法，本節還將通過兩個例子說明推薦一些構造列表操作程序的例子。
   */
  def test() {
    val list1 = List[String]("Computer", "Monitor", "Display", "OnMouse")
    val list2 = List[String]("OGNL", "Struts", "Hibernate", "Spring")
    //連接操作是與::接近的一種操作，寫作:::，不過不像::，:::的兩個操作元都是列表。
    // xs:::ys的結果是一次包含xs和ys所有元素的新列表。
    val list3 = list1 ::: list2
    println(list3)
    println(list3.length)

    println("list3:" + list3)
    //last返回最後一個非空元素
    println("list3.last =>" + list3.last)
    //返回除最後一個元素意外的列表
    println("list3.init =>" + list3.init)
    //反轉列表
    println("list3.reverse =>" + list3.reverse)

    //
    println("list3.drop(3) =>" + list3.drop(3))

    println("list3.take(3) =>" + list3.take(3))

    println("list3.splitAt(3) =>" + list3.splitAt(3))

    println("list3.apply(4)" + list3.apply(4))

    println("list3.indices" + list3.indices)
    println("list3.zipWithIndex" + list3.zipWithIndex)
    println(list3.indices zip list3)
    println(list1 zip list2)
    println("List(123213,24,433,23423) zip List(2,4,5) =>" + (List(123213, 24, 433, 23423) zip List(2, 4, 5)))
    println("List[Int](1,2,3,4,5,6,7) mkString(\"PRE-\" , \",\" , \"-POST\") =>" + (List[Int](1, 2, 3, 4, 5, 6, 7) mkString("PRE=>", ",", "<=POST")))


    val buf = new StringBuilder
    list3.addString(buf, "(", ";", ")")
    println("buf=>" + buf)
    val mm = List("M1", "M2", "M3", "M4", "M5")
    println(mm)
    val mmArray = mm.toArray
    mmArray.foreach(println)
    println(mmArray.toList)
    val newArray = new Array[String](10)
    mm.copyToArray(newArray, 0)
    println("---copyToArray----")
    newArray.foreach(println)
    val it = List("Q1", "Q2", "Q3", "Q4").elements
    println("-----")
    println(it.next)
    while (it.hasNext) {
      println(it.next())
    }

    println( msort((x: Int, y: Int) => x < y)(List(5,7,1,35,7,1,35,7,1,35,7,1,35,7,1,35,7,1,35,7,1,35,7,1,35,7,1,35,7,1,3)) )
  }

  def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

  //經過柯里化的歸並排序
  def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
    def merge(xs: List[T], ys: List[T]): List[T] =
      (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (less(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }


    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(msort(less)(ys), msort(less)(zs))
    }
  }


}
