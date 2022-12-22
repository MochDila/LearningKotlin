import java.util.*

fun main() {

    // COMPARISON OPERATORS

    //val yes: Bool = true
    //val no: Bool = false
    val yes = true
    val no = false

    val doesOneEqualTwo = (1 == 2)
    val doesOneNotEqualTwo = (1 != 2)
    val alsoTrue = !(1 == 2)
    val isOneGreaterThanTwo = (1 > 2)
    val isOneLessThanTwo = (1 < 2)

    val and = true && true
    val or = true || false

    val andTrue = 1 < 2 && 4 > 3
    val andFalse = 1 < 2 && 3 > 4

    val orTrue = 1 < 2 || 3 > 4
    val orFalse = 1 == 2 || 3 == 4

    val andOr = (1 < 2 && 3 > 4) || 1 < 4

    val guess = "dog"
    val dogEqualsCat = guess == "cat"

    val order = "cat" < "dog"
    println("ORDER = " + order)

    // COMPARISON OPERATORS
    /*
    1. Create a constant called myAge and set it to your age.Then, create a constant called isTeenager that uses Boolean
    logic to determine if the age denotes someone in the age range of 13 to 19.
    */

    val myAge = 30
    val isTeenager = myAge >= 13 && myAge <= 19

    /*
    2. Create another constant called theirAge and set it to the age 30. Then, create a constant called
    bothTeenagers that uses Boolean logic to determine if both you and them are teenagers.
    */

    val theirAge = 30
    val bothTeenagers = theirAge >= 13 && theirAge <= 19 && isTeenager

    /*
    3. Create a constant called reader and set it to your name as a string. Create a constant called author and set it to
    the name, Richard Lucas. Create a constant called authorIsReader that uses string equality to determine if reader and
    author are equal.
    */

    val reader = "Joe Bloggs"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    /*
    4. Create a constant called readerBeforeAuthor which uses string comparison to determine if reader comes before
    author.
    */

    val readerBeforeAuthor = reader < author

    // IF-STATEMENTS
    if (2 > 1) {
        println("Yes, 2 is greater than 1.")
    }

    val animal = "Fox"
    if (animal == "Cat" || animal == "Dog") {
        println("Animal is a house pet.")
    } else {
        println("Animal is not a house pet.")
    }

    // TERNARY OPERATOR
    val a = 5
    val b = 10

    /*
    val min: Int
    if (a < b) {
    min = a
    } else {
    min = b
    }
    */
    val min = if (a < b) a else b

    /*
    val max: Int
    if (a > b) {
    max = a
    } else {
    max = b
    }
    */

    val max = if (a > b) a else b

    val hourOfDay = 12

    val timeOfDay = if (hourOfDay < 6) {
        "Early morning"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "INVALID HOUR!"
    }
    println(timeOfDay)

    val name = "Dick Lucas"

    if (1 > 2 && name == "Dick Lucas") {
        // ...
    }

    if (1 < 2 || name == "Dick Lucas") {
        // ...
    }

    // SCOPE
    var hoursWorked = 45

    var price = 0
    if (hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
    }
    price += hoursWorked * 25

    println(price)
    //println(hoursOver40)

    // IF STATEMENTS
    /*
    1. Create a constant called myAge and initialize it with your age. Write an if statement to print out Teenager if
    your age is between 13 and 19, and Not a teenager if your age is not between 13 and 19.
    */

    // val myAge = 30
    if (myAge >= 13 && myAge <= 19) {
        println("Teenager")
    } else {
        println("Not a teenager")
    }

    /*
    2. Create a constant called answer and use a single line if-else statement to set it equal to the result you print out for the
    same cases in the above exercise. Then print out answer.
    */
    val answer = if (myAge >= 13 && myAge <= 19) "Teenager" else "Not a teenager"
    println(answer)

    // WHILE LOOPS
    var sum = 1

    while (sum < 1000){
        sum = sum + (sum + 1)
    }

    // REPEAT WHILE LOOPS
    sum = 1

    do {
        sum = sum + (sum + 1)
    } while (sum < 1)

    // BREAKING OUT OF A LOOP
    sum = 1

    while (true){
        sum = sum + (sum + 1)
        if (sum >= 1000){
            break
        }
    }

    // MINI EXERCISES
    var counter = 0

    while (counter < 10){
        println("Counter is $counter")
        counter++
    }

    counter = 0
    var roll = 0
    do {
        roll = Random().nextInt(6)
        counter += 1
        println("After $counter roll(s), roll is $roll")
    } while (roll != 0)
}