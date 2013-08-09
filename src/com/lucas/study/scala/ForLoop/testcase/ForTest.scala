package com.lucas.study.scala.ForLoop.testcase

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-9
 * Time: 上午11:29
 * To change this template use File | Settings | File Templates.
 */
object ForTest {
  def main(args: Array[String]) {
    test
    test2
    testForQuery
  }

  /**
   * 通常，for表達式的形式如下：
   * for(seq) yield expr
   * 這裡，sqp由生成器、定義以及過濾器組成的序列，以分號分割。示例如下：
   * for (p <- persons ; n = p.name ; if(n startsWith "To" ))
   * yield n
   *
   * 上面的for表達式分別包含了生成器，一個定義以及一個過濾器。
   * 還可以用花括號替代小括號包圍表達式序列，那樣的話，分號就是可選的了：
   *
   * for {
   * p <- persons          //生成器
   * n = p.name            //定義
   * if(n startsWith "To") //過濾器
   * } yield n
   *
   *
   */
  def test() {
    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julie = Person("julie", false, lara, bob)
    val persons = List[Person](lara, bob, julie)

    val motherNchildren = for (p <- persons; if !p.isMale; c <- p.children)
    yield (p.name, c.name)

    println(motherNchildren)

  }

  /**
   * for表達式：
   * 1.生成器的形式：
   * pat <- expr
   * 2.過濾器
   * if expr
   * 這裡，exor是Boolean類型的表達式，過濾器能從迭代中濾除所有expr返回false的元素。
   * 所有for表達式都可以以生成器開始，如果for表達式中游若干生成器（即有多個: <-），那麼後面的生成器比前面的變化得更快。
   *
   */
  def test2() {
    val listTuple = for (x <- List(1, 2); y <- List("one", "two"))
    yield (x, y)
    println(listTuple)
  }

  def testForQuery() {
    val books: List[Book] = List(
      Book(
        "Structure and Interpretation of computer Programs",
        "Abelson,Harold", "Sussman,Gerald J."
      ),
      Book(
        "Principles Of Compiler Design",
        "Aho,Alfred", "Ullman,Jeffrey"
      ),
      Book(
        "Elments Of ML Programming",
        "Ullman,Jeffrey"
      ),
      Book(
        "Program In Modula-2",
        "Wirth,Niklaus"
      ),
      Book(
        "The Java Language Specification",
        "Gosling,James", "Joy,Bill,Gerald J.", "Steele,Guy", "Bracha,Gilad"
      )
    )


    val gosling = for (b <- books; a <- b.authors if a.startsWith("Gosling"))
    yield b.title
    println(gosling)

    val programsBook = for (b <- books if (b.title.indexOf("Program")) >= 0)
    yield b.title
    println(programsBook)

    val authorsWithTwoBook = for {
      b1 <- books
      b2 <- books if b1 != b2
      a1 <- b1.authors
      a2 <- b2.authors if a1 == a2
    } yield a1

    println(authorsWithTwoBook)
    val  pureResult= removeDuplivates(authorsWithTwoBook)
    println(pureResult)
  }

  def removeDuplivates[A](xs: List[A]): List[A] = {
    if (xs.isEmpty) xs
    else
      xs.head :: removeDuplivates(
        xs.tail.filter(x => x != xs.head)
      )
    // for (x <- xs.tail if x != xs.head) yield x
  }


}
