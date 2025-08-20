/*
 *  KOTLIN LEARN
 *
 *  MIT License (MIT)
 *  Copyright (c) 2015-2025 Alessio Saltarin
 *
 */

package net.littlelite.kotlinlearn

/**
 * Sum function return int. This a PURE FUNCTION.
 * - Deterministic: Given the same input, it always produces the same output.
 * - No side effects: It doesn't modify any external state (variables, objects, files, etc.) outside of its scope.
 * - Referentially transparent: You can replace a function call with its return value without
 *   affecting the program's behavior.
 */
fun sum(
    a: Int,
    b: Int,
): Int = a + b

/**
 * Multiply function return int (inline)
 */
fun multiply(
    a: Int,
    b: Int,
): Int = a * b

/**
 * Subtract function (inline)
 */
fun substract(
    a: Int,
    b: Int,
): Int = a - b
