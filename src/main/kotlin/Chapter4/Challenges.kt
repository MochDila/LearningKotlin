package Chapter4
import kotlin.math.sqrt
import kotlin.math.log2
fun main() {
    // 1
    val firstName = "Joe"
    var lastName = ""
    if (firstName == "Howard"){
        lastName = "Lucas"
    } else if (firstName == "Ray"){
        lastName = "Wenderlich"
    } else {
        lastName = "Biden"
    }
    val fullName = firstName + " " + lastName

    // 2
    val answer1 = true && true // true
    val answer2 = false || false // false
    val answer3 = (true && 1 != 2) || (4 > 3 && 100 < 1) // true
    val answer4 = ((10 / 2) > 3) && ((10 % 2) == 0) // true

    // 3
    val row = 7
    val column = 7

    var nextRow = row
    var nextColumn = column + 1
    if (nextColumn > 7){
        nextColumn = 0
        nextRow += 1
    }
    if (nextRow > 7) {
        nextRow = 0
    }
    println("The position ater ($row, $column) is ($nextRow, $nextColumn)")

    // 4
    val a = 1.0
    val b = -5.0
    val c = 6.0

    val d = b * b - 4 * a * c
    if (d > 0) {
        val x1 = (-b + sqrt(d)) / (2 * a)
        val x2 = (-b - sqrt(d)) / (2 * a)
        println("The solutions are $x1 and $x2")
    } else if (d.equals(0.0)) {
        val x = -b / (2 * a)
        println("Both solutions are $x")
    } else {
        println("This equation has no solutions")
    }

    // 5
    val month = "february"
    val year = 2022

    if (month == "january" || month == "march" || month == "may" || month == "july" ||
        month == "august" || month == "october" || month == "december") {
        println("This month has 31 days")
    } else if (month == "april" || month == "june" || month == "september" || month == "november"){
        println("This month has 30 days")
    } else if (month == "february" && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
        println("This month has 29 days")
    } else if (month == "february") {
        println("This month has 28 days")
    } else {
        println("Invalid month")
    }

    // 6
    val number6: Double = 4.0
    if (number6.toInt() % 2 == 0) {
        println("$number6 is a power of 2")
    } else {
        println("$number6 is not a power of 2")
    }

    // 7
    var exponent = 0
    var power = 1
    while (exponent <= 10){
        println("$exponent, $power")
        exponent++
        power *= 2
    }

    // 8
    val goal = 8
    var current = 1
    var previous = 1
    var done = 2
    while (done < goal){
        val next = current + previous
        previous = current
        current = next
        done++
    }
    println("Fibonnacci number $goal is $current")

    // 9
    val n = 5
    var accumulator = 1
    done = 1
    while (done < n){
        done++
        accumulator *= done
    }
    println("$n! is $accumulator")

    // 10
    val targerValue = 7
    var combinationFound = 0
    var valueOnFirstDice = 1
    while (valueOnFirstDice <= 0){
        var valueOnSecondDice = 1
        while (valueOnSecondDice <= 6){
            if (valueOnFirstDice + valueOnSecondDice == targerValue){
                combinationFound++
            }
            valueOnSecondDice++
        }
        valueOnFirstDice++
    }
    val percentage = (combinationFound.toDouble() / 36 * 100).toInt()
    println("The odd of rolling a $targerValue are $combinationFound is 36 or $percentage")
}