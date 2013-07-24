package com.lucas.study.scala.ControlAbstract

import java.io.File
import java.io.PrintWriter

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-24
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
object FileMatcher {
  private def filesHere = (new File(("."))).listFiles

  /*  def filesEnding(query:String) =
      for (file <- filesHere; if file.getName.endsWith("query"))
         yield file

    def filesContaining(query :String) =
      for (file <- filesHere; if file.getName.contains(query))
        yield file

    def filesRegex(query:String) =
      for (file <- filesHere;if file.getName.matches(query))
        yield file*/

  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
    yield file
  }

  def filesEndings(query: String) =
    filesMatching(query, _.endsWith(_))

  def fileContainingS(query: String) =
    filesMatching(query, _.contains(_))

  def filesRegexS(query: String) =
    filesMatching(query, _.matches(_))

  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = false
    exists
  }

  //exists方法代表了控制抽象，是scala庫提供的特定用途循環架構而不是像while或者for那樣內建在scala語言裏的
  //exists是公開在Scala的集合類型API里的，所以它減少的是API的客戶代碼中的重複
  def containsNegHigherEdition(nums: List[Int]) = nums.exists(_ < 0)

  //比較了containsNeg和containsOdd的函數體，會發現除了if表達式之外，其他東西都是重複的；
  //使用了exists，你就可以這麼寫，下面第二個函數
  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }

  //這個版本裏面額代碼再一次體會與相應的containsNeg方法的保持一致（使用了exists的版本），
  //除了搜索的條件不同。然而代碼重複的量確實少很多，因為所有的循環架構都被提取成exists方法本身了。
  //Scala的標準庫本身還有許多其他循環方法，如果你能發現使用它們的機會，那麼像exists一樣，它們經常能縮短你的代碼
  def containsOddHigherEdition(nums: List[Int]) = nums.exists(_ % 2 == 1)

  def plainOldSum(x: Int, y: Int) = x + y

  def curriedSum(x: Int)(y: Int) = x + y

  //在計算機科學中，柯里化是把接受多個參數的函數變換成接受一個單一參數（最初函數的第一個參數）的函數，
  //並且返回接受餘下的參數而且返回結果的新函數的技術。這個技術又christopher Strachey以邏輯學家Haskell Curry命名的，
  //尽管它是 Moses Schnfinkel 和 Gottlob Frege 发明的。
  //這裡發生的事情是當你調用curriedSum時，實際上連接調用了兩個傳統函數。
  //第一個函數調用帶單個的名為x的Int參數，並且返回第二函數的函數值。第二個函數帶Int參數y。
  //下面的名為first的函數實質上執行了curriedSum的第一個傳統函數調用會做的事情。
  def first(x: Int) = (y: Int) => x + y

  def curriedFunction() {
    //柯里化就是不斷產生新函數的過程，并產生值。
    val second = first(1)
    println(second(222))
  }

  //獲得市級指向curriedSumd的“第二個”參數的參考，可以用部份應用函數表達式方式，把占位符標注用在curriedSum裏面，如
  def curriedFunction2() {
    val onePlus = curriedSum(1) _
    val result1 = onePlus(2)
    val twoPlus = curriedSum(2) _
    val result2 = twoPlus(2)
    println("-curried-->" + result1)
    println("-curried-->" + result2)
  }

  def withPrintWriter(file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
      println(file.getName)
    } finally {
      writer.close()
    }

  }

  //經過柯里化的函數=> 函數名（）（）...
  def redefineWithPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  //在這個例子裏面，第一個參數列包含了一個File參數，被寫成包圍在小括號中。
  //第二個參數列表包含了一個函數參數，被包圍在花括號中。
  def callRedefineWithPrintWriter() {
    val file = new File("H:\\intellij_workspace\\scala-study\\src\\com\\lucas\\study\\scala\\ControlAbstract\\date.txt")

    //這個是個編程技巧：，讓客戶代碼看上去更像內建控制結構的一種方式是使用花括號代替小括號包圍參數列表。
    //Scala的任何方法調用，如果確實只傳入一個參數，就能可選地使用花括號代替小括號包圍參數
    redefineWithPrintWriter(file) {
      writer => writer.println("Writer Successfully At :" + new java.util.Date)
    }
  }

  //傳名參數:by name parameter
  def testMyAssert() {
    val assertionEnabled = true
    def myAssert(predicate : () => Boolean) =
      if (assertionEnabled && !predicate())
        throw new AssertionError()
    println("myAssert--->" + myAssert(() => 5 > 3))

    def byNameAssert(predicate: => Boolean) =
      if (assertionEnabled && !predicate)
        throw new AssertionError()
    println("byNameAssert--->" + byNameAssert(5 > 3))
  }


  def main(args: Array[String]) {
    val listA = List[Int](1, 2, 3, 4, 5)
    val listB = listA.map(_ * 2)
    print("listA:" + listA + "|ListB:" + listB)
    println("\n" + curriedSum(12)(2))
    println("" + plainOldSum(12, 2))
    curriedFunction()
    curriedFunction2()
    println {
      "Halo,こんにちは、私も、皆さん本当で良い！"
    }
    //withPrintWriter(new File("H:\\intellij_workspace\\scala-study\\src\\com\\lucas\\study\\scala\\FunctionAndClosure\\LongLines.scala"),writer => writer.println(new java.util.Date))
    callRedefineWithPrintWriter()
    testMyAssert()
  }


}
