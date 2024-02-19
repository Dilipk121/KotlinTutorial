package com.mine.kotlintutorial

fun main() {

    var emp1 = Employee("Rahul",15)
    var emp2 = Employee("Mukesh")

    println(emp2.name)



}

class Employee(var name:String){

    constructor(n:String,id:Int) : this(n) {
        println("$n and $id")
    }

}