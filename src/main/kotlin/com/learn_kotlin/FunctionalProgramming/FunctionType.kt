// 4
// Lamda ada

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
    println(sumResult)
    println(multiplyResult)

    // best practice
    val sum2: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply2: Arithmetic = { valueA, valueB -> valueA * valueB }
    val sumResult2 = sum2(10, 10)
    val multiplyResult2 = multiply2(20, 20)
    println(sumResult2)
    println(multiplyResult2)

    // untuk nullable
    val sumResult3 = sum2?.invoke(10, 10)

    //called lamda
    message()
    printMessage("Hello From Lambda") // with parameter
    val length = messageLength("Hello From lambda") // with return
    println("Message length $length")

    //Higher-Order Function
    // printResult(10 ,sum)
    printResult(10){ value ->
        value + value
    }

    // inline function (Best dari high-order function)
    printResultIF(10){ value ->
        value + value
    }

    //Lambda with receiver
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

//typealias
typealias Arithmetic = (Int, Int) -> Int

//lamda / anonymous function
val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message) }
val messageLength = { message: String -> message.length }

//Higher-Order Function
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
var sum: (Int) -> Int = { value -> value + value }

//Inline Function
inline fun printResultIF(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

// Kotlin Standard Library
//Scope Function = let, run, with, apply, dan also.
//Context Object
//Lambda receiver (this)
val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}
// Lambda argument (it)
//val text = "Hello"
//text.let {
//    val message = "$it Kotlin"
//    println(message)
//}
//
//val text = "Hello"
//text.let { value ->
//    val message = "$value Kotlin"
//    println(message)
//}
