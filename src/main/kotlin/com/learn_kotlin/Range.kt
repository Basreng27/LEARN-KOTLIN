fun main() {
    // Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo().
    // bisa juga menggunakan val rangeInt = 1.rangeTo(10) dan val downInt = 10.downTo(1) untuk dari terbesar ke terkecil
    val rangeInt = 1..10
    print(rangeInt.step)

    // range yang dihitung 2 angka
    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    // cek jika nilai range ada menggunakan "in"
    // jika cek nilai tidak ada bisa menggunakan "!in"
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    // range juga bisa di isi alfabet / char
    val rangeChar = 'A'.rangeTo('F')
}