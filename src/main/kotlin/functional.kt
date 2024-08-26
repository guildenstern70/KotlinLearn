package net.littlelite.kotlinlearn

import java.time.LocalDate
import java.util.*

/*
 * (*) Pure functions. By definition, pure functions have the same return values for the same input, and there are no side effects
 * (such as updating other local variables and invoking I/O). For example, all mathematical functions, such as sum, max, and average, are pure functions.
 *
 * (*) Immutable states. Compared to mutable states we are familiar with–such as a variable that can be reassigned to any values or
 * an array that we can insert or remove any values during runtime–immutable states are not modifiable after they have been created or assigned a value.
 *
 * (*) Function composition. As the word “composition” suggests, function composition refers to combining simple functions to
 * build more complicated functions. In practice, the output of a function becomes the input of another function, which yields an
 * output that is used for the input of another function, and so on.
 */

data class Delivery(
    val id: Int,
    val basePay: Double,
    val customerTip: Double,
    val dropOffTime: LocalDate
)

// Old non-functional way
fun nonFunctional(): List<Delivery>
{
    val deliveries = getDeliveries()

    // Filter by customerTip > 5
    val filteredDeliveries = mutableListOf<Delivery>()
    for (delivery: Delivery in deliveries) {
        if (delivery.customerTip > 5) {
            filteredDeliveries.add(delivery)
        }
    }

    println("Filtered deliveries:")
    printDeliveries(filteredDeliveries)

    // Sort by delivery.dropOffTime descending
    Collections.sort(
        filteredDeliveries,
        getCalendarComparator()
    )

    println("Filtered and sorted deliveries:")
    printDeliveries(filteredDeliveries)

    val firstThreeDeliveries = mutableListOf<Delivery>()
    for (i in 0..< 3) {
        firstThreeDeliveries.add(filteredDeliveries.get(i))
    }

    println("Filtered and sorted and first three deliveries:")
    printDeliveries(firstThreeDeliveries)

    return firstThreeDeliveries
}

fun functional(): List<Delivery> {
    val firstThreeDeliveries = getDeliveries()
        .filter { it.customerTip > 5 }
        .sortedBy { it.dropOffTime }
        .take(3)

    println("Filtered and sorted and first three deliveries:")
    printDeliveries(firstThreeDeliveries)

    return firstThreeDeliveries

}

fun getDeliveries(): List<Delivery> {
    return listOf(
        Delivery(
            10,
            10.0,
            5.5,
            LocalDate.parse("2018-12-12")

        ),
        Delivery(
            11,
            12.0,
            3.0,
            LocalDate.parse("2018-08-24")
        ),
        Delivery(
            12,
            10.0,
            6.0,
            LocalDate.parse("2020-01-15")
        ),
        Delivery(
            13,
            10.0,
            8.0,
            LocalDate.parse("2017-12-19")
        ),
        Delivery(
            14,
            10.0,
            6.5,
            LocalDate.parse("2018-05-22")
        ),
        Delivery(
            15,
            10.0,
            7.0,
            LocalDate.parse("2018-06-02")
        )
    )
}

fun getCalendarComparator(): Comparator<Delivery> {
    return Comparator { o1, o2 -> o1.dropOffTime.compareTo(o2.dropOffTime) }
}

fun printDeliveries(deliveries: List<Delivery>) {
    for (delivery in deliveries) {
        println("- $delivery")
    }
}