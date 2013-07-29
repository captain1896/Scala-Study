package com.lucas.study.scala.Trait.Person

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-7-29
 * Time: 下午4:35
 * To change this template use File | Settings | File Templates.
 */
class Person {
}

trait TTeacher extends Person {
  def teach()
}

trait TPianoPlayer extends Person {
  def playPiano() {
    println("I'm playing Piano!")
  }
}


class PianoPlayingTeacher extends Person with TTeacher with TPianoPlayer {
  override def teach() {
    println("I'm teaching piano!")
  }
}

object Person {
  def main(args:Array[String]) {
    val pianoTeacher = new PianoPlayingTeacher
    pianoTeacher.playPiano()
    pianoTeacher.teach()
  }
}