/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-17
 * Time: 下午4:11
 * To change this template use File | Settings | File Templates.
 */
object HelloWorld {
    def main(args: Array[String]) {
        println("hello,World!")
        test("exercise.startUp.arg")
        test2()
        operator()
    }

    def test(string: String) {
        println("i'm only a exercise.startUp case !" + string)
    }

    def test2() {
        //val定义的变量,一旦被赋值或者初始化，那么值就不可以改变
        //var定义的变量，赋值之后是可以被改变的，也就是可以接受新的值
        val messageCannot = "can't be changed!"
        var messageCan = "can be changed!"
        println(messageCannot)
        println(messageCan)
        messageCan = "message has already been Changed!"
        println(messageCan)
    }


    def operator() {
        var i = 123
        var j = 234
        println("the result is :" + (i + j))
        var integer = 13123
        var integer2 = 13234
        println("the minus result is :" + (integer - integer2))

    }

}
