package lesson_5

fun main() {
    val number1 = 7
    val number2 = 46
    println("Чтобы доказать что вы не бот, необходимо сложить два числа: $number1 и $number2 ")

    val userSum = readln().toInt()

    if (userSum == (number1 + number2)) println("Добро пожаловать")
    else println("Доступ запрещен")
}