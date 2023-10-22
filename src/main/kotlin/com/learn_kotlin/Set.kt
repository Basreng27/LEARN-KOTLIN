// Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
// menyimpan data yang berbeda beda
fun main(args: Array<String>) {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)

    println(integerSet)  // Output: [1, 2, 4, 5]

    // urutan tidak berpengaruh yang penting hasilnya
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    // cek jika nilai setA memiliki angka 5 menggunakan "in"
    print(5 in setA)

    // fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set.
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}