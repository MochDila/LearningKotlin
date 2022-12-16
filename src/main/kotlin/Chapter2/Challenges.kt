package Chapter2

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    // Challenges 1
    val exercises = 9
    var exercisesSolved = 0
    exercisesSolved++

    // Challenges 2
    var age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved++

    // Challenges 3
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 10)
    exercisesSolved++

    // Challenges 4
    val number4 = (5 * 3) - (4 / 2) * 2
    exercisesSolved++

    // Challenges 5
    val number5a: Double = 20.0
    val number5b: Double = 10.0
    val averageNumber5: Double = number5a + number5b / 2
    exercisesSolved++

    // Challenges 6
    val fahrenheit:Double = 12.0
    val celcius:Double = (fahrenheit - 32) * 5 / 9
    exercisesSolved++

    // Challenges 7
    val number7 = 63
    val row = number7 / 8
    val column = number7 % 8
    exercisesSolved++

    // Challenges 8
    val degrees:Double = 21.0
    val radians:Double = (degrees/ 180) * PI
    exercisesSolved++

    // Challenges 9
    val x1: Double = 1.0
    val y1: Double = 1.0
    val x2: Double = 3.0
    val y2: Double = 3.0
    val dx: Double = x2 - x1
    val dy: Double = y2 - y1
    val distance: Double = sqrt(dx * dx + dy * dy)
    exercisesSolved += 1
}