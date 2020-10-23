package ru.orangefor.consolekotlintrening

fun main(){
    var mas = emptyArray<Int?>()
   for(i in 1024 downTo 1) mas += i*2
   for(i in mas.lastIndex downTo (mas.lastIndex-5)){mas.set(i, null)}
   val sorted =  mas.sortedBy { it }

       // println(search(2048, mas).toString())

    sorted.forEach { println(it) }
}

fun search(searched: Int, mas: Array<Int>): Int?{
    var i = mas.size/2
    if (mas.size % 2 != 0) i++
    var dif = i
    while(true){
        if (dif % 2 != 0) dif++
        dif /= 2
        if(searched > mas[i]) i += dif
        else if(searched < mas[i]) i -= dif
        else return i
    }
}