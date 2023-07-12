package lesson_4

fun main() {
    val isSunWeather = true
    val isOpenTent = true
    val airHumidity = 20
    val season = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isSunWeather == IS_SUN_WEATHER
                    && isOpenTent == IS_OPEN_TENT && airHumidity == AIR_HUMIDITY && season != BAD_SEASON
        }"
    )

}

const val IS_SUN_WEATHER = true
const val IS_OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val BAD_SEASON = "winter"