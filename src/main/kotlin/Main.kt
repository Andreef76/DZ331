var time = 1901

fun main() {
    println("был(а) ${agoToText()}")
}

fun timeInMinutes(): String {
    val minute = time / 60
    val resalt = if (minute % 10 == 1 && minute % 100 != 11) "минуту" else if (minute % 10 == 2 || minute % 10 == 3 || minute % 10 == 4) "минуты" else "минут"
    return "$minute $resalt назад"
}

fun timeInHours(): String {
    val hour = time / 3600
    val resalt = if (hour % 10 == 1 && hour % 100 != 11) "час" else if (hour > 4 && hour < 21) "часов" else "часа"
    return "$hour $resalt назад"
}

fun agoToText(): String {
    return when {
        (time >= 0 && time <= 60) -> "только что"
        (time > 60 && time <= 60 * 60) -> timeInMinutes()
        (time > 60 * 60 && time <= 24 * 60 * 60) -> timeInHours()
        (time > 24 * 60 * 60 && time <= 48 * 60 * 60) -> "вчера"
        (time > 48 * 60 * 60 && time <= 72 * 60 * 60) -> "позавчера"
        else -> "давно"
    }
}

