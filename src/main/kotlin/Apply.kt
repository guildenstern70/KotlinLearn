/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

class Book {
    lateinit var title: String
    lateinit var author: String
}

// You may use apply to set object properties
fun applyBook(): String {
    val book1 =
        Book().apply {
            title = "La Divina Commedia"
            author = "Dante Alighieri"
        }

    return book1.author
}
