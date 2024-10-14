package net.littlelite.kotlinlearn

/**
 * Kotlin val and vars.
 *
 * Val is "immutable box", var is "mutable box"
 * Val cannot be reassigned, var can.
 * Val is like a final variable in Java (like, but not the same)
 * Val is faster than var
 * Val is thread-safe
 * Val is more readable
 * Val is more predictable
 * Val is more secure
 */
fun valandvars() {
    val name = "Alessio"
    var age = 45
    age = 46
    println("Name: $name, Age: $age")
}
