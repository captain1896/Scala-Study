package com.lucas.study.scala.ControlAbstract

import java.io.File

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

  def filesMatching(query:String, matcher:(String,String) => Boolean) ={
    for (file <- filesHere; if matcher(file.getName,query))
      yield file
  }

  def filesEndings(query:String) =
    filesMatching(query,_.endsWith(_))

  def fileContainingS(query:String) =
    filesMatching(query, _.contains(_))

  def filesRegexS(query:String) =
    filesMatching(query,_.matches(_))

  def containsNeg(nums: List[Int]) : Boolean = {
    var exists = false
    for (num <- nums )
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
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }

  //這個版本裏面額代碼再一次體會與相應的containsNeg方法的保持一致（使用了exists的版本），
  //除了搜索的條件不同。然而代碼重複的量確實少很多，因為所有的循環架構都被提取成exists方法本身了。
  //Scala的標準庫本身還有許多其他循環方法，如果你能發現使用它們的機會，那麼像exists一樣，它們經常能縮短你的代碼
  def containsOddHigherEdition(nums: List[Int]) = nums.exists( _ % 2 == 1)
}
