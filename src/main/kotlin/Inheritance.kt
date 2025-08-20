/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

class Student(
    firstName: String,
    lastName: String,
) : Person(firstName, lastName) {
    constructor(p: Person) : this(p.name, p.surname)

    override fun hello() {
        val name = this.toString()
        println("Hello, my name is $name and I'm a student.")
    }
}

class StudentShortcut(
    private val firstName: String,
    private val lastName: String,
) : Person(firstName, lastName)
