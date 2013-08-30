package com.lucas.study.scala.ClassAndObject

/**
 * Created with IntelliJ IDEA.
 * User: Lucas
 * Date: 13-8-19
 * Time: 上午11:37
 * To change this template use File | Settings | File Templates.
 */
package society {
package professional {

class Executive {
    private[professional] var workDetails = null
    private[society] var friends = null
    private[this] var secrets = null


    def help(another: Executive) {
        println(another.workDetails)
        //println(another.secrets) //ERROR
    }
}

}

package social {

class Acquaintance {
    def socialize(person: professional.Executive) {
        println(person.friends) //OK
        //println(person.workDetails) //ERROR
    }
}

}


}


