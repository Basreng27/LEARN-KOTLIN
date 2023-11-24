// 9

fun main(args: Array<String>) {
    //Slice
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    println(slice)
    val totalstep = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slicestep = totalstep.slice(3..6 step 2)
    println(slicestep)
    val index = listOf(2, 3, 5, 8)
    val totalspesipik = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slicespesipik = totalspesipik.slice(index)
    println(slicespesipik)

    // Distinct
    val totaldis = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totaldis.distinct()
    println(distinct)
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctby = text.distinctBy {
        it.length
    }
    println(distinctby)

    //Chunked
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunkedTransform)
}

