package com.mine.kotlintutorial

fun main(){

    var x = 17

    when (x){

        in 10..20 -> println("x = $x")
        20 -> {
            //you can use multiple line of code here
            println("x = $x")
        }
        30 -> println("x = $x")

        else -> println("x = $x")
    }

    // when as expression
    val m = 1
    val str:String = when(m){
        1-> "m = $m "
        2->  "m = $m "
        else -> "m = $m "
    }
    println(str)


}