package com.lucas.study.scala.scalaAndJavaInteractive;

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-2
 * Time: 下午3:17
 * To change this template use File | Settings | File Templates.
 */
public class Investment {
    private String investmentName;
    private InvestmentType investmentType;

    public Investment(String name, InvestmentType type) {
        investmentName = name;
        investmentType = type;
    }

    public int yield() {
        return 0;
    }

    public String toString() {
        return "investmentName=" + investmentName + ",investmentType=" + investmentType;
    }

}
