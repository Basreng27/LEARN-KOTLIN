// 8

fun main() {
    //Fold
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")
    // fold right
    val numbersfold = listOf(1, 2, 3)
    val foldright = numbersfold.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("Fold result: $foldright")

    //Drop
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)
    println(drop)
    val numberakhir = listOf(1, 2, 3, 4, 5, 6)
    val dropakhir = numberakhir.dropLast(3)
    println(dropakhir)

    // Take
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)
    println(take)
    val totallast = listOf(1, 2, 3, 4, 5, 6)
    val takelast = totallast.takeLast(3)
    println(takelast)
}