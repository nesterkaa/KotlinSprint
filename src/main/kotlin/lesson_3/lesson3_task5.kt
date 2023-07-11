package lesson_3

fun main( )
{
    val  initialString = "D2-D4;0"

    val partString = initialString.split(';')

    val movies = partString[0].split('-')

    val moveFrom = movies[0]
    val moveTo = movies[1]
    val moveNumber = partString[1]


    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}