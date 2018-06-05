/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-18 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

interface InterfaceWProperties {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : InterfaceWProperties {
    override val prop: Int = 29
}

fun InterfaceTest() : Int
{
    val child = Child()
    return child.prop
}
