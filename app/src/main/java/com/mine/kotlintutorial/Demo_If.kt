package com.mine.kotlintutorial

fun main(){

    val a = 100
    val b = 20

    val maxValue:Int

    // if statement as expression

    maxValue = if(a > b){
        a
    }
    else{
        b
    }

   println(maxValue)

}