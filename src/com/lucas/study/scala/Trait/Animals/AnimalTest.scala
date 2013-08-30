package com.lucas.study.scala.Trait.Animals

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-21
 * Time: 下午12:07
 * To change this template use File | Settings | File Templates.
 */
object AnimalTest {
    def userFriend(friend: Friend) = friend.listen()

    def main(args: Array[String]) {
        val alf = new Cat("ALF")
        //val friends: Friend = alf
        //userFriend(alf)         //ERROR
        val snowy = new Cat("Snowy") with Friend
        println(snowy.name)
        val friendF: Friend = snowy
        userFriend(friendF)
    }


}
