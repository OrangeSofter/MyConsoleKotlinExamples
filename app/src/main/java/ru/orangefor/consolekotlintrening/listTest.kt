package ru.orangefor.consolekotlintrening

fun main(){
val myList = getNames()
    for(string in myList) println("$string ")
}



fun getNames(): ArrayList<String> {
    val list: ArrayList<String> = ArrayList()
    list.add("первый")
    list.add("второй")
    return list
}