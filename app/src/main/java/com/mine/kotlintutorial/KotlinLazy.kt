package com.mine.kotlintutorial

fun main() {

    println("some code....")

    var area = pi * 5 * 5

    println("Area: $area")

    var area2 = pi * 25 * 5 // but when it re-use it will invoke from cache memory, so its initialized only once
    println("Area: $area2")


    println("some code....")


}

 //   var pi: Float  = 3.14f // if are not using this variable than its waisting the memory allocation

    val pi: Float by lazy { 3.14f }  // its takes val only
    //but when we initialized their value inside lazy lambdas it will only utilized when it call