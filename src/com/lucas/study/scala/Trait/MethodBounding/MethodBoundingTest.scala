package com.lucas.study.scala.Trait.MethodBounding

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
object MethodBoundingTest {
    def main(args: Array[String]) {
        test
    }

    def test() {
        val myWriterProfanityFirst = new StringWriterDelegate with UpperCaseWriter with ProfanityFilterWriter

        val myWriterProfanityLast = new StringWriterDelegate with ProfanityFilterWriter with UpperCaseWriter

        myWriterProfanityFirst writeMessage "There is no sin except stupidity!"
        println(myWriterProfanityFirst)

        myWriterProfanityLast.writeMessage("There is no sin except stupidity!")
        println(myWriterProfanityLast)
    }
}

