/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2024 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

interface Shape {
    fun area(): Int
}

class Rectangle(
    private val width: Int,
    private val height: Int,
) : Shape {
    override fun area() = width * height
}

class Window(
    private val bounds: Shape,
) : Shape by bounds

/**
 * Delegation:
 * object 'window' delegates to object 'rectangle'
 * the implementation of 'area()'
 */
fun windowArea(): Int {
    val rectangle = Rectangle(10, 20)
    val window = Window(rectangle)
    val windowArea = window.area()
    println("The area of the window is $windowArea")
    return windowArea
}
