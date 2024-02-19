package com.mine.kotlintutorial

fun main() {

    var newHuman = NewHuman()

    newHuman.age = 30

    println("Age is = ${newHuman.age}")

    newHuman.display() // _age is also get new value as age

}

class NewHuman{

    private var _age:Int = 0 //Backing-Filed holds actual age property

    //it will be always below above code
    var age:Int //Backing-Property exposed to outside of this class *NOTE its not have any value

        get() { return _age }
        set(value) {_age = value}


    fun display(){
        println("_age is == $_age")
    }

    //NOTE**
    //within class always aue '_age' filed to access property
    //but outside this class use 'age' to access property

}