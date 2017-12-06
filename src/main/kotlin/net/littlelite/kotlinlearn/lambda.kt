/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-17 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

// Typical lambda function
val lambdaSum = { x: Int, y: Int -> x + y }

// Anonymous function
val anonFun = fun(x: Int, y: Int): Int {
    return x + y
}

fun lambdatest() : Int {

    val sum53 = lambdaSum(5,3)
    println("Sum 5+3 = $sum53")

    val anonsum53 = anonFun(5, 3)
    println("Sum 5+3 = $anonsum53")

    return (sum53 + anonsum53)

}