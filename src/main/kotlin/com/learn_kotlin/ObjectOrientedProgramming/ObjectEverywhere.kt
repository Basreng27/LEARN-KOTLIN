// 1

fun main() {
// kita bisa melihat beberapa fungsi yang dapat digunakan oleh objek someString. Kita bisa menggunakan fungsi reverse() untuk membuat urutan huruf disusun secara terbalik, fungsi toUpperCase() yang dapat membuat huruf menjadi kapital atau fungsi toLowerCase() yang dapat membuat menjadi huruf kecil.
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())

// mengubah tipe data dengan mengakses fungsi yang tersedia dari sebuah objek String.
    val someStringubah = "123"
    val someInt = someStringubah.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}

