/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * Kotlin maps: transform a list into another list
 */
fun maps(): String {
    val listStrings = listOf("aaa", "bbb", "ccc")

    println("Initial List: ")
    printList(listStrings)

    val listIndexes =
        listStrings.mapIndexed { i, s ->
            (i + 1).toString() + ") " + s
        }

    printList(listIndexes)

    val listX =
        listStrings.map {
            "X$it"
        }

    printList(listX)
    return listX[0]
}

/**
 * Kotlin take: take first n elements from a list
 */
fun take(): Int {
    val list = listOf(1, 2, 3, 4, 5, 6)

    val firstThree = list.take(3)
    printList(firstThree)

    val firstSix = list.take(7)
    printList(firstSix)

    return firstSix[0]
}

/**
 * Kotlin each: iterate over a list
 */
fun each(): Int {
    val listInt = listOf(1, 3, 5, 6, 77)
    val listItems = listOf("One", "Two", "Three")

    var sum = 0
    listInt.forEach { i -> sum += i }

    println()
    listItems.forEachIndexed { i, it ->
        println((i + 1).toString() + "> " + it)
    }

    println()
    println("Sum = $sum")

    // Take a list and build another list of another type
    val anotherList = ArrayList<String>()
    listInt.forEach { anotherList.add("*$it*") }
    printList(anotherList)

    return sum
}

/**
 * Kotlin filter: filter a list
 */
fun filter(): Int {
    val listInt = listOf(1, 3, 5, 6, 77)

    val filteredList = listInt.filter { it % 2 == 0 }

    val sum = filteredList.sum()

    println()
    println("Sum = $sum")

    return sum
}

fun printList(listItems: List<Any>) {
    println()
    for (item in listItems) {
        print(item.toString())
        print(" ")
    }
}
