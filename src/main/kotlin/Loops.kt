/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

fun loops(): Int {
    var sum = 0

    for (j in Array(10) { i -> i }) {
        print(j.toString())
        print(' ')
        sum += j
    }

    println()

    var k = 0
    while (k < 10) {
        print(k++.toString())
        print(' ')
        sum += k
    }

    return sum // should be 100
}

fun arraysWithIndices(): Int {
    val fruits = listOf("Banana", "Apple", "Mango")
    var sum = 0
    println()

    for ((index, value) in fruits.withIndex()) {
        sum += index
        println("the element at $index is $value")
    }

    return sum
}

fun breakloop(): Int {
    val commands = listOf("Start", "Stop", "Restore")
    var commandFound = 0

    // LoopCommands is a break label
    loopcommands@ for ((index, command) in commands.withIndex()) {
        if (command == "Stop") {
            commandFound = index
            break@loopcommands
        }
    }

    return commandFound
}

fun forEachIndexed(): Int {
    val collection = listOf("Banana", "Apple", "Mango")
    var sum = 0
    collection.forEachIndexed { index, element ->
        sum += index
        print("$index => $element")
    }
    return sum
}

fun ranges() {
    val x = 0
    val str = "islb"

    for (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println(i)
    }

    for (i in 1..4 step 2) print(i) // prints "13"

    println((1..100).random()) // prints random nr between 1 and 100

    if (x !in 1..3) println(x)

    if (str in "island".."isle") println(str)
}
