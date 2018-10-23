/**
 *
 * KOTLIN LEARN
 *
 * MIT License (MIT)
 * Copyright (c) 2015-18 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

open class Person(firstName: String, lastName: String) {

    // Getters / Setters
    var name = firstName
    var surname = lastName

    // The primary constructor cannot have any code
    // Initializer instructions can go into
    init {
        // logger.info...
    }

    // Secondary constructor
    constructor() : this("", "")

    open fun hello() {
        val name = this.toString()
        println("Hello, my name is $name")
    }

    private fun changeName() {
        this.name = "Pippo"
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(this.name)
        sb.append(' ')
        sb.append(this.surname)
        return sb.toString()
    }
}

class Student(firstName: String, lastName: String) : Person(firstName, lastName) {

    constructor(p: Person) : this(p.name, p.surname)

    override fun hello() {
        val name = this.toString()
        println("Hello, my name is $name and I'm a student.")
    }
}

class StudentShortcut(private val firstName: String, private val lastName: String) :
        Person(firstName, lastName)