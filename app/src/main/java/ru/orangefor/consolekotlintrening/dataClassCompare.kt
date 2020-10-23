package ru.orangefor.consolekotlintrening

fun  main(){

    println(Data1("p", 1) == Data1("p", 1))
}

data class Data1(
    val name: String,
    val age: Int
)