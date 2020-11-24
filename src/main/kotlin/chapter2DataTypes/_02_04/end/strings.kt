package main.kotlin.chapter2DataTypes._02_04.end

fun main() {
    val greeting: String = "Hello there"
    val owe = 50

    println("$greeting, I owe Janet \$$owe dollars")
    val infinity = "The infinity symbol is \u221E"
    println(infinity)

    println("[$greeting] is ${greeting.length} characters long")

    var bad = greeting[2]
    val letter = greeting[1]

    val compare1 = "beta"
    val compare2 = "alpha"

    println("${compare1.compareTo(compare2)}")

    val sub = greeting.subSequence(6, 9)
    for (single in greeting) {
        println("$single ")
    }
    val myString = """
        Kotlin is fun.
        Kotlin is pragmatic
    """.let { println(it) }

    myString.run { println(this) }
}