package Chapter3

fun main() {
    val characterA: Char = 'a'
    val stringFish: String = "Fish"

    val stringCat = "cat"
    var message = "Hello" + "My name is "
    val name = "Dila"
    message += name // HelloMy name is Dila

    val exlamationMark = '!'
    message += exlamationMark // HelloMy name is Dila!

    message = "Hello $exlamationMark" // Hello !

    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One Third is $oneThird as a decimal" // One Third is 0.3333333333333333 as a decimal

    val alsoOneThirdLongString = "One Third is ${1.0 / 3.0} as a decimal" // One Third is 0.3333333333333333 as a decimal

    val bigString = """
        Hello
        My Name is Dila
        but My Friend
        call me Bedul 
    """.trimIndent()

    // Mini Exercises
    // 1
    val firstName = "Muhammad"
    val lastName = "Dila"

    // 2
    val fullname = "$firstName \b $lastName"

    // 3
    val myDetail = """
        Hello, my name is $fullname
        I was born in Bandung
        I'm 20 years old
    """.trimIndent()
    println(myDetail)
}