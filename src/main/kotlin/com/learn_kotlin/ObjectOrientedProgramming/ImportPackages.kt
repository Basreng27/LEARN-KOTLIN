// 10

import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

fun main(){
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
}

//membuat package baru
//Membuat Package Baru
//Seperti yang diketahui sebelumnya, package merupakan pembungkus dari kelas (package-level class), fungsi (package-level function) atau variabel (package-level variable) berfungsi serupa. Kita juga sudah mengetahui cara mengimpor suatu kelas, fungsi atau variabel yang terdapat pada sebuah package. Namun kita belum tahu bagaimana package tersebut dibuat. Jadi pada pembahasan kali ini kita akan mencoba bagaimana untuk membuat sebuah package pada Kotlin.
//
//Idealnya sebuah package pada Kotlin dituliskan dengan awalan nama domain perusahaan yang dibalik. Contoh, com.dicoding. Kemudian diikuti dengan nama package yang akan digunakan.
//
//Untuk membuat sebuah package kita perlu membuat folder package pada berkas proyek. Perhatikan Project Tool Window yang terdapat pada IntelliJ Idea. Klik kanan pada folder src kemudian arahkan pada menu New > package.
//
//2019043011134425ee315acb2e1317ad4eabcb273045d2.gif
//
//Setelah itu ketikkan nama package yang akan kita buat, misalnya com.dicoding.oop.utils:
//
//20190430111411c1817e1ac575bac69f623d4d18828cf0.png
//
//Perlu diingat, penamaan package selalu dituliskan dengan flatcase, tanpa garis bawah dan dipisahkan dengan titik.
//
//Dengan menekan tombol “OK” maka kita berhasil membuat sebuah package folder pada proyek aplikasi kita. Maka struktur proyek akan menjadi seperti ini:
//
//20190430111518bde5cec751db04bd37888fcd15c04e5f.png
//
//Selanjutnya, buatlah sebuah berkas di dalam package utils. Disini kita menamai berkas tersebut dengan nama MyMath.kt. Bukalah berkas tersebut dan perhatikan baris kode yang dihasilkan oleh IntelliJ Idea. Seharusnya kita melihat baris kode berikut pada berkas MyMath.kt.
//
//package com.dicoding.oop.utils
//fun sayHello() = println("Hello From package com.dicoding.oop.utils")
//Kita sudah membuat sebuah fungsi sayHello() pada package-level. Untuk mengakses fungsi tersebut kita dapat menuliskan secara eksplisit alamat package. Buatlah sebuah berkas Kotlin dengan nama Main.kt pada package com.dicoding.oop kemudian akses fungsi sayHello() yang terdapat pada package com.dicoding.oop.utils
//
//fun main(){
//    com.dicoding.oop.utils.sayHello()
//}
//
///*
//Output:
//    Hello From package com.dicoding.oop.utils
//*/
//Atau kita dapat menggunakan fungsi tersebut dengan mengimpor package-level function tersebut.
//
//package com.dicoding.oop
//
//import com.dicoding.oop.utils.sayHello
//
//fun main() {
//    sayHello()
//}
//
///*
//Output:
//    Hello From package com.dicoding.oop.utils
//*/
//Untuk dapat memahami tentang package lebih lanjut, mari kita buat beberapa fungsi dan variabel pada package tersebut. Buka kembali berkas MyMath.kt, tambahkan beberapa fungsi dan variabel yang akan kita gunakan nantinya.
//
//package com.dicoding.oop.utils
//
//fun sayHello() = println("Hello From package utils")
//
//const val PI = 3.1415926535  // package level variable
//
//fun pow(number: Double, power: Double) : Double {
//    var result = 1.0
//    var counter = power
//    while (counter > 0) {
//        result *= number
//        counter--
//    }
//    return result
//}
//
//fun factorial(number: Double) : Double {
//    var result = 1.0
//    var counter = 1.0
//    while (counter <= number) {
//        result *= counter
//        counter++
//    }
//
//    return result
//}
//
//fun areaOfCircle(radius: Double) : Double {
//    return PI * 2 * radius
//}
//Panggil beberapa fungsi dan variabel yang sudah ditambahkan pada MyMath.kt.
//
//package com.dicoding.oop
//
//import com.dicoding.oop.utils.PI
//import com.dicoding.oop.utils.factorial
//import com.dicoding.oop.utils.pow
//import com.dicoding.oop.utils.sayHello
//
//fun main() {
//    sayHello()
//    println(factorial(4.0))
//    println(pow(3.0, 2.0))
//    println(PI)
//}
//
///*
//output:
//    Hello From package com.dicoding.oop.utils
//    24.0
//    9.0
//    3.1415926535
//*/
//Pada awal kode terlihat saat kita menggunakan suatu fungsi atau variabel yang berada pada package tertentu, kita perlu melakukan impor pada setiap fungsi atau variabelnya. Tetapi jika kita menggunakan seluruh fungsi atau variabel dalam package tertentu kita bisa menggunakan tanda bintang (*) untuk melakukan impor pada seluruh fungsi dan variabel di package tersebut. Perhatikan kode berikut:
//
//package com.dicoding.oop
//
//import com.dicoding.oop.utils.*
//
//fun main() {
//    sayHello()
//    println(factorial(4.0))
//    println(pow(3.0, 2.0))
//    println(PI)
//    println(areaOfCircle(13.0))
//}
//
///*
//output:
//    Hello From package com.dicoding.oop.utils
//    24.0
//    9.0
//    3.1415926535
//    81.681408991
//*/
//Dengan memanggil fungsi areaOfCircle() maka kita menggunakan seluruh fungsi dan variabel yang berada pada package com.dicoding.oop.utils, sehingga import package cukup dilakukan dengan menggunakan tanda bintang (*).