package com.learn_kotlin.DataClassAndCollections// 7

fun main() {
    // mempercepat pwrhitungan 1 jt data
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}