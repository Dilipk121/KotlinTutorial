package com.mine.kotlintutorial

import androidx.core.R

fun main() {

 var aPerson = AnotherPerson()

    aPerson.aname = "Rahul"
    aPerson.age = 30

    println(aPerson.aname)
    println(aPerson.age)
    aPerson.ReadyToRun()

    // lets do it with() function
    with(aPerson){
        aPerson.aname = "Mukesh"
        aPerson.age = 25

        println("$aname : $age")
        ReadyToRun()
    }

    // lets do it apply() function
    aPerson.apply {
        aPerson.aname = "Sonal"
        aPerson.age = 22

        println("$aname : $age")
        ReadyToRun()
    }.ReadyToRun() // we can pass it here also

}

class AnotherPerson{

    var aname = ""
    var age = 0

    fun ReadyToRun(){
        println("I m Ready To RUN!!")
    }
}