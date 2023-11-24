// 6

// Function References
fun isEvenNumber(number: Int) = number % 2 == 0 // cek genap tidak

//Property References
var messagePR = "Kotlin"

fun main() {
    // Function References
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

    //Property References
    println(::messagePR.name)
    println(::messagePR.get())

    ::messagePR.set("Kotlin Academy")

    println(::messagePR.get())
}