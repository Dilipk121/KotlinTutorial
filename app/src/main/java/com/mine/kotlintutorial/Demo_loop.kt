package com.mine.kotlintutorial

fun main(){

    //for loop
    for (i in 1..10){
        println("hello $i : For Loop")
    }

    //while loop
    var ii = 1
    while(ii < 10){
        println("hello $ii : While Loop")
        ii++
    }

    //do while loop
    var a = 1
    do {
        println("hello $a : do-while-loop")
        a++
    } while (a < 10)

}