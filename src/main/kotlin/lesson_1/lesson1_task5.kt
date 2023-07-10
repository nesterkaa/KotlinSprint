package lesson_1

import kotlin.time.Duration.Companion.hours

fun main() {
    val initialSeconds: Short = 6480

    val hours: Int = initialSeconds / 3600
    val minutes: Int = (initialSeconds % 3600) / 60
    val seconds: Int = (initialSeconds % 3600) % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}