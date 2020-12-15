/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2020 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


fun isoDate(): String {
    val tz = TimeZone.getTimeZone("UTC")
    val df: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'") // Quoted "Z" to indicate UTC, no timezone offset
    df.timeZone = tz
    val dateAsIsoString = df.format(Date(1570460091000 ))
    println(dateAsIsoString)
    return dateAsIsoString
}