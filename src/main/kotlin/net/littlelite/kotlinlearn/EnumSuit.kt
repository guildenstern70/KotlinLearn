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
 * Enum class
 */
enum class EnumSuit {
    SPADE,
    CLUB,
    HEART,
    DIAMOND;

    override fun toString(): String
    {
        return when (this) {
            SPADE -> "Spades"
            CLUB -> "Clubs"
            HEART -> "Hearts"
            else -> "Diamonds"
        }
    }
}
