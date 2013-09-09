package com.lucas.study.scala.XML

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-9
 * Time: 下午12:12
 * To change this template use File | Settings | File Templates.
 */
object userXML {

    def xml() {
        val xmlFragment = <symbols>
            <symbol ticker="AAPL">
                <units>200</units>
            </symbol>
            <symbol ticker="IBM">
                <units>215</units>
            </symbol>
        </symbols>

        println("xmlFragment:" + xmlFragment)
        println("xmlFragment.getClass=" + xmlFragment.getClass)

        println("--------------")
        var symbolNodes = xmlFragment.\\("units")
        println(symbolNodes.mkString("\n"))
        System.out.println("==============")
        println(symbolNodes.getClass)
        val nodes = symbolNodes.toList
        println(nodes)
    }

    def main(args: Array[String]) {
        xml
    }


}
