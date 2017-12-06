/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-17 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

class Polygon(sides: Int) {

    // Getters / Setters
    var numberOfSides = sides

    /**
     * The companion method can be called as
     * Polygon.create(4)
     */
    companion object Factory {
        fun create(sides: Int): Polygon = Polygon(sides)
    }

}

