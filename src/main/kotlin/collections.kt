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
    val ints : Array<Int> = array(1,2,3)

    // Array creation function
    val otherInts = Array(5, {i -> (i * i)})

    // Mutables
    var mutInt: ArrayList<Int> = ArrayList()
    mutInt.add(5)
    mutInt.add(6)
    mutInt.add(7)

    var sum = 0

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
