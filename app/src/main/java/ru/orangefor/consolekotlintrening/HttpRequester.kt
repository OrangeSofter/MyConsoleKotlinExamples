package ru.orangefor.consolekotlintrening

import java.lang.Exception
import java.net.URL

fun main(){
var answer = ""

    try {
        answer = URL("https://google.com").readText()
    }
    catch(ex: Exception) {
        answer = "не удалось"
    }
    println(answer)
}