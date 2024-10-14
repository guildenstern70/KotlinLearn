/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

import java.util.*

/**
 * Null Safety
 */
object NullSafety {
    private const val given_words = "-ONE-,-TWO-,-THREE-,-FOUR-"
    var words = ArrayList<String>()

    fun storeWords() {
        var sum = 0

        val strTok = StringTokenizer(given_words, ",")
        while (strTok.hasMoreElements()) {
            val word: String = strTok.nextElement() as String
            this.words.add(this.stripVirg(word))
            sum++
        }
        println("Stored $sum words.")
    }

    fun runIfNotNull() {
        val isNull = null
        isNull?.let {
            println("Null is effectively null.")
        }
    }

    private fun stripVirg(word: String): String = word.substring(1, word.length - 1)
}
