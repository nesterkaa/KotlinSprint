package lesson_4

fun main() {

    val reservationToday = 13
    val reservationTomorrow = 9

    println("Доступность столиков на сегодня: ${TABLES != reservationToday} \nДоступность столиков на завтра: ${TABLES != reservationTomorrow}")

}

const val TABLES = 13