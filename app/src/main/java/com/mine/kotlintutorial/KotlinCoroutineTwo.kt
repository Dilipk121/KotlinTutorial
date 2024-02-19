package com.mine.kotlintutorial

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.coroutines.yield

fun main() = runBlocking {

    println("## Start.....${Thread.currentThread().name}")
    val job: Job = launch {
        try {


            for (i in 0..1000) {
                if (!isActive) {
                    // return@launch
                    break
                }
                delay(50)
                println(" $i : ${Thread.currentThread().name}")
//               yield() //using yield method, its just make it cancellable or cooperative  & produce Very FAST output
            }
        } catch (ex: CancellationException) {
            println("Exception Catch safely: ${ex.message}")
        } finally {
            withContext(NonCancellable) {
                delay(1000) // generally we not use it here, but if any condition you use, than use 'withContext()
                println("Close Resources Finally")
            }
        }
    }

    delay(200)
    job.cancel(CancellationException("My Own Cancelled Crash Message"))
    job.join()
//    job.cancelAndJoin()

    println("## End......${Thread.currentThread().name}")

}
