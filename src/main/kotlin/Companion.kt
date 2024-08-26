/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

class Companion(sides: Int)
{

    // Getters / Setters
    var numberOfSides = sides

    /**
     * The companion method can be called as
     * Companion.create(4)
     */
    companion object Factory
    {
        fun create(sides: Int): Companion = Companion(sides)
    }
}
