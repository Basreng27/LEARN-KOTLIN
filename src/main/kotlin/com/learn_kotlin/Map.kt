// collection yang dapat menyimpan data dengan format key-value.
fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    // atau
    println(capital.getValue("Jakarta"))

    // menampilkan semua keys
    val mapKeys = capital.keys
    println(mapKeys)

    // menampilkan semua value
    val mapValues = capital.values
    println(mapValues)

    // untuk CRUD di Map sama menggunakan Mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    // Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan. Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses, hasil nya akan sulit untuk diprediksi. Untuk itu, sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk diubah, baru gunakan mutable.
}