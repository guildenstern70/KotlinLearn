/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

import java.io.File
import java.util.*

fun createRandomTextFile()
{

    val sb = StringBuilder()
    val rndGen = Random()
    for (k in 1..10)
    {
        sb.append(rndGen.nextInt(99999))
        sb.append(',')
    }

    val theFile = File("tempfile.txt")
    if (theFile.exists())
    {
        theFile.delete()
    }
    theFile.writeText(sb.toString())
}

fun readFileLineByLine(): Int
{
    val theFile = File("tempfile.txt")
    var count = 0

    if (theFile.exists())
    {
        theFile.forEachLine { line: String ->
            println(line)
            count++
        }
    } else
    {
        println("File not found.")
    }

    println("Lines read: $count")

    return count
}

fun sumContentsOfFile(): Int
{
    var sum = -1
    val theFile = File("tempfile.txt")
    if (theFile.exists())
    {

        val contents = theFile.readText()
        val strTk = StringTokenizer(contents, ",")
        while (strTk.hasMoreElements())
        {
            val tmp: String? = strTk.nextElement() as? String
            val itmp = Integer.parseInt(tmp)
            sum += itmp
        }
    } else
    {
        println("File not found.")
    }

    return sum
}
