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

fun ranges() {

    var i = 0
    var x = 0
    var str = "islb"

    for (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println(i)
    }

    for (i in 1..4 step 2) print(i) // prints "13"

    if (x !in 1.0..3.0) println(x)

    if (str in "island".."isle") println(str)

}