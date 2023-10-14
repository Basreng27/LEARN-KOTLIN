fun main() {
// when digunakan saat ada lebih dari 2 kondisi. jika hanya 2 lebih baik menggunakan if els
    val value = 7

    // sama seperti if
    // hasilnya akan 7, karena yang dipilihnya 7
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    // when dapan di simpan dalam variable
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)

    // jika memiliki lebih dari 1 baris code menggunakan{}
    val stringOfValuePlus = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValuePlus)

    // bisa juga digunakan untuk cek type data
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    // when expression bisa gunakan untuk memeriksa nilai yang terdapat pada Range atau Collection.
    val valueR =  27
    val ranges = 10..50

    when(valueR){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}

// kita dapat menangkap subjek dari when expression di dalam sebuah variabel.
//fun main() {
//    val registerNumber = when(val regis = getRegisterNumber()){
//        in 1..50 -> 50 * regis
//        in 51..100 -> 100 * regis
//        else -> regis
//    }
//}
//fun getRegisterNumber() = Random.nextInt(100)