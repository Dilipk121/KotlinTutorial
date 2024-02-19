package com.mine.kotlintutorial

fun main() {

    //Array Tutorial

    val myArr = Array<Int>(10) { 10 } //mutable(changeable) but fixed in size

    myArr[0] = 20
    myArr[5] = 55

    println(myArr[5])

    // its a simple way to print array items using for loop or foreach loop
    for (i in myArr) {
        print(" $i ")
    }
    println("")
    for (i in myArr.indices) {
        print(" ${myArr[i]} ")
    }
    println("")
    for (i in  0..myArr.size - 1) {
        print(" ${myArr[i]} ")
    }


}