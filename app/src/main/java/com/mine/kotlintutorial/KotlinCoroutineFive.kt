package com.mine.kotlintutorial

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    println("RUN Blocking : $this")

    launch {
        println("LAUNCH BLOCK : $this")

        launch {
            println("CHILD----LAUNCH BLOCK : $this")
        }
    }

    async {
        println("ASYN BLOCK : $this")
    }

println(" ........   CODE .................")
}