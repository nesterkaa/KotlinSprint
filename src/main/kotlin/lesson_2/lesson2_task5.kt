package lesson_2

import kotlin.math.pow

fun main() {
    val clientSum = 70000.0
    println("Введите процентную ставку")
    val percentRate = readln().toDouble()
    println("Введите промежуток времени (в годах)")
    val times = readln().toInt()

    val resultSum = clientSum * (1 + percentRate / 100.0).pow(times)

    println(String.format("%.3f", resultSum))

}