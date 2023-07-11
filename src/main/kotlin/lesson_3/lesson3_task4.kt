package lesson_3

fun main ( )
{
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    println("$moveFrom-$moveTo;$moveNumber")

    moveFrom  = moveTo
    moveTo = "D2"
    moveNumber++

    println("$moveFrom-$moveTo;$moveNumber")
}