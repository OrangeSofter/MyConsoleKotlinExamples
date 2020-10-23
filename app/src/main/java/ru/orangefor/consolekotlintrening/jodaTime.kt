package ru.orangefor.consolekotlintrening

import org.joda.time.DateTime
import org.joda.time.LocalTime
import org.joda.time.Period
import org.joda.time.PeriodType
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.PeriodFormatter
import org.joda.time.format.PeriodFormatterBuilder
import java.text.ParseException


fun main(){
    "2020-08-20 05bfsfs:00:00".getHoursOfDayFromDateSpaceTime()
}

fun String.getHoursOfDayFromDateSpaceTime(): Int? {
    return try {
        DateTime.parse(this, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")).hourOfDay
    } catch (e: IllegalArgumentException) {
        println("ilegal ex")
        null
    } catch (e: ParseException) {
        println("parce ex")
        null
    }
}