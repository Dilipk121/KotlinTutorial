package com.mine.kotlintutorial

fun main() {


    var student = Student("Dilip Boss")

    student.name= "Rahul"

    println("Another Student name is ${student.name}")


}

class Student(var name:String){

    init {
        println("Student name is $name")
    }

}