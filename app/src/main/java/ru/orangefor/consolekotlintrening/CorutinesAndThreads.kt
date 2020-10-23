package ru.orangefor.consolekotlintrening

import kotlinx.coroutines.delay
import  kotlinx.coroutines.*
import kotlin.concurrent.thread


fun main() {
    println("program starting")

   val value1 = GlobalScope.async(Dispatchers.IO) {
        delay(1000)
        "val_1"
    }
    val value2 = GlobalScope.async(Dispatchers.Unconfined) {
        delay(2000)
        "val_2"
    }


    runBlocking {
        println(value1.await())
        println(value2.await())
    }
    println("Stop")

}

suspend fun doAsync(){
    println("do")
    delay(1000)
    println("1 second")
}

