package lesson_4

fun main() {
    val averageFrom = 35
    val averageTo = 100
    val averageVolume = 100

    val testDataKg1 = 20
    val testDataVolume1 = 80

    val testDataKg2 = 50
    val testDataVolume2 = 100

    println(
        "Груз с весом $testDataKg1 кг и объемом $testDataVolume1 л соответствует категории " +
                "'Average': ${((testDataKg1 >= averageFrom) and (testDataKg1 <= averageTo)) and (testDataVolume1 < averageVolume)}"
    )
    println(
        "Груз с весом $testDataKg2 кг и объемом $testDataVolume2 л соответствует категории " +
                "'Average': ${((testDataKg2 >= averageFrom) and (testDataKg2 <= averageTo)) and (testDataVolume2 < averageVolume)}"
    )
}