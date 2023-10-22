// 2

fun main() {
    // if else
    val openOffice = 7
    val now = 8
    if (now > openOffice) {
        print("Office already open")
    } else {
        print("Office close")
    }

    // bisa juga dibuat dalam variable
    val office = if (now > openOffice) "Office already open" else "Office close"
}

// untuk statement bias di buat seperti ini
//fun main() {
//    sum(1 , 1 * 4)
//}
//fun sum(value1: Int, value2: Int) = value1 + value2

//fun main() {
//    val value1 = 10
//    val value2 = 10
//
//    sum(value1, value2)
//}
//fun sum(value1: Int, value2: Int) = value1 + value2