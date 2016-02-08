/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-16 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

// Typical lambda function
val lambda_sum = { x: Int, y: Int -> x + y }

// Anonymous function
val anon_fun = fun(x: Int, y: Int): Int {
    return x + y
}

fun lambdatest() : Int {

    val sum5_3 = lambda_sum(5,3)
    println("Sum 5+3 = $sum5_3")

    val anon_sum_5_3 = anon_fun(5, 3)
    println("Sum 5+3 = $anon_sum_5_3")

    return (sum5_3 + anon_sum_5_3)

}