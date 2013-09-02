package com.lucas.study.scala.ExceptionHandling;

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-9-2
 * Time: 上午11:26
 * To change this template use File | Settings | File Templates.
 */
class CatchOrders {
    public void catchOrderExample() {
        try {

        } catch (Exception ex) {
            System.out.println("Exception caught");
        }/* catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index");
        }*/
        //編譯這段代碼，會得到這樣的錯誤信息：exception java.lang.StringIndexOutBoundsException has already been caught.
        //Scala對其他塊使用模式匹配，按照我們提供的順序起作用。
        //如果前面的語句處理了，原本想在後面語句處理的異常，Scala並不會給出警告。
    }
}
