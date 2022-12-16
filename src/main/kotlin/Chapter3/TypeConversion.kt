package Chapter3

fun main() {
    var integer: Int = 100
    var decimal: Double = 12.0
    // integer = decimal -> Error
    integer = decimal.toInt()

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 100
    // val totolCost: Double = hourlyRate * hoursWorked.toDouble() -> unnecessary
    val totalCost = hourlyRate * hoursWorked
}