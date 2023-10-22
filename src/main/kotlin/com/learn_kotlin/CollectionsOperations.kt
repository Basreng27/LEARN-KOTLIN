fun main(args: Array<String>) {
// filter() dan filterNot()
    // filter()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    // evenList: [2, 4, 6, 8, 10]
    println(evenList)

    // filterNot() // Kebalikan dari filter()
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList2.filterNot { it % 2 == 0 }
    // notEvenList: [1, 3, 5, 7, 9]
    println(notEvenList)

// map()
    // mengalikan 5 setiap isi list
    val numberList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList3.map { it * 5 }
    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
    println(multipliedBy5)

// count()
    // untuk menghitung jumlah item yang ada di dalam collection
    val numberList4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList4.count())
    // bisa juga di tambahkan kondisi
    print(numberList.count { it % 3 == 0 })

// find(), firstOrNull(), & lastOrNull()
    // find()
    val numberList5 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList5.find { it % 2 == 1 }
    val firstOrNullNumber = numberList5.firstOrNull { it % 2 == 3 }
    // firstOddNumber: 1
    // firstOrNullNumber: null
    println("firstOddNumber: $firstOddNumber")
    println("firstOrNullNumber: $firstOrNullNumber")
    // Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull(). Artinya, jika di dalam collection tidak ditemukan data yang sesuai, maka fungsi akan mengembalikan nilai null. Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi. Kemudian jika Anda ingin mencari item terakhir, gunakan fungsi lastOrNull().

    // first() & last()
    val numberList6 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList6.first { it > 10 }
    print(moreThan10)
    // Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda.

// sum()
    // sum() khusus hanya bisa digunakan untuk collection yang bertipe angka.
    // menjumlahkan semua isi list
    val numberList7 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList7.sum()
    // total: 55
    println(total)

// sorted()
    // sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending.
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    // Sedangkan untuk sorting secara descending, kita dapat menggunakan fungsi sortedDescending().
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}