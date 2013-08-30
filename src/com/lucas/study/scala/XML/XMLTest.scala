package com.lucas.study.scala.XML

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-26
 * Time: 下午4:50
 * To change this template use File | Settings | File Templates.
 */
object XMLTest {
    def main(args: Array[String]) {
        testXML
    }

    def testXML() {
        import scala.xml.Node
        val xmlContent = <a>
            <b>Ley
                <c>
                    <title>title1</title>
                    <url>url1</url>
                </c>
                <c>
                    <title>title2</title>
                    <url>url2</url>
                </c>
                <c>
                    <title>title3</title>
                    <url>url3</url>
                </c>
            </b>
        </a>.\\("c")
        println(xmlContent(0))
        println(xmlContent(1))
        println(xmlContent(2))
        var xmlData: List[(String, String)] = Nil
        xmlContent.foreach((node: Node) => {
            val title = node.\\("title").text
            val url = node.\\("url").text
            xmlData = (title, url) :: xmlData
        })
        val xmlDateTargetDate = xmlData.reverse
        println(xmlData)
        println(xmlDateTargetDate)
        //scala.xml.Elem.
    }

}
