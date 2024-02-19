package com.mine.kotlintutorial

fun main() {

    val myNums = listOf<Int>(45,7,89,12,15,75,2,3,5,8,9)

    val myPredicate = { num:Int -> num < 10}

  // val check1: Boolean = myNums.all { it < 10 } //is all elements smaller than 10
    val check1: Boolean = myNums.all(myPredicate) //also use lambdas using variable
    println(check1)

    //val check2: Boolean = myNums.any() { it < 10 } //is any elements smaller than 10
    val check2: Boolean = myNums.any(myPredicate)  //also use lambdas using variable
    println(check2)

//    val check3: Int = myNums.count { it < 10 }  //numbers of  elements that satisfy predicts/conditions
    val check3: Int = myNums.count(myPredicate) //also use lambdas using variable
    println(check3)

    // its nullable cozy when condition not match it will return 'null'
//    val check4: Int? = myNums.find { it < 10 }  //return first number that satisfy predicts/conditions
    val check4: Int? = myNums.find(myPredicate)  //also use lambdas using variable
    println(check4)



}