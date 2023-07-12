package lesson_3

fun main() {
    val initialString = "D2-D4;0"

    val partString = initialString.split(';', '-')

    val moveFrom = partString[0]
    val moveTo = partString[1]
    val moveNumber = partString[2]


    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}