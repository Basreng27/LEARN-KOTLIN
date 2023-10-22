// 8

fun main(){
    // biasa di pakai
    var text = "Rayandra"
    var firstChar = text[0]

    println("First character of $text is $firstChar")

    // menggunakan +
    val name = "Kotlin"
    println("My name is " + name)

    // menggunakan if
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}