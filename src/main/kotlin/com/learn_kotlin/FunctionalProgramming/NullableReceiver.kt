// 3

// if expression
val Int?.slicei: Int
    get() = if (this == null) 0 else this.div(2)

// elvis oprator
val Int?.slicee: Int
    get() = this?.div(2) ?: 0



//Main
fun main() {
    val value: Int? = null

    println(value.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0