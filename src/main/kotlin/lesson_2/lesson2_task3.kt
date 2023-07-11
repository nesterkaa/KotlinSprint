package lesson_2

fun main(){
    var hour = 9
    var minutes = 39
    val travelTime = 457

    hour +=travelTime/60
    minutes += travelTime%60

    if (minutes >= 60)
    {
        hour+= 1
        minutes-=60
    }

    println("Время прибытия поезда - $hour:$minutes")


}