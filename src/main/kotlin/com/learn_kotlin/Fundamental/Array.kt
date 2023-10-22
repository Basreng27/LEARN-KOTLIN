// 6

fun main(){
    /*
    // untuk membuat array bisa menggunakan library arrayOf() dan array memliki beberapa fungsi yaitu get, set, size
    // array dengan tipe tertentu
    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
    */

    // membuat array
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
    val intArray = intArrayOf(1, 3, 5, 7)

    println(array)
    println(mixArray)
    println(intArray[2])
}