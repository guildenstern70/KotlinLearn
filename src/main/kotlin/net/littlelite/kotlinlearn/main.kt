/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2020 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

const val VERSION: String = "0.3.1"

fun main(args: Array<String>)
{
    println()
    println("Kotlin Learn v.$VERSION")
    println()
    println("Run tests to check output.")
    if (args.isNotEmpty())
    {
        for (arg in args)
        {
            println("Arg = $arg")
        }
    }
}
