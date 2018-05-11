/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-17 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * Singleton object
 */
object AnObject {

    const val id = "234"

    fun hello() {
        println("Hello I am object #$id")
    }

}
