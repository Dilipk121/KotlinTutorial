package com.mine.kotlintutorial

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {

    println("MAIN code Start .... ${Thread.currentThread().name}")

//    thread {
//        println("Fake code start .... ${Thread.currentThread().name}")
//        Thread.sleep(1000) // pretend doing some work.....like file upload etc //Thread is block here for given time
//        println("Fake code end .... ${Thread.currentThread().name}")
//    }

//    //coroutine Builders
//    GlobalScope.launch {
//        println("Fake-1 code start .... ${Thread.currentThread().name}")
//        mySuspendFunction(1000) // pretend doing some work.....like file upload etc // but using delay its not block the thread, its block coroutine
//        println("Fake-1 code end .... ${Thread.currentThread().name}")
//    }

    runBlocking {
        //coroutine Builders
        launch {
            println("Fake-1 code start .... ${Thread.currentThread().name}")
            mySuspendFunction(1000) // pretend doing some work.....like file upload etc // but using delay its not block the thread, its block coroutine
            println("Fake-1 code end .... ${Thread.currentThread().name}")
        }
    }

    //create a coroutine which block main thread
//  runBlocking {
      mySuspendFunction(2000)


    println("MAIN code End .... ${Thread.currentThread().name}")

 }

//
suspend fun mySuspendFunction(time:Long){
    delay(time)
}