package ru.orangefor.consolekotlintrening

import kotlinx.coroutines.delay
import  kotlinx.coroutines.*
import kotlin.concurrent.thread

var a = 1
fun main() {
    println("program starting")
    a++
    GlobalScope.launch {
        delay(1000)
        a--
        println("Hello $a")
    }

    runBlocking {
        delay(2000)
    }
    println("Stop")
    thread(start = true) {
        runBlocking {
            delay(2000)
        }
        println("again 2 seconds with new thread help")
    }
}

