package ru.orangefor.consolekotlintrening

import java.net.URL

fun main (){
    println(URL("http://wms.dp.wb.ru/srv/shipment/api/shipping_data/11414385/").readText())
}