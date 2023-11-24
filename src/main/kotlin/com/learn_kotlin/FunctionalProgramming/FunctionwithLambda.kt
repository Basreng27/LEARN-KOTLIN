// 5

fun main() {
// Lamda Receiver
    // run
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    // with
    val message = "Hello Kotlin!"
    val resultwith = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultwith)

    // apply
    val messageapply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(messageapply.toString())

// Lamda Arguments
    // let
    // Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe nullable.
    val messageLet: String? = null
    val length = messageLet?.length ?: 0 * 2
    val textLet = "text length $length"
    println(textLet)

    //Lalu bagaimana jika kita ingin menjalankan logika kode lain jika objeknya bernilai null? Di sini kita akan memanfaatkan fungsi lainnya yaitu run dan elvis operator
    val messageif: String? = null
    messageif?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    // also
    // hampir sama dengan apply
    val textalso = "Hello Kotlin"
    val resultalso = textalso.also {
        println("value length -> ${it.length}")
    }

    println("text -> $resultalso")
}
