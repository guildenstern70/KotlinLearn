/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-18 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

fun ifelse(a: Int, b: Int): Int {

    return if (a > b)
        a
    else
        b
}

fun ifwhen(a: Int, b: Int): Int {

    val max: Int = if (a > b) a else b

    // As expression

    when (max) {
        1 -> println("max == 1")
        2 -> println("max == 2")
        else -> { // Note the block
            println("max is neither 1 nor 2")
        }
    }

    val validNumbers = arrayOf(1, 2, 3, 4)

    when (max) {
        in 1..10 -> println("max is in the range")
        in validNumbers -> println("max is valid")
        !in 10..20 -> println("max is outside the range")
        else -> println("none of the above")
    }

    println("max = " + max.toString())

    return max
}
