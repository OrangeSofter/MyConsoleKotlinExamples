package ru.orangefor.consolekotlintrening

fun main(){
    val map = listOf<Int?>(2, null, 1, null, 1, 3, 3, 3).sortedBy { it }.groupBy { it }

    println(map.values)

    map.values.forEach{

    }
}