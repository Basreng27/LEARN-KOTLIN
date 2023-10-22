package com.learn_kotlin.DataClassAndCollections// 3

// List dapat menyimpan banyak data menjadi satu objek.
// penulisan val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
fun main() {
    // pendeklarasian list
    val anyList = listOf('a', "Kotlin", 3, true)

    print(anyList)

    // list bida di masukan dataclass
    val anyListC = listOf('a', "Kotlin", 3, true, Usersss())

    // untuk mengambil data list tertentu
    println(anyListC[4])

    // apakah bisa memanipulasi data List? Jawabannya tidak.
    // Karena List tersebut bersifat immutable atau tidak bisa diubah.
    // Untuk merubah bisa menggunakan Kotlin standard library collection dengan tipe mutable.
    // hanya perlu menggunakan fungsi mutableListOf
    val anyListCRUD = mutableListOf('a', "Kotlin", 3, true, Usersss())
    anyListCRUD.add('d') // menambah item di akhir list
    anyListCRUD.add(1, "love") // menambah item pada indeks ke-1
    anyListCRUD[3] = false // mengubah nilai item pada indeks ke-3
    anyListCRUD.removeAt(0) // menghapus item pada indeks ke-0

}

class Usersss(var name : String = "", var age : Int = 0)
