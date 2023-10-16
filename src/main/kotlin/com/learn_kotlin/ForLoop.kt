fun main() {
    //  For dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator.
    val ranges = 1..5
    // val ranges = 1.rangeTo(5) // bisa seperti ini
    // val ranges = 1.rangeTo(10) step 3 // bisa seperti ini. sehingga mempunyai jarak 3
    for (i in ranges){
        println("value is $i!")
    }

    // mengakses index nya
    val rangesI = 1.rangeTo(10) step 3
    for ((index, value) in rangesI.withIndex()) {
        println("value $value with index $index")
    }

    // foreach
    val rangesFOR = 1.rangeTo(10) step 3
    rangesFOR.forEach { value ->
        println("value is $value!")
    }

    // jika ingin mengambil indexnya juga
    // jika hanya ingin mengambil indexnya saja maka "value" bisa diganti menjadi "_"
    val rangesIND = 1.rangeTo(10) step 3
    rangesIND.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}