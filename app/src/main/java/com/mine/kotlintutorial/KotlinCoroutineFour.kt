package com.mine.kotlintutorial

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking{


    println("MAIN Start ... ${Thread.currentThread().name}")

    //some code here
//    val time = measureTimeMillis {
//        val fun1: Deferred<String> = async { messageOne() }
//        val fun2: Deferred<String> = async { messageTwo()  }
//        println("The Full Message is : ${fun1.await()} ${fun2.await()}")
//    }


        val fun1: Deferred<String> = async(start = CoroutineStart.LAZY) { messageOne() }
        val fun2: Deferred<String> = async(start = CoroutineStart.LAZY) { messageTwo()  }

        println("The Full Message is : ${fun1.await()} ${fun2.await()}")

    println("MAIN Ends ... ${Thread.currentThread().name}")

}

suspend fun messageOne():String{
    delay(1000) //pretend to some work here
    return "Hello "
}

suspend fun messageTwo():String{
    delay(1000)  ////pretend to some work here
    return "Kotlin Programming"
}
