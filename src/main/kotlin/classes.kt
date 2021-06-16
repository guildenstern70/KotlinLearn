/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2020 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * An example of a class of Persons
 */
open class Person(firstName: String, lastName: String)
{

    // Getters / Setters
    var name = firstName
    var surname = lastName

    // The primary constructor cannot have any code
    // Initializer instructions can go into
    init
    {
        // logger.info...
    }

    // Runtime computed getter
    val isPippo: Boolean
        get() = (this.name == "Pippo")

    // Secondary constructor
    constructor() : this("", "")

    // Property
    var fullName = "$firstName $lastName"

    open fun hello()
    {
        val name = this.toString()
        println("Hello, my name is $name")
    }

    private fun changeName()
    {
        this.name = "Pippo"
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append(this.name)
        sb.append(' ')
        sb.append(this.surname)
        return sb.toString()
    }
}

class Student(firstName: String, lastName: String) :
        Person(firstName, lastName)
{

    constructor(p: Person) : this(p.name, p.surname)

    override fun hello()
    {
        val name = this.toString()
        println("Hello, my name is $name and I'm a student.")
    }
}

class StudentShortcut(private val firstName: String, private val lastName: String) :
        Person(firstName, lastName)