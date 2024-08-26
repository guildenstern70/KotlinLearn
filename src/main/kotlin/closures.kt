/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn


val lambdaFunction = { a: Int, b: Int -> a + b }

/**
 * Call as
 * @sample
 *     highOrderFunction(3,4, ::sum)
 */
fun highOrderFunction(a: Int, b: Int, operation: (a: Int, b: Int) -> Int): Int
{
    return operation(a, b)
}

/**
 * Call as
 * @sample
 *     highOrderFunction(3,4, ::sum)
 */
fun highOrderFunctionWithLambda(a: Int, b: Int): Int
{
    return highOrderFunction(a, b, lambdaFunction)
}

/**
 * Closure means that lambda can access
 * in scope variables (in this case 'sum')
 */
fun closure(): Int
{
    var sum = 0
    (1..10).forEach { sum += it }
    return sum
}
