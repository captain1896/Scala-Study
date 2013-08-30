package com.lucas.study.scala.Trait.Person

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午4:35
 * To change this template use File | Settings | File Templates.
 */
class Person {
    def add(x: Int) {
        println(x)
    }
}

trait TTeacher extends Person {
    def teach()
}

trait TPianoPlayer extends Person {
    def playPiano() {
        println("I'm playing Piano!")
    }
}

trait TAddRobbotOne extends Person {
    override def add(x: Int) {
        super.add(x + 1)
    }
}

trait TAddRobbotTwo extends Person {
    override def add(x: Int) {
        super.add(x * 2)
    }
}


class AddRobbot extends Person with TAddRobbotOne with TAddRobbotTwo {

}


class PianoPlayingTeacher extends Person with TTeacher with TPianoPlayer {
    override def teach() {
        println("I'm teaching piano!")
    }
}

object Person {
    def main(args: Array[String]) {
        val pianoTeacher = new PianoPlayingTeacher
        pianoTeacher.playPiano()
        pianoTeacher.teach()

        val addRobbot = new AddRobbot
        addRobbot.add(123)
    }
}