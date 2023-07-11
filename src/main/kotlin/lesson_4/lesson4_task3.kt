package lesson_4

fun main() {
    val isSunWeather = true
    val isOpenTent = true
    val airHumidity = 20
    val season = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunWeather && isOpenTent && airHumidity == 20 && season != "winter"}")

}