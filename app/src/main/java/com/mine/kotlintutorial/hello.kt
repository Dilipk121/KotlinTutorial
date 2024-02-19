package com.mine.kotlintutorial

import com.mine.coroutinesexample.dev.NicePerson

fun main(args:Array<String>){

    var myCourse = "Kotlin Language"

    var nDev : String

    println(myCourse)
    nDev = "Android Developer - Kotlin"
    println(nDev)




    var personObj = Person()

    personObj.name = "Dilip Boss"

    personObj.msgDisplay()


    var nicePersonObj = NicePerson("Dilip Kumar Boss")


    nicePersonObj.display()

}


class Person{

    lateinit var name : String // late init only use for class variable initialized and declare latter

    fun msgDisplay(){

        println("$name is a Experienced Android Developer, Getting Job on Higher Package as per Industry")

    }

}