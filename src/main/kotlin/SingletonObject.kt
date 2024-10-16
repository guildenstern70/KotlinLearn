/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * Singleton object
 */
object SingletonObject {
    const val ID = "234"

    fun hello() {
        println("Hello I am object #$ID")
    }
}
