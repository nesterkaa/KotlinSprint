package lesson_3

fun main( ) {
    println("Введите число")
    val number = readln().toInt()

    val multiString ="""
        |1 x $number = ${1 * number}
        |2 x $number = ${2 * number}
        |3 x $number = ${3 * number}
        |4 x $number = ${4 * number}
        |5 x $number = ${5 * number}
        |6 x $number = ${6 * number}
        |7 x $number = ${7 * number}
        |8 x $number = ${8 * number}
        |9 x $number = ${9 * number}
        |10 x $number = ${10 * number}

        """.trimMargin()

    println(multiString)
}
