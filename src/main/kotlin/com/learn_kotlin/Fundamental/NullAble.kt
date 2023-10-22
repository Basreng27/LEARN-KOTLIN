// 7

fun main(){
// NullAble
    // membuat variable bisa di isi nul dengan menggunakan "?"
    var text: String? = null

    // val textLength = text.length // compile time error
    // mengelola nilainya dengan cara di cek dulu

    if (text != null){
        val textLength = text.length // ready to go

        println(textLength)
    }

    // mengisi variable text
    text = "Tetsing"

    println(text)

// Safe Calls dan Elvis Operator / penanganan nullable lebih mudah
    // pengecekan lebih mudah
    // Safe calls operator (?.)
    // Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable
    val textSafe: String? = null
    textSafe?.length

    // Elvis Operator (?:)
    // Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
    // seperti ?? di php
    val textElvis: String? = null
    val textLengthElvis = textElvis?.length ?: 7

    println(textLengthElvis)

    // non-null assertion (!!)
    // penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null. Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.
    val textNon: String? = null
    val textLengthNon = textNon!!.length // ready to go ???

    println(textLengthNon)
}
