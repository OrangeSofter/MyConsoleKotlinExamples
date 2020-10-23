package ru.orangefor.consolekotlintrening.wb

import java.math.BigDecimal

fun main(){
    println(getImages(7005170, 7))
}

//TODO: Считаю это костылем, по хорошему URL должны приходить сраззу в ответе
fun getImages(nmId: Int, imageIndex: Int): ArrayList<String>? =
    ArrayList<String>().apply {
        val serverIndex = nmId % 2 + 1
        val folder = BigDecimal(nmId / 10000)
        val finalFolder = folder.multiply(BigDecimal(10000))
        var count = 1
        while (count <= imageIndex && count <= 15) {
            val filename =
                "https://img${serverIndex}.wbstatic.net/large/new/${finalFolder}/${nmId}-${count}.jpg"
            count += 1
            add(filename)
        }
    }