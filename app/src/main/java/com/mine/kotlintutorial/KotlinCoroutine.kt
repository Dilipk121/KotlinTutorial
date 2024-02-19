package com.mine.kotlintutorial

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


@OptIn(DelicateCoroutinesApi::class)
fun main() {
    //create a coroutine that blocks the current thread
    val job: Job //Job Object
    //Job jobDeferred object
    val jobDeferred: Deferred<Int>

    println("Main Program Starts: ${Thread.currentThread().name} thread")

    runBlocking {

        job = launch {
            println("Fake-1 Program Starts: ${Thread.currentThread().name} thread")
            rukJaa(1000)// delay() not blocked the thread
            println("Fake-1 Program Ends: ${Thread.currentThread().name} thread")
        }

        jobDeferred  = async {
            println("Fake-2- Program Starts: ${Thread.currentThread().name} thread")
            rukJaa(1000)// delay() not blocked the thread
            println("Fake-2- Program Ends: ${Thread.currentThread().name} thread")
            20
        }
    }

    runBlocking {
       var num = jobDeferred.await()
        println("RETURN: $num")
//        job.join()
//        job.cancel()
        job.cancelAndJoin()// same time cancel and join
    }

    println("Main Program Ends: ${Thread.currentThread().name} thread")
}

suspend fun rukJaa(time: Long) {
    delay(time)
}

