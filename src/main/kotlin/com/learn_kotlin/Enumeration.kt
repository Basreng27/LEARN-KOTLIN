// tipe data enum
// pendeklarasian
enum class Color(val value: Int) {
    // bersifat constant atau nilai tidak berubah ubah
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

    // bisa menggunakan anonymus class untuk setiap objek enum
    // RED(0xFF0000){
    //     override fun printValue() {
    //        println("value of RED is $value")
    //     }
    // }

    // harus menambahkan abstract
    // abstract fun printValue()
}

fun main() {
    // pemanggilan enum
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorGreen)

    // memanggil dalam bentuk array
    val colors: Array<Color> = Color.values()
    // for each
    colors.forEach { color ->
        println("$color ")
    }

    // untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    // untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values().
    println("Color value is ${color.value.toString(16)}")

    // fungsi enumValues() dan fungsi enumValueOf().
    // sama seperti yang atas
    val colorsEnum: Array<Color> = enumValues()
    colorsEnum.forEach {color ->
        println(color)
    }

    val colorEnum: Color = enumValueOf("RED")
    println("Color is $colorEnum")

    // mendapatkan posisi tiap objek menggunakan properti "ordinal"
    val colorOrdinal: Color = Color.GREEN

    print("Position GREEN is ${colorOrdinal.ordinal}")

    // untuk mengecek instance dari Enum gunakan "When Expression" dan mengambil nilai
    val colorWhen: Color = Color.GREEN

    when(colorWhen){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }

    /*
    Ketika menggunakan when untuk mengecek instance dari Enum, lebih baik masukkan setiap objek Enum yang kita definisikan.
    Jika kita melewatkan salah satu objek,  peringatan berikut akan muncul: ‘when' expression on enum is recommended to be exhaustive
    */
}

