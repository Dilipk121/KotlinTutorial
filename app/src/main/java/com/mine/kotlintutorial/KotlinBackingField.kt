package com.mine.kotlintutorial

fun main() {

    val human = Human()

//    human.age = -1   // it will not assigned
   // human.age = 45
    human.age
    human.name = "Mukesh"
  //  println(human.age)



}

class Human{
    var name = "Rahul"
    var age = 25


        get() {
            println("Age is - $field")
            return field
        }

        set(value) {
                println("Value is - $field")
                field = value
        }
}