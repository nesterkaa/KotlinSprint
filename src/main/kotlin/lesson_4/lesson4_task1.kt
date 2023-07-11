package lesson_4

fun main() {
    val tables = 13
    val reservationToday = 13
    val reservationTomorrow = 9

    println("Доступность столиков на сегодня: ${tables != reservationToday} \nДоступность столиков на завтра: ${tables != reservationTomorrow}")

}