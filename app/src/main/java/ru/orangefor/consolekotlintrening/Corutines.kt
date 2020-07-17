package ru.orangefor.consolekotlintrening

import kotlinx.coroutines.delay
import  kotlinx.coroutines.*

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
}

