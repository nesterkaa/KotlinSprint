package lesson_2

fun main(){
    val percentBuff = 20
    val crystal = 7
    val iron = 11

    val bonusCrystal = crystal/100.0 * percentBuff
    val bonusIron = iron/100.0 * percentBuff

    println("Бонусные кристаллы - ${bonusCrystal.toInt()}")
    println("Бонусное железо - ${bonusIron.toInt()}")



}