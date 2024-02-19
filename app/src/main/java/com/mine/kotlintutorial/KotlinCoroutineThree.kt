package com.mine.kotlintutorial

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking(){

    println("Main Start.... ${Thread.currentThread().name}")


//    withTimeout(2000){
//        try {
//            for (i in 0..500){
//                print(" $i ")
//                delay(500)
//            }
//        }catch (Ex:TimeoutCancellationException){
//            println(Ex.message)
//        }finally {
//            println("Finally Close")
//        }
//    }

//////////////////////////////////////////////////////////////
    withTimeoutOrNull(2000){
        try {
            for (i in 0..500){
                print(" $i ")
                delay(500)
            }
            "Done"
        }catch (Ex:TimeoutCancellationException){
            println(Ex.message)
        }finally {
            println("Finally Close")
        }
    }



    println("Main End.... ${Thread.currentThread().name}")




}