/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * This is an high-order function. It takes a collection and it sums its members.
 * It takes a first parameter of type T
 * It takes a second parameter that is a function that takes as input R and T and returns R
 * It returns an object of type R
 */
fun <T, R> Collection<T>.bend(
    initial: R,
    combine: (acc: R, nextElement: T) -> R,
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

val lambdaCombineFunction = { acc: Int, i: Int ->
    val result = acc + i
    // The last expression in a lambda is considered the return value:
    result
}

val booleanReducerFunction = { acc: Boolean, booleanValue: Boolean ->
    acc || booleanValue
}

fun booleanReducer(items: List<Boolean>): Boolean = items.reduce(booleanReducerFunction)

fun bendExample(items: List<Int>): Int {
    val initialValue = 0
    return items.bend(initialValue, lambdaCombineFunction)
}
