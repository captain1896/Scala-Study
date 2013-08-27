package com.lucas.study.scala.ListUsage

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-1
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
object ListTest {
  def main(args: Array[String]) {
    basicManipulation
    testInsertSort
    testInsertSort2
    testListMatchingPattern
    testIsortWithMatchingPattern
    testListBuffer
  }


  /**
   * 列表與數組非常相似，不過有兩個重點的差別。首先，列表是不可變的。
   * 也就是說，不能通過賦值改變列表的元素。
   * 其次，具有遞歸結構(例如，鏈接列表:liked list),而數組是連續的。
   * 就像數組一樣，列表是同質的（homogeneous）的：列表的所有元素都具有相同的類型。
   * 元素的類型列表類型寫成List[T],例如，以下四個列表的資歷都明確指定了類型。
   * Scala裏面列表類型是協變得（convariant）的。
   * 這意味著對於每一對類型S和T來說，如果S是T的子類型，那麼List[S]是List[T]的子類型。
   * 比如說，List[String]是List[String]是List[Object]的子類型。
   * 注意空列表的類型為List[Nothing],Nothing是Scala的類層級的底層類型。它是每個Scala類型的子類，因為列表是協變的，所以對於任意類型的T的List[T]來說，
   * List[Nothing]都是其子類，因此類型為List[Nothing]的空列表對象，還可以被當做是其他任何形式為List[T]列表的對象。
   * 所以下面的代碼完全合法：
   * //List（）同樣也List[String]
   * val xs:List[String] = List()
   */
  def test() {
    val fruit: List[String] = List[String]("Apple", "Orange", "Pears")
    val nums: List[Int] = List[Int](12, 34, 54)
    val digs: List[List[Int]] = List[List[Int]](
      List(1, 0, 5),
      List(0, 1, 1),
      List(0, 0, 1)
    )
    val empty: List[Nothing] = List()
  }

  /**
   * 所有列表都是由兩個基礎的構造快Nil和::（發音為"cons"）構造出來。Nil代表空列表。
   * 中綴操作符::,表示列表從前端拓展。也就是說，x::xs代表了第一個元素為x,後面跟著列表xs(的元素)的列表。
   */
  def consList() {
    val fruit = "apples" :: ("orange" :: ("pears" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    val diag3 = (1 :: 0 :: 0 :: Nil) ::
      (0 :: 1 :: 0 :: Nil) ::
      (0 :: 0 :: 1 :: Nil) :: Nil
    val empty = Nil
    val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  }

  /**
   * 對於所有的操作都可以表達為以下三種形式：
   * head     返回列表的第一個元素
   * tail     返回除第一個之外所有元素組成的列表
   * isEmpty  如果列表為空，返回真，否則返回假
   *
   * head和tail方法僅能夠作用在非空列表上。
   * 如果執行在空列表上，會拋出異常
   *
   */
  def basicManipulation() {
    val fruit = "apples" :: ("orange" :: ("pears" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    val diag3 = (1 :: 0 :: 0 :: Nil) ::
      (0 :: 1 :: 0 :: Nil) ::
      (0 :: 0 :: 1 :: Nil) :: Nil
    val empty = Nil
    val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

    println("empty.isEmpty=):" + empty.isEmpty)
    println("fruit.isEmpty=" + fruit.isEmpty)
    println("fruit.isDefinedAt(1)=" + fruit.isDefinedAt(1))
    println("fruit.head=" + fruit.head)
    println("fruit.tail=" + fruit.tail)
    println("fruit.tail.head=" + fruit.tail.head)
    //println(Nil.head)
    //println(Nil.tail)
  }

  //排序
  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  /**
   * 大於等於號：  >=
   * 小於等於號：  <=
   * 右箭頭    ：  =>      (函數字面量中有廣泛應用)
   * 左箭頭    ：  <-      (For循環中常用)
   * @param x
   */

  //插入
  def insert(x: Int, xs: List[Int]): List[Int] = {
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)
  }

  def testInsertSort() {
    val nums = List[Int](7877, 12, 78, 90)
    val newNums = isort(nums)
    println(newNums)
    println(insert(999, newNums))
    println(insert(123902, Nil))
  }

  def isort2(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort2(xs.tail))

  def insert2(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert2(x, xs.tail)

  def testInsertSort2() {
    val numbers = List[Int](55, 33, 11, 22, 663)
    println(numbers)
    println(isort2(numbers))
    println(insert2(990, isort2(numbers)))
    println(insert2(9, isort2(numbers)))
  }

  def testListMatchingPattern() {
    val fruit = "apples" :: ("orange" :: ("pears" :: Nil))
    val List(a, b, c) = fruit
    val x :: y :: rest = fruit
    println(a + "|" + b + "|" + c)
    println(x + "|" + y + "|" + rest)
  }

  def isortWithMatchingPattern(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insertWithMatchingPattern(x, isortWithMatchingPattern(xs1))
  }

  def insertWithMatchingPattern(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs
    else y :: insertWithMatchingPattern(x, ys)
  }


  def testIsortWithMatchingPattern() {
    val numbers = List[Int](55, 33, 11, 22, 663)
    println(isortWithMatchingPattern(numbers))
    println(insertWithMatchingPattern(100000, isortWithMatchingPattern(numbers)))
  }

  def testListBuffer() {
    import scala.collection.mutable.ListBuffer
    val listBuffer = new ListBuffer[(Int, Int)]()
    listBuffer += ((1, 1))
    println(listBuffer)

  }

}
