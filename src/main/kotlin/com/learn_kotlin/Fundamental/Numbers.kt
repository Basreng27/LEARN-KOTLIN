// 5

fun main(){
//    tipe numbers
    /*
    // semakin banyak bit maka semakin banyak angka yang bisa di tampung // cek documentasi
    int (32 bit) = val intNumber = 100
    long (64 bit) = val longNumber: Long = 100 "atau" val longNumber = 100L //penambahan "L" di bekalangknya
    short (16 bit) = val shortNumber: Short = 10
    byte (8 bit) = val byteNumber = 0b11010010 // byte digunakan untuk proses membaca dan menulis data dari sebuah stream file atau jaringan.
    double (64 bit) = val doubleNumber: Double = 1.3
    float (32 bit) = val floatNumber: Float = 0.123456789f // yang terbaca hanya 0.1234567
    */

    // mengetahui max/min nilai yang bisa di tampung oleh tipe numbers
    println("Max Int : " + Int.MAX_VALUE)
    println("Min Int : " + Int.MIN_VALUE)

    /*
    Terdapat beberapa operator matematika pada tipe data Number seperti
    penjumlahan (+),
    pengurangan (-),
    perkalian (*),
    pembagian (/) dan modulus (%, atau sisa hasil bagi).
    */

    /*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

    // konversi ke tipe tertentu. contoh dari byte ke int
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go
    println(intNumber)

    // readable
    val readableNumber = 1_000_000
    print(readableNumber)
}