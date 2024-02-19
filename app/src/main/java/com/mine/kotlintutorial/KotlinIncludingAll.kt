package com.mine.kotlintutorial

fun main() {

    val myNumber = listOf(12,2,15,6,8,4,15,46,89,12)

    for (index in myNumber){
        print(" $index ")
    }

    //########################### FILTER
    val smallNumbers = myNumber.filter { ss -> ss < 15 }
    val smallNumbers1 = myNumber.filter {it < 20 } // also written like this

    println()
    for (index in smallNumbers){
        print(" $index ")
    }

    println()
    for (index in smallNumbers1){
        print(" $index ")
    }


    //############################# MAP
    val mySquareNums = smallNumbers1.map { num -> (num * num) }
    val mySquareNums1 = smallNumbers.map {it*it } // also written like this way

    println()
    for (index in mySquareNums){
        print(" $index ")
    }

    println()
    for (index in mySquareNums1){
        print(" $index ")
    }

    //############# USE BOTH TOGETHER FILTER & MAP
    val small_Square = myNumber.filter { it < 50 }.map { it * it }.reversed() // we use both togather

    println()
    for (index in small_Square){
        print(" $index ")
    }


    //############# USE BOTH TOGETHER FILTER & MAP in Class & Object
    var people = listOf<NewPerson>(
        NewPerson(25,"Rahul Baba"),
        NewPerson(35,"Rakesh Modi"),
        NewPerson(45,"Dileep Dhingra"))

    var names = people.filter { it._name.startsWith('R') }.map { it._name }

    println()
    for (index in names){
        print(" $index ")
    }




}

class NewPerson(var _age:Int,var _name:String){
    // some code here
}