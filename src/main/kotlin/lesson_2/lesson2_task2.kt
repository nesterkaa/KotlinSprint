package lesson_2

fun main(){
    val personals = 50
    val personalWages = 30000
    val interns = 30
    val internWages = 20000

    val personalsWages = personals * personalWages
    val internsWages = interns * internWages
    val averageWages = (personals * personalWages) + (interns * internWages)
    val averageWage = (personalsWages + internsWages ) / (personals + interns)

    println(personalsWages)
    println(averageWages)
    println(averageWage)
}