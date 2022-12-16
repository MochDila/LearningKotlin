package Chapter3

fun main() {
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinatesInference = Pair(2,2)
    val coordinatesWithTo = 2 to 3
    val coordinatesDouble = Pair(2.0, 3.0)
    val coordinatesMixed = Pair(2.5, 3)
    val x1 = coordinatesMixed.first
    val y1 = coordinatesMixed.second
    val (x, y) = coordinatesMixed

    // Triple
    val coordinates3D = Triple(1, 2, 3)
    val (x3, y3, z3) = coordinates3D

    // Equivalent new constants
    val x4 = coordinates3D.first
    val y4 = coordinates3D.second
    val z4 = coordinates3D.third

    // Ignore a certain element
    val (x5, _, z5) = coordinates3D

    // Mini Exercises
    // 1
    val date: Triple<String, String, String> = Triple("month", "day", "year")

    // 2
    var month = date.first
    val day = date.second
    val year = date.third

    // 3
    val (readMonth, _, readYear) = date

    // 4
    month = "Month consists of 31 days"
    val updateTriple = Pair(month, year)
    println(updateTriple)
}