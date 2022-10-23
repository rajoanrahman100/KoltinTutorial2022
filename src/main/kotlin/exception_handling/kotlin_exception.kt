package exception_handling

import java.lang.Exception

// Todo: Two Types of Exception
/**
 * Checked:  Exceptions that are typically set on methods and checked at the compile time,
for example IOException, FileNotFoundException etc
 * UnChecked Exception: Exceptions that are generally due to logical errors and checked at the run time,
for example NullPointerException, ArrayIndexOutOfBoundException etc
 */
/**
 * But For Kotlin,we've only unchecked exception
 */

fun main() {
    calculate()
}

fun calculate() {
    var a = 10

    try {
        var sum = a / 0
        println(sum)
    } catch (e: Exception) {
        println("$a can not divided by ZERO")
    }
}