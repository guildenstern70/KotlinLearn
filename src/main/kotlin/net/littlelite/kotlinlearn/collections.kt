/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015 Alessio Saltarin
 *
 */


package net.littlelite.kotlinlearn

import java.util.ArrayList

/**

    Collections

 */
fun collections(): Int {

    // Immutables
    val ints : Array<Int> = arrayOf(1,2,3)
    val listInts: List<Int> = listOf(1,2,3)  // ordered

    // Access array item
    val value = ints[2]

    // Array creation function
    val otherInts = Array(5, {i -> (i * i)})

    // Mutables
    var mutInt: ArrayList<Int> = ArrayList()
    mutInt.add(5)
    mutInt.add(6)
    mutInt.add(7)

    var sum = value

    // Slice
    val intSlice = ints.toList().slice(1..2)
    val listSlice = listInts.slice(1..2)

    for (k in otherInts) {
        for (i in ints) {
            sum += (i+k)
        }
    }

    for (k in mutInt) {
        sum += k
    }

    return sum

}
