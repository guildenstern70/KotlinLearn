/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
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
    var sum = value  // Used for testing purposes

    // Array creation function
    val otherInts = Array(5) { i -> (i * i) }

    // Mutables
    val mutInt: ArrayList<Int> = ArrayList()
    mutInt.add(5)
    mutInt.add(6)
    mutInt.add(7)

    val mutStrings = mutableListOf<String>()
    mutStrings += "One"
    mutStrings += "Two"
    mutStrings += "Three"

    // Check if item is in collection
    if ("Two" in mutStrings)
    {
        sum += 77
    }

    // Check if collection is not empty
    if (mutStrings.isNotEmpty())
    {
        sum -= 14
    }

    // HashMap
    val dictionary: HashMap<String, String> =
        hashMapOf(
            "-x" to "One X",
            "-xx" to "Two X"
        )

    // Add to dictionary
    dictionary["-kj"] = "Kappa Jay"

    if ("-xx" in dictionary)
    {
        sum -= 4
    }

    // Remove from dictionary
    dictionary -= "-xx"
    if ("-xx" in dictionary)
    {
        sum -= 4
    }

    // Iterate dictionary
    val sb = StringBuilder()
    for ((k, v) in dictionary)
    {
        sb.append("$k = $v")
    }

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
