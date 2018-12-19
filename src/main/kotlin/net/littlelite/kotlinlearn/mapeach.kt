/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-18 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 *
 */
fun maps(): String {

    val listStrings = listOf("aaa", "bbb", "ccc")

    println("Initial List: ")
    printList(listStrings)

    val listIndexes = listStrings.mapIndexed {
        i, s ->
        (i + 1).toString() + ") " + s
    }

    printList(listIndexes)

    val listX = listStrings.map {
        "X$it"
    }

    printList(listX)
    return listX[0]
}

fun take(): Int {

    val list = listOf(1, 2, 3, 4, 5, 6)

    val firstThree = list.take(3)
    printList(firstThree)

    val firstSix = list.take(7)
    printList(firstSix)

    return firstSix[0]
}

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
    listInt.forEach {
        item ->
        anotherList.add("*" + item.toString() + "*")
    }
    printList(anotherList)

    return sum
}

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