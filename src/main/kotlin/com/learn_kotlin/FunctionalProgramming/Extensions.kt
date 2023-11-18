// 2

// Kotlin mendukung 2 (dua) extension yang dapat digunakan, yaitu Extension Functions dan Extension Properties. Jika extension functions digunakan untuk menambahkan fungsi baru, extension properties tentunya digunakan untuk menambahkan sebuah properti baru.

fun main() {
    //Extension Functions
    10.printInt()
    println(10.plusThree())

    // Extension Properties
    println(10.slice)
}


//Extension Functions
// Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type, kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.).
fun Int.printInt() {
    print("value $this")
}
fun Int.plusThree(): Int {
    return this + 3
}

// Extension Properties
val Int.slice: Int
    get() = this / 2