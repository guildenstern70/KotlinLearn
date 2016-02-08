/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-16 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * A data class is a short-hand for a class that holds
 * just data. It automatically gets:
 * - equals
 * - hashCode
 * - toString
 * - copy
 * - componentN
 */
data class User(val name: String, val surname: String, val age: Int)



