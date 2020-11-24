package main.kotlin.chapter2DataTypes._02_03.end

fun firstOperand(): Boolean {
    println("firstOperand")
    return false
}

fun secondOperand(): Boolean {
    println("secondOperand")
    return true
}

fun main() {
    // demoBoolean()
    demoChar()
}

fun demoBoolean() {
    val willExercise = false
    val bigNumber = 1_000_000
    val smallNumber = 2
    println("Is big bigger = ${bigNumber > smallNumber}")

    if (firstOperand() || secondOperand()) println("at least one operand is true")
    if (firstOperand() && secondOperand()) println("Both operands are true")
    println("Will exercise = ${!willExercise}")
}

private fun demoChar() {
    val letter: Char = 'A'
    val tab = "\t"
    val infinity = "\u221E"

    println("Letter = $letter")
    println("Tabbed $tab over")
    println("Infinity = $infinity")

   val lineFeed = 10.toChar()
    println("lineFeed = $lineFeed next line")
}