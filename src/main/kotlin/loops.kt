/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn


fun loops() : Int {

    var sum : Int = 0

    for (j in Array(10, {i -> i})) {
        print(j.toString())
        print(' ')
        sum += j
    }

    println()

    var k=0;
    while (k<10) {
        print(k++.toString())
        print(' ')
        sum += k
    }

    return sum // should be 100

}