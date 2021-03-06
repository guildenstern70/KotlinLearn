/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2020 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
Collections
 */
fun collections(): Int
{

    // Immutables
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val listInts: List<Int> = listOf(1, 2, 3) // ordered

    // Access array item
    val value = ints[2]

    // Array creation function
    val otherInts = Array(5) { i -> (i * i) }

    // Mutables
    val mutInt: ArrayList<Int> = ArrayList()
    mutInt.add(5)
    mutInt.add(6)
    mutInt.add(7)

    val mutStrings = mutableListOf<String>()
    mutStrings.add("One")
    mutStrings.add("Two")
    mutStrings.add("Three")

    // HashMap
    val dictionary: HashMap<String, String> =
            hashMapOf("-x" to "One X",
                    "-xx" to "Two X")

    val sb = StringBuilder()

    for ((k, v) in dictionary)
    {
        sb.append("$k = $v")
    }

    var sum = value

    // Slice
    val intSlice = ints.toList().slice(1..2)
    val listSlice = listInts.slice(1..2)

    for (k in intSlice)
    {
        for (i in listSlice)
        {
            for (j in otherInts)
            {
                sum += (i + k + j)
            }
        }
    }

    for (k in mutInt)
    {
        sum += k
    }

    return sum
}
