// 1. Function

// seperi ini asalnya
//val list = getListUser()
//
//fun getUsername(): List<String>{
//    val name = mutableListOf<String>()
//    for (user in list){
//        name.add(user.name)
//    }
//    return name
//}
// tuliskan jadi seperti ini
//fun getUsername(): List<String>{
//    return list.map {
//        it.name
//    }
//}

// Pada dasarnya sebuah fungsi memiliki 2 (dua) bagian utama yaitu function header dan function body.
// int setelah : menandakan bahwa returnya adalah int
// Visibility Modifier = tingkatan akses. kalau contoh ini private
//private fun sum(valueA: int, valueB: int): int{ // fungsi header
//fun sum(valueA: int, valueB: int): int{ // fungsi header
//    return valueA + valueB // fungsi body
//}

fun main() {
    // named
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)

    //default
    val fullNameDefault = getFullNameDefault()
    print(fullNameDefault)
    val fullNameDE = getFullNameDefault(first = "Dicoding")
    print(fullNameDE)

    //varargs
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
    val numberSize = getNumberSize(10, 20, 30, 40, 50)
    print(numberSize)
}

// Named Argument
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// Default Argument (Default Parameter)
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

// Vararg (Variable Argument)
// Dengan menggunakan kata kunci vararg kita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int {
    // total isi number
    return number.size
}
// Aturan pada Vararg Arguments
// di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
// fun sumNumbers(vararg number: Int, vararg number2: Int)
// jikapun ingin bisa di simpan di posisi terakhir
// set =  sets("Kotlin", 10, 10)
// fun sets(name: String, vararg number: Int): Int {
// kalau tidak bisa menggunakan named argument

// Vararg
//fun main() {
//    val number = intArrayOf(10, 20, 30, 40)
//    sets(10, 20, 20, *number , 10)
//}
//
//fun sets(vararg number: Int): Int {
//    ...
//}

// Array<T>
//fun main() {
//    val number = arrayOf(10, 20, 30, 40)
//    sets(number)
//}
//
//fun sets(number: Array<Int>) {
//    ...
//}
