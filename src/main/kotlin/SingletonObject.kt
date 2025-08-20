/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * Singleton object
 */
object SingletonObject {
    const val id = "234"

    fun hello() {
        println("Hello I am object #$id")
    }
}
