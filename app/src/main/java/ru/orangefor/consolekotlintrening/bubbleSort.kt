package ru.orangefor.consolekotlintrening

fun main(){
    val mas = arrayOf(1, 9, 2, 8, 3, 7, 4, 6, 5)

    for(value in mas)  print("$value ")
    println()
    val sortedMas = sort(mas)
    println()
    for(value in sortedMas) print(" $value")
}

fun sort(mas: Array<Int>): Array<Int>{

    while (true) {
        var kolZamen = 0
        for (i in 0 until mas.size - 1) {
            if (mas[i] > mas[i + 1]) {
                val buf = mas[i]
                mas[i] = mas[i + 1]
                mas[i + 1] = buf
                kolZamen++
            }
        }
        if(kolZamen == 0) break
    }
    return mas
}